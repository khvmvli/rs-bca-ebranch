package o;

import java.util.Map;
import java.util.Set;
/* loaded from: classes2-dex2jar.jar:o/setVerified.class */
public final class setVerified extends realmSet$isMember {
    private Long a;
    private Long b;
    private Map<Integer, setMember> c;
    private Set<Integer> d;
    private String e;

    public setVerified(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
    }

    private final setMember a(Integer num) {
        if (this.c.containsKey(num)) {
            return this.c.get(num);
        }
        setMember setmember = new setMember(this, this.e, null);
        this.c.put(num, setmember);
        return setmember;
    }

    private final boolean c(int i, int i2) {
        setMember setmember = this.c.get(Integer.valueOf(i));
        if (setmember == null) {
            return false;
        }
        return setmember.c.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(2:17|(8:505|19|535|20|21|506|22|(24:(12:24|25|26|27|521|28|29|30|(1:32)(7:33|34|35|36|(6:38|39|40|41|42|43)|44|45)|49|50|51)|543|53|(1:55)|516|81|537|82|83|515|84|(5:86|87|88|(1:90)|91)(9:92|93|94|95|96|(13:97|98|99|100|101|513|102|103|104|112|113|114|(1:544)(1:120))|116|(1:118)|119)|138|(1:140)(4:142|(3:144|(8:527|146|539|147|148|528|149|(8:(12:151|152|153|154|155|156|(6:158|159|160|161|162|163)|164|165|166|167|168)|545|170|171|(2:173|191)|192|(4:195|(2:216|554)(3:550|199|(9:546|201|(4:204|(2:206|556)(1:557)|207|202)|555|208|(4:211|(2:213|559)(1:560)|214|209)|558|215|553)(1:552))|551|193)|548)(7:174|175|176|(2:178|191)|192|(1:193)|548))|217)(1:224)|225|(2:226|(9:228|(3:232|(4:235|(5:569|237|(1:239)(1:240)|241|572)(1:571)|570|233)|568)|242|(2:244|(1:246)(2:247|(2:248|(3:250|(3:575|254|579)|576)(1:573))))(0)|255|(2:257|(2:258|(5:260|(2:262|(3:264|582|266))|265|581|266)(1:580)))(0)|267|(3:277|(8:280|(1:282)|283|(1:285)|286|(3:583|288|586)(1:585)|584|278)|566)|289)(1:561)))|141|290|(1:292)(2:293|(2:294|(3:296|(8:587|298|(1:300)(1:301)|302|(8:304|531|305|306|519|307|(5:(17:309|310|311|312|523|313|314|315|316|317|318|(7:320|509|321|322|323|324|325)|326|327|331|332|333)|592|335|(1:337)|338)(4:343|344|345|(2:347|359))|360)|368|(4:371|(3:595|373|597)(5:593|374|(2:375|(2:377|(1:379)(2:601|380))(1:600))|381|(3:594|383|599)(1:598))|596|369)|591)(1:590)|589)(1:588)))|384|(3:386|(6:389|(8:391|533|392|393|511|394|(5:(16:396|397|398|399|529|400|401|402|403|404|(6:406|407|408|409|410|411)|412|413|417|418|419)|607|421|(1:423)|424)(4:425|426|427|(2:429|442))|443)|450|(2:451|(2:453|(3:602|455|606)(8:456|(2:457|(4:459|(3:461|(1:463)(1:464)|465)|466|(1:1)(2:470|(1:472)(2:615|473)))(1:614))|474|(1:476)(1:477)|478|481|613|611))(0))|604|387)|603)|482|(10:485|503|486|487|507|488|618|(3:616|490|621)(1:620)|619|483)|617|494|495)(4:56|57|58|(2:60|73))))|516|81|537|82|83|515|84|(0)(0)|138|(0)(0)|141|290|(0)(0)|384|(0)|482|(1:483)|617|494|495|(2:(0)|(1:526))) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:2|(2:3|(2:5|(2:542|7))(2:541|8))|9|(3:11|517|12)|15|(2:17|(8:505|19|535|20|21|506|22|(24:(12:24|25|26|27|521|28|29|30|(1:32)(7:33|34|35|36|(6:38|39|40|41|42|43)|44|45)|49|50|51)|543|53|(1:55)|516|81|537|82|83|515|84|(5:86|87|88|(1:90)|91)(9:92|93|94|95|96|(13:97|98|99|100|101|513|102|103|104|112|113|114|(1:544)(1:120))|116|(1:118)|119)|138|(1:140)(4:142|(3:144|(8:527|146|539|147|148|528|149|(8:(12:151|152|153|154|155|156|(6:158|159|160|161|162|163)|164|165|166|167|168)|545|170|171|(2:173|191)|192|(4:195|(2:216|554)(3:550|199|(9:546|201|(4:204|(2:206|556)(1:557)|207|202)|555|208|(4:211|(2:213|559)(1:560)|214|209)|558|215|553)(1:552))|551|193)|548)(7:174|175|176|(2:178|191)|192|(1:193)|548))|217)(1:224)|225|(2:226|(9:228|(3:232|(4:235|(5:569|237|(1:239)(1:240)|241|572)(1:571)|570|233)|568)|242|(2:244|(1:246)(2:247|(2:248|(3:250|(3:575|254|579)|576)(1:573))))(0)|255|(2:257|(2:258|(5:260|(2:262|(3:264|582|266))|265|581|266)(1:580)))(0)|267|(3:277|(8:280|(1:282)|283|(1:285)|286|(3:583|288|586)(1:585)|584|278)|566)|289)(1:561)))|141|290|(1:292)(2:293|(2:294|(3:296|(8:587|298|(1:300)(1:301)|302|(8:304|531|305|306|519|307|(5:(17:309|310|311|312|523|313|314|315|316|317|318|(7:320|509|321|322|323|324|325)|326|327|331|332|333)|592|335|(1:337)|338)(4:343|344|345|(2:347|359))|360)|368|(4:371|(3:595|373|597)(5:593|374|(2:375|(2:377|(1:379)(2:601|380))(1:600))|381|(3:594|383|599)(1:598))|596|369)|591)(1:590)|589)(1:588)))|384|(3:386|(6:389|(8:391|533|392|393|511|394|(5:(16:396|397|398|399|529|400|401|402|403|404|(6:406|407|408|409|410|411)|412|413|417|418|419)|607|421|(1:423)|424)(4:425|426|427|(2:429|442))|443)|450|(2:451|(2:453|(3:602|455|606)(8:456|(2:457|(4:459|(3:461|(1:463)(1:464)|465)|466|(1:1)(2:470|(1:472)(2:615|473)))(1:614))|474|(1:476)(1:477)|478|481|613|611))(0))|604|387)|603)|482|(10:485|503|486|487|507|488|618|(3:616|490|621)(1:620)|619|483)|617|494|495)(4:56|57|58|(2:60|73))))|80|516|81|537|82|83|515|84|(0)(0)|138|(0)(0)|141|290|(0)(0)|384|(0)|482|(1:483)|617|494|495|(2:(0)|(1:526))) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x045a, code lost:
        r33 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0467, code lost:
        r34 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0468, code lost:
        r23 = "audience_id";
        r20 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0473, code lost:
        r20 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0477, code lost:
        r34 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0479, code lost:
        r23 = "audience_id";
        r20 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0483, code lost:
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0488, code lost:
        r33 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x120a, code lost:
        if (r28 != false) goto L_0x1089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x1339, code lost:
        if (r21 != 0) goto L_0x133c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x133c, code lost:
        r21.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x1343, code lost:
        throw r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x124c  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x04d7 A[EDGE_INSN: B:561:0x04d7->B:141:0x04d7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0338  */
    /* JADX WARN: Type inference failed for: r0v498, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v664, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v968, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r20v77 */
    /* JADX WARN: Type inference failed for: r20v78, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r20v85 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r21v46 */
    /* JADX WARN: Type inference failed for: r21v50 */
    /* JADX WARN: Type inference failed for: r24v80, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.String[]] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.util.List<o.realmGet.referenceBranchCode> c(java.lang.String r20, java.util.List<o.realmGet.selectedCardOptions> r21, java.util.List<o.realmSet.currOfficeCity> r22, java.lang.Long r23, java.lang.Long r24) {
        /*
        // Method dump skipped, instructions count: 4932
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVerified.c(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        return false;
    }
}
