/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_JUMLAH_TAGIHAN;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_LAST_MODIFIED;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_LOGISTIC;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_OK;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_PROBLEM_EXIST;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_YEAR;
import java.util.Date;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Getter
@Setter
public class UploadHistoryRequest {
    private Integer id;
    
    private Integer month;

    private Integer year;    

    private String logistic;
    
    private String status;
}
