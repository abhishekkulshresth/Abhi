package com.example.demo.REPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Employee;
@Repository
public interface JPAREPO extends JpaRepository<Employee, Long> {

	
}
