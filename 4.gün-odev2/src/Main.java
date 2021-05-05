import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setFirstName("Yusuf");
		customer1.setLastName("Koçak");
		customer1.setDateOfBirth(1997);
		customer1.setNationalityId(17257418274L);
		

		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		starbucksCustomerManager.Save(customer1);

	}

}
