import net.minecraft.network.play.client.CPacketConfirmTransaction;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class67 extends Class171 {
    private static int 46032=-5455;
    public Class220;
    private static int 3799=28916;
    private static int 36677=-9822;
    private static int 6815=7872;
    private static int 53837=-6052;
    private static int 75256=-22609;
    private static int 3850=6109;
    private static int 6743=6114;

    static {
        boolean var10000 = true;
    }

    public Class67() {
        String var10004 = Class60. ("Xx3w|1]e8|+");
        if (llIIIllIlllI(36677, 6743)) {
            throw null;
        } else {
            super(var10004, 123, Class188.);
            if (llIIIllIlllI(36677, 6743)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("S\u007f8rx:t/");
                if (llIIIllIlllI(36677, 6743)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, this, 12.0D, 1.0D, 30.0D, true);
                    if (llIIIllIlllI(36677, 6743)) {
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

    private static boolean llIIIllIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIIlllIIII(int var0, int var1) {
        return var0 <= var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(LivingJumpEvent var1) {
        int var4;
        boolean var7;
        for (int var10000 = var4 = 0; !llIIIllIlllI(46032, 3799); var7 = true) {
            if (!llIIIlllIIII(var10000, this.. ())){
                if (llIIIllIlllI(46032, 3799)) {
                    throw null;
                }

                boolean var6 = true;
                return;
            }

            double var2 = 0.41999998688698D;
            double[] var5 = new double[]{this..player.posX, this.                                                                                                    .
            player.posY + var2, this.                                                                                                    .
            player.posZ};
            Position var10003 = new Position(var5[0], var5[1], var5[2], false);
            if (llIIIllIlllI(46032, 3799)) {
                throw null;
            }

            this. (var10003);
            this.                                                                                                    .
            player.setPosition(var5[0], var5[1], var5[2]);
            ++var4;
            CPacketConfirmTransaction var10001 = new CPacketConfirmTransaction();
            if (llIIIllIlllI(46032, 3799)) {
                throw null;
            }

            this. (var10001);
            var10000 = var4;
        }

        throw null;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
