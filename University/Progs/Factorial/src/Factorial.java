import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int f=1,i=1,n;
        n=sc.nextInt();
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println(f);
    }
}


//5!=5*4*3*2*1