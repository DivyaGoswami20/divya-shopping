package net.kzn.shoppingbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", desciption=" + desciption + ", imageURL=" + imageURL
				+ ", active=" + active + "]";
	}


	/*
	 *    Create private field
	 */
	//her ek field ki id hogi means sare entity class k id hogi
	//hum autogeneration strategy us karenge identity ke liye
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String desciption;
	private String imageURL;//path store krne k liye
	@Column(name="is_active")
	private boolean active=true;//initially true
	
	
	/*
	 * Intially hum true denga admin
	 */
	
	
	
	
}
