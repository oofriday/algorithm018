 HashMap
 JDK1.7中HashMap是以数组加链表的形式组成的,JDK1.8之后新增了红黑树的组成结构，
 当链表大于8并且容量大于64时，链表结构会转换成红黑树结构(红黑树具有快速增删改查的特点,
有效的解决链表过长时操作比较慢的问题)

树
二叉树
前序遍历(Pre-order)：根-左-右
中序遍历(In-order)：左-根-右
后序遍历(Post-order)：左-右-根
二叉搜索树
insert/search/delete O(log n)
