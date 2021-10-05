public class Class60 {
    private static int 36577=-23871;
    private static int 7648=1883;
    private static int 7382=30340;
    private static int 56980=-16443;
    private static int 3181=8942;
    private static int 94502=-3715;
    private static int 53515=-12713;
    private static int 4941=9349;

    static {
        boolean var10000 = true;
    }

    private static boolean lllIlIlllIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIlllIll(int var0) {
        return var0 < 0;
    }

    public static String ____________________________________________________________________________/* $FF was:                                                                             */(String var0) {
        String var10000 = new String;
        char[] var10002 = new char[var0.length()];
        int var10004 = 5 << 4 ^ 2 << 2 ^ 3;
        int var3;
        int var6 = var3 = var10002.length - 1;
        char[] var1 = var10002;
        int var2 = var10004;

        while (true) {
            if (lllIlIlllIIl(94502, 3181)) {
                throw null;
            }

            if (!lllIlIlllIlI(var6)) {
                break;
            }

            char var4 = (char) (var0.charAt(var3) ^ var2);
            char var5 = (char) ((char) (var3 ^ var2) & 63);
            var1[var3] = var4;
            --var3;
            if (!lllIlIlllIlI(var3)) {
                break;
            }

            var4 = (char) (var0.charAt(var3) ^ var5);
            var2 = (char) ((char) (var3 ^ var5) & 63);
            var1[var3] = var4;
            --var3;
            var6 = var3;
            boolean var8 = true;
        }

        if (lllIlIlllIIl(94502, 3181)) {
            throw null;
        } else {
            var10000.<init> (var1);
            if (lllIlIlllIIl(94502, 3181)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    public static String ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var0) {
        RuntimeException var10004 = new RuntimeException();
        if (lllIlIlllIIl(53515, 7382)) {
            throw null;
        } else {
            StackTraceElement var10003 = var10004.getStackTrace()[1];
            StringBuffer var11 = new StringBuffer();
            if (lllIlIlllIIl(53515, 7382)) {
                throw null;
            } else {
                String var12 = var11.append(var10003.getClassName()).append(var10003.getMethodName()).toString();
                int var3;
                int var9 = var3 = var12.length() - 1;
                String var2 = var12;
                int var4 = var9;
                int var10001 = var0.length();
                char[] var5 = new char[var10001];
                int var6 = 5 << 4 ^ 2 << 2 ^ 3;
                int var7 = var10001 - 1;

                for (boolean var10000 = true; !lllIlIlllIIl(53515, 7382); --var7) {
                    if (lllIlIlllIll(var7)) {
                        String var10002 = new String(var5);
                        if (lllIlIlllIIl(53515, 7382)) {
                            throw null;
                        }

                        return var10002;
                    }

                    if (lllIlIlllIIl(53515, 7382)) {
                        throw null;
                    }

                    char var10005 = var2.charAt(var4);
                    var5[var7] = (char) (var10005 ^ var0.charAt(var7) ^ var6);
                    var6 = (char) (63 & (var6 ^ var7 ^ var10005));
                    --var4;
                    if (lllIlIlllIll(var4)) {
                        var4 = var3;
                    }

                    if (lllIlIlllIIl(53515, 7382)) {
                        throw null;
                    }
                }

                throw null;
            }
        }
    }

    private static boolean lllIlIlllIlI(int var0) {
        return var0 >= 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
