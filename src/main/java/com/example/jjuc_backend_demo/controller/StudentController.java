package com.example.jjuc_backend_demo.controller;

import com.example.jjuc_backend_demo.entity.ResponseBase;
import com.example.jjuc_backend_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Resource
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping("/queryStudent")
    @ResponseBody
    ResponseBase queryStudent(){
        ResponseBase response = new ResponseBase();

        response.setObject(studentService.queryStudent());

        return response;
    }
}
