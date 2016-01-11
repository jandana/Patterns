package cl.jandana.creationalpatterns.abstractfactory;

public abstract class PhoneNumber {
	private String phoneNumber;
	public abstract String getCountryCode();
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String newNumber) {
		try{
			Long.parseLong(newNumber);
			phoneNumber=newNumber;
		}
		catch(NumberFormatException ext){
			System.out.println("Format error phone number");
		}
		
	}
	

}
