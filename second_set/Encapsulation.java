package second_set;

class A
{
    private int value; //data hiding
    public void setvalue(int x){ //data abstraction
        value = x;
    }
    public int getvalue(){
        return value;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        A ref = new A();
        ref.setvalue(206);
        System.out.println(ref.getvalue());
    }
}
