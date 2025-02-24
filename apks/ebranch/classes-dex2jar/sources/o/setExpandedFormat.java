package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import o.setChecked;
import o.setWeightSum;
/* loaded from: classes-dex2jar.jar:o/setExpandedFormat.class */
public final class setExpandedFormat extends setContentHeight implements DialogInterface {
    public final setChecked a = new setChecked(getContext(), this, getWindow());

    /* loaded from: classes-dex2jar.jar:o/setExpandedFormat$write.class */
    public static class write {
        private final int b;
        public final setChecked.read c;

        public write(Context context) {
            this(context, setExpandedFormat.a(context, 0));
        }

        public write(Context context, int i) {
            this.c = new setChecked.read(new ContextThemeWrapper(context, setExpandedFormat.a(context, i)));
            this.b = i;
        }

        public setExpandedFormat b() {
            ListAdapter listAdapter;
            setExpandedFormat setexpandedformat = new setExpandedFormat(this.c.d, this.b);
            setChecked.read read = this.c;
            setChecked setchecked = setexpandedformat.a;
            View view = read.i;
            if (view != null) {
                setchecked.y = view;
            } else {
                CharSequence charSequence = read.I;
                if (charSequence != null) {
                    setchecked.J = charSequence;
                    TextView textView = setchecked.N;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = read.f;
                if (drawable != null) {
                    setchecked.x = drawable;
                    setchecked.w = 0;
                    ImageView imageView = setchecked.z;
                    if (imageView != null) {
                        if (drawable != null) {
                            imageView.setVisibility(0);
                            setchecked.z.setImageDrawable(drawable);
                        } else {
                            imageView.setVisibility(8);
                        }
                    }
                }
                int i = read.h;
                if (i != 0) {
                    setchecked.b(i);
                }
                int i2 = read.g;
                if (i2 != 0) {
                    TypedValue typedValue = new TypedValue();
                    setchecked.t.getTheme().resolveAttribute(i2, typedValue, true);
                    setchecked.b(typedValue.resourceId);
                }
            }
            CharSequence charSequence2 = read.q;
            if (charSequence2 != null) {
                setchecked.D = charSequence2;
                TextView textView2 = setchecked.E;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = read.F;
            if (!(charSequence3 == null && read.B == null)) {
                setchecked.b(-1, charSequence3, read.H, null, read.B);
            }
            CharSequence charSequence4 = read.r;
            if (!(charSequence4 == null && read.t == null)) {
                setchecked.b(-2, charSequence4, read.p, null, read.t);
            }
            CharSequence charSequence5 = read.x;
            if (!(charSequence5 == null && read.y == null)) {
                setchecked.b(-3, charSequence5, read.u, null, read.y);
            }
            if (!(read.n == null && read.j == null && read.a == null)) {
                setChecked.IconCompatParcelizer iconCompatParcelizer = (setChecked.IconCompatParcelizer) read.f206o.inflate(setchecked.C, (ViewGroup) null);
                if (read.m) {
                    listAdapter = read.j == null ? 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY(r15v11 'listAdapter' android.widget.ListAdapter A[REMOVE]) = ((wrap: android.database.Cursor : 0x018a: IGET  (r0v103 android.database.Cursor A[REMOVE]) = (r0v2 'read' o.setChecked$read) o.setChecked.read.j android.database.Cursor) == (null android.database.Cursor)) ? (wrap: android.widget.ListAdapter : 0x01a5: CONSTRUCTOR  (r15v11 'listAdapter' android.widget.ListAdapter A[REMOVE]) = 
                          (r0v2 'read' o.setChecked$read)
                          (wrap: android.content.Context : 0x0196: IGET  (r3v9 android.content.Context A[REMOVE]) = (r0v2 'read' o.setChecked$read) o.setChecked.read.d android.content.Context)
                          (wrap: int : 0x019a: IGET  (r4v8 int A[REMOVE]) = (r0v4 'setchecked' o.setChecked) o.setChecked.H int)
                          (16908308 int)
                          (wrap: java.lang.CharSequence[] : 0x01a0: IGET  (r6v5 java.lang.CharSequence[] A[REMOVE]) = (r0v2 'read' o.setChecked$read) o.setChecked.read.n java.lang.CharSequence[])
                          (r0v66 'iconCompatParcelizer' o.setChecked$IconCompatParcelizer)
                         call: o.setChecked.read.5.<init>(o.setChecked$read, android.content.Context, int, int, java.lang.CharSequence[], o.setChecked$IconCompatParcelizer):void type: CONSTRUCTOR) : (wrap: android.widget.ListAdapter : 0x01be: CONSTRUCTOR  (r15v10 'listAdapter' android.widget.ListAdapter A[REMOVE]) = 
                          (r0v2 'read' o.setChecked$read)
                          (wrap: android.content.Context : 0x01b3: IGET  (r3v7 android.content.Context A[REMOVE]) = (r0v2 'read' o.setChecked$read) o.setChecked.read.d android.content.Context)
                          (wrap: android.database.Cursor : 0x01b7: IGET  (r4v6 android.database.Cursor A[REMOVE]) = (r0v2 'read' o.setChecked$read) o.setChecked.read.j android.database.Cursor)
                          false
                          (r0v66 'iconCompatParcelizer' o.setChecked$IconCompatParcelizer)
                          (r0v4 'setchecked' o.setChecked)
                         call: o.setChecked.read.2.<init>(o.setChecked$read, android.content.Context, android.database.Cursor, boolean, o.setChecked$IconCompatParcelizer, o.setChecked):void type: CONSTRUCTOR) in method: o.setExpandedFormat.write.b():o.setExpandedFormat, file: classes-dex2jar.jar:o/setExpandedFormat$write.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setChecked, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1020)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:496)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 27 more
                        */
                    /*
                    // Method dump skipped, instructions count: 876
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setExpandedFormat.write.b():o.setExpandedFormat");
                }

                public write c(View view) {
                    this.c.i = view;
                    return this;
                }

                public write c(CharSequence charSequence) {
                    this.c.q = charSequence;
                    return this;
                }

                public write c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.c.F = charSequence;
                    this.c.H = onClickListener;
                    return this;
                }

                public write d(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
                    this.c.a = listAdapter;
                    this.c.z = onClickListener;
                    return this;
                }

                public write d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.c.r = charSequence;
                    this.c.p = onClickListener;
                    return this;
                }

                public final Context e() {
                    return this.c.d;
                }

                public write e(DialogInterface.OnKeyListener onKeyListener) {
                    this.c.A = onKeyListener;
                    return this;
                }

                public write e(Drawable drawable) {
                    this.c.f = drawable;
                    return this;
                }

                public write e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
                    this.c.a = listAdapter;
                    this.c.z = onClickListener;
                    this.c.e = i;
                    this.c.l = true;
                    return this;
                }

                public write e(CharSequence charSequence) {
                    this.c.I = charSequence;
                    return this;
                }
            }

            protected setExpandedFormat(Context context, int i) {
                super(context, a(context, i));
            }

            static int a(Context context, int i) {
                if ((i >>> 24) > 0) {
                    return i;
                }
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.q, typedValue, true);
                return typedValue.resourceId;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.setContentHeight, android.app.Dialog
            public final void onCreate(Bundle bundle) {
                boolean z;
                ListAdapter listAdapter;
                View findViewById;
                View findViewById2;
                onCreate(bundle);
                setChecked setchecked = this.a;
                int i = setchecked.l;
                if (i == 0 || setchecked.k != 1) {
                    i = setchecked.e;
                }
                setchecked.v.setContentView(i);
                View findViewById3 = setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.D);
                View findViewById4 = findViewById3.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.T);
                View findViewById5 = findViewById3.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.n);
                View findViewById6 = findViewById3.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.m);
                ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.q);
                View view = setchecked.M;
                View view2 = null;
                int i2 = 0;
                View view3 = view;
                if (view == null) {
                    view3 = setchecked.K != 0 ? LayoutInflater.from(setchecked.t).inflate(setchecked.K, viewGroup, false) : null;
                }
                boolean z2 = view3 != null;
                if (!z2 || !setChecked.d(view3)) {
                    setchecked.R.setFlags(131072, 131072);
                }
                if (z2) {
                    FrameLayout frameLayout = (FrameLayout) setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.f232o);
                    frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
                    if (setchecked.P) {
                        frameLayout.setPadding(setchecked.S, setchecked.O, setchecked.Q, setchecked.L);
                    }
                    if (setchecked.A != null) {
                        ((setWeightSum.IconCompatParcelizer) viewGroup.getLayoutParams()).weight = 0.0f;
                    }
                } else {
                    viewGroup.setVisibility(8);
                }
                View findViewById7 = viewGroup.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.T);
                View findViewById8 = viewGroup.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.n);
                View findViewById9 = viewGroup.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.m);
                ViewGroup a = setChecked.a(findViewById7, findViewById4);
                ViewGroup a2 = setChecked.a(findViewById8, findViewById5);
                ViewGroup a3 = setChecked.a(findViewById9, findViewById6);
                getLifecycle getlifecycle = (getLifecycle) setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.C);
                setchecked.I = getlifecycle;
                getlifecycle.setFocusable(false);
                setchecked.I.setNestedScrollingEnabled(false);
                TextView textView = (TextView) a2.findViewById(16908299);
                setchecked.E = textView;
                if (textView != null) {
                    CharSequence charSequence = setchecked.D;
                    if (charSequence != null) {
                        textView.setText(charSequence);
                    } else {
                        textView.setVisibility(8);
                        setchecked.I.removeView(setchecked.E);
                        if (setchecked.A != null) {
                            ViewGroup viewGroup2 = (ViewGroup) setchecked.I.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(setchecked.I);
                            viewGroup2.removeViewAt(indexOfChild);
                            viewGroup2.addView(setchecked.A, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        } else {
                            a2.setVisibility(8);
                        }
                    }
                }
                Button button = (Button) a3.findViewById(16908313);
                setchecked.m = button;
                button.setOnClickListener(setchecked.c);
                if (!TextUtils.isEmpty(setchecked.p) || setchecked.r != null) {
                    setchecked.m.setText(setchecked.p);
                    Drawable drawable = setchecked.r;
                    if (drawable != null) {
                        int i3 = setchecked.d;
                        drawable.setBounds(0, 0, i3, i3);
                        setchecked.m.setCompoundDrawables(setchecked.r, null, null, null);
                    }
                    setchecked.m.setVisibility(0);
                    z = true;
                } else {
                    setchecked.m.setVisibility(8);
                    z = false;
                }
                Button button2 = (Button) a3.findViewById(16908314);
                setchecked.a = button2;
                button2.setOnClickListener(setchecked.c);
                if (!TextUtils.isEmpty(setchecked.h) || setchecked.i != null) {
                    setchecked.a.setText(setchecked.h);
                    Drawable drawable2 = setchecked.i;
                    if (drawable2 != null) {
                        int i4 = setchecked.d;
                        drawable2.setBounds(0, 0, i4, i4);
                        setchecked.a.setCompoundDrawables(setchecked.i, null, null, null);
                    }
                    setchecked.a.setVisibility(0);
                    z |= true;
                } else {
                    setchecked.a.setVisibility(8);
                }
                Button button3 = (Button) a3.findViewById(16908315);
                setchecked.j = button3;
                button3.setOnClickListener(setchecked.c);
                if (!TextUtils.isEmpty(setchecked.f205o) || setchecked.f != null) {
                    setchecked.j.setText(setchecked.f205o);
                    Drawable drawable3 = setchecked.f;
                    if (drawable3 != null) {
                        int i5 = setchecked.d;
                        drawable3.setBounds(0, 0, i5, i5);
                        setchecked.j.setCompoundDrawables(setchecked.f, null, null, null);
                    }
                    setchecked.j.setVisibility(0);
                    z |= true;
                } else {
                    setchecked.j.setVisibility(8);
                }
                Context context = setchecked.t;
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.n, typedValue, true);
                if (typedValue.data != 0) {
                    if (z) {
                        Button button4 = setchecked.m;
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                        layoutParams.gravity = 1;
                        layoutParams.weight = 0.5f;
                        button4.setLayoutParams(layoutParams);
                    } else if (z) {
                        Button button5 = setchecked.a;
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                        layoutParams2.gravity = 1;
                        layoutParams2.weight = 0.5f;
                        button5.setLayoutParams(layoutParams2);
                    } else if (z) {
                        Button button6 = setchecked.j;
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                        layoutParams3.gravity = 1;
                        layoutParams3.weight = 0.5f;
                        button6.setLayoutParams(layoutParams3);
                    }
                }
                if (!(z)) {
                    a3.setVisibility(8);
                }
                if (setchecked.y != null) {
                    a.addView(setchecked.y, 0, new ViewGroup.LayoutParams(-1, -2));
                    setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.V).setVisibility(8);
                } else {
                    setchecked.z = (ImageView) setchecked.R.findViewById(16908294);
                    if (!(!TextUtils.isEmpty(setchecked.J)) || !setchecked.G) {
                        setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.V).setVisibility(8);
                        setchecked.z.setVisibility(8);
                        a.setVisibility(8);
                    } else {
                        TextView textView2 = (TextView) setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.l);
                        setchecked.N = textView2;
                        textView2.setText(setchecked.J);
                        int i6 = setchecked.w;
                        if (i6 != 0) {
                            setchecked.z.setImageResource(i6);
                        } else {
                            Drawable drawable4 = setchecked.x;
                            if (drawable4 != null) {
                                setchecked.z.setImageDrawable(drawable4);
                            } else {
                                setchecked.N.setPadding(setchecked.z.getPaddingLeft(), setchecked.z.getPaddingTop(), setchecked.z.getPaddingRight(), setchecked.z.getPaddingBottom());
                                setchecked.z.setVisibility(8);
                            }
                        }
                    }
                }
                boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
                boolean z4 = (a == null || a.getVisibility() == 8) ? false : true;
                boolean z5 = (a3 == null || a3.getVisibility() == 8) ? false : true;
                if (!(z5 || a2 == null || (findViewById2 = a2.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.S)) == null)) {
                    findViewById2.setVisibility(0);
                }
                if (z4) {
                    getLifecycle getlifecycle2 = setchecked.I;
                    if (getlifecycle2 != null) {
                        getlifecycle2.setClipToPadding(true);
                    }
                    View findViewById10 = (setchecked.D == null && setchecked.A == null) ? null : a.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.U);
                    if (findViewById10 != null) {
                        findViewById10.setVisibility(0);
                    }
                } else if (!(a2 == null || (findViewById = a2.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.O)) == null)) {
                    findViewById.setVisibility(0);
                }
                ListView listView = setchecked.A;
                if (listView instanceof setChecked.IconCompatParcelizer) {
                    ((setChecked.IconCompatParcelizer) listView).setHasDecor(z4, z5);
                }
                if (!z3) {
                    ListView listView2 = setchecked.A;
                    View view4 = listView2;
                    if (listView2 == null) {
                        view4 = setchecked.I;
                    }
                    if (view4 != null) {
                        if (z5) {
                            i2 = 2;
                        }
                        int i7 = z4 ? 1 : 0;
                        char c = z4 ? 1 : 0;
                        char c2 = z4 ? 1 : 0;
                        int i8 = i7 | i2;
                        View findViewById11 = setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.z);
                        View findViewById12 = setchecked.R.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.B);
                        if (Build.VERSION.SDK_INT >= 23) {
                            findFragmentByWho.b(view4, i8, 3);
                            if (findViewById11 != null) {
                                a2.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                a2.removeView(findViewById12);
                            }
                        } else {
                            View view5 = findViewById11;
                            if (findViewById11 != null) {
                                view5 = findViewById11;
                                if ((i8 & 1) == 0) {
                                    a2.removeView(findViewById11);
                                    view5 = null;
                                }
                            }
                            if (findViewById12 == null || (i8 & 2) != 0) {
                                view2 = findViewById12;
                            } else {
                                a2.removeView(findViewById12);
                            }
                            if (!(view5 == null && view2 == null)) {
                                if (setchecked.D != null) {
                                    setchecked.I.setOnScrollChangeListener(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x068f: INVOKE  
                                          (wrap: o.getLifecycle : 0x0681: IGET  (r0v147 o.getLifecycle A[REMOVE]) = (r0v2 'setchecked' o.setChecked) o.setChecked.I o.getLifecycle)
                                          (wrap: o.setChecked$3 : 0x068c: CONSTRUCTOR  (r1v44 o.setChecked$3 A[REMOVE]) = (r0v2 'setchecked' o.setChecked), (r9v11 'view5' android.view.View), (r17v2 'view2' android.view.View) call: o.setChecked.3.<init>(o.setChecked, android.view.View, android.view.View):void type: CONSTRUCTOR)
                                         type: VIRTUAL call: o.getLifecycle.setOnScrollChangeListener(o.getLifecycle$MediaBrowserCompat$CustomActionResultReceiver):void in method: o.setExpandedFormat.onCreate(android.os.Bundle):void, file: classes-dex2jar.jar:o/setExpandedFormat.class
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setChecked, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                                        	... 45 more
                                        */
                                    /*
                                    // Method dump skipped, instructions count: 1822
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: o.setExpandedFormat.onCreate(android.os.Bundle):void");
                                }

                                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                                    getLifecycle getlifecycle = this.a.I;
                                    if (getlifecycle != null && getlifecycle.b(keyEvent)) {
                                        return true;
                                    }
                                    return onKeyDown(i, keyEvent);
                                }

                                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                                public final boolean onKeyUp(int i, KeyEvent keyEvent) {
                                    getLifecycle getlifecycle = this.a.I;
                                    if (getlifecycle != null && getlifecycle.b(keyEvent)) {
                                        return true;
                                    }
                                    return onKeyUp(i, keyEvent);
                                }

                                @Override // o.setContentHeight, android.app.Dialog
                                public final void setTitle(CharSequence charSequence) {
                                    setTitle(charSequence);
                                    setChecked setchecked = this.a;
                                    setchecked.J = charSequence;
                                    TextView textView = setchecked.N;
                                    if (textView != null) {
                                        textView.setText(charSequence);
                                    }
                                }
                            }
