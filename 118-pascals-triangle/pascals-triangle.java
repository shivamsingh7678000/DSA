class Solution {
    public int find(int row,int col){
        int result = 1;
        for(int i=0;i<col;i++){
            result = result * (row-i);
            result = result/(i+1);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(find(i,j));
            }
            answer.add(temp);
        }
        return answer;
    }
}