class Solution {
    public int lengthLongestPath(String input) {
        String[] dir = input.split(System.lineSeparator());
        int maxlen =0;
        int[] cur = new int[dir.length+1];
        for (String a: dir){
            int depth = a.lastIndexOf("\t") + 1;
            cur[depth +1] = cur[depth] + a.length() - depth;
            if (a.contains(".")) maxlen = Math.max(maxlen,cur[depth] + a.length());
        }
        return maxlen;
    }
}