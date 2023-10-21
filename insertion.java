package ebrada;

import java.util.*;
public class insertion {


  public static void main(String args[])
 {
    int myarray[10] = { 12,4,3,1,15,45,33,21,10,2};   
      
    cout<<"\Input list is \";
    for(int i=0;i<10;i++)  
    {  
        cout <<myarray[i]<<"\";  
    }    
    for(int k=1; k<10; k++)   
    {  
        int temp = myarray[k];  
        int j= k-1;  
        while(j>=0 && temp <= myarray[j])  
        {  
            myarray[j+1] = myarray[j];   
            j = j-1;  
        }  
        myarray[j+1] = temp;  
    }  
    cout<<"\Sorted list is \";
    for(int i=0;i<10;i++)  
    {  
        cout <<myarray[i]<<"\";  
    }  
}
 