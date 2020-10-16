import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAdvanced {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elemenets");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            arr.add(Integer.parseInt(sc.next()));
        }
        for (int i=0;i<n;i++){
            System.out.println(arr.get(i).intValue());
        }
    }

}
