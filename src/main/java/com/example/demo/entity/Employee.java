package com.example.demo.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long empId;
private String empName;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "em")
private  List<Address> ad = new ArrayList<Address>();
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public List<Address> getAd() {
	return ad;
}

public void setAd(List<Address> ad) {
	this.ad = ad;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", ad=" + ad + "]";
}
}
