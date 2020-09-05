public class PalindromeString{

     public static void main(String []args){
         
        String a, b = "";
        
        //example
        a = "aabaa";
        
        int length = a.length();
        
        for (int i = length - 1; i >=0; i--){
            b = b+a.charAt(i);
        }
        
        if (a.equalsIgnoreCase(b)){
            System.out.println("Yes");
            
        }else{
            System.out.println("No");    
        }
     }
}
