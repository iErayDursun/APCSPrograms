
/**
 * Write a description of class Project4_1 here.
 * 
 * @author Eray Dursun
 * @version 11-2-15
 */
import java.util.*;
public class Project4_1
{
    public static void main(String[]args) {
        int quizQs, key, correct = 0, incorrect = 0;
        double percentage;
        String input = null;
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many questions are in the quiz? ");
        quizQs = scan.nextInt();

        int[] data = new int[quizQs];

        System.out.print("Please enter the key, with answers being separated by spaces: ");
        for(int x=0; x<data.length; x++) {
            key = scan.nextInt();
            data[x] = key;
        }

        int[] student = new int[quizQs];
        while(repeat){
            System.out.print("Please enter the answers to be graded, separated by spaces: ");
            for(int y=0; y<quizQs; y++) {
                student[y] = scan.nextInt();
                if (student[y] == data[y]) {
                    System.out.println("Number "+(y+1)+" is correct.");
                    correct++;
                }
                else {
                    System.out.println("Number "+(y+1)+" is incorrect.");
                    incorrect++;
                }
            }
            
            percentage=((double)correct/(double)(correct+incorrect))*100;
            System.out.println(correct+" questions were answered correctly, ");
            System.out.println(incorrect+" questions were answered incorrectly, ");
            System.out.println(percentage+"% of the questions were answered correctly.");

            System.out.print("Grade another? (y/n) ");
            input = scan.next();

            if (input.equals("y")) {
                repeat = true;
                correct = 0;
                incorrect = 0;
            }
            else { 
                repeat = false;
            }

        }

    }
}
