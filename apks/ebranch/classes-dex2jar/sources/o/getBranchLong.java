package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import o.performStop;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/getBranchLong.class */
public final class getBranchLong extends Fragment {
    private setTxnCategoryPurposeValue d;
    private final onChooseValueSumberPenghasilan e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getBranchLong$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performStop.read> {
        public static final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performStop.read invoke() {
            return new DataTxnTeller$$Parcelable(0, 1);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getBranchLong$read.class */
    public static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performPrimaryNavigationFragmentChanged> {
        final /* synthetic */ Fragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Fragment fragment) {
            super(0);
            this.c = fragment;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
            getView requireActivity = this.c.requireActivity();
            subscribeReservationRescheduleEvent.d(requireActivity, "");
            performPrimaryNavigationFragmentChanged viewModelStore = requireActivity.getViewModelStore();
            subscribeReservationRescheduleEvent.d(viewModelStore, "");
            return viewModelStore;
        }
    }

    public getBranchLong() {
        getBranchLong getbranchlong = this;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.c;
        this.e = onAttachFragment.c(getbranchlong, subscriberLoadDraftBankTransferEvent.a(getIsRepresentativeTransaction.class), new read(getbranchlong), remoteActionCompatParcelizer == null ? new pilihNoRek<performStop.read>() { // from class: o.getBranchLong$MediaBrowserCompat$CustomActionResultReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ performStop.read invoke() {
                getView requireActivity = Fragment.this.requireActivity();
                subscribeReservationRescheduleEvent.d(requireActivity, "");
                return requireActivity.b();
            }
        } : remoteActionCompatParcelizer);
    }

    public static /* synthetic */ void c(Menu menu, Boolean bool) {
        subscribeReservationRescheduleEvent.e(menu, "");
        MenuItem findItem = menu.findItem(setCurrencyName.IconCompatParcelizer.r);
        subscribeReservationRescheduleEvent.d(bool, "");
        findItem.setVisible(bool.booleanValue());
    }

