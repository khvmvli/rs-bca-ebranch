package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:o/setTookMs.class */
public interface setTookMs extends defaultInspectorModulesProvider, ReadableByteChannel {
    String a(Charset charset) throws IOException;

    void a(byte[] bArr) throws IOException;

    int c(BuildConfig buildConfig) throws IOException;

    long c(initialize initialize) throws IOException;

    long c(setResponseMessage setresponsemessage) throws IOException;

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    @Deprecated
    setResponseContentType c();

    setResponseMessage c(long j) throws IOException;

    long d(setResponseMessage setresponsemessage) throws IOException;

    String d(long j) throws IOException;

    void d(setResponseContentType setresponsecontenttype, long j) throws IOException;

    long e(byte b) throws IOException;

    boolean e(long j, setResponseMessage setresponsemessage) throws IOException;

    byte[] e(long j) throws IOException;

    void f(long j) throws IOException;

    boolean f() throws IOException;

    InputStream h();

    boolean h(long j) throws IOException;

    byte i() throws IOException;

    void i(long j) throws IOException;

    setTookMs j();

    int k() throws IOException;

    byte[] l() throws IOException;

    long m() throws IOException;

    int n() throws IOException;

    long o() throws IOException;

    short p() throws IOException;

    long q() throws IOException;

    String r() throws IOException;

    short s() throws IOException;

    String t() throws IOException;
}
