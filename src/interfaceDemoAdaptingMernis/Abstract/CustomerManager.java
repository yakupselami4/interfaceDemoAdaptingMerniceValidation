package interfaceDemoAdaptingMernis.Abstract;

import interfaceDemoAdaptingMernis.Entities.Customer;

public abstract class CustomerManager implements CustomerService{

	
	public void save(Customer customer) throws Exception{
		System.out.println("saved to db: "+customer.getFirstName());		
	}

}
