package forTests;

import core.BaseTest;
import helper.TestValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {
    @Test
    public void checkMin18(){
        String txtPageMin18 = new AuthorizationPage().
                authorization(TestValue.TEST_EMAIL, TestValue.TEST_PASSWORD)
                .txtPageMin18().getTxt();
        Assertions.assertTrue(txtPageMin18.contains(TestValue.TEST_TXT_MIN_18));

    }
}
