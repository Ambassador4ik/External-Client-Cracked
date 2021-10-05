import java.util.Iterator;
import java.util.List;

import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealth;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class166 extends Class171 {
    private static int 19647=-3056;
    private static int 2144=1581;
    private static int 33362=-2043;
    public Class220;
    private static int 81782=-21274;
    private static int 2058=31114;
    private static int 8217=11985;
    public Class28;
    public Class220;
    private static int 9274=26088;
    public Class220;
    private static int 5248=12805;
    private static int 8489=32535;
    private static int 86170=-13039;
    private static int 1921=545;
    private static int 40355=-20610;
    public Runnable;
    public int;
    private static int 34079=-754;
    private static int 43935=-14658;

    static {
        boolean var10000 = true;
    }

    public Class166() {
        String var10004 = Class60. ("[n9nq;Mu2ox:y5");
        if (llllIllIIlll(19647, 2058)) {
            throw null;
        } else {
            super(var10004, 79, Class188.);
            if (llllIllIIlll(19647, 2058)) {
                throw null;
            } else {
                this. = 0;
                Class28 var10002 = new Class28();
                if (llllIllIIlll(19647, 2058)) {
                    throw null;
                } else {
                    this. = var10002;
                    Class220 var10001 = new Class220;
                    String var10003 = Class60. ("Rq<{>");
                    if (llllIllIIlll(19647, 2058)) {
                        throw null;
                    } else {
                        String[] var10006 = new String[2];
                        String var10009 = Class60. ("Ywp\u007fp/");
                        if (llllIllIIlll(19647, 2058)) {
                            throw null;
                        } else {
                            var10006[0] = var10009;
                            var10009 = Class60. ("Jzzq{/");
                            if (llllIllIIlll(19647, 2058)) {
                                throw null;
                            } else {
                                var10006[1] = var10009;
                                var10001.<init> (var10003, 190, this, var10006);
                                if (llllIllIIlll(19647, 2058)) {
                                    throw null;
                                } else {
                                    this. = var10001;
                                    Class220 var3 = new Class220;
                                    String var1 = Class60. ("Xx?py=\"");
                                    if (llllIllIIlll(19647, 2058)) {
                                        throw null;
                                    } else {
                                        var3.<init> (var1, 188, this, 180.0D, 0.0D, 500.0D, 10.0D, true);
                                        if (llllIllIIlll(19647, 2058)) {
                                            throw null;
                                        } else {
                                            this. = var3;
                                            Class220 var2 = new Class220;
                                            String var10005 = Class60. ("S\u007fy7");
                                            if (llllIllIIlll(19647, 2058)) {
                                                throw null;
                                            } else {
                                                var2.<init> (var10005, 189, this, 16.0D, 1.0D, 20.0D, true);
                                                if (llllIllIIlll(19647, 2058)) {
                                                    throw null;
                                                } else {
                                                    this. = var2;
                                                    this. = this::;
                                                    this. (new Class220[]{this.});
                                                    this. (new Class220[]{this.});
                                                    this. (new Class220[]{this.});
                                                    boolean var10000 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llllIllIlIlI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llllIllIlIll(Object var0) {
        return var0 == null;
    }

    private static boolean llllIllIlIII(int var0) {
        return var0 <= 0;
    }

    private static boolean llllIllIIlll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIllIIllI(int var0) {
        return var0 != 0;
    }

    private static boolean llllIllIllII(Object var0) {
        return var0 != null;
    }

    private static boolean llllIllIlIIl(int var0) {
        return var0 == 0;
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Potion var1) {
        if (llllIllIIllI(var1.func_76398_f())) {
            return false;
        } else if (llllIllIIlll(34079, 2144)) {
            throw null;
        } else {
            double var3;
            if (llllIllIIllI(var1 instanceof PotionHealth) && llllIllIlIII((var3 = (double) this..field_71439_g.func_110143_aJ() - this..
            ()) ==0.0D ? 0 : (var3 < 0.0D ? -1 : 1))){
                return true;
            } else if (llllIllIIlll(34079, 2144)) {
                throw null;
            } else {
                String var2 = var1.getRegistryName().func_110623_a();
                if (llllIllIlIIl(this..field_71439_g.func_70644_a(var1))){
                    label62:
                    {
                        String var10001 = Class60. ("r|eqOgvgufkuvv>");
                        if (llllIllIIlll(34079, 2144)) {
                            throw null;
                        }

                        if (llllIllIlIIl(var2.contains(var10001))) {
                            var10001 = Class60. ("hnj~q}h3");
                            if (llllIllIIlll(34079, 2144)) {
                                throw null;
                            }

                            if (llllIllIlIIl(var2.contains(var10001))) {
                                var10001 = Class60. ("lnyz?");
                                if (llllIllIIlll(34079, 2144)) {
                                    throw null;
                                }

                                if (!llllIllIIllI(var2.contains(var10001))) {
                                    break label62;
                                }
                            }
                        }

                        if (llllIllIIlll(34079, 2144)) {
                            throw null;
                        }

                        return true;
                    }
                }

                if (llllIllIIlll(34079, 2144)) {
                    throw null;
                } else {
                    return false;
                }
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000;
        if (llllIllIIllI(this..field_71439_g.func_70089_S()) &&!llllIllIlIIl(this..field_71439_g.field_70122_E)){
            if (llllIllIIlll(33362, 8489)) {
                throw null;
            } else {
                this. ();

                int var4;
                boolean var14;
                for (int var7 = var4 = 0; !llllIllIIlll(33362, 8489); var14 = true) {
                    if (!llllIllIlIlI(var7, 9)) {
                        if (llllIllIIlll(33362, 8489)) {
                            throw null;
                        }

                        var10000 = true;
                        return;
                    }

                    ItemStack var2;
                    if (llllIllIIllI((var2 = this..field_71439_g.field_71071_by.func_70301_a(var4)).func_77973_b() instanceof ItemPotion))
                    {
                        String var8 = var2.func_77973_b().getRegistryName().toString();
                        String var10001 = Class60. ("adaik\u007fjjp7t|llpdC}pxqb5");
                        if (llllIllIIlll(33362, 8489)) {
                            throw null;
                        }

                        if (llllIllIIllI(var8.equals(var10001))) {
                            List var9 = PotionUtils.func_185189_a(var2);
                            if (llllIllIIlll(33362, 8489)) {
                                throw null;
                            }

                            Iterator var5 = var9.iterator();

                            while (true) {
                                if (llllIllIIlll(33362, 8489)) {
                                    throw null;
                                }

                                if (!llllIllIIllI(var5.hasNext())) {
                                    break;
                                }

                                PotionEffect var3 = (PotionEffect) var5.next();
                                Class28 var10 = this.;
                                double var11 = this.                                                                                                  .
                                ();
                                String var10002 = this.                                                                              .
                                ();
                                String var10003 = Class60. ("Ywp\u007fp/");
                                if (llllIllIIlll(33362, 8489)) {
                                    throw null;
                                }

                                byte var15;
                                if (llllIllIIllI(var10002.equals(var10003))) {
                                    var15 = 60;
                                    boolean var17 = true;
                                } else {
                                    if (llllIllIIlll(33362, 8489)) {
                                        throw null;
                                    }

                                    var15 = 0;
                                }

                                if (llllIllIIlll(33362, 8489)) {
                                    throw null;
                                }

                                if (llllIllIIllI(var10. (var11 + (double) var15))){
                                    byte var12 = this. (var3.func_188419_a());
                                    if (llllIllIIlll(33362, 8489)) {
                                        throw null;
                                    }

                                    if (llllIllIIllI(var12)) {
                                        this.                                                                                         .
                                        ();
                                        this. = var4;
                                        var8 = this.                                                                              .
                                        ();
                                        var10001 = Class60. ("Ywp\u007fp/");
                                        if (llllIllIIlll(33362, 8489)) {
                                            throw null;
                                        }

                                        if (llllIllIIllI(var8.equals(var10001))) {
                                            Thread var16 = new Thread;
                                            Runnable var18 = this.;
                                            var10003 = Class60. ("\u007f}\u007f\u007f}/");
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            var16.<init> (var18, var10003);
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            var16.start();
                                            var10000 = true;
                                        } else {
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            int var6 = this.                                                                                                    .
                                            field_71439_g.field_71071_by.field_70461_c;
                                            CPacketHeldItemChange var10004 = new CPacketHeldItemChange(this.);
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            this. (var10004);
                                            Rotation var20 = new Rotation(this..field_71439_g.field_70177_z,
                                            90.0F, this.                                                                                                    .
                                            field_71439_g.field_70122_E);
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            this. (var20);
                                            CPacketPlayerTryUseItem var19 = new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            this. (var19);
                                            CPacketHeldItemChange var13 = new CPacketHeldItemChange(var6);
                                            if (llllIllIIlll(33362, 8489)) {
                                                throw null;
                                            }

                                            this. (var13);
                                            var10000 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (llllIllIIlll(33362, 8489)) {
                        throw null;
                    }

                    ++var4;
                    var7 = var4;
                }

                throw null;
            }
        } else if (llllIllIIlll(33362, 8489)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    private void __________________________________________________________________________________/* $FF was:                                                                                   */() {
        int var1 = this.                                                                                                    .
        field_71439_g.field_71071_by.field_70461_c;
        this.                                                                                                    .
        field_71439_g.field_71071_by.field_70461_c = this.;
        this. (60L);
        Rotation var10003 = new Rotation(this..field_71439_g.field_70177_z, 91.0F, this.                                                                                                    .
        field_71439_g.field_70122_E);
        if (llllIllIIlll(43935, 1921)) {
            throw null;
        } else {
            this. (var10003);
            CPacketPlayerTryUseItem var10002 = new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
            if (llllIllIIlll(43935, 1921)) {
                throw null;
            } else {
                this. (var10002);
                this.                                                                                                    .
                field_71439_g.field_71071_by.field_70461_c = var1;
                boolean var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        boolean var7;
        if (!llllIllIlIIl(this..field_71462_r instanceof Class127) ||
        !llllIllIlIIl(this..field_71462_r instanceof Class127) ||llllIllIlIll(this..field_71462_r)){
            if (llllIllIIlll(40355, 5248)) {
                throw null;
            }

            int var1;
            int var10000 = var1 = 9;

            while (true) {
                if (llllIllIIlll(40355, 5248)) {
                    throw null;
                }

                if (!llllIllIlIlI(var10000, this..field_71439_g.field_71071_by.field_70462_a.size())){
                    break;
                }

                ItemStack var2;
                if (llllIllIllII(var2 = this..field_71439_g.field_71071_by.func_70301_a(var1)) &&
                llllIllIIllI(var2.func_77973_b() instanceof ItemPotion)){
                    List var5 = PotionUtils.func_185189_a(var2);
                    if (llllIllIIlll(40355, 5248)) {
                        throw null;
                    }

                    Iterator var3 = var5.iterator();

                    while (true) {
                        if (llllIllIIlll(40355, 5248)) {
                            throw null;
                        }

                        if (!llllIllIIllI(var3.hasNext())) {
                            break;
                        }

                        PotionEffect var4;
                        if (llllIllIIllI((var4 = (PotionEffect) var3.next()).func_188419_a() instanceof PotionHealth) && llllIllIlIIl(var4.func_188419_a().func_76398_f())) {
                            String var6 = var2.func_77973_b().getRegistryName().toString();
                            String var10001 = Class60. ("adaik\u007fjjp7t|llpdC}pxqb5");
                            if (llllIllIIlll(40355, 5248)) {
                                throw null;
                            }

                            if (llllIllIIllI(var6.equals(var10001)) && llllIllIIllI(this.. (100))){
                                this.                                                                                                    .
                                field_71442_b.func_187098_a(this..field_71439_g.field_71069_bz.field_75152_c, var1, 0, ClickType.QUICK_MOVE, this.                                                                                                    .
                                field_71439_g);
                                this.                                                                                            .
                                ();
                                var7 = true;
                            }
                        }
                    }
                }

                if (llllIllIIlll(40355, 5248)) {
                    throw null;
                }

                ++var1;
                var10000 = var1;
                boolean var8 = true;
            }
        }

        if (llllIllIIlll(40355, 5248)) {
            throw null;
        } else {
            var7 = true;
        }
    }
}
