package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/populateUrl.class */
public final class populateUrl extends isSsl$com_github_ChuckerTeam_Chucker_library {
    public static final populateUrl d;
    private static final InquiryLoadDataBTPresenter g;

    static {
        populateUrl populateurl = new populateUrl();
        d = populateurl;
        populateUrl populateurl2 = populateurl;
        int e = getStatus$com_github_ChuckerTeam_Chucker_library.e();
        if (64 >= e) {
            e = 64;
        }
        g = new SubmitBankNotesPresenter(populateurl2, getResponseSizeString$com_github_ChuckerTeam_Chucker_library.e("kotlinx.coroutines.io.parallelism", e, 0, 0, 12, null), "Dispatchers.IO", 1) { // from class: o.setHost$com_github_ChuckerTeam_Chucker_library
            private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(setHost$com_github_ChuckerTeam_Chucker_library.class, "inFlightTasks");
            private final isSsl$com_github_ChuckerTeam_Chucker_library b;
            private final int g;
            private final int h = 1;
            private final ConcurrentLinkedQueue<Runnable> i = new ConcurrentLinkedQueue<>();
            private volatile /* synthetic */ int inFlightTasks = 0;
            private final String j;

            {
                this.b = r5;
                this.g = r6;
                this.j = r7;
            }

            private final void b(Runnable runnable, boolean z) {
                Runnable poll;
                do {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
                    if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.g) {
                        setHost$com_github_ChuckerTeam_Chucker_library sethost_com_github_chuckerteam_chucker_library = this;
                        try {
                            this.b.b.a(runnable, sethost_com_github_chuckerteam_chucker_library, z);
                            return;
                        } catch (RejectedExecutionException e2) {
                            RequestOTPPresenter.a.d(setError.b(runnable, sethost_com_github_chuckerteam_chucker_library));
                            return;
                        }
                    } else {
                        this.i.add(runnable);
                        if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.g) {
                            poll = this.i.poll();
                            runnable = poll;
                        } else {
                            return;
                        }
                    }
                } while (poll != null);
            }

            @Override // o.setPath$com_github_ChuckerTeam_Chucker_library
            public final int a() {
                return this.h;
            }

            @Override // o.setPath$com_github_ChuckerTeam_Chucker_library
            public final void c() {
                Runnable poll = this.i.poll();
                if (poll != null) {
                    setHost$com_github_ChuckerTeam_Chucker_library sethost_com_github_chuckerteam_chucker_library = this;
                    try {
                        this.b.b.a(poll, sethost_com_github_chuckerteam_chucker_library, true);
                    } catch (RejectedExecutionException e2) {
                        RequestOTPPresenter.a.d(setError.b(poll, sethost_com_github_chuckerteam_chucker_library));
                    }
                } else {
                    d.decrementAndGet(this);
                    Runnable poll2 = this.i.poll();
                    if (poll2 != null) {
                        b(poll2, true);
                    }
                }
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
            }

            @Override // o.InquiryLoadDataBTPresenter
            public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
                b(runnable, false);
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                b(runnable, false);
            }

            @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
            public final String toString() {
                String str = this.j;
                String str2 = str;
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(toString());
                    sb.append("[dispatcher = ");
                    sb.append(this.b);
                    sb.append(']');
                    str2 = sb.toString();
                }
                return str2;
            }
        };
    }

    private populateUrl() {
        super(0, 0, (String) null, 7);
    }

    public static InquiryLoadDataBTPresenter a() {
        return g;
    }

    @Override // o.isSsl$com_github_ChuckerTeam_Chucker_library, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o.isSsl$com_github_ChuckerTeam_Chucker_library, o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        return "Dispatchers.Default";
    }
}
