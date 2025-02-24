package o;

import android.content.Context;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Kliring$$Parcelable;
import o.ListFormTeller$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$hasDone.class */
public final class realmSet$hasDone {
    public static final realmSet$image<Integer> ao;
    public static final realmSet$image<Integer> ap;
    public static final realmSet$image<Integer> b;
    public static final realmSet$image<Integer> j;
    public static final realmSet$image<Double> l;
    private static final List<realmSet$image<?>> aE = Collections.synchronizedList(new ArrayList());
    private static final Set<realmSet$image<?>> aI = Collections.synchronizedSet(new HashSet());
    public static final realmSet$image<Long> C = c("measurement.ad_id_cache_time", 10000L, 10000L, realmSet$kodeNegara.b);
    public static final realmSet$image<Long> ae = c("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, realmSet$tipeNasabah.d);
    public static final realmSet$image<Long> al = c("measurement.config.cache_time", 86400000L, 3600000L, setSumberDanaCode.e);
    public static final realmSet$image<String> ai = c("measurement.config.url_scheme", "https", "https", realmGet$kliringList.a);
    public static final realmSet$image<String> am = c("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", setKliringList.a);
    public static final realmSet$image<Integer> aj = c("measurement.upload.max_bundles", 100, 100, getImage.a);
    public static final realmSet$image<Integer> ak = c("measurement.upload.max_batch_size", 65536, 65536, realmGet$editable.d);
    public static final realmSet$image<Integer> aq = c("measurement.upload.max_bundle_size", 65536, 65536, realmSet$codeCurrencyTeller.b);
    public static final realmSet$image<Integer> an = c("measurement.upload.max_events_per_day", 100000, 100000, realmGet$systemAppId.e);
    public static final realmSet$image<Integer> ar = c("measurement.upload.max_public_events_per_day", 50000, 50000, realmGet$totalWarkat.c);
    public static final realmSet$image<Integer> as = c("measurement.upload.max_conversions_per_day", 10000, 10000, realmSet$listWarkat.a);
    public static final realmSet$image<Integer> at = c("measurement.upload.max_realtime_events_per_day", 10, 10, realmSet$sumberDana.b);
    public static final realmSet$image<Integer> av = c("measurement.store.max_stored_events_per_app", 100000, 100000, realmSet$nomorHp.a);
    public static final realmSet$image<String> au = c("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", realmSet$nomorRekening.b);
    public static final realmSet$image<Long> aw = c("measurement.upload.backoff_period", 43200000L, 43200000L, realmSet$sequenceId.e);
    public static final realmSet$image<Long> az = c("measurement.upload.window_interval", 3600000L, 3600000L, realmSet$tanggalJatuhTempo.c);
    public static final realmSet$image<Long> ax = c("measurement.upload.interval", 3600000L, 3600000L, realmSet$totalWarkat.e);
    public static final realmSet$image<Long> aA = c("measurement.upload.realtime_upload_interval", 10000L, 10000L, realmSet$sumberDanaCode.c);
    public static final realmSet$image<Long> ay = c("measurement.upload.debug_upload_interval", 1000L, 1000L, realmSet$tipeNasabahId.b);
    public static final realmSet$image<Long> aB = c("measurement.upload.minimum_delay", 500L, 500L, setBeritaAcara.e);
    public static final realmSet$image<Long> aG = c("measurement.alarm_manager.minimum_interval", 60000L, 60000L, setKodeNegara.e);
    public static final realmSet$image<Long> aF = c("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, setSequenceId.a);
    public static final realmSet$image<Long> aC = c("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, setNomorHp.b);
    public static final realmSet$image<Long> aD = c("measurement.upload.initial_upload_delay_time", 15000L, 15000L, setNomorRekening.d);
    public static final realmSet$image<Long> e = c("measurement.upload.retry_time", 1800000L, 1800000L, setTipeNasabahId.b);
    public static final realmSet$image<Integer> a = c("measurement.upload.retry_count", 6, 6, setTipeNasabah.b);
    public static final realmSet$image<Long> c = c("measurement.upload.max_queue_time", 2419200000L, 2419200000L, setTanggalJatuhTempo.b);
    public static final realmSet$image<Integer> d = c("measurement.lifetimevalue.max_currency_tracked", 4, 4, setSumberDana.e);
    public static final realmSet$image<Integer> i = c("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final realmSet$image<Integer> h = c("measurement.upload.max_public_event_params", 25, 25, null);
    public static final realmSet$image<Long> g = c("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, Kliring$$Parcelable.AnonymousClass1.e);
    public static final realmSet$image<Boolean> f = c("measurement.test.boolean_flag", false, false, ListFormTeller.c);
    public static final realmSet$image<String> n = c("measurement.test.string_flag", "---", "---", Kliring$$Parcelable.c);
    public static final realmSet$image<Long> m = c("measurement.test.long_flag", -1L, -1L, KliringTemp$$ExternalSyntheticBackport0.a);
    public static final realmSet$image<Integer> k = c("measurement.test.int_flag", -2, -2, getSetoranList.c);

    /* renamed from: o */
    public static final realmSet$image<Integer> f189o = c("measurement.experiment.max_ids", 50, 50, getCountAll.b);
    public static final realmSet$image<Integer> t = c("measurement.max_bundles_per_iteration", 100, 100, getKirimanUangList.a);
    public static final realmSet$image<Long> r = c("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, realmGet$bankTransferList.a);
    public static final realmSet$image<Boolean> p = c("measurement.validation.internal_limits_internal_event_params", false, false, isAvailableSetoran100.a);
    public static final realmSet$image<Boolean> q = c("measurement.collection.firebase_global_collection_flag_enabled", true, true, getTarikanList.d);
    public static final realmSet$image<Boolean> s = c("measurement.collection.redundant_engagement_removal_enabled", false, false, realmGet$kirimanUangList.e);
    public static final realmSet$image<Boolean> u = c("measurement.collection.log_event_and_bundle_v2", true, true, realmSet$bankTransferList.c);
    public static final realmSet$image<Boolean> v = c("measurement.quality.checksum", false, false, null);
    public static final realmSet$image<Boolean> w = c("measurement.sdk.collection.validate_param_names_alphabetical", true, true, realmSet$kliringList.c);
    public static final realmSet$image<Boolean> y = c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, realmGet$tarikanList.b);
    public static final realmSet$image<Boolean> x = c("measurement.audience.refresh_event_count_filters_timestamp", false, false, realmSet$kirimanUangList.c);
    public static final realmSet$image<Boolean> D = c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, realmGet$setoranList.a);
    public static final realmSet$image<Boolean> I = c("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, setBankTransferList.d);
    public static final realmSet$image<Boolean> H = c("measurement.sdk.collection.last_deep_link_referrer2", true, true, realmSet$setoranList.a);
    public static final realmSet$image<Boolean> M = c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, realmSet$tarikanList.b);
    public static final realmSet$image<Boolean> K = c("measurement.sdk.collection.last_gclid_from_referrer2", false, false, setKirimanUangList.d);
    public static final realmSet$image<Boolean> L = c("measurement.sdk.collection.enable_extend_user_property_size", true, true, Migration.e);
    public static final realmSet$image<Boolean> J = c("measurement.upload.file_lock_state_check", true, true, setTarikanList.b);
    public static final realmSet$image<Boolean> N = c("measurement.ga.ga_app_id", false, false, ListFormTeller$$Parcelable.a);
    public static final realmSet$image<Boolean> O = c("measurement.lifecycle.app_in_background_parameter", false, false, setSetoranList.c);
    public static final realmSet$image<Boolean> R = c("measurement.integration.disable_firebase_instance_id", false, false, ListFormTeller$$Parcelable.AnonymousClass1.b);
    public static final realmSet$image<Boolean> P = c("measurement.lifecycle.app_backgrounded_engagement", false, false, ReservasiOnline.d);
    public static final realmSet$image<Boolean> Q = c("measurement.collection.service.update_with_analytics_fix", false, false, getCodeTransaksi.c);
    public static final realmSet$image<Boolean> S = c("measurement.service.use_appinfo_modified", true, true, getDescTransaksi.e);
    public static final realmSet$image<Boolean> U = c("measurement.client.firebase_feature_rollout.v1.enable", true, true, getCodeCurrencyTeller.a);
    public static final realmSet$image<Boolean> W = c("measurement.client.sessions.check_on_reset_and_enable2", true, true, getNoRekeningTeller.b);
    public static final realmSet$image<Boolean> X = c("measurement.scheduler.task_thread.cleanup_on_exit", false, false, getReceiverBankNameTeller.b);
    public static final realmSet$image<Boolean> T = c("measurement.upload.file_truncate_fix", false, false, getIsInputAtmPemrek.e);
    public static final realmSet$image<Boolean> V = c("measurement.sdk.screen.disabling_automatic_reporting", true, true, getNameTransaksi.a);
    public static final realmSet$image<Boolean> Z = c("measurement.sdk.screen.manual_screen_view_logging", true, true, getReceiverNameTeller.b);
    public static final realmSet$image<Boolean> aa = c("measurement.collection.synthetic_data_mitigation", false, false, getSystemAppId.d);
    public static final realmSet$image<Boolean> ab = c("measurement.androidId.delete_feature", true, true, getTypeTransksi.c);
    public static final realmSet$image<Integer> ac = c("measurement.service.storage_consent_support_version", 203600, 203600, isEditable.e);
    public static final realmSet$image<Boolean> Y = c("measurement.upload.directly_maybe_log_error_events", true, true, isHasDone.a);
    public static final realmSet$image<Boolean> ad = c("measurement.frontend.directly_maybe_log_error_events", false, false, realmGet$codeCurrencyTeller.b);
    public static final realmSet$image<Boolean> ag = c("measurement.client.properties.non_null_origin", true, true, realmGet$codeTransaksi.a);
    public static final realmSet$image<Boolean> af = c("measurement.client.click_identifier_control.dev", false, false, realmGet$descTransaksi.d);
    public static final realmSet$image<Boolean> ah = c("measurement.service.click_identifier_control", false, false, realmGet$hasDone.c);
    public static final realmSet$image<Boolean> B = c("measurement.client.reject_blank_user_id", true, true, realmGet$image.c);
    public static final realmSet$image<Boolean> A = c("measurement.config.persist_last_modified", true, true, realmGet$isInputAtmPemrek.e);
    public static final realmSet$image<Boolean> z = c("measurement.client.consent.suppress_1p_in_ga4f_install", true, true, realmGet$noRekeningTeller.b);
    public static final realmSet$image<Boolean> F = c("measurement.module.pixie.ees", false, false, realmGet$nominalTransaksiTeller.d);
    public static final realmSet$image<Boolean> E = c("measurement.euid.client.dev", false, false, realmGet$nameTransaksi.c);
    public static final realmSet$image<Boolean> G = c("measurement.euid.service", false, false, realmGet$receiverBankNameTeller.b);

    static {
        Integer valueOf = Integer.valueOf((int) CloseCodes.NORMAL_CLOSURE);
        ap = c("measurement.upload.max_events_per_bundle", valueOf, valueOf, realmGet$typeTransksi.e);
        ao = c("measurement.upload.max_error_events_per_day", valueOf, valueOf, realmSet$beritaAcara.c);
        Integer valueOf2 = Integer.valueOf((int) HttpStatus.HTTP_OK);
        b = c("measurement.audience.filter_result_max_count", valueOf2, valueOf2, KliringTemp.e);
        Integer valueOf3 = Integer.valueOf((int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        j = c("measurement.upload.max_event_name_cardinality", valueOf3, valueOf3, null);
        Double valueOf4 = Double.valueOf(-3.0d);
        l = c("measurement.test.double_flag", valueOf4, valueOf4, getBankTransferList.d);
    }

    static <V> realmSet$image<V> c(String str, V v2, V v3, realmSet$editable<V> realmset_editable) {
        realmSet$image<V> realmset_image = new realmSet$image<>(str, v2, v3, realmset_editable, null);
        aE.add(realmset_image);
        return realmset_image;
    }

    public static Map<String, String> d(Context context) {
        realmSet$flagOtherCC b2 = realmSet$flagOtherCC.b(context.getContentResolver(), realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        return b2 == null ? Collections.emptyMap() : b2.a();
    }
}
