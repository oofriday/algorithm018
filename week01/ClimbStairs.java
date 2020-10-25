public class ClimbStairs {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int climb1 = 1;
        int climb2 = 2;
        for(int i = 3; i <= n; i++){
            int temp = climb1 + climb2;
            climb1 = climb2;
            climb2 = temp;
        }
        return climb2;
    }
}
