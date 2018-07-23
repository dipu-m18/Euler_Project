public class fourth {
 
    public static void main(String args[]){
       int max=-1,n=0,i=999,j=999,ii=999,jj=999;
c1:
for( i=999;i>=100;i--)
 {for(j=999;j>=100;j--)
   {n=i*j;
     String s=Integer.toString(n);
     StringBuilder ss=new StringBuilder(s);
     StringBuilder sss=ss.reverse();
      if(s.equals(sss.toString()))
        {if(n>max)
          {max=n;
           ii=i;
           jj=j;
          }
         }
     }
  }System.out.println(ii+" "+jj+" "+max);
 }
}