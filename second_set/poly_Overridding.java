package second_set;
class A 
{               // error: method does not override or implement a method from a supertype "@Override"
   
    void show(){
        System.out.println("Can't Say shape Type");
    }
}
class B extends A {
  
      @Override
    void show(){
        super.show();
        System.out.println("sub class B");
    }
    
}


class poly_Overridding {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
