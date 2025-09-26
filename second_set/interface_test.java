package second_set;

import java.util.Scanner;

interface client{
    public abstract void input();
    public abstract void output();
}

class developer implements client
{
     String Name; int sal;
    public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Username:- ");
     Name = sc.nextLine();
    System.out.print("Enter your Salary:- ");
     sal = sc.nextInt();
    }
    public void output(){
        System.out.println("Result:- "+Name+ "  "+ sal);
    }
}

public class interface_test {
    public static void main(String[] args) {
        developer ref = new developer();
        ref.input();ref.output();
    }
}
