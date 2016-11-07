package com.tradingnetworks.dataobjects;

/**
 * Created by <a href="mailto:aurelian.hreapca@info.uaic.ro">FIIAurelian<a/>
 * on Nov 7, 2016.
 */
public class User {

	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private double balance;
	
	public User(Builder builder) {
		this.id = builder.id;
		this.username = builder.username;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.balance = builder.balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static final class Builder {
		private int id;
		private String username;
		private String firstName;
		private String lastName;
		private double balance;
		
		public Builder withId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder withUsername(String username) {
			this.username = username;
			return this;
		}
		
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
