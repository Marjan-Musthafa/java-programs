import java.util.Scanner;

public class Compare {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a + "is greater");
        }
        else if(b>a){
            System.out.println(b+"is  greater");
        }
        else{
            System.out.println("Equal");
        }
    }
}
