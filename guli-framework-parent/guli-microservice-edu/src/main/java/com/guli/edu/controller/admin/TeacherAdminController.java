
package com.guli.edu.controller.admin;

//import com.baomidou.mybatisplus.extension.api.R;

import com.guli.common.vo.R;
import com.guli.edu.entity.Teacher;
import com.guli.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("讲师管理")
@CrossOrigin
@RequestMapping("/admin/edu/teacher")

public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;


    @ApiOperation(value = "所有讲师列表")
    @GetMapping
    public R list(){
        List<Teacher> list = teacherService.list(null);
        return R.ok().data("items", list);
    }


//    @ApiOperation(value = "根据ID删除讲师")
//    @DeleteMapping("{id}")
//    public boolean removeById(@ApiParam(name = "id", value = "讲师ID", required = true) @PathVariable String id){
//
//        return teacherService.removeById(id);
//    }



}