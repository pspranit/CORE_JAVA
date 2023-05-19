public class String1 {
    public static void main(String[] args)
    {
//        String str = "Java Exercises!";
//        System.out.println("Original String = " + str);
//        // Get the character at positions 0 and 10.
//        int index1 = str.charAt(0);
//        int index2 = str.charAt(10);
//
//        System.out.println("The character at position 0 is " +
//                (char)index1);
//        System.out.println("The character at position 10 is " +
//                (char)index2);
//    }

//
        String str = "w3resource.com";
        System.out.println("Original String : " + str);

        // codepoint before index 1
        int val1 = str.codePointBefore(1);

        // codepoint before index 9
        int val2 = str.codePointBefore(9);

        // prints character before index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character before index9 in string
        System.out.println("Character(unicode point) = " + val2);
    }
        }


