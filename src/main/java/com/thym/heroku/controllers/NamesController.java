package com.thym.heroku.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NamesController {
static ArrayList<String> listNom=new ArrayList<String>();
@GetMapping("")
public String getHomePage()
{
return "index";	
}
@PostMapping("affichage")
public String lister(Model md, @RequestParam String nom)
{
listNom.add(nom);
md.addAttribute("liste",listNom);
return "liste";

}

}
