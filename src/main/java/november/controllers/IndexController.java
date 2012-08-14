package november.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: november
 * @date: 14.08.12
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
