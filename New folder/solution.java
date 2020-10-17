import java.util.*;
import java.util.Scanner.*;
import java.io.*;

public class solution{
    public static void main(String[] args)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr={1,2,3,4,5,6,7};
        int target=9;
        int[] sum=new int[2];
        sum=twosum(arr,target,map);
        System.out.println(sum.toString());
        
    }
    public static int[] twosum(int[] arr,int target,Map<Integer,Integer> map)
    {
        int[] sum=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int complement=target-arr[i];
            
            if(map.containsValue(complement))
            {
                sum[0]=i;
                sum[1]=getKey(complement,map);
                break;
            }
            map.put(i,arr[i]);
           

        }
        return sum;
    }

    public static int getKey(int complement,Map<Integer,Integer> map)
    {
        int key=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==complement){
            key= entry.getKey();
            break;
            }
            
        }
        return key;
        
    }

}