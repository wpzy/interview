package aimoffer;

public class LongestCommenSubstring {
	
	public static void main(String[] args){
		String a="www.hankcs.com";
		String b="hankcs";
		int result=getMaxSubsequence(a,b);
		System.out.println(result);
		
	}
	//get max substring
	public static int getLength(String a,String b){
		char[] aa=a.toCharArray();
		char[] bb=b.toCharArray();
		int x=a.length();
		int y=b.length();
		int[][] dp=new int[x][y];//initialed to be 0 automaticly
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(aa[i]==bb[j]){
					if(i==0||j==0){
						dp[i][j]=1;
					}else{
						dp[i][j]=dp[i-1][j-1]+1;
					}
					
				}
			}
		}
		
		int max=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(dp[i][j]>max)
					max=dp[i][j];
			}
		}
		
		return max;
		
	}
	
	//get max substring
	public static int getMaxSubsequence(String a,String b){
		char[] aa=a.toCharArray();
		char[] bb=b.toCharArray();
		int x=aa.length;
		int y=bb.length;
		int[][] dp=new int[x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(aa[i]==bb[j]){
					if(i==0||j==0){
						dp[i][j]=1;
					}else{
						dp[i][j]=dp[i-1][j-1]+1;
					}
				}else{
					if(i==0||j==0){
						dp[i][j]=0;
					}else{
						dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		}
		
		
		
		int max=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(dp[i][j]>max)
					max=dp[i][j];
			}
		}
		
		return max;
		
		
		
		
		
	}

}
