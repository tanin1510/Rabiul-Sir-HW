import java.util.*;
class Series1stWay{
    public static void main(String[] args) {
        Scanner tanvir=new Scanner(System.in);
        System.out.println("Enter 1^2+2^2+3^2+....+n series n'th value : ");
        int n=tanvir.nextInt();
        int operation=(n*(n+1)*(2*n+1))/6;
        System.out.println("Summation of Series : "+operation);
    }
}