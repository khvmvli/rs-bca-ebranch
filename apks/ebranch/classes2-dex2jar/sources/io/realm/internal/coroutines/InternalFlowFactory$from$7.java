package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import kotlin.TypeCastException;
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
/* loaded from: classes2-dex2jar.jar:io/realm/internal/coroutines/InternalFlowFactory$from$7.class */
public final class InternalFlowFactory$from$7 extends showSiupNibPage implements onClickInfo<getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library<? super T>, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ Realm $realm;
    final /* synthetic */ RealmModel $realmObject;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library p$;
    final /* synthetic */ InternalFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalFlowFactory$from$7(InternalFlowFactory internalFlowFactory, Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, ProsesTarikanFragment prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.this$0 = internalFlowFactory;
        this.$realm = realm;
        this.$config = realmConfiguration;
        this.$realmObject = realmModel;
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.b(prosesTarikanFragment, "");
        InternalFlowFactory$from$7 internalFlowFactory$from$7 = new InternalFlowFactory$from$7(this.this$0, this.$realm, this.$config, this.$realmObject, prosesTarikanFragment);
        internalFlowFactory$from$7.p$ = (getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library) obj;
        return internalFlowFactory$from$7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InternalFlowFactory$from$7) create(obj, (ProsesTarikanFragment) obj2)).invokeSuspend(onCLickStatusNpwp.e);
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
            if (this.$realm.isClosed()) {
                this.L$0 = getformattedresponsebody_com_github_chuckerteam_chucker_library;
                this.label = 1;
                if (getFormattedPath$com_github_ChuckerTeam_Chucker_library.e(getformattedresponsebody_com_github_chuckerteam_chucker_library, AnonymousClass1.INSTANCE, this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
                return onCLickStatusNpwp.e;
            }
            final Realm instance = Realm.getInstance(this.$config);
            final RealmChangeListener internalFlowFactory$from$7$listener$1 = new RealmChangeListener<T>(getformattedresponsebody_com_github_chuckerteam_chucker_library) { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$7$listener$1
                final /* synthetic */ getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library $this_callbackFlow;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$this_callbackFlow = r5;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void onChange(RealmModel realmModel) {
                    subscribeReservationRescheduleEvent.b(realmModel, "");
                    if (LoginPresenter.c(this.$this_callbackFlow) && InternalFlowFactory.access$getReturnFrozenObjects$p(InternalFlowFactory$from$7.this.this$0) && RealmObject.freeze(realmModel) == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                }
            };
            RealmObject.addChangeListener(this.$realmObject, internalFlowFactory$from$7$listener$1);
            if (RealmObject.isLoaded(this.$realmObject) && InternalFlowFactory.access$getReturnFrozenObjects$p(this.this$0)) {
                subscribeReservationRescheduleEvent.a(RealmObject.freeze(this.$realmObject), "");
            }
            this.L$0 = getformattedresponsebody_com_github_chuckerteam_chucker_library;
            this.L$1 = instance;
            this.L$2 = internalFlowFactory$from$7$listener$1;
            this.label = 2;
            if (getFormattedPath$com_github_ChuckerTeam_Chucker_library.e(getformattedresponsebody_com_github_chuckerteam_chucker_library, new pilihNoRek<onCLickStatusNpwp>() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$7.2
                public final void invoke() {
                    Realm realm = instance;
                    subscribeReservationRescheduleEvent.a(realm, "");
                    if (!realm.isClosed()) {
                        RealmObject.removeChangeListener(InternalFlowFactory$from$7.this.$realmObject, internalFlowFactory$from$7$listener$1);
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
