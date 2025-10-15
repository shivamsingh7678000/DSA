/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty())
        {
            int size= Q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode P=Q.remove();
                if(i==size-1){
                    ans.add(P.val);
                }
                if(P.left!=null)
                {
                    Q.offer(P.left);

                }
                if(P.right!=null)
                {
                    Q.offer(P.right);
                }
            }
        }
        return ans;
        
    }
}