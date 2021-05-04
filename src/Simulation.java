import Abstract.BaseCustomerManager;

import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Simulation {
    public static void main(String[] args) {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1,"Mehmet","Simsek",new Date(1993, Calendar.JANUARY,9),"03105644444"));
    }
}
