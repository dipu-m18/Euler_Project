public class sixth{
public static void main(String args[]){
  int n=100;
  int sumOfSquares=(n*(n+1)*(2*n+1))/6;
  int squareOfsum=(n*(n+1))/2;
  int diff=(int)Math.pow(squareOfsum,2)-sumOfSquares;
  System.out.println(diff);
 }
}