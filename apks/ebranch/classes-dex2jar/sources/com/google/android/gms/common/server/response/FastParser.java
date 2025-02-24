package com.google.android.gms.common.server.response;

import java.util.Stack;
import o.BankTransfer;
import o.getAccType;
import o.getJenisWarkatTransaksi;
import o.getNamaKontakPengirim;
import o.setSex;
import o.setTypeID;
import o.setUpdatedAt;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/server/response/FastParser.class */
public final class FastParser<T> {
    private static final char[] d = {'u', 'l', 'l'};
    private static final char[] c = {'r', 'u', 'e'};
    private static final char[] a = {'r', 'u', 'e', '\"'};
    private static final char[] b = {'a', 'l', 's', 'e'};
    private static final char[] e = {'a', 'l', 's', 'e', '\"'};
    private static final char[] j = {'\n'};
    private static final getAccType f = new setUpdatedAt();
    private static final getAccType i = new setTypeID();
    private static final getAccType g = new getAccType() { // from class: o.Account$$Parcelable
    };
    private static final getAccType h = new getAccType() { // from class: o.Account$$Parcelable.1
    };
    private static final getAccType m = new setSex();

    /* renamed from: o  reason: collision with root package name */
    private static final getAccType f70o = new getJenisWarkatTransaksi();
    private static final getAccType k = new getNamaKontakPengirim();
    private static final getAccType l = new BankTransfer();
    private final char[] n = new char[1];
    private final char[] q = new char[32];
    private final char[] p = new char[1024];
    private final StringBuilder t = new StringBuilder(32);
    private final StringBuilder r = new StringBuilder(1024);
    private final Stack s = new Stack();

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/common/server/response/FastParser$ParseException.class */
    public static class ParseException extends Exception {
    }
}
