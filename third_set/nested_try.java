package third_set;

public class nested_try {
    public static void main(String[] args) {
        try{
            try{
                int arr[]= {10,20,30,40};
                System.out.println(arr[2]);
            }
            catch(Exception A){
                System.out.println(A);
            }
            System.out.println(10/2);
        }
        catch(Exception A){
            System.out.println(A);
        }
    }
}
