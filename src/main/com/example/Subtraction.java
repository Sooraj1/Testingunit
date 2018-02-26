package com.example;
import java.util.List;

public class Subtraction {
    public static void main(String[] args) {

    }
   public int sub(int a,int b)throws IllegalArgumentException{
        if(a<b) {
            throw new IllegalArgumentException();
        }
        return a-b;

    }
   public String sub(String f,String l){
        return f.replace(l,"");
    }
    public List sub(List a, List b){
        a.removeAll(b);
        return a;
    }
    public double sub(double a,double b){
        return a-b;
    }

    public void display(int va){
        System.out.println("Subtracted value "+va);
    }

}
