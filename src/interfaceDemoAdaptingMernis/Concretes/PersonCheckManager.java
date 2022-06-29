package interfaceDemoAdaptingMernis.Concretes;

import interfaceDemoAdaptingMernis.Abstract.CustomerService;
import interfaceDemoAdaptingMernis.Abstract.PersonCheckService;
import interfaceDemoAdaptingMernis.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PersonCheckManager implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
