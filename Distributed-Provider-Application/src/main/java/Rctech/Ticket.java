package Rctech;

public class Ticket {
	private String name;
	private String mail;
	private String from;
	private String to;
	private String doj;
	private String TicketStatus;
	private Integer TicketNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public Integer getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		TicketNumber = ticketNumber;
	}
	
	

}
