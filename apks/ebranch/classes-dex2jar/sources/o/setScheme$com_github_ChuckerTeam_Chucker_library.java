package o;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes-dex2jar.jar:o/setScheme$com_github_ChuckerTeam_Chucker_library.class */
public interface setScheme$com_github_ChuckerTeam_Chucker_library extends initialize, WritableByteChannel {
    long a(defaultInspectorModulesProvider defaultinspectormodulesprovider) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library a(int i) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library a(setResponseMessage setresponsemessage) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library a(byte[] bArr, int i, int i2) throws IOException;

    setResponseContentType c();

    setScheme$com_github_ChuckerTeam_Chucker_library e() throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library e(int i) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library e(String str) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library e(String str, int i, int i2) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library e(byte[] bArr) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library f(int i) throws IOException;

    @Override // o.initialize, java.io.Flushable
    void flush() throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library g() throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library j(long j) throws IOException;

    setScheme$com_github_ChuckerTeam_Chucker_library m(long j) throws IOException;
}
