package net.kzn.shoppingbackend.dto;

public class Category {

	/*
	 *    generate getter and setter
	 */
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/*
	 *    Create private field
	 */
	private int id;
	private String name;
	private String desciption;
	private String imageURL;//path store krne k liye
	private boolean active;//initially true
	
	
	/*
	 * Intially hum true denga admin
	 */
	
	
}
