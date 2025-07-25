import java.util.*;

public class VotingSystem {
    private final Map<String, Long> votes = new HashMap<>();
    private final Map<String, Long> order = new LinkedHashMap<>();

    public void vote(String candidate) {
        votes.merge(candidate, 1L, Long::sum);
        order.merge(candidate, 1L, Long::sum);
    }

    public Map<String, Long> resultsInInsertionOrder() {
        return new LinkedHashMap<>(order);
    }

    public Map<String, Long> resultsSortedByCandidate() {
        return new TreeMap<>(votes);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.vote("Zoe");
        vs.vote("Aman");
        vs.vote("Aman");
        System.out.println(vs.resultsInInsertionOrder());
        System.out.println(vs.resultsSortedByCandidate());
    }
}
