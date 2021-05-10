package interfacesHomework1.Concrete;

import interfacesHomework1.Abstract.BaseCustomerManager;
import interfacesHomework1.Abstract.CustomerCheckService;
import interfacesHomework1.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer){
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
		System.out.println("Not a valid person");
		}
	}
}
