import java.util.LinkedList;
import java.util.Queue;
public class tenth{
public static void main(String args[]){
Queue<Long> q=new LinkedList<>();
long p=2;
long b=2000000;
long s=2;
c1: for(long i=3;i<b;i=i+2)
       {for(long a:q)
          {if(i%a==0)
             continue c1;
           }
           q.add(i);
            s=s+i;
        }
  System.out.println(s);
 }
}