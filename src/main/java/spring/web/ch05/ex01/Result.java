package spring.web.ch05.ex01;

public class Result {
	private boolean duplicated;
	private String availableId;
	
	public boolean isDuplicated(){
		return duplicated;
	}
	
	public void setDuplicated(boolean duplicated){
		this.duplicated = duplicated;
	}
	
	public String getAvailableId(){
		return availableId;
	}
	
	public void setAvailableId(String availabledId){
		this.availableId = availabledId;
	}
	

}
