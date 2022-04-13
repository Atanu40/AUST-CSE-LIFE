

package javaapplication6;

/**
 *
 * @author Student
 */
public class Online_2 {
      static int PowerOFPINnfactorial(int n, int p) 
    { 
         
        int ans = 0; 
       
        
        for (int i = 1; i <= n; i++) { 
       
             
            int count = 0, temp = i; 
       
            
            while (temp % p == 0) { 
                count++; 
                temp = temp / p; 
            } 
       
            
            ans += count; 
        } 
        return ans; 
    } 
      
     
    public static void main(String[] args) 
    { 
        System.out.println(PowerOFPINnfactorial(2, 6)); 
    } 
} 

