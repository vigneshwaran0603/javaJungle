public class PalindromeNumber {
    public static void main(String[] args) {
        int n=123321;
        int original=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(original==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
