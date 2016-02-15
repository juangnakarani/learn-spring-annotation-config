/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring2explore.controller;

import com.mycompany.spring2explore.entities.MPerson;
import com.mycompany.spring2explore.services.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author juang
 */
@Controller
@RequestMapping("login")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("person")
    public String login() {
        List<MPerson> mPersons = personService.listPersons();
        System.out.println("mPersons" + mPersons);
        for (MPerson person : mPersons) {
            System.out.println("person name :" + person.getName());
            System.out.println("person Address :" + person.getAddress());
            System.out.println("+----------------------------+");
        }
        System.out.println("controller person is ok...");
        String pesan = personService.getLoginService();
        System.out.println("pensan :" + pesan);

        return "login";
    }
}
