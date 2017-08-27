package aimoffer;
//—°‘Ò≈≈–Ú


public class SelectSort {
	public static void main(String[] args){
		int[] a=new int[]{5,4,1,3,4,7,4,6,7,8};
		sort(a);
		for(int i=0;i<a.length;i++){
			//System.out.println(a[i]);
		}
		
	}
	
	public static void sort(int[] a){
		for(int i=0;i<a.length;i++){
			int max=Integer.MIN_VALUE;
			int idx=0;
			for(int j=0;j<a.length-i;j++){
				if(a[j]>max){
					idx=j;
					max=a[j];
				}
			}
			
			
			int tmp=a[idx];
			a[idx]=a[a.length-i-1];
			a[a.length-i-1]=tmp;
	//		swap(a[idx],a[a.length-i-1]);
			
		}
		
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void swap(int a,int b){
		int tmp=a;
		a=b;
		b=tmp;
	}

}
