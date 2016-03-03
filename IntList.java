// ****************************************************************
// FILE:  IntList.java
//
// Purpose: Defines a class that represents a list of integers 
//          
// ****************************************************************
public class IntList
{
    private IntNode front;      //first node in list
    private int ctr;

    //-----------------------------------------
    //  Constructor.  Initially list is empty.
    //-----------------------------------------
    public IntList()
    {
        front = null;
        ctr = 0;
    }

    //-----------------------------------------
    //   Adds given integer to front of list.
    //-----------------------------------------
    public void addToFront(int val)
    {
        front = new IntNode(val,front);
        ctr++;
    }

    //--------------------------------------
    //   Adds given integer to end of list.
    //--------------------------------------
    public void addToEnd(int val)
    {
        IntNode newnode = new IntNode(val,null);

        //if list is empty, this will be the only node in it
        if (front == null)
            front = newnode;
        else
        {
            //make temp point to last thing in list
            IntNode temp = front;
            while (temp.next != null)
                temp = temp.next;
            //link new node into list
            temp.next = newnode;
        }
        ctr++;
    }

    //-------------------------------------------
    //   Removes the first node from the list.
    //   If the list is empty, does nothing.
    //-------------------------------------------
    public void removeFirst()
    {
        if (front != null) {
            front = front.next;
            ctr--;
        }
    }

    public int length()
    {
        return ctr;
    }

    //------------------------------------------------
    //   Prints the list elements from first to last.
    //------------------------------------------------
    public void print()
    {
        System.out.println("---------------------");
        System.out.print("List elements: ");

        IntNode temp = front;

        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("\n---------------------\n");
    }

    public String toString() {
        IntNode temp = front;
        String print = "";
        while (temp != null) {
            print = print + temp.val;
            if(temp.next!=null)
                print = print + " ";
            temp = temp.next;
        }
        return print;
    }

    public void removeLast() {
        if(front != null) {
            IntNode current = front.next;
            IntNode behind = front;
            while(current.next != null) {
                current=current.next;
                behind = behind.next;
            }
            behind.next = null;

            ctr--;
        }
        else {
            System.out.println("No values in list");
        }
    }

    public void replace(int oldVal, int newVal) {
        IntNode temp = front;
        while(temp != null) {
            if (temp.val == oldVal)
                temp.val = newVal;
            temp = temp.next;
        }
    }
    //***************************************************************
    // An inner class that represents a node in the integer list.
    // The public variables are accessed by the IntList class.
    //***************************************************************
    private class IntNode
    {
        public int val;         //value stored in node
        public IntNode next;    //link to next node in list

        //-------------------------------------------------------------------
        // Constructor; sets up the node given a value and IntNode reference
        //-------------------------------------------------------------------
        public IntNode(int val, IntNode next)
        {
            this.val = val;
            this.next = next;
        }
    }
}