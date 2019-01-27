package citeck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solve2Test {

    @Test
    void checkHooks() {
        Solve2 solve2 = new Solve2();
        solve2.checkHooks(new char[]{'(', '[', ']', '[', '[', ']', '(', ')', ']', ')'});
    }
}