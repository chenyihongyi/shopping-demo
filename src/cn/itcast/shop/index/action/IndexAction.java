package cn.itcast.shop.index.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description: 首页访问的action
 * @Author: chenyihong
 * @Date: 2019年1月2日
 */
public class IndexAction extends ActionSupport{
	
	public String execute(){
		
		return "index";
	}

}