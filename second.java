public class second{
public static void main(String args[])
  {long a=0,b=1,c=a+b,sum=0;
      while(c<=4000000)
       { a=b;
         b=c;
         c=a+b;
         if(c%2==0)
           {sum=sum+c;}
       } System.out.println(sum);
  }
}