package o;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/DetailTundaTellerActivity_ViewBinding.class */
public final class DetailTundaTellerActivity_ViewBinding extends BaseAdapter implements Filterable {
    private Context b;
    String a = "";
    List<ConfirmSubBCACardAdapter$ViewHolder_ViewBinding> d = new ArrayList();
    public List<ConfirmSubBCACardAdapter$ViewHolder_ViewBinding> e = new ArrayList();
    private Filter c = new write(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/DetailTundaTellerActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer {
        TextView c;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaTellerActivity_ViewBinding$write.class */
    final class write extends Filter {
        private write() {
        }

        /* synthetic */ write(DetailTundaTellerActivity_ViewBinding detailTundaTellerActivity_ViewBinding, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            DetailTundaTellerActivity_ViewBinding.this.a = "";
            if (charSequence != null) {
                DetailTundaTellerActivity_ViewBinding.this.a = charSequence.toString();
            }
            ArrayList arrayList = new ArrayList();
            if (DetailTundaTellerActivity_ViewBinding.this.d != null) {
                boolean z = DetailTundaTellerActivity_ViewBinding.this.a.length() < 5 && DetailTundaTellerActivity_ViewBinding.this.d.size() >= 5;
                for (int i = 0; i < DetailTundaTellerActivity_ViewBinding.this.d.size(); i++) {
                    if (DetailTundaTellerActivity_ViewBinding.this.d.get(i).d.toLowerCase().startsWith(DetailTundaTellerActivity_ViewBinding.this.a.toLowerCase())) {
                        ConfirmSubBCACardAdapter$ViewHolder_ViewBinding confirmSubBCACardAdapter$ViewHolder_ViewBinding = new ConfirmSubBCACardAdapter$ViewHolder_ViewBinding();
                        confirmSubBCACardAdapter$ViewHolder_ViewBinding.d = DetailTundaTellerActivity_ViewBinding.this.d.get(i).d;
                        confirmSubBCACardAdapter$ViewHolder_ViewBinding.c = DetailTundaTellerActivity_ViewBinding.this.d.get(i).c;
                        arrayList.add(confirmSubBCACardAdapter$ViewHolder_ViewBinding);
                    }
                    if (z && arrayList.size() >= 5) {
                        break;
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            DetailTundaTellerActivity_ViewBinding.this.e = (List) filterResults.values;
            if (filterResults.count > 0) {
                DetailTundaTellerActivity_ViewBinding.this.notifyDataSetChanged();
            } else {
                DetailTundaTellerActivity_ViewBinding.this.notifyDataSetInvalidated();
            }
        }
    }

    public DetailTundaTellerActivity_ViewBinding(Context context) {
        this.b = context;
    }

    public final void e(List<BeneficiaryBankResponse.BeneficiaryBank> list) {
        for (BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank : list) {
            ConfirmSubBCACardAdapter$ViewHolder_ViewBinding confirmSubBCACardAdapter$ViewHolder_ViewBinding = new ConfirmSubBCACardAdapter$ViewHolder_ViewBinding();
            confirmSubBCACardAdapter$ViewHolder_ViewBinding.c = beneficiaryBank.getBankId();
            confirmSubBCACardAdapter$ViewHolder_ViewBinding.d = beneficiaryBank.getBicCode();
            this.d.add(confirmSubBCACardAdapter$ViewHolder_ViewBinding);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        LayoutInflater from = LayoutInflater.from(this.b);
        if (view == null) {
            view = from.inflate(2131493314, viewGroup, false);
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer((byte) 0);
            remoteActionCompatParcelizer.c = (TextView) view.findViewById(2131296826);
            view.setTag(remoteActionCompatParcelizer);
        } else {
            remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getTag();
        }
        TextView textView = remoteActionCompatParcelizer.c;
        String str = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.e.get(i).d);
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.b.getResources().getColor(2131099813)), 0, length, 33);
        }
        textView.setText(spannableStringBuilder);
        return view;
    }
}
