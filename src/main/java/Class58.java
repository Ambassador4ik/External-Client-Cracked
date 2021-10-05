import java.io.PrintStream;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;

public class Class58 extends WorldClient {
    private static int 475=22018;
    private static int 14603=-24174;
    private static int 3499=7689;
    private static int 16260=-7538;
    private static int 15158=-18716;
    private static int 76965=-9020;
    private static int 4420=21379;
    private static int 3170=691;

    static {
        boolean var10000 = true;
    }

    public Class58(NetHandlerPlayClient var1, WorldSettings var2, int var3, EnumDifficulty var4, Profiler var5) {
        super(var1, var2, var3, var4, var5);
        if (lllIlIIIllIl(14603, 4420)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean lllIlIIIllIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIIIllll(int var0) {
        return var0 == 0;
    }

    private static boolean lllIlIIIlllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIlIIlIIII(int var0, int var1) {
        return var0 < var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void func_73029_E(int var1, int var2, int var3) {
        PrintStream var10000 = System.out;
        String var10001 = Class60. ("Yj?");
        if (lllIlIIIllIl(76965, 475)) {
            throw null;
        } else {
            var10000.println(var10001);
            Random var9 = new Random();
            if (lllIlIIIllIl(76965, 475)) {
                throw null;
            } else {
                Random var4 = var9;
                Minecraft var10 = Minecraft.func_71410_x();
                if (lllIlIIIllIl(76965, 475)) {
                    throw null;
                } else {
                    ItemStack var5 = var10.field_71439_g.func_184614_ca();
                    var10 = Minecraft.func_71410_x();
                    if (lllIlIIIllIl(76965, 475)) {
                        throw null;
                    } else {
                        boolean var13;
                        boolean var14;
                        label66:
                        {
                            if (lllIlIIIlllI(var10.field_71442_b.func_178889_l(), GameType.CREATIVE) && lllIlIIIllll(var5.func_190926_b())) {
                                Item var11 = var5.func_77973_b();
                                Item var12 = Item.func_150898_a(Blocks.field_180401_cv);
                                if (lllIlIIIllIl(76965, 475)) {
                                    throw null;
                                }

                                if (lllIlIIIlllI(var11, var12)) {
                                    var13 = true;
                                    var14 = true;
                                    break label66;
                                }
                            }

                            if (lllIlIIIllIl(76965, 475)) {
                                throw null;
                            }

                            var13 = false;
                        }

                        if (lllIlIIIllIl(76965, 475)) {
                            throw null;
                        } else {
                            boolean var6 = var13;
                            MutableBlockPos var15 = new MutableBlockPos();
                            if (lllIlIIIllIl(76965, 475)) {
                                throw null;
                            } else {
                                MutableBlockPos var8 = var15;

                                int var7;
                                for (int var16 = var7 = 0; !lllIlIIIllIl(76965, 475); var14 = true) {
                                    if (!lllIlIIlIIII(var16, 667)) {
                                        if (lllIlIIIllIl(76965, 475)) {
                                            throw null;
                                        }

                                        var13 = true;
                                        return;
                                    }

                                    this.func_184153_a(var1, var2, var3, 16, var4, var6, var8);
                                    ++var7;
                                    this.func_184153_a(var1, var2, var3, 32, var4, var6, var8);
                                    var16 = var7;
                                }

                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }
}
