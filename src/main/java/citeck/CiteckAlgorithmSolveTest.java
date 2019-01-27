package citeck;

public class CiteckAlgorithmSolveTest {
    public static void main(String[] args) {
        Solve1 solve1 = new Solve1();
        solve1.sortArray(new int[]{2, 7, 3, 2, 6, 7, 1, 1, 3, 3});
        Solve2 solve2 = new Solve2();
        solve2.checkHooks(new char[]{'(', '[', ']', '[', '[', ']', '(', ')', ']', ')'});
        Solve3 solve3 = new Solve3();
        solve3.zeroToOne(238);
    }
}
