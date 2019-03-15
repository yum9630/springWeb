package spring.web.ch10.ex03.domain;

public class Message {
	private String to;
	private String subject;
	private String txt;
	
	public String getTo(){
		return to;
	}
	public String getSubject(){
		return subject;
	}
	public String getTxt(){
		return txt;
	}
	public void setTo(String to){
		this.to = to;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public void setTxt(String txt){
		this.txt = txt;
	}

}
