package com.npace.smqtaibrat;

import com.npace.smqtaibrat.support.CustomGradleTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertNotNull;

/**
 * Created by npace on 005, 05-Dec-15.
 */
@RunWith(CustomGradleTestRunner.class)
public class CalculatorActivityTest {
    private CalculatorActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(CalculatorActivity.class)
                .create()
                .start()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveDisplayFragment() throws Exception {
        assertNotNull(activity.getSupportFragmentManager().findFragmentById(R.id.display_fragment));
    }
}
