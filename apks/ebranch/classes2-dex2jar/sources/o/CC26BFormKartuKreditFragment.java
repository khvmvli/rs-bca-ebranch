package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.CC26BFormKartuKreditFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment.class */
public final class CC26BFormKartuKreditFragment extends CC26BFormKartuKreditFragment_ViewBinding {
    ArrayList<CC26BFormKartuKreditFragment_ViewBinding> e = new ArrayList<>();
    HashMap<CC26BFormKartuKreditFragment_ViewBinding, CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> b = new HashMap<>();
    ArrayList<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> a = new ArrayList<>();
    ArrayList<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> c = new ArrayList<>();
    private boolean j = true;
    private IconCompatParcelizer n = null;
    boolean h = false;
    boolean g = false;
    private long m = 0;
    private onClickUbahDataPekerjaan f = null;
    private long i = -1;

    /* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer {
        private CC26BFormKartuKreditFragment c;

        IconCompatParcelizer(CC26BFormKartuKreditFragment cC26BFormKartuKreditFragment) {
            CC26BFormKartuKreditFragment.this = r4;
            this.c = cC26BFormKartuKreditFragment;
        }

        @Override // o.CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer
        public final void b(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
            ArrayList<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> arrayList = cC26BFormKartuKreditFragment_ViewBinding.d;
            if (arrayList != null) {
                arrayList.remove(this);
                if (cC26BFormKartuKreditFragment_ViewBinding.d.size() == 0) {
                    cC26BFormKartuKreditFragment_ViewBinding.d = null;
                }
            }
            CC26BFormKartuKreditFragment.this.e.remove(cC26BFormKartuKreditFragment_ViewBinding);
            boolean z = true;
            this.c.b.get(cC26BFormKartuKreditFragment_ViewBinding).c = true;
            if (!CC26BFormKartuKreditFragment.this.h) {
                ArrayList<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> arrayList2 = this.c.c;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (!arrayList2.get(i).c) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    if (CC26BFormKartuKreditFragment.this.d != null) {
                        ArrayList arrayList3 = (ArrayList) CC26BFormKartuKreditFragment.this.d.clone();
                        int size2 = arrayList3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) arrayList3.get(i2)).b(this.c);
                        }
                    }
                    this.c.g = false;
                }
            }
        }

        @Override // o.CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer
        public final void c(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver c;
        public int e;

        public RemoteActionCompatParcelizer(CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver, int i) {
            this.c = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.e = i;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment$read.class */
    static final class read implements CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer {
        private CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver b;
        private int c;
        private CC26BFormKartuKreditFragment e;

        public read(CC26BFormKartuKreditFragment cC26BFormKartuKreditFragment, CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver, int i) {
            this.e = cC26BFormKartuKreditFragment;
            this.b = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.c = i;
        }

        private void d(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            if (!this.e.h) {
                int size = this.b.h.size();
                int i = 0;
                while (true) {
                    remoteActionCompatParcelizer = null;
                    if (i >= size) {
                        break;
                    }
                    remoteActionCompatParcelizer = this.b.h.get(i);
                    if (remoteActionCompatParcelizer.e == this.c && remoteActionCompatParcelizer.c.e == cC26BFormKartuKreditFragment_ViewBinding) {
                        ArrayList<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> arrayList = cC26BFormKartuKreditFragment_ViewBinding.d;
                        if (arrayList != null) {
                            arrayList.remove(this);
                            if (cC26BFormKartuKreditFragment_ViewBinding.d.size() == 0) {
                                cC26BFormKartuKreditFragment_ViewBinding.d = null;
                            }
                        }
                    } else {
                        i++;
                    }
                }
                this.b.h.remove(remoteActionCompatParcelizer);
                if (this.b.h.size() == 0) {
                    this.b.e.d();
                    this.e.e.add(this.b.e);
                }
            }
        }

        @Override // o.CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer
        public final void b(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
            if (this.c == 1) {
                d(cC26BFormKartuKreditFragment_ViewBinding);
            }
        }

