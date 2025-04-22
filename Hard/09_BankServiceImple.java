import org.hibernate.Session;
import org.hibernate.Transaction;

public class BankServiceImpl implements BankService {
    @Override
    public void transferMoney(int fromAccountId, int toAccountId, double amount) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Fetch accounts
            Account fromAccount = session.get(Account.class, fromAccountId);
            Account toAccount = session.get(Account.class, toAccountId);

            // Perform transfer
            if (fromAccount.getBalance() >= amount) {
                fromAccount.setBalance(fromAccount.getBalance() - amount);
                toAccount.setBalance(toAccount.getBalance() + amount);
                
                // Save updated accounts
                session.update(fromAccount);
                session.update(toAccount);

                // Log transaction
                Transaction transactionRecord = new Transaction(fromAccountId, toAccountId, amount);
                session.save(transactionRecord);
            } else {
                throw new RuntimeException("Insufficient balance");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}