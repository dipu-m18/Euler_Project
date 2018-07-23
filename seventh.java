 import java.math.*;
 class seventh
 {
	 public static void main(String args [])
	 {
		 int c=1, n=3, out;
		 while(c<10001)
		 {
			 out = check(n);
			 if(out==1)
				 ++c;
			 n =n+2;
		 }
System.out.println("The 10001st prime number is = "+ (n-2));
	 }
public static int check(int i){
	long sqt = (long)Math.sqrt(i);
for(int j=3; j<=sqt; j++)
{
if(i%j==0)
return 0;
else 
return 1;
}
return 2;
}
 }	