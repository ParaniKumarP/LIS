package LIS;


public class A {
	static int lis(int b[], int n)
    {
        int lis[] = new int[n];
        int i, j, m = 0;
 
        for (i = 0; i < n; i++)
            lis[i] = 1;
 

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (b[i] > b[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
    
        for (i = 0; i < n; i++)
            if (m < lis[i])
                m = lis[i];
 
        return m;
    }
	public static void main(String args[]) {

		int c[] = {5,48,96,4,7,8,10,1,100,82,11};
		int n = 11;
		System.out.println("The Longest Increasing  subsequence is:" +lis(c,n));
	
	}
}