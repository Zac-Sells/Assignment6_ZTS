/**
 * 
 * @author sells
 * Creates a class used to initiate a depth first search of a binary tree created by the tree class
 * The class also allows uses to find the height of the left branch, the height of the right branch, and to calculate a max height  
 */
public class DepthFirstSearch {       
       Node root;
       public DepthFirstSearch()
       {  
    	   	
                   System.out.println("Call DFS with root node to do a Depth First Search.");
    	   		
       }
 /**
  * Instantiates the variable numNodes used to count the number of nodes traversed through the Depth First Search         
  */
 public static int numNodes = 0;
 /**
  * Instantiates a the method to conduct a depth first search of a binary tree
  * @param node
  */
        public void DFS(Node node)        {
                   System.out.println(node.getData()); 
                   numNodes++;
               if(node.getlChild()!=null && node.getrChild()!=null) {	
            	   DFS(node.getlChild());	
               if(node.getrChild() != null) {
            	 DFS(node.getrChild());
            	 
            	 	}	
               } 
            }
 /**
  * Instantiates variables for left and right height       
  */
        public static int leftHeight = 0;
        public static int rightHeight = 0;
 /**
  * Instantiates a method to calculate the height of the left branch       
  * @param node
  */
        public void leftHeight(Node node){        	       	 
        	while(node.getlChild()!=null) {
            leftHeight++;	
        	node = node.getlChild();
        }
        	System.out.println("Height of Left Branch " + leftHeight);        	
        }
 /**
  * Instantiates a method to calculate the height of the right branch        
  * @param node
  */
        public void rightHeight(Node node){        	       	 
        	while(node.getrChild()!=null) {
            rightHeight++;	
        	node = node.getrChild();
        }
        	System.out.println("Height of Right Branch " + rightHeight);        	
        }
/**
 * Instantiates a method to calculate the max height of the binary tree   
 */
        public void maxHeight() {  
        	int maxHeight = 0;
        	if(leftHeight == rightHeight) {
        		maxHeight = leftHeight + 1;
        	System.out.println("Max height of tree is " + maxHeight);	
        	}
        	if(leftHeight > rightHeight) {
        		maxHeight = leftHeight + 1;
        		System.out.println("Max height of tree is " + maxHeight);
        	}
        	if(leftHeight < rightHeight) {
        		maxHeight = rightHeight + 1;
        		System.out.println("Max height of tree is " + maxHeight);
        	}
    	}
        	
}
