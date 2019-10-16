package com.yyz.controller;

import com.yyz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("list")
    public String list(){
      return "list";
    }
    @RequestMapping("list2")
    public String list2(){
        return "list2";
    }

    @ResponseBody
    @RequestMapping("list3")
    public ModelAndView b() {
        ModelAndView mv = new ModelAndView();
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User(1,23,"张三"));
        list.add(new User(2,24,"李四"));
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("b")
    public String b(Model model) {
        model.addAttribute("name", "杨幂");
        return "user/list";
    }



}
