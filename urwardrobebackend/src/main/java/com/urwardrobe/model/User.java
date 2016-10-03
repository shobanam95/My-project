package com.urwardrobe.model;
import javax.persistence.Column; 


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "USERS")
public class User {

	 
	    private String firstname;
	    private String lastname;
	    private String password;
	    private String email;
	    private String confirm_password;
	    
	    @Id
	    @GeneratedValue
	    @Column(name = "User")
	    
	    
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getConfirm_password() {
			return confirm_password;
		}
		public void setConfirm_password(String confirm_password) {
			this.confirm_password = confirm_password;
		}

	 

}
