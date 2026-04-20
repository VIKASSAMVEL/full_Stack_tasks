package com.college.task11;

import com.college.task10.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom query method
    List<Student> findByDepartment(String department);

    // Pagination and Sorting support
    Page<Student> findByDepartment(String department, Pageable pageable);
}
