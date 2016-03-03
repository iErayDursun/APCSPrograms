/**
 * Eray Dursun's Runs
 * Project 2.1
 * 9/16/15
 * Finds the length of the longest run of heads in 100 flips of a coin.
 */
public class Project2_1
{
    public static void main (String[] args)
    {
        final int FLIPS = 100; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        Coin coin = new Coin(); // Create a coin object

        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            coin.flip(); // Flip the coin & print the result
            System.out.println(coin);
            if (coin.isHeads()) {
                currentRun++;
                if (currentRun>maxRun) {
                    maxRun=currentRun;
                }
            }
            else {
                currentRun=0;
            }

        }
        System.out.println("Largest run of heads in 100 flips: "+maxRun);
    }
}

