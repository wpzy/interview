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
	
	
	
	//�Ż�
	//�����dp���������i��β����Щ���У������г��������Ǹ�
	//�����dp������ǣ�dp[i]��ʾ��ǰi�����������Ǹ�����
	public static int getLength(int[] nums){
		int[] dp=new int[nums.length];
		
		
		
		return 0;
	}
	
	

}
