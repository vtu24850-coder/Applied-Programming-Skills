import java.util.Scanner;
import java.util.Arrays;
class SqsArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Squares of the given array is: ");
for(int i=0;i<arr.length;i++)
{
int sq=arr[i]*arr[i];
System.out.println(sq);
}
}
}
