package com.example.exception;

public class BizException extends Exception{

    public final static String USER_LOGIN_ERROR="用户名或密码错误";
    public final static String USERNAME_ERROR="用户名不能为空";
    public final static String PASSWORD_ERROR="密码不能为空";

    public BizException(String msg){
        super(msg);
    }
}
