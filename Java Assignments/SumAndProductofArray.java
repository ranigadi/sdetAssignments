public class SumAndProductofArray {  
    public static void main(String[] args) {      
          
        
        int [] arr = new int [] {1, 2 , 3, 6, 9};
        int sum = 0;  
        int product = 1;
          
        
        for (int i = 0; i < arr.length; i++) {   
           sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);  
        
        for (int i = 0; i < arr.length; i++) {   
            product = product * arr[i];  
         }    
         System.out.println("product of all the elements of an array: " + product); 
    }  
}  