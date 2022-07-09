public class Solution {
    static int EMPTY = 2147483647;

    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0)
            return;
        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) {
                    dfs(rooms, i, j, visited, 0);

                }
            }

        }
    }

    private void dfs(int[][] rooms, int x, int y, boolean[][] visited, int level) {
        if (visited[x][y] == true || x < 0 || x >= rooms.length || y >= rooms[0].length || y < 0 || rooms[x][y] == -1)
            return;
        visited[x][y] = true;
        rooms[x][y] = Math.min(rooms[x][y], level);

        dfs(rooms, x - 1, y, visited, level + 1);
        dfs(rooms, x, y - 1, visited, level + 1);
        dfs(rooms, x + 1, y, visited, level + 1);
        dfs(rooms, x, y + 1, visited, level + 1);
        visited[x][y] = false;
    }
}
