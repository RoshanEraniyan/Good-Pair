import java.util.*;
class Solution{
    public int goodpairCheck(int size,int[] array,int k)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]+array[j]==k)
                {
                    return 1;
                }
            }
        }
        return 0;
    }

}
public class GoodPair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int k= scanner.nextInt();
        Solution solution=new Solution();
        System.out.println(solution.goodpairCheck(n,array,k));

    }
}
