import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(n!=0)
        {
            n=sc.nextInt();
            numbers.add(n);
        }
        for (int i=0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}
