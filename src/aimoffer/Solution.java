package aimoffer;

import java.util.*;
public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        System.out.println(array[8]);
        int len=array.length;
        int mid=(len)/2;
        if(array[mid]==array[0] || array[mid]==array[len-1]){
            return array[mid];
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args){
    	int[] a=new int[]{1,2,3,2,2,2,5,4,2};
    	int res=MoreThanHalfNum_Solution(a);
    	System.out.println(res);
    }
}