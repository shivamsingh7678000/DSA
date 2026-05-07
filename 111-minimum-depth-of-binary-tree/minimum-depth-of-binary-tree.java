class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int res = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null)
                    return res;

                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            res++;
        }
        return res;
    }
}