	import java.io.*;	
	import java.util.Scanner;
		public class Reverse{
			public static void main(String args[]){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size");
			int n=sc.nextInt();
			System.out.println("Enter the elements");
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				}
			System.out.println("The reverse of the array is :");
			for(int i=n-1;i>=0;i--){
			System.out.println(arr[i]+"\t");
						}
				
			}
		}

