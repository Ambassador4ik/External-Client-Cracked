import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.client.model.ModelSign;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class96 extends TileEntitySpecialRenderer {
    private static int 92928=-27407;
    private Class162;
    private static int 1880=9520;
    private static int 4125=14077;
    private static int 86745=-22866;
    private static int 4235=21183;
    private static int 23441=-12510;
    private static int 3502=16848;
    private final ModelSign;
    private static int 35400=-21005;
    private static int 15379=-13787;
    private static final ResourceLocation;
    private static int 6323=28495;

    static {
        ResourceLocation var10000 = new ResourceLocation;
        String var10002 = Class60. ("o\u007f`ojhyh<\u007f~o~nm4xsou!jb<");
        if (llIllIllIllI(23441, 6323)) {
            throw null;
        } else {
            var10000.<init> (var10002);
            if (llIllIllIllI(23441, 6323)) {
                throw null;
            } else {
                                                                                               =var10000;
                boolean var0 = true;
            }
        }
    }

    public Class96() {
        if (llIllIllIllI(86745, 1880)) {
            throw null;
        } else {
            ModelSign var10001 = new ModelSign();
            if (llIllIllIllI(86745, 1880)) {
                throw null;
            } else {
                this. = var10001;
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIllIllIlll(Object var0) {
        return var0 == null;
    }

    private static boolean llIllIlllIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIllIllllII(int var0) {
        return var0 >= 0;
    }

    private static boolean llIllIlllIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIllIllllIl(int var0) {
        return var0 < 0;
    }

    private static boolean llIllIllllll(Object var0) {
        return var0 != null;
    }

    private static boolean llIllIlllIlI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIllIllIllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIlllIll(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIllIlllllI(int var0, int var1) {
        return var0 < var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void render(TileEntitySign var1, double var2, double var4, double var6, float var8, int var9, float var10) {
        if (llIllIllIlll(this.)) {
            Class171 var10001 = Class133. (70);
            if (llIllIllIllI(92928, 3502)) {
                throw null;
            }

            this. = (Class162) var10001;
        }

        if (llIllIllIllI(92928, 3502)) {
            throw null;
        } else {
            byte var10000;
            boolean var19;
            if (llIllIlllIII(this.. ()) &&llIllIlllIII(this..                                                                                            .
            ())){
                if (llIllIlllIIl(this.. (var1))){
                    var10000 = 1;
                    var19 = true;
                } else{
                    if (llIllIllIllI(92928, 3502)) {
                        throw null;
                    }

                    var10000 = 0;
                    var19 = true;
                }
            } else{
                if (llIllIllIllI(92928, 3502)) {
                    throw null;
                }

                var10000 = 1;
            }

            if (llIllIllIllI(92928, 3502)) {
                throw null;
            } else {
                byte var13 = var10000;
                Block var15 = var1.func_145838_q();
                GlStateManager.func_179094_E();
                if (llIllIllIllI(92928, 3502)) {
                    throw null;
                } else {
                    int var20;
                    if (llIllIlllIlI(var15, Blocks.field_150472_an)) {
                        GlStateManager.func_179109_b((float) var2 + 0.5F, (float) var4 + 0.5F, (float) var6 + 0.5F);
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(-((float) (var1.func_145832_p() * 360) / 16.0F), 0.0F, 1.0F, 0.0F);
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        this.                                                                                                   .
                        field_78165_b.field_78806_j = true;
                        var20 = var9;
                        var19 = true;
                    } else {
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        int var16 = var1.func_145832_p();
                        float var11 = 0.0F;
                        if (llIllIlllIll(var16, 2)) {
                            var11 = 180.0F;
                        }

                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        if (llIllIlllIll(var16, 4)) {
                            var11 = 90.0F;
                        }

                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        if (llIllIlllIll(var16, 5)) {
                            var11 = -90.0F;
                        }

                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        GlStateManager.func_179109_b((float) var2 + 0.5F, (float) var4 + 0.5F, (float) var6 + 0.5F);
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(-var11, 0.0F, 1.0F, 0.0F);
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        GlStateManager.func_179109_b(0.0F, -0.3125F, -0.4375F);
                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        }

                        var20 = var9;
                        this.                                                                                                   .
                        field_78165_b.field_78806_j = false;
                    }

                    if (llIllIllIllI(92928, 3502)) {
                        throw null;
                    } else {
                        boolean var21;
                        if (llIllIllllII(var20)) {
                            this.func_147499_a(field_178460_a[var9]);
                            GlStateManager.func_179128_n(5890);
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            GlStateManager.func_179094_E();
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            GlStateManager.func_179152_a(4.0F, 2.0F, 1.0F);
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            GlStateManager.func_179109_b(0.0625F, 0.0625F, 0.0625F);
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            GlStateManager.func_179128_n(5888);
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            var21 = true;
                        } else {
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            }

                            this.func_147499_a();
                        }

                        if (llIllIllIllI(92928, 3502)) {
                            throw null;
                        } else {
                            GlStateManager.func_179091_B();
                            if (llIllIllIllI(92928, 3502)) {
                                throw null;
                            } else {
                                GlStateManager.func_179094_E();
                                if (llIllIllIllI(92928, 3502)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179152_a(0.6666667F, -0.6666667F, -0.6666667F);
                                    if (llIllIllIllI(92928, 3502)) {
                                        throw null;
                                    } else {
                                        this.                                                                                                   .
                                        func_78164_a();
                                        GlStateManager.func_179121_F();
                                        if (llIllIllIllI(92928, 3502)) {
                                            throw null;
                                        } else {
                                            FontRenderer var17 = this.func_147498_b();
                                            GlStateManager.func_179109_b(0.0F, 0.33333334F, 0.046666667F);
                                            if (llIllIllIllI(92928, 3502)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_179152_a(0.010416667F, -0.010416667F, 0.010416667F);
                                                if (llIllIllIllI(92928, 3502)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.func_187432_a(0.0F, 0.0F, -0.010416667F);
                                                    if (llIllIllIllI(92928, 3502)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.func_179132_a(false);
                                                        if (llIllIllIllI(92928, 3502)) {
                                                            throw null;
                                                        } else {
                                                            if (llIllIllllIl(var9) && llIllIlllIII(var13)) {
                                                                int var18;
                                                                var20 = var18 = 0;

                                                                while (true) {
                                                                    if (llIllIllIllI(92928, 3502)) {
                                                                        throw null;
                                                                    }

                                                                    if (!llIllIlllllI(var20, var1.field_145915_a.length)) {
                                                                        break;
                                                                    }

                                                                    if (llIllIllllll(var1.field_145915_a[var18])) {
                                                                        List var23 = GuiUtilRenderComponents.func_178908_a(var1.field_145915_a[var18], 90, var17, false, true);
                                                                        if (llIllIllIllI(92928, 3502)) {
                                                                            throw null;
                                                                        }

                                                                        List var14 = var23;
                                                                        String var24;
                                                                        if (llIllIllllll(var23) && llIllIlllIIl(var14.isEmpty())) {
                                                                            var24 = ((ITextComponent) var14.get(0)).func_150254_d();
                                                                            var19 = true;
                                                                        } else {
                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            }

                                                                            var24 = "";
                                                                        }

                                                                        if (llIllIllIllI(92928, 3502)) {
                                                                            throw null;
                                                                        }

                                                                        String var12 = var24;
                                                                        if (llIllIlllIll(var18, var1.field_145918_i)) {
                                                                            StringBuilder var25 = new StringBuilder();
                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            }

                                                                            String var10002 = Class60. ("${");
                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            }

                                                                            var25 = var25.insert(0, var10002).append(var12);
                                                                            String var22 = Class60. (":g");
                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            }

                                                                            var17.func_78276_b(var12 = String.valueOf(var25.append(var22)), -var17.func_78256_a(var12) / 2, var18 * 10 - var1.field_145915_a.length * 5, 0);
                                                                            var21 = true;
                                                                        } else {
                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            }

                                                                            var17.func_78276_b(var12, -var17.func_78256_a(var12) / 2, var18 * 10 - var1.field_145915_a.length * 5, 0);
                                                                        }
                                                                    }

                                                                    if (llIllIllIllI(92928, 3502)) {
                                                                        throw null;
                                                                    }

                                                                    ++var18;
                                                                    var20 = var18;
                                                                    var19 = true;
                                                                }
                                                            }

                                                            if (llIllIllIllI(92928, 3502)) {
                                                                throw null;
                                                            } else {
                                                                GlStateManager.func_179132_a(true);
                                                                if (llIllIllIllI(92928, 3502)) {
                                                                    throw null;
                                                                } else {
                                                                    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
                                                                    if (llIllIllIllI(92928, 3502)) {
                                                                        throw null;
                                                                    } else {
                                                                        GlStateManager.func_179121_F();
                                                                        if (llIllIllIllI(92928, 3502)) {
                                                                            throw null;
                                                                        } else {
                                                                            if (llIllIllllII(var9)) {
                                                                                GlStateManager.func_179128_n(5890);
                                                                                if (llIllIllIllI(92928, 3502)) {
                                                                                    throw null;
                                                                                }

                                                                                GlStateManager.func_179121_F();
                                                                                if (llIllIllIllI(92928, 3502)) {
                                                                                    throw null;
                                                                                }

                                                                                GlStateManager.func_179128_n(5888);
                                                                                if (llIllIllIllI(92928, 3502)) {
                                                                                    throw null;
                                                                                }
                                                                            }

                                                                            if (llIllIllIllI(92928, 3502)) {
                                                                                throw null;
                                                                            } else {
                                                                                var21 = true;
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

    public void func_192841_a(TileEntity var1, double var2, double var4, double var6, float var8, int var9, float var10) {
        this.render((TileEntitySign) var1, var2, var4, var6, var8, var9, var10);
        boolean var10000 = true;
    }
}
