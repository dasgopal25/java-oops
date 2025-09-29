package third_set;
class NumberFormat {
    public static void main(String[] args) {
        String str = "Gopal";
        try{
          int a = Integer.parseInt(str);
          System.out.println(a);
        }
        catch(NumberFormatException n){
          System.out.println("catch the Exception");
        }
    }
}
