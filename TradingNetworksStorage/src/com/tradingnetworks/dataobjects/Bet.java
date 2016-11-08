package com.tradingnetworks.dataobjects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ana Puiu on 11/8/2016.
 */

public class Bet  {
	
	private List<User> observers = new ArrayList<User>();
	 
	private User user;
	private Calendar date;
	private Double sum;
	private Game game;
	private Option chosenOption;
	private String id;
	private String betResult=null;
	
	public Bet(User user, Double sum, Game game, Option chosenOption, String id,Calendar date) {
		this.user = user;
		this.date=date;
		this.sum = sum;
		this.game = game;
		this.chosenOption = chosenOption;
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Option getChosenOption() {
		return chosenOption;
	}
	public void setChosenOption(Option chosenOption) {
		this.chosenOption = chosenOption;
	}
	
	public void register(User obj) {
		observers.add(obj);		
	}
	
	public void unregister(User obj) {
		observers.remove(obj);
	}
	
	public void notifyUser() {
		 // send bet result 
		 //for (User observer : observers) {
	     //    observer.update();
	     // }
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBetResult() {
		return betResult;
	}
	public void setBetResult(String betResult) {
		this.betResult = betResult;
	}
	
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
}
