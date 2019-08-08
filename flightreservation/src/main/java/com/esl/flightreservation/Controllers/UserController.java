package com.esl.flightreservation.Controllers;

import com.esl.flightreservation.entities.User;
import com.esl.flightreservation.entities.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "login/registerUser";
    }
    @RequestMapping (value= "/registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user){
        //please tunji check this out later how the next line works//
        System.out.println(user.toString());
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping("/showLogin")
    public String showLoginPage() {
        return "login/login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(@RequestParam String email,@RequestParam String password,ModelMap modelMap) {
        User user = userRepository.findByEmail(email);
        if (user.getPassword().equals(password)) {
            return "findFlights";
        } else {
            modelMap.addAttribute("msg", "Invalid user name or password .Please try again.");
        }
        return "login/login";
    }

    }

