package o;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/Page6ILFragment.class */
public class Page6ILFragment extends SurfaceView implements SurfaceHolder.Callback {
    write a;
    Page6JLFragment b;
    boolean c;
    SurfaceHolder d;
    boolean e;
    private final float f;
    read g;
    private boolean h;
    List<Camera.Size> i;
    private boolean j;
    private List<Camera.Size> k;
    private List<Double> l;
    private Camera.Size m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48o;
    private List<Camera.Size> p;
    private Camera.Size q;
    private double r;

    /* loaded from: classes2-dex2jar.jar:o/Page6ILFragment$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        FRONT,
        BACK
    }

    /* loaded from: classes2-dex2jar.jar:o/Page6ILFragment$read.class */
    public interface read {
        void d();
    }

    /* loaded from: classes2-dex2jar.jar:o/Page6ILFragment$write.class */
    public interface write {
        void a(int i, int i2);
    }

    public Page6ILFragment(Context context) {
        this(context, IconCompatParcelizer.BACK);
    }

    public Page6ILFragment(Context context, IconCompatParcelizer iconCompatParcelizer) {
        super(context);
        this.l = null;
        this.k = null;
        this.q = null;
        this.m = null;
        this.r = 0.0d;
        this.j = false;
        this.n = false;
        this.f48o = false;
        this.g = null;
        this.a = null;
        this.e = false;
        this.c = true;
        this.f = 75.0f;
        this.h = false;
        if (iconCompatParcelizer == IconCompatParcelizer.FRONT) {
            this.b = new Page6JLFragment(1);
        } else {
            this.b = new Page6JLFragment(0);
        }
        this.l = new ArrayList();
        this.k = new ArrayList();
        post(new Runnable() { // from class: o.Page6ILFragment.3
            @Override // java.lang.Runnable
            public final void run() {
                Camera.Parameters parameters = null;
                Camera.Parameters parameters2 = null;
                if (Page6ILFragment.this.b.b()) {
                    Page6JLFragment page6JLFragment = Page6ILFragment.this.b;
                    page6JLFragment.d = true;
                    page6JLFragment.a = false;
                    try {
                        page6JLFragment.d().cancelAutoFocus();
                        Camera d = page6JLFragment.d();
                        if (d != null) {
                            parameters2 = d.getParameters();
                        }
                        if (!page6JLFragment.d || !page6JLFragment.b()) {
                            parameters2.setFocusMode("continuous-picture");
                        } else {
                            parameters2.setFocusMode("auto");
                        }
                        page6JLFragment.d().setParameters(parameters2);
                        page6JLFragment.d().autoFocus(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0075: INVOKE  
                              (wrap: android.hardware.Camera : 0x0063: INVOKE  (r0v51 android.hardware.Camera A[REMOVE]) = (r0v35 'page6JLFragment' o.Page6JLFragment) type: VIRTUAL call: o.Page6JLFragment.d():android.hardware.Camera)
                              (wrap: o.Page6JLFragment$3 : 0x006f: CONSTRUCTOR  (r0v52 o.Page6JLFragment$3 A[REMOVE]) = (r0v35 'page6JLFragment' o.Page6JLFragment) call: o.Page6JLFragment.3.<init>(o.Page6JLFragment):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.hardware.Camera.autoFocus(android.hardware.Camera$AutoFocusCallback):void in method: o.Page6ILFragment.3.run():void, file: classes2-dex2jar.jar:o/Page6ILFragment$3.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:301)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.Page6JLFragment, state: GENERATED_AND_UNLOADED
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
                            	... 27 more
                            */
                        /*
                        // Method dump skipped, instructions count: 250
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.Page6ILFragment.AnonymousClass3.run():void");
                    }
                });
                d();
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump */
            private void a() {
                /*
                // Method dump skipped, instructions count: 299
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Page6ILFragment.a():void");
            }

            static /* synthetic */ Rect d(Page6ILFragment page6ILFragment, float f, float f2, float f3) {
                Rect rect = new Rect((int) (f - 100.0f), (int) (f2 - 100.0f), (int) (f + 100.0f), (int) (f2 + 100.0f));
                return new Rect(((rect.left * 2000) / page6ILFragment.getWidth()) - DateTimeConstants.MILLIS_PER_SECOND, ((rect.top * 2000) / page6ILFragment.getHeight()) - DateTimeConstants.MILLIS_PER_SECOND, ((rect.right * 2000) / page6ILFragment.getWidth()) - DateTimeConstants.MILLIS_PER_SECOND, ((rect.bottom * 2000) / page6ILFragment.getHeight()) - DateTimeConstants.MILLIS_PER_SECOND);
            }

            private void d() {
                if (this.b.d() != null) {
                    Camera d = this.b.d();
                    Camera.Parameters parameters = null;
                    this.p = (d != null ? d.getParameters() : null).getSupportedPreviewSizes();
                    Camera d2 = this.b.d();
                    if (d2 != null) {
                        parameters = d2.getParameters();
                    }
                    this.i = parameters.getSupportedPictureSizes();
                    Camera.Size e = e();
                    this.m = e;
                    this.r = ((double) e.height) / ((double) this.m.width);
                    if (this.d == null) {
                        SurfaceHolder holder = getHolder();
                        this.d = holder;
                        holder.addCallback(this);
                        this.d.setType(3);
                    }
                }
            }

            private void d(Camera.Size size, double d) {
                if (this.l.contains(Double.valueOf(d))) {
                    this.k.set(this.l.indexOf(Double.valueOf(d)), size);
                }
            }

            private Camera.Size e() {
                Camera.Size size = this.i.get(0);
                List<Camera.Size> list = this.i;
                Camera.Size size2 = list.get(list.size() - 1);
                if (size.width > size2.width || size.height > size2.height) {
                    this.f48o = true;
                    return size;
                }
                this.f48o = false;
                return size2;
            }

            private Camera.Size h() {
                Camera.Size size = this.p.get(0);
                List<Camera.Size> list = this.p;
                Camera.Size size2 = list.get(list.size() - 1);
                if (size.width > size2.width || size.height > size2.height) {
                    this.n = true;
                    return size;
                }
                this.n = false;
                return size2;
            }

            private Camera.Size j() {
                int i = 0;
                if (!this.j) {
                    if (this.p != null) {
                        for (int i2 = 0; i2 < this.i.size(); i2++) {
                            Camera.Size size = this.i.get(i2);
                            double d = ((double) size.height) / ((double) size.width);
                            if (!this.l.contains(Double.valueOf(d))) {
                                this.l.add(Double.valueOf(d));
                            }
                        }
                        this.k = new ArrayList();
                        Camera.Size h = h();
                        for (int i3 = 0; i3 < this.l.size(); i3++) {
                            this.k.add(h);
                        }
                        if (this.n) {
                            for (int size2 = this.p.size() - 1; size2 >= 0; size2--) {
                                Camera.Size size3 = this.p.get(size2);
                                d(size3, ((double) size3.height) / ((double) size3.width));
                            }
                        } else {
                            for (int i4 = 0; i4 < this.p.size(); i4++) {
                                Camera.Size size4 = this.p.get(i4);
                                d(size4, ((double) size4.height) / ((double) size4.width));
                            }
                        }
                        if (this.h) {
                            for (int i5 = 0; i5 < this.i.size(); i5++) {
                            }
                            for (int i6 = 0; i6 < this.p.size(); i6++) {
                            }
                            for (int i7 = 0; i7 < this.l.size(); i7++) {
                            }
                            for (int i8 = 0; i8 < this.k.size(); i8++) {
                            }
                            for (int i9 = 0; i9 < this.l.size(); i9++) {
                            }
                        }
                    }
                    this.j = true;
                    i = 0;
                }
                while (i < this.l.size()) {
                    if (Double.doubleToLongBits(this.l.get(i).doubleValue()) == Double.doubleToLongBits(this.r)) {
                        return this.k.get(i);
                    }
                    i++;
                }
                return h();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public final boolean b() {
                Page6JLFragment page6JLFragment = this.b;
                boolean z = false;
                if (page6JLFragment != null) {
                    z = false;
                    if (page6JLFragment.l == page6JLFragment.g) {
                        z = true;
                    }
                }
                return z;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public final void c() {
                this.j = false;
                this.l = new ArrayList();
                this.k = new ArrayList();
                d();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public final void c(Camera.Size size) {
                Camera d;
                double d2 = this.r;
                this.m = size;
                this.r = ((double) size.height) / ((double) this.m.width);
                this.q = j();
                Camera d3 = this.b.d();
                Camera.Parameters parameters = d3 != null ? d3.getParameters() : null;
                parameters.setPictureSize(this.m.width, this.m.height);
                parameters.setPreviewSize(this.q.width, this.q.height);
                Camera d4 = this.b.d();
                if (d4 != null) {
                    d4.stopPreview();
                }
                Camera d5 = this.b.d();
                if (d5 != null) {
                    d5.setParameters(parameters);
                }
                if (this.b.b && (d = this.b.d()) != null) {
                    d.startPreview();
                }
                if (Double.doubleToLongBits(d2) != Double.doubleToLongBits(this.r)) {
                    requestLayout();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
                if (r0 > 0) goto L_0x0142;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:30:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
            /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v63, types: [double] */
            /* JADX WARN: Type inference failed for: r0v68, types: [double] */
            /* JADX WARN: Type inference failed for: r14v0, types: [double] */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v2 */
            /* JADX WARN: Type inference failed for: r14v3 */
            /* JADX WARN: Type inference failed for: r14v4 */
            /* JADX WARN: Type inference failed for: r14v7 */
            /* JADX WARN: Type inference failed for: r14v8 */
            /* JADX WARN: Type inference failed for: r14v9 */
            /* JADX WARN: Type inference failed for: r16v0, types: [double] */
            /* JADX WARN: Type inference failed for: r16v1, types: [double] */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r16v3 */
            /* JADX WARN: Type inference failed for: r16v4 */
            /* JADX WARN: Type inference failed for: r16v7 */
            /* JADX WARN: Type inference failed for: r16v8 */
            /* JADX WARN: Type inference failed for: r16v9 */
            /* JADX WARN: Unknown variable types count: 6 */
            @Override // android.view.SurfaceView, android.view.View
            /* Code decompiled incorrectly, please refer to instructions dump */
            protected void onMeasure(int r8, int r9) {
                /*
                // Method dump skipped, instructions count: 441
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Page6ILFragment.onMeasure(int, int):void");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                Camera d;
                Camera d2;
                if (this.d.getSurface() != null) {
                    try {
                        Camera d3 = this.b.d();
                        if (d3 != null) {
                            d3.stopPreview();
                        }
                    } catch (Exception e) {
                        Log.i("SIMPLE_CAMERA", String.valueOf(e));
                    }
                    Camera.Parameters parameters = null;
                    try {
                        Camera d4 = this.b.d();
                        Camera.Parameters parameters2 = d4 != null ? d4.getParameters() : null;
                        parameters2.setPreviewSize(this.q.width, this.q.height);
                        Camera d5 = this.b.d();
                        if (d5 != null) {
                            d5.stopPreview();
                        }
                        Camera d6 = this.b.d();
                        if (d6 != null) {
                            d6.setParameters(parameters2);
                        }
                        a();
                        Page6JLFragment page6JLFragment = this.b;
                        SurfaceHolder surfaceHolder2 = this.d;
                        Camera d7 = page6JLFragment.d();
                        if (d7 != null) {
                            d7.setPreviewDisplay(surfaceHolder2);
                        }
                        if (this.b.b && (d2 = this.b.d()) != null) {
                            d2.startPreview();
                        }
                        z = false;
                    } catch (Exception e2) {
                        Log.i("SIMPLE_CAMERA", String.valueOf(e2));
                        z = true;
                    }
                    if (z) {
                        this.b.a();
                        try {
                            Camera d8 = this.b.d();
                            if (d8 != null) {
                                parameters = d8.getParameters();
                            }
                            parameters.setPreviewSize(this.q.width, this.q.height);
                            Camera d9 = this.b.d();
                            if (d9 != null) {
                                d9.stopPreview();
                            }
                            Camera d10 = this.b.d();
                            if (d10 != null) {
                                d10.setParameters(parameters);
                            }
                            a();
                            Page6JLFragment page6JLFragment2 = this.b;
                            SurfaceHolder surfaceHolder3 = this.d;
                            Camera d11 = page6JLFragment2.d();
                            if (d11 != null) {
                                d11.setPreviewDisplay(surfaceHolder3);
                            }
                            if (this.b.b && (d = this.b.d()) != null) {
                                d.startPreview();
                            }
                        } catch (Exception e3) {
                            Log.i("SIMPLE_CAMERA", String.valueOf(e3));
                        }
                    }
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Page6JLFragment page6JLFragment = this.b;
                if (page6JLFragment != null) {
                    Camera camera = page6JLFragment.e;
                    if (camera != null) {
                        camera.release();
                    }
                    Camera camera2 = page6JLFragment.h;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    page6JLFragment.c = false;
                }
                read read2 = this.g;
                if (read2 != null) {
                    read2.d();
                }
            }
        }
