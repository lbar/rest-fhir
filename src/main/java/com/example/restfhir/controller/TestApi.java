package com.example.restfhir.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello")
public class TestApi {

    @GetMapping("/hello")
    @ApiOperation("Returns hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
