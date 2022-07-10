import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h = sc.nextInt();
        int l = sc.nextInt();
        System.out.print( (h-(l-2*h))/2);
        System.out.print( (l-2*h)/2);
    }
}
