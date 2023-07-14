package com.driver;
import java.util.*;
public class Main {



    public  static class Product{

        public int product(int x, int y) {

            return x+y;
        }
       public int product(int x, int y, int z) {

            return x+y+z;
        }
        public double product(double x, double y) {
            return x+y;
        }
    }

    
   

  
    public static void main(String[] args) {
             Product p=new Product();
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
       int a= p.product(x,y);
       int b=p.product(x,y,z);
       double n=sc.nextDouble();
       double m=sc.nextDouble();
       double c=p.product(n,m);
    }
}