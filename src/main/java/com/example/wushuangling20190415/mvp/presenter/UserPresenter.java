package com.example.wushuangling20190415.mvp.presenter;

/**
 * author:wsl
 * date:2019/4/15
 * funcyion:
 */
public interface UserPresenter {
    //登录
    void  doLogin(String phone,String pwd);
    //注册
    void  doRegister(String phone,String pwd);
}
