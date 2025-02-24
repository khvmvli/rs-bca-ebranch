package o;
/* loaded from: classes2-dex2jar.jar:o/provideIfDesired.class */
final class provideIfDesired {
    provideIfDesired() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str) throws IllegalArgumentException {
        if (str != null) {
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                boolean z = true;
                if (!Character.isJavaIdentifierPart(charAt)) {
                    z = true;
                    if (charAt != ' ') {
                        z = true;
                        if (charAt != '?') {
                            z = true;
                            if (charAt != '@') {
                                z = false;
                            }
                        }
                    }
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer("illegal option value '");
                    stringBuffer.append(charAt);
                    stringBuffer.append("'");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                return;
            }
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (!Character.isJavaIdentifierPart(charArray[i])) {
                    StringBuffer stringBuffer2 = new StringBuffer("opt contains illegal character value '");
                    stringBuffer2.append(charArray[i]);
                    stringBuffer2.append("'");
                    throw new IllegalArgumentException(stringBuffer2.toString());
                }
            }
        }
    }
}
