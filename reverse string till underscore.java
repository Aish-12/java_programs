import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.indexOf("_");
		if(n==-1){
		    System.out.println(new StringBuffer(s).reverse().toString());
		}
		else if(n==0){
		    System.out.println(s);
		}
		else{
		    if(n==s.length()-1){
		        String[] s2 = s.split("_");
		        System.out.println(new StringBuffer(s2[0]).reverse().toString()+"_");
		    }
		    else{
		        String[] s2 = s.split("_");
		        System.out.println(new StringBuffer(s2[0]).reverse().toString()+"_"+s2[1]);
		    }
		}
	}
}
