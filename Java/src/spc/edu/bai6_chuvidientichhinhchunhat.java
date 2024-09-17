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
public class bai6_chuvidientichhinhchunhat {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh dien tich chu vi hinhchu nhat");
                        Scanner sc= new Scanner (System.in);

        double chieudai,chieurong,chuvi,dientich;
        System.out.print("Nhap chieu dai:");
        chieudai = sc.nextDouble();
         System.out.print("Nhap chieu rong:");
          chieurong = sc.nextDouble();
          chuvi = (chieudai+chieurong)*2;
          dientich = chieudai * chieurong;
          System.out.println("dien tich:"+dientich);
            System.out.println("chu vi:"+chuvi);
          

        
    }
}
