/**
 * The class creates a binary tree that represents an arithmetic expression
 * of ints with operators +,-,*,/ and %.
 */
public class ExpressionTree
{
    private ExpressionNode root;

    public ExpressionTree(String s)
    {
        root = build(s);
    }

    //-----------------------------------------------------------------
    // Returns an int representing the value of the expression 
    // stored in this tree.
    //-----------------------------------------------------------------
    public int EvaluateTree()

    {
        return root.getExprValue();
    }

    //-----------------------------------------------------------------
    // Helper method for the constructor.
    //-----------------------------------------------------------------
    private ExpressionNode build(String s)
    {
        int index = -1;
        String leaf = s;
        if (s.lastIndexOf("+") > index) {
            index = s.lastIndexOf("+");
            leaf = "+";
        }
        if (s.lastIndexOf("-") > index){
            index = s.lastIndexOf("-");
            leaf = "-";
        }
        if (index == -1) {
            if (s.lastIndexOf("*") > index) {
                index = s.lastIndexOf("*");
                leaf = "*";
            }
            if (s.lastIndexOf("/") > index) {
                index = s.lastIndexOf("/");
                leaf = "/";
            }
            if (s.lastIndexOf("%") > index) {
                index = s.lastIndexOf("%");
                leaf = "%";
            }
        }
        if (index == -1)
            return new ExpressionNode(s, null, null);
        else
            return new ExpressionNode(leaf, build(s.substring(0,index)), build(s.substring(index+1,s.length())));
    }

}
