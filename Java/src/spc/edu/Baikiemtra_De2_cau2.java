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
public class Baikiemtra_De2_cau2 {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh dien tich the tich hinh cau");
        Scanner sc= new Scanner (System.in);
        double bk,S,V;
        System.out.print("Nhap ban kinh:");
        bk = sc.nextDouble();
        S=4*Math.PI*bk*bk;
        System.out.print("dien tich hinh cau la:"+S);
        V=(4*Math.PI*bk*bk*bk)/3;
        System.out.print("the tich hinh cau la:"+V);
    }
}
