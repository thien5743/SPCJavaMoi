/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Bai18_ArayList1 {

    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList ds = new ArrayList();
        System.out.println("hien thi ArrayList");
        for (int i = 1; i < 10; i++) {
            ds.add(i);
        }
        ds.add("thien");
        ds.remove(6);
        ds.removeLast();
        System.out.print("hien thi ArrayList bf: ");
        for (int i = 0; 1 < ds.size(); i++) {
            System.out.print(ds.get(i) + " ");
        }
    }
}
