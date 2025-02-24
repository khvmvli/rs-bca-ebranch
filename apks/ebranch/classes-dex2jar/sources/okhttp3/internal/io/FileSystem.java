package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.initialize;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/io/FileSystem.class */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: okhttp3.internal.io.FileSystem.1
        @Override // okhttp3.internal.io.FileSystem
        public initialize appendingSink(File file) throws FileNotFoundException {
            try {
                return ChuckerDatabase.d(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return ChuckerDatabase.d(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        StringBuilder sb = new StringBuilder("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public initialize sink(File file) throws FileNotFoundException {
            try {
                return ChuckerDatabase.e(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return ChuckerDatabase.e(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public defaultInspectorModulesProvider source(File file) throws FileNotFoundException {
            return ChuckerDatabase.a(file);
        }
    };

    initialize appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    initialize sink(File file) throws FileNotFoundException;

    long size(File file);

    defaultInspectorModulesProvider source(File file) throws FileNotFoundException;
}
