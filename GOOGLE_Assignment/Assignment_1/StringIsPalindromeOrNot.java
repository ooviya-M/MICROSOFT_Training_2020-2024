import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.print(str+ " is a palindrome");
        }
        else{
            System.out.print(str+ " is not a palindrome");
        }
    }
}
