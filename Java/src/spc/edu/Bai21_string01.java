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
public class Bai21_string01 {
    public static void main(String[] args) {
        System.out.println("string01");
        // Tran To Minh Thien
        Scanner sc= new Scanner (System.in);
       System.out.println("Nhap ho va ten");
       String hovaten = sc.nextLine();
       System.out.println("ho: "+ hovaten.substring(0, 4));
       System.out.println("chu lot: "+ hovaten.substring(5, 12));
       System.out.println("Ten: "+ hovaten.substring(13));
       System.out.println("do dai chuoi la : "+ hovaten.length());
       System.out.println("tach chuoi : "+ hovaten.split(" "));
    }
}
