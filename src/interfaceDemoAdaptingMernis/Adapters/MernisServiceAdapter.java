package interfaceDemoAdaptingMernis.Adapters;


import java.rmi.RemoteException;

import interfaceDemoAdaptingMernis.Abstract.PersonCheckService;
import interfaceDemoAdaptingMernis.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{
	
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws Exception {

		
		boolean result= client.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth());
		
		if(result == true) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
