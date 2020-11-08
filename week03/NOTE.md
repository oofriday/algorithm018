学习笔记
## 最优方法小结

```
1.两数之和
    哈希表：
    时间复杂度：O(n)
    空间复杂度：O(n)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if(nums.length < 2){
                return new int[0];
            }
           Map<Integer,Integer> map = new HashMap();
           for(int i = 0; i < nums.length; i++){
               int substract = target - nums[i];
               if(map.containsKey(substract)){
                   return new int[]{map.get(substract), i};
               }
               map.put(nums[i], i);
          }
          return new int[0];
       }
   }
```

```
2.加一
    数组遍历：
    时间复杂度：O(n)
    空间复杂度：O(n)
     class Solution {
        public int[] plusOne(int[] digits) {
          for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
        }
    }
    --------------------------
    OR
    --------------------------
    public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
    }
```

```
3.二叉树的中序遍历
    方法1：栈
     时间复杂度：O(n)
     空间复杂度：O(n)
     class Solution {
          public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> deque = new Stack<>();
            while (root != null || !deque.isEmpty()) {
                while (root != null) {
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop();
                result.add(root.val);
                root = root.right;
            }
            return result;
        }
    }
    方法2：递归
     时间复杂度：O(n)
     空间复杂度：O(n)
     class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorder(root, result);
            return result;
        }
        public void inorder(TreeNode root, List<Integer> result) {
            if (root != null) {
                inorder(root.left, result);
                result.add(root.val);
                inorder(root.right, result);
            }
        }
}
```
```
4、剑指offer05：替换空格
    方法1：遍历替换
     时间复杂度：O(n)
     空间复杂度：O(n)
     class Solution {
         public String replaceSpace(String s) {
            StringBuilder sb = new StringBuilder();
            for (Character c : s.toCharArray()) {
                if (c != ' '){
                    sb.append(c);
                }else {
                    sb.append("%20");
                }
            }
            return sb.toString();
        }
    }
   方法2：字符数组
    时间复杂度：O(n)
    空间复杂度：O(n)
    class Solution {
    public String replaceSpace(String s) {
        char[] temp = new char[s.length() * 3];
        int size = 0;
        for (Character c : s.toCharArray()) {
            if (c != ' ') {
                temp[size++] = c;
            } else {
                temp[size++] = '%';
                temp[size++] = '2';
                temp[size++] = '0';
            }
        }
        return new String(temp, 0, size);
    }
}
```
```
5.剑指 Offer 06. 从尾到头打印链表
    方法1：栈
     时间复杂度：O(n)
     空间复杂度：O(n)
     class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<ListNode> stack = new Stack<>();
            while (head != null) {
                stack.push(head);
                head = head.next;
            }
            int size = stack.size();
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = stack.pop().val;
            }
            return result;
        }
    }
   方法2：
     时间复杂度：O(n)
     空间复杂度：O(1)
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            temp = head;
            int[] result = new int[count];
            while (temp != null) {
                result[count - 1] = temp.val;
                count--;
                temp = temp.next;
            }
            return result;
        }
    }
```