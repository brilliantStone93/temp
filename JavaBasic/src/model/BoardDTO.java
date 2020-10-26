package model;

import java.util.Calendar;

public class BoardDTO {
	private int id;
	private String title;
	private int writerId;
	private String writerName;
	private String content;
	private String writterndate;
	private Calendar writterenDate;
	private Calendar updatedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWritterndate() {
		return writterndate;
	}
	public void setWritterndate(String writterndate) {
		this.writterndate = writterndate;
	}
	public Calendar getWritterenDate() {
		return writterenDate;
	}
	public void setWritterenDate(Calendar writterenDate) {
		this.writterenDate = writterenDate;
	}
	public Calendar getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public boolean equals(Object o) {
		if(o instanceof BoardDTO) {
			BoardDTO b = (BoardDTO)o;
			if(id == b.id) {
				return true;
			}
		}
		
		return false;
	}
	
}
