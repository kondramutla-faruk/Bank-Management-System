package test;
import java.sql.SQLException;
import dao.AccountDAO;
public class AccountDAOTest {
    public static void main(String[]args) throws SQLException{
        AccountDAO dao=new AccountDAO();
    System.out.println("AccountDAO initialized successfully");
    }
}
