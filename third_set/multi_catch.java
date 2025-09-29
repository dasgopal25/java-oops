package third_set;

public class multi_catch {
    public static void main(String[] args) {
        try{
            System.out.println("first");
            int a =10,b=2,c;
              c=a/b;
        System.out.println(c);

        System.out.println("second");
        int arr[]={10,20,30,40};
        System.out.println(arr[2]);

        System.out.println("Third");
        String str = "123";
        int a1 = Integer.parseInt(str);
        System.out.println(a1);
        System.out.println("fourth");
        String str1 = null;
        System.out.println(str1.toUpperCase());
        }
        catch(NumberFormatException A){
                System.out.println(A);
        }
        catch(ArrayIndexOutOfBoundsException A){
            System.out.println(A);
        }
        // catch(NullPointerException A){
        //     System.out.println(A);
        // }
        catch(ArithmeticException A){
            System.out.println(A);
        }
        catch(Exception A){
            System.out.println("any Exception");
        }
    }
}
