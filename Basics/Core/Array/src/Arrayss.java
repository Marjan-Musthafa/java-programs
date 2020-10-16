import java.util.Scanner;
public class Arrayss {
    public static void main(String[] args){
        int n;
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] score=new int[n];
        for(int i=0;i<score.length;i++)
        {
            score[i]=sc.nextInt();
        }
        for(int i=0;i<score.length;i++)
        {
            System.out.println(score[i]);
        }
        int max=score[0],sum=0;
        for(int i=1;i<score.length;i++){
            if(max<score[i]){
                max=score[i];
            }
        }
        System.out.println("Max is "+max);
        for(int i=0;i<score.length;i++){
            sum=sum+score[i];
        }
        System.out.println("Sum is "+sum);

    }
}
