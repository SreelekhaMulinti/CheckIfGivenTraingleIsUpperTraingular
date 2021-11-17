import java.util.*;
public class CheckIfUpperTraingle{
	 public static void main(String[] args){
	 	Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
	 	int[][] matrix = new int[n][n];
	 	for(int i=0;i<n;i++){
	 		for(int j=0;j<n;j++){
	 			matrix[i][j] = sc.nextInt();
	 		}
	 	}
	 	boolean notUpper = false;
	 	for(int i=0;i<n;i++){
	 		for(int j=0;j<n;j++){
	 			if(i-j <= 0 && matrix[i][j] == 0){
	 				notUpper = true;
	 			}
	 			if(i-j > 0 && matrix[i][j] != 0){
	 				notUpper = true;
	 			}
	 		}
	 	}
	 	if(notUpper){
	 		System.out.println("no");
	 	}
	 	else{
	 		System.out.println("yes");
	 	}
	 }
}
