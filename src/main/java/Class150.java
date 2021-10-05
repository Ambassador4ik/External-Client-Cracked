import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.server.SPacketChat;

public class Class150 extends Class171 {
    private static int 5772=14226;
    public String;
    public Class220;
    private static int 547=4043;
    private static int 94716=-26306;
    private static int 2849=29431;
    private static int 54067=-29532;
    private static int 53328=-27210;
    private static int 8441=17535;
    private static int 64302=-16431;

    static {
        boolean var10000 = true;
    }

    public Class150() {
        String var10006 = Class60. ("[n9nq;\\y2xt:f/");
        if (llllIIllIlll(94716, 8441)) {
            throw null;
        } else {
            super(var10006, 98, Class188.);
            if (llllIIllIlll(94716, 8441)) {
                throw null;
            } else {
                this. = "";
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Tt8wf:Zi3su;y~4(");
                if (llllIIllIlll(94716, 8441)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 218, this, true);
                    if (llllIIllIlll(94716, 8441)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llllIIllllII(int var0) {
        return var0 != 0;
    }

    private static boolean llllIIllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean llllIIllIlll(int var0, int var1) {
        return var0 >= var1;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llllIIllllII(var1 instanceof SPacketChat)) {
            SPacketChat var3;
            String var4;
            String var10000 = var4 = (var3 = (SPacketChat) var1).func_148915_c().func_150254_d();
            String var10001 = Class60. ("5oic{(");
            if (llllIIllIlll(54067, 5772)) {
                throw null;
            }

            label67:
            {
                if (llllIIllllIl(var10000.contains(var10001))) {
                    var10001 = Class60. ("<f`rtqqc/");
                    if (llllIIllIlll(54067, 5772)) {
                        throw null;
                    }

                    if (!llllIIllllII(var4.contains(var10001))) {
                        break label67;
                    }
                }

                if (llllIIllIlll(54067, 5772)) {
                    throw null;
                }

                if (llllIIllllII(this.. ()) &&llllIIllllIl(Class73..                                                                                                    .
                (this.)) &&llllIIllllIl(Class73..                                                                                                    .
                (var4))){
                return true;
            }

                if (llllIIllIlll(54067, 5772)) {
                    throw null;
                }

                CPacketChatMessage var10002 = new CPacketChatMessage;
                String var10004 = Class60. ("<f`rtqqc/");
                if (llllIIllIlll(54067, 5772)) {
                    throw null;
                }

                var10002.<init> (var10004);
                if (llllIIllIlll(54067, 5772)) {
                    throw null;
                }

                this. (var10002);
                Class103 var5 = this.;
                Class172 var7 = Class172.;
                String var8 = this. ();
                String var10003 = Class60. ("¼{L~s\u007fltanu\u007f7jxzr\u007fzz");
                if (llllIIllIlll(54067, 5772)) {
                    throw null;
                }

                var5. (var7, var8, var10003);
            }

            if (llllIIllIlll(54067, 5772)) {
                throw null;
            }

            this. = var3.func_148915_c().func_150254_d();
        }

        if (llllIIllIlll(54067, 5772)) {
            throw null;
        } else {
            boolean var6 = super. (var1, var2);
            if (llllIIllIlll(54067, 5772)) {
                throw null;
            } else {
                return var6;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
