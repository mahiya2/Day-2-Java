import java.util.*;
public class Ifelseand{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0)
        {
            System.out.println("the given number is even");
        }
       else
        System.out.println("the given number is odd");
    }
}