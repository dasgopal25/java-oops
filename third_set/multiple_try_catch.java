package third_set;

public class multiple_try_catch {
    public static void main(String[] args) {
        try{
            int a =10,b=2,c;
        c=a/b;
        System.out.println(c);
        }
        catch( Exception n){
            System.out.println(n);
        }
        try{
      int arr[]= {10,20,30,40,50};
      System.out.println(arr[3]);
        }
        catch( Exception error){
            System.out.println(error);
        }
    }
}
