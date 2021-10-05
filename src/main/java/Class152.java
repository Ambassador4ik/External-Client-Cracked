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
        if (llllIIllIIII(this..field_71439_g.field_71071_by.func_70448_g().func_77973_b() instanceof ItemBow) &&
        llllIIllIIII(this..field_71474_y.field_74312_F.func_151470_d()) &&
        llllIIllIIlI((var1 = (double) this..field_71439_g.func_184612_cw() - this.. ()) ==
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
                field_71439_g.field_71174_a;
                CPacketPlayerDigging var10004 = new CPacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.field_177992_a, this..field_71439_g.func_174811_aO())
                ;
                if (llllIIlIlllI(35439, 7847)) {
                    throw null;
                }

                var10003.func_147297_a(var10004);
                NetHandlerPlayClient var10002 = this.                                                                                                    .
                field_71439_g.field_71174_a;
                CPacketPlayerTryUseItem var3 = new CPacketPlayerTryUseItem(this..field_71439_g.func_184600_cs());
                if (llllIIlIlllI(35439, 7847)) {
                    throw null;
                }

                var10002.func_147297_a(var3);
                this.                                                                                                    .
                field_71439_g.func_184597_cx();
                this.                                                                                                    .
                field_71439_g.field_71071_by.func_70448_g().func_77973_b().func_77659_a(this..field_71441_e, this.                                                                                                    .
                field_71439_g, EnumHand.MAIN_HAND);
            }

            if (llllIIlIlllI(35439, 7847)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }
}
