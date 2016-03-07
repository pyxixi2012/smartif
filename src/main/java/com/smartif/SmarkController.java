package com.smartif;

/**
 * Created by Administrator on 2016/3/7.
 */
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SmarkController {
    private String message = "Hello World ,controller from string";
    private String testmessage = "Hello World ,controller from test string";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/test")
    public String test(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.testmessage);
        return "welcome";
    }

}
