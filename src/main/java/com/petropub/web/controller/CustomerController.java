package com.petropub.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.petropub.web.exception.CustomGenericException;

public class CustomerController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		throw new CustomGenericException("E888", "This is custom message X");

	}
	
	public static void main(String[] args) {
	    String json = "[{\"name\":\"企业/自然人名称\",\"type\":2,\"length\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":true,\"isFinal\":true},{\"name\":\"组织机构代码/身份证号\",\"type\":2,\"length\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":false,\"isFinal\":true},{\"name\":\"案号\",\"type\":2,\"length\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":false,\"isFinal\":true},{\"name\":\"立案时间\",\"type\":3,\"length\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":false,\"isFinal\":true},{\"name\":\"被执行人姓名／名称\",\"type\":2,\"maxLength\":\"250\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"250\"},{\"name\":\"身份证号码／组织机构代码\",\"type\":2,\"maxLength\":\"50\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"50\"},{\"name\":\"法定代表人或者负责人姓名\",\"type\":2,\"maxLength\":\"50\",\"required\":false,\"listed\":true,\"isNameField\":false,\"length\":\"50\"},{\"name\":\"执行法院\",\"type\":2,\"maxLength\":\"50\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"50\"},{\"name\":\"省份\",\"type\":2,\"maxLength\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"200\"},{\"name\":\"执行依据文号\",\"type\":2,\"maxLength\":\"200\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"200\"},{\"name\":\"做出执行依据单位\",\"type\":2,\"maxLength\":\"160\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"160\"},{\"name\":\"生效法律文书确定的义务\",\"type\":2,\"maxLength\":\"500\",\"required\":false,\"listed\":true,\"isNameField\":false,\"length\":\"500\"},{\"name\":\"被执行人的履行情况\",\"type\":1,\"maxLength\":\"500\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"500\"},{\"name\":\"失信被执行人执行具体情况\",\"type\":2,\"maxLength\":\"500\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"500\"},{\"name\":\"发布时间\",\"type\":3,\"maxLength\":\"8\",\"required\":true,\"listed\":true,\"isNameField\":false,\"length\":\"8\"}]";
	    System.out.println(json);
	}

}