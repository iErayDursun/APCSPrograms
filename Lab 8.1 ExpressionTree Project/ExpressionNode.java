//********************************************************************
//  ExpressionNode.java       Author: Lewis/Loftus/Cocking
//
//  A node in an expression tree. The value in a node is stored
//  as a String. It can either be a string containing an integer,
//  such as "23", or a string containing an operator, such as "+".
//********************************************************************

public class ExpressionNode extends TreeNode
{
   //-----------------------------------------------------------------
   //  Initializes this node. The first param must be a string
   //  that is either an integer or an operator.
   //-----------------------------------------------------------------
   public ExpressionNode (String val, ExpressionNode left, ExpressionNode right)
   {
      super();
   }

   //-----------------------------------------------------------------
   //  Returns the integer value of this node by evaluating the
   //  expression subtree of which this node is the root.
   //-----------------------------------------------------------------
   public int getExprValue()
   {
      String val = (String) getValue();
      
      if (val == "+")
        return leftNode.getExprValue + rightNode.getExprValue;
      else if (val == "-")
        return leftNode.getExprValue - rightNode.getExprValue;
      same for *, /, %
      else  (I must have a number in this node)
       return val;
      
      
   }
}
