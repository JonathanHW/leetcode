class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        //划出边界
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        boolean a = solution9.isPalindrome(1001);
        System.out.println(a);
    }
}


