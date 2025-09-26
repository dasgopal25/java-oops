package second_set;
interface A 
{
    static void show(){
        System.out.println("Static methods in interface 1.8 JDK update");
    }
   default void over(){
    show();
   }
}

class B implements A
{
    public void disply(){
        System.out.println("print the interface static method");
        over();
    }
}


public class interface_static {
    public static void main(String[] args) {
        B ref = new B();
        ref.disply();
    }
}
