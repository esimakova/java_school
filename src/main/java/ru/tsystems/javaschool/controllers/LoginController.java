package ru.tsystems.javaschool.controllers;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes({"currentUser"})
@Controller
public class LoginController {
    //private static final Logger log = LogManager.getLogger(LoginController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
    public String loginError(Model model){
        //log.info("Login attempt failed");
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    public String doLogin(){
        return "doLogin";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus session){
        SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();
        return "redirect:/welcome";
    }

}
