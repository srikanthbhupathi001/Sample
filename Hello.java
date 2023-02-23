class Hotel{
    public void rooms(){
System.out.println("Guests can take rest");
    }
    public void car(){
System.out.println("We can go by Car");
    }
}
public class Hello {
    public static void main(String args[]){
        Hotel H = new Hotel();
        H.rooms();
        H.car();
    }
}
