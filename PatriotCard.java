
/**
 * Demonstrates the use of Comparable interface.
 * @author Mr. G 
 * @version 10/20/2015
 */
public class PatriotCard implements Comparable<PatriotCard>
{
    private String color;
    private int rank;

    /**
     * Constructor for objects of class PatriotCard
     */
    public PatriotCard(String color, int rank)
    {
        this.color = color;
        this.rank = rank;
    }

    /**
     * This method is required by Comparable<PatriotCard>
     * Colors are compared lexigraphically.
     * "Green” comes before "Gold” or "Green is smaller than Gold.”
     * If the colors are the same then lower rank is smaller.
     */
    public int compareTo(PatriotCard otherCard) 
    {
        int stringCompare = this.color.compareTo(otherCard.color);

        if (stringCompare == 0)
            return this.rank - otherCard.rank;
        return stringCompare;
    }

    public String toString()
    {
        return color + " " + rank;
    }
}
