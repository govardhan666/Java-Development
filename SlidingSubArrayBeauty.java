package govardhan;

import java.util.Scanner;
import java.util.ArrayList;
public class SlidingSubArrayBeauty{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        int k=sc.nextInt();
        int position=sc.nextInt();
        int num=arr.length;
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=Integer.parseInt(arr[i]);        
            
        }
        boolean isInOrder = true;
        for(int i=0;i<num-1;i++){
            if(array[i] > array[i+1]){
                isInOrder = false;
                break;
            }
        }
        int[] resultant = new int[num-k+1];
        if(isInOrder == true){
            for(int i=0;i<=num-k;i++){
                resultant[i]=array[i+position-1];
            }}
            else{
                resultant=slidingSubArray(array,k,position,num);
            }
            for(int i=0;i<num-k+1;i++){
                System.out.print(resultant[i]+" ");
            }
       
    }
    public static int[] slidingSubArray(int[] array,int k,int position,int num){
        int[] resultant=new int[num-k+1];
        ArrayList<Integer> subArr=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<num-k;i++){
            for(int j=i;j<i+k;j++){
                subArr.add(array[j]);
            }
            int min_index=0;
            while(count!=position){
                min_index=0;
                int size=subArr.size();
                for(int j=0;j<size;j++){
                    if(subArr.get(j)<subArr.get(min_index)){
                        min_index=j;
                    }
                }
                count++;
                if(count==position){
                    resultant[i]=subArr.get(min_index);
                }else{
                    subArr.remove(min_index);
                }
                
                
            }
            subArr.clear();
            count=0;
        }
        return resultant;
    }
    
}
