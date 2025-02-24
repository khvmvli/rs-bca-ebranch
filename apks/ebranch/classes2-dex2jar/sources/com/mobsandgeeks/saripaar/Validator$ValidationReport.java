package com.mobsandgeeks.saripaar;

import java.util.List;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/Validator$ValidationReport.class */
class Validator$ValidationReport {
    List<ValidationError> errors;
    boolean hasMoreErrors;

    Validator$ValidationReport(List<ValidationError> list, boolean z) {
        this.errors = list;
        this.hasMoreErrors = z;
    }
}
