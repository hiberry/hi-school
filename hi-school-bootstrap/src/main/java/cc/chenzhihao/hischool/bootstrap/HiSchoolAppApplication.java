package cc.chenzhihao.hischool.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cc.chenzhihao.hischool")
public class HiSchoolAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiSchoolAppApplication.class, args);
    }

}
