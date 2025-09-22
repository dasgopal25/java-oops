class student
 {
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter your name, roll, marks:- ");
    }
 }


class simple_inher extends student {
   void display(){
    name = "Gopal Das";
    roll= 145;
    marks = 1300;
    System.out.println(name+" "+roll+" "+marks);
   }
    public static void main(String[] args) {
        simple_inher r = new simple_inher();
        r.input();
        r.display();
    }
}
