/**
 * Definition for a binary tree node.
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
class InOrder {
    //Instance variable for global
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<Integer>();
        // this.dfs(root,list);
        // return list;

        if(root==null){
            //Doesnt matter what is returned here because we are not
            //keeping track of the return value for the function call
            return new ArrayList<Integer>();
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        list.add(root.val);
        inorderTraversal(root.right);
        //returns all the traversed nodes for each recursive call stack
        return list;
    }
    //Helper method to append each node to list Inorder
    // public void dfs(TreeNode node, List<Integer> list){
    //     if(node !=null){
    //         dfs(node.left,list);
    //         list.add(node.val);
    //         dfs(node.right,list);
    //     }
       
    // }
}