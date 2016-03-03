//Listing 10.7
//********************************************************************
//  HeapOfCharacters.java       Author: Lewis/Loftus/Cocking
//
//  Implements a heap of characters.
//********************************************************************

import java.util.ArrayList;

public class HeapOfCharacters
{
    private ArrayList<Character> heap;

    //-----------------------------------------------------------------
    //  Sets up an empty heap.
    //-----------------------------------------------------------------
    public HeapOfCharacters ()
    {
        heap = new ArrayList<Character>();
        heap.add(null); // add a "dummy" element in position 0
    }

    //-----------------------------------------------------------------
    //  Returns a string representing this heap.
    //-----------------------------------------------------------------
    public String toString ()
    {
        return heap.toString();
    }

    //-----------------------------------------------------------------
    //  Adds an element to the heap.
    //-----------------------------------------------------------------
    public void add (Character ch)
    {
        heap.add(ch);
        bubbleUp();
    }

    public Character removeRoot ()
    {
        //remove last character
        if (????) // only the root was left (plus "dummy" null)
        {
            return "last character"
        }
        else
        {
            // Replace root with last element, then bubble down

            return old root;
        }
    }

    //-----------------------------------------------------------------
    //  Bubbles the last element up as necessary to preserve
    //  the ordering of the heap.
    //-----------------------------------------------------------------
    private void bubbleUp ()
    {
        int curIndex = heap.size() - 1;
        int parentIndex = curIndex / 2;
        Character cur = heap.get(curIndex);

        while ((curIndex > 1) &&
        (cur.compareTo(heap.get(parentIndex)) < 0))
        {
            // Swap current element with its parent
            Character parent = heap.get(parentIndex);
            heap.set(parentIndex, cur);
            heap.set(curIndex, parent);

            curIndex = parentIndex;
            parentIndex = curIndex / 2;
        }
    }

    //-----------------------------------------------------------------
    //  Bubbles the first element down as necessary to preserve
    //  the ordering of the heap.
    //-----------------------------------------------------------------
    private void bubbleDown ()
    {
        int swapIndex = 1;
        // get indices of current node and possible children
        // get character at current index

        while (child1 exists and we need to swap)
        {
            // reset swapIndex (something like −1)
            if (child2 exists)
            {
                // get characters from children
                // find "smallest" one
                //swapIndex =  appropriate child Index;
            }
            else if ( see if we need to swap with child1)
            {
                swapIndex = child1Index;
            }

            // Swap current element with smaller child
            if (swapIndex != -1)
            {
                //swap values
                // Reset indices
            }
        }
    }

    public Character removeRoot()
    {
        Character first=heap.get(1);
        if(heap.size()-1>0)
        {

            Character last=heap.get(heap.size()-1);
            heap.set(1,last);
        }

        this.bubbleDown();
        heap.remove(heap.size()-1);
        return first;
    }

} 