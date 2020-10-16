import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFinder {
    public static void main(String[] args){
        System.out.println("Enter the date,month,year");
        Scanner sc=new Scanner(System.in);
        int dd=sc.nextInt();
        int mm=sc.nextInt()-1;
        int yy=sc.nextInt();

        Date date =(new GregorianCalendar(yy,mm,dd)).getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        String day= sdf.format(date);
        System.out.println(day);
    }
}
