package org.mvnsearch.spring.boot.ngrok.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ngrok server demo application
 *
 * @author linux_china
 */
@SpringBootApplication
@RestController
public class NgrokDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NgrokDemoApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "good";
    }
}
