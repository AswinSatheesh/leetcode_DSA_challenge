public class BinaryToBst{

    public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
        return null;
    }
    return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
    int[] nums = { -10, -3, 0, 5, 9 };
    BinaryToBst solution = new BinaryToBst();
    TreeNode root = solution.sortedArrayToBST(nums);
    // do something with the root node of the BST
    System.out.println(root);

}
}