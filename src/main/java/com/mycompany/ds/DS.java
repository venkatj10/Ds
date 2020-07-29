/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ds;

/**
 *
 * @author krish
 */
public class DS {
    
    
  
    
    public static void main(String[] args) {
       DynamicArrays dn=new DynamicArrays(4);
       dn.add(10);
       dn.add(20);
       dn.add(30);
       dn.add(40);
       
       
      // dn.delete(0);
       dn.insert(4, 50);
       dn.set(5,60);  
       System.out.println("5 index value"+dn.get(5));
       System.out.println(dn.contains(50));
       System.out.println(dn.isEmpty());
       dn.delete(5);
       dn.printAll();  
    }
    
    
    
    
    
}
