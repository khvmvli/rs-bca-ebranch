package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.CategoriesORResponse;
import o.CategoriesORResponse$$Parcelable;
import o.CategoryResponse$$Parcelable;
import o.CustDataResponse$Phone$$Parcelable;
import o.DetailTransactionResponse;
import o.DetailTransactionResponse$TxnDataDetail$$Parcelable;
import o.DetailTransactionResponse$ValueTxnDataDetail$$Parcelable;
import o.FirebaseResponse;
import o.FirebaseResponse$TxnDataDetail$$Parcelable;
import o.GetAcctOpeningCategoryDataResponse;
import o.GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable;
import o.GetBankSpecialRelationResponse;
import o.GetBranchROResponse$DetailBranch$$Parcelable;
import o.GetCustAcctListResponse$AccountData$$Parcelable;
import o.GetTxnTellerDetailResponse;
import o.getAlert;
import o.getBankKey;
import o.getBranchCoordinator;
import o.getBranchInitial;
import o.getBranchLists;
import o.getCategories;
import o.getCategoryCode;
import o.getCategoryContent;
import o.getCategoryName$MediaBrowserCompat$CustomActionResultReceiver;
import o.getContentEn;
import o.getContentName;
import o.getCurrencyName;
import o.getDistanceToBranch;
import o.getEmergencyCloseEndDate;
import o.getEmergencyCloseStartDate;
import o.getFlagReservationCsoReguler;
import o.getFlagReservationTellerReguler;
import o.getFlagReservationTellerSolitaire;
import o.getFlagWeekendBankingSaturday;
import o.getFlagWeekendBankingSunday;
import o.getProductTypeName;
import o.getProvince;
import o.getRegionCode;
import o.getSpecialBanks;
import o.getTitle;
import o.getTxnDetailsByNoreff;
import o.getTxnNotes2;
import o.getValueArray;
import o.getVendorKiosk;
import o.setAccountType;
import o.setAlert;
import o.setAmountKliring;
import o.setBranchCoordinator;
import o.setBranchType;
import o.setCategoryCode;
import o.setCategoryContent;
import o.setCategoryEn;
import o.setCategoryName;
import o.setContentName;
import o.setCurrencyCode;
import o.setDescription;
import o.setEmergencyCloseEndDate;
import o.setEnglish;
import o.setFlagReservation;
import o.setFlagReservationCsoPrioritas;
import o.setFlagReservationCsoSolitaire;
import o.setFlagWeekendBankingSaturday;
import o.setIncomeAmount;
import o.setIncomeAmount$MediaBrowserCompat$CustomActionResultReceiver;
import o.setListCategory;
import o.setListCategory$MediaBrowserCompat$CustomActionResultReceiver;
import o.setRefNo;
import o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver;
import o.setSpecialBanks;
import o.setTxnSubDataDetails;
import o.setValueArray;
import o.setViewType;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/Glide.class */
public class Glide implements ComponentCallbacks2 {
    private static volatile Glide f;
    private static volatile boolean g;
    public final DetailTransactionResponse a;
    public final getCategories b;
    public final setFlagReservationCsoSolitaire c;
    public final setValueArray d;
    public final GetBranchROResponse$DetailBranch$$Parcelable h;
    private final Glide$MediaBrowserCompat$CustomActionResultReceiver i;
    public final Registry j;
    private final CustDataResponse$Phone$$Parcelable l;

    /* renamed from: o */
    private final DetailTransactionResponse.ValueTxnSubDataDetail f66o;
    public final List<CategoriesORResponse.Category> e = new ArrayList();
    private CategoriesORResponse m = CategoriesORResponse.NORMAL;

