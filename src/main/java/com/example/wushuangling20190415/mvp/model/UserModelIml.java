package com.example.wushuangling20190415.mvp.model;

import com.example.wushuangling20190415.net.OkHttpUtils;

import okhttp3.FormBody;

/**
 * author:wsl
 * date:2019/4/15
 * funcyion:
 */
public class UserModelIml implements UserModel {
    @Override
    public void doLogin(String phone, String pwd, final CallBackListener listener) {
        //走注册
        String registerUrl = "http://172.17.8.100/small/user/v1/login";
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("phone", phone);
        builder.add("pwd", pwd);
        new OkHttpUtils().post(registerUrl, builder).result(new OkHttpUtils.HttpListener() {
            @Override
            public void success(String data) {
                listener.success(data);
            }

            @Override
            public void fail(String error) {
                listener.fail(error);
            }
        });

    }

    @Override
    public void doRegister(String phone, String pwd, final CallBackListener listener) {
        //走注册
        String registerUrl = "http://172.17.8.100/small/user/v1/register";
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("phone", phone);
        builder.add("pwd", pwd);
        new OkHttpUtils().post(registerUrl, builder).result(new OkHttpUtils.HttpListener() {
            @Override
            public void success(String data) {
                listener.success(data);
            }

            @Override
            public void fail(String error) {
                listener.fail(error);
            }
        });

    }
}
