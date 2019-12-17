/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InOrder {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<Integer>();
        if(root==null){
            return list;
            // dfs(root,list);
            // return list;
            // inorderTraversal(root.left);
            // System.out.println(root.val);
            // list.add(root.val);
            // inorderTraversal(root.right);
           
        }
        inorderTraversal(root.left);
            System.out.println(root.val);
            list.add(root.val);
            return inorderTraversal(root.right);
       
        // return list;
    }
    public void dfs(TreeNode node, List<Integer> list){
        if(node !=null){
            dfs(node.left,list);
            list.add(node.val);
            dfs(node.right,list);
        }
       
    }
}