package fr.uvsq.af.tp9.controller;

import fr.uvsq.af.tp9.entity.Login;
import fr.uvsq.af.tp9.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    private LoginService service;

    @RequestMapping("/")
    public String list(Model model) {
        List<Login> logins = service.listAll();
        model.addAttribute("logins", logins);
        return "login_list";
    }

    @RequestMapping("/new")
    public String newForm(Model model) {
        model.addAttribute("login", new Login());
        return "login_form";
    }

    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@ModelAttribute("login") Login login) {
        service.save(login);
        return "redirect:/logins/";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam Long id, Model model) {
        model.addAttribute("login", service.get(id));
        return "login_form";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/logins/";
    }
}
