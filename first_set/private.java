class A{
    int a; double b; String c;
    private A(){
        a=10;
        b = 20.00;
        c = "OOPS";
         System.out.println(a+" "+b+" "+c);
    }

     static void show(){
        System.out.println("coder army");
    }
    public static void main(String[] args){
        A r = new A();
        // r.show();
        show();
    }
}

//  class private {

//     public static void main(String[] args){

//     }
// }
