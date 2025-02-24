package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/OutwardRemittanceMenuActivity_ViewBinding.class */
public final class OutwardRemittanceMenuActivity_ViewBinding {
    @infoContactPersonDialogEvent(c = "AvailableDate")
    public List<IconCompatParcelizer> c;

    /* loaded from: classes-dex2jar.jar:o/OutwardRemittanceMenuActivity_ViewBinding$IconCompatParcelizer.class */
    public final class IconCompatParcelizer {
        @infoContactPersonDialogEvent(c = "FlagHoliday")
        public String a;
        @infoContactPersonDialogEvent(c = "Date")
        public String b;
        @infoContactPersonDialogEvent(c = "AvailableBookingTime")
        public List<RemoteActionCompatParcelizer> e;
    }

    /* loaded from: classes-dex2jar.jar:o/OutwardRemittanceMenuActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer {
        @infoContactPersonDialogEvent(c = "FlagEnable")
        public String a;
        @infoContactPersonDialogEvent(c = "RemainingSlot")
        public String c;
        @infoContactPersonDialogEvent(c = "TimeSlot")
        public String e;
    }
}
