/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class StackAsLinkedList
{
 StackNode root;


    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty()
    { 
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newtop = new StackNode(data);
        newtop.next = root;
        root = newtop;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int ans = root.data;
            root = root.next;
            return ans;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return root.data;
        }
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        
        sll.push(17);
        
        System.out.println("Top element is " + sll.peek());
    }
}
