package second_set;
class A 
{
    A show(){
        System.out.println("java oops");
        return this; //this => new A();
    }
}
class B extends A 
{
    @Override
    B show(){
        super.show();
        System.out.println("class B");
        return this;
    }
}
public class co_varient {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
