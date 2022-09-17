import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max,temp,lcm=0;
        if(a>b){
            max=temp=a;
        }
        else{
            max=temp=b;
        }
        while(a!=0){
            if(max%a==0 && max%b==0){
                lcm=max;
                break;
            }
            max+=temp;
        }
        System.out.print("LCM of two numbers is: "+lcm);
    }
}
