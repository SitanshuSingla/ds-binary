class Node 
{
   int data;
   Node left, right;
  
   public Node(int item) 
   {
       data = item;
       left = right = null;
   }
}

int getLeafCount(Node node) 
   {
       if (node == null)
           return 0;
       if (node.left == null && node.right == null)
           return 1;
       else
           return getLeafCount(node.left) + getLeafCount(node.right);
    }