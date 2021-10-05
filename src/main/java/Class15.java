import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class15 extends Class171 {
    private static int 1751=14458;
    private static int 5110=22451;
    private static int 36896=-28696;
    private static int 27847=-15165;
    private static int 79855=-9769;
    private static int 7258=3665;
    private static int 49903=-32505;
    private static int 8629=13473;
    private static int 27845=-29901;
    private static int 1789=13678;
    private static int 3007=4472;
    private static int 50162=-1380;
    private static int 91730=-4589;
    private static int 9995=12547;
    private static int 65111=-2974;
    private static int 7827=1025;

    static {
        boolean var10000 = true;
    }

    public Class15() {
        String var10001 = Class60. ("Xb}+cai+qHo+\u007fOW+\u000b");
        if (llllIIIlIlII(36896, 8629)) {
            throw null;
        } else {
            super(var10001, 48, Class188.);
            if (llllIIIlIlII(36896, 8629)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llllIIIlIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIIlIllI(int var0) {
        return var0 != 0;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var0) {
        return 1;
    }

    private static boolean llllIIIlIlIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var0) {
        return var0 instanceof TileEntityShulkerBox;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        int var10000 = 0;
        String var10002 = String.valueOf(this. ());
        if (llllIIIlIlII(91730, 5110)) {
            throw null;
        } else {
            this. (var10002);

            boolean var10001;
            for (int var3 = 0; !llllIIIlIlII(91730, 5110); var10001 = true) {
                if (!llllIIIlIlIl(var10000, this..field_71441_e.field_147482_g.size())){
                    if (llllIIIlIlII(91730, 5110)) {
                        throw null;
                    }

                    boolean var4 = true;
                    return;
                }

                TileEntity var2;
                if (llllIIIlIllI((var2 = (TileEntity) this..field_71441_e.field_147482_g.get(var3)) instanceof TileEntityShulkerBox))
                {
                    this. (var2);
                    if (llllIIIlIlII(91730, 5110)) {
                        throw null;
                    }
                }

                if (llllIIIlIlII(91730, 5110)) {
                    throw null;
                }

                ++var3;
                var10000 = var3;
            }

            throw null;
        }
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        return this.                                                                                                    .
        field_71441_e.field_147482_g.stream().filter(Class15::).mapToInt(Class15::).sum();
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var1) {
        double var2 = (double) var1.func_174877_v().func_177958_n() - this.                                                                                                    .
        func_175598_ae().field_78730_l;
        double var4 = (double) var1.func_174877_v().func_177956_o() - this.                                                                                                    .
        func_175598_ae().field_78731_m;
        double var6 = (double) var1.func_174877_v().func_177952_p() - this.                                                                                                    .
        func_175598_ae().field_78728_n;
        GlStateManager.func_179094_E();
        if (llllIIIlIlII(50162, 7258)) {
            throw null;
        } else {
            GlStateManager.func_179090_x();
            if (llllIIIlIlII(50162, 7258)) {
                throw null;
            } else {
                GlStateManager.func_179097_i();
                if (llllIIIlIlII(50162, 7258)) {
                    throw null;
                } else {
                    GlStateManager.func_179129_p();
                    if (llllIIIlIlII(50162, 7258)) {
                        throw null;
                    } else {
                        GlStateManager.func_179147_l();
                        if (llllIIIlIlII(50162, 7258)) {
                            throw null;
                        } else {
                            GlStateManager.func_179132_a(false);
                            if (llllIIIlIlII(50162, 7258)) {
                                throw null;
                            } else {
                                GL11.glEnable(2848);
                                if (llllIIIlIlII(50162, 7258)) {
                                    throw null;
                                } else {
                                    GL11.glTranslated(var2, var4, var6);
                                    if (llllIIIlIlII(50162, 7258)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187441_d(2.0F);
                                        if (llllIIIlIlII(50162, 7258)) {
                                            throw null;
                                        } else {
                                            float[] var8 = ((TileEntityShulkerBox) var1).func_190592_s().func_193349_f();
                                            GL11.glColor4f(var8[0], var8[1], var8[2], 0.5F);
                                            if (llllIIIlIlII(50162, 7258)) {
                                                throw null;
                                            } else {
                                                Class181. (Block.field_185505_j);
                                                if (llllIIIlIlII(50162, 7258)) {
                                                    throw null;
                                                } else {
                                                    GL11.glColor4f(var8[0], var8[1], var8[2], 0.9F);
                                                    if (llllIIIlIlII(50162, 7258)) {
                                                        throw null;
                                                    } else {
                                                        Class181. (Block.field_185505_j);
                                                        if (llllIIIlIlII(50162, 7258)) {
                                                            throw null;
                                                        } else {
                                                            GlStateManager.func_179098_w();
                                                            if (llllIIIlIlII(50162, 7258)) {
                                                                throw null;
                                                            } else {
                                                                GlStateManager.func_179126_j();
                                                                if (llllIIIlIlII(50162, 7258)) {
                                                                    throw null;
                                                                } else {
                                                                    GlStateManager.func_179089_o();
                                                                    if (llllIIIlIlII(50162, 7258)) {
                                                                        throw null;
                                                                    } else {
                                                                        GlStateManager.func_179084_k();
                                                                        if (llllIIIlIlII(50162, 7258)) {
                                                                            throw null;
                                                                        } else {
                                                                            GlStateManager.func_179132_a(true);
                                                                            if (llllIIIlIlII(50162, 7258)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glDisable(2848);
                                                                                if (llllIIIlIlII(50162, 7258)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.func_179121_F();
                                                                                    if (llllIIIlIlII(50162, 7258)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.func_179117_G();
                                                                                        if (llllIIIlIlII(50162, 7258)) {
                                                                                            throw null;
                                                                                        } else {
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
