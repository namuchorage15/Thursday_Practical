import java.util.StringTokenizer;  
public class StringTokenizerExample
{  
   public static void main(String args[])
    {  
      StringTokenizer st = new StringTokenizer("Hello! my name is Namrata"," ");  
      while (st.hasMoreTokens())
       {  
         System.out.println(st.nextToken());  
       }  
    }  
}