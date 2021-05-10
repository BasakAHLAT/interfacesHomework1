package interfacesHomework1.Adapters;

import java.rmi.RemoteException;


import interfacesHomework1.Abstract.CustomerCheckService;
import interfacesHomework1.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean checkIfRealPerson(Customer customer) {

		
		//KPSPublicSoapClient client = new KPSPublicSoapClient();
		//return client.TCKimlikNoDogrula(customer.nationalityId, customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth.getYear())
		return true;
	}
}
