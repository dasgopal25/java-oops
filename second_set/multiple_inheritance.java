package second_set;
interface A
{
    void show();
}
interface B
{
    void show();
}
class multiple_inheritance implements A,B
{
    public void show(){
        System.out.println("interface A & B");
    }
    public static void main(String[] args) {
        multiple_inheritance ref = new multiple_inheritance();
        ref.show();
    }
}
