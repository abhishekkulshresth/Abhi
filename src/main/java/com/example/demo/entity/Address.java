package com.example.demo.entity;
import java.util.Arrays;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long  adId;
	private Integer[] adIntegers;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_ID")
	@JsonIgnore
	private   Employee em;
	public Long getAdId() {
		return adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Integer[] getAdIntegers() {
		return adIntegers;
	}
	public void setAdIntegers(Integer[] adIntegers) {
		this.adIntegers = adIntegers;
	}
	public Employee getEm() {
		return em;
	}
	public void setEm(Employee em) {
		this.em = em;
	}
	@Override
	public String toString() {
		return "Address [adId=" + adId + ", adIntegers=" + Arrays.toString(adIntegers) + ", em=" + em + "]";
	}
	
}
