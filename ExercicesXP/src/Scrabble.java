import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    static private Map<String, Integer> letterScrabble = new HashMap<>();

    public Scrabble() {
        letterScrabble.put("A", 1);
        letterScrabble.put("E", 1);
        letterScrabble.put("I", 1);
        letterScrabble.put("O", 1);
        letterScrabble.put("U", 1);
        letterScrabble.put("L", 1);
        letterScrabble.put("N", 1);
        letterScrabble.put("R", 1);
        letterScrabble.put("S", 1);
        letterScrabble.put("T", 1);
        letterScrabble.put("D", 2);
        letterScrabble.put("G", 2);
        letterScrabble.put("B", 3);
        letterScrabble.put("C", 3);
        letterScrabble.put("M", 3);
        letterScrabble.put("P", 3);
        letterScrabble.put("F", 4);
        letterScrabble.put("H", 4);
        letterScrabble.put("V", 4);
        letterScrabble.put("W", 4);
        letterScrabble.put("Y", 4);
        letterScrabble.put("K", 5);
        letterScrabble.put("J", 8);
        letterScrabble.put("X", 8);
        letterScrabble.put("Q", 10);
        letterScrabble.put("Z", 10);
    }

    public static void main(String[] args) {
        new Scrabble().getScore("cabbage");
    }

    public static void getScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            String key = (word.charAt(i) + "").toUpperCase();
            if (letterScrabble.containsKey(key)) {
                score += letterScrabble.get(key);
            }
        }

        System.out.println("Le score est " + score);
    }
}
