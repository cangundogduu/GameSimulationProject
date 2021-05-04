package Entites.Concrete;

import Entites.Abstractt.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private String description;
	
	
	public Game(int id, String gameName, String description) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
