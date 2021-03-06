package com.jk.service;

import com.jk.mapper.TestMapper;
import com.jk.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestServiceApiImpl implements TestServiceApi {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Map<String, Object> queryBook( Integer page,  Integer limit) {
        long total = testMapper.queryTotal();
        Integer start = (page-1)*limit;
        List<BookModel> list = testMapper.queryList(start,limit);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

}
