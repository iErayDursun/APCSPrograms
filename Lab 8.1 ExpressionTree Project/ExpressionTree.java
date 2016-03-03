/**
 * The class creates a binary tree that represents an arithmetic expression
 * of ints with operators +,-,*,/ and %.
 */
public class ExpressionTree
{
    private ExpressionNode root;

    public ExpressionTree(String s)
    {
        root = call build method below

    }

    //-----------------------------------------------------------------
    // Returns an int representing the value of the expression 
    // stored in this tree.
    //-----------------------------------------------------------------
    public int EvaluateTree()
   
    {
        This is where we call getExprValue
    }

    //-----------------------------------------------------------------
    // Helper method for the constructor.
    //-----------------------------------------------------------------
    private ExpressionNode build(String s)
    {
        int index = -1
        //use lastIndexOf
        if lastIndexOf(+) > index
            index = lastIndexOf(+)
        if lastIndexOf(-) > index
            index = lastIndexOf(-)
        if index == -1
            if lastIndexOf(*) > index
                index = lastIndexOf(*)
            ditto for / and %
            
        if index == -1  //(I am at a leaf node)
            create ExpressionNode (stringValue, null,null)
        else
            create ExpressionNode(string[index],build(leftSubstring), build(rightSubstring))
    }

}
