import java.util.LinkedList;
import java.util.Queue;
public class fifth{
public static void main(String args[]){
Queue<Integer> q=new LinkedList<>();
int p=1;
c1: for(int i=2;i<=20;i++)
    {if(q.isEmpty())
       {q.add(i);
         p=p*i;
       }
    else
       {for(int a:q)
          {if(i%a==0)
             continue c1;
           }
           q.add(i);
           p=p*i;
        }
    }
  System.out.println(p);
 }
}