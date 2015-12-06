package com.npace.smqtaibrat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by npace on 006, 06-Dec-15.
 */
@RunWith(RobolectricTestRunner.class)
public class DisplayFragmentTest {
    @Test
    public void shouldNotBeNull() throws Exception {
        DisplayFragment fragment = new DisplayFragment();
        startFragment(fragment);
        assertNotNull(fragment);
    }
}
