package com.example.demo.contr;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.REPO.JPAREPO;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
@RestController
@RequestMapping("/post")
public class EMPCON  {
@Autowired
private   JPAREPO jpa;
@PostMapping("/save") 
public ResponseEntity<Employee> save(@RequestBody Employee emp)
{
	 List<Address> ad = emp.getAd();
	 for (Address address : ad) {
		  address.setEm(emp);	
	}	 
Employee save = jpa.save(emp);
return  new ResponseEntity<>(save, HttpStatus.OK);
}
	 
}