        @Override // o.CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer
        public final void c(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
            if (this.c == 0) {
                d(cC26BFormKartuKreditFragment_ViewBinding);
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment$write.class */
    public final class write {
        CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver a;

        write(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
            CC26BFormKartuKreditFragment.this = r6;
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = r6.b.get(cC26BFormKartuKreditFragment_ViewBinding);
            this.a = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
            if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
                this.a = new CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver(cC26BFormKartuKreditFragment_ViewBinding);
                r6.b.put(cC26BFormKartuKreditFragment_ViewBinding, this.a);
                r6.a.add(this.a);
            }
        }
    }

    /* renamed from: e */
    public CC26BFormKartuKreditFragment clone() {
        CC26BFormKartuKreditFragment cC26BFormKartuKreditFragment = (CC26BFormKartuKreditFragment) clone();
        cC26BFormKartuKreditFragment.j = true;
        cC26BFormKartuKreditFragment.h = false;
        cC26BFormKartuKreditFragment.g = false;
        cC26BFormKartuKreditFragment.e = new ArrayList<>();
        cC26BFormKartuKreditFragment.b = new HashMap<>();
        cC26BFormKartuKreditFragment.a = new ArrayList<>();
        cC26BFormKartuKreditFragment.c = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver a = next.clone();
            hashMap.put(next, a);
            cC26BFormKartuKreditFragment.a.add(a);
            cC26BFormKartuKreditFragment.b.put(a.e, a);
            ArrayList arrayList = null;
            a.b = null;
            a.h = null;
            a.d = null;
            a.a = null;
            ArrayList<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> arrayList2 = a.e.d;
            if (arrayList2 != null) {
                Iterator<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer next2 = it2.next();
                    if (next2 instanceof IconCompatParcelizer) {
                        ArrayList arrayList3 = arrayList;
                        if (arrayList == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(next2);
                        arrayList = arrayList3;
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.remove((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) it3.next());
                    }
                }
            }
        }
        Iterator<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> it4 = this.a.iterator();
        while (it4.hasNext()) {
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver next3 = it4.next();
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = (CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) hashMap.get(next3);
            if (next3.b != null) {
                Iterator<RemoteActionCompatParcelizer> it5 = next3.b.iterator();
                while (it5.hasNext()) {
                    RemoteActionCompatParcelizer next4 = it5.next();
                    cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.c(new RemoteActionCompatParcelizer((CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) hashMap.get(next4.c), next4.e));
                }
            }
        }
        return cC26BFormKartuKreditFragment;
    }

    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    public final void a(Object obj) {
        Iterator<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding = it.next().e;
            if (cC26BFormKartuKreditFragment_ViewBinding instanceof CC26BFormKartuKreditFragment) {
                ((CC26BFormKartuKreditFragment) cC26BFormKartuKreditFragment_ViewBinding).a(obj);
            } else if (cC26BFormKartuKreditFragment_ViewBinding instanceof onClickUbahDataKartuTambahan3) {
                ((onClickUbahDataKartuTambahan3) cC26BFormKartuKreditFragment_ViewBinding).a(obj);
            }
        }
    }

