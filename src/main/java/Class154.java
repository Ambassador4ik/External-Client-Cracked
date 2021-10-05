import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class154 extends Class171 {
    private static int 67454=-3639;
    private static int 74655=-30896;
    private static int 49717=-31525;
    private static int 8130=-12193;
    private static int 3720=18740;
    private static int 8484=31052;
    private static int 8221=9487;
    private static int 78448=-8889;
    private static int 47043=-8305;
    private static int 9484=6221;
    private static int 32=25442;
    private static int 82145=-17572;
    private static int 72093=-9682;
    private static int 265=21470;
    private static int 1101=6068;
    private static int 4549=25301;
    public int;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class154() {
        String var10006 = Class60. ("Qd3d{E7\u007fw17");
        if (lllIIlIIlIll(49717, 3720)) {
            throw null;
        } else {
            super(var10006, 66, Class188.);
            if (lllIIlIIlIll(49717, 3720)) {
                throw null;
            } else {
                this. = -1;
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("I\u007f8oj:n5");
                if (lllIIlIIlIll(49717, 3720)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, this, false);
                    if (lllIIlIIlIll(49717, 3720)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. ((Class220[]) (new Class220[]{this.}));
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean lllIIlIlIlII(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean lllIIlIIllII(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean lllIIlIIlIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlIlIlIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIIlIIlllI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllIIlIlIIII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIIlIIllIl(Object var0) {
        return var0 != null;
    }

    private static boolean lllIIlIlIIll(Object var0) {
        return var0 == null;
    }

    private static boolean lllIIlIIllll(int var0) {
        return var0 > 0;
    }

    private static boolean lllIIlIlIIlI(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIlIlIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIlIlIllI(int var0, int var1) {
        return var0 == var1;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (lllIIlIIlIll(8130, 8221)) {
            throw null;
        } else {
            this. = -1;
            boolean var10000 = true;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Packet var1) {
        if (lllIIlIlIIII(((CPacketPlayerDigging) var1).func_180762_c(), Action.START_DESTROY_BLOCK) && lllIIlIlIIIl(this..field_71439_g.field_71075_bZ.field_75098_d))
        {
            return true;
        } else if (lllIIlIIlIll(67454, 9484)) {
            throw null;
        } else {
            return false;
        }
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        int var2 = -1;
        float var3 = 1.0F;

        int var4;
        boolean var9;
        for (int var10000 = var4 = 0; !lllIIlIIlIll(74655, 4549); var9 = true) {
            if (!lllIIlIIllII(var10000, 9)) {
                if (lllIIlIIlIll(74655, 4549)) {
                    throw null;
                }

                return var2;
            }

            ItemStack var5;
            if (lllIIlIIllIl(var5 = this..field_71439_g.field_71071_by.func_70301_a(var4)) &&
            lllIIlIIlllI(var5, ItemStack.field_190927_a)){
                var10000 = EnchantmentHelper.func_77506_a(Enchantments.field_185305_q, var5);
                if (lllIIlIIlIll(74655, 4549)) {
                    throw null;
                }

                float var6 = (float) var10000 * 0.1F;
                float var8 = var5.func_150997_a(this..field_71441_e.func_180495_p(var1));
                float var10;
                float var10001;
                if (lllIIlIIllll((var10 = var8 - 1.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1))) {
                    var10001 = var6;
                    boolean var10002 = true;
                } else {
                    if (lllIIlIIlIll(74655, 4549)) {
                        throw null;
                    }

                    var10001 = 0.0F;
                }

                if (lllIIlIIlIll(74655, 4549)) {
                    throw null;
                }

                float var7;
                float var11;
                if (lllIIlIIllll((var11 = (var7 = var8 + var10001) - var3) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1))) {
                    var3 = var7;
                    var2 = var4;
                }
            }

            if (lllIIlIIlIll(74655, 4549)) {
                throw null;
            }

            ++var4;
            var10000 = var4;
        }

        throw null;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lllIIlIlIIII(var2, Class170.) && lllIIlIlIIlI(var1 instanceof CPacketPlayerDigging)) {
            byte var10000 = this. ((Packet) var1);
            if (lllIIlIIlIll(72093, 265)) {
                throw null;
            }

            if (lllIIlIlIIlI(var10000)) {
                BlockPos var3;
                if (lllIIlIlIIll(var3 = ((CPacketPlayerDigging) var1).func_179715_a())) {
                    return true;
                }

                if (lllIIlIIlIll(72093, 265)) {
                    throw null;
                }

                int var5 = this. (var3);
                if (lllIIlIIlIll(72093, 265)) {
                    throw null;
                }

                int var4 = var5;
                if (!lllIIlIlIlII(var5, -1) || lllIIlIlIlIl(var4, 8)) {
                    if (lllIIlIIlIll(72093, 265)) {
                        throw null;
                    } else {
                        return true;
                    }
                }

                if (lllIIlIIlIll(72093, 265)) {
                    throw null;
                }

                if (lllIIlIlIIlI(this.. ()) &&
                lllIIlIlIllI(this., -1) && lllIIlIlIIlI(this..field_71474_y.field_74312_F.func_151470_d())){
                    this. = this.                                                                                                    .
                    field_71439_g.field_71071_by.field_70461_c;
                }

                if (lllIIlIIlIll(72093, 265)) {
                    throw null;
                }

                this.                                                                                                    .
                field_71439_g.field_71071_by.field_70461_c = var4;
                this.                                                                                                    .
                field_71442_b.func_78765_e();
            }
        }

        if (lllIIlIIlIll(72093, 265)) {
            throw null;
        } else {
            return true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (lllIIlIlIIlI(this.. ()) &&
        lllIIlIlIlII(this., -1) && lllIIlIlIIIl(this..field_71474_y.field_74312_F.func_151470_d())){
            this.                                                                                                    .
            field_71439_g.field_71071_by.field_70461_c = this.;
            this.                                                                                                    .
            field_71442_b.func_78765_e();
            this. = -1;
        }

        if (lllIIlIIlIll(78448, 8484)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
