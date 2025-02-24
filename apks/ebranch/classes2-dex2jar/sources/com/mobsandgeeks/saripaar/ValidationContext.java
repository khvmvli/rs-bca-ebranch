package com.mobsandgeeks.saripaar;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/ValidationContext.class */
public class ValidationContext {
    private Context mContext;
    private Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> mViewRulesMap;

    ValidationContext(Context context) {
        this.mContext = context;
    }

    private void assertIsRegisteredAnnotation(Class<? extends Annotation> cls) {
        if (!Validator.isSaripaarAnnotation(cls)) {
            throw new IllegalArgumentException(String.format("%s is not a registered Saripaar annotation.", cls.getName()));
        }
    }

    private void assertNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("'%s' cannot be null.", str));
        }
    }

    private Class<? extends AnnotationRule> getRuleClass(Class<? extends Annotation> cls) {
        return cls.getAnnotation(ValidateUsing.class).value();
    }

    public List<View> getAnnotatedViews(Class<? extends Annotation> cls) {
        assertNotNull(cls, "saripaarAnnotation");
        assertIsRegisteredAnnotation(cls);
        Class<? extends AnnotationRule> ruleClass = getRuleClass(cls);
        ArrayList arrayList = new ArrayList();
        for (View view : this.mViewRulesMap.keySet()) {
            Iterator<Pair<Rule, ViewDataAdapter>> it = this.mViewRulesMap.get(view).iterator();
            while (it.hasNext()) {
                if (ruleClass.equals(((Rule) it.next().first).getClass()) && !arrayList.contains(view)) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Object getData(View view, Class<? extends Annotation> cls) {
        assertNotNull(view, "view");
        assertNotNull(cls, "saripaarAnnotation");
        ArrayList<Pair<Rule, ViewDataAdapter>> arrayList = this.mViewRulesMap.get(view);
        Class<? extends AnnotationRule> ruleClass = getRuleClass(cls);
        Iterator<Pair<Rule, ViewDataAdapter>> it = arrayList.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Pair<Rule, ViewDataAdapter> next = it.next();
            obj = obj;
            if (ruleClass.equals(((Rule) next.first).getClass())) {
                try {
                    obj = ((ViewDataAdapter) next.second).getData(view);
                } catch (ConversionException e) {
                    e.printStackTrace();
                    obj = obj;
                }
            }
        }
        return obj;
    }

    void setViewRulesMap(Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> map) {
        this.mViewRulesMap = map;
    }
}
