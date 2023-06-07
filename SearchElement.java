import java.util.Scanner;
public class SearchElement{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element to search");
		int num=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
				}
	for(int i=0;i<n;i++){
		if(arr[i]==num){
		System.out.println("Here present the number"+arr[i]);
				}
			}
		}
	}
