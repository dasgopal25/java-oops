package third_set;

public class nested_catch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception A){
            System.out.println(A);
            try{
                int arr[]= {10,20,30,40};
                System.out.println(arr[2]);
            }
            catch(Exception A1){
                System.out.println(A1);
            }
        }
    }
}
