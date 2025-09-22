class Demo
{
    int a = 21;
    String name = "Gopal";

    void Show(){
        System.out.println(a+" "+name);
    }
}
class Text
{
    public static void main(String[] args){
        Demo r = new Demo();
        r.Show();
    }
}