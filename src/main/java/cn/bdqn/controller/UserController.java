package cn.bdqn.controller;

import cn.bdqn.service.UserService;
import cn.bdqn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("list")
    public String list(Model model){
        List<User> list = userService.list();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("add")
    public String add(String username, String password){
        userService.add(username,password);
        return "redirect:/list";
    }

    @RequestMapping("toupdate")
    public String list(Model model, int id){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "update";
    }

    @RequestMapping("update")
    public String update(String username, Integer id){
        userService.update(username,id);
        return "redirect:/list";
    }

    @RequestMapping("delete")
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/list";
    }


}
