package digitalpathtest;

import java.util.Arrays;

 
public class findIntersection {

     

static int[] firstArray = new int[]{2, 2, 4, 1};
     
static int[] secondArray = new int[]{1, 2, 0, 2};

    

 public static int[] findIntersection(int[] arr1, int[] arr2) {

	 /*
	  * first return only unique values from first array
	  */
	 for(int i=0;i<arr1.length;i++){
         boolean isDistinct = false;
         for(int j=0;j<i;j++){
             if(arr1[i] == arr1[j]){
                 isDistinct = true;
                 break;
             }
         }
         if(!isDistinct){
             
             for( int y = 0; y<arr2.length; y++ ){
            	 
            	 /*
            	  * once returned unique values from first array
            	  * check if each element is eqaul to any other element in second array
            	  * break if they match so you only return unique numbers and not repeating numbers
            	  */
            	 if( arr1[i] == arr2[y] ){
            		 System.out.println("intersection" + arr1[i]);
            		 break;
            	 }
            	 
             }
             
         }
     }
	return arr2;

    
 }

     

public static void main(String args[]) {
         
int[] intersection = findIntersection(firstArray, secondArray);
         
System.out.println(Arrays.toString(intersection));
     }

 
}