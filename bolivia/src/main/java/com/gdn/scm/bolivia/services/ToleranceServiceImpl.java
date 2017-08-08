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
    public Tolerance addTolerance(ToleranceRequest request) {
        try {
            Tolerance tolerance = new Tolerance();
            BeanUtils.copyProperties(request, tolerance);
            toleranceRepository.save(tolerance);
            return tolerance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Tolerance updateTolerance(ToleranceRequest request) {
        try {
            Tolerance tolerance = toleranceRepository.findOne(request.getId());
            BeanUtils.copyProperties(request, tolerance);
            toleranceRepository.save(tolerance);
            System.out.println("berhasil");
            return tolerance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Tolerance getTolerance() {
        return toleranceRepository.findOne("1");
    }
}
