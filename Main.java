import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	char[] arr ;
	String answer [];
	int n, h ;
	int k;
	
	public static void main(String[] args) {
		Main g = new Main();
		g.start();

	}
	
	void start(){
		Scanner reader = new Scanner (System.in);
//		StringTokenizer to = new StringTokenizer( reader.nextLine() );
		int t = reader.nextInt();
//		t = Integer.parseInt( to.nextToken() );
//		reader.nextLine();
		answer = new String[12900];
		while(t-- != 0){
//			to = new StringTokenizer( reader.nextLine() );
//			n = Integer.parseInt( to.nextToken() );
//			h = Integer.parseInt( to.nextToken() );
			n = reader.nextInt();
			h = reader.nextInt();
			StringBuilder d = new StringBuilder();
			for(int i=0 ; i<n ;i++){
				if(i<n-h)
					d.append("0");
				else
					d.append( "1" );
			}
			answer[0]= d.toString() ;
			arr = answer[0].toCharArray();
			k=1 ;
			print(arr,n-h);
			
			if(t != 0){
				for(int i=0 ; i<k ; i++){
					System.out.println(answer[i]);
				}
				System.out.println();
//				reader.nextLine();
			}
			else{
				for(int i=0 ; i<k ; i++){
						System.out.println(answer[i]);
				}
			}
			
		}
	}
	
	void print(char[] arr, int index){
		if(index==n)
			return;
		
		for(int i=index ; i>0 && arr[i-1]!='1' ; i--){
				char tmp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=tmp;
				StringBuilder string = new StringBuilder();
				char[] s = new char[n];
				for(int j=0 ; j<n ;j++){
					s[j]=arr[j];
					string.append(arr[j]);
				}
				answer[k] = string.toString();
				k++;
				print(s,index+1);
		}
	}

}
