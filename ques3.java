 public class count {
       int c = 0;
   }
 
   // Function to find 2nd largest element
   void secondLargestUtil(Node node, count C)
   {        
       // Base cases, the second condition is important to
       // avoid unnecessary recursive calls
       if (node == null || C.c >= 2)
           return;
             
       // Follow reverse inorder traversal so that the
       // largest element is visited first
       this.secondLargestUtil(node.right, C); 
         
        // Increment count of visited nodes
       C.c++;
         
       // If c becomes k now, then this is the 2nd largest
       if (C.c == 2) {
           System.out.print("2nd largest element is "+
                                             node.data);
           return;
       }
         
        // Recur for left subtree
       this.secondLargestUtil(node.left, C); 
   }
	
