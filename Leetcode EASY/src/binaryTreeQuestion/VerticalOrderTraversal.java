package binaryTreeQuestion;

import java.util.*;

//Problem Statement :
//
//Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
//
//For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
//
//The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their dataues.
//
//Return the vertical order traversal of the binary tree.
//
//Example 1:
//
//Input: root = [3,9,20,null,null,15,7]
//Output: [[9],[3,15],[20],[7]]

class Vertex{
    int level;
    int ver;
    TreeNode tree;

    public Vertex(int level, int ver, TreeNode tree){
        this.level = level;
        this.ver = ver;
        this.tree = tree;
    }
}

public class VerticalOrderTraversal {
	public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        if(root == null) return al;

        HashMap<Integer,List<Vertex>> h = new HashMap<>();
        Queue<Vertex> q = new LinkedList<>();
        int level = 0;

        q.add(new Vertex(level,0,root));
        q.add(null);

        int min = 0;
        int max = 0;

        while(!q.isEmpty()){
            Vertex v = q.remove();
            
            if(v==null){
                level++;
                if(!q.isEmpty()) q.add(null);
                continue;
            }

            if(!h.containsKey(v.ver)){
                ArrayList<Vertex> al1 = new ArrayList<Vertex>();
                al1.add(v);
                h.put(v.ver,al1);
            }
            else{
                int x = 0;
                while(x!=h.get(v.ver).size()){
                    if(h.get(v.ver).get(x).level == v.level && h.get(v.ver).get(x).tree.data>v.tree.data){
                        break;
                    }
                    x++;
                }
                h.get(v.ver).add(x,v);
            }

            if(v.ver>max){
                max = v.ver;
            }
            if(v.ver<min){
                min = v.ver;
            }

            if(v.tree.left!=null){
                q.add(new Vertex(level,v.ver-1,v.tree.left));
            }
            if(v.tree.right!=null){
                q.add(new Vertex(level,v.ver+1,v.tree.right));
            }
        }

        for(int i=min;i<=max;i++){
            if(h.containsKey(i)){
                ArrayList<Integer> a = new ArrayList<>();
                for(Vertex b : h.get(i)){
                    a.add(b.tree.data);
                }
                al.add(a);
            }
        }

        return al;

    }
}
