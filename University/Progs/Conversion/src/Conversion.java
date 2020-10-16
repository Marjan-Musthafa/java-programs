import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f,c;
        f= sc.nextFloat();
        c=(f-32)*(5/9);
        System.out.println(c);

    }
}

//9/5*c + 32 =(f-32)*5/9