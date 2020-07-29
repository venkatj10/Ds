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
public class StackandQueueImpl {
    
    
    public static void main(String[] args){
      //  implementStack();
      //  implementQueue(); 
      
    }
    
    public static void implementStack(){
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

       while(stack.size()>0){
         System.out.println("poping stack"+stack.pop());
       }
        
       // System.out.println("peek"+stack.peek());
        System.out.println("is stack empty? "+stack.isEmpty());
       
    }
    
    
    public static void implementQueue(){
        Queue queue=new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
 
       System.out.println("queue removing"+queue.removeUsingtutorial());
       System.out.println("queue removing"+queue.removeUsingtutorial());
         System.out.println("queue removing"+queue.removeUsingtutorial());
      System.out.println("queue removing"+queue.removeUsingtutorial());
        System.out.println("queue removed");
        
    }
    
    
    

    
    
    
    
    
}
