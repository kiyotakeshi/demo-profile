package kiyotakeshi.com.example.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlaygroundApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<PlaygroundApplication>(*args)
}
