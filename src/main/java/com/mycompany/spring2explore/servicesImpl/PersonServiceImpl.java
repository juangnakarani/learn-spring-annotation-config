/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring2explore.servicesImpl;

import com.mycompany.spring2explore.entities.MPerson;
import com.mycompany.spring2explore.repository.PersonRepository;
import com.mycompany.spring2explore.services.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juang
 */
@Component
@Service
public class PersonServiceImpl implements PersonService{
    
@Autowired
private PersonRepository personRepository;

    @Override
    public String getLoginService() {
        return "ini service Person";
    }

    @Override
    public List<MPerson> listPersons() {
        System.out.println("lewat service impl");
        List<MPerson> mPersons = personRepository.listPerson();
        return mPersons;
    }
    
}
