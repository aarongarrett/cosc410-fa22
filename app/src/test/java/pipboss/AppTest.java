package pipboss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class AppTest {
    
    @Test 
    void exampleTest() {
        App testedClass = new App();
        assertThat("this is an informative message about the test", 1, is(1));
    }
}
