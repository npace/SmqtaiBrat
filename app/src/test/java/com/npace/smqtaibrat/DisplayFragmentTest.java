package com.npace.smqtaibrat;

import com.npace.smqtaibrat.support.CustomGradleTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.npace.smqtaibrat.support.Asserts.assertViewIsVisible;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by npace on 006, 06-Dec-15.
 */
@RunWith(CustomGradleTestRunner.class)
public class DisplayFragmentTest {

    private DisplayFragment fragment;

    @Before
    public void setUp() throws Exception {
        fragment = DisplayFragment.newInstance();
        startFragment(fragment);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void shouldHaveDisplay() throws Exception {
        assertViewIsVisible(fragment.getView().findViewById(R.id.calculator_display));
    }
}
