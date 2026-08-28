class Calculator{
    void add(){
        System.out.println("this is simple");
    }
    void add(int a){
        System.out.println(a);
    }
    void add(int a, int b){
        System.out.println("int "+(a + b));
    }
    void add(double a , int b){
        System.out.println("double "+(a + b));
    }

    void sub(int a, int b){
        System.out.println(a - b);
    }
    void sub(double a, int b){
        System.out.println(a - b);
    }

    void mul(int a, int b){
        System.out.println(a * b);
    }
    void mul(double a, int b){
        System.out.println(a * b);
    }

    void div(int a, int b){
        System.out.println(a / b);
    }
    void div(double a, int b){
        System.out.println(a / b);
    }
}

public class overload {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.mul(10.0,6);

    }
}
