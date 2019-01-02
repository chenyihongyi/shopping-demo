package cn.itcast.shop.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户模块Action的类
 * @Author Elvis Chen
 * @Date 2019/1/2 22:29
 * @Version 1.0
 **/
public class UserAction extends ActionSupport{

    /**
     * 跳转到注册页面的执行方法
     */
    public String registPage(){
        return "registPage";
    }


}
