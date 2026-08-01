class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int total = 0;
        int best = values[0]+0;
        for(int i=1; i < n ; i++){
            total = Math.max(total, best+values[i]-i);
            best = Math.max(best ,values[i]+i);
        }
        return total;
    }
}