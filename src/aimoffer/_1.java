package aimoffer;

public class _1 {
	
	public static void main(String[] args){
		int[][] a=new int[][]{{1,2,8,9,11},{2,4,9,12,14},{4,7,10,13,19},{6,8,11,15,23}};
		System.out.println(find(5,a));
	}
	
	public static boolean find(int target,int[][] a){
		int r=a.length;//row
		int c=a[0].length;//column
	
		int i=0;
		int j=c-1;
		while(j>=0&&i<r){
			if(target>a[i][j]){
				i++;
				continue;
			}
			if(target<a[i][j]){
				j--;
				continue;
			}
			if(target==a[i][j]){
				return true;
			}
		}
		
		return false;
	}

}
