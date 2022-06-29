package interfaceDemoAdaptingMernis.Abstract;

import interfaceDemoAdaptingMernis.Entities.Customer;

public interface PersonCheckService {

	boolean checkIfRealPerson(Customer customer) throws Exception;
}
