package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.findFragmentByWho;
import o.getPopEnterAnim;
import o.getPopExitAnim;
import o.setAppSearchData;
import o.setHasDecor;
import o.setHasDecor$MediaBrowserCompat$CustomActionResultReceiver;
import o.setHasDecor$MediaBrowserCompat$ItemReceiver;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setHasDecor$MediaBrowserCompat$SearchResultReceiver;
import o.setIconifiedByDefault;
import o.setMenu;
import o.setOnSearchClickListener;
import o.setSubmitButtonEnabled;
import o.setWeightSum;
/* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView.class */
public class SearchView extends setWeightSum implements setMenu {
    static final SearchView$MediaBrowserCompat$CustomActionResultReceiver c;
    private int A;
    private final TextView.OnEditorActionListener B;
    private CharSequence C;
    private read D;
    private final AdapterView.OnItemSelectedListener E;
    private View.OnClickListener F;
    private RemoteActionCompatParcelizer G;
    private final AdapterView.OnItemClickListener H;
    private final WeakHashMap<String, Drawable.ConstantState> I;
    private boolean J;
    private final Drawable K;
    private Runnable L;
    private final View M;
    private CharSequence N;
    private final View O;
    private Rect P;
    private Rect Q;
    private int[] R;
    private boolean S;
    private SearchView$MediaBrowserCompat$SearchResultReceiver T;
    private final Runnable U;
    private TextWatcher V;
    private int[] W;
    final View a;
    private boolean aa;
    private CharSequence ab;
    Bundle b;
    final ImageView d;
    final ImageView e;
    final View f;
    write g;
    View.OnFocusChangeListener h;
    final ImageView i;
    boolean j;
    SearchableInfo k;
    getPopExitAnim l;
    public final int m;
    public final int n;

    /* renamed from: o */
    final SearchView$MediaBrowserCompat$ItemReceiver f3o;
    final ImageView p;
    final Intent q;
    private boolean r;
    final Intent s;
    View.OnKeyListener t;
    private boolean u;
    private int v;
    private final CharSequence w;
    private boolean x;
    private final ImageView y;
    private final View.OnClickListener z;

    /* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends getPopEnterAnim {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<IconCompatParcelizer>() { // from class: androidx.appcompat.widget.SearchView.IconCompatParcelizer.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ IconCompatParcelizer createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IconCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        boolean c;

        public IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        IconCompatParcelizer(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }

        @Override // o.getPopEnterAnim, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$read.class */
    public interface read {
        boolean d();
    }

    /* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$write.class */
    public interface write {
        boolean b();

        boolean d();
    }

