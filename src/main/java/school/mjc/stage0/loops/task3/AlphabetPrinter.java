package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public void printAlphabet() {
        for (int i = 0; i <= 25; i++) {
            System.out.println(alphabet.charAt(i));
        }
    }
}
