package third_set;

class try_catch_finally1  {
    public static void main(String[] args) {
        try{
            System.out.println("start code");
        int a =10,b=0,c;
        c=a/b;
        System.out.println(c);
        }
        catch(Exception error){
            System.out.println(error);
        }
        finally{
            System.out.println("this is finally block");
        }
        System.out.println("Ended main method");
    }
    
}
