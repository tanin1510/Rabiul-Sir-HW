import java.util.*;
class Operation{
    int Summation(int Array[]){
        int sum=0;
        for(int x:Array){
            sum+=x;
        }
        return sum;
    }
}
class ArraySum3rdWay{
    public static void main(String[] args) {
        Scanner tanvir=new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size=tanvir.nextInt();
        int Array[]=new int[size];
        System.out.println("Enter the Array elements : ");
        for(int i=0;i<size;i++){
            System.out.print("Array["+i+"] = ");
            Array[i]=tanvir.nextInt();
        }
        Operation o=new Operation();
        System.out.println("Summation of the Array is = "+o.Summation(Array));
    }
}