    public static /* synthetic */ void d(getBranchLong getbranchlong, showSumberPenghasilanDialog showsumberpenghasilandialog) {
        subscribeReservationRescheduleEvent.e(getbranchlong, "");
        HttpTransaction httpTransaction = (HttpTransaction) showsumberpenghasilandialog.c;
        boolean booleanValue = ((Boolean) showsumberpenghasilandialog.a).booleanValue();
        setTxnCategoryPurposeValue settxncategorypurposevalue = getbranchlong.d;
        String str = null;
        setTxnCategoryPurposeValue settxncategorypurposevalue2 = settxncategorypurposevalue;
        if (settxncategorypurposevalue == null) {
            subscribeReservationRescheduleEvent.e("");
            settxncategorypurposevalue2 = null;
        }
        settxncategorypurposevalue2.A.setText(httpTransaction != null ? httpTransaction.getFormattedUrl$com_github_ChuckerTeam_Chucker_library(booleanValue) : null);
        settxncategorypurposevalue2.h.setText(httpTransaction != null ? httpTransaction.getMethod() : null);
        settxncategorypurposevalue2.n.setText(httpTransaction != null ? httpTransaction.getProtocol() : null);
        settxncategorypurposevalue2.u.setText(String.valueOf(httpTransaction != null ? httpTransaction.getStatus$com_github_ChuckerTeam_Chucker_library() : null));
        settxncategorypurposevalue2.r.setText(httpTransaction != null ? httpTransaction.getResponseSummaryText$com_github_ChuckerTeam_Chucker_library() : null);
        Boolean valueOf = httpTransaction != null ? Boolean.valueOf(httpTransaction.isSsl$com_github_ChuckerTeam_Chucker_library()) : null;
        if (valueOf == null) {
            settxncategorypurposevalue2.v.setVisibility(8);
        } else if (subscribeReservationRescheduleEvent.b(valueOf, Boolean.TRUE)) {
            settxncategorypurposevalue2.v.setVisibility(0);
            settxncategorypurposevalue2.x.setText(setCurrencyName$MediaBrowserCompat$ItemReceiver.V);
        } else {
            settxncategorypurposevalue2.v.setVisibility(0);
            settxncategorypurposevalue2.x.setText(setCurrencyName$MediaBrowserCompat$ItemReceiver.p);
        }
        if ((httpTransaction != null ? httpTransaction.getResponseTlsVersion() : null) != null) {
            settxncategorypurposevalue2.z.setText(httpTransaction.getResponseTlsVersion());
            settxncategorypurposevalue2.B.setVisibility(0);
        }
        if ((httpTransaction != null ? httpTransaction.getResponseCipherSuite() : null) != null) {
            settxncategorypurposevalue2.g.setText(httpTransaction.getResponseCipherSuite());
            settxncategorypurposevalue2.j.setVisibility(0);
        }
        settxncategorypurposevalue2.l.setText(httpTransaction != null ? httpTransaction.getRequestDateString$com_github_ChuckerTeam_Chucker_library() : null);
        settxncategorypurposevalue2.s.setText(httpTransaction != null ? httpTransaction.getResponseDateString$com_github_ChuckerTeam_Chucker_library() : null);
        settxncategorypurposevalue2.i.setText(httpTransaction != null ? httpTransaction.getDurationString$com_github_ChuckerTeam_Chucker_library() : null);
        settxncategorypurposevalue2.m.setText(httpTransaction != null ? httpTransaction.getRequestSizeString$com_github_ChuckerTeam_Chucker_library() : null);
        settxncategorypurposevalue2.p.setText(httpTransaction != null ? httpTransaction.getResponseSizeString$com_github_ChuckerTeam_Chucker_library() : null);
        TextView textView = settxncategorypurposevalue2.C;
        if (httpTransaction != null) {
            str = httpTransaction.getTotalSizeString$com_github_ChuckerTeam_Chucker_library();
        }
        textView.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        subscribeReservationRescheduleEvent.e(menu, "");
        subscribeReservationRescheduleEvent.e(menuInflater, "");
        menu.findItem(setCurrencyName.IconCompatParcelizer.M).setVisible(false);
        ((getIsRepresentativeTransaction) this.e.d()).b.a(getViewLifecycleOwner(), new performLowMemory(menu) { // from class: o.getBranchLat
            public final /* synthetic */ Menu b;

            {
                this.b = r4;
            }

            @Override // o.performLowMemory
            public final void e(Object obj) {
                getBranchLong.c(this.b, (Boolean) obj);
            }
        });
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(setCurrencyName.read.j, viewGroup, false);
        int i = setCurrencyName.IconCompatParcelizer.e;
        setTag settag = (setTag) setRotation.a(inflate, i);
        if (settag != null) {
            i = setCurrencyName.IconCompatParcelizer.c;
            setTag settag2 = (setTag) setRotation.a(inflate, i);
            if (settag2 != null) {
                i = setCurrencyName.IconCompatParcelizer.d;
                setTag settag3 = (setTag) setRotation.a(inflate, i);
                if (settag3 != null) {
                    i = setCurrencyName.IconCompatParcelizer.b;
                    setTag settag4 = (setTag) setRotation.a(inflate, i);
                    if (settag4 != null) {
                        i = setCurrencyName.IconCompatParcelizer.j;
                        TextView textView = (TextView) setRotation.a(inflate, i);
                        if (textView != null) {
                            i = setCurrencyName.IconCompatParcelizer.i;
                            setState setstate = (setState) setRotation.a(inflate, i);
                            if (setstate != null) {
                                i = setCurrencyName.IconCompatParcelizer.h;
                                TextView textView2 = (TextView) setRotation.a(inflate, i);
                                if (textView2 != null) {
                                    i = setCurrencyName.IconCompatParcelizer.m;
                                    TextView textView3 = (TextView) setRotation.a(inflate, i);
                                    if (textView3 != null) {
                                        i = setCurrencyName.IconCompatParcelizer.x;
                                        TextView textView4 = (TextView) setRotation.a(inflate, i);
                                        if (textView4 != null) {
                                            i = setCurrencyName.IconCompatParcelizer.v;
                                            setOptimizationLevel setoptimizationlevel = (setOptimizationLevel) setRotation.a(inflate, i);
                                            if (setoptimizationlevel != null) {
                                                i = setCurrencyName.IconCompatParcelizer.z;
                                                TextView textView5 = (TextView) setRotation.a(inflate, i);
                                                if (textView5 != null) {
                                                    i = setCurrencyName.IconCompatParcelizer.A;
                                                    TextView textView6 = (TextView) setRotation.a(inflate, i);
                                                    if (textView6 != null) {
                                                        i = setCurrencyName.IconCompatParcelizer.D;
                                                        TextView textView7 = (TextView) setRotation.a(inflate, i);
                                                        if (textView7 != null) {
                                                            i = setCurrencyName.IconCompatParcelizer.H;
                                                            TextView textView8 = (TextView) setRotation.a(inflate, i);
                                                            if (textView8 != null) {
                                                                i = setCurrencyName.IconCompatParcelizer.E;
                                                                TextView textView9 = (TextView) setRotation.a(inflate, i);
                                                                if (textView9 != null) {
                                                                    i = setCurrencyName.IconCompatParcelizer.F;
                                                                    TextView textView10 = (TextView) setRotation.a(inflate, i);
                                                                    if (textView10 != null) {
                                                                        i = setCurrencyName.IconCompatParcelizer.I;
                                                                        TextView textView11 = (TextView) setRotation.a(inflate, i);
                                                                        if (textView11 != null) {
                                                                            i = setCurrencyName.IconCompatParcelizer.G;
                                                                            TextView textView12 = (TextView) setRotation.a(inflate, i);
                                                                            if (textView12 != null) {
                                                                                i = setCurrencyName.IconCompatParcelizer.J;
                                                                                TextView textView13 = (TextView) setRotation.a(inflate, i);
                                                                                if (textView13 != null) {
                                                                                    i = setCurrencyName.IconCompatParcelizer.N;
                                                                                    TextView textView14 = (TextView) setRotation.a(inflate, i);
                                                                                    if (textView14 != null) {
                                                                                        i = setCurrencyName.IconCompatParcelizer.R;
                                                                                        TextView textView15 = (TextView) setRotation.a(inflate, i);
                                                                                        if (textView15 != null) {
                                                                                            i = setCurrencyName.IconCompatParcelizer.S;
                                                                                            setState setstate2 = (setState) setRotation.a(inflate, i);
                                                                                            if (setstate2 != null) {
                                                                                                i = setCurrencyName.IconCompatParcelizer.T;
                                                                                                TextView textView16 = (TextView) setRotation.a(inflate, i);
                                                                                                if (textView16 != null) {
                                                                                                    i = setCurrencyName.IconCompatParcelizer.V;
                                                                                                    TextView textView17 = (TextView) setRotation.a(inflate, i);
                                                                                                    if (textView17 != null) {
                                                                                                        i = setCurrencyName.IconCompatParcelizer.Z;
                                                                                                        setState setstate3 = (setState) setRotation.a(inflate, i);
                                                                                                        if (setstate3 != null) {
                                                                                                            i = setCurrencyName.IconCompatParcelizer.ab;
                                                                                                            TextView textView18 = (TextView) setRotation.a(inflate, i);
                                                                                                            if (textView18 != null) {
                                                                                                                i = setCurrencyName.IconCompatParcelizer.aa;
                                                                                                                TextView textView19 = (TextView) setRotation.a(inflate, i);
                                                                                                                if (textView19 != null) {
                                                                                                                    i = setCurrencyName.IconCompatParcelizer.ah;
                                                                                                                    TextView textView20 = (TextView) setRotation.a(inflate, i);
                                                                                                                    if (textView20 != null) {
                                                                                                                        i = setCurrencyName.IconCompatParcelizer.aj;
                                                                                                                        TextView textView21 = (TextView) setRotation.a(inflate, i);
                                                                                                                        if (textView21 != null) {
                                                                                                                            setTxnCategoryPurposeValue settxncategorypurposevalue = new setTxnCategoryPurposeValue((ScrollView) inflate, settag, settag2, settag3, settag4, textView, setstate, textView2, textView3, textView4, setoptimizationlevel, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, setstate2, textView16, textView17, setstate3, textView18, textView19, textView20, textView21);
                                                                                                                            subscribeReservationRescheduleEvent.d(settxncategorypurposevalue, "");
                                                                                                                            this.d = settxncategorypurposevalue;
                                                                                                                            return settxncategorypurposevalue.w;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
        getNotes.b(((getIsRepresentativeTransaction) this.e.d()).g, ((getIsRepresentativeTransaction) this.e.d()).e).a(getViewLifecycleOwner(), new performLowMemory() { // from class: o.setBranchLat
            @Override // o.performLowMemory
            public final void e(Object obj) {
                getBranchLong.d(getBranchLong.this, (showSumberPenghasilanDialog) obj);
            }
        });
    }
}
