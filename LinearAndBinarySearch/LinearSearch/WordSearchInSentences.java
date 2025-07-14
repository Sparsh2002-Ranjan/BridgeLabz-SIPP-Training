public class WordSearchInSentences {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a popular language.",
            "Artificial Intelligence is fascinating.",
            "Let's solve problems together."
        };
        String wordToSearch = "AI";
        String result = findSentenceWithWord(sentences, wordToSearch);
        System.out.println("Result: " + result);
    }
}
