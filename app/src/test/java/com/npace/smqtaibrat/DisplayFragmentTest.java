package com.npace.smqtaibrat;

import android.widget.EditText;

import com.npace.smqtaibrat.support.CustomGradleTestRunner;
import com.npace.smqtaibrat.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.npace.smqtaibrat.support.Asserts.assertViewIsVisible;
import static com.npace.smqtaibrat.support.ResourceLocator.getString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by npace on 006, 06-Dec-15.
 */
@SuppressWarnings("ConstantConditions")
@RunWith(CustomGradleTestRunner.class)
public class DisplayFragmentTest {

    private DisplayFragment fragment;
    private EditText display;

    @Before
    public void setUp() throws Exception {
        fragment = DisplayFragment.newInstance();
        startFragment(fragment);
        display = (EditText) fragment.getView().findViewById(R.id.calculator_display);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void shouldHaveDisplay() throws Exception {
        assertViewIsVisible(display);
    }

    @Test
    public void shouldHaveDefaultDisplay() throws Exception {
        assertThat(display.getText().toString(),
                equalTo(getString(R.string.DEFAULT_DISPLAY)));
    }
}
