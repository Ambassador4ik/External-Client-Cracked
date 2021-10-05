import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class31 extends Class171 {
    private static int 30039=-17626;
    private static int 49347=-24074;
    private static int 2664=21441;
    private static int 72189=-2326;
    private static int 9923=14391;
    private static int 11=14527;
    private static int 2129=18782;
    private static int 84843=-22618;

    static {
        boolean var10000 = true;
    }

    public Class31() {
        String var10001 = Class60. ("[u9nw;\\\\2\u0010");
        if (llIlIllIIIll(84843, 9923)) {
            throw null;
        } else {
            super(var10001, 90, Class188.);
            if (llIlIllIIIll(84843, 9923)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIlIllIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIllIIlIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIlIllIIlII(int var0) {
        return var0 != 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        if (llIlIllIIlII(this..field_71439_g.func_70089_S())){
            EntityPlayerSP var10000;
            if (llIlIllIIlII(this.. (4000))){
                var10000 = this.                                                                                                    .
                field_71439_g;
                float var10001 = var10000.field_70177_z;
                float var10002 = Class109. (0.6F);
                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                var10000.field_70177_z = var10001 + var10002;
            }

            if (llIlIllIIIll(72189, 11)) {
                throw null;
            }

            if (llIlIllIIlII(this.. (5000))){
                double var5 = Class13. ();
                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                double var2 = var5;
                float var4 = 0.1F;
                EntityPlayerSP var8 = this.                                                                                                    .
                field_71439_g;
                double var10 = Math.sin(var2);
                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                var8.field_70159_w = -var10 * (double) var4;
                var10000 = this.                                                                                                    .
                field_71439_g;
                double var9 = Math.cos(var2);
                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                var10000.field_70179_y = var9 * (double) var4;
            }

            if (llIlIllIIIll(72189, 11)) {
                throw null;
            }

            if (llIlIllIIlII(this.. (6000))){
                int var6 = (0, 1);
                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                if (llIlIllIIlIl(var6, 1)) {
                    this. (10L);
                    this.                                                                                                    .
                    field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                }

                if (llIlIllIIIll(72189, 11)) {
                    throw null;
                }

                this.                                                                                         .();
            }
        }

        if (llIlIllIIIll(72189, 11)) {
            throw null;
        } else {
            boolean var7 = true;
        }
    }
}
