import java.util.LinkedList;
import java.util.Queue;
public class third{
public static void main(String args[]){
Queue<Long> q=new LinkedList<>();
long p=1;
long b=600851475143L;
long s=(long)Math.sqrt(600851475143L);
c1: for(long i=3;i<=s;i=i+2)
    {if(q.isEmpty())
       {if(b%i==0)
         {q.add(i);
          p=i;
          }
       }
    else
       {for(long a:q)
          {if(i%a==0)
             continue c1;
           }
          if(b%i==0)
           {q.add(i);
            p=i;
           }
        }
    }
  System.out.println(p);
 }
}