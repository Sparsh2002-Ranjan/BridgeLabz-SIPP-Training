public class Problem08_CollapseSpaces {
    public static String collapse(String s) {
        return s.replaceAll("\\s{2,}", " ");
    }
    public static void main(String[] args) {
        String in = "This  is   an example    with multiple spaces.";
        System.out.println(collapse(in));
    }
}
