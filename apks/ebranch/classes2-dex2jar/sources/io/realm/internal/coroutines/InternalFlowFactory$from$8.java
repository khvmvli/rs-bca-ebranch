package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
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
/* loaded from: classes2-dex2jar.jar:io/realm/internal/coroutines/InternalFlowFactory$from$8.class */
public final class InternalFlowFactory$from$8 extends showSiupNibPage implements onClickInfo<getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library<? super DynamicRealmObject>, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ DynamicRealm $dynamicRealm;
    final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library p$;
    final /* synthetic */ InternalFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalFlowFactory$from$8(InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject, ProsesTarikanFragment prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.this$0 = internalFlowFactory;
        this.$dynamicRealm = dynamicRealm;
        this.$config = realmConfiguration;
        this.$dynamicRealmObject = dynamicRealmObject;
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.b(prosesTarikanFragment, "");
        InternalFlowFactory$from$8 internalFlowFactory$from$8 = new InternalFlowFactory$from$8(this.this$0, this.$dynamicRealm, this.$config, this.$dynamicRealmObject, prosesTarikanFragment);
        internalFlowFactory$from$8.p$ = (getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library) obj;
        return internalFlowFactory$from$8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InternalFlowFactory$from$8) create(obj, (ProsesTarikanFragment) obj2)).invokeSuspend(onCLickStatusNpwp.e);
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    public final Object invokeSuspend(Object obj) {
        ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
                return onCLickStatusNpwp.e;
            } else if (i == 2) {
                if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
                return onCLickStatusNpwp.e;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
            getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library getformattedresponsebody_com_github_chuckerteam_chucker_library = this.p$;
            if (this.$dynamicRealm.isClosed()) {
                this.L$0 = getformattedresponsebody_com_github_chuckerteam_chucker_library;
                this.label = 1;
                if (getFormattedPath$com_github_ChuckerTeam_Chucker_library.e(getformattedresponsebody_com_github_chuckerteam_chucker_library, AnonymousClass1.INSTANCE, this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
                return onCLickStatusNpwp.e;
            }
            final DynamicRealm instance = DynamicRealm.getInstance(this.$config);
            final RealmChangeListener internalFlowFactory$from$8$listener$1 = new RealmChangeListener<DynamicRealmObject>(getformattedresponsebody_com_github_chuckerteam_chucker_library) { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$8$listener$1
                final /* synthetic */ getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library $this_callbackFlow;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$this_callbackFlow = r5;
                }

                public final void onChange(DynamicRealmObject dynamicRealmObject) {
                    subscribeReservationRescheduleEvent.b(dynamicRealmObject, "");
                    if (LoginPresenter.c(this.$this_callbackFlow) && InternalFlowFactory.access$getReturnFrozenObjects$p(InternalFlowFactory$from$8.this.this$0)) {
                        subscribeReservationRescheduleEvent.a(dynamicRealmObject.freeze(), "");
                    }
                }
            };
            this.$dynamicRealmObject.addChangeListener(internalFlowFactory$from$8$listener$1);
            if (RealmObject.isLoaded(this.$dynamicRealmObject) && InternalFlowFactory.access$getReturnFrozenObjects$p(this.this$0)) {
                subscribeReservationRescheduleEvent.a(RealmObject.freeze(this.$dynamicRealmObject), "");
            }
            this.L$0 = getformattedresponsebody_com_github_chuckerteam_chucker_library;
            this.L$1 = instance;
            this.L$2 = internalFlowFactory$from$8$listener$1;
            this.label = 2;
            if (getFormattedPath$com_github_ChuckerTeam_Chucker_library.e(getformattedresponsebody_com_github_chuckerteam_chucker_library, new pilihNoRek<onCLickStatusNpwp>() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$8.2
                public final void invoke() {
                    DynamicRealm dynamicRealm = instance;
                    subscribeReservationRescheduleEvent.a(dynamicRealm, "");
                    if (!dynamicRealm.isClosed()) {
                        InternalFlowFactory$from$8.this.$dynamicRealmObject.removeChangeListener(internalFlowFactory$from$8$listener$1);
                        instance.close();
                    }
                }
            }, this) == reviewSetoranFragment_ViewBinding) {
                return reviewSetoranFragment_ViewBinding;
            }
            return onCLickStatusNpwp.e;
        } else {
            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
        }
    }
}
