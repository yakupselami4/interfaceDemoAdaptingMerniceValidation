package interfaceDemoAdaptingMernis.Concretes;

import interfaceDemoAdaptingMernis.Abstract.CustomerManager;
import interfaceDemoAdaptingMernis.Abstract.PersonCheckService;
import interfaceDemoAdaptingMernis.Entities.Customer;


public class StarbuckCustomerManager extends CustomerManager{
	
	
	private PersonCheckService personCheckService;
	
	public StarbuckCustomerManager(PersonCheckService personCheckService) {
		this.personCheckService=personCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if(personCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks sistemine kayit isleminiz basariyla tamamlandi: "+customer.getFirstName()+" "+customer.getLastName());;
		}else {
			System.out.println("kaydedilmedi");
		}
	}


	
}
