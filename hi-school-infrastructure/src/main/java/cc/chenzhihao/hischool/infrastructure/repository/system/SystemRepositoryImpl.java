package cc.chenzhihao.hischool.infrastructure.repository.system;

import cc.chenzhihao.hischool.domain.base.aggregation.SystemInfoAgg;
import cc.chenzhihao.hischool.domain.base.entity.OperateSystemInfo;
import cc.chenzhihao.hischool.domain.base.entity.ProjectInfo;
import cc.chenzhihao.hischool.domain.base.repository.SystemRepository;
import org.springframework.stereotype.Repository;

/**
 * 系统资源库实现
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:16
 */
@Repository
public class SystemRepositoryImpl implements SystemRepository {

    private final SystemMonitor systemMonitor;

    public SystemRepositoryImpl(SystemMonitor systemMonitor) {
        this.systemMonitor = systemMonitor;
    }

    @Override
    public SystemInfoAgg getSystemInfo() {
        return new SystemInfoAgg(
                new ProjectInfo(
                        systemMonitor.projectGroupId(),
                        systemMonitor.projectArtifactId(),
                        systemMonitor.projectVersion()
                ),
                new OperateSystemInfo(systemMonitor.operateSystemName())
        );
    }
}
