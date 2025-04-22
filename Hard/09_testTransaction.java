import org.hibernate.Session;

public class TestTransaction {
    public static void main(String[] args) {
        // Create accounts for testing
        Account account1 = new Account("Alice", 5000);
        Account account2 = new Account("Bob", 3000);

        // Save accounts to the database
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(account1);
            session.save(account2);
            session.getTransaction().commit();
        }

        // Test money transfer
        BankService bankService = new BankServiceImpl();
        try {
            bankService.transferMoney(account1