package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import o.LoginPresenter;
import o.Page6KLFragment;
import o.ProsesTarikanFragment;
import o.ReviewSetoranFragment_ViewBinding;
import o.getFormattedPath$com_github_ChuckerTeam_Chucker_library;
import o.getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library;
import o.onCLickStatusNpwp;
import o.onClickInfo;
import o.pilihNoRek;
import o.showSiupNibPage;
import o.subscribeReservationRescheduleEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/internal/coroutines/InternalFlowFactory$from$1.class */
public final class InternalFlowFactory$from$1 extends showSiupNibPage implements onClickInfo<getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library<? super Realm>, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
    final /* synthetic */ Realm $realm;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library p$;
    final /* synthetic */ InternalFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalFlowFactory$from$1(InternalFlowFactory internalFlowFactory, Realm realm, ProsesTarikanFragment prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.this$0 = internalFlowFactory;
        this.$realm = realm;
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.b(prosesTarikanFragment, "");
        InternalFlowFactory$from$1 internalFlowFactory$from$1 = new InternalFlowFactory$from$1(this.this$0, this.$realm, prosesTarikanFragment);
        internalFlowFactory$from$1.p$ = (getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library) obj;
        return internalFlowFactory$from$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InternalFlowFactory$from$1) create(obj, (ProsesTarikanFragment) obj2)).invokeSuspend(onCLickStatusNpwp.e);
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    public final Object invokeSuspend(Object obj) {
        ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
            getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library getformattedresponsebody_com_github_chuckerteam_chucker_library = this.p$;
            final Realm instance = Realm.getInstance(this.$realm.getConfiguration());
            final RealmChangeListener internalFlowFactory$from$1$listener$1 = new RealmChangeListener<Realm>(getformattedresponsebody_com_github_chuckerteam_chucker_library) { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$1$listener$1
                final /* synthetic */ getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library $this_callbackFlow;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$this_callbackFlow = r5;
                }

                public final void onChange(Realm realm) {
                    subscribeReservationRescheduleEvent.b(realm, "");
                    if (LoginPresenter.c(this.$this_callbackFlow) && InternalFlowFactory.access$getReturnFrozenObjects$p(InternalFlowFactory$from$1.this.this$0)) {
                        InternalFlowFactory$from$1.this.$realm.freeze();
                    }
                }
            };
            instance.addChangeListener(internalFlowFactory$from$1$listener$1);
            if (InternalFlowFactory.access$getReturnFrozenObjects$p(this.this$0)) {
                instance.freeze();
            }
            this.L$0 = getformattedresponsebody_com_github_chuckerteam_chucker_library;
            this.L$1 = instance;
            this.L$2 = internalFlowFactory$from$1$listener$1;
            this.label = 1;
            if (getFormattedPath$com_github_ChuckerTeam_Chucker_library.e(getformattedresponsebody_com_github_chuckerteam_chucker_library, new pilihNoRek<onCLickStatusNpwp>() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$1.1
                public final void invoke() {
                    instance.removeChangeListener(internalFlowFactory$from$1$listener$1);
                    instance.close();
                }
            }, this) == reviewSetoranFragment_ViewBinding) {
                return reviewSetoranFragment_ViewBinding;
            }
        } else {
            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
        }
        return onCLickStatusNpwp.e;
    }
}
