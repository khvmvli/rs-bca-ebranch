package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/OutwardRemittanceFormActivity_ViewBinding.class */
public final class OutwardRemittanceFormActivity_ViewBinding implements Parcelable {
    public static final Parcelable.Creator<OutwardRemittanceFormActivity_ViewBinding> CREATOR = new read();
    @infoContactPersonDialogEvent(c = "categories")
    public final List<IconCompatParcelizer> e;

    /* loaded from: classes-dex2jar.jar:o/OutwardRemittanceFormActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new OutwardRemittanceFormActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver();
        @infoContactPersonDialogEvent(c = "content_order")
        public final String a;
        @infoContactPersonDialogEvent(c = "category_cd")
        private final String b;
        @infoContactPersonDialogEvent(c = "content_in")
        public final String c;
        @infoContactPersonDialogEvent(c = "category_in")
        private final String d;
        @infoContactPersonDialogEvent(c = "category_en")
        private final String e;
        @infoContactPersonDialogEvent(c = "content_en")
        private final String f;
        @infoContactPersonDialogEvent(c = "next_category_cd")
        private final String h;

        public IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            subscribeReservationRescheduleEvent.e(str, "");
            subscribeReservationRescheduleEvent.e(str2, "");
            subscribeReservationRescheduleEvent.e(str3, "");
            subscribeReservationRescheduleEvent.e(str4, "");
            subscribeReservationRescheduleEvent.e(str5, "");
            subscribeReservationRescheduleEvent.e(str6, "");
            subscribeReservationRescheduleEvent.e(str7, "");
            this.b = str;
            this.d = str2;
            this.e = str3;
            this.a = str4;
            this.c = str5;
            this.f = str6;
            this.h = str7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) iconCompatParcelizer.b) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) iconCompatParcelizer.d) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) iconCompatParcelizer.e) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) iconCompatParcelizer.a) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) iconCompatParcelizer.c) && subscribeReservationRescheduleEvent.b((Object) this.f, (Object) iconCompatParcelizer.f) && subscribeReservationRescheduleEvent.b((Object) this.h, (Object) iconCompatParcelizer.h);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return (((((((((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode();
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("Category(categoryCd=");
            sb.append(this.b);
            sb.append(", categoryIn=");
            sb.append(this.d);
            sb.append(", categoryEn=");
            sb.append(this.e);
            sb.append(", contentOrder=");
            sb.append(this.a);
            sb.append(", contentIn=");
            sb.append(this.c);
            sb.append(", contentEn=");
            sb.append(this.f);
            sb.append(", nextCategoryCd=");
            sb.append(this.h);
            sb.append(')');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.c);
            parcel.writeString(this.f);
            parcel.writeString(this.h);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/OutwardRemittanceFormActivity_ViewBinding$read.class */
    public static final class read implements Parcelable.Creator<OutwardRemittanceFormActivity_ViewBinding> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OutwardRemittanceFormActivity_ViewBinding createFromParcel(Parcel parcel) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(IconCompatParcelizer.CREATOR.createFromParcel(parcel));
            }
            return new OutwardRemittanceFormActivity_ViewBinding(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OutwardRemittanceFormActivity_ViewBinding[] newArray(int i) {
            return new OutwardRemittanceFormActivity_ViewBinding[i];
        }
    }

    public OutwardRemittanceFormActivity_ViewBinding(List<IconCompatParcelizer> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutwardRemittanceFormActivity_ViewBinding) && subscribeReservationRescheduleEvent.b(this.e, ((OutwardRemittanceFormActivity_ViewBinding) obj).e);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoriesKU(categories=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        List<IconCompatParcelizer> list = this.e;
        parcel.writeInt(list.size());
        for (IconCompatParcelizer iconCompatParcelizer : list) {
            iconCompatParcelizer.writeToParcel(parcel, i);
        }
    }
}
