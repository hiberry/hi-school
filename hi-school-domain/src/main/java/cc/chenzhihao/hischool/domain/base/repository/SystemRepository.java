package cc.chenzhihao.hischool.domain.base.repository;

import cc.chenzhihao.hischool.domain.base.aggregation.SystemInfoAgg;

/**
 * 系统信息 资源库
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:09
 */
public interface SystemRepository {

    /**
     * 获取系统信息
     *
     * @return 系统信息 聚合
     */
    SystemInfoAgg getSystemInfo();

}
