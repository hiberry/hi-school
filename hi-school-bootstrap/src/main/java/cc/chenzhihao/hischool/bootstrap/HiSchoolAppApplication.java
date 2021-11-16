package cc.chenzhihao.hischool.bootstrap;

import cc.chenzhihao.hi.framework.spring.enable.EnableSpringBeanContext;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cc.chenzhihao.hischool")
@MapperScan(basePackages = "cc.chenzhihao.hischool.infrastructure.persistent.mapper")
@EnableSpringBeanContext
public class HiSchoolAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiSchoolAppApplication.class, args);
    }

}
