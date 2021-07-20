package com.ketelsen.jenkinsdemo

import com.ketelsen.jenkinsdemo.service.impl.myTest
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JenkinsdemoApplication

fun main(args: Array<String>) {
	runApplication<JenkinsdemoApplication>(*args)

}
