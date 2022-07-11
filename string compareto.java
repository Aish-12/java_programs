import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1 = A.length();
        int l2 = B.length();
        int sum = l1+l2;
        System.out.println(sum);
        System.out.println(A.compareTo(B)>0? "Yes" : "No");
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        
        System.out.print(A+" "+ B);
        
    }
}

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java

Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
