package com.ketelsen.jenkinsdemo

import com.ketelsen.jenkinsdemo.service.impl.myTest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
@RequestMapping()
class Controller {
    @GetMapping
    fun get(): Boolean {
        var newFile = File("auth/debug-service-account.json")
        println(newFile.absolutePath)
        var myTest = myTest()
        myTest.runThis()

        return newFile.isFile
    }
}