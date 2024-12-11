import java.util.*;
class Hourglasseg {
    	public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int c = sc.nextInt();
       		 int arr[][] = new int[r][c];
       		 System.out.println("Enter the array elements");
     		   for(int i=0;i<r;i++){
           			 for(int j=0;j<c;j++){
                			 	arr[i][j] = sc.nextInt();
            		   	}
        		   }
		  System.out.println("\n");
          		  System.out.println("Original array");
		  System.out.println("\n");
        		  for(int i=0;i<r;i++){
            		  	for(int j=0;j<c;j++){
                		  		System.out.print(arr[i][j]+"\t");
            			}
           			 System.out.println("\n");
        		   }
        		   System.out.println("\n\n");
        		   System.out.println("Hour glass ");
        		   System.out.println("\n\n");
        		   for(int i=0;i<r;i++){
            			for(int j=0;j<c;j++){
                				if((i<r/2 || i>r/2)  && (j==0|| j==c-1)){
                    				System.out.print(arr[i][j]+"\t");
                				}
                				else if( (i==r/2) && (j==c/2) ){
                    				System.out.print(arr[i][j]+"\t");
                				}
                				else{
                    				System.out.print(" "+"\t");
                				}
            			}
            			System.out.println("\n");
       		 }
        
   	 }
}