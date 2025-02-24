package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
/* loaded from: classes-dex2jar.jar:o/onCreateAnimation.class */
public class onCreateAnimation extends Fragment {
    View a;
    ListView b;
    View c;
    CharSequence d;
    ListAdapter e;
    boolean h;
    TextView i;
    View j;
    private final Handler f = new Handler();

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f173o = new Runnable() { // from class: o.onCreateAnimation.4
        @Override // java.lang.Runnable
        public final void run() {
            onCreateAnimation.this.b.focusableViewAvailable(onCreateAnimation.this.b);
        }
    };
    private final AdapterView.OnItemClickListener g = new AdapterView.OnItemClickListener() { // from class: o.onCreateAnimation.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    };

    private void c(boolean z, boolean z2) {
        e();
        View view = this.j;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.h != z) {
            this.h = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.a.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.a.clearAnimation();
                }
                this.j.setVisibility(8);
                this.a.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.a.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.a.clearAnimation();
            }
            this.j.setVisibility(0);
            this.a.setVisibility(8);
        }
    }

    private void e() {
        if (this.b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.b = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.i = textView;
                    if (textView == null) {
                        this.c = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.j = view.findViewById(16711682);
                    this.a = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.b = listView;
                        View view2 = this.c;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.d;
                            if (charSequence != null) {
                                this.i.setText(charSequence);
                                this.b.setEmptyView(this.i);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.h = true;
                this.b.setOnItemClickListener(this.g);
                ListAdapter listAdapter = this.e;
                boolean z = false;
                if (listAdapter != null) {
                    this.e = null;
                    boolean z2 = 0 != 0;
                    this.e = listAdapter;
                    ListView listView2 = this.b;
                    if (listView2 != null) {
                        listView2.setAdapter(listAdapter);
                        if (!this.h && !z2) {
                            if (requireView().getWindowToken() != null) {
                                z = true;
                            }
                            c(true, z);
                        }
                    }
                } else if (this.j != null) {
                    c(false, false);
                }
                this.f.post(this.f173o);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f.removeCallbacks(this.f173o);
        this.b = null;
        this.h = false;
        this.a = null;
        this.j = null;
        this.c = null;
        this.i = null;
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        e();
    }
}
