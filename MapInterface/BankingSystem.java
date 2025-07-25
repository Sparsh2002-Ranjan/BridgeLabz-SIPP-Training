import java.math.BigDecimal;
import java.util.*;

public class BankingSystem {
    public static class WithdrawalRequest {
        private final String account;
        private final BigDecimal amount;

        public WithdrawalRequest(String account, BigDecimal amount) {
            this.account = account;
            this.amount = amount;
        }

        public String getAccount() {
            return account;
        }

        public BigDecimal getAmount() {
            return amount;
        }
    }

    private final Map<String, BigDecimal> accounts = new HashMap<>();
    private final Queue<WithdrawalRequest> queue = new ArrayDeque<>();

    public void create(String account, BigDecimal balance) {
        accounts.put(account, balance);
    }

    public void enqueueWithdrawal(String account, BigDecimal amount) {
        queue.add(new WithdrawalRequest(account, amount));
    }

    public void processQueue() {
        while (!queue.isEmpty()) {
            WithdrawalRequest r = queue.poll();
            BigDecimal bal = accounts.getOrDefault(r.getAccount(), BigDecimal.ZERO);
            if (bal.compareTo(r.getAmount()) >= 0) {
                accounts.put(r.getAccount(), bal.subtract(r.getAmount()));
            }
        }
    }

    public NavigableMap<BigDecimal, List<String>> customersSortedByBalance() {
        NavigableMap<BigDecimal, List<String>> out = new TreeMap<>();
        for (Map.Entry<String, BigDecimal> e : accounts.entrySet()) {
            out.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return out;
    }

    public Map<String, BigDecimal> accounts() {
        return new HashMap<>(accounts);
    }

    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        bs.create("1001", new BigDecimal("1000.00"));
        bs.create("1002", new BigDecimal("500.00"));
        bs.enqueueWithdrawal("1001", new BigDecimal("200.00"));
        bs.enqueueWithdrawal("1002", new BigDecimal("600.00"));
        bs.processQueue();
        System.out.println(bs.accounts());
        System.out.println(bs.customersSortedByBalance());
    }
}
