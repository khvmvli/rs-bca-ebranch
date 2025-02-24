package io.github.inflationx.calligraphy3;

import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.setAdapter;
import o.setCheckMarkDrawable;
import o.setCompoundDrawables;
import o.setCompoundDrawablesRelative;
import o.setImageURI;
import o.setPopupBackgroundDrawable;
import o.setSupportImageTintMode;
import o.setTypeface;
/* loaded from: classes-dex2jar.jar:io/github/inflationx/calligraphy3/CalligraphyConfig.class */
public class CalligraphyConfig {
    private static final Map<Class<? extends TextView>, Integer> DEFAULT_STYLES;
    private final Set<Class<?>> hasTypefaceViews;
    private final int mAttrId;
    private final Map<Class<? extends TextView>, Integer> mClassStyleAttributeMap;
    private final boolean mCustomViewTypefaceSupport;
    private final FontMapper mFontMapper;
    private final String mFontPath;
    private final boolean mIsFontSet;

    /* loaded from: classes-dex2jar.jar:io/github/inflationx/calligraphy3/CalligraphyConfig$Builder.class */
    public static class Builder {
        public static final int INVALID_ATTR_ID;
        private FontMapper fontMapper;
        private boolean customViewTypefaceSupport = false;
        private int attrId = R.attr.fontPath;
        private boolean isFontSet = false;
        private String fontAssetPath = null;
        private Map<Class<? extends TextView>, Integer> mStyleClassMap = new HashMap();
        private Set<Class<?>> mHasTypefaceClasses = new HashSet();

        public Builder addCustomStyle(Class<? extends TextView> cls, int i) {
            if (!(cls == null || i == 0)) {
                this.mStyleClassMap.put(cls, Integer.valueOf(i));
            }
            return this;
        }

        public Builder addCustomViewWithSetTypeface(Class<?> cls) {
            this.customViewTypefaceSupport = true;
            this.mHasTypefaceClasses.add(cls);
            return this;
        }

        public CalligraphyConfig build() {
            this.isFontSet = !TextUtils.isEmpty(this.fontAssetPath);
            return new CalligraphyConfig(this);
        }

        public Builder setDefaultFontPath(String str) {
            this.isFontSet = !TextUtils.isEmpty(str);
            this.fontAssetPath = str;
            return this;
        }

        public Builder setFontAttrId(int i) {
            this.attrId = i;
            return this;
        }

        public Builder setFontMapper(FontMapper fontMapper) {
            this.fontMapper = fontMapper;
            return this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        DEFAULT_STYLES = hashMap;
        hashMap.put(TextView.class, 16842884);
        hashMap.put(Button.class, 16842824);
        hashMap.put(EditText.class, 16842862);
        hashMap.put(AutoCompleteTextView.class, 16842859);
        hashMap.put(MultiAutoCompleteTextView.class, 16842859);
        hashMap.put(CheckBox.class, 16842860);
        hashMap.put(RadioButton.class, 16842878);
        hashMap.put(ToggleButton.class, 16842827);
        if (CalligraphyUtils.canAddV7AppCompatViews()) {
            addAppCompatViews();
        }
    }

    private CalligraphyConfig(Builder builder) {
        this.mIsFontSet = builder.isFontSet;
        this.mFontPath = builder.fontAssetPath;
        this.mAttrId = builder.attrId;
        this.mCustomViewTypefaceSupport = builder.customViewTypefaceSupport;
        HashMap hashMap = new HashMap(DEFAULT_STYLES);
        hashMap.putAll(builder.mStyleClassMap);
        this.mClassStyleAttributeMap = Collections.unmodifiableMap(hashMap);
        this.hasTypefaceViews = Collections.unmodifiableSet(builder.mHasTypefaceClasses);
        this.mFontMapper = builder.fontMapper;
    }

    private static void addAppCompatViews() {
        Map<Class<? extends TextView>, Integer> map = DEFAULT_STYLES;
        map.put(setTypeface.class, 16842884);
        map.put(setSupportImageTintMode.class, 16842824);
        map.put(setPopupBackgroundDrawable.class, 16842862);
        map.put(setCheckMarkDrawable.class, 16842859);
        map.put(setCompoundDrawablesRelative.class, 16842859);
        map.put(setAdapter.class, 16842860);
        map.put(setCompoundDrawables.class, 16842878);
        map.put(setImageURI.class, 16843720);
    }

    public int getAttrId() {
        return this.mAttrId;
    }

    public Map<Class<? extends TextView>, Integer> getClassStyles() {
        return this.mClassStyleAttributeMap;
    }

    public FontMapper getFontMapper() {
        return this.mFontMapper;
    }

    public String getFontPath() {
        return this.mFontPath;
    }

    public boolean isCustomViewHasTypeface(View view) {
        return this.hasTypefaceViews.contains(view.getClass());
    }

    public boolean isCustomViewTypefaceSupport() {
        return this.mCustomViewTypefaceSupport;
    }

    public boolean isFontSet() {
        return this.mIsFontSet;
    }
}
