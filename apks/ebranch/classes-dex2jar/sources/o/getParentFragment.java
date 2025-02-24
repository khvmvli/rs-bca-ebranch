package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.getShowsDialog;
/* loaded from: classes-dex2jar.jar:o/getParentFragment.class */
public final class getParentFragment {

    /* loaded from: classes-dex2jar.jar:o/getParentFragment$read.class */
    static class read implements ActionMode.Callback {
        private Class<?> a;
        private boolean b;
        private boolean c = false;
        private final ActionMode.Callback d;
        private Method e;
        private final TextView f;

        read(ActionMode.Callback callback, TextView textView) {
            this.d = callback;
            this.f = textView;
        }

        private void b(Menu menu) {
            Context context = this.f.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.c) {
                this.c = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.a = cls;
                    this.e = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.b = true;
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    this.a = null;
                    this.e = null;
                    this.b = false;
                }
            }
            try {
                Method declaredMethod = (!this.b || !this.a.isInstance(menu)) ? menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.e;
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> d = d(context, packageManager);
                for (int i = 0; i < d.size(); i++) {
                    ResolveInfo resolveInfo = d.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(c(resolveInfo, this.f)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            }
        }

        private Intent c(ResolveInfo resolveInfo, TextView textView) {
            return d().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !c(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        private boolean c(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            boolean z = true;
            if (resolveInfo.activityInfo.permission != null) {
                z = context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0;
            }
            return z;
        }

        private boolean c(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent d() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private List<ResolveInfo> d(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(d(), 0)) {
                if (c(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.d.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.d.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.d.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            b(menu);
            return this.d.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static void a(TextView textView, int i) {
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void a(TextView textView, getShowsDialog.read read2) {
        textView.setTextDirection(d(read2.a()));
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = read2.e().getTextScaleX();
            textView.getPaint().set(read2.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(read2.e());
        textView.setBreakStrategy(read2.b());
        textView.setHyphenationFrequency(read2.c());
    }

    public static void a(TextView textView, getShowsDialog getshowsdialog) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(getshowsdialog.a());
        } else if (e(textView).e(getshowsdialog.c())) {
            textView.setText(getshowsdialog);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static Drawable[] b(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void c(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    public static void c(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof getNextTransition) {
            ((getNextTransition) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void c(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof getNextTransition) {
            ((getNextTransition) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static int d(TextView textView) {
        return textView.getMaxLines();
    }

    public static ActionMode.Callback d(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof read)) ? callback : new read(callback, textView);
    }

    public static void d(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static getShowsDialog.read e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new getShowsDialog.read(textView.getTextMetricsParams());
        }
        getShowsDialog$read$MediaBrowserCompat$CustomActionResultReceiver getshowsdialog_read_mediabrowsercompat_customactionresultreceiver = new Object(new TextPaint(textView.getPaint())) { // from class: o.getShowsDialog$read$MediaBrowserCompat$CustomActionResultReceiver
            private final TextPaint a;
            private int c;
            private TextDirectionHeuristic d;
            private int e;

            {
                this.a = r4;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.e = 1;
                } else {
                    this.e = 0;
                    this.c = 0;
                }
                this.d = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public getShowsDialog$read$MediaBrowserCompat$CustomActionResultReceiver a(int i) {
                this.e = i;
                return this;
            }

            public getShowsDialog$read$MediaBrowserCompat$CustomActionResultReceiver b(int i) {
                this.c = i;
                return this;
            }

            public getShowsDialog.read c() {
                return new getShowsDialog.read(this.a, this.d, this.c, this.e);
            }

            public getShowsDialog$read$MediaBrowserCompat$CustomActionResultReceiver e(TextDirectionHeuristic textDirectionHeuristic) {
                this.d = textDirectionHeuristic;
                return this;
            }
        };
        if (Build.VERSION.SDK_INT >= 23) {
            getshowsdialog_read_mediabrowsercompat_customactionresultreceiver.b(textView.getBreakStrategy());
            getshowsdialog_read_mediabrowsercompat_customactionresultreceiver.a(textView.getHyphenationFrequency());
        }
        getshowsdialog_read_mediabrowsercompat_customactionresultreceiver.e(i(textView));
        return getshowsdialog_read_mediabrowsercompat_customactionresultreceiver.c();
    }

    public static void e(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    private static TextDirectionHeuristic i(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }
}
