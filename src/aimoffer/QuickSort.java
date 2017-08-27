package aimoffer;

public class QuickSort {
	
	public static void main(String[] args){
		int[] a=new int[]{3,1,4,5,6,12,1,4,2};
		sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void sort(int a[],int begin,int end){
		int povit=partition(a,begin,end);
		if(povit>begin){
			sort(a,begin,povit-1);
		}
		if(povit<end){
			sort(a,povit+1,end);
		}
		
	}
	
	public static int partition(int a[],int begin,int end){
		int povit=a[begin];
		while(begin<end){
			while(begin<end&&a[end]>=povit){
				end--;
			}
			a[begin]=a[end];
			while(begin<end&&a[begin]<povit){
				begin++;
			}
			a[end]=a[begin];
		}
		a[begin]=povit;
		return begin;
	}
	
	public static void swap(int a,int b){
		int tmp=a;
		a=b;
		b=tmp;
	}

}
