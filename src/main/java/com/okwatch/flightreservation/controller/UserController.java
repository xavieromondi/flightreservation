package com.okwatch.flightreservation.controller;

import com.okwatch.flightreservation.entities.User;
import com.okwatch.flightreservation.repos.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {



    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "Login/registerUser";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute("User") User user) {
        userRepository.save(user);
        return "Login/login";
    }

    @RequestMapping("/showLogin")
    public String showLoginPage() {
        return "Login/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "findFlight";
        } else {
            modelMap.addAttribute("msg", "Invalid username or password");
            return "Login/login";
        }
    }
}
