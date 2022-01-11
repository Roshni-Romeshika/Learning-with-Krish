package com.roshni.rentacar.demoapplication.repository;

import com.roshni.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

/*public interface StudentRepository extends Repository<Student, Integer> {
    Student save(Student student);
}*/