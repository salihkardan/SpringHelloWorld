package me;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Salih Kardan
 * @version 08/02/2017.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World Test Aws Code Pipeline!";
    }
}
