package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secretos")
class SecretosController {
    @PostMapping("/secreto")
    fun getSecreto(): String {
        return "🔒"
    }
}