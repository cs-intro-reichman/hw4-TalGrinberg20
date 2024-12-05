public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println(lowerCase("i love infi and intro").equals("i love infi and intro"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */

    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        int str1index = 0 , str2index = 0;
        for (int i = 0; i < str1index; i++) {
            while (str2index <= str2.length()) { 
             if (str1.charAt(str1index) == str2.charAt(str2index)) {
                 
             } else {
             }   
            }
        }






        for (int i = 0; i < str1.length()-str2.length(); i++) {
        while (str2index < str2.length()) {
            if (str2.charAt(str2index) == str1.charAt(str1index)) {
                str2index++;
                str1index++;
            }
            else {
                str2index = 0;
                str1index = i+1;
            }
            

        }            
        }
        return str2index+1 == str2.length();
    }
}
