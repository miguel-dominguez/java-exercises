package java11;

public class StringExercises {

    public static void main(String[] args) {
        String s = "test string\u205F";

        // Removing leading and trailing white spaces even unicode characters
        String striped = s.strip();
        System.out.printf("'%s'%n", striped);

        String trimmed = s.trim();
        System.out.printf("'%s'%n", trimmed);
    }

}
