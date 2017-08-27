package aimoffer;

public class maxSumSequence {
	
	public static void  main(String[] args){
		int[] a=new int[]{2,-1,4,3,-9,8,9};
		int result=getMax(a);
		System.out.println(result);
		
	}
	
	public static int getMax(int[] a){
		int len=a.length;
		int[] dp=new int[len];
		int sum=0;
		dp[0]=a[0];
		for(int i=1;i<len;i++){

			if(dp[i-1]+a[i]>=dp[i-1]){
				dp[i]=dp[i-1]+a[i];
			}else{
				dp[i]=a[i];
			}
			sum=Math.max(dp[i], sum);
		}
		return sum;
	}

}
