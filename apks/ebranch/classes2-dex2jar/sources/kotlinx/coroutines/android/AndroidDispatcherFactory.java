package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import o.getError;
import o.getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/android/AndroidDispatcherFactory.class */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(getError.e(Looper.getMainLooper(), true), (String) null, 2);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
