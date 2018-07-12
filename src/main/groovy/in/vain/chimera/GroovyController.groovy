package in.vain.chimera

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.atomic.AtomicLong

@RestController
class GroovyController {

    AtomicLong counter = new AtomicLong()

    @GetMapping("/chimera/groovy")
    def greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello $name, from Groovy Controller")
    }

}
