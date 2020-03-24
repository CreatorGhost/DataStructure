import java.util.*;
public class Heap
{
    public static ArrayList<Integer> insert(ArrayList<Integer> lst,int data)
    {
        if(lst.size()<1)lst.add(data);      //Just insert the firstvalue
        
        else{
            lst.add(data);
            lst=swap(lst,data);         //call to manage the heaap
            }
        return lst;
    }
    
    public static ArrayList<Integer> swap(ArrayList<Integer> lst,int data)
    {
        int t,k,p,chi,par;
        k=lst.size()-1;             //index of newly added node
        
        
        while(k>0)
        {
            p=(k-1)/2;      //index of parrent addresh
            par=lst.get(p);     //get the parrent 
            chi=lst.get(k);     ////get the child
            if(chi>par)         //for maxHeap we use > and for minHeap we can use <
            {
               //to swap if the new node is bigger then its parrent node
               t=par;
               par=chi;
               chi=t;
               lst.set(p,par);      //swaping at parrent
               lst.set(k,chi);      //swaping at child
               k=p;         //increment k to check the next parrent
              
            }
            else{
                
                break;
            }
        }
    return lst;
    }
    
    public static void main(String args[])
    {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        
        lst=insert(lst,5);
        lst=insert(lst,15);
         lst=insert(lst,2);
        lst=insert(lst,25);
        System.out.println(lst);
        
    }
    
}
