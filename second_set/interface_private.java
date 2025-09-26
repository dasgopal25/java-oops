package second_set;
interface A 
{
 default void disply(int a,int b){
    res(a,b);
 }
    private void res(int a,int b){
        int sum = a+b;
        System.out.println("private method " +sum);
    }
}
class B implements A
{
  public void show(){
    disply(45, 5);
  }
}
public class interface_private {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
