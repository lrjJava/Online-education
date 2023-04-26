package com.xuecheng.checkcode.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lrj
 * @version 2022.2
 * @date 2023/4/6 18:59
 * @Description:
 */
public class LoginController {
    @ApiOperation(value = "发送邮箱验证码", tags = "发送邮箱验证码")
    @PostMapping("/phone")
    public void sendEMail(@RequestParam("param1") String email) {

    }
}

