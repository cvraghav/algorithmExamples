public class AB{
	public String createString(int N, int K){
		System.out.println("("+N+","+K+")");
		StringBuffer result = new StringBuffer("");
		if(N<2 || N>50){ 
			System.out.println("N did not match");
			return "";
		}
		if(K<0 && K>N*(N-1)/2)
			return "";
		return result.append(getResult(result, N, K)).toString();
	}

	private String getResult(StringBuffer result, int N, int K){
		
		if(N<1) return "";
		if(K-2 <= N)
			result.append(getString(N, K));
		System.out.println(N+","+K+" - (i,j): ("+(K-2)+","+(K-1)+") && "+result.toString());
		return getResult(result,N-1, K-1);
	}

	private String getString(int N, int K){
		int i = K-2;
		int j = K-1;
                if(K<0 || ( i>=0 && i<j && j<=N) || (i%2!=0 && i<j && i>=2))
                        return "A";
                else
                        return "B";

	}

	public static void main(String[] args){
		AB ab = new AB();
		System.out.println("Final (3,2): "+ ab.createString(3,2));
		System.out.println("Final (2,0): "+ ab.createString(2,0));
		System.out.println("Final (10,12) BAABBABAAB == : "+ab.createString(10, 12));
		System.out.println("Final (5,8): "+ab.createString(5,8));
	}
}
