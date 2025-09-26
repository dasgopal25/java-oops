package second_set;

interface A {
    void add();

    default void sub() {
        System.out.println("default function");
    }
}

class B implements A {
    public void add() {
       
        System.out.println("Add method");
    }
    @Override
   public void sub(){
     System.out.println("overriding");
    }
}

public class interface_Default {
    public static void main(String[] args) {
        B ref = new B();
        ref.add();
        ref.sub();
    }
}
