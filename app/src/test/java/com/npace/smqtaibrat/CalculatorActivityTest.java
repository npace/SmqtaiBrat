package com.npace.smqtaibrat;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static com.npace.smqtaibrat.support.Asserts.assertViewIsVisible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

/**
 * Created by npace on 005, 05-Dec-15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 19)
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
    public void assertWelcomeTextVisible() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.welcome_text);

        assertViewIsVisible(textView);
        assertThat(textView.getText().toString(),
                equalTo("Hello World!"));
    }
}
