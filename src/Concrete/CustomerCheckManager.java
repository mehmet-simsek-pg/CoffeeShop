package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return !customer.getNationalityId().startsWith("0") &&
                customer.getNationalityId().length() <= 11;
    }
}
