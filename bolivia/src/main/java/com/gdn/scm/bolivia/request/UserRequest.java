/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Getter
@Setter
public class UserRequest {

    private Integer id;
    private String username;
    private String password;
    private String passwordConfirmation;
    private String name;
    private String role;
}
