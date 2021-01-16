/*2.Define a class Queue for representing a queue data structure. The class must
define a default constructor, a parameterized constructor and functions for en-
queue, de-queue and display operations. Write a Java program to implement
this.*/

import java.util.*;
class Queue
{
    int Queue[] ;
     int front, rear, size, len;
 
    /* Constructor */
     
    public Queue(int n) 
    {
        size=n;
        Queue = new int[size];
        front = -1;
        rear = -1;
        len = 0;      
    }    
   
    Queue()
   {
	 
   }
   
    /*  Function to insert an element to the queue */
    public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;    
    }    
    /*  Function to remove front element from the queue */
    public int remove() 
    {
        if (front==-1)
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
}
 

public class QueueImplement
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("...QUEUE...\n");
        System.out.println("Enter Size of Integer Queue ");
        int n = scan.nextInt();
        Queue q = new Queue(n); 
        /* Perform Queue Operations */        
        char ch;
        do{
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3.Display");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                try
                {
                    q.insert( scan.nextInt() );
                }
               catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }                       
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+q.remove());
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;   
            case 3:
            	 q.display(); 
            	 break;
            default : System.out.println("Wrong Entry \n ");
                break;
            }
            
                      
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                        
    }    
}
