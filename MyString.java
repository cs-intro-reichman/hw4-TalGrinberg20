

public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println(lowerCase("i love infi and intro").equals("i love infi and intro"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        // System.out.println("Testing contains:");
        // System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true
        System.out.println(MyString.contains("baba yaga", "baba"));
        System.out.println(MyString.contains("baba yaga", ""));
        System.out.println(!MyString.contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(!MyString.contains("baba yaga", "Yaga"));
        System.out.println(!MyString.contains("baba yaga", "babayaga"));
        // char [] a = "Yaga".toCharArray();
        // char [] b = "yaga".toCharArray();
        // System.out.println(ArrCharOps.equals(a,b));
    
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */

    // public static boolean contain(String str1, String str2) {
    //     if (str1.length() < str2.length()) {
    //         return false;
    //     }
    //     char[] str1Arr = str1.toCharArray();
    //     char[] str2Arr = str2.toCharArray();
    //     for (int i = 0; i <= str1.length() - str2.length(); i++) {
    //       char [] subArray = ArrCharOps.subArray(str1Arr, i, str2.length());
    //       if (Arrays.equals(subArray, str2Arr)) {
    //           return true;
    //       }
  
    //     }

    //     return false;
    // }

    public static boolean contains(String str1, String str2) {
        // if (str1.length() < str2.length()) {
        //     return false;
        // }
        if (str2 == "" || str1 == "") {
            return true;
        }
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        
        int indexArr2 = 0;
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            indexArr2 = 0; 
            while(str1Arr[i] == str2Arr[indexArr2] && indexArr2 != str2.length()-1)
            {
                i++;
                indexArr2++;
                
            }
            if(indexArr2 == str2.length()-1)
            {return true;}
            if(indexArr2 == str2.length()-1)
            { return false; }
        }
        return false;
    }
}
