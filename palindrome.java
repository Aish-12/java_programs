import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
               if(A.equals( new StringBuffer(A).reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}



int count = 0;
for(int i=0; i<A.length()/2;i++)
    if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
System.out.println( (count == A.length()/2) ? "Yes" : "No") ;


Sample Input
madam

Sample Output
Yes
