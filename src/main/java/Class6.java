import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class6 extends Class171 {
    private static int 8947=9879;
    public Class220;
    private static int 24256=-26966;
    private static int 83869=-17916;
    private static int 79114=-27788;
    public Class220;
    private static int 92039=-21296;
    private static int 8975=1775;
    private static int 7564=21708;
    private static int 37105=-7230;
    private static int 2143=8828;
    private static int 8017=4117;
    private static int 14407=-27793;
    private static int 9939=3893;

    static {
        boolean var10000 = true;
    }

    public Class6() {
        String var10005 = Class60. ("Uu8Kj:o3");
        if (llIIlIIllllI(79114, 7564)) {
            throw null;
        } else {
            super(var10005, 6, Class188.);
            if (llIIlIIllllI(79114, 7564)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("^t8ov:h\"");
                if (llIIlIIllllI(79114, 7564)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 9999, this, true);
                    if (llIIlIIllllI(79114, 7564)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("^q?s{=0");
                        if (llIIlIIllllI(79114, 7564)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 9999, this, true);
                            if (llIIlIIllllI(79114, 7564)) {
                                throw null;
                            } else {
                                this. = var10003;
                                this. ((Class220[]) (new Class220[]{this.}));
                                this. ((Class220[]) (new Class220[]{this.}));
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlIIllllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIIlIIIlIl(int var0) {
        return var0 != 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        this.                                                                                                    .
        player.entityCollisionReduction = 0.0F;
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        if (llIIIlIIIlIl(this.. ())){
            this.                                                                                                    .
            player.entityCollisionReduction = 1.0F;
        }

        if (llIIlIIllllI(92039, 8975)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        var1.setCanceled(this.. ());
        boolean var10000 = true;
    }
}
