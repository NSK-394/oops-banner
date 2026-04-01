public class BannerAppUC6 {

    // Method for O
    public static String[] getO() {
        return new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method for P
    public static String[] getP() {
        return new String[] {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Method for S
    public static String[] getS() {
        return new String[] {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Print line by line
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}