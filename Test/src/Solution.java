
public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
    	int temp=0;
    	while(n!=0){
    		int x=n%10;
    		int y=temp;
    		temp=y*10+x;
    		n/=10;
    		if (temp/10!=y) {
				return 0;
			}
    	}
    	return temp;
    }
    public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.reverseInteger(1534236469));
	}
}
