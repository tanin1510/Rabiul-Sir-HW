import java.util.*;
class Getting_Array{
    int []method(){
        Scanner tanvir=new Scanner(System.in); 
        System.out.print("Enter the Array Size : ");
        int size=tanvir.nextInt();
        int Array[]=new int[size];
        System.out.println("Enter the Array elements : ");
        for(int i=0;i<size;i++){
            System.out.print("Array["+i+"] = ");
            Array[i]=tanvir.nextInt();
        }
        return Array;
    }
}
class Operation extends Getting_Array{
    int Summation(){
        int sum=0;
        for(int x:method()){
            sum+=x;
        }
        return sum;
    }
}
class ArraySum4thWay{
    public static void main(String[] args) {
        Operation obj=new Operation();
        System.out.println("Summation of the Array is = "+obj.Summation());
    }
}