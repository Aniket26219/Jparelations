package com.jparelations.Jparelations.repo;

import com.jparelations.Jparelations.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptInterface extends JpaRepository<Department,Integer> {
}
