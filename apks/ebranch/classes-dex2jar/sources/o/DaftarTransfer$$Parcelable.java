package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.DaftarTransferLoadDataORPresenter;
import o.Page6KLFragment;
import o.PlaybackStateCompat;
import o.TxnTellerResponse;
import o.checkSimpanNama;
import o.performStop;
import o.setCheckable;
import o.setCurrencyName;
import o.setSenderEmail;
/* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable.class */
public final class DaftarTransfer$$Parcelable extends Fragment implements SearchView.RemoteActionCompatParcelizer {
    public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer((byte) 0);
    private int a;
    private int c;
    private setTxnCategoryPurpose d;
    private final setNewRefNum e;
    private final onChooseValueSumberPenghasilan f;
    private final ActivityResultRegistry$1<String> h;
    private final onChooseValueSumberPenghasilan j;

    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super List<setSenderEmail>>, Object> {
        final /* synthetic */ HttpTransaction a;
        Object b;
        final /* synthetic */ TxnTellerResponse.ValueTxnDataDetail c;
        final /* synthetic */ boolean d;
        Object e;
        final /* synthetic */ DaftarTransfer$$Parcelable g;
        int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail, HttpTransaction httpTransaction, boolean z, DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, ProsesTarikanFragment<? super IconCompatParcelizer> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.c = valueTxnDataDetail;
            this.a = httpTransaction;
            this.d = z;
            this.g = daftarTransfer$$Parcelable;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new IconCompatParcelizer(this.c, this.a, this.d, this.g, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super List<setSenderEmail>> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            Object obj2;
            ArrayList arrayList;
            Bitmap bitmap;
            boolean z;
            String str;
            String str2;
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    bitmap = (Bitmap) this.e;
                    arrayList = (List) this.b;
                    if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                        obj2 = obj;
                    } else {
                        throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                arrayList = new ArrayList();
                if (this.c == TxnTellerResponse.ValueTxnDataDetail.REQUEST) {
                    String requestHeaders = this.a.getRequestHeaders();
                    String str3 = requestHeaders;
                    if (CheckOTPSessionPresenter.d(requestHeaders, "[]", true)) {
                        str3 = " - ";
                    }
                    StringBuilder sb = new StringBuilder("<p>Header: <br/>");
                    sb.append(str3);
                    sb.append("</p><br/>Body:");
                    String obj3 = sb.toString();
                    boolean isRequestBodyPlainText = this.a.isRequestBodyPlainText();
                    if (this.d) {
                        str2 = this.a.getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library();
                        z = isRequestBodyPlainText;
                        str = obj3;
                    } else {
                        String requestBody = this.a.getRequestBody();
                        z = isRequestBodyPlainText;
                        str2 = requestBody;
                        str = obj3;
                        if (requestBody == null) {
                            str2 = "";
                            z = isRequestBodyPlainText;
                            str = obj3;
                        }
                    }
                } else {
                    str = this.a.getResponseHeadersString$com_github_ChuckerTeam_Chucker_library(true);
                    z = this.a.isResponseBodyPlainText();
                    str2 = this.a.getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library();
                }
                if (!CheckOTPSessionPresenter.a(str)) {
                    Spanned c = getDialog.c(str, 0);
                    subscribeReservationRescheduleEvent.d(c, "");
                    arrayList.add(new setSenderEmail.RemoteActionCompatParcelizer(c));
                }
                Bitmap responseImageBitmap$com_github_ChuckerTeam_Chucker_library = this.a.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library();
                if (this.c != TxnTellerResponse.ValueTxnDataDetail.RESPONSE || responseImageBitmap$com_github_ChuckerTeam_Chucker_library == null) {
                    if (!z) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.g.requireContext().getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.c));
                        subscribeReservationRescheduleEvent.d(valueOf, "");
                        arrayList.add(new setSenderEmail.write(valueOf));
                        list = arrayList;
                    } else {
                        String str4 = str2;
                        list = arrayList;
                        if (!CheckOTPSessionPresenter.a(str4)) {
                            subscribeReservationRescheduleEvent.e(str4, "");
                            subscribeReservationRescheduleEvent.e(str4, "");
                            String[] strArr = {"\r\n", "\n", "\r"};
                            subscribeReservationRescheduleEvent.e(str4, "");
                            subscribeReservationRescheduleEvent.e(strArr, "");
                            CancelTundaPresenter<setRegionPrefix> e = DaftarTransferLoadDataORPresenter.e((CharSequence) str4, strArr, 0, false, 0);
                            T1TransaksiTarikanUbahFragment_ViewBinding write = new DaftarTransferLoadDataORPresenter.write(str4);
                            subscribeReservationRescheduleEvent.e(e, "");
                            subscribeReservationRescheduleEvent.e(write, "");
                            CancelTundaPresenter checkDaftarTransferORPresenter = new CheckDaftarTransferORPresenter(e, write);
                            subscribeReservationRescheduleEvent.e(checkDaftarTransferORPresenter, "");
                            subscribeReservationRescheduleEvent.e(checkDaftarTransferORPresenter, "");
                            Iterator it = onClickUbahDataAlamatIdentitas.b((List) CancelReservationPresenter.b(checkDaftarTransferORPresenter, new ArrayList())).iterator();
                            while (true) {
                                list = arrayList;
                                if (!it.hasNext()) {
                                    break;
                                }
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf((String) it.next());
                                subscribeReservationRescheduleEvent.d(valueOf2, "");
                                arrayList.add(new setSenderEmail.write(valueOf2));
                            }
                        }
                    }
                    return list;
                }
                this.b = arrayList;
                this.e = responseImageBitmap$com_github_ChuckerTeam_Chucker_library;
                this.i = 1;
                Object e2 = MasterFundSourcePurposeResponse$Category$$Parcelable.e(responseImageBitmap$com_github_ChuckerTeam_Chucker_library, (ProsesTarikanFragment) this);
                if (e2 == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
                obj2 = e2;
                bitmap = responseImageBitmap$com_github_ChuckerTeam_Chucker_library;
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            arrayList.add(new setSenderEmail$MediaBrowserCompat$CustomActionResultReceiver(bitmap, (Double) obj2));
            list = arrayList;
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performStop.read> {
        public static final MediaDescriptionCompat b = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performStop.read invoke() {
            return new DataTxnTeller$$Parcelable(0, 1);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performStop.read> {
        final /* synthetic */ Fragment d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(Fragment fragment) {
            super(0);
            this.d = fragment;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performStop.read invoke() {
            getView requireActivity = this.d.requireActivity();
            subscribeReservationRescheduleEvent.d(requireActivity, "");
            return requireActivity.b();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        public static DaftarTransfer$$Parcelable d(TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail) {
            subscribeReservationRescheduleEvent.e(valueTxnDataDetail, "");
            DaftarTransfer$$Parcelable daftarTransfer$$Parcelable = new DaftarTransfer$$Parcelable();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", valueTxnDataDetail);
            daftarTransfer$$Parcelable.setArguments(bundle);
            return daftarTransfer$$Parcelable;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$read.class */
    public static final class read extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int a;
        final /* synthetic */ HttpTransaction b;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(HttpTransaction httpTransaction, boolean z, ProsesTarikanFragment<? super read> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            DaftarTransfer$$Parcelable.this = r5;
            this.b = httpTransaction;
            this.e = z;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new read(this.b, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.a;
            setTxnCategoryPurpose settxncategorypurpose = null;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                setTxnCategoryPurpose settxncategorypurpose2 = DaftarTransfer$$Parcelable.this.d;
                setTxnCategoryPurpose settxncategorypurpose3 = settxncategorypurpose2;
                if (settxncategorypurpose2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    settxncategorypurpose3 = null;
                }
                settxncategorypurpose3.b.setVisibility(0);
                DaftarTransfer$$Parcelable daftarTransfer$$Parcelable = DaftarTransfer$$Parcelable.this;
                this.a = 1;
                Object c = DaftarTransfer$$Parcelable.c(daftarTransfer$$Parcelable, DaftarTransfer$$Parcelable.c(daftarTransfer$$Parcelable), this.b, this.e, (ProsesTarikanFragment) this);
                obj = c;
                if (c == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                DaftarTransfer$$Parcelable.e(DaftarTransfer$$Parcelable.this);
            } else {
                setNewRefNum setnewrefnum = DaftarTransfer$$Parcelable.this.e;
                subscribeReservationRescheduleEvent.e(list, "");
                setnewrefnum.e.clear();
                setnewrefnum.e.addAll(list);
                setnewrefnum.a.b();
                DaftarTransfer$$Parcelable.b(DaftarTransfer$$Parcelable.this);
            }
            DaftarTransfer$$Parcelable.this.requireActivity().invalidateOptionsMenu();
            settxncategorypurpose = DaftarTransfer$$Parcelable.this.d;
            if (settxncategorypurpose == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            settxncategorypurpose.b.setVisibility(8);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$write.class */
    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TxnTellerResponse.ValueTxnDataDetail.values().length];
            iArr[TxnTellerResponse.ValueTxnDataDetail.REQUEST.ordinal()] = 1;
            iArr[TxnTellerResponse.ValueTxnDataDetail.RESPONSE.ordinal()] = 2;
            a = iArr;
        }
    }

    public DaftarTransfer$$Parcelable() {
        DaftarTransfer$$Parcelable daftarTransfer$$Parcelable = this;
        MediaDescriptionCompat mediaDescriptionCompat = MediaDescriptionCompat.b;
        this.j = onAttachFragment.c(daftarTransfer$$Parcelable, subscriberLoadDraftBankTransferEvent.a(getIsRepresentativeTransaction.class), new pilihNoRek<performPrimaryNavigationFragmentChanged>() { // from class: o.DaftarTransfer$$Parcelable$MediaBrowserCompat$ItemReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
                getView requireActivity = Fragment.this.requireActivity();
                subscribeReservationRescheduleEvent.d(requireActivity, "");
                performPrimaryNavigationFragmentChanged viewModelStore = requireActivity.getViewModelStore();
                subscribeReservationRescheduleEvent.d(viewModelStore, "");
                return viewModelStore;
            }
        }, mediaDescriptionCompat == null ? new MediaMetadataCompat(daftarTransfer$$Parcelable) : mediaDescriptionCompat);
        this.f = showBidangPekerjaanDialog.a(showDescPekerjaanDialog.e, new pilihNoRek<TxnTellerResponse.ValueTxnDataDetail>() { // from class: o.DaftarTransfer$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ TxnTellerResponse.ValueTxnDataDetail invoke() {
                Bundle arguments = DaftarTransfer$$Parcelable.this.getArguments();
                Serializable serializable = arguments != null ? arguments.getSerializable("type") : null;
                if (serializable != null) {
                    return (TxnTellerResponse.ValueTxnDataDetail) serializable;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.chuckerteam.chucker.internal.ui.transaction.PayloadType");
            }
        });
        ActivityResultRegistry$1<String> registerForActivityResult = registerForActivityResult(new setCheckable.read(), new PlaybackStateCompat.CustomAction() { // from class: o.DataTxnTeller
            @Override // o.PlaybackStateCompat.CustomAction
            public final void a(Object obj) {
                DaftarTransfer$$Parcelable.b(DaftarTransfer$$Parcelable.this, (Uri) obj);
            }
        });
        subscribeReservationRescheduleEvent.d(registerForActivityResult, "");
        this.h = registerForActivityResult;
        this.e = new setNewRefNum();
        this.c = -256;
        this.a = -65536;
    }

    public static /* synthetic */ void b(Menu menu, Boolean bool) {
        subscribeReservationRescheduleEvent.e(menu, "");
        MenuItem findItem = menu.findItem(setCurrencyName.IconCompatParcelizer.r);
        subscribeReservationRescheduleEvent.d(bool, "");
        findItem.setVisible(bool.booleanValue());
    }

    public static final /* synthetic */ void b(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable) {
        setTxnCategoryPurpose settxncategorypurpose = daftarTransfer$$Parcelable.d;
        setTxnCategoryPurpose settxncategorypurpose2 = settxncategorypurpose;
        if (settxncategorypurpose == null) {
            subscribeReservationRescheduleEvent.e("");
            settxncategorypurpose2 = null;
        }
        settxncategorypurpose2.a.setVisibility(8);
        settxncategorypurpose2.e.setVisibility(0);
    }

    public static /* synthetic */ void b(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, Uri uri) {
        subscribeReservationRescheduleEvent.e(daftarTransfer$$Parcelable, "");
        Object obj = ((getIsRepresentativeTransaction) daftarTransfer$$Parcelable.j.d()).g.c;
        if (obj == LiveData.e) {
            obj = null;
        }
        HttpTransaction httpTransaction = (HttpTransaction) obj;
        if (uri == null || httpTransaction == null) {
            Toast.makeText(daftarTransfer$$Parcelable.requireContext(), setCurrencyName$MediaBrowserCompat$ItemReceiver.E, 0).show();
        } else {
            GetAreaPresenter.a(performConfigurationChanged.b(daftarTransfer$$Parcelable), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver(daftarTransfer$$Parcelable, uri, httpTransaction, null), 3);
        }
    }

    public static final /* synthetic */ Object c(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail, HttpTransaction httpTransaction, boolean z, ProsesTarikanFragment prosesTarikanFragment) {
        return GetAreaPresenter.a(ReservasiListChosenPresenter.d(), new IconCompatParcelizer(valueTxnDataDetail, httpTransaction, z, daftarTransfer$$Parcelable, null), prosesTarikanFragment);
    }

    public static final /* synthetic */ TxnTellerResponse.ValueTxnDataDetail c(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable) {
        return (TxnTellerResponse.ValueTxnDataDetail) daftarTransfer$$Parcelable.f.d();
    }

    public static /* synthetic */ void c(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, showSumberPenghasilanDialog showsumberpenghasilandialog) {
        subscribeReservationRescheduleEvent.e(daftarTransfer$$Parcelable, "");
        HttpTransaction httpTransaction = (HttpTransaction) showsumberpenghasilandialog.c;
        boolean booleanValue = ((Boolean) showsumberpenghasilandialog.a).booleanValue();
        if (httpTransaction != null) {
            GetAreaPresenter.a(performConfigurationChanged.b(daftarTransfer$$Parcelable), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new read(httpTransaction, booleanValue, null), 3);
        }
    }

    public static /* synthetic */ boolean d(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, MenuItem menuItem) {
        subscribeReservationRescheduleEvent.e(daftarTransfer$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(menuItem, "");
        ActivityResultRegistry$1<String> activityResultRegistry$1 = daftarTransfer$$Parcelable.h;
        StringBuilder sb = new StringBuilder("chucker-export-");
        sb.append(System.currentTimeMillis());
        activityResultRegistry$1.e(sb.toString(), null);
        return true;
    }

    public static final /* synthetic */ void e(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable) {
        setTxnCategoryPurpose settxncategorypurpose = daftarTransfer$$Parcelable.d;
        setTxnCategoryPurpose settxncategorypurpose2 = settxncategorypurpose;
        if (settxncategorypurpose == null) {
            subscribeReservationRescheduleEvent.e("");
            settxncategorypurpose2 = null;
        }
        settxncategorypurpose2.d.setText(((TxnTellerResponse.ValueTxnDataDetail) daftarTransfer$$Parcelable.f.d()) == TxnTellerResponse.ValueTxnDataDetail.RESPONSE ? daftarTransfer$$Parcelable.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.D) : daftarTransfer$$Parcelable.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.x));
        settxncategorypurpose2.a.setVisibility(0);
        settxncategorypurpose2.e.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (((r6 == null || (r0 = r6.getRequestPayloadSize()) == null || 0 != r0.longValue()) ? false : true) == false) goto L_0x0076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (((r6 == null || (r0 = r6.getResponsePayloadSize()) == null || 0 != r0.longValue()) ? false : true) == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final boolean e(com.chuckerteam.chucker.internal.data.entity.HttpTransaction r6) {
        /*
            r5 = this;
            r0 = r5
            o.onChooseValueSumberPenghasilan r0 = r0.f
            java.lang.Object r0 = r0.d()
            o.TxnTellerResponse$ValueTxnDataDetail r0 = (o.TxnTellerResponse.ValueTxnDataDetail) r0
            r7 = r0
            o.TxnTellerResponse$ValueTxnDataDetail r0 = o.TxnTellerResponse.ValueTxnDataDetail.REQUEST
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L_0x0040
            r0 = r6
            if (r0 == 0) goto L_0x0035
            r0 = r6
            java.lang.Long r0 = r0.getRequestPayloadSize()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0035
            r0 = 0
            r1 = r6
            long r1 = r1.longValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            r0 = 1
            r10 = r0
            goto L_0x0038
        L_0x0035:
            r0 = 0
            r10 = r0
        L_0x0038:
            r0 = r10
            if (r0 != 0) goto L_0x0079
            goto L_0x0076
        L_0x0040:
            r0 = r5
            o.onChooseValueSumberPenghasilan r0 = r0.f
            java.lang.Object r0 = r0.d()
            o.TxnTellerResponse$ValueTxnDataDetail r0 = (o.TxnTellerResponse.ValueTxnDataDetail) r0
            o.TxnTellerResponse$ValueTxnDataDetail r1 = o.TxnTellerResponse.ValueTxnDataDetail.RESPONSE
            if (r0 != r1) goto L_0x0076
            r0 = r6
            if (r0 == 0) goto L_0x006e
            r0 = r6
            java.lang.Long r0 = r0.getResponsePayloadSize()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r1 = r6
            long r1 = r1.longValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            r0 = 1
            r10 = r0
            goto L_0x0071
        L_0x006e:
            r0 = 0
            r10 = r0
        L_0x0071:
            r0 = r10
            if (r0 != 0) goto L_0x0079
        L_0x0076:
            r0 = 1
            r9 = r0
        L_0x0079:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransfer$$Parcelable.e(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):boolean");
    }

    @Override // androidx.appcompat.widget.SearchView.RemoteActionCompatParcelizer
    public final boolean a(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        String str2 = str;
        if (!(!CheckOTPSessionPresenter.a(str2)) || str.length() <= 1) {
            this.e.b();
            return true;
        }
        setNewRefNum setnewrefnum = this.e;
        int i = this.c;
        int i2 = this.a;
        subscribeReservationRescheduleEvent.e(str, "");
        ArrayList<setSenderEmail> arrayList = setnewrefnum.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof setSenderEmail.write) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        subscribeReservationRescheduleEvent.e(arrayList3, "");
        for (onClickedSetiapHari onclickedsetiaphari : new clickLanjut(new checkSimpanNama.MediaBrowserCompat.CustomActionResultReceiver(arrayList3))) {
            int i3 = onclickedsetiaphari.e;
            setSenderEmail.write write2 = (setSenderEmail.write) onclickedsetiaphari.c;
            if (CheckOTPSessionPresenter.d((CharSequence) write2.d, (CharSequence) str2, true)) {
                write2.d.clearSpans();
                String obj2 = write2.d.toString();
                subscribeReservationRescheduleEvent.d(obj2, "");
                SpannableStringBuilder d = setDescriptions.d(obj2, str, i, i2);
                subscribeReservationRescheduleEvent.e(d, "");
                write2.d = d;
                setnewrefnum.a.d(i3 + 1, 1, null);
            } else {
                boolean z = false;
                Object[] spans = write2.d.getSpans(0, write2.d.length() - 1, Object.class);
                subscribeReservationRescheduleEvent.d(spans, "");
                if (spans.length == 0) {
                    z = true;
                }
                if (!z) {
                    write2.d.clearSpans();
                    setnewrefnum.a.d(i3 + 1, 1, null);
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.RemoteActionCompatParcelizer
    public final boolean b(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        onAttach(context);
        this.c = copyWindowDataInto.a(context, setCurrencyName.write.a);
        this.a = copyWindowDataInto.a(context, setCurrencyName.write.g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (0 != r0.longValue()) goto L_0x00be;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (0 != r0.longValue()) goto L_0x00be;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onCreateOptionsMenu(android.view.Menu r7, android.view.MenuInflater r8) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransfer$$Parcelable.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(setCurrencyName.read.g, viewGroup, false);
        int i = setCurrencyName.IconCompatParcelizer.l;
        ImageView imageView = (ImageView) setRotation.a(inflate, i);
        if (imageView != null) {
            i = setCurrencyName.IconCompatParcelizer.n;
            TextView textView = (TextView) setRotation.a(inflate, i);
            if (textView != null) {
                i = setCurrencyName.IconCompatParcelizer.s;
                setState setstate = (setState) setRotation.a(inflate, i);
                if (setstate != null) {
                    i = setCurrencyName.IconCompatParcelizer.w;
                    HapusTransaksiWarkatDialog a = setRotation.a(inflate, i);
                    if (a != null) {
                        i = setCurrencyName.IconCompatParcelizer.C;
                        setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, i);
                        if (setonstartentertransitionlistener != null) {
                            setTxnCategoryPurpose settxncategorypurpose = new setTxnCategoryPurpose((setMaxHeight) inflate, imageView, textView, setstate, a, setonstartentertransitionlistener);
                            subscribeReservationRescheduleEvent.d(settxncategorypurpose, "");
                            this.d = settxncategorypurpose;
                            return settxncategorypurpose.g;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        setTxnCategoryPurpose settxncategorypurpose = this.d;
        setTxnCategoryPurpose settxncategorypurpose2 = settxncategorypurpose;
        if (settxncategorypurpose == null) {
            subscribeReservationRescheduleEvent.e("");
            settxncategorypurpose2 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = settxncategorypurpose2.e;
        setonstartentertransitionlistener.setHasFixedSize(true);
        setonstartentertransitionlistener.setAdapter(this.e);
        getNotes.b(((getIsRepresentativeTransaction) this.j.d()).g, ((getIsRepresentativeTransaction) this.j.d()).d).a(getViewLifecycleOwner(), new performLowMemory() { // from class: o.setBranchPhone
            @Override // o.performLowMemory
            public final void e(Object obj) {
                DaftarTransfer$$Parcelable.c(DaftarTransfer$$Parcelable.this, (showSumberPenghasilanDialog) obj);
            }
        });
    }
}
