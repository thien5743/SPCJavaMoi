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
public class bai10_TinhThue {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh thue");
        Scanner sc= new Scanner (System.in);
        double luong,thuong,thunhap;
        System.out.print("Nhap luong:");
        luong = sc.nextDouble();
         System.out.print("Nhap thuong:");
         thuong = sc.nextDouble();
       thunhap = luong+thuong;
       
        if(thunhap < 9000000){
            System.out.print("thu nhap:"+thunhap+ "trieu");
           
        }
        else if (thunhap<=15000000){
        System.out.print("thu nhap:"+thunhap*0.1+ "trieu");
        }
        else if (thunhap<=30000000){
            System.out.print("thu nhap:"+thunhap*0.15+ "tireu");
        }
        else {
        System.out.print("thu nhap:"+thunhap*0.2+ "tireu");
        }
        
    }
    
}
