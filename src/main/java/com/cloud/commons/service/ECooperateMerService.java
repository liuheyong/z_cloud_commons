package com.cloud.commons.service;

import com.cloud.commons.dto.ECooperateMer;
import com.cloud.commons.response.QueryECooperateMerResponse;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @description: ECooperateMerService
 **/
public interface ECooperateMerService {

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.commons.dto.ECooperateMer
     * @exception:
     * @description: 详情
     */
    ECooperateMer queryECooperateMerInfo(ECooperateMer eCooperateMer) throws Exception;

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.commons.dto.ECooperateMer
     * @exception:
     * @description: 列表
     */
    QueryECooperateMerResponse queryECooperateMerListPage(ECooperateMer eCooperateMer) throws Exception;
}
