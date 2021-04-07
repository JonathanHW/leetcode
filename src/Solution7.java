/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * 7. Reverse Integer
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
class Solution7 {
//    public int reverse(int x) {
//        String xString = Integer.toString(x);
//        String string = xString;
//        int flag = 1;
//        if (x < 0) {
//            flag = -1;
//            string = xString.substring(1);
//        }
//        try {
//            return Integer.valueOf((new StringBuilder(string)).reverse().toString()) * flag;
//        }catch (Exception e){
//            return 0;
//        }
//    }

    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
//        int a = solution7.reverse(2147483647);
        int a = solution7.reverse(999999999);
        System.out.println(a);
    }
}


