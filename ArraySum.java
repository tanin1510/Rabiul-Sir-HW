import java.util.*;
class ArraySum{
    public static void main(String[] args) {
        int array[]={5,10,15,20,25,30,35,40,45,50},sum=0;
        for(int x: array){
            sum+=x;
        }
        System.out.println("Summation of the Array is = "+sum);
    }
}