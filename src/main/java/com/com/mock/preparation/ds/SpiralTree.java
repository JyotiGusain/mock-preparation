package com.mock.preparation.ds;

import java.util.Objects;
/*
Java code which will construct binary tree, and will print tree in spiral way or zig zag order
Java method printInOrder will print binary tree node in tree inorder .. i..e root, left, right
Tree is will be like below
          10
     15        20
 25     30  35    40
 */
public class SpiralTree {

    public static void main(String[] args) {
        Tree node = buildTree();
       final Tree orginalNode = node;
        int height = height(node);
        boolean order = false; //print left to right

        System.out.println("Print tree as spiral from left--> right and then right --> left at each level");
        for(int i=1; i<= height; i++){
            printAtLevel(node, i, order);
            if(order == true){
                order = false;
                //node = node.right;
            }
            else{
                order = true;
               // node = node.left;
            }

            System.out.println(" ");
        }

        System.out.println("Print in order");
        printInOrder(orginalNode);

    }

    private static Tree buildTree() {
        Tree node = new Tree(10);
        Tree firstLeft = new Tree(15); node.left = firstLeft;
        Tree firstRight = new Tree(20); node.right = firstRight;

        Tree secondLeftLeft = new Tree(25); firstLeft.left = secondLeftLeft;
        Tree secondLeftRight = new Tree(30); firstLeft.right = secondLeftRight;

        Tree secondRightLeft = new Tree(35); firstRight.left = secondRightLeft;
        Tree secondRightRight = new Tree(40); firstRight.right = secondRightRight;
        return node;
    }

    private static int height(Tree node){
        if(Objects.isNull(node)){
            return 0;
        }
        int lHeight = height(node.left);
        int rHeight  = height(node.right);
        return (lHeight>rHeight) ? lHeight+1 : rHeight+1;
    }

    private static void printAtLevel(Tree node, int level, boolean order){
        if(Objects.isNull(node)){
            return;
        }
        if(1 == level){
            System.out.print(node.data);
            System.out.print(" ");
        }
        else if(level > 1){
            if(order == true){
                printAtLevel(node.left, level-1, order);
                printAtLevel(node.right, level-1, order);
            }else {
                printAtLevel(node.right, level-1, order);
                printAtLevel(node.left, level-1, order);
            }
        }
    }

    private static void printInOrder(Tree node){
        if(Objects.isNull(node)){
            return;
        }
        System.out.print(node.data);
        System.out.print(" ");
        printInOrder(node.left);
        printInOrder(node.right);
    }
}


class Tree
{
    protected Tree left;
    protected Tree right;
    protected int data;

    Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
