package com.facebook.stetho.dumpapp.plugins;

import android.os.Process;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.ArgsHelper;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/plugins/CrashDumperPlugin.class */
public class CrashDumperPlugin implements DumperPlugin {
    private static final String NAME = "crash";
    private static final String OPTION_EXIT_DEFAULT = "0";
    private static final String OPTION_KILL_DEFAULT = "9";
    private static final String OPTION_THROW_DEFAULT = "java.lang.Error";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/plugins/CrashDumperPlugin$ThrowRunnable.class */
    public static class ThrowRunnable implements Runnable {
        private final Throwable mThrowable;

        public ThrowRunnable(Throwable th) {
            this.mThrowable = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExceptionUtil.sneakyThrow(this.mThrowable);
        }
    }

    private void doKill(DumperContext dumperContext, Iterator<String> it) throws DumpException {
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, OPTION_KILL_DEFAULT);
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            StringBuilder sb = new StringBuilder("-");
            sb.append(nextOptionalArg);
            Process start = processBuilder.command("/system/bin/kill", sb.toString(), String.valueOf(Process.myPid())).redirectErrorStream(true).start();
            Util.copy(start.getInputStream(), dumperContext.getStdout(), new byte[1024]);
            start.destroy();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder("Failed to invoke kill: ");
            sb2.append(e);
            throw new DumpException(sb2.toString());
        }
    }

    private void doSystemExit(Iterator<String> it) {
        System.exit(Integer.parseInt(ArgsHelper.nextOptionalArg(it, OPTION_EXIT_DEFAULT)));
    }

    private void doUncaughtException(Iterator<String> it) throws DumpException {
        Object e;
        try {
            Class<?> cls = Class.forName(ArgsHelper.nextOptionalArg(it, OPTION_THROW_DEFAULT));
            Constructor tryGetDeclaredConstructor = tryGetDeclaredConstructor(cls, String.class);
            Thread thread = new Thread(new ThrowRunnable(tryGetDeclaredConstructor != null ? (Throwable) tryGetDeclaredConstructor.newInstance("Uncaught exception triggered by Stetho") : (Throwable) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
            thread.start();
            Util.joinUninterruptibly(thread);
        } catch (ClassCastException e2) {
            e = e2;
            StringBuilder sb = new StringBuilder("Invalid supplied Throwable class: ");
            sb.append(e);
            throw new DumpException(sb.toString());
        } catch (ClassNotFoundException e3) {
            e = e3;
            StringBuilder sb2 = new StringBuilder("Invalid supplied Throwable class: ");
            sb2.append(e);
            throw new DumpException(sb2.toString());
        } catch (IllegalAccessException e4) {
            e = e4;
            StringBuilder sb22 = new StringBuilder("Invalid supplied Throwable class: ");
            sb22.append(e);
            throw new DumpException(sb22.toString());
        } catch (InstantiationException e5) {
            e = e5;
            StringBuilder sb222 = new StringBuilder("Invalid supplied Throwable class: ");
            sb222.append(e);
            throw new DumpException(sb222.toString());
        } catch (NoSuchMethodException e6) {
            e = e6;
            StringBuilder sb2222 = new StringBuilder("Invalid supplied Throwable class: ");
            sb2222.append(e);
            throw new DumpException(sb2222.toString());
        } catch (InvocationTargetException e7) {
            throw ExceptionUtil.propagate(e7.getCause());
        }
    }

    private void doUsage(PrintStream printStream) {
        printStream.println("Usage: dumpapp crash <command> [command-options]");
        printStream.println("Usage: dumpapp crash throw");
        printStream.println("       dumpapp crash kill");
        printStream.println("       dumpapp crash exit");
        printStream.println();
        printStream.println("dumpapp crash throw: Throw an uncaught exception (simulates a program crash)");
        printStream.println("    <Throwable>: Throwable class to use (default: java.lang.Error)");
        printStream.println();
        printStream.println("dumpapp crash kill: Send a signal to this process (simulates the low memory killer)");
        printStream.println("    <SIGNAL>: Either signal name or number to send (default: 9)");
        printStream.println("              See `adb shell kill -l` for more information");
        printStream.println();
        printStream.println("dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)");
        printStream.println("    <code>: Exit code (default: 0)");
    }

    @Nullable
    private static <T> Constructor<? extends T> tryGetDeclaredConstructor(Class<T> cls, Class<?>... clsArr) {
        try {
            return (Constructor<T>) cls.getDeclaredConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpException {
        Iterator<String> it = dumperContext.getArgsAsList().iterator();
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, null);
        if ("throw".equals(nextOptionalArg)) {
            doUncaughtException(it);
        } else if ("kill".equals(nextOptionalArg)) {
            doKill(dumperContext, it);
        } else if ("exit".equals(nextOptionalArg)) {
            doSystemExit(it);
        } else {
            doUsage(dumperContext.getStdout());
            if (nextOptionalArg != null) {
                StringBuilder sb = new StringBuilder("Unsupported command: ");
                sb.append(nextOptionalArg);
                throw new DumpUsageException(sb.toString());
            }
        }
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
        return NAME;
    }
}
