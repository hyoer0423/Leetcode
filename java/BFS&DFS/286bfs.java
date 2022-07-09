public class Solution {
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0 || rooms[0].length == 0)
            return;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; i < rooms[0].length; j++) {
                if (rooms[i][j] == 0) {
                    bfs(i, j, rooms);
                }
            }
        }
    }

    private void bfs(int x, int y, int[][] rooms) {
        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        Queue<int[]> queue = new LinkedList<>();
        int dis = 0;
        queue.offer(new int[] { x, y });
        while (!queue.isEmpty()) {
            int s = queue.size();

            while (s-- > 0) {
                int[] temp = queue.poll();
                rooms[temp[0]][temp[1]] = Math.min(rooms[temp[0]][temp[1]], dis);
                if (temp[0] < 0 || temp[0] > rooms.length || temp[1] < 0 || temp[1] > rooms[0].length
                        || visited[temp[0]][temp[1]] == true) {
                    continue;
                }
                int[][] li = new int[][] { { temp[0] - 1, temp[1] }, { temp[0] + 1, temp[1] }, { temp[0], temp[1] + 1 },
                        { temp[0], temp[1] - 1 } };
                for (int[] cp : li) {
                    visited[cp[0]][cp[1]] = true;
                    queue.offer(cp);
                }
            }
            dis++;

        }

    }

}