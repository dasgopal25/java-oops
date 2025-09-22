package second_set;



class polymorphism {
 int add(){
    int a = 10; int b = 45; int c;
     c= a+b;
     return c;
 }    

 int add(int x, int y){
     int c;
     c= x+y;
     return c;
 }    

 float add(int o, float p){
     float c;
     c= o+p;
     return c;
 } 
 
 public static void main(String[] args) {
    polymorphism ref = new polymorphism();
    System.out.println(ref.add());
    System.out.println(ref.add(20,50));
    System.out.println(ref.add(41,7.4f));
 }
 
}
 
