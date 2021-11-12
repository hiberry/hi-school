package cc.chenzhihao.hischool.bootstrap.component;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置
 *
 * @author jacksonchenzhihao
 * @date 2021-11-12 12:06
 */
@Configuration
@MapperScan("cc.chenzhihao.hischool.infrastructure.persistent.mapper")
public class MybatisConfiguration {
}
