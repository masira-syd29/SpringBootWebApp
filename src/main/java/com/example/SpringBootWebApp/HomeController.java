package com.example.SpringBootWebApp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method has been called!");
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int num1, @RequestParam("num2") int num2, ModelAndView modelAndView){
//        int num1 = Integer.parseInt(requ.getParameter("num1"));
//        int num2 = Integer.parseInt(requ.getParameter("num2"));

        int result = num1 + num2;
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping("addMartian")
    public String addMartian(Martian martian){
//        int num1 = Integer.parseInt(requ.getParameter("num1"));
//        int num2 = Integer.parseInt(requ.getParameter("num2"));

//        Martian martian = new Martian();
//        martian.setAid(aid);
//        martian.setAname(aname);

//        modelAndView.addObject("martian", martian);
//        modelAndView.setViewName("result");
        return "result";
    }
}
