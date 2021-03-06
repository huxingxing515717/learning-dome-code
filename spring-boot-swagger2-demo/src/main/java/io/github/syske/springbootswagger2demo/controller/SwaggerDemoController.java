package io.github.syske.springbootswagger2demo.controller;

import io.github.syske.springbootswagger2demo.entity.TestEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: spring-boot-swagger2-demo
 * @description: swagger controller示例
 * @author: syske
 * @create: 2020-02-28 16:18
 */
@Controller
@Api(value = "spring boot swagger demo", description = "spring boot swagger demo")
@RequestMapping("/swagger/dome")
public class SwaggerDemoController {

    @ResponseBody
    @ApiOperation(value = "swagger2示例接口描述",httpMethod = "POST")
    @RequestMapping("/list")
    public TestEntity listTest(TestEntity testEntity) {
        return testEntity;
    }
}
