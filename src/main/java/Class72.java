import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemShield;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import net.minecraft.util.EnumHand;

public class Class72 extends Class171 {
    public Class220;
    private static int 36333=-22199;
    private static int 1224=23791;
    public Runnable;
    private static int 51137=-7535;
    private static int 46913=-151;
    private static int 9116=27651;
    public CPacketAnimation;
    private static int 2079=30637;
    private static int 822=19733;
    private boolean;
    private static int 9842=4103;
    private static int 60404=-10349;
    private static int 28856=-26386;
    private static int 18640=-28255;
    public CPacketUseEntity;
    private static int 6056=3520;

    static {
        boolean var10000 = true;
    }

    public Class72() {
        String var10005 = Class60. ("D6|~3s|s[6nx+");
        if (lIIIIIIIIIIIl(46913, 6056)) {
            throw null;
        } else {
            super(var10005, 71, Class188.);
            if (lIIIIIIIIIIIl(46913, 6056)) {
                throw null;
            } else {
                this. = true;
                Class220 var10003 = new Class220;
                var10005 = Class60. ("^~9v\u007f\"");
                if (lIIIIIIIIIIIl(46913, 6056)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 172, this, 0.0D, 0.0D, 510.0D, true);
                    if (lIIIIIIIIIIIl(46913, 6056)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. = this::;
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean lIIIIIIIIIIll(int var0) {
        return var0 != 0;
    }

    private static boolean lIIIIIIIIIIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lIIIIIIIIIIlI(int var0) {
        return var0 == 0;
    }

    private static boolean lIIIIIIIIIlII(Object var0, Object var1) {
        return var0 == var1;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lIIIIIIIIIIll(this.) && lIIIIIIIIIIll(var1 instanceof CPacketUseEntity)) {
            CPacketUseEntity var3;
            Entity var4;
            if (lIIIIIIIIIIll((var4 = (var3 = (CPacketUseEntity) var1).getEntityFromWorld(this..world)) instanceof EntityPlayer) &&
            lIIIIIIIIIlII(var3.getAction(), Action.ATTACK)){
                byte var10000 = this. ((EntityPlayer) var4);
                if (lIIIIIIIIIIIl(60404, 2079)) {
                    throw null;
                }

                if (lIIIIIIIIIIll(var10000)) {
                    this. = (CPacketUseEntity) var1;
                    Thread var6 = new Thread;
                    Runnable var10002 = this.;
                    String var10003 = Class60. ("ya>");
                    if (lIIIIIIIIIIIl(60404, 2079)) {
                        throw null;
                    }

                    var6.<init> (var10002, var10003);
                    if (lIIIIIIIIIIIl(60404, 2079)) {
                        throw null;
                    }

                    var6.start();
                    return false;
                }
            }
        } else {
            if (lIIIIIIIIIIIl(60404, 2079)) {
                throw null;
            }

            if (lIIIIIIIIIIlI(this.)) {
                this. = true;
            }
        }

        if (lIIIIIIIIIIIl(60404, 2079)) {
            throw null;
        } else {
            boolean var5 = super. (var1, var2);
            if (lIIIIIIIIIIIl(60404, 2079)) {
                throw null;
            } else {
                return var5;
            }
        }
    }

    public protected private abstract final synchronized native void _??????????_??????????/* $FF was: _?????????? ??????????*/();

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var1) {
        byte var10000 = Class13. (var1, this.                                                                                                    .
        player, 90.0F);
        if (lIIIIIIIIIIIl(18640, 822)) {
            throw null;
        } else if (lIIIIIIIIIIlI(var10000)) {
            return false;
        } else if (lIIIIIIIIIIIl(18640, 822)) {
            throw null;
        } else if (lIIIIIIIIIIll(var1.isHandActive()) && lIIIIIIIIIIll(Class73..                                                                                                    .
        (var1.getName()))){
            return false;
        } else if (lIIIIIIIIIIIl(18640, 822)) {
            throw null;
        } else {
            EntityPlayer var3 = var1;
            EnumHand var2 = var1.getActiveHand();
            if (lIIIIIIIIIIll(var3.getHeldItemOffhand().getItem() instanceof ItemShield) && lIIIIIIIIIlII(var2, EnumHand.OFF_HAND)) {
                return true;
            } else if (lIIIIIIIIIIIl(18640, 822)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        int var1 = this.                                                                                                    .
        player.inventory.currentItem;
        InventoryPlayer var10010 = this.                                                                                                    .
        player.inventory;
        int var10011 = Class13. ();
        if (lIIIIIIIIIIIl(28856, 9842)) {
            throw null;
        } else {
            var10010.currentItem = var10011;
            this.                                                                                                    .
            playerController.updateController();
            this. ((long) this.. ());
            this. = false;
            this. (this.);
            this.                                                                                                    .
            player.swingArm(EnumHand.MAIN_HAND);
            this.                                                                                                    .
            player.resetCooldown();
            this.                                                                                                    .
            player.inventory.currentItem = var1;
            this.                                                                                                    .
            playerController.updateController();
            boolean var10000 = true;
        }
    }
}
