package com.palette.palette;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colours")
public class Colour {

	@Id
	public String colourId;
	public String hexcode;

	public Colour(){

	}

	public Colour(String colourId, String hexcode){
		this.colourId = colourId;
		this.hexcode = hexcode;
	}

	public String getColourId() {
		return colourId;
	}

	public void setColourId(String colourId){
		this.colourId = colourId;
	}

	public String getHexcode(){
		return hexcode;
	}

	public void setHexcode(String hexcode){
		this.hexcode = hexcode;
	}

}
