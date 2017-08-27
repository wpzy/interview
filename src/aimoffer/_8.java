package aimoffer;

public class _8 {

	public static void main(String[] args){
		
	}
	
	
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0){
        	return 0;
        }
        
        int len=array.length;
        int low=0;
        int high=len-1;
        while(low<high){
        	int mid=(low+high)/2;
        	if(array[mid]>=array[low]){
        		low=mid;
        	}else if(array[mid]<array[low]){
        		
        	}
        }
        
    }
	
}
