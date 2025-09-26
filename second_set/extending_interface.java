package second_set;

interface Gill
{
  void add();
}
interface Suman extends Gill
{
    void sub();
}
class Gopal implements Suman
{
    @Override
    public void add(){
        int a = 10, b= 20 , c;
        c = a+b;
        System.out.println("Add:- "+c);
    }
    @Override
    public void sub(){
        int a = 100, b= 20 , c;
        c = a-b;
        System.out.println("sub:- "+c);
    }
}
public class extending_interface {
    public static void main(String[] args) {
        Gill ref = new Gopal();
        Suman ref1 = new Gopal();
         ref.add();
         ref1.sub();
         ref1.add();
    }
}
