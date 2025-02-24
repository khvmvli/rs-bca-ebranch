package o;
/* loaded from: classes-dex2jar.jar:o/onClickedPendidikanTerakhir.class */
public final class onClickedPendidikanTerakhir implements onDismissUpdateDaftarTransfer {
    private final onChooseStatusKewarganegaraan a;

    public onClickedPendidikanTerakhir(onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan) {
        this.a = onchoosestatuskewarganegaraan;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BN5VerifikasiOTPFragment_ViewBinding<?> b(onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan, BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<?> showpekerjaandialog, onChooseWaktuPengiriman onchoosewaktupengiriman) {
        BN5VerifikasiOTPFragment_ViewBinding<?> bN5VerifikasiOTPFragment_ViewBinding;
        Object c = onchoosestatuskewarganegaraan.c(new showPekerjaanDialog(onchoosewaktupengiriman.c())).c();
        if (c instanceof BN5VerifikasiOTPFragment_ViewBinding) {
            bN5VerifikasiOTPFragment_ViewBinding = (BN5VerifikasiOTPFragment_ViewBinding) c;
        } else if (c instanceof onDismissUpdateDaftarTransfer) {
            bN5VerifikasiOTPFragment_ViewBinding = ((onDismissUpdateDaftarTransfer) c).e(bN5PilihNomorOTPFragment_ViewBinding, showpekerjaandialog);
        } else {
            boolean z = c instanceof onChooseUpdateDaftarTransfer;
            if (z || (c instanceof subscribeSubmitBankNotesEvent)) {
                subscribeSubmitBankNotesEvent subscribesubmitbanknotesevent = null;
                onChooseUpdateDaftarTransfer onchooseupdatedaftartransfer = z ? (onChooseUpdateDaftarTransfer) c : null;
                if (c instanceof subscribeSubmitBankNotesEvent) {
                    subscribesubmitbanknotesevent = (subscribeSubmitBankNotesEvent) c;
                }
                bN5VerifikasiOTPFragment_ViewBinding = new ivfotoNPWP<>(onchooseupdatedaftartransfer, subscribesubmitbanknotesevent, bN5PilihNomorOTPFragment_ViewBinding, showpekerjaandialog, null);
            } else {
                StringBuilder sb = new StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(c.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(showpekerjaandialog.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        BN5VerifikasiOTPFragment_ViewBinding<?> bN5VerifikasiOTPFragment_ViewBinding2 = bN5VerifikasiOTPFragment_ViewBinding;
        if (bN5VerifikasiOTPFragment_ViewBinding != null) {
            bN5VerifikasiOTPFragment_ViewBinding2 = bN5VerifikasiOTPFragment_ViewBinding;
            if (onchoosewaktupengiriman.a()) {
                bN5VerifikasiOTPFragment_ViewBinding2 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d8: CONSTRUCTOR  (r9v4 'bN5VerifikasiOTPFragment_ViewBinding2' o.BN5VerifikasiOTPFragment_ViewBinding<?> A[REMOVE]) = (r8v1 'bN5VerifikasiOTPFragment_ViewBinding' o.BN5VerifikasiOTPFragment_ViewBinding<?>) call: o.BN5VerifikasiOTPFragment_ViewBinding.2.<init>(o.BN5VerifikasiOTPFragment_ViewBinding):void type: CONSTRUCTOR in method: o.onClickedPendidikanTerakhir.b(o.onChooseStatusKewarganegaraan, o.BN5PilihNomorOTPFragment_ViewBinding, o.showPekerjaanDialog<?>, o.onChooseWaktuPengiriman):o.BN5VerifikasiOTPFragment_ViewBinding<?>, file: classes-dex2jar.jar:o/onClickedPendidikanTerakhir.class
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.BN5VerifikasiOTPFragment_ViewBinding, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 27 more
                    */
                /*
                // Method dump skipped, instructions count: 222
                */
                throw new UnsupportedOperationException("Method not decompiled: o.onClickedPendidikanTerakhir.b(o.onChooseStatusKewarganegaraan, o.BN5PilihNomorOTPFragment_ViewBinding, o.showPekerjaanDialog, o.onChooseWaktuPengiriman):o.BN5VerifikasiOTPFragment_ViewBinding");
            }

            @Override // o.onDismissUpdateDaftarTransfer
            public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
                onChooseWaktuPengiriman onchoosewaktupengiriman = (onChooseWaktuPengiriman) showpekerjaandialog.d.getAnnotation(onChooseWaktuPengiriman.class);
                if (onchoosewaktupengiriman == null) {
                    return null;
                }
                return (BN5VerifikasiOTPFragment_ViewBinding<T>) b(this.a, bN5PilihNomorOTPFragment_ViewBinding, showpekerjaandialog, onchoosewaktupengiriman);
            }
        }
