package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.CategoryResponse$$Parcelable;
import o.GetAcctOpeningCategoryDataResponse;
import o.GetAcctOpeningCategoryDataResponse$$Parcelable;
import o.GetDaftarPekerjaanResponse;
import o.GetDaftarPekerjaanResponse$$Parcelable;
import o.getAmountKliring;
import o.getBusinessField;
import o.getDaftarPekerjaanOutputList;
import o.getResidency;
import o.getTxnPurposeType;
import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setContentOrder;
import o.setDaftarPekerjaanOutputList;
import o.setDescription;
import o.setDistanceToBranch;
import o.setEmergencyCloseStartDate;
import o.setOccupation;
import o.setPhoneID;
import o.setReservationDate;
import o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry.class */
public final class Registry {
    private final onFindViewById.write<List<Throwable>> h;
    private final GetAcctOpeningCategoryDataResponse$$Parcelable i;
    private final GetDaftarPekerjaanResponse.DataPekerjaanOutput j = new GetDaftarPekerjaanResponse.DataPekerjaanOutput();
    private final setDaftarPekerjaanOutputList g = new setDaftarPekerjaanOutputList();
    public final getBusinessField d = new getBusinessField();
    private final GetDaftarPekerjaanResponse$$Parcelable a = new GetDaftarPekerjaanResponse$$Parcelable();
    public final setOccupation b = new setOccupation();
    public final setReservationDate e = new setReservationDate();
    private final setDistanceToBranch f = new setDistanceToBranch();
    public final getDaftarPekerjaanOutputList c = new getDaftarPekerjaanOutputList();

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry$MissingComponentException.class */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry$NoImageHeaderParserException.class */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry$NoModelLoaderAvailableException.class */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public NoModelLoaderAvailableException(java.lang.Class<?> r5, java.lang.Class<?> r6) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Failed to find any ModelLoaders for model: "
                r1.<init>(r2)
                r7 = r0
                r0 = r7
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                java.lang.String r1 = " and data: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r7
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Class, java.lang.Class):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public NoModelLoaderAvailableException(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Failed to find any ModelLoaders registered for model class: "
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.Class r1 = r1.getClass()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public <M> NoModelLoaderAvailableException(M r5, java.util.List<o.getAmountKliring<M, ?>> r6) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Found ModelLoaders for model class: "
                r1.<init>(r2)
                r7 = r0
                r0 = r7
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                java.lang.String r1 = ", but none that handle this specific model instance: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r7
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object, java.util.List):void");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry$NoResultEncoderAvailableException.class */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public NoResultEncoderAvailableException(java.lang.Class<?> r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Failed to find result encoder for resource class: "
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r6
                java.lang.String r1 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoResultEncoderAvailableException.<init>(java.lang.Class):void");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/Registry$NoSourceEncoderAvailableException.class */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public NoSourceEncoderAvailableException(java.lang.Class<?> r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Failed to find source encoder for data class: "
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoSourceEncoderAvailableException.<init>(java.lang.Class):void");
        }
    }

    public Registry() {
        onFindViewById.write<List<Throwable>> c = getTxnPurposeValue.c();
        this.h = c;
        this.i = new GetAcctOpeningCategoryDataResponse$$Parcelable(c);
        c(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private Registry c(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.a.a(arrayList);
        return this;
    }

    public final <TResource, Transcode> Registry a(Class<TResource> cls, Class<Transcode> cls2, setEmergencyCloseStartDate<TResource, Transcode> setemergencyclosestartdate) {
        this.f.c(cls, cls2, setemergencyclosestartdate);
        return this;
    }

    public final <Data, TResource, Transcode> getResidency<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        getResidency<Data, TResource, Transcode> b = this.g.b(cls, cls2, cls3);
        if (setDaftarPekerjaanOutputList.b(b)) {
            return null;
        }
        getResidency<Data, TResource, Transcode> getresidency = b;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls4 : this.a.a(cls, cls2)) {
                for (Class cls5 : this.f.a(cls4, cls3)) {
                    arrayList.add(new setPhoneID(cls, cls4, cls5, this.a.b(cls, cls4), this.f.d(cls4, cls5), this.h));
                }
            }
            getresidency = arrayList.isEmpty() ? null : new getResidency<>(cls, cls2, cls3, arrayList, this.h);
            setDaftarPekerjaanOutputList setdaftarpekerjaanoutputlist = this.g;
            synchronized (setdaftarpekerjaanoutputlist.a) {
                setdaftarpekerjaanoutputlist.a.put(new getTxnPurposeType(cls, cls2, cls3), getresidency == null ? setDaftarPekerjaanOutputList.d : getresidency);
            }
        }
        return getresidency;
    }

    public final <Model, Data> Registry b(Class<Model> cls, Class<Data> cls2, GetAcctOpeningCategoryDataResponse<Model, Data> getAcctOpeningCategoryDataResponse) {
        GetAcctOpeningCategoryDataResponse$$Parcelable getAcctOpeningCategoryDataResponse$$Parcelable = this.i;
        synchronized (getAcctOpeningCategoryDataResponse$$Parcelable) {
            getAcctOpeningCategoryDataResponse$$Parcelable.d.d(cls, cls2, getAcctOpeningCategoryDataResponse);
            getAcctOpeningCategoryDataResponse$$Parcelable.b.c.clear();
        }
        return this;
    }

    public final <Data, TResource> Registry b(String str, Class<Data> cls, Class<TResource> cls2, CategoryResponse$$Parcelable<Data, TResource> categoryResponse$$Parcelable) {
        this.a.a(str, categoryResponse$$Parcelable, cls, cls2);
        return this;
    }

    public final <Model> List<getAmountKliring<Model, ?>> b(Model model) {
        List d = this.i.d(model.getClass());
        if (!d.isEmpty()) {
            int size = d.size();
            List<getAmountKliring<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                getAmountKliring<Model, ?> getamountkliring = (getAmountKliring) d.get(i);
                emptyList = emptyList;
                z = z;
                if (getamountkliring.a(model)) {
                    z = z;
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(getamountkliring);
                    emptyList = emptyList;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, d);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public final Registry d(ImageHeaderParser imageHeaderParser) {
        getDaftarPekerjaanOutputList getdaftarpekerjaanoutputlist = this.c;
        synchronized (getdaftarpekerjaanoutputlist) {
            getdaftarpekerjaanoutputlist.c.add(imageHeaderParser);
        }
        return this;
    }

    public final <Data> Registry d(Class<Data> cls, setContentOrder<Data> setcontentorder) {
        this.d.b(cls, setcontentorder);
        return this;
    }

    public final <TResource> Registry d(Class<TResource> cls, setDescription<TResource> setdescription) {
        this.b.a(cls, setdescription);
        return this;
    }

    public final Registry e(setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?> setreservationtime_mediabrowsercompat_customactionresultreceiver) {
        setReservationDate setreservationdate = this.e;
        synchronized (setreservationdate) {
            setreservationdate.a.put(setreservationtime_mediabrowsercompat_customactionresultreceiver.c(), setreservationtime_mediabrowsercompat_customactionresultreceiver);
        }
        return this;
    }

    public final <Model, TResource, Transcode> List<Class<?>> e(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> d = this.j.d(cls, cls2, cls3);
        List<Class<?>> list = d;
        if (d == null) {
            list = new ArrayList<>();
            for (Class<?> cls4 : this.i.b(cls)) {
                for (Class<?> cls5 : this.a.a(cls4, cls2)) {
                    if (!this.f.a(cls5, cls3).isEmpty() && !list.contains(cls5)) {
                        list.add(cls5);
                    }
                }
            }
            GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput = this.j;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(list);
            synchronized (dataPekerjaanOutput.b) {
                dataPekerjaanOutput.b.put(new getTxnPurposeType(cls, cls2, cls3), unmodifiableList);
            }
        }
        return list;
    }
}
