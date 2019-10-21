package com.lican.test;

class  TreeNode
{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val=val;
    }
    //返回二叉树的深度
    static int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        return left>right?left+1:right+1;
    }

    static void scanNodes(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val); //先序遍历
        scanNodes(root.left);
        //System.out.println(root.val); 中序遍历
        scanNodes(root.right);
        //System.out.println(root.val); 后序遍历
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(1);
        TreeNode left1=new TreeNode(2);
        TreeNode right1=new TreeNode(3);
        TreeNode left2=new TreeNode(4);
        TreeNode right21=new TreeNode(5);
        TreeNode right22=new TreeNode(7);
        TreeNode left31=new TreeNode(6);
        TreeNode left32=new TreeNode(8);
        TreeNode right41=new TreeNode(13);
        TreeNode left41=new TreeNode(9);
        TreeNode left5=new TreeNode(10);
        TreeNode right5=new TreeNode(11);
        TreeNode right6=new TreeNode(12);

        //创建一棵树
        root.left=left1;
        root.right=right1;
        left1.left=left2;
        left1.right=right21;
        right1.right=right22;
        right21.left = left31;
        right22.left=left32;
        left31.right = right41;
        left32.left=left41;
        left41.left=left5;
        left41.right=right5;
        left5.right=right6;
        scanNodes(root);
        System.out.println("树的深度是："+getDepth(root));

    }
}