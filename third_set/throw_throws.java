package third_set;
class text{
    void div(float a,float b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
}
public class throw_throws {
    public static void main(String[] args) {
        text ref = new text();
        try{
            ref.div(10f, 3f);
        }
        catch(Exception A){
            System.out.println(A+" ...okay b = 0");
        }
       
    }
}
