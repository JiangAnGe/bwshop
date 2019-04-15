package com.example.wushuangling20190415.mvp.model;

/**
 * author:wsl
 * date:2019/4/15
 * funcyion:
 */
public interface UserModel {
    interface CallBackListener{
        void success(String data);

        void fail(String error);
    }
    //登录
    void doLogin(String phone,String pwd,CallBackListener listener);
    //注册
    void doRegister(String phone,String pwd,CallBackListener listener);

}
