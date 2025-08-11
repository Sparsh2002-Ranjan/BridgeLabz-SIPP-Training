import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount ba = new BankAccount();

    @Test
    void testDeposit() {
        ba.deposit(100);
        assertEquals(100, ba.getBalance());
    }

    @Test
    void testWithdraw() {
        ba.deposit(100);
        ba.withdraw(50);
        assertEquals(50, ba.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> ba.withdraw(50));
    }
}
