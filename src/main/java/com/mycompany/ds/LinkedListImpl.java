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
public class LinkedListImpl {
    
    public static void main(String[] args) {
        
        LinkedList l= new LinkedList();
        
        l.addFront(20);             
        l.addFront(10);        
        l.addBack(30);
        l.addBack(40);
        System.out.println("first"+l.getFirst());
        System.out.println("lastElement"+l.getLast());
        System.out.println("size of the node"+l.size());
        System.out.println("size fast"+l.sizefast());
        l.print();
        l.delete(10);
        l.delete(30);
        System.out.println("after delete"); 
        l.print();
          l.clear();
          System.out.println("after clear");
          l.print();
    }
    
    
}
