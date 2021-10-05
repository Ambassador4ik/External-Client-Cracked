import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class110 extends Class171 {
    private static int 87285=-19446;
    private static int 16898=-25134;
    public Class220;
    private static int 4905=3920;
    private static int 6592=10105;
    private static int 4159=30025;
    private static int 1355=13241;
    private static int 4174=31459;
    private static int 26853=-3745;
    public Class220;
    private static int 39433=-3485;
    private static int 60046=-22066;

    static {
        boolean var10000 = true;
    }

    public Class110() {
        String var10005 = Class60. ("Vc4c|6Qe?{s7)");
        if (llIIlIllIlIl(16898, 4174)) {
            throw null;
        } else {
            super(var10005, 81, Class188.);
            if (llIIlIllIlIl(16898, 4174)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Uu9vg;Tt2-");
                if (llIIlIllIlIl(16898, 4174)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 212, this, false);
                    if (llIIlIllIlIl(16898, 4174)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("Xx?py=\"");
                        if (llIIlIllIlIl(16898, 4174)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 211, this, 60.0D, 0.0D, 300.0D, 10.0D, true);
                            if (llIIlIllIlIl(16898, 4174)) {
                                throw null;
                            } else {
                                this. = var10003;
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

    private static boolean llIIlIlllIIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIIlIllIllI(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlIlllIlI(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIIlIlllIII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIlIllIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlIllIlll(int var0) {
        return var0 == 0;
    }

    private static boolean llIIlIllIlII(int var0) {
        return var0 != 0;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        Class110 var12;
        boolean var10000;
        boolean var10001;
        label172:
        {
            if (llIIlIllIlII(this.. (this.. ()))){
            if (llIIlIllIlII(this.. ())){
                var12 = this;
                var10001 = true;
                break label172;
            }

            if (llIIlIllIlIl(60046, 4905)) {
                throw null;
            }

            if (!llIIlIllIllI(this..field_71462_r)){
                if (llIIlIllIlIl(60046, 4905)) {
                    throw null;
                }

                var12 = this;
                break label172;
            }
        }

            if (llIIlIllIlIl(60046, 4905)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIIlIllIlIl(60046, 4905)) {
            throw null;
        } else if (llIIlIllIlII(var12.. ()) &&llIIlIllIlll(this..field_71462_r instanceof GuiInventory) &&
        llIIlIllIlll(this..field_71462_r instanceof Class127)){
            var10000 = true;
        } else if (llIIlIllIlIl(60046, 4905)) {
            throw null;
        } else {
            this.                                                                                         .();
            int[] var8 = new int[4];
            int[] var2 = new int[4];

            int var3;
            for (int var13 = var3 = 0; !llIIlIllIlIl(60046, 4905); var10001 = true) {
                ItemStack var4;
                ItemArmor var5;
                if (!llIIlIlllIII(var13, 4)) {
                    if (llIIlIllIlIl(60046, 4905)) {
                        throw null;
                    }

                    for (var13 = var3 = 0; !llIIlIllIlIl(60046, 4905); var10001 = true) {
                        int var6;
                        if (!llIIlIlllIII(var13, 36)) {
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            ArrayList var15 = new ArrayList;
                            Integer[] var10002 = new Integer[4];
                            Integer var10005 = 0;
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var10002[0] = var10005;
                            var10005 = 1;
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var10002[1] = var10005;
                            var10005 = 2;
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var10002[2] = var10005;
                            var10005 = 3;
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var10002[3] = var10005;
                            List var14 = Arrays.asList(var10002);
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var15.<init> (var14);
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            Collections.shuffle(var15);
                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            Iterator var9;
                            Iterator var16 = var9 = var15.iterator();

                            while (true) {
                                if (llIIlIllIlIl(60046, 4905)) {
                                    throw null;
                                }

                                if (!llIIlIllIlII(var16.hasNext())) {
                                    break;
                                }

                                int var10 = (Integer) var9.next();
                                if (llIIlIlllIlI(var6 = var8[var10], -1)) {
                                    var16 = var9;
                                    var10001 = true;
                                } else {
                                    if (llIIlIllIlIl(60046, 4905)) {
                                        throw null;
                                    }

                                    ItemStack var11;
                                    if (!llIIlIllIllI(var11 = this..field_71439_g.field_71071_by.func_70440_f(var10)) ||
                                    !llIIlIlllIlI(this..field_71439_g.field_71071_by.func_70447_i(), -1)){
                                        if (llIIlIllIlIl(60046, 4905)) {
                                            throw null;
                                        }

                                        if (llIIlIlllIII(var6, 9)) {
                                            var6 += 36;
                                        }

                                        if (llIIlIllIlIl(60046, 4905)) {
                                            throw null;
                                        }

                                        if (llIIlIllIllI(var11)) {
                                            this.                                                                                                    .
                                            field_71442_b.func_187098_a(0, 8 - var10, 0, ClickType.QUICK_MOVE, this..field_71439_g)
                                            ;
                                            this.                                                                                                    .
                                            field_71442_b.func_187098_a(0, var6, 0, ClickType.QUICK_MOVE, this..field_71439_g)
                                            ;
                                            var10000 = true;
                                            return;
                                        }
                                        break;
                                    }

                                    var16 = var9;
                                    var10001 = true;
                                }
                            }

                            if (llIIlIllIlIl(60046, 4905)) {
                                throw null;
                            }

                            var10000 = true;
                            return;
                        }

                        if (llIIlIllIllI(var4 = this..field_71439_g.field_71071_by.func_70301_a(var3)) &&
                        llIIlIllIlII(var4.func_77973_b() instanceof ItemArmor)){
                            var5 = (ItemArmor) var4.func_77973_b();
                            var6 = var5.field_77881_a.func_188454_b();
                            int var7;
                            if (llIIlIlllIIl(var7 = this. (var5, var4),var2[var6])){
                                var8[var6] = var3;
                                var2[var6] = var7;
                            }
                        }

                        if (llIIlIllIlIl(60046, 4905)) {
                            throw null;
                        }

                        ++var3;
                        var13 = var3;
                    }

                    throw null;
                }

                var8[var3] = -1;
                if (llIIlIllIllI(var4 = this..field_71439_g.field_71071_by.func_70440_f(var3)) &&
                llIIlIllIlII(var4.func_77973_b() instanceof ItemArmor)){
                    var5 = (ItemArmor) var4.func_77973_b();
                    var2[var3] = this. (var5, var4);
                }

                if (llIIlIllIlIl(60046, 4905)) {
                    throw null;
                }

                ++var3;
                var13 = var3;
            }

            throw null;
        }
    }

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemArmor var1, ItemStack var2) {
        ItemArmor var10001 = var1;
        ItemArmor var10000 = var1;
        int var7 = var1.field_77879_b;
        boolean var3 = false;
        int var4 = (int) var10001.field_189415_e;
        int var5 = var10000.func_82812_d().func_78044_b(EntityEquipmentSlot.LEGS);
        Enchantment var6 = Enchantments.field_180310_c;
        Enchantment var10 = var6;
        int var10002 = EnchantmentHelper.func_77506_a(var6, var2);
        if (llIIlIllIlIl(87285, 1355)) {
            throw null;
        } else {
            int var8 = var10002;
            DamageSource var12 = DamageSource.func_76365_a(this..field_71439_g);
            if (llIIlIllIlIl(87285, 1355)) {
                throw null;
            } else {
                DamageSource var11 = var12;
                int var9 = var10.func_77318_a(var8, var11);
                return var7 * 5 + var9 * 3 + var4 + var5;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
