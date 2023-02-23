class Computer{

  public void playmusic(){
System.out.println("Play Some Random Music");
    }

    public String getMePen(int cost){
        if (cost >= 10)
       return "pen";
       else{
        return "Nothing";
       }
    }
}
public class Hello
{
    public static void main(String[] args)
    {
    Computer obj = new Computer();
    obj.playmusic();
   String Str = obj.getMePen(5);
   System.out.println(Str);
    }
}
