/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring2explore.restcontroller;

import com.mycompany.spring2explore.entities.MPerson;
import com.mycompany.spring2explore.services.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */
@RestController
public class PersonRestcontroller {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/rest/get-person", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MPerson> mPersons() {
        List<MPerson> listPersons = personService.listPersons();
        System.out.println("lewat get-person");
        System.out.println("List<MPerson> : " + listPersons);
        return listPersons;
    }

    @RequestMapping(value = "/rest/get-one-person", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public MPerson getPerson() {
        MPerson mPerson = new MPerson();
        mPerson.setId(23);
        mPerson.setName("Person test 1 object");
        mPerson.setAddress("jl. jalan malam");
        System.out.println("mPerson : " + mPerson);
        return mPerson;
    }
}
