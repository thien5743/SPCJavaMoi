package spc.edu;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class bai4_pheptinhcoban {
    public static void main(String[] args) {
        System.out.println("chuong trinh phep tinh co ban");
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap a");
           int a =sc.nextInt();
           System.out.println("Nhap b");
          
           int b =sc.nextInt();
           int tong =a+b;
                   
           int hieu =a-b;
           int tich = a*b;
           double thuong = (double)a/b;
           System.out.println(a+"*"+b+"="+tich);
           System.out.println(a+"*"+b+"="+tich(a,b));
           System.out.println(a+"+"+b+"="+tong);
           System.out.println(a+"+"+b+"="+tong(a,b));
           System.out.println(a+"/"+b+"="+thuong);
           System.out.println(a+"/"+b+"="+thuong(a,b));
           System.out.println(a+"-"+b+"="+hieu);
           System.out.println(a+"-"+b+"="+hieu(a,b));
           
    }
    private static int tich(int a,int b)    
    {
        return a*b;
    }
     private static int tong(int a,int b)    
    {
        return a+b;
    }
      private static int hieu(int a,int b)    
    {
        return a-b;
    }
       private static String thuong(int a,int b)    
    {
        if(b==0){
        return "khong hop le";
        }else{
            return Double.toString((double)a/b);
        }
    }
}
