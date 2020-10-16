public class UserDetails {
    String name;
    int age;
    int salary;
//        this.name=name;
//        System.out.println("User details constructer");


    public void userage(int age){
        this.age=age;

    }
    public void usersalary(int salary){
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
    }
}
