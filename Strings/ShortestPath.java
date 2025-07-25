public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        float x2 = x * x;
        float y2 = y * y;
        float displacement = (float) Math.sqrt(x2 + y2);
        return displacement;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float ans = getShortestPath(path);
        System.out.println(ans);
    }
}
