package third_set;

 class Exception1 {
    public static void main(String[] args) {
        System.out.println("project Started");
        int a =10, b= 0,c;
        try{
            c=a/b;
            System.out.println("result:- "+c);
        }
        catch(Exception error){
            System.out.println(error);
        }

        System.out.println("project Ended");
    }

}