    public final void a(CC26BFormKartuKreditFragment_ViewBinding... cC26BFormKartuKreditFragment_ViewBindingArr) {
        write write2;
        this.j = true;
        CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding = cC26BFormKartuKreditFragment_ViewBindingArr[0];
        if (cC26BFormKartuKreditFragment_ViewBinding != null) {
            this.j = true;
            write2 = new write(cC26BFormKartuKreditFragment_ViewBinding);
        } else {
            write2 = null;
        }
        for (int i = 1; i < cC26BFormKartuKreditFragment_ViewBindingArr.length; i++) {
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding2 = cC26BFormKartuKreditFragment_ViewBindingArr[i];
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = CC26BFormKartuKreditFragment.this.b.get(cC26BFormKartuKreditFragment_ViewBinding2);
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
            if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
                cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2 = new CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver(cC26BFormKartuKreditFragment_ViewBinding2);
                CC26BFormKartuKreditFragment.this.b.put(cC26BFormKartuKreditFragment_ViewBinding2, cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                CC26BFormKartuKreditFragment.this.a.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
            }
            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2.c(new RemoteActionCompatParcelizer(write2.a, 0));
        }
    }

    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    public final void d() {
        this.h = false;
        this.g = true;
        if (this.j) {
            this.c.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = this.a.get(i);
                if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.b == null || cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.b.size() == 0) {
                    arrayList.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2 = (CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) arrayList.get(i2);
                    this.c.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                    if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2.d != null) {
                        int size3 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2.d.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver3 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2.d.get(i3);
                            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver3.a.remove(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                            if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver3.a.size() == 0) {
                                arrayList2.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                arrayList2.clear();
            }
            this.j = false;
            if (this.c.size() != this.a.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
        } else {
            int size4 = this.a.size();
            for (int i4 = 0; i4 < size4; i4++) {
                CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4 = this.a.get(i4);
                if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.b != null && cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.b.size() > 0) {
                    int size5 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.b.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.b.get(i5);
                        if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.a == null) {
                            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.a = new ArrayList<>();
                        }
                        if (!cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.a.contains(remoteActionCompatParcelizer.c)) {
                            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.a.add(remoteActionCompatParcelizer.c);
                        }
                    }
                }
                cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver4.c = false;
            }
        }
        int size6 = this.c.size();
        for (int i6 = 0; i6 < size6; i6++) {
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver5 = this.c.get(i6);
            ArrayList<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> arrayList3 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver5.e.d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                Iterator it = new ArrayList(arrayList3).iterator();
                while (it.hasNext()) {
                    CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) it.next();
                    if ((remoteActionCompatParcelizer2 instanceof read) || (remoteActionCompatParcelizer2 instanceof IconCompatParcelizer)) {
                        CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver5.e;
                        ArrayList<CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer> arrayList4 = cC26BFormKartuKreditFragment_ViewBinding.d;
                        if (arrayList4 != null) {
                            arrayList4.remove(remoteActionCompatParcelizer2);
                            if (cC26BFormKartuKreditFragment_ViewBinding.d.size() == 0) {
                                cC26BFormKartuKreditFragment_ViewBinding.d = null;
                            }
                        }
                    }
                }
            }
        }
        final ArrayList arrayList5 = new ArrayList();
        for (int i7 = 0; i7 < size6; i7++) {
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6 = this.c.get(i7);
            if (this.n == null) {
                this.n = new IconCompatParcelizer(this);
            }
            if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.b == null || cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.b.size() == 0) {
                arrayList5.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6);
            } else {
                int size7 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.b.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.b.get(i8);
                    CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding2 = remoteActionCompatParcelizer3.c.e;
                    read read2 = new read(this, cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6, remoteActionCompatParcelizer3.e);
                    if (cC26BFormKartuKreditFragment_ViewBinding2.d == null) {
                        cC26BFormKartuKreditFragment_ViewBinding2.d = new ArrayList<>();
                    }
                    cC26BFormKartuKreditFragment_ViewBinding2.d.add(read2);
                }
                cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.h = (ArrayList) cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.b.clone();
            }
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding3 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver6.e;
            IconCompatParcelizer iconCompatParcelizer = this.n;
            if (cC26BFormKartuKreditFragment_ViewBinding3.d == null) {
                cC26BFormKartuKreditFragment_ViewBinding3.d = new ArrayList<>();
            }
            cC26BFormKartuKreditFragment_ViewBinding3.d.add(iconCompatParcelizer);
        }
        if (this.m <= 0) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver7 = (CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) it2.next();
                cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver7.e.d();
                this.e.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver7.e);
            }
        } else {
            onClickUbahDataPekerjaan b = onClickUbahDataPekerjaan.b(0.0f, 1.0f);
            this.f = b;
            b.d(this.m);
            onClickUbahDataPekerjaan onclickubahdatapekerjaan = this.f;
            AnonymousClass3 r0 = new CC26AFormKartuKreditFragment_ViewBinding() { // from class: o.CC26BFormKartuKreditFragment.3
                boolean a = false;

                @Override // o.CC26AFormKartuKreditFragment_ViewBinding, o.CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer
                public final void b(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding4) {
                    if (!this.a) {
                        int size8 = arrayList5.size();
                        for (int i9 = 0; i9 < size8; i9++) {
                            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver8 = (CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) arrayList5.get(i9);
                            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver8.e.d();
                            CC26BFormKartuKreditFragment.this.e.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver8.e);
                        }
                    }
                }
            };
            if (onclickubahdatapekerjaan.d == null) {
                onclickubahdatapekerjaan.d = new ArrayList<>();
            }
            onclickubahdatapekerjaan.d.add(r0);
            this.f.d();
        }
        if (this.d != null) {
            ArrayList arrayList6 = (ArrayList) this.d.clone();
            int size8 = arrayList6.size();
            for (int i9 = 0; i9 < size8; i9++) {
                ((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) arrayList6.get(i9)).c(this);
            }
        }
        if (this.a.size() == 0 && this.m == 0) {
            this.g = false;
            if (this.d != null) {
                ArrayList arrayList7 = (ArrayList) this.d.clone();
                int size9 = arrayList7.size();
                for (int i10 = 0; i10 < size9; i10++) {
                    ((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) arrayList7.get(i10)).b(this);
                }
            }
        }
    }

    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    public final void d(Interpolator interpolator) {
        Iterator<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e.d(interpolator);
        }
    }

    public final void e(CC26BFormKartuKreditFragment_ViewBinding... cC26BFormKartuKreditFragment_ViewBindingArr) {
        write write2;
        this.j = true;
        int i = 0;
        if (cC26BFormKartuKreditFragment_ViewBindingArr.length == 1) {
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding = cC26BFormKartuKreditFragment_ViewBindingArr[0];
            if (cC26BFormKartuKreditFragment_ViewBinding != null) {
                this.j = true;
                new write(cC26BFormKartuKreditFragment_ViewBinding);
                return;
            }
            return;
        }
        while (i < cC26BFormKartuKreditFragment_ViewBindingArr.length - 1) {
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding2 = cC26BFormKartuKreditFragment_ViewBindingArr[i];
            if (cC26BFormKartuKreditFragment_ViewBinding2 != null) {
                this.j = true;
                write2 = new write(cC26BFormKartuKreditFragment_ViewBinding2);
            } else {
                write2 = null;
            }
            i++;
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding3 = cC26BFormKartuKreditFragment_ViewBindingArr[i];
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = CC26BFormKartuKreditFragment.this.b.get(cC26BFormKartuKreditFragment_ViewBinding3);
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2 = cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
            if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
                cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2 = new CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver(cC26BFormKartuKreditFragment_ViewBinding3);
                CC26BFormKartuKreditFragment.this.b.put(cC26BFormKartuKreditFragment_ViewBinding3, cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                CC26BFormKartuKreditFragment.this.a.add(cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2);
            }
            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver2.c(new RemoteActionCompatParcelizer(write2.a, 1));
        }
    }
}
