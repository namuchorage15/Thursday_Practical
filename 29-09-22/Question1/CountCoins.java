import java.util.Arrays;
class CountCoins{
  static int count(int coins[],int n,int sum)
  {
        if(sum==0)
         return 1;
        if(sum<0)
         return 0;
        if(n<=0)
         return 0;
        return count(coins,n-1,sum)+count(coins,n,sum-coins[n-1]);
}
   public static void main(String args[])
   {
     int coins[]={1,2,3};
     int coins1[]={2,5,3,6};
     int n=coins.length; 
     int n1=coins1.length;  
      System.out.println(count(coins, n, 4));
       System.out.println(count(coins1, n1, 10));
     }
}