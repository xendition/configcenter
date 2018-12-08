/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2018-12-08 21:04 创建
 */
package org.antframework.configcenter.biz.provider;

import org.antframework.configcenter.facade.api.ReleaseService;
import org.antframework.configcenter.facade.order.AddReleaseOrder;
import org.antframework.configcenter.facade.result.AddReleaseResult;
import org.bekit.service.ServiceEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 发布服务提供者
 */
@Service
public class ReleaseServiceProvider implements ReleaseService {
    @Autowired
    private ServiceEngine serviceEngine;

    @Override
    public AddReleaseResult addRelease(AddReleaseOrder order) {
        return serviceEngine.execute("addReleaseService", order);
    }
}