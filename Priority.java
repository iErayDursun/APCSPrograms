
/**
 * Write a description of interface Priority here.
 * 
 * @author Eray Dursun
 * @version 10-22-15
 */
public interface Priority
{
    public static final int MIN_PRIORITY = 1, MED_PRIORITY = 5, MAX_PRIORITY = 10;
    public void setPriority(int level);
    public int getPriority();
}
