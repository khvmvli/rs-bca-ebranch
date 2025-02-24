package o;

import java.util.ArrayList;
import java.util.List;
import o.onFindViewById;
import o.setInitialSavedState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setAnimator.class */
public final class setAnimator implements setInitialSavedState.write {
    Runnable a;
    final setInitialSavedState b;
    final boolean c;
    final IconCompatParcelizer d;
    int e;
    final ArrayList<setAnimator$MediaBrowserCompat$CustomActionResultReceiver> g;
    final ArrayList<setAnimator$MediaBrowserCompat$CustomActionResultReceiver> h;
    private onFindViewById.write<setAnimator$MediaBrowserCompat$CustomActionResultReceiver> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAnimator$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(int i, int i2, Object obj);

        void b(int i, int i2);

        void c(int i, int i2);

        void c(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver);

        void d(int i, int i2);

        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e(int i);

        void e(int i, int i2);

        void e(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAnimator(IconCompatParcelizer iconCompatParcelizer) {
        this(iconCompatParcelizer, false);
    }

    private setAnimator(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.j = new onFindViewById.RemoteActionCompatParcelizer(30);
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.e = 0;
        this.d = iconCompatParcelizer;
        this.c = false;
        this.b = new setInitialSavedState(this);
    }

    private int a(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.h.size() - 1; size >= 0; size--) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = this.h.get(size);
            if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 8) {
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d < setanimator_mediabrowsercompat_customactionresultreceiver.c) {
                    i3 = setanimator_mediabrowsercompat_customactionresultreceiver.d;
                    i4 = setanimator_mediabrowsercompat_customactionresultreceiver.c;
                } else {
                    i3 = setanimator_mediabrowsercompat_customactionresultreceiver.c;
                    i4 = setanimator_mediabrowsercompat_customactionresultreceiver.d;
                }
                if (i < i3 || i > i4) {
                    i = i;
                    if (i < setanimator_mediabrowsercompat_customactionresultreceiver.d) {
                        if (i2 == 1) {
                            setanimator_mediabrowsercompat_customactionresultreceiver.d++;
                            setanimator_mediabrowsercompat_customactionresultreceiver.c++;
                            i = i;
                        } else {
                            i = i;
                            if (i2 == 2) {
                                setanimator_mediabrowsercompat_customactionresultreceiver.d--;
                                setanimator_mediabrowsercompat_customactionresultreceiver.c--;
                                i = i;
                            }
                        }
                    }
                } else if (i3 == setanimator_mediabrowsercompat_customactionresultreceiver.d) {
                    if (i2 == 1) {
                        setanimator_mediabrowsercompat_customactionresultreceiver.c++;
                    } else if (i2 == 2) {
                        setanimator_mediabrowsercompat_customactionresultreceiver.c--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        setanimator_mediabrowsercompat_customactionresultreceiver.d++;
                    } else if (i2 == 2) {
                        setanimator_mediabrowsercompat_customactionresultreceiver.d--;
                    }
                    i--;
                }
            } else if (setanimator_mediabrowsercompat_customactionresultreceiver.d <= i) {
                if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 1) {
                    i -= setanimator_mediabrowsercompat_customactionresultreceiver.c;
                } else {
                    i = i;
                    if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 2) {
                        i += setanimator_mediabrowsercompat_customactionresultreceiver.c;
                    }
                }
            } else if (i2 == 1) {
                setanimator_mediabrowsercompat_customactionresultreceiver.d++;
                i = i;
            } else {
                i = i;
                if (i2 == 2) {
                    setanimator_mediabrowsercompat_customactionresultreceiver.d--;
                    i = i;
                }
            }
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver2 = this.h.get(size2);
            if (setanimator_mediabrowsercompat_customactionresultreceiver2.a == 8) {
                if (setanimator_mediabrowsercompat_customactionresultreceiver2.c == setanimator_mediabrowsercompat_customactionresultreceiver2.d || setanimator_mediabrowsercompat_customactionresultreceiver2.c < 0) {
                    this.h.remove(size2);
                    if (!this.c) {
                        setanimator_mediabrowsercompat_customactionresultreceiver2.b = null;
                        this.j.c(setanimator_mediabrowsercompat_customactionresultreceiver2);
                    }
                }
            } else if (setanimator_mediabrowsercompat_customactionresultreceiver2.c <= 0) {
                this.h.remove(size2);
                if (!this.c) {
                    setanimator_mediabrowsercompat_customactionresultreceiver2.b = null;
                    this.j.c(setanimator_mediabrowsercompat_customactionresultreceiver2);
                }
            }
        }
        return i;
    }

    private void a(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver, int i) {
        this.d.e(setanimator_mediabrowsercompat_customactionresultreceiver);
        int i2 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
        if (i2 == 2) {
            this.d.c(i, setanimator_mediabrowsercompat_customactionresultreceiver.c);
        } else if (i2 == 4) {
            this.d.a(i, setanimator_mediabrowsercompat_customactionresultreceiver.c, setanimator_mediabrowsercompat_customactionresultreceiver.b);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private void d(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
        this.h.add(setanimator_mediabrowsercompat_customactionresultreceiver);
        int i = setanimator_mediabrowsercompat_customactionresultreceiver.a;
        if (i == 1) {
            this.d.d(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
        } else if (i == 2) {
            this.d.e(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
        } else if (i == 4) {
            this.d.a(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c, setanimator_mediabrowsercompat_customactionresultreceiver.b);
        } else if (i == 8) {
            this.d.b(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
        } else {
            StringBuilder sb = new StringBuilder("Unknown update op type for ");
            sb.append(setanimator_mediabrowsercompat_customactionresultreceiver);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean d(int i) {
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = this.h.get(i2);
            if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 8) {
                if (c(setanimator_mediabrowsercompat_customactionresultreceiver.c, i2 + 1) == i) {
                    return true;
                }
            } else if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 1) {
                int i3 = setanimator_mediabrowsercompat_customactionresultreceiver.d;
                int i4 = setanimator_mediabrowsercompat_customactionresultreceiver.c;
                for (int i5 = setanimator_mediabrowsercompat_customactionresultreceiver.d; i5 < i3 + i4; i5++) {
                    if (c(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void e(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
        int i;
        if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 1 || setanimator_mediabrowsercompat_customactionresultreceiver.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int a = a(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.a);
        int i2 = setanimator_mediabrowsercompat_customactionresultreceiver.d;
        int i3 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(setanimator_mediabrowsercompat_customactionresultreceiver);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = 1;
        for (int i5 = 1; i5 < setanimator_mediabrowsercompat_customactionresultreceiver.c; i5++) {
            int a2 = a(setanimator_mediabrowsercompat_customactionresultreceiver.d + (i * i5), setanimator_mediabrowsercompat_customactionresultreceiver.a);
            int i6 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
            if (i6 == 2 ? a2 == a : i6 == 4 && a2 == a + 1) {
                i4++;
            } else {
                setAnimator$MediaBrowserCompat$CustomActionResultReceiver c = c(setanimator_mediabrowsercompat_customactionresultreceiver.a, a, i4, setanimator_mediabrowsercompat_customactionresultreceiver.b);
                a(c, i2);
                if (!this.c) {
                    c.b = null;
                    this.j.c(c);
                }
                i2 = i2;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 4) {
                    i2 += i4;
                }
                i4 = 1;
                a = a2;
            }
        }
        Object obj = setanimator_mediabrowsercompat_customactionresultreceiver.b;
        if (!this.c) {
            setanimator_mediabrowsercompat_customactionresultreceiver.b = null;
            this.j.c(setanimator_mediabrowsercompat_customactionresultreceiver);
        }
        if (i4 > 0) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver c2 = c(setanimator_mediabrowsercompat_customactionresultreceiver.a, a, i4, obj);
            a(c2, i2);
            if (!this.c) {
                c2.b = null;
                this.j.c(c2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 1840
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimator.a():void");
    }

    @Override // o.setInitialSavedState.write
    public final void a(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
        if (!this.c) {
            setanimator_mediabrowsercompat_customactionresultreceiver.b = null;
            this.j.c(setanimator_mediabrowsercompat_customactionresultreceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.d.c(this.h.get(i));
        }
        d(this.h);
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        return c(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i, int i2) {
        int size = this.h.size();
        for (int i3 = i2; i3 < size; i3++) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = this.h.get(i3);
            if (setanimator_mediabrowsercompat_customactionresultreceiver.a != 8) {
                i = i;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d > i) {
                    continue;
                } else if (setanimator_mediabrowsercompat_customactionresultreceiver.a != 2) {
                    i = i;
                    if (setanimator_mediabrowsercompat_customactionresultreceiver.a == 1) {
                        i += setanimator_mediabrowsercompat_customactionresultreceiver.c;
                    }
                } else if (i < setanimator_mediabrowsercompat_customactionresultreceiver.d + setanimator_mediabrowsercompat_customactionresultreceiver.c) {
                    return -1;
                } else {
                    i -= setanimator_mediabrowsercompat_customactionresultreceiver.c;
                }
            } else if (setanimator_mediabrowsercompat_customactionresultreceiver.d == i) {
                i = setanimator_mediabrowsercompat_customactionresultreceiver.c;
            } else {
                int i4 = i;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d < i) {
                    i4 = i - 1;
                }
                i = i4;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.c <= i4) {
                    i = i4 + 1;
                }
            }
        }
        return i;
    }

    @Override // o.setInitialSavedState.write
    public final setAnimator$MediaBrowserCompat$CustomActionResultReceiver c(int i, int i2, int i3, Object obj) {
        setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver;
        setAnimator$MediaBrowserCompat$CustomActionResultReceiver a = this.j.a();
        if (a == null) {
            setanimator_mediabrowsercompat_customactionresultreceiver = new setAnimator$MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, obj);
        } else {
            a.a = i;
            a.d = i2;
            a.c = i3;
            a.b = obj;
            setanimator_mediabrowsercompat_customactionresultreceiver = a;
        }
        return setanimator_mediabrowsercompat_customactionresultreceiver;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(List<setAnimator$MediaBrowserCompat$CustomActionResultReceiver> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = list.get(i);
            if (!this.c) {
                setanimator_mediabrowsercompat_customactionresultreceiver.b = null;
                this.j.c(setanimator_mediabrowsercompat_customactionresultreceiver);
            }
        }
        list.clear();
    }

    public final int e(int i) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = this.g.get(i2);
            int i3 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
            if (i3 == 1) {
                i = i;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d <= i) {
                    i += setanimator_mediabrowsercompat_customactionresultreceiver.c;
                }
            } else if (i3 == 2) {
                i = i;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d > i) {
                    continue;
                } else if (setanimator_mediabrowsercompat_customactionresultreceiver.d + setanimator_mediabrowsercompat_customactionresultreceiver.c > i) {
                    return -1;
                } else {
                    i -= setanimator_mediabrowsercompat_customactionresultreceiver.c;
                }
            } else if (i3 != 8) {
                i = i;
            } else if (setanimator_mediabrowsercompat_customactionresultreceiver.d == i) {
                i = setanimator_mediabrowsercompat_customactionresultreceiver.c;
            } else {
                int i4 = i;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.d < i) {
                    i4 = i - 1;
                }
                i = i4;
                if (setanimator_mediabrowsercompat_customactionresultreceiver.c <= i4) {
                    i = i4 + 1;
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        b();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = this.g.get(i);
            int i2 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
            if (i2 == 1) {
                this.d.c(setanimator_mediabrowsercompat_customactionresultreceiver);
                this.d.d(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
            } else if (i2 == 2) {
                this.d.c(setanimator_mediabrowsercompat_customactionresultreceiver);
                this.d.c(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
            } else if (i2 == 4) {
                this.d.c(setanimator_mediabrowsercompat_customactionresultreceiver);
                this.d.a(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c, setanimator_mediabrowsercompat_customactionresultreceiver.b);
            } else if (i2 == 8) {
                this.d.c(setanimator_mediabrowsercompat_customactionresultreceiver);
                this.d.b(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
            }
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        }
        d(this.g);
        this.e = 0;
    }
}
