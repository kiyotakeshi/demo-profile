package kiyotakeshi.com.example.playground.profile

import org.slf4j.LoggerFactory.getLogger
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/profile")
class ProfileController {
    @Value("\${message.hello}")
    private val hello: String? = null

    @Value("\${message.goodbye}")
    private val goodbye: String? = null

    @Value("\${server.port}")
    private val port: String? = null

    @GetMapping("/hello")
    fun hello(): String? {
        logger.debug("debug log from {}", this.javaClass.simpleName)
        logger.info("logging a log from {}", this.javaClass.simpleName)
        return hello
    }

    @GetMapping("/goodbye")
    fun goodbye(): String? {
        return goodbye
    }

    @GetMapping("/port")
    fun port(): String? {
        return port
    }

    companion object {
        private val logger = getLogger(ProfileController::class.java)
    }
}
