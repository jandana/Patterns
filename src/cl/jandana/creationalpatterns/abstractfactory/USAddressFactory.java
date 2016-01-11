package cl.jandana.creationalpatterns.abstractfactory;

public class USAddressFactory implements AdressFactory {

	@Override
	public Address createAddress() {		
		return new USAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new USPhoneNumber() ;
	}

}
