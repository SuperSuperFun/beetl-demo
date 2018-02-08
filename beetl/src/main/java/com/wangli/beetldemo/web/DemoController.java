package com.wangli.beetldemo.web;

import com.wangli.beetldemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangli
 */
@Controller
public class DemoController {

    @RequestMapping("/getUser")
    public String get(Model model) {
        User user = new User("123456789", "Tom", 25);
        model.addAttribute("user", user);
        return "demo";
    }


    private Map getUser() {
        Map<String, Object> map = new HashMap<>();
        User user = new User("123456789", "Tom", 25);
        map.put("user", user);
        return map;
    }
}
