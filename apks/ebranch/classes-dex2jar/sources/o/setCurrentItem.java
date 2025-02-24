package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import o.setPageMargin;
/* loaded from: classes-dex2jar.jar:o/setCurrentItem.class */
public class setCurrentItem extends setPopupBackgroundDrawable implements TextWatcher {
    private String a;
    private String b;
    private char c;
    protected int d;
    public setOffscreenPageLimit e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private View.OnFocusChangeListener j;
    private boolean k;
    private String l;
    private boolean m;
    private int[] n;

    /* renamed from: o  reason: collision with root package name */
    private int f214o;
    private boolean r;
    private int s;
    private int[] t;

    public setCurrentItem(Context context) {
        super(context);
        addTextChangedListener(this);
    }

    public setCurrentItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addTextChangedListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setPageMargin.read.s);
        this.l = obtainStyledAttributes.getString(setPageMargin.read.v);
        this.b = obtainStyledAttributes.getString(setPageMargin.read.x);
        this.a = obtainStyledAttributes.getString(setPageMargin.read.w);
        String string = obtainStyledAttributes.getString(setPageMargin.read.u);
        if (string == null) {
            this.c = (char) 35;
        } else {
            this.c = string.charAt(0);
        }
        this.k = obtainStyledAttributes.getBoolean(setPageMargin.read.y, false);
        b();
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.setCurrentItem.2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return true;
            }
        });
        obtainStyledAttributes.recycle();
    }

    public setCurrentItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addTextChangedListener(this);
    }

    private void a() {
        int[] iArr = new int[this.l.length()];
        this.n = new int[this.l.length()];
        String str = "";
        int i = 0;
        for (int i2 = 0; i2 < this.l.length(); i2++) {
            char charAt = this.l.charAt(i2);
            if (charAt == this.c) {
                iArr[i] = i2;
                this.n[i2] = i;
                i++;
                str = str;
            } else {
                String ch = Character.toString(charAt);
                str = str;
                if (!str.contains(ch)) {
                    str = str.concat(ch);
                }
                this.n[i2] = -1;
            }
        }
        this.t = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.t[i3] = iArr[i3];
        }
    }

    private void b() {
        this.m = false;
        a();
        this.e = new setOffscreenPageLimit();
        this.s = this.t[0];
        this.f = true;
        this.g = true;
        this.i = true;
        if (!(getHint() != null) || this.e.e.length() != 0) {
            setText(c());
        } else {
            setText(f());
        }
        this.f = false;
        this.g = false;
        this.i = false;
        this.d = this.n[e(this.l.length() - 1)] + 1;
        this.f214o = d();
        this.m = true;
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.setCurrentItem.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (setCurrentItem.this.j != null) {
                    setCurrentItem.this.j.onFocusChange(view, z);
                }
                if (setCurrentItem.this.hasFocus()) {
                    setCurrentItem.this.r = false;
                    setCurrentItem setcurrentitem = setCurrentItem.this;
                    setcurrentitem.setSelection(setcurrentitem.e());
                }
            }
        });
    }

    private String c() {
        int length = this.e.e.length();
        int[] iArr = this.t;
        int length2 = length < iArr.length ? iArr[this.e.e.length()] : this.l.length();
        char[] cArr = new char[length2];
        for (int i = 0; i < length2; i++) {
            int i2 = this.n[i];
            if (i2 == -1) {
                cArr[i] = this.l.charAt(i);
            } else {
                cArr[i] = this.e.e.charAt(i2);
            }
        }
        return new String(cArr);
    }

    private int d() {
        for (int length = this.n.length - 1; length >= 0; length--) {
            if (this.n[length] != -1) {
                return length;
            }
        }
        throw new RuntimeException("Mask must contain at least one representation char");
    }

    private int d(int i) {
        int i2;
        while (true) {
            i2 = this.f214o;
            if (i >= i2 || this.n[i] != -1) {
                break;
            }
            i++;
        }
        return i > i2 ? i2 + 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e() {
        return this.e.e.length() == this.d ? this.t[this.e.e.length() - 1] + 1 : d(this.t[this.e.e.length()]);
    }

    private int e(int i) {
        int i2;
        while (true) {
            i2 = i;
            if (i < 0) {
                break;
            }
            i2 = i;
            if (this.n[i] != -1) {
                break;
            }
            int i3 = i - 1;
            i = i3;
            if (i3 < 0) {
                i2 = d(0);
                break;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (r9 >= r0[r6.e.e.length()]) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.CharSequence f() {
        /*
            r6 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            int[] r0 = r0.t
            r1 = 0
            r0 = r0[r1]
            r8 = r0
            r0 = 0
            r9 = r0
        L_0x0011:
            r0 = r9
            r1 = r6
            java.lang.String r1 = r1.l
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x00c9
            r0 = r6
            int[] r0 = r0.n
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L_0x0064
            r0 = r10
            r1 = r6
            o.setOffscreenPageLimit r1 = r1.e
            java.lang.String r1 = r1.e
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x004d
            r0 = r7
            r1 = r6
            o.setOffscreenPageLimit r1 = r1.e
            java.lang.String r1 = r1.e
            r2 = r10
            char r1 = r1.charAt(r2)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            goto L_0x0071
        L_0x004d:
            r0 = r7
            r1 = r6
            java.lang.CharSequence r1 = r1.getHint()
            r2 = r6
            int[] r2 = r2.n
            r3 = r9
            r2 = r2[r3]
            char r1 = r1.charAt(r2)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            goto L_0x0071
        L_0x0064:
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.l
            r2 = r9
            char r1 = r1.charAt(r2)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
        L_0x0071:
            r0 = r6
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x00a3
            r0 = r6
            o.setOffscreenPageLimit r0 = r0.e
            java.lang.String r0 = r0.e
            int r0 = r0.length()
            r10 = r0
            r0 = r6
            int[] r0 = r0.t
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00a3
            r0 = r9
            r1 = r11
            r2 = r6
            o.setOffscreenPageLimit r2 = r2.e
            java.lang.String r2 = r2.e
            int r2 = r2.length()
            r1 = r1[r2]
            if (r0 >= r1) goto L_0x00af
        L_0x00a3:
            r0 = r6
            boolean r0 = r0.k
            if (r0 != 0) goto L_0x00c3
            r0 = r9
            r1 = r8
            if (r0 < r1) goto L_0x00c3
        L_0x00af:
            r0 = r7
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r2 = r1
            r3 = r6
            int r3 = r3.getCurrentHintTextColor()
            r2.<init>(r3)
            r2 = r9
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            r4 = 0
            r0.setSpan(r1, r2, r3, r4)
        L_0x00c3:
            int r9 = r9 + 1
            goto L_0x0011
        L_0x00c9:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCurrentItem.f():java.lang.CharSequence");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!this.i && this.f && this.g) {
            boolean z = true;
            this.i = true;
            if (getHint() == null) {
                z = false;
            }
            if (!z || (!this.k && this.e.e.length() != 0)) {
                setText(c());
            } else {
                setText(f());
            }
            this.r = false;
            setSelection(this.s);
            this.f = false;
            this.g = false;
            this.i = false;
            this.h = false;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int e;
        if (!this.f) {
            this.f = true;
            if (i > this.f214o) {
                this.h = true;
            }
            if (i3 == 0) {
                int i5 = i;
                while (true) {
                    i4 = i5;
                    if (i5 <= 0) {
                        break;
                    }
                    i4 = i5;
                    if (this.n[i5] != -1) {
                        break;
                    }
                    i5--;
                }
            } else {
                i4 = i;
            }
            int i6 = i + i2;
            setOnPageChangeListener setonpagechangelistener = new setOnPageChangeListener();
            int i7 = i4;
            while (i7 <= i6 && i7 < this.l.length()) {
                if (this.n[i7] != -1) {
                    if (setonpagechangelistener.e == -1) {
                        setonpagechangelistener.e = this.n[i7];
                    }
                    setonpagechangelistener.a = this.n[i7];
                }
                i7++;
            }
            if (i6 == this.l.length()) {
                setonpagechangelistener.a = this.e.e.length();
            }
            if (setonpagechangelistener.e == setonpagechangelistener.a && i4 < i6 && (e = e(setonpagechangelistener.e - 1)) < setonpagechangelistener.e) {
                setonpagechangelistener.e = e;
            }
            if (setonpagechangelistener.e != -1) {
                setOffscreenPageLimit setoffscreenpagelimit = this.e;
                String substring = (setonpagechangelistener.e <= 0 || setonpagechangelistener.e > setoffscreenpagelimit.e.length()) ? "" : setoffscreenpagelimit.e.substring(0, setonpagechangelistener.e);
                String str = "";
                if (setonpagechangelistener.a >= 0) {
                    str = "";
                    if (setonpagechangelistener.a < setoffscreenpagelimit.e.length()) {
                        str = setoffscreenpagelimit.e.substring(setonpagechangelistener.a, setoffscreenpagelimit.e.length());
                    }
                }
                setoffscreenpagelimit.e = substring.concat(str);
            }
            if (i2 > 0) {
                this.s = e(i);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        onRestoreInstanceState(bundle.getParcelable("super"));
        String string = bundle.getString("text");
        StringBuilder sb = new StringBuilder("onRestoreInstanceState: ");
        sb.append(string);
        Log.d("ContentValues", sb.toString());
        setText(string);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putString("text", this.e.e);
        return bundle;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (this.m) {
            if (!this.r) {
                int e = i > e() ? e() : d(i);
                int e2 = i2 > e() ? e() : d(i2);
                int i5 = e;
                if (e > getText().length()) {
                    i5 = getText().length();
                }
                int i6 = i5;
                if (i5 < 0) {
                    i6 = 0;
                }
                int i7 = e2;
                if (e2 > getText().length()) {
                    i7 = getText().length();
                }
                int i8 = i7;
                if (i7 < 0) {
                    i8 = 0;
                }
                setSelection(i6, i8);
                this.r = true;
                i3 = i6;
                i4 = i8;
            } else {
                i3 = i;
                i4 = i2;
                if (i > this.e.e.length() - 1) {
                    int e3 = i > e() ? e() : d(i);
                    int e4 = i2 > e() ? e() : d(i2);
                    i3 = i;
                    i4 = i2;
                    if (e3 >= 0) {
                        i3 = i;
                        i4 = i2;
                        if (e4 < getText().length()) {
                            setSelection(e3, e4);
                            i4 = i2;
                            i3 = i;
                        }
                    }
                }
            }
        }
        onSelectionChanged(i3, i4);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.g && this.f) {
            this.g = true;
            if (!this.h && i3 > 0) {
                int i4 = this.n[d(i)];
                String charSequence2 = charSequence.subSequence(i, i3 + i).toString();
                setOffscreenPageLimit setoffscreenpagelimit = this.e;
                String str = this.a;
                String str2 = charSequence2;
                if (str != null) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    int i5 = 0;
                    while (true) {
                        str2 = charSequence2;
                        if (i5 >= length) {
                            break;
                        }
                        charSequence2 = charSequence2.replace(Character.toString(charArray[i5]), "");
                        i5++;
                    }
                }
                String str3 = str2;
                if (this.b != null) {
                    StringBuilder sb = new StringBuilder(str2.length());
                    char[] charArray2 = str2.toCharArray();
                    for (char c : charArray2) {
                        if (this.b.contains(String.valueOf(c))) {
                            sb.append(c);
                        }
                    }
                    str3 = sb.toString();
                }
                int i6 = this.d;
                int i7 = 0;
                if (str3 != null) {
                    i7 = 0;
                    if (!str3.equals("")) {
                        if (i4 < 0) {
                            throw new IllegalArgumentException("Start position must be non-negative");
                        } else if (i4 <= setoffscreenpagelimit.e.length()) {
                            i7 = str3.length();
                            String substring = i4 > 0 ? setoffscreenpagelimit.e.substring(0, i4) : "";
                            String str4 = "";
                            if (i4 >= 0) {
                                str4 = "";
                                if (i4 < setoffscreenpagelimit.e.length()) {
                                    String str5 = setoffscreenpagelimit.e;
                                    str4 = str5.substring(i4, str5.length());
                                }
                            }
                            if (setoffscreenpagelimit.e.length() + str3.length() > i6) {
                                i7 = i6 - setoffscreenpagelimit.e.length();
                                str3 = str3.substring(0, i7);
                            }
                            setoffscreenpagelimit.e = substring.concat(str3).concat(str4);
                        } else {
                            throw new IllegalArgumentException("Start position must be less than the actual text length");
                        }
                    }
                }
                if (this.m) {
                    int i8 = i4 + i7;
                    int[] iArr = this.t;
                    this.s = d(i8 < iArr.length ? iArr[i8] : this.f214o + 1);
                }
            }
        }
    }

    public void setCharRepresentation(char c) {
        this.c = (char) c;
        b();
    }

    public void setKeepHint(boolean z) {
        this.k = z;
        setText(this.e.e);
    }

    public void setMask(String str) {
        this.l = str;
        b();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.j = onFocusChangeListener;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setText(charSequence, bufferType);
    }
}
