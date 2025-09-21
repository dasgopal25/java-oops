class this_keyword { 
    // int a;
    this_keyword()
    {
        // System.out.println("Default constructor");
        this(10);
    }
    this_keyword(int a){
        // this.a = a;
        // this();
        System.out.println(a);
    }

    // void show(){
    //     System.out.println(a);
    // }
    public static void main(String[] args) {
        this_keyword r = new this_keyword();
        // System.out.println(r);
        // r.show();

    }
}
