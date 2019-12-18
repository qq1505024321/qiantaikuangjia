package com.jk.service;

import com.jk.mapper.TestAddMapper;
import com.jk.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAddServiceApiImpl implements TestAddServiceApi{

    @Autowired
    private TestAddMapper testAddMapper;

    @Override
    public void add(BookModel b) {
        testAddMapper.add(b);
        System.out.println(b.getId());
    }
}
