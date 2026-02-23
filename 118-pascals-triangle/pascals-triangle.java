class Solution {
    public List<Integer> generaterow(int row) {
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(1);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col); 
            ans = ans / col;
            list.add(ans);
        }
        return list;

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            // List<Integer> temp = generaterow(i);
            list1.add(generaterow(i));
        }
        return list1;
    }
}