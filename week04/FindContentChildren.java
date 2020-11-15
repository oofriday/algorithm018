import java.util.Arrays;

/**
 * 分发饼干
 */
public class FindContentChildren {
    /**
     * 贪心
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childCount = 0;
        for (int i = 0; childCount < g.length && i < s.length; i++) {
            if (s[i] >= g[childCount]) {
                childCount++;
            }
        }
        return childCount;
    }
}
