/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var rangeSumBST = function(root,L,R) {
    let sum =0;
    let leftSum = 0;
    let rightSum = 0;
    if(root == null){
        return 0;
    } else {
    
//         leftSum = rangeSumBST(root.left,L,R)
//         rightSum = rangeSumBST(root.right,L,R)
        
//         if(root.val >= L && root.val <=R){
//             sum = root.val + leftSum + rightSum
//         }
        // sum += (((root.val >= L && root.val <= R) ? root.val : 0) + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R));
        
        root.val = (root.val >= L && root.val <= R) ? root.val : 0
        sum = root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R)
        return sum;
    }
};
