package suslyakskillboxmicroservicescourse.com.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping(value="/")
    public String hello() {
        return "Hello world from users service!";
    }
}
