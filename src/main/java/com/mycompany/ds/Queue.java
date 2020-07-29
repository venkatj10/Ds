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

//first in first out
public class Queue {
    
      public class Node{
      private  int data;
      private Node next;
        
        public Node(int data){
            this.data=data;  
        }
   }
    
    private Node head;
    private Node tail;
    private int size;
    
    
 public void add(int data){
  
     //create new node
     // check if the tail is null if null then assign the tail to the new node 
     //if tail is not null then add the new node to the next of the tail node
     // now chnage the tail pointer to the new node which we created
     //increase the size of the queue by 1
     
     Node newNode=new Node(data);
     if(tail!=null){
     tail.next=newNode;   
     }
      tail=newNode;
      
      if(head==null){
          head=tail;
      }
      size++;
  }



public int remove(){
    
    //check whether the head is null then setting the tail is null
    //
    
        int data=0;
      // Handle queue now being empty
        if (head == null) {
            tail = null;
        }
   
    data=head.data;
    head=head.next;  
    return data;
    
}

    public int removeUsingtutorial() {
        // Save the data
        // Point the head to the next element (effectively removing it)
        // Then return the data

        int data = head.data;
        head = head.next;

        // Handle queue now being empty
        if (head == null) {
            tail = null;
        }

        System.out.println("head"+head);
        return data;
    }

    
      public int size(){
        return size;
    }
    
    
    
}
