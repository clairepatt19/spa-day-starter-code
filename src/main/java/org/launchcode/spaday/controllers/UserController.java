package org.launchcode.spaday.controllers;


import org.launchcode.spaday.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm() {

        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        User newUser = User.getUsername(user);
        model.addAttribute("user", user);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("verify", verify);

        if (verify.equals(user.getPassword())) {
            return "user/index";
        } else {
            return "user/add";
        }
    }
}