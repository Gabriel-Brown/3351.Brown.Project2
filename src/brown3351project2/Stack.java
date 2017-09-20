/******************************************************
‘***  Project 2 - Recursion
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate Linked List Stack
‘***
‘******************************************************
‘*** 09/19/2017
‘******************************************************
‘*****************************************************/

/**
 *
 * @author Gabe
 */
public class Stack 
{
private IntLL groot;

/******************************************************
‘***  push(int nextInt)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to push value to list
‘*** Method Inputs: 
‘***      next int value
‘*** Return value:
‘***      void
‘******************************************************
‘*** 9/19/2017
‘******************************************************/
    public void push(int nextInt)
    {
        IntLL temp = new IntLL();
        temp.value = nextInt;
        IntLL temp2;

        if(groot == null)
        {
            groot = temp;
        }
        
        else
        {
            temp2 = groot;
            while(temp2.nextLL != null)
                temp2 = temp2.nextLL;
            temp2.nextLL = temp;
        }
    }
    
/******************************************************
‘***  pop()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to pop item off the list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      the IntLL that was popped
‘******************************************************
‘*** 9/19/2017
‘******************************************************/
public IntLL pop()
    {
        IntLL current = groot;              
        IntLL previous = groot;
        if (groot != null)
        {
            while(current.nextLL != null) 
            { 
                    previous = current;
                    current = current.nextLL;
            }  

            if(current == groot) 
                groot = groot.nextLL;         
            else                               
                previous.nextLL = current.nextLL; 
        }
        return current;
    }

/******************************************************
‘***  printLList(int value)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to print/display list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      entire list, numbers found are blue
‘******************************************************
‘*** 9/19/2017
‘******************************************************/ 
public String printLList(int value)
    {
        IntLL temp = groot;
        String display = "<html>";
        while(temp!= null)
        {
            if (temp.value == value)
            {
                display += "<b><font color=blue>" + (temp.value) + "</font></b> ";
                value = -1;
            }
            else
                display += (temp.value) + " ";
           //System.out.println(temp.value + "    "); //prints link list from beginning
           temp = temp.nextLL; //points to next link
        }
        
        return display;
    }

/******************************************************
‘***  searchLL(int value)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to search link list
‘*** Method Inputs: 
‘***      int value
‘*** Return value:
‘***      true or false
‘******************************************************
‘*** 9/19/2017
‘******************************************************/ 
public boolean searchLL(int value)
    {
        return recSearchLL(value, groot);
    }


/******************************************************
‘***  recSearchLL(int value, IntLL current)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to print/display list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      entire list 
‘******************************************************
‘*** 9/19/2017
‘******************************************************/ 
private boolean recSearchLL(int value, IntLL current)
    {
        boolean answer = false;
        
        if (current.value != value)
        {
            if(current.nextLL != null) 
                answer = recSearchLL(value,current.nextLL);
        }
        else
        {
            answer = true;
        }
            
        
        return answer;
    }


}
