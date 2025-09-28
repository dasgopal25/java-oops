package second_set;
class A 
{
    void add( int ... a){
        int sum = 0;
        for (int i : a) { //foreach loop
            sum+=i;
        }
        System.out.println("Sum of numbers: "+sum);
        
    }
}
public class var_agrs {
    public static void main(String[] args) {
        A ref = new A();
        ref.add(); 
        ref.add(10); 
        ref.add(10,20); 
        ref.add(10,20,30); 
        ref.add(10,20,30,40); 
    }
}
