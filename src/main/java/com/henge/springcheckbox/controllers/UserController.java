package com.henge.springcheckbox.controllers;


import com.henge.springcheckbox.models.HobbyModel;
import com.henge.springcheckbox.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUserForm(Model model) {
        UserModel user = new UserModel();
        List<HobbyModel> hobbies = new ArrayList<>(Arrays.asList(
                new HobbyModel("Cooking", false),
                new HobbyModel("Singing", true),
                new HobbyModel("Dancing", false),
                new HobbyModel("Painting", true),
                new HobbyModel("Gardening", false),
                new HobbyModel("Reading", false)
        ));

        user.setHobbies(hobbies);
        model.addAttribute("hobbies", hobbies);
        model.addAttribute("user", user);
        return "userForm";
    }

    @PostMapping("/submit")
    public String submitUserForm(UserModel user, Model model) {

        List<HobbyModel> hobbies = user.getHobbies();

        model.addAttribute("hobbies", hobbies);
        model.addAttribute("user", user);
        return "userForm";
    }
}