    static {
        c = Build.VERSION.SDK_INT < 29 ? new SearchView$MediaBrowserCompat$CustomActionResultReceiver() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.L);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new int[2];
        this.W = new int[2];
        this.U = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.k();
            }
        };
        this.L = new Runnable() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (SearchView.this.l instanceof setAppSearchData) {
                    SearchView.this.l.a((Cursor) null);
                }
            }
        };
        this.I = new WeakHashMap<>();
        AnonymousClass7 r0 = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == SearchView.this.i) {
                    SearchView.this.d();
                } else if (view == SearchView.this.e) {
                    SearchView.this.b();
                } else if (view == SearchView.this.d) {
                    SearchView.this.i();
                } else if (view == SearchView.this.p) {
                    SearchView searchView = SearchView.this;
                    SearchableInfo searchableInfo = searchView.k;
                    if (searchableInfo != null) {
                        try {
                            String str = null;
                            String str2 = null;
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.s);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity != null) {
                                    str2 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str2);
                                searchView.getContext().startActivity(intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.q;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                Bundle bundle2 = searchView.b;
                                if (bundle2 != null) {
                                    bundle.putParcelable("app_data", bundle2);
                                }
                                Intent intent4 = new Intent(intent2);
                                Resources resources = searchView.getResources();
                                String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                                String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                                intent4.putExtra("android.speech.extra.PROMPT", string2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", string3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                                if (searchActivity2 != null) {
                                    str = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                searchView.getContext().startActivity(intent4);
                            }
                        } catch (ActivityNotFoundException e) {
                            Log.w("SearchView", "Could not find voice search activity");
                        }
                    }
                } else if (view == SearchView.this.f3o) {
                    SearchView.this.a();
                }
            }
        };
        this.z = r0;
        this.t = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.k == null) {
                    return false;
                }
                if (!SearchView.this.f3o.isPopupShowing() || SearchView.this.f3o.getListSelection() == -1) {
                    if ((TextUtils.getTrimmedLength(SearchView.this.f3o.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                        return false;
                    }
                    view.cancelLongPress();
                    SearchView searchView = SearchView.this;
                    searchView.getContext().startActivity(searchView.c("android.intent.action.SEARCH", null, null, searchView.f3o.getText().toString(), 0, null));
                    return true;
                }
                SearchView searchView2 = SearchView.this;
                if (searchView2.k == null || searchView2.l == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i2 == 66 || i2 == 84 || i2 == 61) {
                    return searchView2.b(searchView2.f3o.getListSelection());
                }
                if (i2 == 21 || i2 == 22) {
                    searchView2.f3o.setSelection(i2 == 21 ? 0 : searchView2.f3o.length());
                    searchView2.f3o.setListSelection(0);
                    searchView2.f3o.clearListSelection();
                    searchView2.f3o.e();
                    return true;
                } else if (i2 != 19) {
                    return false;
                } else {
                    searchView2.f3o.getListSelection();
                    return false;
                }
            }
        };
        AnonymousClass8 r02 = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.i();
                return true;
            }
        };
        this.B = r02;
        AnonymousClass9 r03 = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.b(i2);
            }
        };
        this.H = r03;
        AnonymousClass6 r04 = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView searchView = SearchView.this;
                write write2 = searchView.g;
                if (write2 == null || !write2.b()) {
                    Editable text = searchView.f3o.getText();
                    Cursor a = searchView.l.a();
                    if (a == null) {
                        return;
                    }
                    if (a.moveToPosition(i2)) {
                        CharSequence e = searchView.l.e(a);
                        if (e != null) {
                            searchView.a(e);
                        } else {
                            searchView.a(text);
                        }
                    } else {
                        searchView.a(text);
                    }
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.E = r04;
        this.V = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.d(charSequence);
            }
        };
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.cq, i, 0));
        LayoutInflater.from(context).inflate(seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.cy, setHasDecor.MediaMetadataCompat.t), (ViewGroup) this, true);
        SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = (SearchView$MediaBrowserCompat$ItemReceiver) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.K);
        this.f3o = searchView$MediaBrowserCompat$ItemReceiver;
        searchView$MediaBrowserCompat$ItemReceiver.c = this;
        this.M = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.G);
        View findViewById = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.I);
        this.f = findViewById;
        View findViewById2 = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.Q);
        this.O = findViewById2;
        ImageView imageView = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.A);
        this.i = imageView;
        ImageView imageView2 = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.H);
        this.d = imageView2;
        ImageView imageView3 = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.F);
        this.e = imageView3;
        ImageView imageView4 = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.L);
        this.p = imageView4;
        ImageView imageView5 = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.E);
        this.y = imageView5;
        findFragmentByWho.b(findViewById, seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cD));
        findFragmentByWho.b(findViewById2, seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cF));
        imageView.setImageDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cH));
        imageView2.setImageDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cz));
        imageView3.setImageDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cw));
        imageView4.setImageDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cK));
        imageView5.setImageDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cH));
        this.K = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cG);
        setOnSearchClickListener.b(imageView, getResources().getString(setHasDecor$MediaBrowserCompat$ItemReceiver.q));
        this.n = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.cL, setHasDecor.MediaMetadataCompat.r);
        this.m = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.cA, 0);
        imageView.setOnClickListener(r0);
        imageView3.setOnClickListener(r0);
        imageView2.setOnClickListener(r0);
        imageView4.setOnClickListener(r0);
        searchView$MediaBrowserCompat$ItemReceiver.setOnClickListener(r0);
        searchView$MediaBrowserCompat$ItemReceiver.addTextChangedListener(this.V);
        searchView$MediaBrowserCompat$ItemReceiver.setOnEditorActionListener(r02);
        searchView$MediaBrowserCompat$ItemReceiver.setOnItemClickListener(r03);
        searchView$MediaBrowserCompat$ItemReceiver.setOnItemSelectedListener(r04);
        searchView$MediaBrowserCompat$ItemReceiver.setOnKeyListener(this.t);
        searchView$MediaBrowserCompat$ItemReceiver.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.h != null) {
                    SearchView.this.h.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.cB, true));
        int dimensionPixelSize = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.cv, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.w = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.cC);
        this.N = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.cE);
        int i2 = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.cu, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.cx, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.ct, true));
        seticonifiedbydefault.d.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchView$MediaBrowserCompat$ItemReceiver.getDropDownAnchor());
        this.a = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    SearchView searchView = SearchView.this;
                    if (searchView.a.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean d = setSubmitButtonEnabled.d(searchView);
                        int dimensionPixelSize2 = searchView.j ? resources.getDimensionPixelSize(setHasDecor.write.e) + resources.getDimensionPixelSize(setHasDecor.write.j) : 0;
                        searchView.f3o.getDropDownBackground().getPadding(rect);
                        searchView.f3o.setDropDownHorizontalOffset(d ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize2));
                        searchView.f3o.setDropDownWidth((((searchView.a.getWidth() + rect.left) + rect.right) + dimensionPixelSize2) - paddingLeft);
                    }
                }
            });
        }
        b(this.j);
        CharSequence l = l();
        this.f3o.setHint(e(l == null ? "" : l));
    }

    private void b(boolean z) {
        this.x = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f3o.getText());
        this.i.setVisibility(i2);
        e(z2);
        this.M.setVisibility(z ? 8 : 0);
        if (this.y.getDrawable() == null || this.j) {
            i = 8;
        }
        this.y.setVisibility(i);
        m();
        d(!z2);
        n();
    }

    public static boolean b(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean c(int i, int i2, String str) {
        Cursor a = this.l.a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        Intent d = d(a, 0, str);
        if (d == null) {
            return true;
        }
        try {
            getContext().startActivity(d);
            return true;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Failed launch activity: ");
            sb.append(d);
            Log.e("SearchView", sb.toString(), e);
            return true;
        }
    }

    private Intent d(Cursor cursor, int i, String str) {
        int i2;
        try {
            String a = setAppSearchData.a(cursor, "suggest_intent_action");
            String str2 = a;
            if (a == null) {
                str2 = this.k.getSuggestIntentAction();
            }
            String str3 = str2;
            if (str2 == null) {
                str3 = "android.intent.action.SEARCH";
            }
            String a2 = setAppSearchData.a(cursor, "suggest_intent_data");
            String str4 = a2;
            if (a2 == null) {
                str4 = this.k.getSuggestIntentData();
            }
            String str5 = str4;
            if (str4 != null) {
                String a3 = setAppSearchData.a(cursor, "suggest_intent_data_id");
                str5 = str4;
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    str5 = sb.toString();
                }
            }
            return c(str3, str5 == null ? null : Uri.parse(str5), setAppSearchData.a(cursor, "suggest_intent_extra_data"), setAppSearchData.a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException e2) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    private void d(boolean z) {
        int i = 8;
        if (this.aa) {
            i = 8;
            if (!this.x) {
                i = 8;
                if (z) {
                    this.d.setVisibility(8);
                    i = 0;
                }
            }
        }
        this.p.setVisibility(i);
    }

    private CharSequence e(CharSequence charSequence) {
        if (!this.j || this.K == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f3o.getTextSize()) * 1.25d);
        this.K.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.K), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void e(boolean z) {
        int i;
        boolean z2 = this.S;
        if (z2) {
            if (((z2 || this.aa) && !this.x) && hasFocus()) {
                i = 0;
                if (!z) {
                    if (!this.aa) {
                        i = 0;
                    }
                }
                this.d.setVisibility(i);
            }
        }
        i = 8;
        this.d.setVisibility(i);
    }

    private CharSequence l() {
        CharSequence charSequence = this.N;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.k;
            charSequence2 = (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.w : getContext().getText(this.k.getHintId());
        }
        return charSequence2;
    }

    private void m() {
        boolean z = !TextUtils.isEmpty(this.f3o.getText());
        int i = 0;
        boolean z2 = true;
        if (!z) {
            z2 = this.j && !this.u;
        }
        ImageView imageView = this.e;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void n() {
        int i;
        if ((this.S || this.aa) && !this.x) {
            i = 0;
            if (this.d.getVisibility() != 0) {
                if (this.p.getVisibility() == 0) {
                    i = 0;
                }
            }
            this.O.setVisibility(i);
        }
        i = 8;
        this.O.setVisibility(i);
    }

    final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3o.refreshAutoCompleteResults();
            return;
        }
        SearchView$MediaBrowserCompat$CustomActionResultReceiver searchView$MediaBrowserCompat$CustomActionResultReceiver = c;
        SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = this.f3o;
        if (Build.VERSION.SDK_INT < 29) {
            Method method = searchView$MediaBrowserCompat$CustomActionResultReceiver.e;
            if (method != null) {
                try {
                    method.invoke(searchView$MediaBrowserCompat$ItemReceiver, new Object[0]);
                } catch (Exception e) {
                }
            }
            SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver2 = this.f3o;
            if (Build.VERSION.SDK_INT < 29) {
                Method method2 = searchView$MediaBrowserCompat$CustomActionResultReceiver.b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchView$MediaBrowserCompat$ItemReceiver2, new Object[0]);
                    } catch (Exception e2) {
                    }
                }
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public void a(CharSequence charSequence) {
        this.f3o.setText(charSequence);
        this.f3o.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    final void b() {
        if (!TextUtils.isEmpty(this.f3o.getText())) {
            this.f3o.setText("");
            this.f3o.requestFocus();
            this.f3o.c(true);
        } else if (this.j) {
            read read2 = this.D;
            if (read2 == null || !read2.d()) {
                clearFocus();
                b(true);
            }
        }
    }

    final boolean b(int i) {
        write write2 = this.g;
        if (write2 != null && write2.d()) {
            return false;
        }
        c(i, 0, null);
        this.f3o.c(false);
        this.f3o.dismissDropDown();
        return true;
    }

    Intent c(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.ab);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.b;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.k.getSearchActivity());
        return intent;
    }

    @Override // o.setMenu
    public final void c() {
        setQuery("", false);
        clearFocus();
        b(true);
        this.f3o.setImeOptions(this.v);
        this.u = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.r = true;
        clearFocus();
        this.f3o.clearFocus();
        this.f3o.c(false);
        this.r = false;
    }

    final void d() {
        b(false);
        this.f3o.requestFocus();
        this.f3o.c(true);
        View.OnClickListener onClickListener = this.F;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    final void d(CharSequence charSequence) {
        Editable text = this.f3o.getText();
        this.ab = text;
        boolean z = !TextUtils.isEmpty(text);
        e(z);
        d(!z);
        m();
        n();
        if (this.G != null && !TextUtils.equals(charSequence, this.C)) {
            this.G.a(charSequence.toString());
        }
        this.C = charSequence.toString();
    }

    @Override // o.setMenu
    public final void e() {
        if (!this.u) {
            this.u = true;
            int imeOptions = this.f3o.getImeOptions();
            this.v = imeOptions;
            this.f3o.setImeOptions(imeOptions | 33554432);
            this.f3o.setText("");
            setIconified(false);
        }
    }

    final void i() {
        Editable text = this.f3o.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.G;
            if (remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.b(text.toString())) {
                if (this.k != null) {
                    getContext().startActivity(c("android.intent.action.SEARCH", null, null, text.toString(), 0, null));
                }
                this.f3o.c(false);
                this.f3o.dismissDropDown();
            }
        }
    }

    final void k() {
        int[] iArr = this.f3o.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void o() {
        b(this.x);
        post(this.U);
        if (this.f3o.hasFocus()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.U);
        post(this.L);
        onDetachedFromWindow();
    }

    @Override // o.setWeightSum, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = this.f3o;
            Rect rect = this.P;
            searchView$MediaBrowserCompat$ItemReceiver.getLocationInWindow(this.R);
            getLocationInWindow(this.W);
            int[] iArr = this.R;
            int i5 = iArr[1];
            int[] iArr2 = this.W;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchView$MediaBrowserCompat$ItemReceiver.getWidth() + i7, searchView$MediaBrowserCompat$ItemReceiver.getHeight() + i6);
            this.Q.set(this.P.left, 0, this.P.right, i4 - i2);
            SearchView$MediaBrowserCompat$SearchResultReceiver searchView$MediaBrowserCompat$SearchResultReceiver = this.T;
            if (searchView$MediaBrowserCompat$SearchResultReceiver == null) {
                SearchView$MediaBrowserCompat$SearchResultReceiver searchView$MediaBrowserCompat$SearchResultReceiver2 = new TouchDelegate(this.Q, this.P, this.f3o) { // from class: androidx.appcompat.widget.SearchView$MediaBrowserCompat$SearchResultReceiver
                    private final int a;
                    private final View b;
                    private boolean c;
                    private final Rect h = new Rect();
                    private final Rect e = new Rect();
                    private final Rect d = new Rect();

                    {
                        this.a = ViewConfiguration.get(r7.getContext()).getScaledTouchSlop();
                        a(r5, r6);
                        this.b = r7;
                    }

                    public final void a(Rect rect2, Rect rect3) {
                        this.h.set(rect2);
                        this.e.set(rect2);
                        Rect rect4 = this.e;
                        int i8 = -this.a;
                        rect4.inset(i8, i8);
                        this.d.set(rect3);
                    }

                    @Override // android.view.TouchDelegate
                    public final boolean onTouchEvent(MotionEvent motionEvent) {
                        boolean z2;
                        boolean z3;
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        int action = motionEvent.getAction();
                        boolean z4 = false;
                        if (action == 0) {
                            if (this.h.contains(x, y)) {
                                this.c = true;
                                z2 = true;
                                z3 = true;
                            }
                            z2 = false;
                            z3 = true;
                        } else if (action == 1 || action == 2) {
                            boolean z5 = this.c;
                            z2 = z5;
                            z3 = true;
                            if (z5) {
                                z2 = z5;
                                z3 = true;
                                if (!this.e.contains(x, y)) {
                                    z3 = false;
                                    z2 = z5;
                                }
                            }
                        } else {
                            if (action == 3) {
                                z2 = this.c;
                                this.c = false;
                                z3 = true;
                            }
                            z2 = false;
                            z3 = true;
                        }
                        if (z2) {
                            if (!z3 || this.d.contains(x, y)) {
                                motionEvent.setLocation((float) (x - this.d.left), (float) (y - this.d.top));
                            } else {
                                motionEvent.setLocation((float) (this.b.getWidth() / 2), (float) (this.b.getHeight() / 2));
                            }
                            z4 = this.b.dispatchTouchEvent(motionEvent);
                        }
                        return z4;
                    }
                };
                this.T = searchView$MediaBrowserCompat$SearchResultReceiver2;
                setTouchDelegate(searchView$MediaBrowserCompat$SearchResultReceiver2);
                return;
            }
            searchView$MediaBrowserCompat$SearchResultReceiver.a(this.Q, this.P);
        }
    }

    @Override // o.setWeightSum, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.x) {
            onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.A;
            i3 = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(setHasDecor.write.f), size);
        } else if (mode == 0) {
            int i5 = this.A;
            i3 = i5;
            if (i5 <= 0) {
                i3 = getContext().getResources().getDimensionPixelSize(setHasDecor.write.f);
            }
        } else if (mode != 1073741824) {
            i3 = size;
        } else {
            int i6 = this.A;
            i3 = size;
            if (i6 > 0) {
                i3 = Math.min(i6, size);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(setHasDecor.write.h), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(setHasDecor.write.h);
        }
        onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof IconCompatParcelizer)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) parcelable;
        onRestoreInstanceState(iconCompatParcelizer.d);
        b(iconCompatParcelizer.c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(onSaveInstanceState());
        iconCompatParcelizer.c = this.x;
        return iconCompatParcelizer;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        onWindowFocusChanged(z);
        post(this.U);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.r || !isFocusable()) {
            return false;
        }
        if (this.x) {
            return requestFocus(i, rect);
        }
        boolean requestFocus = this.f3o.requestFocus(i, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.b = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            b();
        } else {
            d();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.j != z) {
            this.j = z;
            b(z);
            CharSequence l = l();
            SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = this.f3o;
            CharSequence charSequence = l;
            if (l == null) {
                charSequence = "";
            }
            searchView$MediaBrowserCompat$ItemReceiver.setHint(e(charSequence));
        }
    }

    public void setImeOptions(int i) {
        this.f3o.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3o.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A = i;
        requestLayout();
    }

    public void setOnCloseListener(read read2) {
        this.D = read2;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.h = onFocusChangeListener;
    }

    public void setOnQueryTextListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.G = remoteActionCompatParcelizer;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
    }

    public void setOnSuggestionListener(write write2) {
        this.g = write2;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f3o.setText(charSequence);
        if (charSequence != null) {
            SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = this.f3o;
            searchView$MediaBrowserCompat$ItemReceiver.setSelection(searchView$MediaBrowserCompat$ItemReceiver.length());
            this.ab = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            i();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.N = charSequence;
        CharSequence l = l();
        SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = this.f3o;
        CharSequence charSequence2 = l;
        if (l == null) {
            charSequence2 = "";
        }
        searchView$MediaBrowserCompat$ItemReceiver.setHint(e(charSequence2));
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.J = z;
        getPopExitAnim getpopexitanim = this.l;
        if (getpopexitanim instanceof setAppSearchData) {
            ((setAppSearchData) getpopexitanim).e = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
        if (getContext().getPackageManager().resolveActivity(r8, 65536) != null) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.S = z;
        b(this.x);
    }

    public void setSuggestionsAdapter(getPopExitAnim getpopexitanim) {
        this.l = getpopexitanim;
        this.f3o.setAdapter(getpopexitanim);
    }
}
