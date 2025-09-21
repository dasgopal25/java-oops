class A{
    int a, b, c;
void add(int x, int y){
   a=x;
   b=y;
   c = a+b;
   System.out.println("Sum of two number:- "+c);
}
void sub(int x, int y){
   a=x;
   b=y;
   c = a-b;
   System.out.println("sub of two number:- "+c);
}
}
class B extends A{
    void muliti(int x, int y){
   a=x;
   b=y;
   c = a*b;
   System.out.println("muliti of two number:- "+c);
}
 void div(int x, int y){
   a=x;
   b=y;
   c = a/b;
   System.out.println("division of two number:- "+c);
}

}
class C extends B{
 void remain(int x, int y){
   a=x;
   b=y;
   c = a%b;
   System.out.println("remainder of two number:- "+c);
}
}

class multi_level {
public static void main(String[] args) {
    C r = new C();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Enter two number (SUM):-");
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    r.add(X,Y);
    System.out.println("Enter two number (SUB):-");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    r.sub(x,y);
    System.out.println("Enter two number (multi):-");
    int O = scanner.nextInt();
    int P = scanner.nextInt();
    r.muliti(O,P);
    System.out.println("Enter two number (div):-");
    int o = scanner.nextInt();
    int p = scanner.nextInt();
    r.div(o,p);
    System.out.println("Enter two number (remain):-");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    r.remain(a,b);
}
    
}