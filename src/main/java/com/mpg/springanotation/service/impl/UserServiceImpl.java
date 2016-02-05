/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpg.springanotation.service.impl;

import com.mpg.springanotation.enitties.User;
import com.mpg.springanotation.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Karoons
 */
@Service
public class UserServiceImpl implements UserService {

    private List<User> makeData() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            User ent = new User();
            ent.setEmail(i + "@");
            ent.setFamilyName("family name " + i);
            ent.setFirstName("First Name " + i);
            ent.setId(Long.parseLong("" + i));

            users.add(ent);

        }
        return users;
    }

    @Override
    public List<User> findAll() {

        return makeData();
    }

}
