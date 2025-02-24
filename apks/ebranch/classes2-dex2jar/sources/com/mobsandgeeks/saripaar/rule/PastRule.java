package com.mobsandgeeks.saripaar.rule;

import android.content.Context;
import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.Past;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/PastRule.class */
public class PastRule extends ContextualAnnotationRule<Past, String> {
    protected PastRule(Past past, ValidationContext validationContext) {
        super(past, validationContext);
    }

    private DateFormat getDateFormat() {
        Context context = this.mValidationContext.getContext();
        int dateFormatResId = this.mRuleAnnotation.dateFormatResId();
        return new SimpleDateFormat(dateFormatResId != -1 ? context.getString(dateFormatResId) : this.mRuleAnnotation.dateFormat());
    }

    public boolean isValid(String str) {
        Date date;
        try {
            date = getDateFormat().parse(str);
        } catch (ParseException e) {
            date = null;
        }
        return date != null && date.before(new Date());
    }
}
