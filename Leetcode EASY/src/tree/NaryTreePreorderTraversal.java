package tree;

import java.util.*;

//Problem Statement :
//
//Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
//
//Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
//
//Example 1:
//
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,3,5,6,2,4]

public class NaryTreePreorderTraversal {
	public List<Integer> preorder(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null) return al;

        al.add(root.val);

        for(Node x : root.children){
            al.addAll(preorder(x));
        }

        return al;
    }
}
