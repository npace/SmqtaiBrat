package com.npace.smqtaibrat.support;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import org.robolectric.RuntimeEnvironment;

/**
 * Created by npace on 005, 05-Dec-15.
 */
public class ResourceLocator {
    public static String getString(@StringRes int stringId) {
        return RuntimeEnvironment.application.getString(stringId);
    }

    public static Drawable getDrawable(@DrawableRes int drawableId) {
        return RuntimeEnvironment.application.getResources().getDrawable(drawableId);
    }
}
