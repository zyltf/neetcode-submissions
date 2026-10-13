class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> columns = new HashMap<>();
        Map<Integer, Set<Integer>> boxes = new HashMap<>();

        for (int i=0; i<board.length; i++){
            rows.put(i, new HashSet<>());
            columns.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                if (board[i][j] == '.') continue;

                int num = board[i][j] - '0';

                if (!rows.get(i).add(num)) return false;
                if (!columns.get(j).add(num)) return false;
                if (!boxes.get((i/3)*3+(j/3)).add(num)) return false;
            }
        }
        return true;
    }
}
