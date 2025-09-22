class A{
    int a; 
    String cityName;
    A(int age ,String city)
    {
        a=age;
        cityName=city;
        System.out.println(a+" "+cityName);
    }
    A(A ref){
       a= ref.a;
       cityName = ref.cityName;
       System.out.println(a+" "+cityName);
    } 
}



class Parametrized_Copy {
public static void main(String[] args) {
     A r = new A(21,"Dantan");
    A r2 = new A(r);
}
   
}