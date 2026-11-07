import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        int n = arr.length;
        double[] frac = new double[n * (n - 1) / 2];
        int index = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                frac[index] = (double) arr[i] / arr[j];
                index++;
            }
        }

        Arrays.sort(frac);
        double ad = frac[k - 1];

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                double maina = (double) arr[i] / arr[j];

                if(maina == ad) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return new int[]{-1, -1};
    }
}