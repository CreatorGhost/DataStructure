class LinkedListReverse{
static Node head;		//Creating the head of our Linked List
public class Node{	//Creating a Node Class
	int data;	//Declaring the data type to be used inside our node
	Node next;	//Pointer to a next node (basically creating a object)
}
public  Node insert(Node head,int data)
{
	Node n=new Node();	//Initializing new node to be inserted
	n.data=data;	
	n.next=null;
	if(head ==null)
	{
		head=n;		//When Head is null we simly make our newly created node as head
	}
	else{
		Node temp=head;		//We don't want to lose the refrence to our head node so we create a temp varialble to do the traversel
		
		while(temp.next!=null)
		{
			temp=temp.next;		//Lopping till the end of our Link List
		}
		temp.next=n;	//Once we find the end of previous list we simmply add our new node to it
	}
	return head;
}
public Node reverse(Node head)
{
	if(head==null)return head;	//If Our List is empty we simply return it back
	else{
		Node temp=head;	//Creating temp for traversel
		Node prev=null;	//This will be used to create our new reversed Link List 
		Node next=null;	//This is used to keep the next node so that when we reverse we dont lose the track
		while(temp!=null)
		{
			next=temp.next;	//pust the next to the next node (so that we dont loose our link list)
			temp.next=prev;		//pointing to previous in order to reverse the list
			prev=temp;		//the reversed list
			temp=next;	// moving the temp to the next node of our orignal list
		}
		return prev;
	}
}
			


public static void show(Node head)
{
	if(head==null)System.out.println("Empty");	//Display Empty when there is no node
	else{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);	//Print data of every node
			temp=temp.next;
		}
		System.out.println(temp.data);	//Once we are end of the list we print our last node data
	}
}
public static void main(String args[])
{
	LinkedListReverse cr=new LinkedListReverse();
	head=cr.insert(head,1);
	head=cr.insert(head,2);
	head=cr.insert(head,3);
	head=cr.insert(head,4);
	cr.show(head);
	System.out.println("---REversing---");
	head=cr.reverse(head);
	cr.show(head);
}
}
