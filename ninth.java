
public class ninth {

public static void main(String[] args)
   {int a,b,c;
 c1:for( a=1;a<1000;a++)
    {
        for( b=1;b<1000;b++)
        {
            c=1000-a-b;
            if(c>0 && (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)))
            {System.out.println(a*b*c);
              break c1;
            }
        }
    }
    
  }
}
