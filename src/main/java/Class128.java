import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityShulkerBullet;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class128 extends Class171 {
    private static int 7631=19431;
    private static int 301=20083;
    private static int 62840=-25035;
    private static int 94669=-21202;
    private static int 6111=3623;
    public Class220;
    private static int 65882=-4313;
    private static int 18413=-8731;
    private static int 18701=-27879;
    public Class220;
    private static int 2020=10637;
    private static int 27607=-26434;
    private static int 9911=18068;
    private static int 621=370;
    private static int 6680=30437;
    private static int 8961=-25149;

    static {
        boolean var10000 = true;
    }

    public Class128() {
        String var10005 = Class60. ("Jd(\u007ff*@b#|i\u007f'kp+>");
        if (lllllIIllIll(18701, 9911)) {
            throw null;
        } else {
            super(var10005, 95, Class188.);
            if (lllllIIllIll(18701, 9911)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Tx3c`1v~8b>");
                if (lllllIIllIll(18701, 9911)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 206, this, 4.1D, 2.0D, 6.0D, false);
                    if (lllllIIllIll(18701, 9911)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("B~3du1cy8~5");
                        if (lllllIIllIll(18701, 9911)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 207, this, false);
                            if (lllllIIllIll(18701, 9911)) {
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

    private static boolean lllllIIllIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIIlllIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIIllllI(int var0) {
        return var0 < 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1) {
        this. (var1);
        if (lllllIIllIll(8961, 6111)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        this.                                                                                         .();
        if (lllllIIlllIl(this.. ())){
            float[] var10000 = Class13. (var1);
            if (lllllIIllIll(62840, 7631)) {
                throw null;
            }

            float[] var2 = var10000;
            Rotation var10003 = new Rotation(var2[0], var2[1], this..player.onGround);
            if (lllllIIllIll(62840, 7631)) {
                throw null;
            }

            this. ((Packet) var10003);
            this.                                                                                                    .
            player.setRotationYawHead(var2[0]);
            this.                                                                                                    .
            player.setRenderYawOffset(var2[0]);
        }

        if (lllllIIllIll(62840, 7631)) {
            throw null;
        } else {
            this.                                                                                                    .
            player.setSprinting(false);
            this.                                                                                                    .
            playerController.attackEntity(this..player, var1);
            this.                                                                                                    .
            player.swingArm(EnumHand.MAIN_HAND);
            this.                                                                                                    .
            player.resetCooldown();
            boolean var3 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        this.                                                                                                    .
        world.getLoadedEntityList().stream().filter(this::).forEach(this::);
        boolean var10000 = true;
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        double var2;
        if (lllllIIlllIl(var1 instanceof EntityShulkerBullet) && lllllIIllllI((var2 = (double) this..player.getDistance(var1) - this..
        ()) ==0.0D ? 0 : (var2 < 0.0D ? -1 : 1)) &&lllllIIlllIl(this.. (100))){
            return true;
        } else if (lllllIIllIll(27607, 301)) {
            throw null;
        } else {
            return false;
        }
    }
}
