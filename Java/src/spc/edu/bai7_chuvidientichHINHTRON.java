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
public class bai7_chuvidientichHINHTRON {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH DIEN TICH HIENH TRON");
                Scanner sc= new Scanner (System.in);
                double cv,dt,bk,pi=3.14;
                System.out.print("Nhap ban kinh:");
                bk = sc.nextDouble();
                cv=pi*pi*bk;
                dt=2*pi*bk;
                System.out.println("dien tich:"+dt);
                System.out.println("chu vi:"+cv);

    }
}
