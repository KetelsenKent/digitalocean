package com.ketelsen.jenkinsdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class Controller {
    @GetMapping
    fun get(): String {
        return "test"
    }gi
}