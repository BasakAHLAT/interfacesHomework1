package interfacesHomework1.Concrete;

import interfacesHomework1.Abstract.CustomerCheckService;
import interfacesHomework1.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}
}
