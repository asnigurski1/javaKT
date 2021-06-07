package harjutused;

import java.util.Scanner;
 
public class harjutus7
{
    public static void main(String[] args) {
          
        System.out.print("Sisesta sõna: ");
        Scanner in = new Scanner(System.in);
          
        //Original string
        String origString = in.nextLine();
        int length = origString.length();
         
        boolean isPalindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("Sõna ei ole palindroom");
                isPalindrome = false;
                break;
            }
        }
          
        if(isPalindrome) {
            System.out.println("Sõna on palindroom");
        }
    }
}