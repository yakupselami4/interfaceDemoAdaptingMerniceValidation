package interfaceDemoAdaptingMernis;

import interfaceDemoAdaptingMernis.Abstract.CustomerManager;
import interfaceDemoAdaptingMernis.Adapters.MernisServiceAdapter;
import interfaceDemoAdaptingMernis.Concretes.NeroCustomerManager;
import interfaceDemoAdaptingMernis.Concretes.StarbuckCustomerManager;
import interfaceDemoAdaptingMernis.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		MernisServiceAdapter adapter = new MernisServiceAdapter();
		
		CustomerManager customerManager = new StarbuckCustomerManager(adapter);
		CustomerManager customerManager2 = new NeroCustomerManager();
		Customer customer1 = new Customer(1,"Yakup Selami","Öztürk",2000,"61051346028");
		customerManager.save(customer1);
		//customerManager2.save(customer1);
	}

}
