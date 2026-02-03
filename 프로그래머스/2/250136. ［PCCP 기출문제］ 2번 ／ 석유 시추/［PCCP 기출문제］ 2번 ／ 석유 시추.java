import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;

        boolean[][] visited = new boolean[n][m];
        int[][] group = new int[n][m]; // 덩어리 ID
        Map<Integer, Integer> sizeMap = new HashMap<>();

        int groupId = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 0 || visited[i][j]) continue;

                Queue<int[]> q = new LinkedList<>();
                visited[i][j] = true;
                q.offer(new int[]{i, j});
                group[i][j] = groupId;

                int count = 0;

                while (!q.isEmpty()) {
                    count++;
                    int[] cur = q.poll();
                    int r = cur[0];
                    int c = cur[1];

                    int[] dr = {-1, 1, 0, 0};
                    int[] dc = {0, 0, -1, 1};

                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                        if (land[nr][nc] == 0 || visited[nr][nc]) continue;

                        visited[nr][nc] = true;
                        group[nr][nc] = groupId;
                        q.offer(new int[]{nr, nc});
                    }
                }

                sizeMap.put(groupId, count);
                groupId++;
            }
        }

        int answer = 0;

        for (int c = 0; c < m; c++) {
            int sum = 0;
            Set<Integer> used = new HashSet<>();

            for (int r = 0; r < n; r++) {
                int gid = group[r][c];
                if (gid != 0 && !used.contains(gid)) {
                    sum += sizeMap.get(gid);
                    used.add(gid);
                }
            }

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
