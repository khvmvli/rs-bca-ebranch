package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import o.CC9FormKartuKreditFragment_ViewBinding;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/showKtpPage.class */
public final class showKtpPage {
    private static final AtomicInteger c = new AtomicInteger();
    private Drawable a;
    private int b;
    final CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer d;
    public boolean e;
    private int f;
    private boolean g;
    private final onChooseTanggalJatuhTempo h;
    private int i;
    private Drawable j;
    private Object m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f98o;

    showKtpPage() {
        this.f98o = true;
        this.h = null;
        this.d = new CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer(null, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public showKtpPage(onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo, Uri uri, int i) {
        this.f98o = true;
        if (!onchoosetanggaljatuhtempo.n) {
            this.h = onchoosetanggaljatuhtempo;
            this.d = new CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer(uri, 0, onchoosetanggaljatuhtempo.d);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private CC9FormKartuKreditFragment_ViewBinding b(long j) {
        int andIncrement = c.getAndIncrement();
        CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = this.d;
        boolean z = iconCompatParcelizer.e;
        if (z && iconCompatParcelizer.c) {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        } else if (iconCompatParcelizer.c && iconCompatParcelizer.m == 0 && iconCompatParcelizer.k == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        } else if (z && iconCompatParcelizer.m == 0 && iconCompatParcelizer.k == 0) {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        } else {
            if (iconCompatParcelizer.j == null) {
                iconCompatParcelizer.j = onChooseTanggalJatuhTempo.read.NORMAL;
            }
            CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding = new CC9FormKartuKreditFragment_ViewBinding(iconCompatParcelizer.f19o, iconCompatParcelizer.h, iconCompatParcelizer.l, iconCompatParcelizer.n, iconCompatParcelizer.m, iconCompatParcelizer.k, iconCompatParcelizer.c, iconCompatParcelizer.e, iconCompatParcelizer.b, iconCompatParcelizer.g, iconCompatParcelizer.i, iconCompatParcelizer.f, iconCompatParcelizer.a, iconCompatParcelizer.d, iconCompatParcelizer.j, (byte) 0);
            cC9FormKartuKreditFragment_ViewBinding.a = andIncrement;
            cC9FormKartuKreditFragment_ViewBinding.m = j;
            boolean z2 = this.h.f;
            if (z2) {
                StringBuilder sb = new StringBuilder("[R");
                sb.append(cC9FormKartuKreditFragment_ViewBinding.a);
                sb.append(']');
                OR1DataPengirimFragment.b("Main", "created", sb.toString(), cC9FormKartuKreditFragment_ViewBinding.toString());
            }
            onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo = this.h;
            CC9FormKartuKreditFragment_ViewBinding a = onchoosetanggaljatuhtempo.k.a(cC9FormKartuKreditFragment_ViewBinding);
            if (a != null) {
                if (a != cC9FormKartuKreditFragment_ViewBinding) {
                    a.a = andIncrement;
                    a.m = j;
                    if (z2) {
                        String b = a.b();
                        StringBuilder sb2 = new StringBuilder("into ");
                        sb2.append(a);
                        OR1DataPengirimFragment.b("Main", "changed", b, sb2.toString());
                    }
                }
                return a;
            }
            StringBuilder sb3 = new StringBuilder("Request transformer ");
            sb3.append(onchoosetanggaljatuhtempo.k.getClass().getCanonicalName());
            sb3.append(" returned null for ");
            sb3.append(cC9FormKartuKreditFragment_ViewBinding);
            throw new IllegalStateException(sb3.toString());
        }
    }

    public final void a(ImageView imageView, showDataKartuTambahan1 showdatakartutambahan1) {
        Bitmap c2;
        long nanoTime = System.nanoTime();
        OR1DataPengirimFragment.a();
        if (imageView != null) {
            CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = this.d;
            boolean z = false;
            if (!((iconCompatParcelizer.f19o == null && iconCompatParcelizer.h == 0) ? false : true)) {
                this.h.c(imageView);
                if (this.f98o) {
                    onBackPressedEvent.d(imageView, this.n != 0 ? this.h.a.getResources().getDrawable(this.n) : this.j);
                    return;
                }
                return;
            }
            if (this.e) {
                CC9FormKartuKreditFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer2 = this.d;
                if (iconCompatParcelizer2.m != 0 || iconCompatParcelizer2.k != 0) {
                    z = true;
                }
                if (!z) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f98o) {
                            onBackPressedEvent.d(imageView, this.n != 0 ? this.h.a.getResources().getDrawable(this.n) : this.j);
                        }
                        this.h.f68o.put(imageView, new showDataKartuTambahan2(this, imageView, showdatakartutambahan1));
                        return;
                    }
                    this.d.e(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            CC9FormKartuKreditFragment_ViewBinding b = b(nanoTime);
            String e = OR1DataPengirimFragment.e(b);
            if (!CC27FormKartuKreditFragment_ViewBinding.a(this.f) || (c2 = this.h.c(e)) == null) {
                if (this.f98o) {
                    onBackPressedEvent.d(imageView, this.n != 0 ? this.h.a.getResources().getDrawable(this.n) : this.j);
                }
                this.h.e(new showDataPekerjaan(this.h, imageView, b, this.f, this.i, this.b, this.a, e, this.m, showdatakartutambahan1, this.g));
                return;
            }
            this.h.c(imageView);
            onBackPressedEvent.b(imageView, this.h.a, c2, onChooseTanggalJatuhTempo.write.MEMORY, this.g, this.h.j);
            if (this.h.f) {
                StringBuilder sb = new StringBuilder("[R");
                sb.append(b.a);
                sb.append(']');
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder("from ");
                sb2.append(onChooseTanggalJatuhTempo.write.MEMORY);
                OR1DataPengirimFragment.b("Main", "completed", obj, sb2.toString());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public final showKtpPage e(int i) {
        if (!this.f98o) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.j == null) {
            this.n = 2131231395;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }
}
