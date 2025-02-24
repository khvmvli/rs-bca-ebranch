package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$incomeAmount.class */
final class realmSet$incomeAmount {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(setCurrOfficePostCode setcurrofficepostcode) {
        StringBuilder sb = new StringBuilder(setcurrofficepostcode.b());
        for (int i = 0; i < setcurrofficepostcode.b(); i++) {
            byte d = setcurrofficepostcode.d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (d < 32 || d > 126) {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        } else {
                            sb.append((char) d);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
