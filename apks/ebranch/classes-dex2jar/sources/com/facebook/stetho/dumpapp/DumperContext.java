package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import o.Stetho;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/DumperContext.class */
public class DumperContext {
    private final List<String> mArgs;
    private final Stetho.1 mParser;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;

    protected DumperContext(DumperContext dumperContext, List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }

    public DumperContext(InputStream inputStream, PrintStream printStream, PrintStream printStream2, Stetho.1 r7, List<String> list) {
        this.mStdin = (InputStream) Util.throwIfNull(inputStream);
        this.mStdout = (PrintStream) Util.throwIfNull(printStream);
        this.mStderr = (PrintStream) Util.throwIfNull(printStream2);
        this.mParser = (Stetho.1) Util.throwIfNull(r7);
        this.mArgs = (List) Util.throwIfNull(list);
    }

    public List<String> getArgsAsList() {
        return this.mArgs;
    }

    public Stetho.1 getParser() {
        return this.mParser;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }
}
