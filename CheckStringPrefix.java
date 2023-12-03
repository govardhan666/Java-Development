package govardhan;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckStringPrefix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] list=sc.nextLine().split(" ");
        if(isGood(list)==true){
            System.out.println("GOOD PASSWORD");
        }
        else{
            System.out.println("BAD PASSWORD");
    }
 }
 public static boolean isGood(String[] list){
     ArrayList<Character> prefixList = new ArrayList<Character>();
     ArrayList<Character> comparingList = new ArrayList<Character>();
     int n=list.length;
     for(int i=0;i<n;i++){
         int n1=list[i].length();
         for(int j=0;j<n1;j++){
             prefixList.add(list[i].charAt(j));
         }
         for(int k=0;k<n;k++){
             if(k!=i){
                 int n2=list[k].length();
                 if(n1<n2){
                     int count=0;
                     for(int j=0;j<n2;j++){
                         comparingList.add(list[k].charAt(j));
                     }
                     for(int j=0;j<n1;j++){
                         if(prefixList.get(j)==comparingList.get(j)){
                             count++;
                         }
                     }
                     comparingList.clear();
                     if(count==n1){
                         return false;
                     }
                 }
             }
         }prefixList.clear();
     }
     return true;
 }

}
