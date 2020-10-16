import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        char grade;
        Scanner sc=new Scanner(System.in);
        grade=sc.next().charAt(0)
        switch (grade){
            case 'A':
                System.out.println("Amazing");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Not Bad");
                break;
                default:
                    System.out.println("go and shit");
        }
    }
}
