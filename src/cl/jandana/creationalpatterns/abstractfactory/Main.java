package cl.jandana.creationalpatterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		USAddress usaAddress=new USAddress();
		usaAddress.setCity("New York");
		usaAddress.setPostalCode("1212");
		usaAddress.setRegion("North");
		usaAddress.setStreet("Pizza");
		
		FrenchPhoneNumber frenchPhoneNumber=new FrenchPhoneNumber();
		frenchPhoneNumber.setPhoneNumber("846362920");
		
		System.out.println(usaAddress.getFullAddres());
		System.out.println(frenchPhoneNumber.getPhoneNumber());
	}

}