    Glide(Context context, CustDataResponse$Phone$$Parcelable custDataResponse$Phone$$Parcelable, DetailTransactionResponse.ValueTxnSubDataDetail valueTxnSubDataDetail, setValueArray setvaluearray, DetailTransactionResponse detailTransactionResponse, GetBranchROResponse$DetailBranch$$Parcelable getBranchROResponse$DetailBranch$$Parcelable, setFlagReservationCsoSolitaire setflagreservationcsosolitaire, int i, Glide$MediaBrowserCompat$CustomActionResultReceiver glide$MediaBrowserCompat$CustomActionResultReceiver, Map<Class<?>, getContentEn<?, ?>> map, List<getTxnDetailsByNoreff<Object>> list, CategoriesORResponse$$Parcelable categoriesORResponse$$Parcelable) {
        CategoryResponse$$Parcelable categoryResponse$$Parcelable;
        CategoryResponse$$Parcelable categoryResponse$$Parcelable2;
        this.l = custDataResponse$Phone$$Parcelable;
        this.d = setvaluearray;
        this.a = detailTransactionResponse;
        this.f66o = valueTxnSubDataDetail;
        this.h = getBranchROResponse$DetailBranch$$Parcelable;
        this.c = setflagreservationcsosolitaire;
        this.i = glide$MediaBrowserCompat$CustomActionResultReceiver;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.j = registry;
        registry.d(new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.d(new setCurrencyCode());
        }
        List<ImageHeaderParser> e = registry.c.e();
        if (!e.isEmpty()) {
            getFlagReservationTellerReguler getflagreservationtellerreguler = new getFlagReservationTellerReguler(context, e, setvaluearray, detailTransactionResponse);
            CategoryResponse$$Parcelable<ParcelFileDescriptor, Bitmap> e2 = getEmergencyCloseEndDate.e(setvaluearray);
            List<ImageHeaderParser> e3 = registry.c.e();
            if (!e3.isEmpty()) {
                getBankKey getbankkey = new getBankKey(e3, resources.getDisplayMetrics(), setvaluearray, detailTransactionResponse);
                if (!categoriesORResponse$$Parcelable.d.containsKey(setIncomeAmount$MediaBrowserCompat$CustomActionResultReceiver.class) || Build.VERSION.SDK_INT < 28) {
                    categoryResponse$$Parcelable2 = new setSpecialBanks(getbankkey);
                    categoryResponse$$Parcelable = new getDistanceToBranch(getbankkey, detailTransactionResponse);
                } else {
                    categoryResponse$$Parcelable = new getBranchLists();
                    categoryResponse$$Parcelable2 = new GetBankSpecialRelationResponse.SpecialBank();
                }
                getFlagWeekendBankingSunday getflagweekendbankingsunday = new getFlagWeekendBankingSunday(context);
                setListCategory$MediaBrowserCompat$CustomActionResultReceiver setlistcategory_mediabrowsercompat_customactionresultreceiver = new GetAcctOpeningCategoryDataResponse<Integer, InputStream>(resources) { // from class: o.setListCategory$MediaBrowserCompat$CustomActionResultReceiver
                    private final Resources a;

                    {
                        this.a = r4;
                    }

                    @Override // o.GetAcctOpeningCategoryDataResponse
                    public final getAmountKliring<Integer, InputStream> e(getListCategory getlistcategory) {
                        return new setListCategory(this.a, getlistcategory.b(Uri.class, InputStream.class));
                    }
                };
                setListCategory.write write = new setListCategory.write(resources);
                setListCategory.IconCompatParcelizer iconCompatParcelizer = new setListCategory.IconCompatParcelizer(resources);
                setListCategory.read read = new setListCategory.read(resources);
                getSpecialBanks getspecialbanks = new getSpecialBanks(detailTransactionResponse);
                setBranchCoordinator setbranchcoordinator = new setBranchCoordinator();
                setFlagReservationCsoPrioritas setflagreservationcsoprioritas = new setFlagReservationCsoPrioritas();
                ContentResolver contentResolver = context.getContentResolver();
                registry.d(ByteBuffer.class, new FirebaseResponse()).d(InputStream.class, new setCategoryContent(detailTransactionResponse)).b("Bitmap", ByteBuffer.class, Bitmap.class, categoryResponse$$Parcelable2).b("Bitmap", InputStream.class, Bitmap.class, categoryResponse$$Parcelable);
                registry.b("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new getBranchCoordinator(getbankkey));
                Registry b = registry.b("Bitmap", ParcelFileDescriptor.class, Bitmap.class, e2).b("Bitmap", AssetFileDescriptor.class, Bitmap.class, getEmergencyCloseEndDate.d(setvaluearray)).b(Bitmap.class, Bitmap.class, getCategoryName$MediaBrowserCompat$CustomActionResultReceiver.b()).b("Bitmap", Bitmap.class, Bitmap.class, new getBranchInitial()).d(Bitmap.class, (setDescription) getspecialbanks).b("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new setEnglish(resources, categoryResponse$$Parcelable2)).b("BitmapDrawable", InputStream.class, BitmapDrawable.class, new setEnglish(resources, categoryResponse$$Parcelable)).b("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new setEnglish(resources, e2)).d(BitmapDrawable.class, (setDescription) new GetAcctOpeningCategoryDataResponse.Languange(setvaluearray, getspecialbanks)).b("Gif", InputStream.class, getProvince.class, new setBranchType(e, getflagreservationtellerreguler, detailTransactionResponse)).b("Gif", ByteBuffer.class, getProvince.class, getflagreservationtellerreguler).d(getProvince.class, (setDescription) new getRegionCode()).b(setCategoryEn.class, setCategoryEn.class, getCategoryName$MediaBrowserCompat$CustomActionResultReceiver.b()).b("Bitmap", setCategoryEn.class, Bitmap.class, new getVendorKiosk(setvaluearray));
                b.b("legacy_append", Uri.class, Drawable.class, getflagweekendbankingsunday);
                b.b("legacy_append", Uri.class, Bitmap.class, new getEmergencyCloseStartDate(getflagweekendbankingsunday, setvaluearray));
                Registry b2 = b.e(new getFlagReservationCsoReguler.write()).b(File.class, ByteBuffer.class, new GetAcctOpeningCategoryDataResponse<File, ByteBuffer>() { // from class: o.getRefNo$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // o.GetAcctOpeningCategoryDataResponse
                    public final getAmountKliring<File, ByteBuffer> e(getListCategory getlistcategory) {
                        return new getRefNo();
                    }
                }).b(File.class, InputStream.class, new FirebaseResponse.ValueTxnDataDetail.read());
                b2.b("legacy_append", File.class, File.class, new getFlagWeekendBankingSaturday());
                b2.b(File.class, ParcelFileDescriptor.class, new FirebaseResponse.ValueTxnDataDetail.RemoteActionCompatParcelizer()).b(File.class, File.class, getCategoryName$MediaBrowserCompat$CustomActionResultReceiver.b()).e(new setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<InputStream>(detailTransactionResponse) { // from class: o.CreateReservationResponse$MediaBrowserCompat$CustomActionResultReceiver
                    private final DetailTransactionResponse d;

                    {
                        this.d = r4;
                    }

                    @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
                    public final Class<InputStream> c() {
                        return InputStream.class;
                    }

                    @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
                    public final /* synthetic */ setReservationTime<InputStream> d(InputStream inputStream) {
                        return new CreateReservationResponse(inputStream, this.d);
                    }
                });
                registry.e(new ParcelFileDescriptorRewinder.write());
                registry.b(Integer.TYPE, InputStream.class, setlistcategory_mediabrowsercompat_customactionresultreceiver).b(Integer.TYPE, ParcelFileDescriptor.class, iconCompatParcelizer).b(Integer.class, InputStream.class, setlistcategory_mediabrowsercompat_customactionresultreceiver).b(Integer.class, ParcelFileDescriptor.class, iconCompatParcelizer).b(Integer.class, Uri.class, write).b(Integer.TYPE, AssetFileDescriptor.class, read).b(Integer.class, AssetFileDescriptor.class, read).b(Integer.TYPE, Uri.class, write).b(String.class, InputStream.class, new FirebaseResponse$TxnDataDetail$$Parcelable.write()).b(Uri.class, InputStream.class, new FirebaseResponse$TxnDataDetail$$Parcelable.write()).b(String.class, InputStream.class, new getCategoryCode.read()).b(String.class, ParcelFileDescriptor.class, new getCategoryCode.IconCompatParcelizer()).b(String.class, AssetFileDescriptor.class, new GetAcctOpeningCategoryDataResponse<String, AssetFileDescriptor>() { // from class: o.getCategoryCode$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // o.GetAcctOpeningCategoryDataResponse
                    public final getAmountKliring<String, AssetFileDescriptor> e(getListCategory getlistcategory) {
                        return new getCategoryCode(getlistcategory.b(Uri.class, AssetFileDescriptor.class));
                    }
                }).b(Uri.class, InputStream.class, new getTitle.IconCompatParcelizer(context.getAssets())).b(Uri.class, ParcelFileDescriptor.class, new getTitle.read(context.getAssets())).b(Uri.class, InputStream.class, new GetAcctOpeningCategoryDataResponse<Uri, InputStream>(context) { // from class: o.GetAcctOpeningCategoryDataResponse$Content$MediaBrowserCompat$CustomActionResultReceiver
                    private final Context b;

                    {
                        this.b = r4;
                    }

                    @Override // o.GetAcctOpeningCategoryDataResponse
                    public final getAmountKliring<Uri, InputStream> e(getListCategory getlistcategory) {
                        return new GetAcctOpeningCategoryDataResponse.Content(this.b);
                    }
                }).b(Uri.class, InputStream.class, new getContentName.write(context));
                if (Build.VERSION.SDK_INT >= 29) {
                    registry.b(Uri.class, InputStream.class, new setContentName.RemoteActionCompatParcelizer(context));
                    registry.b(Uri.class, ParcelFileDescriptor.class, new setContentName.IconCompatParcelizer<ParcelFileDescriptor>(context) { // from class: o.setContentName$MediaBrowserCompat$CustomActionResultReceiver
                    });
                }
                Registry b3 = registry.b(Uri.class, InputStream.class, new setCategoryCode.RemoteActionCompatParcelizer(contentResolver)).b(Uri.class, ParcelFileDescriptor.class, new setCategoryCode.read(contentResolver)).b(Uri.class, AssetFileDescriptor.class, new setCategoryCode.write(contentResolver)).b(Uri.class, InputStream.class, new getCategoryContent.RemoteActionCompatParcelizer()).b(URL.class, InputStream.class, new setCategoryName.RemoteActionCompatParcelizer()).b(Uri.class, File.class, new setAmountKliring.write(context)).b(setRefNo.class, InputStream.class, new GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.read()).b(byte[].class, ByteBuffer.class, new getAlert.RemoteActionCompatParcelizer()).b(byte[].class, InputStream.class, new getAlert.read()).b(Uri.class, Uri.class, getCategoryName$MediaBrowserCompat$CustomActionResultReceiver.b()).b(Drawable.class, Drawable.class, getCategoryName$MediaBrowserCompat$CustomActionResultReceiver.b());
                b3.b("legacy_append", Drawable.class, Drawable.class, new getFlagReservationTellerSolitaire());
                b3.a(Bitmap.class, BitmapDrawable.class, new setEmergencyCloseEndDate(resources)).a(Bitmap.class, byte[].class, setbranchcoordinator).a(Drawable.class, byte[].class, new setFlagReservation(setvaluearray, setbranchcoordinator, setflagreservationcsoprioritas)).a(getProvince.class, byte[].class, setflagreservationcsoprioritas);
                if (Build.VERSION.SDK_INT >= 23) {
                    CategoryResponse$$Parcelable<ByteBuffer, Bitmap> b4 = getEmergencyCloseEndDate.b(setvaluearray);
                    registry.b("legacy_append", ByteBuffer.class, Bitmap.class, b4);
                    registry.b("legacy_append", ByteBuffer.class, BitmapDrawable.class, new setEnglish(resources, b4));
                }
                this.b = new getCategories(context, detailTransactionResponse, registry, new GetTxnTellerDetailResponse.TxnDetail(), glide$MediaBrowserCompat$CustomActionResultReceiver, map, list, custDataResponse$Phone$$Parcelable, categoriesORResponse$$Parcelable, i);
                return;
            }
            throw new Registry.NoImageHeaderParserException();
        }
        throw new Registry.NoImageHeaderParserException();
    }

    private static GeneratedAppGlideModule a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        try {
            generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            generatedAppGlideModule = null;
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
        }
        return generatedAppGlideModule;
    }

