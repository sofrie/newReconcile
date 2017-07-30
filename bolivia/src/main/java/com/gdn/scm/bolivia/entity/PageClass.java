/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Getter
@Setter
public class PageClass {
    private Integer page;
    private Integer item_page;
    private Integer total_page;

    public PageClass() {
    }

   
}
