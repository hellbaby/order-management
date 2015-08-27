package com.petropub.web.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.petropub.web.exception.CustomGenericException;

@Controller
public class CustomerController2 {
    
    @Autowired
    private DataSource dataSource;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView getPages() throws Exception {

		throw new CustomGenericException("E888", "This is custom message X");

	}

	@RequestMapping(value = "/testtest", method = RequestMethod.GET)
    @ResponseBody
    public Object getTopDepartments() {
        try {
            return dataSource.getLoginTimeout();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            return ("exception thrown");
        }
    }
	
	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) {

		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("exception", ex);

		return model;

	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		ModelAndView model = new ModelAndView("error/generic_error");
		
		return model;

	}

}
