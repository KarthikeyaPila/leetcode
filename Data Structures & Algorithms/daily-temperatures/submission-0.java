class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}
