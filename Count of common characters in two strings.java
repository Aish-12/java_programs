import java.util.*;
public class Hello {
    private static void printCommonchar(String firstString,String secondString){
        char[] firstcharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();
        Set<Character> firstStringSet = new TreeSet<>();
        Set<Character> secondStringSet = new TreeSet<>();
        for(char c : firstcharArray){
            firstStringSet.add(c);
        }
        for(char c: secondCharArray){
            secondStringSet.add(c);
        }
        firstStringSet.retainAll(secondStringSet);
        System.out.print(firstStringSet);
        System.out.print(firstStringSet.size());
        }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		printCommonchar(firstString,secondString);
		
	}
}
