
/**
 * Write a description of class Task here.
 * 
 * @author Eray Dursun
 * @version 10/23/15
 */
public class Task implements Priority, Complexity, Comparable<Task>
{
    private int priority, complexity;
    private String name;

    public Task (int pri, int com, String nme){
        priority = pri;
        complexity = com;
        name = nme;
    }

    public void setPriority(int level)
    {
        if (level >= MIN_PRIORITY && level <= MAX_PRIORITY) {
            priority = level;
        }
    }

    public int getPriority() 
    {
        return priority;
    }

    public int compareTo(Task t) {
        if (this.priority>t.priority)
            return 2;
        else if (this.priority==t.priority)
            return 0;
        else
            return -1;
    }

    public void setComplexity (int complexity) {
        this.complexity = complexity;
    }

    public int getComplexity() {
        return complexity;
    }
}
