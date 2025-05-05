public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int rem = x;

        int reversedNum = 0;

        while (rem > 0) {
            reversedNum = reversedNum * 10 + rem % 10;
            rem /= 10;
        }

        if (reversedNum == x) {
            return true;
        }

        return false;
    }
}