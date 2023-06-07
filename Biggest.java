import java.io.*;	
import java.util.Scanner;
	public class Biggest{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
				int size=sc.nextInt();
				int arr[]=new int[size];
				int big=0;
				System.out.println("The elements are :");
				for(int i=0;i<size;i++){
				arr[i]=sc.nextInt();
				}
	for(int i=0;i<size;i++){
		if (arr[i]>big){
			big=arr[i];
			}
	}
		System.out.println("HERE IS THE BIGGEST NUMBER :"+"\t" +big);
	}
}