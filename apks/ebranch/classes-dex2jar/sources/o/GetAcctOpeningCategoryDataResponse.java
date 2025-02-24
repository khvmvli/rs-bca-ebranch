package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.bumptech.glide.load.engine.GlideException;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.CreateQueueReservationResponse$$Parcelable;
import o.CreateReservationResponse$$Parcelable;
import o.getAmountKliring;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse.class */
public interface GetAcctOpeningCategoryDataResponse<T, Y> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$CategoryAcct.class */
    public final class CategoryAcct<Model, Data> implements getAmountKliring<Model, Data> {
        private final onFindViewById.write<List<Throwable>> b;
        private final List<getAmountKliring<Model, Data>> c;

        /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$CategoryAcct$write.class */
        static final class write<Data> implements CreateQueueReservationResponse$$Parcelable<Data>, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<Data> {
            private final List<CreateQueueReservationResponse$$Parcelable<Data>> a;
            private CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super Data> b;
            private int c;
            private List<Throwable> d;
            private boolean e;
            private setCategories i;
            private final onFindViewById.write<List<Throwable>> j;

            write(List<CreateQueueReservationResponse$$Parcelable<Data>> list, onFindViewById.write<List<Throwable>> write) {
                this.j = write;
                if (!list.isEmpty()) {
                    this.a = list;
                    this.c = 0;
                    return;
                }
                throw new IllegalArgumentException("Must not be empty.");
            }

            private void d() {
                if (!this.e) {
                    if (this.c < this.a.size() - 1) {
                        this.c++;
                        a(this.i, this.b);
                    } else if (this.d != null) {
                        this.b.b(new GlideException("Fetch failed", new ArrayList(this.d)));
                    } else {
                        throw new NullPointerException("Argument must not be null");
                    }
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a() {
                this.e = true;
                for (CreateQueueReservationResponse$$Parcelable<Data> createQueueReservationResponse$$Parcelable : this.a) {
                    createQueueReservationResponse$$Parcelable.a();
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
            public final void a(Data data) {
                if (data != null) {
                    this.b.a(data);
                } else {
                    d();
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
                this.i = setcategories;
                this.b = iconCompatParcelizer;
                this.d = this.j.a();
                this.a.get(this.c).a(setcategories, this);
                if (this.e) {
                    a();
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final setNextCategoryCd b() {
                return this.a.get(0).b();
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
            public final void b(Exception exc) {
                List<Throwable> list = this.d;
                if (list != null) {
                    list.add(exc);
                    d();
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void c() {
                List<Throwable> list = this.d;
                if (list != null) {
                    this.j.c(list);
                }
                this.d = null;
                for (CreateQueueReservationResponse$$Parcelable<Data> createQueueReservationResponse$$Parcelable : this.a) {
                    createQueueReservationResponse$$Parcelable.c();
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final Class<Data> e() {
                return this.a.get(0).e();
            }
        }

        public CategoryAcct(List<getAmountKliring<Model, Data>> list, onFindViewById.write<List<Throwable>> write2) {
            this.c = list;
            this.b = write2;
        }

        @Override // o.getAmountKliring
        public final boolean a(Model model) {
            for (getAmountKliring<Model, Data> getamountkliring : this.c) {
                if (getamountkliring.a(model)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.getAmountKliring
        public final getAmountKliring.write<Data> c(Model model, int i, int i2, CategoryResponse categoryResponse) {
            int size = this.c.size();
            ArrayList arrayList = new ArrayList(size);
            setCode setcode = null;
            for (int i3 = 0; i3 < size; i3++) {
                getAmountKliring<Model, Data> getamountkliring = this.c.get(i3);
                setcode = setcode;
                if (getamountkliring.a(model)) {
                    getAmountKliring.write<Data> c = getamountkliring.c(model, i, i2, categoryResponse);
                    setcode = setcode;
                    if (c != null) {
                        setcode = c.b;
                        arrayList.add(c.a);
                    }
                }
            }
            getAmountKliring.write<Data> write2 = null;
            if (!arrayList.isEmpty()) {
                write2 = null;
                if (setcode != null) {
                    write2 = new getAmountKliring.write<>(setcode, new write(arrayList, this.b));
                }
            }
            return write2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiModelLoader{modelLoaders=");
            sb.append(Arrays.toString(this.c.toArray()));
            sb.append('}');
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$Content.class */
    public final class Content implements getAmountKliring<Uri, InputStream> {
        private final Context c;

        public Content(Context context) {
            this.c = context.getApplicationContext();
        }

        @Override // o.getAmountKliring
        public final /* synthetic */ boolean a(Uri uri) {
            Uri uri2 = uri;
            return CustDataResponse.a(uri2) && !uri2.getPathSegments().contains("video");
        }

        @Override // o.getAmountKliring
        public final /* synthetic */ getAmountKliring.write<InputStream> c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
            Uri uri2 = uri;
            if (!CustDataResponse.a(i, i2)) {
                return null;
            }
            getReceiverPhone getreceiverphone = new getReceiverPhone(uri2);
            Context context = this.c;
            return new getAmountKliring.write<>(getreceiverphone, CreateReservationResponse$$Parcelable.e(context, uri2, new CreateReservationResponse$$Parcelable.write(context.getContentResolver())));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$Languange.class */
    public final class Languange implements setDescription<BitmapDrawable> {
        private final setDescription<Bitmap> a;
        private final setValueArray d;

        public Languange(setValueArray setvaluearray, setDescription<Bitmap> setdescription) {
            this.d = setvaluearray;
            this.a = setdescription;
        }

        @Override // o.setDescription
        public final setCategoryIn a(CategoryResponse categoryResponse) {
            return this.a.a(categoryResponse);
        }

        @Override // o.setContentOrder
        public final /* synthetic */ boolean c(Object obj, File file, CategoryResponse categoryResponse) {
            return this.a.c(new setIndonesian(((BitmapDrawable) ((setIbanFlag) obj).a()).getBitmap(), this.d), file, categoryResponse);
        }
    }

    getAmountKliring<T, Y> e(getListCategory getlistcategory);
}
