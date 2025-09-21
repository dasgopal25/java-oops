class A
{
    int a =10;
    void show(){
        System.out.println("Super class"+a);
    }
    A(){
         System.out.println("Super class constructor");
    }
    A(int a){
         System.out.println("Super class constructor" +a);
    }
}
class B extends A
{
    int a =20;
    void show(){
        super.show();//method
        System.out.println("sub class"+a);
        System.out.println("super class"+super.a);//variable
    }
    B(){ //default constructor
         System.out.println("sub class constructor");
    }
    B(int a){ // parameter constructor
        super(200);
         System.out.println("sub class constructor"+a);
    }
}


public class Super_keyword {
    public static void main(String[] args) {
        B r = new B(100);
        r.show();
    }
}
