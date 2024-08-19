public class Basic {
    public static void Hello(){
        System.out.println("HelloWord");
    }
    public static void main(String arg[]){
        Hello();

    }
}

public static int multiply(int a, int b){
    int product = a*b;
    return product;
}
public static void main(String arg[]){
    int a= 5;
    int b= 2;
    int prod = multiply(a,b);
    System.out.println("a*b :"+prod);
}
