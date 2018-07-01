package com.qf.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Weishenpeng on 2017/5/11.
 */
@RestController
@RequestMapping("/userTest")
public class TestController {

    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/text")
    @ApiResponse(code = 200, message = "success")
    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET, produces = "application/text")
    public String queryUserById(@ApiParam(name = "userId", required = true, value = "用户Id") @RequestParam("userId") int userId, HttpServletRequest request) {
        return "hello world!";
    }
}