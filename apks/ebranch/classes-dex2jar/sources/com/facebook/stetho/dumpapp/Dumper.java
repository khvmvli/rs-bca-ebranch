package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.Stetho;
import o.getDumperPlugins;
import org.apache.commons.cli.ParseException;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/Dumper.class */
public class Dumper {
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final Stetho.1 mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new Stetho.2());
    }

    public Dumper(Iterable<DumperPlugin> iterable, Stetho.1 r6) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = r6;
        this.mGlobalOptions = new GlobalOptions();
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) throws ParseException, DumpException {
        Stetho.3 d = this.mParser.d(this.mGlobalOptions.options, strArr, true);
        if (d.c.contains(d.e(this.mGlobalOptions.optionHelp.e))) {
            dumpUsage(printStream);
            return 0;
        }
        if (d.c.contains(d.e(this.mGlobalOptions.optionListPlugins.e))) {
            dumpAvailablePlugins(printStream);
            return 0;
        } else if (!d.b.isEmpty()) {
            dumpPluginOutput(inputStream, printStream, printStream2, d);
            return 0;
        } else {
            dumpUsage(printStream2);
            return 1;
        }
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList();
        for (DumperPlugin dumperPlugin : this.mDumperPlugins.values()) {
            arrayList.add(dumperPlugin.getName());
        }
        Collections.sort(arrayList);
        for (String str : arrayList) {
            printStream.println(str);
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, Stetho.3 r13) throws DumpException {
        ArrayList arrayList = new ArrayList(r13.b);
        if (arrayList.size() > 0) {
            String str = (String) arrayList.remove(0);
            DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
            if (dumperPlugin != null) {
                dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList));
                return;
            }
            StringBuilder sb = new StringBuilder("No plugin named '");
            sb.append(str);
            sb.append("'");
            throw new DumpException(sb.toString());
        }
        throw new DumpException("Expected plugin argument");
    }

    private void dumpUsage(PrintStream printStream) {
        getDumperPlugins getdumperplugins = new getDumperPlugins();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            getdumperplugins.c(printWriter, getdumperplugins.h, this.mGlobalOptions.options, getdumperplugins.e, getdumperplugins.a);
        } finally {
            printWriter.flush();
        }
    }

    private static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap hashMap = new HashMap();
        for (DumperPlugin dumperPlugin : iterable) {
            hashMap.put(dumperPlugin.getName(), dumperPlugin);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (DumpException e) {
            printStream2.println(e.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            e3.printStackTrace(printStream2);
            return 1;
        } catch (ParseException e4) {
            printStream2.println(e4.getMessage());
            dumpUsage(printStream2);
            return 1;
        }
    }
}
