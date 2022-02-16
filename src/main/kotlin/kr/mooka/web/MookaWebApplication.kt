package kr.mooka.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MookaWebApplication

fun main(args: Array<String>) {
    runApplication<MookaWebApplication>(*args)
}
