import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class51 extends Class171 {
    public Class220;
    private static int 86952=-6954;
    private static int 4838=31812;
    private static int 9738=18485;
    private static int 61286=-14513;
    private static int 7849=28439;
    private static int 31761=-2709;
    private static int 98=9845;
    private static int 77000=-14099;

    static {
        boolean var10000 = true;
    }

    public Class51() {
        String var10001 = Class60. ("Tt_{r7");
        if (llIIllIllIII(86952, 98)) {
            throw null;
        } else {
            super(var10001, 86, Class188.);
            if (llIIllIllIII(86952, 98)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Vu|>");
                if (llIIllIllIII(86952, 98)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("Wzmhw#");
                    if (llIIllIllIII(86952, 98)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("^__in");
                        if (llIIllIllIII(86952, 98)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var1.<init> (var10003, 196, this, var10006);
                            if (llIIllIllIII(86952, 98)) {
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

    private static boolean llIIllIllIIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIIllIllIlI(int var0) {
        return var0 > 0;
    }

    private static boolean llIIllIllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIllIllIll(int var0) {
        return var0 < 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        String var2 = this.                                                                                  .();
        double var10000 = Class13. ();
        if (llIIllIllIII(31761, 9738)) {
            throw null;
        } else {
            boolean var3;
            double var5;
            if (llIIllIllIIl((var5 = var10000 - -1.0D) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1))) {
                String var10001 = Class60. ("^sda~j[\u007f?");
                if (llIIllIllIII(31761, 9738)) {
                    throw null;
                }

                float var6;
                float var7;
                if (llIIllIllIIl(var2.equals(var10001)) && llIIllIllIlI((var6 = this..field_71439_g.field_70143_R - 3.0F - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1)) &&
                llIIllIllIll((var7 = this..field_71439_g.field_70143_R - 256.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1))){
                    this.                                                                                                    .
                    field_71439_g.field_70181_x -= (double) this.                                                                                                    .
                    field_71439_g.field_70143_R;
                    this.                                                                                                    .
                    field_71439_g.field_70122_E = true;
                    var3 = true;
                    return;
                }

                if (llIIllIllIII(31761, 9738)) {
                    throw null;
                }

                var10001 = Class60. ("^__in");
                if (llIIllIllIII(31761, 9738)) {
                    throw null;
                }

                float var8;
                if (llIIllIllIIl(var2.equals(var10001)) && llIIllIllIlI((var8 = this..field_71439_g.field_70143_R - 3.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1)))
                {
                    CPacketPlayer var4 = new CPacketPlayer(true);
                    if (llIIllIllIII(31761, 9738)) {
                        throw null;
                    }

                    this. (var4);
                }
            }

            if (llIIllIllIII(31761, 9738)) {
                throw null;
            } else {
                var3 = true;
            }
        }
    }
}
