package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "constat")
public class Constat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String LicenceA;
	private String LicenceB;
	private String DateAccident;
	private String CarA;
	private String CarB;
	private String AssuranceA;
	private String AssuranceB;
	private int Num_AssA;
	private int Num_AssB;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLicenceA() {
		return LicenceA;
	}
	public void setLicenceA(String licenceA) {
		LicenceA = licenceA;
	}
	public String getLicenceB() {
		return LicenceB;
	}
	public void setLicenceB(String licenceB) {
		LicenceB = licenceB;
	}
	public String getDateAccident() {
		return DateAccident;
	}
	public void setDateAccident(String dateAccident) {
		DateAccident = dateAccident;
	}
	public String getCarA() {
		return CarA;
	}
	public void setCarA(String carA) {
		CarA = carA;
	}
	public String getCarB() {
		return CarB;
	}
	public void setCarB(String carB) {
		CarB = carB;
	}
	public String getAssuranceA() {
		return AssuranceA;
	}
	public void setAssuranceA(String assuranceA) {
		AssuranceA = assuranceA;
	}
	public String getAssuranceB() {
		return AssuranceB;
	}
	public void setAssuranceB(String assuranceB) {
		AssuranceB = assuranceB;
	}
	public int getNum_AssA() {
		return Num_AssA;
	}
	public void setNum_AssA(int num_AssA) {
		Num_AssA = num_AssA;
	}
	public int getNum_AssB() {
		return Num_AssB;
	}
	public void setNum_AssB(int num_AssB) {
		Num_AssB = num_AssB;
	}
	

}
