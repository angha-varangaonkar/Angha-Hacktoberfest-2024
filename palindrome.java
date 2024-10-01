// Java program to check whether a string is palindrome or not




class Palindrome {

 
    static boolean isPalindrome(String str) {
        
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    
    public static void main(String[] args) {
        String str = "radar";

        if (isPalindrome(str))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
