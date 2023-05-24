public class StringComparator {
    public static boolean compareStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        // Porovnání délky řetězců
        if (str1.length() != str2.length()) {
            return false;
        }

        // Porovnání jednotlivých znaků řetězců
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}