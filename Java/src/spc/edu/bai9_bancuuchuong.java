/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai9_bancuuchuong {
    public static void main(String[] args) {
         System.out.println("chuong trinh bang cuu chuong");
        Scanner sc = new Scanner (System.in);
        int a;
      System.out.print ("nhap a ");
        a = sc.nextInt();
        for(int i= 1;i <= 10;i++){
            System.out.print (a+"x" +i+ "=" +i*a);
        }
        
        
    }
}
