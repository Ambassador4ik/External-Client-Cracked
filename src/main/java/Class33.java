import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemFood;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class33 extends Class171 {
    private static int 33665=-32058;
    private static int 87651=-1116;
    public Class220;
    private static int 70346=-32105;
    private static int 5780=20636;
    private static int 3876=28571;
    private static int 60459=-24606;
    private static int 65476=-31121;
    private static int 2726=3597;
    private static int 381=25785;
    private static int 1697=6605;
    private static int 4022=8253;
    private boolean;
    private int;
    private static int 68012=-69;
    private static int 55025=-19568;
    private static int 7926=2882;

    static {
        boolean var10000 = true;
    }

    public Class33() {
        String var10008 = Class60. ("Rgd3xWu3/");
        if (lllIIlIlIlll(68012, 381)) {
            throw null;
        } else {
            super(var10008, 56, Class188.);
            if (lllIIlIlIlll(68012, 381)) {
                throw null;
            } else {
                this. = false;
                this. = -1;
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("V~|0p]r0nt7");
                if (lllIIlIlIlll(68012, 381)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 140, this, 16.0D, 0.0D, 20.0D, true);
                    if (lllIIlIlIlll(68012, 381)) {
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

    private static boolean lllIIlIllIIl(int var0) {
        return var0 < 0;
    }

    private static boolean lllIIlIlllll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIIlIllIII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIlIlllII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIIlIlIlll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlIllIlI(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean lllIIlIllIll(int var0) {
        return var0 == 0;
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        if (lllIIlIllIII(this..field_71439_g.func_184592_cb().func_77973_b() instanceof ItemFood)){
            return 40;
        } else if (lllIIlIlIlll(87651, 2726)) {
            throw null;
        } else {
            int var1;
            boolean var10001;
            for (int var10000 = var1 = 0; !lllIIlIlIlll(87651, 2726); var10001 = true) {
                if (!lllIIlIlllII(var10000, 9)) {
                    if (lllIIlIlIlll(87651, 2726)) {
                        throw null;
                    }

                    return -1;
                }

                if (lllIIlIllIII(this..field_71439_g.field_71071_by.func_70301_a(var1).func_77973_b() instanceof ItemFood))
                {
                    return var1;
                }

                if (lllIIlIlIlll(87651, 2726)) {
                    throw null;
                }

                ++var1;
                var10000 = var1;
            }

            throw null;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000;
        if (lllIIlIllIII(this..field_71439_g.func_184812_l_())){
            var10000 = true;
        } else if (lllIIlIlIlll(70346, 4022)) {
            throw null;
        } else {
            int var2 = this. ();
            double var3;
            if (lllIIlIllIIl((var3 = (double) this..field_71439_g.func_71024_bL().func_75116_a() - this.. ()) ==
            0.0D ? 0 : (var3 < 0.0D ? -1 : 1)) &&lllIIlIllIlI(var2, -1)){
                if (lllIIlIllIll(this.)) {
                    this. = this.                                                                                                    .
                    field_71439_g.field_71071_by.field_70461_c;
                }

                if (lllIIlIlIlll(70346, 4022)) {
                    throw null;
                } else {
                    this. = true;
                    if (lllIIlIlllII(var2, 9) && lllIIlIllIlI(this..field_71439_g.field_71071_by.field_70461_c,var2)){
                        this.                                                                                                    .
                        field_71439_g.field_71071_by.field_70461_c = var2;
                        this.                                                                                                    .
                        field_71442_b.func_78765_e();
                    }

                    if (lllIIlIlIlll(70346, 4022)) {
                        throw null;
                    } else {
                        KeyBinding.func_74510_a(this..field_71474_y.field_74313_G.func_151463_i(), true);
                        if (lllIIlIlIlll(70346, 4022)) {
                            throw null;
                        } else {
                            var10000 = true;
                        }
                    }
                }
            } else if (lllIIlIlIlll(70346, 4022)) {
                throw null;
            } else {
                if (lllIIlIllIII(this.)) {
                    if (lllIIlIllIlI(this., -1)) {
                        this.                                                                                                    .
                        field_71439_g.field_71071_by.field_70461_c = this.;
                        this.                                                                                                    .
                        field_71442_b.func_78765_e();
                    }

                    if (lllIIlIlIlll(70346, 4022)) {
                        throw null;
                    }

                    this. = false;
                    KeyBinding.func_74510_a(this..field_71474_y.field_74313_G.func_151463_i(), false);
                    if (lllIIlIlIlll(70346, 4022)) {
                        throw null;
                    }
                }

                if (lllIIlIlIlll(70346, 4022)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (!lllIIlIllIII(this.) || !lllIIlIlllll(var2, Class170.) || lllIIlIllIll(var1 instanceof CPacketPlayerTryUseItemOnBlock) && !lllIIlIllIII(var1 instanceof CPacketAnimation)) {
            if (lllIIlIlIlll(65476, 3876)) {
                throw null;
            } else {
                boolean var10000 = super. (var1, var2);
                if (lllIIlIlIlll(65476, 3876)) {
                    throw null;
                } else {
                    return var10000;
                }
            }
        } else if (lllIIlIlIlll(65476, 3876)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RightClickBlock var1) {
        var1.setCanceled(this.);
        boolean var10000 = true;
    }
}
