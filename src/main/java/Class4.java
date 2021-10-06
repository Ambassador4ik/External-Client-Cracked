import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class Class4 {
    private static int 7524=8431;
    private static int 7208=28359;
    private static int 41485=-2948;
    private static int 58778=-18908;
    private static int 3025=29634;
    private static int 68133=-26791;
    private static int 1216=11984;
    private static int 2552=20762;
    private static int 46953=-11345;
    private static int 98324=-3148;
    private static int 99807=-22826;
    private static int 6137=1029;
    private static int 1286=30943;
    private static int 79341=-11100;
    private static int 3815=13288;
    private static int 2861=31335;
    private static int 62927=-12497;
    private static int 10866=-30196;
    private static int 6762=12078;
    private static int 42470=-29423;
    private static int 744=15721;
    private static int 7775=25979;
    private static int 9465=23665;
    private static int 9313=11855;
    private static int 6392=9400;
    private static int 31132=-1533;
    private static int 3747=27320;
    private static int 2788=31007;
    private static int 307=21685;
    private static int 80783=-10885;
    private static int 6765=5087;
    private static int 9732=18182;
    private static int 9571=5818;
    private static int 7414=29482;
    private static int 35594=-7080;
    private static int 33718=-9626;
    private static int 3253=9100;
    private static int 8823=32659;
    private static int 81789=-6801;
    private static int 8001=23460;
    private static int 21369=-4755;
    private static int 60385=-24677;
    private static int 4087=20986;
    private static int 25215=-31615;
    private static int 87013=-24756;
    private static int 2639=7894;
    private static int 88864=-8049;
    public Minecraft;
    private static int 54406=-32614;
    private static int 33096=-9767;
    private static int 807=4488;
    private static int 21719=-1929;
    private static int 9693=536;
    private static int 13544=-2158;
    private static int 72968=-22258;
    private static int 19900=-9786;
    private static int 64814=-16666;
    private static int 61958=-13975;
    private static int 4521=25709;
    private static int 67014=-4769;
    private static int 90203=-11061;
    private static int 8009=30855;
    private Class195;
    private static int 1716=17045;
    private static int 6745=3440;
    private static int 17446=-21566;
    private static int 442=12149;
    private static int 2836=11322;
    private static int 9360=25054;
    private static int 6617=21571;
    private static int 6544=1217;
    private static int 31=4960;
    private static int 65426=-16834;
    private static int 92220=-24182;
    private static int 74015=-20801;
    private static int 71660=-5056;
    private static int 49181=-28832;
    private static int 7771=31994;
    private static int 36929=-32084;
    private static int 73537=-4923;
    private static int 99758=-25525;
    private static int 12751=-1422;

    static {
        boolean var10000 = true;
    }

    public Class4() {
        if (lllIllIlllII(36929, 744)) {
            throw null;
        } else {
            Minecraft var10002 = Minecraft.getMinecraft();
            if (lllIllIlllII(36929, 744)) {
                throw null;
            } else {
                this. = var10002;
                Class195 var10001 = new Class195(this..gameSettings, this.                                                                                            .
                getTextureManager());
                if (lllIllIlllII(36929, 744)) {
                    throw null;
                } else {
                    this. = var10001;
                    if (lllIlllIIlll(this..gameSettings.language)){
                        this.                                                                                  .
                        setBidiFlag(this..getLanguageManager().isCurrentLanguageBidirectional());
                    }

                    if (lllIllIlllII(36929, 744)) {
                        throw null;
                    } else {
                        Class22. ((IResourceManagerReloadListener) this.);
                        if (lllIllIlllII(36929, 744)) {
                            throw null;
                        } else {
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIllIllllI(int var0) {
        return var0 < 0;
    }

    private static boolean lllIlllIIlll(Object var0) {
        return var0 != null;
    }

    private static boolean lllIllIlllIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIlllIIlIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllIlllIIIII(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean lllIllIlllII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlllIIlII(int var0) {
        return var0 != 0;
    }

    public Color ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2) {
        long var10000 = System.currentTimeMillis();
        if (lllIllIlllII(80783, 307)) {
            throw null;
        } else {
            Color var3 = Color.getHSBColor((float) ((var10000 + (long) var2) % (long) var1) / (float) var1, 1.0F, 1.0F);
            if (lllIllIlllII(80783, 307)) {
                throw null;
            } else {
                return var3;
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, float var4, float var5, int var6) {
        var2 = var2 + var4 / 2.0F - (float) (this. (var1) / 2);
        var3 = var3 + var5 / 2.0F - (float) (this..fontRenderer.FONT_HEIGHT / 2);
        this.                                                                                  .
        drawString(var1, var2, var3, var6, false);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Color var1) {
        GL11.glColor4f((float) var1.getRed() / 255.0F, (float) var1.getGreen() / 255.0F, (float) var1.getBlue() / 255.0F, (float) var1.getAlpha() / 255.0F);
        if (lllIllIlllII(21369, 2788)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, int var3, int var4, int var5) {
        GlStateManager.popMatrix();
        if (lllIllIlllII(25215, 1216)) {
            throw null;
        } else {
            GlStateManager.enableBlend();
            if (lllIllIlllII(25215, 1216)) {
                throw null;
            } else {
                GlStateManager.bindTexture(var5);
                if (lllIllIlllII(25215, 1216)) {
                    throw null;
                } else {
                    Gui.drawModalRectWithCustomSizedTexture(var1, var2, 0.0F, 0.0F, var3, var4, (float) var3, (float) var4);
                    if (lllIllIlllII(25215, 1216)) {
                        throw null;
                    } else {
                        GlStateManager.disableBlend();
                        if (lllIllIlllII(25215, 1216)) {
                            throw null;
                        } else {
                            GlStateManager.pushMatrix();
                            if (lllIllIlllII(25215, 1216)) {
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

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4, int var5, int var6) {
        this. ((double) (var2 - 1.0F), (double) (var3 - 1.0F), (double) (this. (var1) + 1),(double) this.                                                                                            .
        fontRenderer.FONT_HEIGHT, (double) var4, var6);
        this.                                                                                  .
        drawString(var1, var2, var3, var5, false);
        boolean var10000 = true;
    }

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return this.                                                                                  .;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ScaledResolution var1, float var2, float var3, float var4, float var5) {
        var4 += var2;
        var5 += var3;
        int var6 = var1.getScaleFactor();
        GL11.glScissor((int) (var2 * (float) var6), (int) (((float) var1.getScaledHeight() - var5) * (float) var6), (int) ((var4 - var2) * (float) var6), (int) ((var5 - var3) * (float) var6));
        if (lllIllIlllII(17446, 7771)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var1, int var2, int var3, float var4) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (lllIllIlllII(33096, 807)) {
            throw null;
        } else {
            RenderItem var5 = var10000.getRenderItem();
            GL11.glPushMatrix();
            if (lllIllIlllII(33096, 807)) {
                throw null;
            } else {
                GL11.glScalef(-0.01F * var4, -0.01F * var4, -0.01F * var4);
                if (lllIllIlllII(33096, 807)) {
                    throw null;
                } else {
                    GL11.glPushMatrix();
                    if (lllIllIlllII(33096, 807)) {
                        throw null;
                    } else {
                        GlStateManager.enableDepth();
                        if (lllIllIlllII(33096, 807)) {
                            throw null;
                        } else {
                            GlStateManager.disableLighting();
                            if (lllIllIlllII(33096, 807)) {
                                throw null;
                            } else {
                                RenderHelper.enableGUIStandardItemLighting();
                                if (lllIllIlllII(33096, 807)) {
                                    throw null;
                                } else {
                                    GL11.glPopMatrix();
                                    if (lllIllIlllII(33096, 807)) {
                                        throw null;
                                    } else {
                                        var5.renderItemIntoGUI(var1, var2, var3);
                                        String var6 = "";
                                        if (lllIllIlllIl(var1.getCount(), 1)) {
                                            StringBuilder var7 = new StringBuilder;
                                            String var10002 = String.valueOf(var1.getCount());
                                            if (lllIllIlllII(33096, 807)) {
                                                throw null;
                                            }

                                            var7.<init> (var10002);
                                            if (lllIllIlllII(33096, 807)) {
                                                throw null;
                                            }

                                            var6 = String.valueOf(var7);
                                        }

                                        if (lllIllIlllII(33096, 807)) {
                                            throw null;
                                        } else {
                                            var5.renderItemOverlayIntoGUI(this..fontRenderer, var1, var2, var3, var6);
                                            GlStateManager.disableLighting();
                                            if (lllIllIlllII(33096, 807)) {
                                                throw null;
                                            } else {
                                                GL11.glPopMatrix();
                                                if (lllIllIlllII(33096, 807)) {
                                                    throw null;
                                                } else {
                                                    boolean var8 = true;
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

    public Class136 ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return Class73.                                                                                      .;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1, double var3, double var5, double var7, double var9, int var11) {
        GlStateManager.enableBlend();
        if (lllIllIlllII(10866, 2552)) {
            throw null;
        } else {
            GlStateManager.disableTexture2D();
            if (lllIllIlllII(10866, 2552)) {
                throw null;
            } else {
                GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                if (lllIllIlllII(10866, 2552)) {
                    throw null;
                } else {
                    var5 += var1;
                    var7 += var3;
                    float var12 = (float) (var11 >> 24 & 255) / 255.0F;
                    float var13 = (float) (var11 >> 16 & 255) / 255.0F;
                    float var14 = (float) (var11 >> 8 & 255) / 255.0F;
                    float var15 = (float) (var11 & 255) / 255.0F;
                    GL11.glPushAttrib(0);
                    if (lllIllIlllII(10866, 2552)) {
                        throw null;
                    } else {
                        GL11.glScaled(0.5D, 0.5D, 0.5D);
                        if (lllIllIlllII(10866, 2552)) {
                            throw null;
                        } else {
                            var1 *= 2.0D;
                            var3 *= 2.0D;
                            var5 *= 2.0D;
                            var7 *= 2.0D;
                            GL11.glDisable(3553);
                            if (lllIllIlllII(10866, 2552)) {
                                throw null;
                            } else {
                                GL11.glColor4f(var13, var14, var15, var12);
                                if (lllIllIlllII(10866, 2552)) {
                                    throw null;
                                } else {
                                    GL11.glEnable(2848);
                                    if (lllIllIlllII(10866, 2552)) {
                                        throw null;
                                    } else {
                                        GL11.glBegin(9);
                                        if (lllIllIlllII(10866, 2552)) {
                                            throw null;
                                        } else {
                                            boolean var17;
                                            for (int var10000 = var11 = 0; !lllIllIlllII(10866, 2552); var17 = true) {
                                                double var16;
                                                double var10001;
                                                double var10002;
                                                double var10003;
                                                if (!lllIlllIIIII(var10000, 90)) {
                                                    if (lllIllIlllII(10866, 2552)) {
                                                        throw null;
                                                    }

                                                    for (var10000 = var11 = 90; !lllIllIlllII(10866, 2552); var17 = true) {
                                                        if (!lllIlllIIIII(var10000, 180)) {
                                                            if (lllIllIlllII(10866, 2552)) {
                                                                throw null;
                                                            }

                                                            for (var10000 = var11 = 0; !lllIllIlllII(10866, 2552); var17 = true) {
                                                                if (!lllIlllIIIII(var10000, 90)) {
                                                                    if (lllIllIlllII(10866, 2552)) {
                                                                        throw null;
                                                                    }

                                                                    for (var10000 = var11 = 90; !lllIllIlllII(10866, 2552); var17 = true) {
                                                                        if (!lllIlllIIIII(var10000, 180)) {
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glEnd();
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glEnable(3553);
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glDisable(2848);
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glEnable(3553);
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glScaled(2.0D, 2.0D, 2.0D);
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glPopAttrib();
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GlStateManager.enableTexture2D();
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GlStateManager.disableBlend();
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            GlStateManager.resetColor();
                                                                            if (lllIllIlllII(10866, 2552)) {
                                                                                throw null;
                                                                            }

                                                                            boolean var18 = true;
                                                                            return;
                                                                        }

                                                                        var16 = var5 - var9;
                                                                        var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                                        if (lllIllIlllII(10866, 2552)) {
                                                                            throw null;
                                                                        }

                                                                        var16 += var10001 * var9;
                                                                        var10001 = var3 + var9;
                                                                        var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                                        if (lllIllIlllII(10866, 2552)) {
                                                                            throw null;
                                                                        }

                                                                        var11 += 3;
                                                                        GL11.glVertex2d(var16, var10001 + var10002 * var9);
                                                                        if (lllIllIlllII(10866, 2552)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = var11;
                                                                    }

                                                                    throw null;
                                                                }

                                                                var16 = var5 - var9;
                                                                var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                                if (lllIllIlllII(10866, 2552)) {
                                                                    throw null;
                                                                }

                                                                var16 += var10001 * var9;
                                                                var10001 = var7 - var9;
                                                                var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                                if (lllIllIlllII(10866, 2552)) {
                                                                    throw null;
                                                                }

                                                                var11 += 3;
                                                                GL11.glVertex2d(var16, var10001 + var10002 * var9);
                                                                if (lllIllIlllII(10866, 2552)) {
                                                                    throw null;
                                                                }

                                                                var10000 = var11;
                                                            }

                                                            throw null;
                                                        }

                                                        var16 = var1 + var9;
                                                        var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                        if (lllIllIlllII(10866, 2552)) {
                                                            throw null;
                                                        }

                                                        var16 += var10001 * var9 * -1.0D;
                                                        var10001 = var7 - var9;
                                                        var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                        if (lllIllIlllII(10866, 2552)) {
                                                            throw null;
                                                        }

                                                        var10003 = var9 * -1.0D;
                                                        var11 += 3;
                                                        GL11.glVertex2d(var16, var10001 + var10002 * var10003);
                                                        if (lllIllIlllII(10866, 2552)) {
                                                            throw null;
                                                        }

                                                        var10000 = var11;
                                                    }

                                                    throw null;
                                                }

                                                var16 = var1 + var9;
                                                var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                if (lllIllIlllII(10866, 2552)) {
                                                    throw null;
                                                }

                                                var16 += var10001 * var9 * -1.0D;
                                                var10001 = var3 + var9;
                                                var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                if (lllIllIlllII(10866, 2552)) {
                                                    throw null;
                                                }

                                                var10003 = var9 * -1.0D;
                                                var11 += 3;
                                                GL11.glVertex2d(var16, var10001 + var10002 * var10003);
                                                if (lllIllIlllII(10866, 2552)) {
                                                    throw null;
                                                }

                                                var10000 = var11;
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
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4, int var5) {
        this. (var2 - 1.0F, var3 - 1.0F, (float) (this. (var1) + 1),(float) this.                                                                                            .
        fontRenderer.FONT_HEIGHT, var5);
        this.                                                                                  .
        drawString(var1, var2, var3, var4, true);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, int var3, float var4) {
        float var5 = 0.003921569F * (float) var1;
        float var6 = 0.003921569F * (float) var2;
        float var7 = 0.003921569F * (float) var3;
        GL11.glColor4f(var5, var6, var7, var4);
        if (lllIllIlllII(74015, 6765)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(String var1, float var2, float var3, int var4) {
        this.                                                                                  .
        drawStringNotNp(var1, var2, var3, var4);
        boolean var10000 = true;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(float var1, float var2, boolean var3, int var4) {
        GL11.glPushMatrix();
        if (lllIllIlllII(68133, 4521)) {
            throw null;
        } else {
            GL11.glScaled(1.3D, 1.3D, 1.3D);
            if (lllIllIlllII(68133, 4521)) {
                throw null;
            } else {
                var1 = (float) ((double) var1 / 1.3D);
                var2 = (float) ((double) var2 / 1.3D);
                GL11.glEnable(2848);
                if (lllIllIlllII(68133, 4521)) {
                    throw null;
                } else {
                    GL11.glDisable(3553);
                    if (lllIllIlllII(68133, 4521)) {
                        throw null;
                    } else {
                        this. (var4);
                        GL11.glLineWidth(2.0F);
                        if (lllIllIlllII(68133, 4521)) {
                            throw null;
                        } else {
                            GlStateManager.enableBlend();
                            if (lllIllIlllII(68133, 4521)) {
                                throw null;
                            } else {
                                GL11.glBegin(1);
                                if (lllIllIlllII(68133, 4521)) {
                                    throw null;
                                } else {
                                    double var10000 = (double) var1;
                                    byte var10002;
                                    boolean var10003;
                                    if (lllIlllIIlII(var3)) {
                                        var10002 = 4;
                                        var10003 = true;
                                    } else {
                                        if (lllIllIlllII(68133, 4521)) {
                                            throw null;
                                        }

                                        var10002 = 0;
                                    }

                                    if (lllIllIlllII(68133, 4521)) {
                                        throw null;
                                    } else {
                                        GL11.glVertex2d(var10000, (double) (var2 + (float) var10002));
                                        if (lllIllIlllII(68133, 4521)) {
                                            throw null;
                                        } else {
                                            var10000 = (double) (var1 + 3.0F);
                                            if (lllIlllIIlII(var3)) {
                                                var10002 = 0;
                                                var10003 = true;
                                            } else {
                                                if (lllIllIlllII(68133, 4521)) {
                                                    throw null;
                                                }

                                                var10002 = 4;
                                            }

                                            if (lllIllIlllII(68133, 4521)) {
                                                throw null;
                                            } else {
                                                GL11.glVertex2d(var10000, (double) (var2 + (float) var10002));
                                                if (lllIllIlllII(68133, 4521)) {
                                                    throw null;
                                                } else {
                                                    GL11.glEnd();
                                                    if (lllIllIlllII(68133, 4521)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glBegin(1);
                                                        if (lllIllIlllII(68133, 4521)) {
                                                            throw null;
                                                        } else {
                                                            var10000 = (double) (var1 + 3.0F);
                                                            if (lllIlllIIlII(var3)) {
                                                                var10002 = 0;
                                                                var10003 = true;
                                                            } else {
                                                                if (lllIllIlllII(68133, 4521)) {
                                                                    throw null;
                                                                }

                                                                var10002 = 4;
                                                            }

                                                            if (lllIllIlllII(68133, 4521)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glVertex2d(var10000, (double) (var2 + (float) var10002));
                                                                if (lllIllIlllII(68133, 4521)) {
                                                                    throw null;
                                                                } else {
                                                                    var10000 = (double) (var1 + 6.0F);
                                                                    if (lllIlllIIlII(var3)) {
                                                                        var10002 = 4;
                                                                        var10003 = true;
                                                                    } else {
                                                                        if (lllIllIlllII(68133, 4521)) {
                                                                            throw null;
                                                                        }

                                                                        var10002 = 0;
                                                                    }

                                                                    if (lllIllIlllII(68133, 4521)) {
                                                                        throw null;
                                                                    } else {
                                                                        GL11.glVertex2d(var10000, (double) (var2 + (float) var10002));
                                                                        if (lllIllIlllII(68133, 4521)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glEnd();
                                                                            if (lllIllIlllII(68133, 4521)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glEnable(3553);
                                                                                if (lllIllIlllII(68133, 4521)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GL11.glDisable(2848);
                                                                                    if (lllIllIlllII(68133, 4521)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.disableBlend();
                                                                                        if (lllIllIlllII(68133, 4521)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GlStateManager.resetColor();
                                                                                            if (lllIllIlllII(68133, 4521)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GL11.glPopMatrix();
                                                                                                if (lllIllIlllII(68133, 4521)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    boolean var5 = true;
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
    }

    public int ____________________________________________________________________________/* $FF was:                                                                             */(String var1) {
        return this.                                                                                  .
        getStringWidth(var1);
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4) {
        float var10000;
        float var6;
        if (lllIllIllllI((var6 = var1 - var3) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1))) {
            var10000 = var1;
            var1 = var3;
            var3 = var10000;
        }

        if (lllIllIlllII(21719, 6745)) {
            throw null;
        } else {
            float var7;
            if (lllIllIllllI((var7 = var2 - var4) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1))) {
                var10000 = var2;
                var2 = var4;
                var4 = var10000;
            }

            if (lllIllIlllII(21719, 6745)) {
                throw null;
            } else {
                GL11.glBegin(7);
                if (lllIllIlllII(21719, 6745)) {
                    throw null;
                } else {
                    GL11.glVertex2f(var1, var4);
                    if (lllIllIlllII(21719, 6745)) {
                        throw null;
                    } else {
                        GL11.glVertex2f(var3, var4);
                        if (lllIllIlllII(21719, 6745)) {
                            throw null;
                        } else {
                            GL11.glVertex2f(var3, var2);
                            if (lllIllIlllII(21719, 6745)) {
                                throw null;
                            } else {
                                GL11.glVertex2f(var1, var2);
                                if (lllIllIlllII(21719, 6745)) {
                                    throw null;
                                } else {
                                    GL11.glEnd();
                                    if (lllIllIlllII(21719, 6745)) {
                                        throw null;
                                    } else {
                                        boolean var5 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(float var1, float var2, float var3, float var4, int var5) {
        GL11.glPushMatrix();
        if (lllIllIlllII(88864, 31)) {
            throw null;
        } else {
            this. ();
            GlStateManager.glLineWidth(2.0F);
            if (lllIllIlllII(88864, 31)) {
                throw null;
            } else {
                this. (var5);
                this. (var1 + 0.2F, var2 + 0.2F, var3 - 0.2F, var4 - 0.2F);
                this. (var1, var2 + 0.3F, var3, var4, 0.8F, var5);
                GlStateManager.enableBlend();
                if (lllIllIlllII(88864, 31)) {
                    throw null;
                } else {
                    this. ();
                    GlStateManager.resetColor();
                    if (lllIllIlllII(88864, 31)) {
                        throw null;
                    } else {
                        GL11.glPopMatrix();
                        if (lllIllIlllII(88864, 31)) {
                            throw null;
                        } else {
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    public RenderItem ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (lllIllIlllII(87013, 9693)) {
            throw null;
        } else {
            return var10000.getRenderItem();
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Color var1, float var2) {
        GL11.glColor4f((float) var1.getRed() / 255.0F, (float) var1.getGreen() / 255.0F, (float) var1.getBlue() / 255.0F, var2);
        if (lllIllIlllII(46953, 8009)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (lllIllIlllII(49181, 9313)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, int var3, int var4, int var5, int var6) {
        float var7 = (float) (var5 >> 24 & 255) / 255.0F;
        float var8 = (float) (var5 >> 16 & 255) / 255.0F;
        float var9 = (float) (var5 >> 8 & 255) / 255.0F;
        float var14 = (float) (var5 & 255) / 255.0F;
        float var10 = (float) (var6 >> 24 & 255) / 255.0F;
        float var11 = (float) (var6 >> 16 & 255) / 255.0F;
        float var12 = (float) (var6 >> 8 & 255) / 255.0F;
        float var15 = (float) (var6 & 255) / 255.0F;
        GlStateManager.disableTexture2D();
        if (lllIllIlllII(61958, 6137)) {
            throw null;
        } else {
            GlStateManager.enableBlend();
            if (lllIllIlllII(61958, 6137)) {
                throw null;
            } else {
                GlStateManager.disableAlpha();
                if (lllIllIlllII(61958, 6137)) {
                    throw null;
                } else {
                    GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                    if (lllIllIlllII(61958, 6137)) {
                        throw null;
                    } else {
                        GlStateManager.shadeModel(7425);
                        if (lllIllIlllII(61958, 6137)) {
                            throw null;
                        } else {
                            Tessellator var10000 = Tessellator.getInstance();
                            if (lllIllIlllII(61958, 6137)) {
                                throw null;
                            } else {
                                BufferBuilder var13 = var10000.getBuffer();
                                var13.begin(7, DefaultVertexFormats.POSITION_COLOR);
                                var13.pos((double) var3, (double) var2, 0.0D).color(var8, var9, var14, var7).endVertex();
                                var13.pos((double) var1, (double) var2, 0.0D).color(var8, var9, var14, var7).endVertex();
                                var13.pos((double) var1, (double) var4, 0.0D).color(var11, var12, var15, var10).endVertex();
                                var13.pos((double) var3, (double) var4, 0.0D).color(var11, var12, var15, var10).endVertex();
                                var10000.draw();
                                GlStateManager.shadeModel(7424);
                                if (lllIllIlllII(61958, 6137)) {
                                    throw null;
                                } else {
                                    GlStateManager.disableBlend();
                                    if (lllIllIlllII(61958, 6137)) {
                                        throw null;
                                    } else {
                                        GlStateManager.enableAlpha();
                                        if (lllIllIlllII(61958, 6137)) {
                                            throw null;
                                        } else {
                                            GlStateManager.enableTexture2D();
                                            if (lllIllIlllII(61958, 6137)) {
                                                throw null;
                                            } else {
                                                boolean var16 = true;
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

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4) {
        this.                                                                                  .
        drawString(var1, var2, var3, var4, false);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        GlStateManager.enableBlend();
        if (lllIllIlllII(58778, 2639)) {
            throw null;
        } else {
            GlStateManager.disableTexture2D();
            if (lllIllIlllII(58778, 2639)) {
                throw null;
            } else {
                GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                if (lllIllIlllII(58778, 2639)) {
                    throw null;
                } else {
                    double var8 = (double) (var1 + var3);
                    double var10 = (double) (var2 + var4);
                    var3 = (float) (var7 >> 24 & 255) / 255.0F;
                    var4 = (float) (var7 >> 16 & 255) / 255.0F;
                    float var12 = (float) (var7 >> 8 & 255) / 255.0F;
                    float var14 = (float) (var7 & 255) / 255.0F;
                    GL11.glPushAttrib(0);
                    if (lllIllIlllII(58778, 2639)) {
                        throw null;
                    } else {
                        GL11.glScaled(0.5D, 0.5D, 0.5D);
                        if (lllIllIlllII(58778, 2639)) {
                            throw null;
                        } else {
                            var1 *= 2.0F;
                            var2 *= 2.0F;
                            var8 *= 2.0D;
                            var10 *= 2.0D;
                            GL11.glLineWidth(var6);
                            if (lllIllIlllII(58778, 2639)) {
                                throw null;
                            } else {
                                GL11.glDisable(3553);
                                if (lllIllIlllII(58778, 2639)) {
                                    throw null;
                                } else {
                                    GL11.glColor4f(var4, var12, var14, var3);
                                    if (lllIllIlllII(58778, 2639)) {
                                        throw null;
                                    } else {
                                        GL11.glEnable(2848);
                                        if (lllIllIlllII(58778, 2639)) {
                                            throw null;
                                        } else {
                                            GL11.glBegin(2);
                                            if (lllIllIlllII(58778, 2639)) {
                                                throw null;
                                            } else {
                                                int var13;
                                                boolean var16;
                                                for (int var10000 = var13 = 0; !lllIllIlllII(58778, 2639); var16 = true) {
                                                    double var15;
                                                    double var10001;
                                                    double var10002;
                                                    double var10003;
                                                    if (!lllIlllIIIII(var10000, 90)) {
                                                        if (lllIllIlllII(58778, 2639)) {
                                                            throw null;
                                                        }

                                                        for (var10000 = var13 = 90; !lllIllIlllII(58778, 2639); var16 = true) {
                                                            if (!lllIlllIIIII(var10000, 180)) {
                                                                if (lllIllIlllII(58778, 2639)) {
                                                                    throw null;
                                                                }

                                                                for (var10000 = var13 = 0; !lllIllIlllII(58778, 2639); var16 = true) {
                                                                    if (!lllIlllIIIII(var10000, 90)) {
                                                                        if (lllIllIlllII(58778, 2639)) {
                                                                            throw null;
                                                                        }

                                                                        for (var10000 = var13 = 90; !lllIllIlllII(58778, 2639); var16 = true) {
                                                                            if (!lllIlllIIIII(var10000, 180)) {
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glEnd();
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glEnable(3553);
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glDisable(2848);
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glEnable(3553);
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glScaled(2.0D, 2.0D, 2.0D);
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glPopAttrib();
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GlStateManager.enableTexture2D();
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GlStateManager.disableBlend();
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                GlStateManager.resetColor();
                                                                                if (lllIllIlllII(58778, 2639)) {
                                                                                    throw null;
                                                                                }

                                                                                boolean var17 = true;
                                                                                return;
                                                                            }

                                                                            var15 = var8 - (double) var5;
                                                                            var10001 = Math.sin((double) var13 * 3.141592653589793D / 180.0D);
                                                                            if (lllIllIlllII(58778, 2639)) {
                                                                                throw null;
                                                                            }

                                                                            var15 += var10001 * (double) var5;
                                                                            var10001 = (double) (var2 + var5);
                                                                            var10002 = Math.cos((double) var13 * 3.141592653589793D / 180.0D);
                                                                            if (lllIllIlllII(58778, 2639)) {
                                                                                throw null;
                                                                            }

                                                                            var10003 = (double) var5;
                                                                            var13 += 3;
                                                                            GL11.glVertex2d(var15, var10001 + var10002 * var10003);
                                                                            if (lllIllIlllII(58778, 2639)) {
                                                                                throw null;
                                                                            }

                                                                            var10000 = var13;
                                                                        }

                                                                        throw null;
                                                                    }

                                                                    var15 = var8 - (double) var5;
                                                                    var10001 = Math.sin((double) var13 * 3.141592653589793D / 180.0D);
                                                                    if (lllIllIlllII(58778, 2639)) {
                                                                        throw null;
                                                                    }

                                                                    var15 += var10001 * (double) var5;
                                                                    var10001 = var10 - (double) var5;
                                                                    var10002 = Math.cos((double) var13 * 3.141592653589793D / 180.0D);
                                                                    if (lllIllIlllII(58778, 2639)) {
                                                                        throw null;
                                                                    }

                                                                    var10003 = (double) var5;
                                                                    var13 += 3;
                                                                    GL11.glVertex2d(var15, var10001 + var10002 * var10003);
                                                                    if (lllIllIlllII(58778, 2639)) {
                                                                        throw null;
                                                                    }

                                                                    var10000 = var13;
                                                                }

                                                                throw null;
                                                            }

                                                            var15 = (double) (var1 + var5);
                                                            var10001 = Math.sin((double) var13 * 3.141592653589793D / 180.0D);
                                                            if (lllIllIlllII(58778, 2639)) {
                                                                throw null;
                                                            }

                                                            var15 += var10001 * (double) (var5 * -1.0F);
                                                            var10001 = var10 - (double) var5;
                                                            var10002 = Math.cos((double) var13 * 3.141592653589793D / 180.0D);
                                                            if (lllIllIlllII(58778, 2639)) {
                                                                throw null;
                                                            }

                                                            var10003 = (double) (var5 * -1.0F);
                                                            var13 += 3;
                                                            GL11.glVertex2d(var15, var10001 + var10002 * var10003);
                                                            if (lllIllIlllII(58778, 2639)) {
                                                                throw null;
                                                            }

                                                            var10000 = var13;
                                                        }

                                                        throw null;
                                                    }

                                                    var15 = (double) (var1 + var5);
                                                    var10001 = Math.sin((double) var13 * 3.141592653589793D / 180.0D);
                                                    if (lllIllIlllII(58778, 2639)) {
                                                        throw null;
                                                    }

                                                    var15 += var10001 * (double) (var5 * -1.0F);
                                                    var10001 = (double) (var2 + var5);
                                                    var10002 = Math.cos((double) var13 * 3.141592653589793D / 180.0D);
                                                    if (lllIllIlllII(58778, 2639)) {
                                                        throw null;
                                                    }

                                                    var10003 = (double) (var5 * -1.0F);
                                                    var13 += 3;
                                                    GL11.glVertex2d(var15, var10001 + var10002 * var10003);
                                                    if (lllIllIlllII(58778, 2639)) {
                                                        throw null;
                                                    }

                                                    var10000 = var13;
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
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
        this. ((double) var1, (double) var2, (double) var3, (double) var4, (double) var5, var8);
        this. (var1, var2, var3, var4, var5, var6, var7);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
        this. ((double) var2, (double) var3, (double) var4, (double) var5, (double) var6, var8);
        var2 = var2 + var4 / 2.0F - (float) (this. (var1) / 2);
        var3 = var3 + var5 / 2.0F - (float) (this..fontRenderer.FONT_HEIGHT / 2);
        this.                                                                                  .
        drawString(var1, var2, var3, var7, false);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4, int var5) {
        Gui.drawRect((int) var1, (int) var2, (int) var3, (int) var4, var5);
        if (lllIllIlllII(73537, 2836)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(Color var1) {
        GlStateManager.color((float) var1.getRed() / 255.0F, (float) var1.getGreen() / 255.0F, (float) var1.getBlue() / 255.0F, (float) var1.getAlpha() / 255.0F);
        if (lllIllIlllII(99758, 7524)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        float var2 = (float) (var1 >> 24 & 255) / 255.0F;
        float var3 = (float) (var1 >> 16 & 255) / 255.0F;
        float var4 = (float) (var1 >> 8 & 255) / 255.0F;
        float var5 = (float) (var1 & 255) / 255.0F;
        GL11.glColor4f(var3, var4, var5, var2);
        if (lllIllIlllII(72968, 6762)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        GL11.glDisable(2929);
        if (lllIllIlllII(71660, 9732)) {
            throw null;
        } else {
            GL11.glEnable(3042);
            if (lllIllIlllII(71660, 9732)) {
                throw null;
            } else {
                GL11.glDisable(3553);
                if (lllIllIlllII(71660, 9732)) {
                    throw null;
                } else {
                    GL11.glBlendFunc(770, 771);
                    if (lllIllIlllII(71660, 9732)) {
                        throw null;
                    } else {
                        GL11.glDepthMask(true);
                        if (lllIllIlllII(71660, 9732)) {
                            throw null;
                        } else {
                            GL11.glEnable(2848);
                            if (lllIllIlllII(71660, 9732)) {
                                throw null;
                            } else {
                                GL11.glHint(3154, 4354);
                                if (lllIllIlllII(71660, 9732)) {
                                    throw null;
                                } else {
                                    GL11.glHint(3155, 4354);
                                    if (lllIllIlllII(71660, 9732)) {
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

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1) {
        return this.                                                                                  .
        getStringWidthNotNp(var1);
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        GL11.glEnable(3553);
        if (lllIllIlllII(42470, 3025)) {
            throw null;
        } else {
            GL11.glEnable(2929);
            if (lllIllIlllII(42470, 3025)) {
                throw null;
            } else {
                GL11.glDisable(2848);
                if (lllIllIlllII(42470, 3025)) {
                    throw null;
                } else {
                    GL11.glHint(3154, 4352);
                    if (lllIllIlllII(42470, 3025)) {
                        throw null;
                    } else {
                        GL11.glHint(3155, 4352);
                        if (lllIllIlllII(42470, 3025)) {
                            throw null;
                        } else {
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ItemStack var1, int var2, int var3, float var4) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (lllIllIlllII(79341, 2861)) {
            throw null;
        } else {
            RenderItem var5 = var10000.getRenderItem();
            this. ((double) var2, (double) var3, 16.0D, 16.0D, 2.0D, Class73.                                                                                                  )
            ;
            GL11.glPushMatrix();
            if (lllIllIlllII(79341, 2861)) {
                throw null;
            } else {
                GL11.glScalef(-0.01F * var4, -0.01F * var4, -0.01F * var4);
                if (lllIllIlllII(79341, 2861)) {
                    throw null;
                } else {
                    GL11.glPushMatrix();
                    if (lllIllIlllII(79341, 2861)) {
                        throw null;
                    } else {
                        GlStateManager.enableDepth();
                        if (lllIllIlllII(79341, 2861)) {
                            throw null;
                        } else {
                            GlStateManager.disableLighting();
                            if (lllIllIlllII(79341, 2861)) {
                                throw null;
                            } else {
                                RenderHelper.enableGUIStandardItemLighting();
                                if (lllIllIlllII(79341, 2861)) {
                                    throw null;
                                } else {
                                    GL11.glPopMatrix();
                                    if (lllIllIlllII(79341, 2861)) {
                                        throw null;
                                    } else {
                                        var5.renderItemIntoGUI(var1, var2, var3);
                                        String var6 = "";
                                        if (lllIllIlllIl(var1.getCount(), 1)) {
                                            StringBuilder var7 = new StringBuilder;
                                            String var10002 = String.valueOf(var1.getCount());
                                            if (lllIllIlllII(79341, 2861)) {
                                                throw null;
                                            }

                                            var7.<init> (var10002);
                                            if (lllIllIlllII(79341, 2861)) {
                                                throw null;
                                            }

                                            var6 = String.valueOf(var7);
                                        }

                                        if (lllIllIlllII(79341, 2861)) {
                                            throw null;
                                        } else {
                                            var5.renderItemOverlayIntoGUI(this..fontRenderer, var1, var2, var3, var6);
                                            GlStateManager.disableLighting();
                                            if (lllIllIlllII(79341, 2861)) {
                                                throw null;
                                            } else {
                                                GL11.glPopMatrix();
                                                if (lllIllIlllII(79341, 2861)) {
                                                    throw null;
                                                } else {
                                                    boolean var8 = true;
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

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, boolean var3, int var4) {
        GL11.glPushMatrix();
        if (lllIllIlllII(98324, 6544)) {
            throw null;
        } else {
            byte var10000;
            if (lllIlllIIlIl(var3)) {
                var10000 = 1;
                boolean var10001 = true;
            } else {
                if (lllIllIlllII(98324, 6544)) {
                    throw null;
                }

                var10000 = 0;
            }

            if (lllIllIlllII(98324, 6544)) {
                throw null;
            } else {
                var3 = var10000;
                GL11.glScaled(1.3D, 1.3D, 1.3D);
                if (lllIllIlllII(98324, 6544)) {
                    throw null;
                } else {
                    var1 = (float) ((double) var1 / 1.3D);
                    var2 = (float) ((double) var2 / 1.3D);
                    GL11.glEnable(2848);
                    if (lllIllIlllII(98324, 6544)) {
                        throw null;
                    } else {
                        GL11.glDisable(3553);
                        if (lllIllIlllII(98324, 6544)) {
                            throw null;
                        } else {
                            this. (var4);
                            GL11.glLineWidth(2.0F);
                            if (lllIllIlllII(98324, 6544)) {
                                throw null;
                            } else {
                                GlStateManager.enableBlend();
                                if (lllIllIlllII(98324, 6544)) {
                                    throw null;
                                } else {
                                    GL11.glTranslatef(0.0F, 0.5F, 0.0F);
                                    if (lllIllIlllII(98324, 6544)) {
                                        throw null;
                                    } else {
                                        if (lllIlllIIlIl(var3)) {
                                            GL11.glTranslatef(-1.0F, 0.5F, 0.0F);
                                            if (lllIllIlllII(98324, 6544)) {
                                                throw null;
                                            }
                                        }

                                        if (lllIllIlllII(98324, 6544)) {
                                            throw null;
                                        } else {
                                            GL11.glBegin(1);
                                            if (lllIllIlllII(98324, 6544)) {
                                                throw null;
                                            } else {
                                                double var5 = (double) (var1 + 3.0F);
                                                byte var10002;
                                                boolean var10003;
                                                if (lllIlllIIlII(var3)) {
                                                    var10002 = 3;
                                                    var10003 = true;
                                                } else {
                                                    if (lllIllIlllII(98324, 6544)) {
                                                        throw null;
                                                    }

                                                    var10002 = 4;
                                                }

                                                if (lllIllIlllII(98324, 6544)) {
                                                    throw null;
                                                } else {
                                                    GL11.glVertex2d(var5, (double) (var2 + (float) var10002));
                                                    if (lllIllIlllII(98324, 6544)) {
                                                        throw null;
                                                    } else {
                                                        var5 = (double) var1;
                                                        if (lllIlllIIlII(var3)) {
                                                            var10002 = 0;
                                                            var10003 = true;
                                                        } else {
                                                            if (lllIllIlllII(98324, 6544)) {
                                                                throw null;
                                                            }

                                                            var10002 = 0;
                                                        }

                                                        if (lllIllIlllII(98324, 6544)) {
                                                            throw null;
                                                        } else {
                                                            GL11.glVertex2d(var5, (double) (var2 + (float) var10002));
                                                            if (lllIllIlllII(98324, 6544)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glEnd();
                                                                if (lllIllIlllII(98324, 6544)) {
                                                                    throw null;
                                                                } else {
                                                                    GL11.glBegin(1);
                                                                    if (lllIllIlllII(98324, 6544)) {
                                                                        throw null;
                                                                    } else {
                                                                        byte var6;
                                                                        boolean var8;
                                                                        if (lllIlllIIlII(var3)) {
                                                                            var6 = 3;
                                                                            var8 = true;
                                                                        } else {
                                                                            if (lllIllIlllII(98324, 6544)) {
                                                                                throw null;
                                                                            }

                                                                            var6 = 6;
                                                                        }

                                                                        if (lllIllIlllII(98324, 6544)) {
                                                                            throw null;
                                                                        } else {
                                                                            var5 = (double) (var1 + (float) var6);
                                                                            if (lllIlllIIlII(var3)) {
                                                                                var10002 = 3;
                                                                                var10003 = true;
                                                                            } else {
                                                                                if (lllIllIlllII(98324, 6544)) {
                                                                                    throw null;
                                                                                }

                                                                                var10002 = 0;
                                                                            }

                                                                            if (lllIllIlllII(98324, 6544)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glVertex2d(var5, (double) (var2 + (float) var10002));
                                                                                if (lllIllIlllII(98324, 6544)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    if (lllIlllIIlII(var3)) {
                                                                                        var6 = 0;
                                                                                        var8 = true;
                                                                                    } else {
                                                                                        if (lllIllIlllII(98324, 6544)) {
                                                                                            throw null;
                                                                                        }

                                                                                        var6 = 3;
                                                                                    }

                                                                                    if (lllIllIlllII(98324, 6544)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var5 = (double) (var1 + (float) var6);
                                                                                        if (lllIlllIIlII(var3)) {
                                                                                            var10002 = 6;
                                                                                            var10003 = true;
                                                                                        } else {
                                                                                            if (lllIllIlllII(98324, 6544)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var10002 = 4;
                                                                                        }

                                                                                        if (lllIllIlllII(98324, 6544)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GL11.glVertex2d(var5, (double) (var2 + (float) var10002));
                                                                                            if (lllIllIlllII(98324, 6544)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GL11.glEnd();
                                                                                                if (lllIllIlllII(98324, 6544)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GL11.glEnable(3553);
                                                                                                    if (lllIllIlllII(98324, 6544)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        GL11.glDisable(2848);
                                                                                                        if (lllIllIlllII(98324, 6544)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GlStateManager.disableBlend();
                                                                                                            if (lllIllIlllII(98324, 6544)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                GlStateManager.resetColor();
                                                                                                                if (lllIllIlllII(98324, 6544)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    GL11.glPopMatrix();
                                                                                                                    if (lllIllIlllII(98324, 6544)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        boolean var7 = true;
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
                        }
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4, boolean var5) {
        this.                                                                                  .
        drawString(var1, var2, var3, var4, var5);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1, double var3, double var5, double var7, double var9) {
        GlStateManager.enableBlend();
        if (lllIllIlllII(12751, 3747)) {
            throw null;
        } else {
            GlStateManager.disableTexture2D();
            if (lllIllIlllII(12751, 3747)) {
                throw null;
            } else {
                GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                if (lllIllIlllII(12751, 3747)) {
                    throw null;
                } else {
                    var5 += var1;
                    var7 += var3;
                    GL11.glPushAttrib(0);
                    if (lllIllIlllII(12751, 3747)) {
                        throw null;
                    } else {
                        GL11.glScaled(0.5D, 0.5D, 0.5D);
                        if (lllIllIlllII(12751, 3747)) {
                            throw null;
                        } else {
                            var1 *= 2.0D;
                            var3 *= 2.0D;
                            var5 *= 2.0D;
                            var7 *= 2.0D;
                            GL11.glDisable(3553);
                            if (lllIllIlllII(12751, 3747)) {
                                throw null;
                            } else {
                                GL11.glEnable(2848);
                                if (lllIllIlllII(12751, 3747)) {
                                    throw null;
                                } else {
                                    GL11.glBegin(9);
                                    if (lllIllIlllII(12751, 3747)) {
                                        throw null;
                                    } else {
                                        int var11;
                                        boolean var13;
                                        for (int var10000 = var11 = 0; !lllIllIlllII(12751, 3747); var13 = true) {
                                            double var12;
                                            double var10001;
                                            double var10002;
                                            double var10003;
                                            if (!lllIlllIIIII(var10000, 90)) {
                                                if (lllIllIlllII(12751, 3747)) {
                                                    throw null;
                                                }

                                                for (var10000 = var11 = 90; !lllIllIlllII(12751, 3747); var13 = true) {
                                                    if (!lllIlllIIIII(var10000, 180)) {
                                                        if (lllIllIlllII(12751, 3747)) {
                                                            throw null;
                                                        }

                                                        for (var10000 = var11 = 0; !lllIllIlllII(12751, 3747); var13 = true) {
                                                            if (!lllIlllIIIII(var10000, 90)) {
                                                                if (lllIllIlllII(12751, 3747)) {
                                                                    throw null;
                                                                }

                                                                for (var10000 = var11 = 90; !lllIllIlllII(12751, 3747); var13 = true) {
                                                                    if (!lllIlllIIIII(var10000, 180)) {
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glEnd();
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glEnable(3553);
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glDisable(2848);
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glEnable(3553);
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glScaled(2.0D, 2.0D, 2.0D);
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GL11.glPopAttrib();
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.enableTexture2D();
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.disableBlend();
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.resetColor();
                                                                        if (lllIllIlllII(12751, 3747)) {
                                                                            throw null;
                                                                        }

                                                                        boolean var14 = true;
                                                                        return;
                                                                    }

                                                                    var12 = var5 - var9;
                                                                    var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                                    if (lllIllIlllII(12751, 3747)) {
                                                                        throw null;
                                                                    }

                                                                    var12 += var10001 * var9;
                                                                    var10001 = var3 + var9;
                                                                    var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                                    if (lllIllIlllII(12751, 3747)) {
                                                                        throw null;
                                                                    }

                                                                    var11 += 3;
                                                                    GL11.glVertex2d(var12, var10001 + var10002 * var9);
                                                                    if (lllIllIlllII(12751, 3747)) {
                                                                        throw null;
                                                                    }

                                                                    var10000 = var11;
                                                                }

                                                                throw null;
                                                            }

                                                            var12 = var5 - var9;
                                                            var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                            if (lllIllIlllII(12751, 3747)) {
                                                                throw null;
                                                            }

                                                            var12 += var10001 * var9;
                                                            var10001 = var7 - var9;
                                                            var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                            if (lllIllIlllII(12751, 3747)) {
                                                                throw null;
                                                            }

                                                            var11 += 3;
                                                            GL11.glVertex2d(var12, var10001 + var10002 * var9);
                                                            if (lllIllIlllII(12751, 3747)) {
                                                                throw null;
                                                            }

                                                            var10000 = var11;
                                                        }

                                                        throw null;
                                                    }

                                                    var12 = var1 + var9;
                                                    var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                                    if (lllIllIlllII(12751, 3747)) {
                                                        throw null;
                                                    }

                                                    var12 += var10001 * var9 * -1.0D;
                                                    var10001 = var7 - var9;
                                                    var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                                    if (lllIllIlllII(12751, 3747)) {
                                                        throw null;
                                                    }

                                                    var10003 = var9 * -1.0D;
                                                    var11 += 3;
                                                    GL11.glVertex2d(var12, var10001 + var10002 * var10003);
                                                    if (lllIllIlllII(12751, 3747)) {
                                                        throw null;
                                                    }

                                                    var10000 = var11;
                                                }

                                                throw null;
                                            }

                                            var12 = var1 + var9;
                                            var10001 = Math.sin((double) var11 * 3.141592653589793D / 180.0D);
                                            if (lllIllIlllII(12751, 3747)) {
                                                throw null;
                                            }

                                            var12 += var10001 * var9 * -1.0D;
                                            var10001 = var3 + var9;
                                            var10002 = Math.cos((double) var11 * 3.141592653589793D / 180.0D);
                                            if (lllIllIlllII(12751, 3747)) {
                                                throw null;
                                            }

                                            var10003 = var9 * -1.0D;
                                            var11 += 3;
                                            GL11.glVertex2d(var12, var10001 + var10002 * var10003);
                                            if (lllIllIlllII(12751, 3747)) {
                                                throw null;
                                            }

                                            var10000 = var11;
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
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4, float var5, int var6) {
        this. (var6);
        GL11.glBegin(2);
        if (lllIllIlllII(13544, 8823)) {
            throw null;
        } else {
            GL11.glVertex2d((double) var1, (double) (var2 + var5));
            if (lllIllIlllII(13544, 8823)) {
                throw null;
            } else {
                GL11.glVertex2f(var1 + var5, var2);
                if (lllIllIlllII(13544, 8823)) {
                    throw null;
                } else {
                    GL11.glVertex2f(var3 - var5, var2);
                    if (lllIllIlllII(13544, 8823)) {
                        throw null;
                    } else {
                        GL11.glVertex2f(var3, var2 + var5);
                        if (lllIllIlllII(13544, 8823)) {
                            throw null;
                        } else {
                            GL11.glVertex2f(var3, var4 - var5);
                            if (lllIllIlllII(13544, 8823)) {
                                throw null;
                            } else {
                                GL11.glVertex2f(var3 - var5, var4);
                                if (lllIllIlllII(13544, 8823)) {
                                    throw null;
                                } else {
                                    GL11.glVertex2f(var1 + var5, var4);
                                    if (lllIllIlllII(13544, 8823)) {
                                        throw null;
                                    } else {
                                        GL11.glVertex2f(var1, var4 - var5);
                                        if (lllIllIlllII(13544, 8823)) {
                                            throw null;
                                        } else {
                                            GL11.glEnd();
                                            if (lllIllIlllII(13544, 8823)) {
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

    public Class195 ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return this.;
    }
}
