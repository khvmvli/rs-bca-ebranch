package o;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
/* loaded from: classes-dex2jar.jar:o/RemoteActionCompat.class */
public class RemoteActionCompat extends AppComponentFactory {

    /* loaded from: classes-dex2jar.jar:o/RemoteActionCompat$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        Object b();
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Activity instantiateActivity = instantiateActivity(classLoader, str, intent);
        Activity activity = instantiateActivity;
        if (instantiateActivity instanceof IconCompatParcelizer) {
            Object b = ((IconCompatParcelizer) instantiateActivity).b();
            activity = instantiateActivity;
            if (b != null) {
                activity = b;
            }
        }
        return activity;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Application instantiateApplication = instantiateApplication(classLoader, str);
        Application application = instantiateApplication;
        if (instantiateApplication instanceof IconCompatParcelizer) {
            Object b = ((IconCompatParcelizer) instantiateApplication).b();
            application = instantiateApplication;
            if (b != null) {
                application = b;
            }
        }
        return application;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ContentProvider instantiateProvider = instantiateProvider(classLoader, str);
        ContentProvider contentProvider = instantiateProvider;
        if (instantiateProvider instanceof IconCompatParcelizer) {
            Object b = ((IconCompatParcelizer) instantiateProvider).b();
            contentProvider = instantiateProvider;
            if (b != null) {
                contentProvider = b;
            }
        }
        return contentProvider;
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        BroadcastReceiver instantiateReceiver = instantiateReceiver(classLoader, str, intent);
        BroadcastReceiver broadcastReceiver = instantiateReceiver;
        if (instantiateReceiver instanceof IconCompatParcelizer) {
            Object b = ((IconCompatParcelizer) instantiateReceiver).b();
            broadcastReceiver = instantiateReceiver;
            if (b != null) {
                broadcastReceiver = b;
            }
        }
        return broadcastReceiver;
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Service instantiateService = instantiateService(classLoader, str, intent);
        Service service = instantiateService;
        if (instantiateService instanceof IconCompatParcelizer) {
            Object b = ((IconCompatParcelizer) instantiateService).b();
            service = instantiateService;
            if (b != null) {
                service = b;
            }
        }
        return service;
    }
}
