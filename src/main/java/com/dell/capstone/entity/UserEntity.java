package com.dell.capstone.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//TODO added recently - not pushed
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name = "ID")
	public int Id;
	

	/** The status. */
	@Column(name = "FirstNAME")
	private String firstname;
	
	@Column(name = "LastName")
	private String lastname;
	

	@Column(name = "EMAIL")
	private String email;
	
	
	@Column(name = "PWD")
	private String pwd;
	
	@Column(name = "DOB")
	private String dob;

	@Column(name = "PhoneNumber")
	private String phonenumber;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "WALLET_AMOUNT")
	private int walletAmount;
	
	@Column(name = "IS_ADMIN")
	private boolean isAdmin;

	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getUsername() {
		return firstname;
	}

	public void setUsername(String username) {
		this.firstname = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getWalletAmount() {
		return walletAmount;
	}

	public void setWalletAmount(int walletAmount) {
		this.walletAmount = walletAmount;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public UserEntity(int id, String username, String email, String pwd, int walletAmount, boolean isAdmin) {
		super();
		this.Id = id;
		this.firstname = username;
		this.email = email;
		this.pwd = pwd;
		this.walletAmount = walletAmount;
		this.isAdmin = isAdmin;
	}

	public UserEntity() {
		super();
	}

	
	
	
	


}
