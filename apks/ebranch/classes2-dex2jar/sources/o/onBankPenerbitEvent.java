package o;
/* loaded from: classes2-dex2jar.jar:o/onBankPenerbitEvent.class */
public enum onBankPenerbitEvent {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int[] m;

    /* renamed from: o  reason: collision with root package name */
    public final int f65o;

    onBankPenerbitEvent(int[] iArr, int i) {
        this.m = iArr;
        this.f65o = i;
    }

    public final int e(SubscribeExpiredDate subscribeExpiredDate) {
        int i = subscribeExpiredDate.b;
        return this.m[i <= 9 ? 0 : i <= 26 ? (char) 1 : 2];
    }
}
