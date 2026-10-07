package test;
import java.sql.SQLException;
import service.CustomerService;
public class CustomerServiceTest{
    public static void main(String[]args) throws SQLException{
        CustomerService service=new CustomerService();
       service.getCustomers();
    }
}
