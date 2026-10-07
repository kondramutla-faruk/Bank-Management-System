package test;
import java.sql.SQLException;
import dao.TransactionDAO;
public class TransactionDAOTest{
    public static void main(String[]args) throws SQLException{
        TransactionDAO dao=new TransactionDAO();
       dao.getTransactions();
    }
}
