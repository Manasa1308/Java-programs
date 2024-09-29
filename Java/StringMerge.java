public class StringMerge {
    public static void main(String[] args) {
        String s1 = "SDA102";
        String s2 = "UMN385";
        System.out.println(mergeStrings(s1, s2));
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        while (i < s1.length() || i < s2.length()) {
            if (i < s1.length()) {
                merged.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                merged.append(s2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}