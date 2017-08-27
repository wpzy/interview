package aimoffer;

public class findTop {
	/*
	 * 给定一个先单调上升后单调下降的数组，求出拐点的index
	 * */
	
	public static void main(String[] args){
		int a[]=new int[]{1,2,3,4,5,6,7,6,5};
		int result=getTop(a,0,a.length-1);
		System.out.println(result);
	}
	
	
	public static int getTop(int a[],int low,int high){
		int len=a.length;
		if(len==0){
			return 0;
		}
		if(len==1){
			return 0;
		}
		if(len==2){
			return 1;
		}
		
		int mid=(low+high)/2;
		if(a[mid]>a[mid+1]&& a[mid]<a[mid-1]){
			int result=getTop(a,low,mid);
			return result;
		}else if(a[mid]<a[mid+1]&&a[mid]>a[mid-1]){
			int result=getTop(a,mid,high);
			return result;
		}else{
			return mid;
		}


		
	}
	


}
