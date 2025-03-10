// Example to polymorphism
//Method Over loading and Over riding

class calculate{

    int add(int a, int b,int c){
        return a+b+c;
    }
    int add(int a, int b){
        return a+b;
    }
    boolean divide(int a, int b){
        System.out.println("This is calculate class "+ a/b);
        return false;
    }

}

class subtract extends calculate{
    double sub(int a, int b,int c){
        return a-b-c;
    }
    double sub(int a, int b){
        return a-b;
    }
    boolean divide(int a, int b){
        System.out.println("This is subtract class "+ a/b);
        return false;
    }
}

class multiply extends subtract{
    int mul(int a, int b,int c){
        return a*b*c;
    }git
    int mul(int a, int b){
        return a*b;
    }
    boolean divide(int a, int b, int c){
        System.out.println("This is multiply class "+ (a/b)/c);
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

        multiply obj1 = new multiply();
        subtract obj2 = new subtract();
        calculate obj3 = new calculate();

        System.out.println(obj1.add(5,6,7));
        System.out.println(obj1.add(20,65));
        System.out.println(obj1.sub(50,25,10));
        System.out.println(obj1.sub(50,25));
        System.out.println(obj1.mul(6,8,7));
        System.out.println(obj1.mul(12,18));

        System.out.println(obj1.divide(100,5,4));
        System.out.println(obj2.divide(10,5));
        System.out.println(obj3.divide(10,5));

    }
}




