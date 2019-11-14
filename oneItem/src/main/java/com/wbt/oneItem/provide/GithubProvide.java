package com.wbt.oneItem.provide;

import com.alibaba.fastjson.JSON;
import com.wbt.oneItem.dto.GithubTokenDto;
import com.wbt.oneItem.dto.GithubUserInfoDto;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Github信息提供者
 */
@Component
public class GithubProvide {
    /**
     * 返回一个token
     * @param githubTokenDto
     * @return token
     */
    public String getGithubToken(GithubTokenDto githubTokenDto){
       MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(githubTokenDto));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();//access_token=960029c53f99d15d7d977b6d3375774fb892538b&scope=&token_type=bearer
            String token = string.split("&")[0].split("=")[1];//960029c53f99d15d7d977b6d3375774fb892538b
            System.out.println("Auth:" + token);
            return token;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public GithubUserInfoDto getUserInfo(String token){
        OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://api.github.com/user?access_token=" + token)
                    .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            GithubUserInfoDto userInfo = JSON.parseObject(string, GithubUserInfoDto.class);
            return userInfo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
