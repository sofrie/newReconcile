/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.request.ToleranceRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface ToleranceService {

    void addTolerance(ToleranceRequest tolerance);

    void updateTolerance(ToleranceRequest tolerance);

    Tolerance getTolerance();
}
