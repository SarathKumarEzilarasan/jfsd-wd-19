package day_4;

public class StringMethods {
    public static void main(String[] args) {
//        String s1 = "hello world"; // 1 GB String Intern Pool
//        String s2 = "hello world"; // 1 GB ????
//        String s3 = new String("hello world");
//
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.replace("l", "z"));
//
//        s1 = "hello earth";
//
//        System.out.println(s1);

        String s = "mam"; // 104 + 101 + 108 + ..... -> 10010
        //          012345678910  --> location or indexes

//        System.out.println(s.charAt(1));
//        System.out.println(s.indexOf("e"));
//        System.out.println(s.length());
//        System.out.println(s.charAt(s.length() - 1));
//        System.out.println(s.startsWith("hel"));
//        System.out.println(s.endsWith("hel"));
//        System.out.println(s.contains("o wo"));
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        System.out.println(s);
//        System.out.println(s.trim());
//        System.out.println(s.substring(0, 6));
//        System.out.println("hello" + "world");
//        System.out.println(s.concat(" from java"));
//        System.out.println(s.compareTo("hello world"));
//
//
//
//        char ch = 'A';
//        int i = ch;
//
//        System.out.println(i);

//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

//        for (int i = s.length() - 1; i >= 0; i--) {
//            System.out.println(s.charAt(i));
//        }

//        System.out.println(isPalindrome(s));
//        System.out.println(_isPalindrome(s));

//        String string = "hello world";
//        string.concat(" from java");
//
//        System.out.println(string);


//        StringBuilder stringBuilder = new StringBuilder("hello world");
//        stringBuilder.append(" from java");
//
//        System.out.println(stringBuilder);

    }

    public static boolean isPalindrome(String original) {
        // reverse
        // compare

//        String reverse = "";
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reverse = reverse + original.charAt(i);
//            //         ""     + d ---> reverse = d
//            //         d      + l ---> reverse = dl
//            //         dl     + r ---> reverse = dlr
//        }

        StringBuilder reverse = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }

        if (original.equals(reverse.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean _isPalindrome(String original) {

        boolean flag = true;
        for (int i = 0; i < original.length() / 2; i++) {
            char left = original.charAt(i);                                 //  0  1 2 3 4
            char right = original.charAt(original.length() - 1 - i);        //  10 9 8 7 6

            if (left != right) {
                flag = false;
                break;
            }
        }

        return flag;
    }


}


// strings are immutable

// String Builder


