package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ysr
 * @Date: 2021/8/25 16:48
 */
@RestController
public class TestController {
	@RequestMapping("/test")
	public String test() {
		System.out.println("success");
		return "success";
	}
}
