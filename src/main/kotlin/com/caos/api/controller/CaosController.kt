package com.caos.api.controller

import org.apache.catalina.connector.Response
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.GetMapping

@Controller
class CaosController {
    @GetMapping("/hello")
    fun getHello(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World");
    }
}
