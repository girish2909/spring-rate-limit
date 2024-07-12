package com.demo.spring.controller;

import com.demo.spring.annotation.WithRateLimitProtection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RateLimitController{
	
        @PostMapping("/limit")
        @WithRateLimitProtection
        public String processRequest() {
            return "this is Girish";
        }
}