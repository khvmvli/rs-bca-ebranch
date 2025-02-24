package com.mobsandgeeks.saripaar;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.mobsandgeeks.saripaar.adapter.CheckBoxBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioButtonBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioGroupBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.SpinnerIndexAdapter;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.AssertFalse;
import com.mobsandgeeks.saripaar.annotation.AssertTrue;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.ConfirmEmail;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.CreditCard;
import com.mobsandgeeks.saripaar.annotation.DecimalMax;
import com.mobsandgeeks.saripaar.annotation.DecimalMin;
import com.mobsandgeeks.saripaar.annotation.Digits;
import com.mobsandgeeks.saripaar.annotation.Domain;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.Future;
import com.mobsandgeeks.saripaar.annotation.IpAddress;
import com.mobsandgeeks.saripaar.annotation.Isbn;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.Max;
import com.mobsandgeeks.saripaar.annotation.Min;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Optional;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Past;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import com.mobsandgeeks.saripaar.annotation.Select;
import com.mobsandgeeks.saripaar.annotation.Url;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:com/mobsandgeeks/saripaar/Validator.class */
public class Validator {
    private static final Registry SARIPAAR_REGISTRY;
    private AsyncValidationTask mAsyncValidationTask;
    private Object mController;
    private Map<View, ArrayList<Pair<Annotation, ViewDataAdapter>>> mOptionalViewsMap;
    private boolean mOrderedFields;
    private boolean mValidateInvisibleViews;
    private ValidationContext mValidationContext;
    private ValidationListener mValidationListener;
    private Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> mViewRulesMap;
    private Handler mViewValidatedActionHandler;
    private final Map<Class<? extends View>, HashMap<Class<?>, ViewDataAdapter>> mRegisteredAdaptersMap = new HashMap();
    private Mode mValidationMode = Mode.BURST;
    private SequenceComparator mSequenceComparator = new SequenceComparator();
    private ViewValidatedAction mViewValidatedAction = new DefaultViewValidatedAction();

    /* loaded from: classes-dex2jar.jar:com/mobsandgeeks/saripaar/Validator$Mode.class */
    public enum Mode {
        BURST,
        IMMEDIATE
    }

    /* loaded from: classes-dex2jar.jar:com/mobsandgeeks/saripaar/Validator$ValidationListener.class */
    public interface ValidationListener {
        void onValidationFailed(List<ValidationError> list);

        void onValidationSucceeded();
    }

    static {
        Registry registry = new Registry();
        SARIPAAR_REGISTRY = registry;
        registry.register(CheckBox.class, Boolean.class, new CheckBoxBooleanAdapter(), new Class[]{AssertFalse.class, AssertTrue.class, Checked.class});
        registry.register(RadioGroup.class, Boolean.class, new RadioGroupBooleanAdapter(), new Class[]{Checked.class});
        registry.register(RadioButton.class, Boolean.class, new RadioButtonBooleanAdapter(), new Class[]{AssertFalse.class, AssertTrue.class, Checked.class});
        registry.register(Spinner.class, Integer.class, new SpinnerIndexAdapter(), new Class[]{Select.class});
        registry.register(new Class[]{DecimalMax.class, DecimalMin.class});
        registry.register(new Class[]{Max.class, Min.class});
        registry.register(new Class[]{ConfirmEmail.class, ConfirmPassword.class, CreditCard.class, Digits.class, Domain.class, Email.class, Future.class, IpAddress.class, Isbn.class, Length.class, NotEmpty.class, Password.class, Past.class, Pattern.class, Url.class});
    }

    public Validator(Object obj) {
        assertNotNull(obj, "controller");
        this.mController = obj;
        if (obj instanceof Activity) {
            this.mValidationContext = new ValidationContext((Activity) obj);
        } else if (obj instanceof Fragment) {
            this.mValidationContext = new ValidationContext(((Fragment) obj).getActivity());
        }
    }

