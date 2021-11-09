package com.example.jjuc_backend_demo.service.impl;

import com.example.jjuc_backend_demo.entity.Student;
import com.example.jjuc_backend_demo.mapper.StudentMapper;
import com.example.jjuc_backend_demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudent(){
        return studentMapper.queryStudent();
    };
}
