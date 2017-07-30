/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.User;
import com.gdn.scm.bolivia.request.UserRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface UserService {
    public void addUser(UserRequest user);
    public void save(User user);

    public User getUser(String username);

    public List<User> getAllUsers();
}
