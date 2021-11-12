package cc.chenzhihao.hischool.service.system.convertor;

import cc.chenzhihao.hischool.domain.base.aggregation.SystemInfoAgg;
import cc.chenzhihao.hischool.domain.base.entity.OperateSystemInfo;
import cc.chenzhihao.hischool.domain.base.entity.ProjectInfo;
import cc.chenzhihao.hischool.service.system.dto.OperateSystemInfoDTO;
import cc.chenzhihao.hischool.service.system.dto.ProjectInfoDTO;
import cc.chenzhihao.hischool.service.system.dto.SystemInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 系统信息 转换器
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:57
 */
public class SystemAssembler {

    /**
     * SystemInfoAgg -> SystemInfoDTO
     *
     * @param systemInfoAgg SystemInfoAgg
     * @return SystemInfoDTO
     */
    public static SystemInfoDTO systemInfoAgg2SystemInfoDTO(SystemInfoAgg systemInfoAgg) {
        return SystemMapper.INSTANCE.systemInfoAgg2SystemInfoDTO(systemInfoAgg);
    }

    @Mapper
    interface SystemMapper {

        SystemMapper INSTANCE = Mappers.getMapper(SystemMapper.class);

        /**
         * SystemInfoAgg -> SystemInfoDTO
         */

        SystemInfoDTO systemInfoAgg2SystemInfoDTO(SystemInfoAgg systemInfoAgg);

        /**
         * ProjectInfo -> ProjectInfoDTO
         */
        ProjectInfoDTO projectInfo2ProjectInfoDTO(ProjectInfo projectInfo);

        /**
         * OperateSystemInfo -> OperateSystemInfoDTO
         */
        OperateSystemInfoDTO operateSystemInfo2OperateSystemInfoDTO(OperateSystemInfo operateSystemInfo);
    }

}
