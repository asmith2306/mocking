package com.alan.mock;

import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;

/**
 * @author asmith
 */
@PrepareForTest(StaticClass.class)
public class StaticUsingClassTest {

    /**
     * Use rule instead of the PowerMockRunner
     * Useful when you have multiple test runners e.g. Spring unit test runner
     */
    @Rule
    public PowerMockRule rule = new PowerMockRule();

    /**
     * Test of getStaticString method, of class StaticUsingClass.
     */
    @Test
    public void testGetStaticString() {

        PowerMock.mockStatic(StaticClass.class);

        StaticUsingClass instance = new StaticUsingClass();

        EasyMock.expect(StaticClass.returnString()).andReturn("10");
        EasyMock.expect(StaticClass.returnString()).andReturn("10");
        EasyMock.expect(StaticClass.returnString()).andReturn("10");

        PowerMock.replay(StaticClass.class);

        String test = instance.getStaticString();

        System.out.println(test);

        PowerMock.verify(StaticClass.class);

    }

}
