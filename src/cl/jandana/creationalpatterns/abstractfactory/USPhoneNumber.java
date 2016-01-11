package cl.jandana.creationalpatterns.abstractfactory;

public class USPhoneNumber extends PhoneNumber {
	private static final String COUNTRY_CODE="01";
	private static final int NUMBER_LENG=10;
	
	@Override
	public String getCountryCode() {
		return COUNTRY_CODE;
	}
	
	public void setPhoneNumber(String newNumber){
		if (newNumber.length()==NUMBER_LENG	){
			super.setPhoneNumber(newNumber);
		}
	}
}
