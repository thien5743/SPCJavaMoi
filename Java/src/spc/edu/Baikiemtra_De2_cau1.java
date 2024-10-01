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
public class Baikiemtra_De2_cau1 {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh day so fibonacci");
        Scanner sc= new Scanner (System.in);
        int so1=0,so2 =1,tong,soluong;
        int sum = 0;
        System.out.println("nhap so luong vao day");
        soluong=sc.nextInt();  
        for (int i = 0; i <= soluong; i++) {
            tong = so1 + so2;
        System.out.print(tong+" ");
        so1 = so2;
        so2 = tong;
       
             
        }
                
    }
}
