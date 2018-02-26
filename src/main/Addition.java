import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
        System.out.println("This is About Adding two numbers");
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("The Sum is "+sum);


    }
    int add(int a,int b){
        return a+b;

    }
    String add(String f,String l){
        return f+l;
    }
    List add(List a,List b){
        List l=new ArrayList();
            l.addAll(a);
            l.addAll(b);
            return l;
    }
    double add(double a,double b){
        return a+b;
    }
}

