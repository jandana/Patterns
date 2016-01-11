package cl.jandana.creationalpatterns.abstractfactory;

public class FrenchAddressFactory implements AdressFactory {

	@Override
	public Address createAddress() {
		return new FrenchAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {	
		return new FrenchPhoneNumber();
	}

}
