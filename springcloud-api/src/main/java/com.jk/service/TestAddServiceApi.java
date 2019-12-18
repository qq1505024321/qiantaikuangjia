package com.jk.service;

import com.jk.model.BookModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface TestAddServiceApi {
    @RequestMapping("add")
    void add(@RequestBody BookModel b);
}
