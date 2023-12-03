package govardhan;

import java.util.Scanner;
import java.util.ArrayList;

public class SweetCandy{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        int target=Integer.parseInt(input1);
        String[] arr=input2.split(" ");
        int len=arr.length;
        ArrayList<Integer> SweetLevels= new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            SweetLevels.add(Integer.parseInt(arr[i]));
        }
        int num=0;
        while(targetLevelReachedorNot(SweetLevels,target) == false){
            SweetLevels=update(SweetLevels);
            num++;
        }
        System.out.println(num);
    }
    public static boolean targetLevelReachedorNot(ArrayList<Integer> SweetLevels,int target){
        int numofCandies =SweetLevels.size();
        for(int i=0;i<numofCandies;i++){
            if(SweetLevels.get(i)<target){
                return false;
            }
        }return true;
    }
    public static ArrayList<Integer> update(ArrayList<Integer> SweetLevels){
        int min_index=0;
        int new_level=0;
        int numofCandies=SweetLevels.size();
        for(int i=0;i<numofCandies;i++){
            if(SweetLevels.get(i) < SweetLevels.get(min_index)){
                min_index = i;
            }
        }
        new_level = SweetLevels.get(min_index);
        SweetLevels.remove(min_index);
        min_index = 0;
        for(int i=0; i<numofCandies-1 ;i++){
            if(SweetLevels.get(i) < SweetLevels.get(min_index)){
                min_index = i;
            }
        }
        new_level += 2*SweetLevels.get(min_index);
        SweetLevels.remove(min_index);
        SweetLevels.add(new_level);
        return SweetLevels;
    }
    
}
