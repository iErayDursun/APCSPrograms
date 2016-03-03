
/**
 * Write a description of class TaskRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaskRunner
{
    public static void main (String[]args) {
        Task Task1 = new Task(4,6,"Sleep");
        Task Task2 = new Task(10,6,"Eat");
        Task Task3 = new Task (1,3,"Play");
        
        Task1.setPriority(7);
        Task2.setComplexity(3);
        
        System.out.println(Task1.getPriority());
        System.out.println(Task2.getComplexity());
        
        int compare = Task1.compareTo(Task2);
        
        System.out.println(compare);
        
    }
}
