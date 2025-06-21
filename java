Diagonal  (PRIMARY )
	
import java.util.Scanner;

    public class Main{
	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();
	int arr[][]=new int[n][n];
	for (int i=0;i<n;i++){
	    for (int j=0;j<n;j++){
	        arr[i][j]=in.nextInt();
	    }
	}
	for (int i=0;i<n;i++){
	    for (int j=0;j<n;j++){
	        if (i==j){
	            System.out.print(arr[i][j]+" ");
	        }
	    }
	    System.out.println();
	}}}

Diagonal (SECONDARY )

import java.util.Scanner;

    public class Main{
	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();
	int arr[][]=new int[n][n];
	for (int i=0;i<n;i++){
	    for (int j=0;j<n;j++){
	        arr[i][j]=in.nextInt();
	    }
	}
	for (int i=0;i<n;i++){
	    for (int j=n-1;j>=0;j--){
	        
	        if (j==n-i-1){
	            System.out.print(arr[i][j]+" ");
	        }
	    }
	    System.out.println();
	}}}


