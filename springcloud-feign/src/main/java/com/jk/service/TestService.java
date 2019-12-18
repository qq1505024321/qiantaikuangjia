package com.jk.service;

import com.jk.model.BookModel;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-provider")
public interface TestService extends TestServiceApi{

}
