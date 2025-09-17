class A 
{
    int a; String name;
    A()
    {
        a=10;
        name = "Gopal Das";
    }
    void Show()
    {
        System.out.println(a+" "+name);
    }
}

class B
{
    public static void main(String[] args)
    {
        A ref = new A();
        ref.Show();
    }
}