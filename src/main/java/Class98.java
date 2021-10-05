import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;

public class Class98 extends Class171 {
    private static int 9319=5860;
    public Class220;
    private static int 43451=-12281;
    private static int 1534=20140;
    private static int 8005=15018;
    private static int 2882=12794;
    private static int 67474=-5331;
    private static int 37360=-30322;
    private static int 33907=-29559;

    static {
        boolean var10000 = true;
    }

    public Class98() {
        String var10001 = Class60. ("Rr?K8x9");
        if (llllIIIIIIll(37360, 9319)) {
            throw null;
        } else {
            super(var10001, 44, Class188.);
            if (llllIIIIIIll(37360, 9319)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Rq<{>");
                if (llllIIIIIIll(37360, 9319)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("VZ\u000b");
                    if (llllIIIIIIll(37360, 9319)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Wzmhw#");
                        if (llllIIIIIIll(37360, 9319)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var1.<init> (var10003, 123, this, var10006);
                            if (llllIIIIIIll(37360, 9319)) {
                                throw null;
                            } else {
                                this. = var1;
                                this. (new Class220[]{this.});
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llllIIIIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIIIIlII(int var0) {
        return var0 != 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        this.                                                                                                    .
        field_71439_g.field_70143_R = 0.0F;
        byte var10000 = Class22. ();
        if (llllIIIIIIll(33907, 1534)) {
            throw null;
        } else {
            if (llllIIIIIlII(var10000)) {
                Class22. (false);
                if (llllIIIIIIll(33907, 1534)) {
                    throw null;
                }

                EntityPlayerSP var10001 = this.                                                                                                    .
                field_71439_g;
                var10001.field_70181_x *= 0.05000000074505806D;
                String var2 = this.                                                                                  .
                ();
                String var4 = Class60. ("VZ\u000b");
                if (llllIIIIIIll(33907, 1534)) {
                    throw null;
                }

                if (llllIIIIIlII(var2.equals(var4))) {
                    this.                                                                                                    .
                    field_71439_g.field_71158_b.field_78902_a *= 0.25F;
                    this.                                                                                                    .
                    field_71439_g.field_71158_b.field_192832_b *= 0.25F;
                }
            }

            if (llllIIIIIIll(33907, 1534)) {
                throw null;
            } else {
                boolean var3 = true;
            }
        }
    }
}
