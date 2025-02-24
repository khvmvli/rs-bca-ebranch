package o;

import java.io.File;
import o.setProductTypeName;
/* loaded from: classes-dex2jar.jar:o/getAccountID.class */
final class getAccountID<DataType> implements setProductTypeName.write {
    private final setContentOrder<DataType> a;
    private final DataType b;
    private final CategoryResponse d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getAccountID(setContentOrder<DataType> setcontentorder, DataType datatype, CategoryResponse categoryResponse) {
        this.a = setcontentorder;
        this.b = datatype;
        this.d = categoryResponse;
    }

    @Override // o.setProductTypeName.write
    public final boolean b(File file) {
        return this.a.c(this.b, file, this.d);
    }
}
