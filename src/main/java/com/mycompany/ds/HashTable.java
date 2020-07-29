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
public class HashTable {
    
    
    private HashEntry[] data;
    private int INITIAL_SIZE=16;
    
    
    private int initialSize;
    public class HashEntry{
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }  
        
    } 
    
    
   public HashTable(){
    data= new HashEntry[INITIAL_SIZE];
   } 


   
   
    
    
    
    
    public void put(String key, String value){
        //get the index for the key
        int index=getIndex(key);
        System.out.println("index"+index);
        //create a new node Entry 
        HashEntry newEntry =new HashEntry(key,value);
       
        //add the entry if the index is free
        if(data[index]==null){
          data[index]=newEntry;  
        }
        // if index is not free handle the collision by moving to the end of the linked list
        else{
           
            System.out.println("collision happend");
            HashEntry entries=data[index];
              while(entries.next!=null){
                  entries=entries.next;
              }
           //add the entry at the end of the list 
             entries.next=newEntry;
        }
          
    }
    
    
    public String get(String key){
        //find the index
        int index=getIndex(key);
        // get the entry in the index 
       HashEntry entries=data[index];       
       //iterate and check if there is match
       //if value match with key return the value 
       while(entries!=null){
           if (entries.key.equals(key)){
               return entries.value;
           }
           entries=entries.next;
       }
        return null;        //return null if there is no match  
    }
    
    
    public int getIndex(String key){
        
        //convert to hashcode
        //reduce to index
        //handle collison using linked list 
        
        
     int hashcode=key.hashCode();
        
     int index= (hashcode & 0x7fffffff)%INITIAL_SIZE;
     
     if(key.equals("john smith")||key.equals("san deose")){
        index=4;
    }
    
     return index;
}

    
    
    
    
    
}
