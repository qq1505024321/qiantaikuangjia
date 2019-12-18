package com.jk.controller;

import com.jk.model.BookModel;
import com.jk.service.TestAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("testadd")
public class TestAddController {

    @Autowired
    private TestAddService testAddService;

    @RequestMapping("add")
    @ResponseBody
    public void  add (BookModel b){
        testAddService.add(b);
    }

}
