import java.util.*;

public class BannerAppUC7 {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store patterns in a Map
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[] {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[] {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}