import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
    int year = sc.nextInt();
    if((year %400==0) || ((year %100!=0 ) && (year %4==0))){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
	    
	    

	    
// public class LeapYear {
//     public static void main(String[] args) {
//         int year = 1998;
//         if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
//             System.out.println(year + " is a leap year.");
//         }else{
//             System.out.println(year + " is not a leap year.");
//         }
//     }
// }

