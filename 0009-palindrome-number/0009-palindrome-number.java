class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int temp = x;
        int n = 0;

        while(temp > 0) {
            n++;
            temp = temp / 10;
        }

        int ar[] = new int[n];
        int index = 0;

        for(int j = 0; j<n; j++) {
            ar[index] = x % 10;
            x = x / 10;
            index++;
        }
        int left = 0, right = n - 1;
        while (left < right) {
            if (ar[left] != ar[right]) return false;
            left++;
            right--;
        }
        return true;

    }
}