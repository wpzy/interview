package aimoffer;

public class _2 {
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer("hello world");
		System.out.println(replaceSpace(sBuffer));
	}
    public static String replaceSpace(StringBuffer str) {
    	 
        if(str==null||str.length()==0){
            return "";
        }
        
    	int n= str.length();
        int sum_space=0;
        int sum_true=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                sum_space++;
            }else{
                sum_true++;
            }
            
        }  
        
        int final_len=sum_true+3*sum_space;
        
        
        char[] result=new char[final_len];
        int j=final_len-1;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                result[j]=str.charAt(i);
                j--;
            }else{
                result[j--]='0';
                result[j--]='2';
                result[j--]='%';
            }
            
        }

        String r = String.valueOf(result);
        return r;
    	
    }

}
