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
public class bai5_hoten {
    public static void main(String[] args) {
        System.out.println("QUAN Ly SINH VIEN");
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ho va ten:");
        String hoten = sc.nextLine();
        System.out.print("Nhap namsinh cua ban :");
        int namsinh = sc.nextInt();
        
        System.out.println("Chao ban"+ hoten);
        System.out.println("tuoi cua ban la" +(2024-namsinh));
    }
}
