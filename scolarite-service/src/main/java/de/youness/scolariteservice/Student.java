package de.youness.scolariteservice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Setter @Getter
public class Student {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Long id;
	public String name;
	public String email;
	public Date birthDate;

//	public Student() {
//	}
//	public Student(Long id, String name, String email, Date date) {
//	this.id =id;
//	this.name =name;
//	this.email =email;
//	this.birthDate =date;
//}
}