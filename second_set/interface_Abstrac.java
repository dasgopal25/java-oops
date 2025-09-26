package second_set;
interface client 
{
    void webDesign();
    void webTech();
} 
abstract class Bishnu implements client
{ 
   @Override
    public void webDesign(){
        System.out.println("BGC:-Green,Sytle:-simple Design,Button Hover");
    }
}
class Gopal extends Bishnu{
  @Override
   public void webTech(){
     System.out.println("HTML,CSS,JAVASCRIPT");
   }
}
public class interface_Abstrac {
    public static void main(String[] args) {
        Gopal ref = new Gopal();
    ref.webDesign();
    ref.webTech();
    }

}
