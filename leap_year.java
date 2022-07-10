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
