package com.examples.tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children ;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();;
    }


    public void  addNode(TreeNode node){
        this.children.add(node);
    }

    public String printTree( int level) {
        String ret;
        ret = " ".repeat(level) + data + "\n";
        for (TreeNode node : children) {
            ret += node.printTree(level + 1);
        }
        return ret;

    }

}
