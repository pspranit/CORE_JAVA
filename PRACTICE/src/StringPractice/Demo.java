package StringPractice;
;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//
        String str = "sahanee";
        int count = 0;
       // String newStr = "";

        char[] arr = str.toCharArray();

        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//}
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Please enter a string: ");
//                String str = sc.nextLine();
//                int count, duplicateCount = 0;
//                char[] strArr = str.toCharArray();
//                System.out.println("Count of the Duplicate characters in string: ");
//                for (int i = 0; i < strArr.length; i++) {
//                    count = 1;
//                    for (int j = i + 1; j < strArr.length; j++) {
//                        if (strArr[i] == strArr[j] && strArr[i] != ' ') {
//                            count++;
//                            strArr[j] = '0';
//                        }
//                    }
//                    if (count > 1 && strArr[i] != '0')
//                        duplicateCount++;
//                }
//                System.out.println("Total duplicate Character = " + duplicateCount);
//            }
//        }