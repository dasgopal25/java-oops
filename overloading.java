class Student {
    int id;
    String name;

    // Constructor 1: no arguments
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Constructor 2: one argument
    Student(int i) {
        id = i;
        name = "Unknown";
    }

    // Constructor 3: two arguments
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();            // calls Constructor 1
        Student s2 = new Student(101);         // calls Constructor 2
        Student s3 = new Student(102, "Raj");  // calls Constructor 3

        s1.show();
        s2.show();
        s3.show();
    }
}
