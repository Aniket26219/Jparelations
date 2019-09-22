package com.jparelations.Jparelations.repo;

import com.jparelations.Jparelations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends JpaRepository<Student,Integer> {
}
