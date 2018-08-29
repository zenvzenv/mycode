package cn.zw.array2;
/**
 * ²âÊÔ¶şÎ¬Êı×é
 * @author zhengwei
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[][] a={
					{1,2},
					{3,4,5,6},
					{7,7,9},
					};
		int[][] b=new int[3][];//int[][] b=new int[][3]´íÎó
		int[] a1=new int[2];
		int[] a2=new int[4];
		int[] a3=new int[3];
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=2;
		a[1][1]=2;
		a[1][2]=2;
		a[1][3]=2;
		
		a[2][0]=2;
		a[2][1]=2;
		a[2][2]=2;
		System.out.println(a[0][0]);
	}
}
