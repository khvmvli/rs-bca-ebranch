package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import io.realm.internal.Property;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setAppSearchData.class */
public final class setAppSearchData extends getPostOnViewCreatedAlpha implements View.OnClickListener {
    private final int l;
    private final Context p;
    private final WeakHashMap<String, Drawable.ConstantState> q;
    private final SearchView r;
    private final SearchableInfo t;
    private ColorStateList x;
    private boolean m = false;
    public int e = 1;
    private int s = -1;
    private int v = -1;
    private int y = -1;
    private int k = -1;
    private int n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f198o = -1;

    /* loaded from: classes-dex2jar.jar:o/setAppSearchData$write.class */
    static final class write {
        public final TextView a;
        public final ImageView b;
        public final ImageView c;
        public final ImageView d;
        public final TextView e;

        public write(View view) {
            this.e = (TextView) view.findViewById(16908308);
            this.a = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.b = (ImageView) view.findViewById(16908296);
            this.d = (ImageView) view.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.s);
        }
    }

    public setAppSearchData(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.n, null, true);
        this.r = searchView;
        this.t = searchableInfo;
        this.l = searchView.m;
        this.p = context;
        this.q = weakHashMap;
    }

    private Drawable a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return d(uri);
                } catch (Resources.NotFoundException e) {
                    StringBuilder sb = new StringBuilder("Resource does not exist: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
            } else {
                InputStream openInputStream = this.p.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder("Error closing icon stream for ");
                        sb2.append(uri);
                        Log.e("SuggestionsAdapter", sb2.toString(), e2);
                    }
                    return createFromStream;
                }
                StringBuilder sb3 = new StringBuilder("Failed to open ");
                sb3.append(uri);
                throw new FileNotFoundException(sb3.toString());
            }
        } catch (FileNotFoundException e3) {
            StringBuilder sb4 = new StringBuilder("Icon not found: ");
            sb4.append(uri);
            sb4.append(", ");
            sb4.append(e3.getMessage());
            Log.w("SuggestionsAdapter", sb4.toString());
            return null;
        }
        StringBuilder sb42 = new StringBuilder("Icon not found: ");
        sb42.append(uri);
        sb42.append(", ");
        sb42.append(e3.getMessage());
        Log.w("SuggestionsAdapter", sb42.toString());
        return null;
    }

    public static String a(Cursor cursor, String str) {
        return d(cursor, cursor.getColumnIndex(str));
    }

    private static void c(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private Drawable d(ComponentName componentName) {
        PackageManager packageManager = this.p.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, Property.TYPE_ARRAY);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            Log.w("SuggestionsAdapter", sb.toString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    private Drawable d(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.p.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException e) {
                            StringBuilder sb = new StringBuilder("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    StringBuilder sb3 = new StringBuilder("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder sb5 = new StringBuilder("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    private static String d(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private Drawable e(String str) {
        Drawable drawable = null;
        Drawable drawable2 = null;
        if (str != null) {
            drawable2 = null;
            if (!str.isEmpty()) {
                drawable2 = null;
                if (!"0".equals(str)) {
                    try {
                        int parseInt = Integer.parseInt(str);
                        StringBuilder sb = new StringBuilder("android.resource://");
                        sb.append(this.p.getPackageName());
                        sb.append("/");
                        sb.append(parseInt);
                        String obj = sb.toString();
                        Drawable.ConstantState constantState = this.q.get(obj);
                        Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                        if (newDrawable != null) {
                            return newDrawable;
                        }
                        Drawable b = copyWindowDataInto.b(this.p, parseInt);
                        if (b != null) {
                            this.q.put(obj, b.getConstantState());
                        }
                        return b;
                    } catch (Resources.NotFoundException e) {
                        StringBuilder sb2 = new StringBuilder("Icon resource not found: ");
                        sb2.append(str);
                        Log.w("SuggestionsAdapter", sb2.toString());
                        return null;
                    } catch (NumberFormatException e2) {
                        Drawable.ConstantState constantState2 = this.q.get(str);
                        if (constantState2 != null) {
                            drawable = constantState2.newDrawable();
                        }
                        if (drawable != null) {
                            return drawable;
                        }
                        Drawable a = a(Uri.parse(str));
                        drawable2 = a;
                        if (a != null) {
                            this.q.put(str, a.getConstantState());
                            drawable2 = a;
                        }
                    }
                }
            }
        }
        return drawable2;
    }

    @Override // o.getPopExitAnim, o.getPopDirection.read
    public final Cursor a(CharSequence charSequence) {
        Cursor cursor;
        String suggestAuthority;
        String[] strArr;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.r.getVisibility() != 0 || this.r.getWindowVisibility() != 0) {
            return null;
        }
        try {
            SearchableInfo searchableInfo = this.t;
            if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                cursor = null;
            } else {
                Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                String suggestPath = searchableInfo.getSuggestPath();
                if (suggestPath != null) {
                    fragment.appendEncodedPath(suggestPath);
                }
                fragment.appendPath("search_suggest_query");
                String suggestSelection = searchableInfo.getSuggestSelection();
                if (suggestSelection != null) {
                    strArr = new String[]{charSequence2};
                } else {
                    fragment.appendPath(charSequence2);
                    strArr = null;
                }
                fragment.appendQueryParameter("limit", "50");
                cursor = this.p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
            }
            if (cursor == null) {
                return null;
            }
            cursor.getCount();
            return cursor;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            return null;
        }
    }

    @Override // o.getPopExitAnim, o.getPopDirection.read
    public final void a(Cursor cursor) {
        if (this.m) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            a(cursor);
            if (cursor != null) {
                this.s = cursor.getColumnIndex("suggest_text_1");
                this.v = cursor.getColumnIndex("suggest_text_2");
                this.y = cursor.getColumnIndex("suggest_text_2_url");
                this.k = cursor.getColumnIndex("suggest_icon_1");
                this.n = cursor.getColumnIndex("suggest_icon_2");
                this.f198o = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o.getPostOnViewCreatedAlpha, o.getPopExitAnim
    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = b(context, cursor, viewGroup);
        b.setTag(new write(b));
        ((ImageView) b.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.s)).setImageResource(this.l);
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getPopExitAnim
    public final void b(View view, Cursor cursor) {
        Drawable drawable;
        String str;
        write write2 = (write) view.getTag();
        int i = this.f198o;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (write2.e != null) {
            String d = d(cursor, this.s);
            TextView textView = write2.e;
            textView.setText(d);
            if (TextUtils.isEmpty(d)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (write2.a != null) {
            String d2 = d(cursor, this.y);
            if (d2 != null) {
                if (this.x == null) {
                    TypedValue typedValue = new TypedValue();
                    this.p.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.P, typedValue, true);
                    this.x = this.p.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(d2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.x, null), 0, d2.length(), 33);
                str = spannableString;
            } else {
                str = d(cursor, this.v);
            }
            if (TextUtils.isEmpty(str)) {
                if (write2.e != null) {
                    write2.e.setSingleLine(false);
                    write2.e.setMaxLines(2);
                }
            } else if (write2.e != null) {
                write2.e.setSingleLine(true);
                write2.e.setMaxLines(1);
            }
            TextView textView2 = write2.a;
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        Drawable drawable2 = null;
        if (write2.c != null) {
            ImageView imageView = write2.c;
            int i3 = this.k;
            if (i3 == -1) {
                drawable = null;
            } else {
                drawable = e(cursor.getString(i3));
                if (drawable == null) {
                    ComponentName searchActivity = this.t.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.q.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = this.q.get(flattenToShortString);
                        drawable = constantState == null ? null : constantState.newDrawable(this.p.getResources());
                    } else {
                        Drawable d3 = d(searchActivity);
                        this.q.put(flattenToShortString, d3 == null ? null : d3.getConstantState());
                        drawable = d3;
                    }
                    if (drawable == null) {
                        drawable = this.p.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            c(imageView, drawable, 4);
        }
        if (write2.b != null) {
            ImageView imageView2 = write2.b;
            int i4 = this.n;
            if (i4 != -1) {
                drawable2 = e(cursor.getString(i4));
            }
            c(imageView2, drawable2, 8);
        }
        int i5 = this.e;
        if (i5 == 2 || (i5 == 1 && (i2 & 1) != 0)) {
            write2.d.setVisibility(0);
            write2.d.setTag(write2.e.getText());
            write2.d.setOnClickListener(this);
            return;
        }
        write2.d.setVisibility(8);
    }

    @Override // o.getPopExitAnim, o.getPopDirection.read
    public final CharSequence e(Cursor cursor) {
        String d;
        String d2;
        if (cursor == null) {
            return null;
        }
        String d3 = d(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (d3 != null) {
            return d3;
        }
        if (this.t.shouldRewriteQueryFromData() && (d2 = d(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return d2;
        }
        if (!this.t.shouldRewriteQueryFromText() || (d = d(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return d;
    }

    @Override // o.getPopExitAnim, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = a(this.p, a(), viewGroup);
            if (a != null) {
                ((write) a.getTag()).e.setText(e.toString());
            }
            return a;
        }
    }

    @Override // o.getPopExitAnim, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = b(this.p, a(), viewGroup);
            if (b != null) {
                ((write) b.getTag()).e.setText(e.toString());
            }
            return b;
        }
    }

    @Override // o.getPopExitAnim, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        notifyDataSetChanged();
        Cursor a = a();
        Bundle extras = a != null ? a.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        notifyDataSetInvalidated();
        Cursor a = a();
        Bundle extras = a != null ? a.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.r.a((CharSequence) tag);
        }
    }
}
