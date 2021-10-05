import net.minecraft.network.play.client.CPacketPlayer.PositionRotation;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class209 extends Class171 {
    private static int 6523=16863;
    private static int 6696=4910;
    private static int 6012=9823;
    private static int 1686=24846;
    private static int 71701=-150;
    private static int 95651=-8972;
    public Class220;
    private static int 43141=-29967;
    private static int 83016=-157;

    static {
        boolean var10000 = true;
    }

    public Class209() {
        String var10004 = Class60. ("]tmVmp+");
        if (llllIlIllllI(95651, 1686)) {
            throw null;
        } else {
            super(var10004, 105, Class188.);
            if (llllIlIllllI(95651, 1686)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Xx4{j6Gv?zp7(");
                if (llllIlIllllI(95651, 1686)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 229, this, true);
                    if (llllIlIllllI(95651, 1686)) {
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

    private static boolean llllIlIllllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIlIlllII(int var0) {
        return var0 != 0;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        if (llllIlIlllII(this..field_71474_y.field_74314_A.func_151468_f()) &&(!llllIlIlllII(this.. ()) ||
        llllIlIlllII(this..field_71439_g.field_70123_F))){
            if (llllIlIllllI(83016, 6523)) {
                throw null;
            }

            double var2 = 0.413213D;
            double[] var5 = new double[]{this..field_71439_g.field_70165_t, this.                                                                                                    .
            field_71439_g.field_70163_u + var2, this.                                                                                                    .
            field_71439_g.field_70161_v};
            float[] var4 = new float[]{this..field_71439_g.field_70177_z, this.                                                                                                    .
            field_71439_g.field_70125_A};
            this.                                                                                                    .
            field_71439_g.field_70181_x = var2;
            PositionRotation var10002 = new PositionRotation(var5[0], var5[1], var5[2], var4[0], var4[1], true);
            if (llllIlIllllI(83016, 6523)) {
                throw null;
            }

            this. (var10002);
            this.                                                                                                    .
            field_71439_g.func_180426_a(var5[0], var5[1], var5[2], var4[0], var4[1], 1, true);
        }

        if (llllIlIllllI(83016, 6523)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
