package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.List;
import o.Page6HLFragment_ViewBinding;
import o.Page6ILFragment;
import o.onClickProvinsi;
/* loaded from: classes2-dex2jar.jar:o/onClickKelurahan.class */
public class onClickKelurahan extends FrameLayout implements Page6ILFragment.read, Page6ILFragment.write {
    private Page6ILFragment g = null;
    private ImageView e = null;
    private TextView a = null;
    private read h = null;
    private int j = -1;
    private int i = -1;
    private int b = 17;
    private boolean d = false;
    private boolean c = false;

    /* loaded from: classes2-dex2jar.jar:o/onClickKelurahan$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends FrameLayout.LayoutParams {
        boolean c;

        public IconCompatParcelizer(int i, int i2) {
            super(i, i2);
            this.c = false;
        }

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Page6HLFragment_ViewBinding.read.e);
            this.c = obtainStyledAttributes.getBoolean(Page6HLFragment_ViewBinding.read.c, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onClickKelurahan$read.class */
    public interface read {
    }

    public onClickKelurahan(Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    public onClickKelurahan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    public onClickKelurahan(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundColor(-16777216);
    }

    private void c(String str) {
        TextView textView = new TextView(getContext());
        this.a = textView;
        textView.setText(str);
        this.a.setTextColor(-1);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(-2, -2);
        iconCompatParcelizer.gravity = this.b;
        this.a.setLayoutParams(iconCompatParcelizer);
        addView(this.a);
        TextView textView2 = this.a;
        ViewGroup viewGroup = (ViewGroup) textView2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(textView2);
            viewGroup.addView(textView2, 0);
        }
    }

    public final List<Camera.Size> a() {
        Page6ILFragment page6ILFragment = this.g;
        if (page6ILFragment != null) {
            return page6ILFragment.i;
        }
        return null;
    }

