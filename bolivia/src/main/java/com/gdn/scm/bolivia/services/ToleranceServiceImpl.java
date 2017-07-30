/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.ToleranceRepository;
import com.gdn.scm.bolivia.request.ToleranceRequest;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class ToleranceServiceImpl implements ToleranceService {
    @Autowired
    ToleranceRepository toleranceRepository; 

    @Override
    public void addTolerance(ToleranceRequest request) {
        Tolerance tolerance = new Tolerance();
        BeanUtils.copyProperties(request, tolerance);
        toleranceRepository.save(tolerance);
    }

    @Override
    public void updateTolerance(ToleranceRequest request) {
        Tolerance tolerance=toleranceRepository.findOne(request.getId());
        BeanUtils.copyProperties(request, tolerance);
        toleranceRepository.save(tolerance);
    }

    @Override
    public Tolerance getTolerance() {
        return toleranceRepository.findOne("1");
    }
}
