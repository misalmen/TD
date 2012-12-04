package xmas.parts.impl;

public class Player {
	
	private String name = "";
	private int life = 3;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, int life) {
		this.name = name;
		this.life = life;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getLive() {
		return this.life;
	}

	public void setLive(int life) {
		this.life = life;
	}
	
	public void loseLive() {
		this.life--;
	}
	
	public boolean gameover() {
		if ( life == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}