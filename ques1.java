static Node newNode(int key)
{
Node node = new Node();
node.key = key;
node.left = node.right = null;
return (node);
}
/* Function to find sum
of all the elements*/
static int addBT(Node root)
{
if (root == null)
return 0;
return (root.key + addBT(root.left) +
addBT(root.right));
}