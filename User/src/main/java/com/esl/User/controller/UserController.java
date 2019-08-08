package com.esl.User.controller;

import com.esl.User.User;
import com.esl.User.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public String showSignUpForm(User user){

        return "add-user";
    }
    @PostMapping("/addUser")
    public String addUser(User user, BindingResult result, Model model){
        if (result.hasErrors()){
            return  "add-user";
        }


        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return  "index";
    }
       @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("user", user);
        return  "update-user";

    }
       @PostMapping
    public String updateUser(@PathVariable("id") long id, @Valid User user,
    BindingResult result, Model model){
    if (result.hasErrors()){
        User.setId(id);
        return  "update-user";
    }

    userRepository.save(user);
    model.addAttribute("users", userRepository.findAll());
    return "index";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userRepository.delete(user);
        model.addAttribute("users", userRepository.findAll());
        return  "index";
    }
}
