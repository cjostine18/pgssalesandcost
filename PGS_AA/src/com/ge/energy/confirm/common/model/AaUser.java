package com.ge.energy.confirm.common.model;

import java.util.Locale;



public class AaUser {
	private String ssoId;

	private String lastName;
    private String firstName;
    private String name;
    private int roleId;
    private String email;

    private String  roleName;

    
    public String volidateUser(){
    	return "loginmain";
    } 
 

	public AaUser()
    {
    	super();
    }
    public void modifyAAUser(final String ssoIdIn, 
    		final String firstNameIn, 
    		final String lastNameIn, 
    		final String emailIn, 
    		final int roleIdIn, 
    		final String roleNameIn)
    {
    	Locale loc = Locale.getDefault();
    	this.ssoId = ssoIdIn;
    	this.lastName = lastNameIn;
        this.firstName = firstNameIn;
        this.name = (new StringBuffer(this.firstName).
                append(" ").append(this.lastName).toString()).toUpperCase(loc);
        this.roleId = roleIdIn;
        this.email = emailIn;
        this.roleName = roleNameIn;
    }

	public String getSsoId() {
		return ssoId;
	}
	public String getName() {
		return name;
	}
	public int getRoleId() {
		return roleId;
	}
	public String getEmail() {
		return email;
	}
	
    public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