    private static void assertNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("'%s' cannot be null.", str));
        }
    }

    private void assertOrderedFields(boolean z, String str) {
        if (!z) {
            StringBuilder sb = new StringBuilder("Rules are unordered, all view fields should be ordered using the '@Order' annotation ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    private boolean containsOptionalValue(View view) {
        ArrayList<Pair<Annotation, ViewDataAdapter>> arrayList = this.mOptionalViewsMap.get(view);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair<Annotation, ViewDataAdapter> pair = arrayList.get(i);
            if (((ViewDataAdapter) pair.second).containsOptionalValue(view, (Annotation) pair.first)) {
                return true;
            }
        }
        return false;
    }

    private Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> createRules(List<Field> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Field field = list.get(i);
            ArrayList arrayList = new ArrayList();
            Annotation[] annotations = field.getAnnotations();
            boolean hasOptionalAnnotation = hasOptionalAnnotation(annotations);
            if (hasOptionalAnnotation && this.mOptionalViewsMap == null) {
                this.mOptionalViewsMap = new HashMap();
            }
            View view = getView(field);
            for (Annotation annotation : annotations) {
                if (isSaripaarAnnotation(annotation.annotationType())) {
                    Pair<Rule, ViewDataAdapter> ruleAdapterPair = getRuleAdapterPair(annotation, field);
                    arrayList.add(ruleAdapterPair);
                    if (hasOptionalAnnotation) {
                        ArrayList<Pair<Annotation, ViewDataAdapter>> arrayList2 = this.mOptionalViewsMap.get(view);
                        ArrayList<Pair<Annotation, ViewDataAdapter>> arrayList3 = arrayList2;
                        if (arrayList2 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList3.add(new Pair<>(annotation, ruleAdapterPair.second));
                        this.mOptionalViewsMap.put(view, arrayList3);
                    }
                }
            }
            Collections.sort(arrayList, this.mSequenceComparator);
            linkedHashMap.put(view, arrayList);
        }
        return linkedHashMap;
    }

    private void createRulesSafelyAndLazily(boolean z) {
        if (this.mViewRulesMap == null) {
            Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> createRules = createRules(getSaripaarAnnotatedFields(this.mController.getClass()));
            this.mViewRulesMap = createRules;
            this.mValidationContext.setViewRulesMap(createRules);
        }
        if (!z && this.mViewRulesMap.size() == 0) {
            throw new IllegalStateException("No rules found. You must have at least one rule to validate. If you are using custom annotations, make sure that you have registered them using the 'Validator.register()' method.");
        }
    }

    private Context getContext(Field field) {
        Context context;
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            context = ((View) field.get(this.mController)).getContext();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            context = null;
        }
        return context;
    }

    private List<Field> getControllerViewFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getViewFields(cls));
        for (Class<? super Object> superclass = cls.getSuperclass(); !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Field> viewFields = getViewFields(superclass);
            if (viewFields.size() > 0) {
                arrayList.addAll(viewFields);
            }
        }
        return arrayList;
    }

    private ViewDataAdapter getDataAdapter(Class<? extends Annotation> cls, Class<?> cls2, Class<?> cls3) {
        ViewDataAdapter dataAdapter = SARIPAAR_REGISTRY.getDataAdapter(cls, cls2);
        ViewDataAdapter viewDataAdapter = dataAdapter;
        if (dataAdapter == null) {
            HashMap<Class<?>, ViewDataAdapter> hashMap = this.mRegisteredAdaptersMap.get(cls2);
            viewDataAdapter = hashMap != null ? hashMap.get(cls3) : null;
        }
        return viewDataAdapter;
    }

    private View getLastView() {
        Iterator<View> it = this.mViewRulesMap.keySet().iterator();
        View view = null;
        while (it.hasNext()) {
            view = it.next();
        }
        return view;
    }

    private Pair<Rule, ViewDataAdapter> getRuleAdapterPair(Annotation annotation, Field field) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<?> type = field.getType();
        Class<?> ruleDataType = Reflector.getRuleDataType(annotation);
        ViewDataAdapter dataAdapter = getDataAdapter(annotationType, type, ruleDataType);
        if (dataAdapter != null) {
            if (this.mValidationContext == null) {
                this.mValidationContext = new ValidationContext(getContext(field));
            }
            return new Pair<>(Reflector.instantiateRule(getRuleType(annotation), annotation, this.mValidationContext), dataAdapter);
        }
        String name = type.getName();
        throw new UnsupportedOperationException(String.format("To use '%s' on '%s', register a '%s' that returns a '%s' from the '%s'.", annotationType.getName(), name, ViewDataAdapter.class.getName(), ruleDataType.getName(), name));
    }

    private Class<? extends AnnotationRule> getRuleType(Annotation annotation) {
        ValidateUsing validateUsing = (ValidateUsing) annotation.annotationType().getAnnotation(ValidateUsing.class);
        return validateUsing != null ? validateUsing.value() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
        if (((java.lang.reflect.Field) r0.get(0)).getAnnotation(com.mobsandgeeks.saripaar.annotation.Order.class) != null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.util.List<java.lang.reflect.Field> getSaripaarAnnotatedFields(java.lang.Class<?> r5) {
        /*
            r4 = this;
            com.mobsandgeeks.saripaar.Registry r0 = com.mobsandgeeks.saripaar.Validator.SARIPAAR_REGISTRY
            java.util.Set r0 = r0.getRegisteredAnnotations()
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r4
            r1 = r5
            java.util.List r0 = r0.getControllerViewFields(r1)
            r8 = r0
            r0 = r8
            int r0 = r0.size()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
        L_0x0025:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L_0x0050
            r0 = r8
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r5 = r0
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.isSaripaarAnnotatedField(r1, r2)
            if (r0 == 0) goto L_0x004a
            r0 = r7
            r1 = r5
            boolean r0 = r0.add(r1)
        L_0x004a:
            int r11 = r11 + 1
            goto L_0x0025
        L_0x0050:
            com.mobsandgeeks.saripaar.SaripaarFieldsComparator r0 = new com.mobsandgeeks.saripaar.SaripaarFieldsComparator
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r7
            r1 = r5
            java.util.Collections.sort(r0, r1)
            r0 = r7
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0081
            r0 = r10
            r12 = r0
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class<com.mobsandgeeks.saripaar.annotation.Order> r1 = com.mobsandgeeks.saripaar.annotation.Order.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            if (r0 == 0) goto L_0x009f
            goto L_0x009c
        L_0x0081:
            r0 = r10
            r12 = r0
            r0 = r7
            int r0 = r0.size()
            if (r0 == 0) goto L_0x009f
            r0 = r5
            boolean r0 = r0.areOrderedFields()
            if (r0 != 0) goto L_0x009c
            r0 = r10
            r12 = r0
            goto L_0x009f
        L_0x009c:
            r0 = 1
            r12 = r0
        L_0x009f:
            r0 = r4
            r1 = r12
            r0.mOrderedFields = r1
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobsandgeeks.saripaar.Validator.getSaripaarAnnotatedFields(java.lang.Class):java.util.List");
    }

    private ValidationReport getValidationReport(View view, Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> map, Mode mode) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Set<View> keySet = map.keySet();
        boolean z3 = view != null;
        Iterator<View> it = keySet.iterator();
        boolean z4 = false;
        loop0: while (true) {
            z = z4;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            ArrayList<Pair<Rule, ViewDataAdapter>> arrayList3 = map.get(next);
            Map<View, ArrayList<Pair<Annotation, ViewDataAdapter>>> map2 = this.mOptionalViewsMap;
            if (!(map2 != null && map2.containsKey(next)) || !containsOptionalValue(next)) {
                int size = arrayList3.size();
                ArrayList arrayList4 = null;
                z = z4;
                boolean z5 = z3;
                for (int i = 0; i < size; i++) {
                    boolean isEnabled = next.isEnabled();
                    boolean z6 = !next.isShown() && !this.mValidateInvisibleViews;
                    if ((!isEnabled) || z6) {
                        arrayList4 = arrayList4;
                        z5 = z5;
                    } else {
                        Pair<Rule, ViewDataAdapter> pair = arrayList3.get(i);
                        Rule validateViewWithRule = validateViewWithRule(next, (Rule) pair.first, (ViewDataAdapter) pair.second);
                        boolean z7 = i + 1 == size;
                        if (validateViewWithRule != null) {
                            if (z5) {
                                arrayList = arrayList4;
                                if (arrayList4 == null) {
                                    arrayList = new ArrayList();
                                    arrayList2.add(new ValidationError(next, arrayList));
                                }
                                arrayList.add(validateViewWithRule);
                            } else {
                                z = true;
                                arrayList = arrayList4;
                            }
                            z2 = z;
                            arrayList4 = arrayList;
                            if (Mode.IMMEDIATE.equals(mode)) {
                                z2 = z;
                                arrayList4 = arrayList;
                                if (z7) {
                                    break loop0;
                                }
                            }
                        } else {
                            z2 = z;
                        }
                        z5 = z5;
                        z = z2;
                        arrayList4 = arrayList4;
                        if (next.equals(view)) {
                            z5 = z5;
                            z = z2;
                            arrayList4 = arrayList4;
                            if (z7) {
                                z5 = false;
                                z = z2;
                                arrayList4 = arrayList4;
                            }
                        }
                    }
                }
                z3 = z5;
                z4 = z;
                if ((arrayList4 == null || arrayList4.size() == 0) && !z) {
                    ViewValidatedAction viewValidatedAction = this.mViewValidatedAction;
                    z3 = z5;
                    z4 = z;
                    if (viewValidatedAction != null) {
                        triggerViewValidatedCallback(viewValidatedAction, next);
                        z3 = z5;
                        z4 = z;
                    }
                }
            }
        }
        return new ValidationReport(arrayList2, z);
    }

    private View getView(Field field) {
        IllegalArgumentException e;
        IllegalAccessException e2;
        View view;
        View view2 = null;
        view2 = null;
        try {
            field.setAccessible(true);
            view = (View) field.get(this.mController);
        } catch (IllegalAccessException e3) {
            e2 = e3;
        } catch (IllegalArgumentException e4) {
            e = e4;
        }
        if (view != null) {
            view2 = view;
            return view2;
        }
        try {
            throw new IllegalStateException(String.format("'%s %s' is null.", field.getType().getSimpleName(), field.getName()));
        } catch (IllegalAccessException e5) {
            e2 = e5;
            view2 = view;
            e2.printStackTrace();
            return view2;
        } catch (IllegalArgumentException e6) {
            e = e6;
            view2 = view;
            e.printStackTrace();
            return view2;
        }
    }

    private View getViewBefore(View view) {
        View view2;
        ArrayList arrayList = new ArrayList(this.mViewRulesMap.keySet());
        int size = arrayList.size();
        int i = 0;
        while (true) {
            view2 = null;
            if (i >= size) {
                break;
            } else if (((View) arrayList.get(i)) == view) {
                view2 = null;
                if (i > 0) {
                    view2 = (View) arrayList.get(i - 1);
                }
            } else {
                i++;
            }
        }
        return view2;
    }

    private List<Field> getViewFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            if (View.class.isAssignableFrom(field.getType())) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    private boolean hasOptionalAnnotation(Annotation[] annotationArr) {
        if (annotationArr == null || annotationArr.length <= 0) {
            return false;
        }
        for (Annotation annotation : annotationArr) {
            if (Optional.class.equals(annotation.annotationType())) {
                return true;
            }
        }
        return false;
    }

    private boolean isSaripaarAnnotatedField(Field field, Set<Class<? extends Annotation>> set) {
        boolean z;
        boolean z2 = field.getAnnotation(Order.class) != null;
        if (!z2) {
            Annotation[] annotations = field.getAnnotations();
            int length = annotations.length;
            int i = 0;
            z = false;
            while (i < length) {
                boolean contains = set.contains(annotations[i].annotationType());
                z = contains;
                if (contains) {
                    break;
                }
                i++;
                z = contains;
            }
        } else {
            z = false;
        }
        boolean z3 = true;
        if (!z2) {
            z3 = z;
        }
        return z3;
    }

    static boolean isSaripaarAnnotation(Class<? extends Annotation> cls) {
        return SARIPAAR_REGISTRY.getRegisteredAnnotations().contains(cls);
    }

    public static void registerAnnotation(Class<? extends Annotation> cls) {
        SARIPAAR_REGISTRY.register(new Class[]{cls});
    }

    public static <VIEW extends View> void registerAnnotation(Class<? extends Annotation> cls, Class<VIEW> cls2, ViewDataAdapter<VIEW, ?> viewDataAdapter) {
        SARIPAAR_REGISTRY.register(cls2, Reflector.getRuleDataType((ValidateUsing) cls.getAnnotation(ValidateUsing.class)), viewDataAdapter, new Class[]{cls});
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mViewValidatedActionHandler == null) {
            this.mViewValidatedActionHandler = new Handler(Looper.getMainLooper());
        }
        this.mViewValidatedActionHandler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerValidationListenerCallback(ValidationReport validationReport) {
        List<ValidationError> list = validationReport.errors;
        if (list.size() != 0 || validationReport.hasMoreErrors) {
            this.mValidationListener.onValidationFailed(list);
        } else {
            this.mValidationListener.onValidationSucceeded();
        }
    }

    private void triggerViewValidatedCallback(ViewValidatedAction viewValidatedAction, View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            viewValidatedAction.onAllRulesPassed(view);
        } else {
            runOnMainThread(new 1(this, viewValidatedAction, view));
        }
    }

    private void validateFieldsWithCallbackTill(View view, boolean z, String str, boolean z2) {
        createRulesSafelyAndLazily(false);
        if (z2) {
            AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
            if (asyncValidationTask != null) {
                asyncValidationTask.cancel(true);
            }
            AsyncValidationTask asyncValidationTask2 = new AsyncValidationTask(this, view, z, str);
            this.mAsyncValidationTask = asyncValidationTask2;
            asyncValidationTask2.execute(null);
            return;
        }
        triggerValidationListenerCallback(validateTill(view, z, str));
    }

    private void validateOrderedFieldsWithCallbackTill(View view, String str, boolean z) {
        validateFieldsWithCallbackTill(view, true, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValidationReport validateTill(View view, boolean z, String str) {
        ValidationReport validationReport;
        synchronized (this) {
            if (z) {
                assertOrderedFields(this.mOrderedFields, str);
            }
            assertNotNull(this.mValidationListener, "validationListener");
            validationReport = getValidationReport(view, this.mViewRulesMap, this.mValidationMode);
        }
        return validationReport;
    }

    private void validateUnorderedFieldsWithCallbackTill(View view, boolean z) {
        validateFieldsWithCallbackTill(view, false, null, z);
    }

    private Rule validateViewWithRule(View view, Rule rule, ViewDataAdapter viewDataAdapter) {
        boolean isValid;
        if (rule instanceof AnnotationRule) {
            try {
                isValid = rule.isValid(viewDataAdapter.getData(view));
            } catch (ConversionException e) {
                e.printStackTrace();
            }
        } else {
            if (rule instanceof QuickRule) {
                isValid = rule.isValid(view);
            }
            isValid = false;
        }
        if (isValid) {
            rule = null;
        }
        return rule;
    }

    public boolean cancelAsync() {
        boolean z;
        AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
        if (asyncValidationTask != null) {
            z = asyncValidationTask.cancel(true);
            this.mAsyncValidationTask = null;
        } else {
            z = false;
        }
        return z;
    }

    public Mode getValidationMode() {
        return this.mValidationMode;
    }

    public boolean isValidating() {
        AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
        return (asyncValidationTask == null || asyncValidationTask.getStatus() == AsyncTask.Status.FINISHED) ? false : true;
    }

    public <VIEW extends View> void put(VIEW view, QuickRule<VIEW>... quickRuleArr) {
        assertNotNull(view, "view");
        assertNotNull(quickRuleArr, "quickRules");
        if (quickRuleArr.length != 0) {
            if (this.mValidationContext == null) {
                this.mValidationContext = new ValidationContext(view.getContext());
            }
            createRulesSafelyAndLazily(true);
            if (!this.mOrderedFields || this.mViewRulesMap.containsKey(view)) {
                ArrayList<Pair<Rule, ViewDataAdapter>> arrayList = this.mViewRulesMap.get(view);
                ArrayList<Pair<Rule, ViewDataAdapter>> arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList<>();
                }
                for (QuickRule<VIEW> quickRule : quickRuleArr) {
                    if (quickRule != null) {
                        arrayList2.add(new Pair<>(quickRule, null));
                    }
                }
                Collections.sort(arrayList2, this.mSequenceComparator);
                this.mViewRulesMap.put(view, arrayList2);
                return;
            }
            throw new IllegalStateException(String.format("All fields are ordered, so this `%s` should be ordered too, declare the view as a field and add the `@Order` annotation.", view.getClass().getName()));
        }
        throw new IllegalArgumentException("'quickRules' cannot be empty.");
    }

    public <VIEW extends View, DATA_TYPE> void registerAdapter(Class<VIEW> cls, ViewDataAdapter<VIEW, DATA_TYPE> viewDataAdapter) {
        assertNotNull(cls, "viewType");
        assertNotNull(viewDataAdapter, "viewDataAdapter");
        HashMap<Class<?>, ViewDataAdapter> hashMap = this.mRegisteredAdaptersMap.get(cls);
        HashMap<Class<?>, ViewDataAdapter> hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap2 = new HashMap<>();
            this.mRegisteredAdaptersMap.put(cls, hashMap2);
        }
        hashMap2.put(Reflector.findGetDataMethod(viewDataAdapter.getClass()).getReturnType(), viewDataAdapter);
    }

    public void removeRules(View view) {
        assertNotNull(view, "view");
        if (this.mViewRulesMap == null) {
            createRulesSafelyAndLazily(false);
        }
        this.mViewRulesMap.remove(view);
    }

    public void setValidationListener(ValidationListener validationListener) {
        assertNotNull(validationListener, "validationListener");
        this.mValidationListener = validationListener;
    }

    public void setValidationMode(Mode mode) {
        assertNotNull(mode, "validationMode");
        this.mValidationMode = mode;
    }

    public void setViewValidatedAction(ViewValidatedAction viewValidatedAction) {
        this.mViewValidatedAction = viewValidatedAction;
    }

    public void validate() {
        validate(false);
    }

    public void validate(boolean z) {
        createRulesSafelyAndLazily(false);
        View lastView = getLastView();
        if (Mode.BURST.equals(this.mValidationMode)) {
            validateUnorderedFieldsWithCallbackTill(lastView, z);
        } else if (Mode.IMMEDIATE.equals(this.mValidationMode)) {
            validateOrderedFieldsWithCallbackTill(lastView, String.format("in %s mode.", Mode.IMMEDIATE.toString()), z);
        } else {
            throw new RuntimeException("This should never happen!");
        }
    }

    public void validateBefore(View view) {
        validateBefore(view, false);
    }

    public void validateBefore(View view, boolean z) {
        createRulesSafelyAndLazily(false);
        validateOrderedFieldsWithCallbackTill(getViewBefore(view), "when using 'validateBefore(View)'.", z);
    }

    public void validateInvisibleViews(boolean z) {
        this.mValidateInvisibleViews = z;
    }

    public void validateTill(View view) {
        validateTill(view, false);
    }

    public void validateTill(View view, boolean z) {
        validateOrderedFieldsWithCallbackTill(view, "when using 'validateTill(View)'.", z);
    }
}
