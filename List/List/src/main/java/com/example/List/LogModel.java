package com.example.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class LogModel {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
	private String bookname,bookid,qnty,genre;
	  LogModel() {}

	    LogModel(String bookid,String bookname,String qnty,String genre)

	    {
	    	//this.id = id;
	    	this.bookid = bookid;
	    	this.bookname = bookname;
	    	this.qnty = qnty;
	    	this.genre = genre;
	    	
	    }
	  
	       
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getQnty() {
		return qnty;
	}
	public void setQnty(String qnty) {
		this.qnty = qnty;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	

}
