package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setBranchLists.class */
public interface setBranchLists {

    /* loaded from: classes-dex2jar.jar:o/setBranchLists$read.class */
    public static final class read implements setBranchLists {
        private final CreateReservationResponse a;
        private final DetailTransactionResponse b;
        private final List<ImageHeaderParser> e;

        public read(InputStream inputStream, List<ImageHeaderParser> list, DetailTransactionResponse detailTransactionResponse) {
            if (detailTransactionResponse != null) {
                this.b = detailTransactionResponse;
                if (list != null) {
                    this.e = list;
                    this.a = new CreateReservationResponse(inputStream, detailTransactionResponse);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // o.setBranchLists
        public final ImageHeaderParser.ImageType c() throws IOException {
            List<ImageHeaderParser> list = this.e;
            CreateReservationResponse createReservationResponse = this.a;
            createReservationResponse.a.reset();
            return CategoriesORResponse$Category$$Parcelable.c(list, createReservationResponse.a, this.b);
        }

        @Override // o.setBranchLists
        public final int d() throws IOException {
            List<ImageHeaderParser> list = this.e;
            CreateReservationResponse createReservationResponse = this.a;
            createReservationResponse.a.reset();
            return CategoriesORResponse$Category$$Parcelable.d(list, createReservationResponse.a, this.b);
        }

        @Override // o.setBranchLists
        public final Bitmap e(BitmapFactory.Options options) throws IOException {
            CreateReservationResponse createReservationResponse = this.a;
            createReservationResponse.a.reset();
            return BitmapFactory.decodeStream(createReservationResponse.a, null, options);
        }

        @Override // o.setBranchLists
        public final void e() {
            GetBranchROResponse$$Parcelable getBranchROResponse$$Parcelable = this.a.a;
            synchronized (getBranchROResponse$$Parcelable) {
                getBranchROResponse$$Parcelable.b = getBranchROResponse$$Parcelable.a.length;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setBranchLists$write.class */
    public static final class write implements setBranchLists {
        private final DetailTransactionResponse a;
        private final List<ImageHeaderParser> b;
        private final ParcelFileDescriptorRewinder c;

        public write(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, DetailTransactionResponse detailTransactionResponse) {
            if (detailTransactionResponse != null) {
                this.a = detailTransactionResponse;
                if (list != null) {
                    this.b = list;
                    this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // o.setBranchLists
        public final ImageHeaderParser.ImageType c() throws IOException {
            return CategoriesORResponse$Category$$Parcelable.a(this.b, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: RETURN  
                  (wrap: com.bumptech.glide.load.ImageHeaderParser$ImageType : 0x0013: INVOKE  (r0v2 com.bumptech.glide.load.ImageHeaderParser$ImageType A[REMOVE]) = 
                  (wrap: java.util.List<com.bumptech.glide.load.ImageHeaderParser> : 0x0001: IGET  (r0v1 java.util.List<com.bumptech.glide.load.ImageHeaderParser> A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.b java.util.List)
                  (wrap: o.CategoriesORResponse$Category$$Parcelable$1 : 0x0010: CONSTRUCTOR  (r1v0 o.CategoriesORResponse$Category$$Parcelable$1 A[REMOVE]) = 
                  (wrap: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder : 0x0009: IGET  (r3v1 com.bumptech.glide.load.data.ParcelFileDescriptorRewinder A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.c com.bumptech.glide.load.data.ParcelFileDescriptorRewinder)
                  (wrap: o.DetailTransactionResponse : 0x000d: IGET  (r4v1 o.DetailTransactionResponse A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.a o.DetailTransactionResponse)
                 call: o.CategoriesORResponse$Category$$Parcelable.1.<init>(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder, o.DetailTransactionResponse):void type: CONSTRUCTOR)
                 type: STATIC call: o.CategoriesORResponse$Category$$Parcelable.a(java.util.List, o.CategoriesORResponse$Category$$Parcelable$RemoteActionCompatParcelizer):com.bumptech.glide.load.ImageHeaderParser$ImageType)
                 in method: o.setBranchLists.write.c():com.bumptech.glide.load.ImageHeaderParser$ImageType, file: classes-dex2jar.jar:o/setBranchLists$write.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.CategoriesORResponse$Category$$Parcelable, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 15 more
                */
            /*
                this = this;
                r0 = r6
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r0.b
                o.CategoriesORResponse$Category$$Parcelable$1 r1 = new o.CategoriesORResponse$Category$$Parcelable$1
                r2 = r1
                r3 = r6
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r3.c
                r4 = r6
                o.DetailTransactionResponse r4 = r4.a
                r2.<init>(r4)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = o.CategoriesORResponse$Category$$Parcelable.a(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setBranchLists.write.c():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }

        @Override // o.setBranchLists
        public final int d() throws IOException {
            return CategoriesORResponse$Category$$Parcelable.d(this.b, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: RETURN  
                  (wrap: int : 0x0013: INVOKE  (r0v2 int A[REMOVE]) = 
                  (wrap: java.util.List<com.bumptech.glide.load.ImageHeaderParser> : 0x0001: IGET  (r0v1 java.util.List<com.bumptech.glide.load.ImageHeaderParser> A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.b java.util.List)
                  (wrap: o.CategoriesORResponse$Category$$Parcelable$3 : 0x0010: CONSTRUCTOR  (r1v0 o.CategoriesORResponse$Category$$Parcelable$3 A[REMOVE]) = 
                  (wrap: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder : 0x0009: IGET  (r3v1 com.bumptech.glide.load.data.ParcelFileDescriptorRewinder A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.c com.bumptech.glide.load.data.ParcelFileDescriptorRewinder)
                  (wrap: o.DetailTransactionResponse : 0x000d: IGET  (r4v1 o.DetailTransactionResponse A[REMOVE]) = (r6v0 'this' o.setBranchLists$write A[IMMUTABLE_TYPE, THIS]) o.setBranchLists.write.a o.DetailTransactionResponse)
                 call: o.CategoriesORResponse$Category$$Parcelable.3.<init>(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder, o.DetailTransactionResponse):void type: CONSTRUCTOR)
                 type: STATIC call: o.CategoriesORResponse$Category$$Parcelable.d(java.util.List, o.CategoriesORResponse$Category$$Parcelable$write):int)
                 in method: o.setBranchLists.write.d():int, file: classes-dex2jar.jar:o/setBranchLists$write.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.CategoriesORResponse$Category$$Parcelable, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 15 more
                */
            /*
                this = this;
                r0 = r6
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r0.b
                o.CategoriesORResponse$Category$$Parcelable$3 r1 = new o.CategoriesORResponse$Category$$Parcelable$3
                r2 = r1
                r3 = r6
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r3.c
                r4 = r6
                o.DetailTransactionResponse r4 = r4.a
                r2.<init>(r4)
                int r0 = o.CategoriesORResponse$Category$$Parcelable.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setBranchLists.write.d():int");
        }

        @Override // o.setBranchLists
        public final Bitmap e(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.b.rewind().getFileDescriptor(), null, options);
        }

        @Override // o.setBranchLists
        public final void e() {
        }
    }

    ImageHeaderParser.ImageType c() throws IOException;

    int d() throws IOException;

    Bitmap e(BitmapFactory.Options options) throws IOException;

    void e();
}