    @Override // o.Page6ILFragment.write
    public final void a(int i, int i2) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) getChildAt(i3).getLayoutParams();
            if (iconCompatParcelizer.c) {
                if (this.g != null) {
                    iconCompatParcelizer.width = i;
                    iconCompatParcelizer.height = i2;
                    iconCompatParcelizer.gravity = ((FrameLayout.LayoutParams) this.g.getLayoutParams()).gravity;
                } else {
                    return;
                }
            }
        }
        if (!(this.j == i && this.i == i2)) {
            this.j = i;
            this.i = i2;
        }
    }

    public final void b() {
        Page6ILFragment page6ILFragment = this.g;
        if (page6ILFragment == null || page6ILFragment.b == null) {
            String simpleName = getClass().getSimpleName();
            if (this.c) {
                Log.println(5, simpleName, "Trying to stop a preview with null camera, call #setCamera() beforehand");
                return;
            }
            return;
        }
        this.d = false;
        this.g.b.b = this.d;
        Camera d = this.g.b.d();
        if (d != null) {
            d.stopPreview();
        }
    }

    public final void c() {
        Page6ILFragment page6ILFragment = this.g;
        if (page6ILFragment == null || page6ILFragment.b == null) {
            String simpleName = getClass().getSimpleName();
            if (this.c) {
                Log.println(5, simpleName, "Trying to start a preview with null camera, call #setCamera() beforehand");
            }
            setCamera(null);
            return;
        }
        this.d = true;
        this.g.b.b = this.d;
        this.g.b.a();
        Camera d = this.g.b.d();
        if (d != null) {
            d.startPreview();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof IconCompatParcelizer;
    }

    @Override // o.Page6ILFragment.read
    public final void d() {
        this.d = false;
    }

    public final void d(final onClickKota onclickkota) {
        Page6ILFragment page6ILFragment = this.g;
        if (page6ILFragment == null || page6ILFragment.b == null) {
            String simpleName = getClass().getSimpleName();
            if (this.c) {
                Log.println(5, simpleName, "Trying to take a picture with null camera, call #setCamera() beforehand");
            }
        } else if (this.g.c) {
            Camera d = this.g.b.d();
            if (d != null) {
                d.takePicture(null, null, onclickkota);
            }
        } else {
            Page6JLFragment page6JLFragment = this.g.b;
            onClickProvinsi onclickprovinsi = new onClickProvinsi(getContext(), new onClickProvinsi.read() { // from class: o.onClickKelurahan.3
                @Override // o.onClickProvinsi.read
                public final void e(byte[] bArr) {
                    onClickKelurahan.this.e.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    onClickKelurahan.this.e.setDrawingCacheEnabled(true);
                    Bitmap copy = onClickKelurahan.this.e.getDrawingCache(true).copy(Bitmap.Config.ARGB_8888, false);
                    onClickKelurahan.this.e.destroyDrawingCache();
                    onClickKelurahan.this.e.setImageBitmap(null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    copy.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    onclickkota.onPictureTaken(byteArrayOutputStream.toByteArray(), null);
                }
            });
            Camera d2 = page6JLFragment.d();
            if (d2 != null) {
                d2.takePicture(null, null, onclickprovinsi);
            }
        }
    }

    public final boolean e() {
        Page6ILFragment page6ILFragment = this.g;
        return page6ILFragment != null && page6ILFragment.b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new IconCompatParcelizer(-2, -2);
    }

    public final void h() {
        Page6ILFragment page6ILFragment = this.g;
        if (page6ILFragment != null) {
            Page6JLFragment page6JLFragment = page6ILFragment.b;
            if ((page6JLFragment == null || page6JLFragment.j == -1 || page6JLFragment.g == -1) ? false : true) {
                Page6ILFragment page6ILFragment2 = this.g;
                Page6JLFragment page6JLFragment2 = page6ILFragment2.b;
                boolean z = false;
                if (page6JLFragment2 != null) {
                    z = false;
                    if ((page6JLFragment2.j == -1 || page6JLFragment2.g == -1) ? false : true) {
                        Page6JLFragment page6JLFragment3 = page6ILFragment2.b;
                        if ((page6JLFragment3.j == -1 || page6JLFragment3.g == -1) ? false : true) {
                            int i = page6JLFragment3.l;
                            int i2 = page6JLFragment3.j;
                            if (i == i2) {
                                page6JLFragment3.f49o = 1;
                                page6JLFragment3.l = page6JLFragment3.g;
                                z = true;
                            } else {
                                page6JLFragment3.f49o = 0;
                                page6JLFragment3.l = i2;
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                if (z) {
                    page6ILFragment2.d.removeCallback(page6ILFragment2);
                    page6ILFragment2.d.addCallback(page6ILFragment2);
                }
                setCamera(this.g, ((FrameLayout.LayoutParams) this.g.getLayoutParams()).gravity);
                this.g.c();
            }
        }
    }

    public final void setCamera(Page6ILFragment page6ILFragment) {
        setCamera(page6ILFragment, this.b);
    }

    public final void setCamera(Page6ILFragment page6ILFragment, int i) {
        Camera camera = null;
        if (this.g == null && page6ILFragment != null) {
            this.g = page6ILFragment;
            page6ILFragment.g = this;
            this.g.a = this;
            this.g.b.a();
            Page6ILFragment page6ILFragment2 = this.g;
            page6ILFragment2.setOnTouchListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003a: INVOKE  
                  (r0v40 'page6ILFragment2' o.Page6ILFragment)
                  (wrap: o.Page6ILFragment$2 : 0x0037: CONSTRUCTOR  (r1v17 o.Page6ILFragment$2 A[REMOVE]) = (r0v40 'page6ILFragment2' o.Page6ILFragment) call: o.Page6ILFragment.2.<init>(o.Page6ILFragment):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: o.onClickKelurahan.setCamera(o.Page6ILFragment, int):void, file: classes2-dex2jar.jar:o/onClickKelurahan.class
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.Page6ILFragment, state: GENERATED_AND_UNLOADED
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
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 311
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onClickKelurahan.setCamera(o.Page6ILFragment, int):void");
        }

        public final void setCameraCropped(boolean z) {
            Page6ILFragment page6ILFragment = this.g;
            if (page6ILFragment != null) {
                page6ILFragment.e = z;
                page6ILFragment.invalidate();
            }
        }

        public final void setCaptureOriginalImage(boolean z) {
            Page6ILFragment page6ILFragment = this.g;
            if (page6ILFragment != null) {
                page6ILFragment.c = z;
            }
        }

        public void setOnPreviewSizeChangedListener(read read2) {
            this.h = read2;
        }

        public final void setPictureSize(Camera.Size size) {
            Page6ILFragment page6ILFragment = this.g;
            if (page6ILFragment != null) {
                page6ILFragment.c(size);
            }
        }
    }
