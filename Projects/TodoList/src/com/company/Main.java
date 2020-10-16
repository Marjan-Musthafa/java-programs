package com.company;

import java.util.Scanner;

public class Main {

    static TodoFunction o=new TodoFunction();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean e=false;
        while(!e){
            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Print");
            System.out.println("4.Update");
            System.out.println("5.Search");
            System.out.println("6.Exit");
            int c=sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter the item to add");
                    o.add(sc.next());
                    break;
                case 2:
                    System.out.println("Enter the index");
                    o.remove(sc.nextInt()-1);
                    break;
                case 3:
                    o.print();
                    break;
                case 4:
                    System.out.println("Enter the index and element");
                    o.update(sc.nextInt()-1,sc.next());
                    System.out.println("Updated");
                    break;
                case 5:
                    System.out.println("Enter the element");
                    o.search(sc.next());
                    break;
                case 6:
                    e=true;
                    break;
                default:
                    System.out.println("invalid");


            }

        }

    }
}
