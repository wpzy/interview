package aimoffer;

public class LongestIncreaseSequence {
	
	public static void main(String[]  args){
		int result=getLength("341256");
		System.out.println(result);
	}
	public static int getLength(String s){
		char[] a=s.toCharArray();
		int[] dp=new int[a.length];
		dp[0]=1;
		for(int i=1;i<a.length;i++){
			int max=0;
			for(int j=0;j<i;j++){
				if(a[i]>a[j]){
					max=Math.max(dp[j], max);
				}
			}
			dp[i]=max+1;
		}
		int result=0;
		for(int i=0;i<dp.length;i++){
			if(dp[i]>result){
				result=dp[i];
			}
		}
		
		return result;
	}
	
	
	
	//优化
	//上面的dp保存的是以i结尾的那些数中，子序列长度最大的那个
	//下面的dp保存的是，dp[i]表示，前i个数中最大的那个数。
	public static int getLength(int[] nums){
		int[] dp=new int[nums.length];
		
		
		
		return 0;
	}
	
	

}
