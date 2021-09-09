package com.thym.heroku.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thym.heroku.classes.Personne;

@Controller
public class UserController {
static ArrayList<Personne> listUsers=new ArrayList<Personne>();
@GetMapping("users")
public String users(Model m)
{
Personne p=new Personne();
m.addAttribute("user",p);
return "personne";
}
@PostMapping("save")
public String saving(Model mo, @ModelAttribute("user") Personne user)
{mo.addAttribute("current",user);
return "listeusers";
}

}
