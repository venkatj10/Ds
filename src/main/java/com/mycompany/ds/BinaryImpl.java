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
public class BinaryImpl {
    static int i=0;
   BinarayTree bst=new BinarayTree();;
    public static void main(String[] args) {

      BinaryImpl impl=new BinaryImpl();
    
      impl.find();
      impl.findMinKey();
     // impl.deleteNoChild();
    //  impl.deleteOneChild();
     // impl.deleteTwoChild(); 
       System.out.println("InOrder traversal");
     impl.printInOrderTraversal();
        System.out.println("preOrder traversal");
     impl.printPreOrderTraversal();
      System.out.println("postOrder traversal");
     impl.printPostOrderTraversal();
    }
    
    
    public void printInOrderTraversal(){
        bst.printInorderTraversal();
    }
    
    
    public void printPreOrderTraversal(){
         bst.printPreorderTraversal();
    }
    
    
    public void printPostOrderTraversal(){
        bst.printPostOrderTraversal();
    }
    
        
    
    
    
    public void insert(){
        
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");
        
    }
    
    
    
    public void find(){
        insert();     
        System.out.println("c"+bst.find(3));
        System.out.println("b"+ bst.find(2));
        System.out.println("d"+ bst.find(4));
        System.out.println("g"+ bst.find(7));
        System.out.println("f"+ bst.find(6));
        System.out.println("h"+ bst.find(8));
        System.out.println("not found"+bst.find(99));
        
        bst.prettyPrint();
    }
    
    
  public void deleteNoChild(){  
    bst=new BinarayTree();
    insert();
    bst.delete(2);
    bst.prettyPrint();
      
  }
    
   public void deleteOneChild(){
     bst=new BinarayTree();
           bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
      //  bst.insert(8, "h");
      bst.delete(7);
      bst.prettyPrint();
   
   } 
   
   
   public void deleteTwoChild(){
        bst=new BinarayTree();
        insert();
       bst.delete(7);
         bst.prettyPrint();
       
   }
    
  public void findMinKey(){
       bst=new BinarayTree();
       insert();
       System.out.println("the minimum key is"+bst.findMin());
      
  }

    
    
  
    private static int checkRecursive(int n) {
        if(n==0){
            return 1;
        }
      
        if(n>0){    
            System.out.println("number of times"+n);
            return checkRecursive(n-1);  //1          //n=0    return 1
                                                   //n=1  
//          return value;
        }
        System.out.println("come out"+i);
        return 0;  
    }
}