    public static CategoriesORResponse.Category d(Context context) {
        if (context != null) {
            return e(context).h.d(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static Glide e(Context context) {
        if (f == null) {
            GeneratedAppGlideModule a = a(context.getApplicationContext());
            synchronized (Glide.class) {
                try {
                    if (f == null) {
                        if (!g) {
                            g = true;
                            setIncomeAmount setincomeamount = new setIncomeAmount();
                            Context applicationContext = context.getApplicationContext();
                            Collections.emptyList();
                            List<GetCustAcctListResponse$AccountData$$Parcelable> b = new setAccountType(applicationContext).b();
                            if (a != null && !a.c().isEmpty()) {
                                Set<Class<?>> c = a.c();
                                Iterator<GetCustAcctListResponse$AccountData$$Parcelable> it = b.iterator();
                                while (it.hasNext()) {
                                    GetCustAcctListResponse$AccountData$$Parcelable next = it.next();
                                    if (c.contains(next.getClass())) {
                                        if (Log.isLoggable("Glide", 3)) {
                                            StringBuilder sb = new StringBuilder("AppGlideModule excludes manifest GlideModule: ");
                                            sb.append(next);
                                            Log.d("Glide", sb.toString());
                                        }
                                        it.remove();
                                    }
                                }
                            }
                            if (Log.isLoggable("Glide", 3)) {
                                for (GetCustAcctListResponse$AccountData$$Parcelable getCustAcctListResponse$AccountData$$Parcelable : b) {
                                    StringBuilder sb2 = new StringBuilder("Discovered GlideModule from manifest: ");
                                    sb2.append(getCustAcctListResponse$AccountData$$Parcelable.getClass());
                                    Log.d("Glide", sb2.toString());
                                }
                            }
                            setincomeamount.r = a != null ? GeneratedAppGlideModule.e() : null;
                            Iterator<GetCustAcctListResponse$AccountData$$Parcelable> it2 = b.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                            if (setincomeamount.p == null) {
                                setincomeamount.p = setAlert.a();
                            }
                            if (setincomeamount.f == null) {
                                setincomeamount.f = setAlert.d();
                            }
                            if (setincomeamount.a == null) {
                                setincomeamount.a = setAlert.e();
                            }
                            if (setincomeamount.n == null) {
                                setincomeamount.n = new DetailTransactionResponse$ValueTxnDataDetail$$Parcelable(new DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.write(applicationContext));
                            }
                            if (setincomeamount.c == null) {
                                setincomeamount.c = new setFlagWeekendBankingSaturday();
                            }
                            if (setincomeamount.d == null) {
                                int i = setincomeamount.n.c;
                                if (i > 0) {
                                    setincomeamount.d = new DetailTransactionResponse$TxnDataDetail$$Parcelable((long) i);
                                } else {
                                    setincomeamount.d = new getValueArray();
                                }
                            }
                            if (setincomeamount.b == null) {
                                setincomeamount.b = new getProductTypeName(setincomeamount.n.e);
                            }
                            if (setincomeamount.k == null) {
                                setincomeamount.k = new setViewType((long) setincomeamount.n.a);
                            }
                            if (setincomeamount.h == null) {
                                setincomeamount.h = new setTxnSubDataDetails(applicationContext);
                            }
                            if (setincomeamount.g == null) {
                                setincomeamount.g = new CustDataResponse$Phone$$Parcelable(setincomeamount.k, setincomeamount.h, setincomeamount.f, setincomeamount.p, setAlert.b(), setincomeamount.a, setincomeamount.f237o);
                            }
                            List<getTxnDetailsByNoreff<Object>> list = setincomeamount.e;
                            if (list == null) {
                                setincomeamount.e = Collections.emptyList();
                            } else {
                                setincomeamount.e = Collections.unmodifiableList(list);
                            }
                            CategoriesORResponse$$Parcelable categoriesORResponse$$Parcelable = new CategoriesORResponse$$Parcelable(setincomeamount.m);
                            Glide glide = new Glide(applicationContext, setincomeamount.g, setincomeamount.k, setincomeamount.d, setincomeamount.b, new GetBranchROResponse$DetailBranch$$Parcelable(setincomeamount.r, categoriesORResponse$$Parcelable), setincomeamount.c, setincomeamount.l, setincomeamount.i, setincomeamount.j, setincomeamount.e, categoriesORResponse$$Parcelable);
                            for (GetCustAcctListResponse$AccountData$$Parcelable getCustAcctListResponse$AccountData$$Parcelable2 : b) {
                            }
                            applicationContext.registerComponentCallbacks(glide);
                            f = glide;
                            g = false;
                        } else {
                            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final boolean e(getCurrencyName<?> getcurrencyname) {
        synchronized (this.e) {
            Iterator<CategoriesORResponse.Category> it = this.e.iterator();
            do {
                if (!it.hasNext()) {
                    return false;
                }
            } while (!it.next().b(getcurrencyname));
            return true;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        getTxnNotes2.b();
        this.f66o.a();
        this.d.e();
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        getTxnNotes2.b();
        synchronized (this.e) {
            for (CategoriesORResponse.Category category : this.e) {
                category.onTrimMemory(i);
            }
        }
        this.f66o.a(i);
        this.d.a(i);
        this.a.d(i);
    }
}
