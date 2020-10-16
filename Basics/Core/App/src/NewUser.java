public class NewUser extends UserDetails {
    int hour;
    public void hour(int hour){
        this.hour=hour;
    }@Override
    public void display() {
        super.display();
        System.out.println("Hour :"+hour);
    }
}
