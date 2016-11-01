package com.urwardrobe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.logging.annotations.Field;

@Entity
@Table(name = "UserDetail")

public class UserForm implements Serializable {
	
	 	 private String firstname;
	
	 
	    private String lastname;
	    
	 
	    private String password;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column
	    private int id;
	    private Boolean enabled;
	    private String role;
	
	    public Boolean getEnabled() {
			return enabled;
		}
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		private String email;
	
	    private String confirm_password;
	
		
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
		 public String toString() {
		        return "First name=" + firstname + ", Lastname=" + lastname
		                + ", Password=" + password + ",Email"+ email+",Confirm_password="+ confirm_password  +"]";
		    }
		
		

}

