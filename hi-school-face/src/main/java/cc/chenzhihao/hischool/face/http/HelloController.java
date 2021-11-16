package cc.chenzhihao.hischool.face.http;

import cc.chenzhihao.hi.framework.common.api.Result;
import cc.chenzhihao.hischool.service.hello.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Hello API
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 15:40
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    public Result<String> hello() {
        return Result.success(helloService.hello());
    }
}
