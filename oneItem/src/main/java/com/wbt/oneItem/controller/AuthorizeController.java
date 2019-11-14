package com.wbt.oneItem.controller;

import com.wbt.oneItem.dto.GithubTokenDto;
import com.wbt.oneItem.dto.GithubUserInfoDto;
import com.wbt.oneItem.mapper.UserMapper;
import com.wbt.oneItem.model.User;
import com.wbt.oneItem.provide.GithubProvide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
public class AuthorizeController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GithubProvide githubProvide;

    @Value("${github.client_id}")
    private String Client_id;

    @Value("${github.client_secret}")
    private String Client_secret;

    @Value("${github.redirect_uri}")
    private String Redirect_uri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request,
                           HttpServletResponse response){
        GithubTokenDto tokenDto = new GithubTokenDto();
        tokenDto.setClient_id(Client_id);//设置自己的Client_id（注册App之后的Client_id）
        tokenDto.setClient_secret(Client_secret);//设置自己的Client_secret（注册App之后的Client_secret）
        tokenDto.setCode(code);
        tokenDto.setState(state);
        tokenDto.setRedirect_uri(Redirect_uri);//设置自己的URL（注册App之后的URL）
        String githubToken = githubProvide.getGithubToken(tokenDto);
        GithubUserInfoDto userInfo = githubProvide.getUserInfo(githubToken);

        if (userInfo != null){
            User user = new User();
            String token = UUID.randomUUID().toString();//生成一个随机UUID，用来保存token。
            user.setToken(token);
            user.setAccountId(String.valueOf(userInfo.getId()));
            user.setName(userInfo.getName());
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            //添加用户
            userMapper.insertUser(user);
            //用于已登录，将token信息存入cookie
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }
}
