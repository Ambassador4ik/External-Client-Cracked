import net.minecraft.item.ItemShield;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class86 extends Class171 {
    private static int 8575=11537;
    public boolean;
    private static int 6443=30461;
    private static int 87270=-26244;
    public Class220;
    private static int 4096=4452;
    private static int 23992=-31435;
    private static int 42249=-10869;
    private static int 5821=24946;
    private static int 22730=-12823;

    static {
        boolean var10000 = true;
    }

    public Class86() {
        String var10006 = Class60. ("Hr8rz:p\u007fR:dov:w0");
        if (lllllIllIllI(23992, 5821)) {
            throw null;
        } else {
            super(var10006, 55, Class188.);
            if (lllllIllIllI(23992, 5821)) {
                throw null;
            } else {
                this. = false;
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Fp7gu5gGt5vq8y?");
                if (lllllIllIllI(23992, 5821)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 139, this, true);
                    if (lllllIllIllI(23992, 5821)) {
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

    private static boolean lllllIllIllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIlllIll(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIllllII(int var0) {
        return var0 == 0;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000;
        if (lllllIlllIll(this..field_71439_g.func_184592_cb().func_77973_b() instanceof ItemShield) &&
        lllllIlllIll(this..field_71439_g.func_184587_cr()) &&
        lllllIlllIll(this..field_71474_y.field_74312_F.func_151470_d()) &&lllllIlllIll(this.)){
            if (lllllIlllIll(this.. ())){
                CPacketPlayerDigging var10002 = new CPacketPlayerDigging;
                Action var10004 = Action.RELEASE_USE_ITEM;
                BlockPos var10005 = new BlockPos(-1, -1, -1);
                if (lllllIllIllI(87270, 8575)) {
                    throw null;
                }

                var10002.<init> (var10004, var10005, EnumFacing.DOWN);
                if (lllllIllIllI(87270, 8575)) {
                    throw null;
                }

                this. (var10002);
                this.                                                                                                    .
                field_71439_g.func_184602_cy();
            }

            if (lllllIllIllI(87270, 8575)) {
                throw null;
            } else {
                Class22. ();
                if (lllllIllIllI(87270, 8575)) {
                    throw null;
                } else {
                    this. = false;
                    var10000 = true;
                }
            }
        } else if (lllllIllIllI(87270, 8575)) {
            throw null;
        } else {
            if (lllllIllllII(this..field_71474_y.field_74312_F.func_151470_d())){
                this. = true;
            }

            if (lllllIllIllI(87270, 8575)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
