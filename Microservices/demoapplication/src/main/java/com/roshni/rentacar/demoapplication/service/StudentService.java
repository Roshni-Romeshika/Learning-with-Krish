package com.roshni.rentacar.demoapplication.service;

import com.roshni.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);
    Student fetchStudentById(int id);
}
