package govardhan;
import java.util.Scanner;
public class MaximumSubsequences{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String text = sc.nextLine();
        String pattern =sc.nextLine();
        String str1= pattern.charAt(0)+text;
        String str2=text+pattern.charAt(1);
        int seq1=maxSubSequenceCount(str1,pattern);
        int seq2=maxSubSequenceCount(str2,pattern);
        int max=0;
        if(seq1>seq2){
            max=seq1;
        }else{
            max=seq2;
        }
        System.out.println(max);
        
    }
    public static int maxSubSequenceCount(String str,String pattern){
        int count=0;
        int len=str.length();
        for(int i=0; i<len;i++){
            if(str.charAt(i) == pattern.charAt(0)){
                for(int j=i+1; j<len;j++){
                    if(str.charAt(j) == pattern.charAt(1)){
                        count++;
                    }
                }
            }
        } return count;
    }
}
