import java.util.*;
public class Heap
{
    public static ArrayList<Integer> insert(ArrayList<Integer> heap, int data)
    {
        if(heap.size()==0)heap.add(data);   //Just insert the firstvalue
        else{
            heap.add(data);         //insert the next value
            heap=heapify(heap);     //now call the heapify function to fix the order
        }
        return heap;
    }
    public static ArrayList<Integer> heapify(ArrayList<Integer> heap)
    {
        int k=heap.size()-1;    //Get the index of child 
        while(k>0)
        {
            int child=heap.get(k);      //get the  child
            int p=(k-1)/2;              //index of parrent addresh
           int parrent=heap.get(p);     //get the parrent
            if(child>parrent)
            {
                //swapingg
                int t=child;
                child=parrent;
                parrent=t;
                heap.set(k,child);      //now insert the swapped value to child
                heap.set(p,parrent);    //now insert the swapped value to parrent
                k=p;        //decrement child to the parrent
            }
            else{
                break;      //if its already to a correct position do nothing
            }
        }
        return heap;
    }
    public static ArrayList<Integer> popup(ArrayList<Integer> heap)
    {
       if(heap.size()==1)
       {
           heap.remove(0);
       }
       else
       {
           int l=heap.size()-1;
           heap=swap(heap,0,l);
           heap.remove(l);
           int k=0;
           while(k<l)
           {
               int a=2*k+1;
               int b=2*k+2;
               if(a<l)
               {
                   int max=heap.get(a)>heap.get(b)? a:b;
                   heap=swap(heap,k,max);
                   k=max;
               }
               else{
                   break;
               }
           }
           
       }
       return heap;
     
    }  
   
    
    public static ArrayList<Integer> swap(ArrayList<Integer>heap,int a,int b ){
        int t,x,y;
        x=heap.get(a);
        y=heap.get(b);
        heap.set(a,y);
        heap.set(b,x);
       
        
        return heap;
    }
    
    
    public static void main(String args [])
    {
        ArrayList<Integer> heap=new  ArrayList<Integer>();
        Heap h=new Heap();
        heap =h.insert(heap,3);
        heap =h.insert(heap,5);
        heap =h.insert(heap,31);
        heap =h.insert(heap,7);
        heap =h.insert(heap,14);
        heap =h.insert(heap,44);
        heap =h.insert(heap,84);
        heap =h.insert(heap,54);
        System.out.println("heap is "+heap);
        heap=h.popup(heap);
        System.out.println("heap after pop is "+heap);
        
       
    }
}
