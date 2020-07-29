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
public class hashTableImpl {
    
    
    public static void main(String[] args) {
        
        
        HashTable hashTable =new HashTable();
        
        hashTable.put("venkat krishna", "10");
        hashTable.put("vishnu", "20");
        hashTable.put("vasanth", "30");
        hashTable.put("vijay", "40");
        
         System.out.println("value"+hashTable.get("venkat krishna"));
         System.out.println("value"+hashTable.get("vishnu"));
         System.out.println("value"+hashTable.get("vasanth"));
         System.out.println("value"+hashTable.get("vijay"));
         System.out.println("value"+hashTable.get("ajith"));
           
        handleCollision(hashTable);
    }
    
    
    
    public static void handleCollision( HashTable hashTable){  
        hashTable.put("john smith", "50");
        hashTable.put("san deose", "60");
        System.out.println("john smith"+hashTable.get("john smith"));
        System.out.println("san deose"+hashTable.get("san deose"));
    }
    
   
    
    
    
    
}