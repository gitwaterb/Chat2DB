package com.alibaba.dataops.server.domain.core.api.service;

import javax.validation.constraints.NotNull;

import com.alibaba.dataops.server.domain.core.api.model.DataSourceDTO;
import com.alibaba.dataops.server.domain.core.api.model.DatabaseDTO;
import com.alibaba.dataops.server.domain.core.api.param.DataSourceCreateParam;
import com.alibaba.dataops.server.domain.core.api.param.DataSourcePageQueryParam;
import com.alibaba.dataops.server.domain.core.api.param.DataSourceSelector;
import com.alibaba.dataops.server.domain.core.api.param.DataSourceUpdateParam;
import com.alibaba.dataops.server.tools.base.wrapper.result.ActionResult;
import com.alibaba.dataops.server.tools.base.wrapper.result.DataResult;
import com.alibaba.dataops.server.tools.base.wrapper.result.ListResult;
import com.alibaba.dataops.server.tools.base.wrapper.result.PageResult;

/**
 * 数据源管理服务
 *
 * @author moji
 * @version DataSourceCoreService.java, v 0.1 2022年09月23日 15:22 moji Exp $
 * @date 2022/09/23
 */
public interface DataSourceCoreService {

    /**
     * 创建数据源连接
     *
     * @param param
     * @return
     */
    DataResult<Long> create(DataSourceCreateParam param);

    /**
     * 更新数据源连接
     *
     * @param param
     * @return
     */
    ActionResult update(DataSourceUpdateParam param);

    /**
     * 删除数据源连接
     *
     * @param id
     * @return
     */
    ActionResult delete(@NotNull Long id);

    /**
     * 根据id查询数据源连接详情
     *
     * @param id
     * @return
     */
    DataResult<DataSourceDTO> queryById(@NotNull Long id);

    /**
     * 克隆连接
     *
     * @param id
     * @return
     */
    DataResult<Long> copyById(@NotNull Long id);

    /**
     * 分页查询数据源列表
     *
     * @param param
     * @param selector
     * @return
     */
    PageResult<DataSourceDTO> queryPage(DataSourcePageQueryParam param, DataSourceSelector selector);

    /**
     * 连接数据源
     *
     * @param id
     * @return
     */
    ListResult<DatabaseDTO> attach(Long id);
}
