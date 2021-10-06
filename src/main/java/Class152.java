import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class152 extends Class171 {
    private static int 97600=-24383;
    public Class220;
    private static int 5229=19524;
    private static int 8703=15909;
    private static int 7847=23132;
    private static int 35439=-32617;
    private static int 5163=17772;
    private static int 76792=-1806;
    private static int 82816=-14795;
    private static int 48432=-23312;
    private static int 8401=30612;
    private static int 30722=-23262;
    private static int 5188=4733;

    static {
        boolean var10000 = true;
    }

    public Class152() {
        String var10004 = Class60. ("Us0`c2V|,");
        if (llllIIlIlllI(48432, 8401)) {
            throw null;
        } else {
            super(var10004, 24, Class188.);
            if (llllIIlIlllI(48432, 8401)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Ytl:p/");
                if (llllIIlIlllI(48432, 8401)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 59, this, 3.1D, 3.0D, 6.0D, false);
                    if (llllIIlIlllI(48432, 8401)) {
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

    private static boolean llllIIllIIlI(int var0) {
        return var0 >= 0;
    }

    private static boolean llllIIlIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIllIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llllIIllIIII(int var0) {
        return var0 != 0;
    }

    private boolean __________________________________________________________________________________/* $FF was:                                                                                   */() {
        double var1;
        if (llllIIllIIII(this..player.inventory.getCurrentItem().getItem() instanceof ItemBow) &&
        llllIIllIIII(this..gameSettings.keyBindAttack.isKeyDown()) &&
        llllIIllIIlI((var1 = (double) this..player.getItemInUseMaxCount() - this.. ()) ==
        0.0D ? 0 : (var1 < 0.0D ? -1 : 1))){
            return true;
        } else if (llllIIlIlllI(30722, 5188)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llllIIllIIII(var1 instanceof CPacketPlayerTryUseItemOnBlock)) {
            byte var10000 = this. ();
            if (llllIIlIlllI(97600, 5229)) {
                throw null;
            }

            if (!llllIIllIIIl(var10000)) {
                if (llllIIlIlllI(97600, 5229)) {
                    throw null;
                }

                return false;
            }
        }

        if (llllIIlIlllI(97600, 5229)) {
            throw null;
        } else {
            return true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        byte var10000 = this. ();
        if (llllIIlIlllI(35439, 7847)) {
            throw null;
        } else {
            if (llllIIllIIII(var10000)) {
                NetHandlerPlayClient var10003 = this.                                                                                                    .
                player.connection;
                CPacketPlayerDigging var10004 = new CPacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, this..player.getHorizontalFacing())
                ;
                if (llllIIlIlllI(35439, 7847)) {
                    throw null;
                }

                var10003.sendPacket(var10004);
                NetHandlerPlayClient var10002 = this.                                                                                                    .
                player.connection;
                CPacketPlayerTryUseItem var3 = new CPacketPlayerTryUseItem(this..player.getActiveHand());
                if (llllIIlIlllI(35439, 7847)) {
                    throw null;
                }

                var10002.sendPacket(var3);
                this.                                                                                                    .
                player.stopActiveHand();
                this.                                                                                                    .
                player.inventory.getCurrentItem().getItem().onItemRightClick(this..world, this.                                                                                                    .
                player, EnumHand.MAIN_HAND);
            }

            if (llllIIlIlllI(35439, 7847)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }
}
