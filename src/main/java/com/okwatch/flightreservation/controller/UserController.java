package com.okwatch.flightreservation.controller;
import com.okwatch.flightreservation.entities.User;
import com.okwatch.flightreservation.repos.UserRepository;
import com.okwatch.flightreservation.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    SecurityService securityService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "Login/registerUser";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute("User") User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return "Login/login";
    }

    @RequestMapping("/showLogin")
    public String showLoginPage() {
        return "Login/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        boolean login = securityService.login(email, password);
        if (login) {
            return "findFlight";
        } else {
            modelMap.addAttribute("msg", "Invalid username or password");
            return "Login/login";
        }
    }
}
