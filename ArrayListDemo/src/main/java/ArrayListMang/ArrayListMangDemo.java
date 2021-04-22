/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListMang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Chi Thuc
 */
public class ArrayListMangDemo {
    static ArrayList<Integer> dayso = new ArrayList<Integer>();
    
    public static void main(String[] arg){
        nhapDs();
        inDaySo();
        System.out.println("phan tu nho nhat trong day:" +timMin());
        sapDaySo();
        xoaPhanTu();
    }

    public static void nhapDs() {
        Scanner s = new Scanner(System.in);
        int i, dem = 0;
        while(dem<10){
            System.out.print("i=");
            i= s.nextInt();
            if(dayso.contains(i))
                System.out.print("phần tử đã có");
            else{
                dayso.add(i);
                dem++;
        }
    }
    }

    public static void inDaySo() {
        Iterator<Integer> myIt = dayso.iterator();
        while(myIt.hasNext()){
            System.out.println(myIt.next()+", ");
        }
    }

    public static int timMin() {
        int min =Collections.min(dayso);
        System.out.println("Phan tu: "+min);
        return min;
        
    }

    public static void sapDaySo() {
        Collections.sort(dayso);
        System.out.println("ds sau khi sap la:");
        inDaySo();
    }

    public static void xoaPhanTu() {
        System.out.println("Nhap vi tri:");
        Scanner s= new Scanner(System.in);
        int vitri=s.nextInt();
        if(vitri<0||vitri>dayso.size()){
            System.out.println("chi so khong dung");
        }
        else{
            dayso.remove(vitri);
            System.out.println("Danh sach sau xoa:");
            System.out.println(dayso);
        }
    }
    
}
