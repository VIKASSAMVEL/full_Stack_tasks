package com.college.task11;

import com.college.task10.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsByDeptSorted(String dept) {
        // Find by department and sort by name ascending
        return studentRepository.findByDepartment(dept, Sort.by("name").ascending());
    }

    public Page<Student> getStudentsByDeptPaginated(String dept, int page, int size) {
        // Support for Pagination and Sorting
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());
        return studentRepository.findByDepartment(dept, pageable);
    }
}
