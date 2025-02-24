package o;

import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
@DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes-dex2jar.jar:o/setHandPhoneCountryCodeNumber.class */
public interface setHandPhoneCountryCodeNumber {
    @ResultIgnorabilityUnspecified
    setJatuhTempo<Void> d(setHandPhoneNumber sethandphonenumber);
}
