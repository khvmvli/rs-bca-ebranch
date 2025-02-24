package com.google.firebase.components;

import java.util.List;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/components/DependencyCycleException.class */
public class DependencyCycleException extends DependencyException {
    private final List<Component<?>> componentsInCycle;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Dependency cycle detected: "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.componentsInCycle = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
