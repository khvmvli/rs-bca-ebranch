package com.mobsandgeeks.saripaar;

import android.util.Pair;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import java.util.Comparator;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/SequenceComparator.class */
final class SequenceComparator implements Comparator<Pair<Rule, ViewDataAdapter>> {
    SequenceComparator() {
    }

    public final int compare(Pair<Rule, ViewDataAdapter> pair, Pair<Rule, ViewDataAdapter> pair2) {
        int sequence = ((Rule) pair.first).getSequence();
        int sequence2 = ((Rule) pair2.first).getSequence();
        return sequence == sequence2 ? 0 : sequence > sequence2 ? 1 : -1;
    }
}
