package model;

import java.io.Serializable;

public class Data implements Serializable {
	private String point;
	private String comment;
	
	public Data() {}
	public Data(String point) {
		this.point = point ;
		
		
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
}