import java.util.Scanner;
public class DeleteElement{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the element to insert");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
				    }
		System.out.println("Enter the element to Delete");
		int num=sc.nextInt();
		int k=0;
		int arr2[]=new int[n-1];
		for(int i=0;i<n;i++){
			if(arr[i]!=num){
			arr2[k++]=arr[i];
			}
		}

		System.out.println("After Deletion");
		for(int x : arr2){
			System.out.print(x + "\t");
		}
	}
	}
		
