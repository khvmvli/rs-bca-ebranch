package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setNextTransition.class */
public class setNextTransition extends setReturnTransition {
    private setMenuVisibility a;
    private setMenuVisibility d;

    private setMenuVisibility c(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
        setMenuVisibility setmenuvisibility = this.a;
        if (setmenuvisibility == null || setmenuvisibility.e != setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
            this.a = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: IPUT  
                  (wrap: o.setMenuVisibility$2 : 0x0017: CONSTRUCTOR  (r1v0 o.setMenuVisibility$2 A[REMOVE]) = 
                  (r6v0 'setonstartentertransitionlistener_mediabrowsercompat_itemreceiver' o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver)
                 call: o.setMenuVisibility.2.<init>(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):void type: CONSTRUCTOR)
                  (r5v0 'this' o.setNextTransition A[IMMUTABLE_TYPE, THIS])
                 o.setNextTransition.a o.setMenuVisibility in method: o.setNextTransition.c(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):o.setMenuVisibility, file: classes-dex2jar.jar:o/setNextTransition.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMenuVisibility, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 21 more
                */
            /*
                this = this;
                r0 = r5
                o.setMenuVisibility r0 = r0.a
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L_0x0011
                r0 = r7
                o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver r0 = r0.e
                r1 = r6
                if (r0 == r1) goto L_0x001d
            L_0x0011:
                r0 = r5
                o.setMenuVisibility$2 r1 = new o.setMenuVisibility$2
                r2 = r1
                r3 = r6
                r2.<init>(r3)
                r0.a = r1
            L_0x001d:
                r0 = r5
                o.setMenuVisibility r0 = r0.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setNextTransition.c(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):o.setMenuVisibility");
        }

        private static View e(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, setMenuVisibility setmenuvisibility) {
            setAnimations setanimations = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.s;
            int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
            if (c == 0) {
                return null;
            }
            int g = setmenuvisibility.g();
            int i = setmenuvisibility.i() / 2;
            int i2 = Integer.MAX_VALUE;
            View view = null;
            for (int i3 = 0; i3 < c; i3++) {
                setAnimations setanimations2 = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.s;
                View b = setanimations2 != null ? setanimations2.b.b(setanimations2.e(i3)) : null;
                int abs = Math.abs((setmenuvisibility.d(b) + (setmenuvisibility.a(b) / 2)) - (g + i));
                i2 = i2;
                if (abs < i2) {
                    i2 = abs;
                    view = b;
                }
            }
            return view;
        }

        private setMenuVisibility e(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
            setMenuVisibility setmenuvisibility = this.d;
            if (setmenuvisibility == null || setmenuvisibility.e != setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
                this.d = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: IPUT  
                      (wrap: o.setMenuVisibility$3 : 0x0017: CONSTRUCTOR  (r1v0 o.setMenuVisibility$3 A[REMOVE]) = 
                      (r6v0 'setonstartentertransitionlistener_mediabrowsercompat_itemreceiver' o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver)
                     call: o.setMenuVisibility.3.<init>(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):void type: CONSTRUCTOR)
                      (r5v0 'this' o.setNextTransition A[IMMUTABLE_TYPE, THIS])
                     o.setNextTransition.d o.setMenuVisibility in method: o.setNextTransition.e(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):o.setMenuVisibility, file: classes-dex2jar.jar:o/setNextTransition.class
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMenuVisibility, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 21 more
                    */
                /*
                    this = this;
                    r0 = r5
                    o.setMenuVisibility r0 = r0.d
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto L_0x0011
                    r0 = r7
                    o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver r0 = r0.e
                    r1 = r6
                    if (r0 == r1) goto L_0x001d
                L_0x0011:
                    r0 = r5
                    o.setMenuVisibility$3 r1 = new o.setMenuVisibility$3
                    r2 = r1
                    r3 = r6
                    r2.<init>(r3)
                    r0.d = r1
                L_0x001d:
                    r0 = r5
                    o.setMenuVisibility r0 = r0.d
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setNextTransition.e(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):o.setMenuVisibility");
            }

            /* JADX WARN: Code restructure failed: missing block: B:73:0x01d5, code lost:
                if (r0.y < 0.0f) goto L_0x01d8;
             */
            @Override // o.setReturnTransition
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final int b(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver r6, int r7, int r8) {
                /*
                // Method dump skipped, instructions count: 502
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setNextTransition.b(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver, int, int):int");
            }

            @Override // o.setReturnTransition
            protected final setOnStartEnterTransitionListener.ParcelableVolumeInfo b(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
                if (!(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver instanceof setOnStartEnterTransitionListener.ParcelableVolumeInfo.write)) {
                    return null;
                }
                return new setFocusedView(this.b.getContext()) { // from class: o.setNextTransition.2
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // o.setFocusedView
                    public final int c(int i) {
                        return Math.min(100, c(i));
                    }

                    @Override // o.setFocusedView
                    protected final float d(DisplayMetrics displayMetrics) {
                        return 100.0f / ((float) displayMetrics.densityDpi);
                    }

                    @Override // o.setFocusedView, o.setOnStartEnterTransitionListener.ParcelableVolumeInfo
                    protected final void d(View view, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver) {
                        setNextTransition setnexttransition = setNextTransition.this;
                        int[] b = setnexttransition.b(setnexttransition.b.z, view);
                        int i = b[0];
                        int i2 = b[1];
                        int d = d(Math.max(Math.abs(i), Math.abs(i2)));
                        if (d > 0) {
                            DecelerateInterpolator decelerateInterpolator = this.b;
                            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.c = i;
                            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.a = i2;
                            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.d = d;
                            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.e = decelerateInterpolator;
                            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.b = true;
                        }
                    }
                };
            }

            @Override // o.setReturnTransition
            public final int[] b(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, View view) {
                int[] iArr = new int[2];
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
                    setMenuVisibility c = c(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
                    iArr[0] = (c.d(view) + (c.a(view) / 2)) - (c.g() + (c.i() / 2));
                } else {
                    iArr[0] = 0;
                }
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e()) {
                    setMenuVisibility e = e(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
                    iArr[1] = (e.d(view) + (e.a(view) / 2)) - (e.g() + (e.i() / 2));
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            }

            @Override // o.setReturnTransition
            public View d(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e()) {
                    return e(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, e(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver));
                }
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
                    return e(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, c(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver));
                }
                return null;
            }
        }
