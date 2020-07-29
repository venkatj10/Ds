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


public class BinarayTree {

    
    public class Node{    
        int key;
        String value;
        Node left,right;
        
        public Node(int key,String value){
        this.key=key;
        this.value=value;            
        }

        
        private Node() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public Node min(){
            if(left==null){
                return this;
            }
            else{
                return left.min();
            }
        }
    }
    
    Node root;
    
    public BinarayTree() {
        root = null;
    }
    
    
    
    public void insert(int key,String value){
          root=insertItem(root,key,value);
    }
    
    
    
    private Node insertItem(Node node,int key,String value){
        
        //if node is null then set the key and value to the node
        
        if(node==null){
            node=new Node(key,value);
        }
        
         //if it is not null then check the node key with the key 
         // if key is lessser than the parent node or root node then move to the left recurse the function until node becomes null
        if(key<node.key){
              node.left=insertItem(node.left, key, value);
        }
        //if key is right then move to the right and recurse the function until node becomes null
        if(key>node.key){
            node.right=insertItem(node.right,key,value);
        }
       // after recursion set the node to the left or right of the parent node
       // reverse all the functions in the stack and finally return the root
        return node;
    }
    
    public String find(int key){ 
        //find the node
        // return the value
       Node node= find(root,key);
       return node==null?null:node.value;
    }
    
    
    private Node find(Node node,int key){
    
        if(node==null||node.key==key){
            return node;
        }
        else if(key < node.key){
            return find(node.left,key);
        }else if(key>node.key){
            return find(node.right,key);
        }
       
        
    return null;    
    }

    
    public int findMin(){
       return findMin(root).key;
    }
    
    public Node findMin(Node node){
        return node.min();
    }
    
    
    //delete 
    //if  no child ,then set the node null
    //if one child then copy the child to the node to be deleted then delete the child
    // if two child then find the min of that node in the branches copy that min node to the 
     //- node to be deleted and then delete that min node so that if the min node again having any 
    // - brances it will delete recurisively
    
    
   public void delete(int key){
      root=delete(root,key);
    }
    
    
   
    
//  private Node find(int key)
    public Node delete(Node node,int key){
        //find the node which we need to delete
        
        if(node==null){
            return null;
        }
        else if(key<node.key){
            node.left=delete(node.left,key);
            
        }else if(key>node.key){
            node.right=delete(node.right,key);
        }
        //node found 
        else{
            
            // case 1
            if(node.left==null && node.right ==null){
                node=null;
            }
            
            //case2 one child
            else if(node.left==null){
                node=node.right;
            }
 
            else if(node.right==null){
                node=node.left;  
            }
            //case 3 tow children
            else{
                Node minRight=findMin(node.right);
                
                //duplicate the minRight to node which we want to delete
                node.key=minRight.key;
                node.value=minRight.value;
                
                //now delete the duplicate node 
              node.right=delete(node.right,node.key);   
            }
      
        }
        
        return node;  
    }
    
    
    public void printInorderTraversal(){
        inOrderTraversal(root);
    }
    
    public void inOrderTraversal(Node node){
        
        if(node!=null){
        inOrderTraversal(node.left);
        System.out.println("root"+node.key);
        inOrderTraversal(node.right);
        }
    }
    
    
    public void printPreorderTraversal(){
        preOrderTraversal(root);
    }
    
    public void preOrderTraversal(Node node){
        
        if(node!=null){
        System.out.println("node="+node.key); 
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        
        } 
    }  
    
    
    
    public void printPostOrderTraversal(){
        postOrderTraversal(root);
    }
    
    
    
    public void postOrderTraversal(Node node){
          if(node!=null){
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println("node="+node.key); 
       }
    }
    
   
    
   
        public void prettyPrint() {
        // Hard coded print out of binary tree depth = 3
        int rootLeftKey = root.left == null ? 0 : root.left.key;
        int rootRightKey = root.right == null ? 0 : root.right.key;

        int rootLeftLeftKey = 0;
        int rootLeftRightKey = 0;

        if (root.left != null) {
            rootLeftLeftKey = root.left.left == null ? 0 : root.left.left.key;
            rootLeftRightKey = root.left.right == null ? 0 : root.left.right.key;
        }

        int rootRightLeftKey = 0;
        int rootRightRightKey = 0;

        if (root.right != null) {
            rootRightLeftKey = root.right.left == null ? 0 : root.right.left.key;
            rootRightRightKey = root.right.right == null ? 0 : root.right.right.key;
        }

        System.out.println("     " + root.key);
        System.out.println("   /  \\");
        System.out.println("  " + rootLeftKey + "    " + rootRightKey);
        System.out.println(" / \\  / \\");
        System.out.println(rootLeftLeftKey + "  " + rootLeftRightKey + " " + rootRightLeftKey + "   " + rootRightRightKey);
    }
        
}