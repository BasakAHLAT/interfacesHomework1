package interfacesHomework1;

import java.util.Date;

import interfacesHomework1.Abstract.*;
import interfacesHomework1.Adapters.*;
import interfacesHomework1.Concrete.*;
import interfacesHomework1.Entities.*;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Basak", "AHLAT", new Date(2001), "11111111111"));

	}

}
