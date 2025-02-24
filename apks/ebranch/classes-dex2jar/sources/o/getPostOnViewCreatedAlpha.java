package o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/getPostOnViewCreatedAlpha.class */
public abstract class getPostOnViewCreatedAlpha extends getPopExitAnim {
    private int e;
    private LayoutInflater m;
    private int n;

    @Deprecated
    public getPostOnViewCreatedAlpha(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, true);
        this.e = i;
        this.n = i;
        this.m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // o.getPopExitAnim
    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.m.inflate(this.e, viewGroup, false);
    }

    @Override // o.getPopExitAnim
    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.m.inflate(this.n, viewGroup, false);
    }
}
