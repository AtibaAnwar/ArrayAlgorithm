
import java.io.*;
import java.util.Scanner;
	public class SmallestNum{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
				int n=sc.nextInt();
				int arr[]=new int[n];
				int temp;
				System.out.println("Enter the Elements");
				System.out.println("The elements are:");
				for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++){
					for(int j=i+1;j<n;j++){
						if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					
						}
					}
				}
			System.out.println("The smallest element is:"+arr[0]);
		}
	}