/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDemo;

import java.util.ArrayList;

/**
 *
 * @author Chi Thuc
 */
public class ArrayListMinhHoa {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();
        ArrayList<Double> list2 = new ArrayList<Double>();
        list1.add(1);
        list1.add(1.5);
        //không cho phép tập hợp chứa phần tử trống
        list1.add("ab");
        Cat c= new Cat("Den");
        list1.add(c);
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
    
}
