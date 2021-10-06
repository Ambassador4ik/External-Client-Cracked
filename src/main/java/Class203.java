import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.RenderLivingEvent.Specials.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class203 extends Class171 {
    public Class220;
    private static int 20451=-21438;
    private static int 5105=27696;
    private static int 5257=14661;
    private static int 10288=-11233;
    public Class220;
    private static int 91893=-4344;
    public Class220;
    public Class220;
    private static int 78000=-8155;
    private static int 65827=-18561;
    private static int 83341=-8801;
    public Class220;
    private static int 91627=-2281;
    private static int 6019=6782;
    private static int 6080=13313;
    private static int 86155=-27833;
    private static int 87066=-17667;
    private static int 7751=28714;
    private static int 4584=27328;
    public Class220;
    private static int 7058=19577;
    private static int 4670=3200;
    private static int 32788=-20312;
    private static int 6030=14649;
    private static int 31701=-9940;
    private static int 4403=29432;
    private static int 119=2457;
    public Class220;
    private static int 3488=20007;
    private static int 52002=-16777;
    private static int 75834=-27561;
    private static int 5599=27205;

    static {
        boolean var10000 = true;
    }

    public Class203() {
        String var10009 = Class60. ("Tzt:{O|:u(");
        if (lllIlIlIlIlI(87066, 4403)) {
            throw null;
        } else {
            super(var10009, 17, Class188.);
            if (lllIlIlIlIlI(87066, 4403)) {
                throw null;
            } else {
                Class220 var5 = new Class220;
                String var10011 = Class60. ("Lw<e>");
                if (lllIlIlIlIlI(87066, 4403)) {
                    throw null;
                } else {
                    var5.<init> (var10011, 30, this, 7.0D, 5.0D, 10.0D, false);
                    if (lllIlIlIlIlI(87066, 4403)) {
                        throw null;
                    } else {
                        this. = var5;
                        Class220 var10008 = new Class220;
                        String var10010 = Class60. ("^x4aze0~}z<r(");
                        if (lllIlIlIlIlI(87066, 4403)) {
                            throw null;
                        } else {
                            var10008.<init> (var10010, 31, this, true);
                            if (lllIlIlIlIlI(87066, 4403)) {
                                throw null;
                            } else {
                                this. = var10008;
                                Class220 var10007 = new Class220;
                                var10009 = Class60. ("Ow<q<");
                                if (lllIlIlIlIlI(87066, 4403)) {
                                    throw null;
                                } else {
                                    var10007.<init> (var10009, 32, this, true);
                                    if (lllIlIlIlIlI(87066, 4403)) {
                                        throw null;
                                    } else {
                                        this. = var10007;
                                        Class220 var10006 = new Class220;
                                        String var4 = Class60. ("W{<~7");
                                        if (lllIlIlIlIlI(87066, 4403)) {
                                            throw null;
                                        } else {
                                            var10006.<init> (var4, 34, this, true);
                                            if (lllIlIlIlIlI(87066, 4403)) {
                                                throw null;
                                            } else {
                                                this. = var10006;
                                                Class220 var10005 = new Class220;
                                                String var3 = Class60. ("K{<~6");
                                                if (lllIlIlIlIlI(87066, 4403)) {
                                                    throw null;
                                                } else {
                                                    var10005.<init> (var3, 35, this, false);
                                                    if (lllIlIlIlIlI(87066, 4403)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10005;
                                                        Class220 var10004 = new Class220;
                                                        String var2 = Class60. ("[i9wq)");
                                                        if (lllIlIlIlIlI(87066, 4403)) {
                                                            throw null;
                                                        } else {
                                                            var10004.<init> (var2, 33, this, true);
                                                            if (lllIlIlIlIlI(87066, 4403)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10004;
                                                                Class220 var10003 = new Class220;
                                                                String var1 = Class60. ("_u9yvz=tf(");
                                                                if (lllIlIlIlIlI(87066, 4403)) {
                                                                    throw null;
                                                                } else {
                                                                    var10003.<init> (var1, 167, this, true);
                                                                    if (lllIlIlIlIlI(87066, 4403)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var10003;
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
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

    private static boolean lllIlIlIllIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIlIllIlII(Object var0) {
        return var0 != null;
    }

    private static boolean lllIlIlIlIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIllIIlI(int var0) {
        return var0 == 0;
    }

    private static boolean lllIlIllIllI(int var0) {
        return var0 > 0;
    }

    private static boolean lllIlIllIIll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIlIlIllII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlIlIlIll(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIlIllIlll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllIlIllIlIl(Object var0) {
        return var0 == null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class195 var1, ItemStack var2, int var3, int var4, @Nullable String var5) {
        if (lllIlIllIIlI(var2.isEmpty())) {
            boolean var10001;
            if (!lllIlIlIllIl(var2.getCount(), 1) || lllIlIllIlII(var5)) {
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                String var10000;
                if (lllIlIllIlIl(var5)) {
                    var10000 = String.valueOf(var2.getCount());
                    if (lllIlIlIlIlI(20451, 7058)) {
                        throw null;
                    }

                    var10001 = true;
                } else {
                    if (lllIlIlIlIlI(20451, 7058)) {
                        throw null;
                    }

                    var10000 = var5;
                }

                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                String var6 = var10000;
                GlStateManager.disableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableBlend();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                var1.drawStringWithShadow(var6, (float) (var3 + 19 - 2 - var1.getStringWidth(var6)), (float) (var4 + 6 + 3), 16777215);
                GlStateManager.enableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }
            }

            if (lllIlIlIlIlI(20451, 7058)) {
                throw null;
            }

            Tessellator var14;
            if (lllIlIlIllII(var2.getItem().showDurabilityBar(var2))) {
                GlStateManager.disableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableTexture2D();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableAlpha();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableBlend();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                var14 = Tessellator.getInstance();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                BufferBuilder var10 = var14.getBuffer();
                double var7 = var2.getItem().getDurabilityForDisplay(var2);
                int var12 = var2.getItem().getRGBDurabilityForDisplay(var2);
                int var15 = Math.round(13.0F - (float) var7 * 13.0F);
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                int var9 = var15;
                this. (var10, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                this. (var10, var3 + 2, var4 + 13, var9, 1, var12 >> 16 & 255, var12 >> 8 & 255, var12 & 255, 255);
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableAlpha();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableTexture2D();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }
            }

            if (lllIlIlIlIlI(20451, 7058)) {
                throw null;
            }

            Minecraft var16 = Minecraft.getMinecraft();
            if (lllIlIlIlIlI(20451, 7058)) {
                throw null;
            }

            EntityPlayerSP var13;
            float var18;
            if (lllIlIllIlIl(var13 = var16.player)) {
                var18 = 0.0F;
                var10001 = true;
            } else {
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                CooldownTracker var19 = var13.getCooldownTracker();
                Item var17 = var2.getItem();
                Minecraft var10002 = Minecraft.getMinecraft();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                var18 = var19.getCooldown(var17, var10002.getRenderPartialTicks());
            }

            if (lllIlIlIlIlI(20451, 7058)) {
                throw null;
            }

            float var11 = var18;
            float var21;
            if (lllIlIllIllI((var21 = var11 - 0.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1))) {
                GlStateManager.disableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.disableTexture2D();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                var14 = Tessellator.getInstance();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                BufferBuilder var8 = var14.getBuffer();
                int var10004 = MathHelper.floor(16.0F * (1.0F - var11));
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                int var10003 = var4 + var10004;
                int var10005 = MathHelper.ceil(16.0F * var11);
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                this. (var8, var3, var10003, 16, var10005, 255, 255, 255, 127);
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableTexture2D();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableLighting();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }

                GlStateManager.enableDepth();
                if (lllIlIlIlIlI(20451, 7058)) {
                    throw null;
                }
            }
        }

        if (lllIlIlIlIlI(20451, 7058)) {
            throw null;
        } else {
            boolean var20 = true;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var1, int var2, int var3, float var4) {
        GL11.glPushMatrix();
        if (lllIlIlIlIlI(10288, 6080)) {
            throw null;
        } else {
            GL11.glScalef(-0.01F * var4, -0.01F * var4, 0.0F);
            if (lllIlIlIlIlI(10288, 6080)) {
                throw null;
            } else {
                GlStateManager.disableDepth();
                if (lllIlIlIlIlI(10288, 6080)) {
                    throw null;
                } else {
                    GlStateManager.disableLighting();
                    if (lllIlIlIlIlI(10288, 6080)) {
                        throw null;
                    } else {
                        Class4 var10002 = this.;
                        float var10003 = (float) var2;
                        float var10004 = (float) var3;
                        float var10005 = (float) (var2 + 16);
                        float var10006 = (float) (var3 + 16);
                        Color var10007 = new Color(0, 0, 0, 120);
                        if (lllIlIlIlIlI(10288, 6080)) {
                            throw null;
                        } else {
                            var10002. (var10003, var10004, var10005, var10006, var10007.getRGB());
                            GlStateManager.enableLighting();
                            if (lllIlIlIlIlI(10288, 6080)) {
                                throw null;
                            } else {
                                RenderHelper.enableStandardItemLighting();
                                if (lllIlIlIlIlI(10288, 6080)) {
                                    throw null;
                                } else {
                                    this.                                                                                           .
                                    ().renderItemIntoGUI(var1, var2, var3);
                                    RenderHelper.disableStandardItemLighting();
                                    if (lllIlIlIlIlI(10288, 6080)) {
                                        throw null;
                                    } else {
                                        String var5 = "";
                                        if (lllIlIlIlIll(var1.getCount(), 1)) {
                                            StringBuilder var10000 = new StringBuilder;
                                            String var28 = String.valueOf(var1.getCount());
                                            if (lllIlIlIlIlI(10288, 6080)) {
                                                throw null;
                                            }

                                            var10000.<init> (var28);
                                            if (lllIlIlIlIlI(10288, 6080)) {
                                                throw null;
                                            }

                                            var5 = String.valueOf(var10000);
                                        }

                                        if (lllIlIlIlIlI(10288, 6080)) {
                                            throw null;
                                        } else {
                                            this. (this.. (), var1, var2, var3, var5);
                                            GlStateManager.enableDepth();
                                            if (lllIlIlIlIlI(10288, 6080)) {
                                                throw null;
                                            } else {
                                                GlStateManager.disableLighting();
                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.disableDepth();
                                                    if (lllIlIlIlIlI(10288, 6080)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glPopMatrix();
                                                        if (lllIlIlIlIlI(10288, 6080)) {
                                                            throw null;
                                                        } else {
                                                            if (lllIlIlIllII(this.. ())){
                                                                var3 -= 28;
                                                                Enchantment var26 = Enchantment.getEnchantmentByID(0);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var25 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(7);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var6 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(34);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var7 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(70);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var8 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(2);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var9 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(8);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var10 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(71);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var11 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(10);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var12 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(22);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var13 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(16);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var14 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(21);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var15 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(51);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var16 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(48);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var17 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(49);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var18 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(50);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var19 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(19);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var20 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(20);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var21 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(32);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var22 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(33);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var23 = var27;
                                                                var26 = Enchantment.getEnchantmentByID(35);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = EnchantmentHelper.getEnchantmentLevel(var26, var1);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var24 = var27;
                                                                GL11.glPushMatrix();
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                GL11.glScalef(-0.005F * var4, -0.005F * var4, 0.0F);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                String var29 = Class60. ("½xO{p2");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                int var10001 = this.
                                                                (var11, var29, (float) var2, var3, false);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 -= var10001;
                                                                var29 = Class60. ("»~]uvy2");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this.
                                                                (var12, var29, (float) var2, var3, false);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Hk4");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var25, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Lq)");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var6, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Mw9");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var7, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("V\u007fv?");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var8, var29, (float) var2, var3, false)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("^|:");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var9, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("\\|+");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var10, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Kq:");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var14, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Wuw/");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var15, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Hm}>");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var13, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Vpzv5");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this.
                                                                (var16, var29, (float) var2, var3, false);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Hv,");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var17, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Hl5");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var18, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Yr}r>");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this.
                                                                (var19, var29, (float) var2, var3, false);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Ptw8");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var20, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("]sj>");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var21, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("]\u007f=");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var22, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("Lwp|0");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this.
                                                                (var23, var29, (float) var2, var3, false);
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var27 = var3 = var27 - var10001;
                                                                var29 = Class60. ("]oj/");
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var10001 = this. (var24, var29, (float) var2, var3, true)
                                                                ;
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }

                                                                var3 = var27 - var10001;
                                                                GL11.glPopMatrix();
                                                                if (lllIlIlIlIlI(10288, 6080)) {
                                                                    throw null;
                                                                }
                                                            }

                                                            if (lllIlIlIlIlI(10288, 6080)) {
                                                                throw null;
                                                            } else {
                                                                boolean var30 = true;
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

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BufferBuilder var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        var1.begin(7, DefaultVertexFormats.POSITION_COLOR);
        var1.pos((double) (var2 + 0), (double) (var3 + 0), 0.0D).color(var6, var7, var8, var9).endVertex();
        var1.pos((double) (var2 + 0), (double) (var3 + var5), 0.0D).color(var6, var7, var8, var9).endVertex();
        var1.pos((double) (var2 + var4), (double) (var3 + var5), 0.0D).color(var6, var7, var8, var9).endVertex();
        var1.pos((double) (var2 + var4), (double) (var3 + 0), 0.0D).color(var6, var7, var8, var9).endVertex();
        Tessellator var10000 = Tessellator.getInstance();
        if (lllIlIlIlIlI(65827, 6030)) {
            throw null;
        } else {
            var10000.draw();
            boolean var10 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Pre var1) {
        EntityLivingBase var2 = var1.getEntity();
        boolean var10000;
        if (lllIlIllIIlI(Class73..                                                                                                .                                                                                  ))
        {
            var10000 = true;
        } else if (lllIlIlIlIlI(91627, 4584)) {
            throw null;
        } else {
            Iterator var3 = this.                                                                                                    .
            world.playerEntities.iterator();

            while (!lllIlIlIlIlI(91627, 4584)) {
                if (!lllIlIlIllII(var3.hasNext())) {
                    if (lllIlIlIlIlI(91627, 4584)) {
                        throw null;
                    }

                    var10000 = true;
                    return;
                }

                EntityPlayer var4 = (EntityPlayer) var3.next();
                if (lllIlIlIllII(var2.getName().contains(var4.getName()))) {
                    var1.setCanceled(true);
                    var10000 = true;
                    return;
                }
            }

            throw null;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2) {
        GL11.glPushMatrix();
        if (lllIlIlIlIlI(78000, 5105)) {
            throw null;
        } else {
            GL11.glScalef(-0.01F * var2, -0.01F * var2, -0.01F * var2);
            if (lllIlIlIlIlI(78000, 5105)) {
                throw null;
            } else {
                var2 = (float) this.                                                                                           .
                (var1);
                float var3 = (float) (this..fontRenderer.FONT_HEIGHT + 1);
                Class4 var10001 = this.;
                float var10002 = -var2 / 2.0F - 1.0F;
                float var10004 = var2 / 2.0F + 1.0F;
                float var10005 = var3 - 1.0F;
                Color var10006 = new Color(0, 0, 0, 120);
                if (lllIlIlIlIlI(78000, 5105)) {
                    throw null;
                } else {
                    var10001. (var10002, 0.0F, var10004, var10005, var10006.getRGB());
                    this.                                                                                           .
                    (var1, (float) (-this.. (var1) / 2),1.0F, -1);
                    GL11.glPopMatrix();
                    if (lllIlIlIlIlI(78000, 5105)) {
                        throw null;
                    } else {
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var1) {
        if (lllIlIllIlII(var1) && lllIlIlIllII(var1.isEntityAlive()) && lllIlIllIlll(var1, this..player)){
            int var10000 = Class123. (var1);
            if (lllIlIlIlIlI(83341, 4670)) {
                throw null;
            }

            if (!lllIlIlIllIl(var10000, -1)) {
                if (lllIlIlIlIlI(83341, 4670)) {
                    throw null;
                }

                if (lllIlIlIllII(var1.isInvisible())) {
                    return this.                                                                                            .
                    ();
                }

                if (lllIlIlIlIlI(83341, 4670)) {
                    throw null;
                }

                return true;
            }
        }

        if (lllIlIlIlIlI(83341, 4670)) {
            throw null;
        } else {
            return false;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var1, float var2) {
        ArrayList var10000 = new ArrayList();
        if (lllIlIlIlIlI(31701, 119)) {
            throw null;
        } else {
            ArrayList var3 = var10000;
            Iterator var4 = var1.inventory.armorInventory.iterator();

            while (!lllIlIlIlIlI(31701, 119)) {
                boolean var10;
                if (!lllIlIlIllII(var4.hasNext())) {
                    if (lllIlIlIlIlI(31701, 119)) {
                        throw null;
                    }

                    ItemStack var8;
                    if (lllIlIllIIlI((var8 = var1.inventory.getCurrentItem()).getItem() instanceof ItemAir)) {
                        var3.add(var8);
                    }

                    if (lllIlIlIlIlI(31701, 119)) {
                        throw null;
                    }

                    if (lllIlIllIIlI((var8 = (ItemStack) var1.inventory.offHandInventory.get(0)).getItem() instanceof ItemAir)) {
                        var3.add(var8);
                    }

                    if (lllIlIlIlIlI(31701, 119)) {
                        throw null;
                    }

                    float var9 = (float) (-(var3.size() * 17) / 2);
                    byte var6 = -17;

                    Iterator var7;
                    boolean var10001;
                    for (Iterator var11 = var7 = var3.iterator(); !lllIlIlIlIlI(31701, 119); var10001 = true) {
                        if (!lllIlIlIllII(var11.hasNext())) {
                            if (lllIlIlIlIlI(31701, 119)) {
                                throw null;
                            }

                            var10 = true;
                            return;
                        }

                        var8 = (ItemStack) var7.next();
                        var11 = var7;
                        this. (var8, (int) var9, var6, var2);
                        if (lllIlIlIlIlI(31701, 119)) {
                            throw null;
                        }

                        var9 += 17.0F;
                    }

                    throw null;
                }

                ItemStack var5;
                if (lllIlIllIIlI((var5 = (ItemStack) var4.next()).getItem() instanceof ItemAir)) {
                    var3.add(var5);
                    var10 = true;
                }
            }

            throw null;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(EntityPlayer var1, float var2) {
        double var3;
        float var5 = (float) (((var3 = (double) this..player.getDistance(var1)) + 3.0D) / 10.0D / 50.0D * 20.0D)
        ;
        var3 = (var3 + 3.0D) / 100.0D * 40.0D / 100.0D * 6.0D + 2.1D;
        double var6 = 0.0D;
        if (lllIlIlIllII(var1.isSneaking())) {
            var6 = 0.4D;
        }

        if (lllIlIlIlIlI(75834, 5599)) {
            throw null;
        } else {
            double var8 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) * (double) var2;
            var3 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) * (double) var2 + var3 - var6;
            var6 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) * (double) var2;
            GlStateManager.pushMatrix();
            if (lllIlIlIlIlI(75834, 5599)) {
                throw null;
            } else {
                GlStateManager.disableTexture2D();
                if (lllIlIlIlIlI(75834, 5599)) {
                    throw null;
                } else {
                    GlStateManager.disableDepth();
                    if (lllIlIlIlIlI(75834, 5599)) {
                        throw null;
                    } else {
                        GlStateManager.enableBlend();
                        if (lllIlIlIlIlI(75834, 5599)) {
                            throw null;
                        } else {
                            GlStateManager.depthMask(false);
                            if (lllIlIlIlIlI(75834, 5599)) {
                                throw null;
                            } else {
                                GL11.glEnable(2848);
                                if (lllIlIlIlIlI(75834, 5599)) {
                                    throw null;
                                } else {
                                    RenderManager var10 = this.                                                                                                    .
                                    getRenderManager();
                                    GL11.glTranslated(var8 - var10.viewerPosX, var3 - var10.viewerPosY, var6 - var10.viewerPosZ);
                                    if (lllIlIlIlIlI(75834, 5599)) {
                                        throw null;
                                    } else {
                                        GL11.glRotatef(-var10.playerViewY, 0.0F, 1.0F, 0.0F);
                                        if (lllIlIlIlIlI(75834, 5599)) {
                                            throw null;
                                        } else {
                                            float var10000 = var10.playerViewX;
                                            float var10001;
                                            boolean var10002;
                                            if (lllIlIlIllIl(this..gameSettings.thirdPersonView,2)){
                                                var10001 = -1.0F;
                                                var10002 = true;
                                            } else{
                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                    throw null;
                                                }

                                                var10001 = 1.0F;
                                            }

                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                throw null;
                                            } else {
                                                GL11.glRotatef(var10000, var10001, 0.0F, 0.0F);
                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                    throw null;
                                                } else {
                                                    GL11.glScalef(var5, var5, var5);
                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                        throw null;
                                                    } else {
                                                        int var11;
                                                        String var13;
                                                        String var14;
                                                        boolean var15;
                                                        if (lllIlIlIlIll(var11 = (int) var1.getHealth(), 15)) {
                                                            var14 = Class60. (":");
                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                throw null;
                                                            }

                                                            var13 = var14;
                                                            var15 = true;
                                                        } else {
                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                throw null;
                                                            }

                                                            if (lllIlIlIlIll(var11, 10)) {
                                                                var14 = Class60. (">");
                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                    throw null;
                                                                }

                                                                var13 = var14;
                                                                var15 = true;
                                                            } else {
                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                    throw null;
                                                                }

                                                                if (lllIlIlIlIll(var11, 5)) {
                                                                    var14 = Class60. ("m");
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var13 = var14;
                                                                    var15 = true;
                                                                } else {
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var14 = Class60. ("8");
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var13 = var14;
                                                                }
                                                            }
                                                        }

                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                            throw null;
                                                        } else {
                                                            String var12 = "";
                                                            StringBuilder var18 = new StringBuilder();
                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                throw null;
                                                            } else {
                                                                var18 = var18.insert(0, var12);
                                                                StringBuilder var16;
                                                                String var10003;
                                                                String var19;
                                                                String var20;
                                                                if (lllIlIlIllII(this.. ())){
                                                                    var16 = new StringBuilder();
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var10003 = Class60. ("½:");
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var16 = var16.insert(0, var10003);
                                                                    int var17 = Class123. (var1);
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var16 = var16.append(var17);
                                                                    var19 = Class60. ("rm<¸)");
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var20 = String.valueOf(var16.append(var19));
                                                                    var10002 = true;
                                                                } else{
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    }

                                                                    var20 = "";
                                                                }

                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                    throw null;
                                                                } else {
                                                                    var12 = String.valueOf(var18.append(var20));
                                                                    var18 = new StringBuilder();
                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                        throw null;
                                                                    } else {
                                                                        var12 = String.valueOf(var18.insert(0, var12).append(var1.getDisplayName().getFormattedText()));
                                                                        var18 = new StringBuilder();
                                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                                            throw null;
                                                                        } else {
                                                                            var18 = var18.insert(0, var12);
                                                                            if (lllIlIlIllII(this.. ())){
                                                                                var16 = new StringBuilder();
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var10003 = Class60. (":ü");
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var16 = var16.insert(0, var10003).append(var13);
                                                                                double var21 = Math.ceil((double) var1.getHealth());
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var16 = var16.append((int) var21);
                                                                                var19 = Class60. ("½8");
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var16 = var16.append(var19);
                                                                                var19 = Class60. ("✿");
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var19 = Class123. (var19);
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var16 = var16.append(var19);
                                                                                var19 = Class60. ("½)");
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var20 = String.valueOf(var16.append(var19));
                                                                                var10002 = true;
                                                                            } else{
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                }

                                                                                var20 = "";
                                                                            }

                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                throw null;
                                                                            } else {
                                                                                var12 = String.valueOf(var18.append(var20));
                                                                                var18 = new StringBuilder();
                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var18 = var18.insert(0, var12);
                                                                                    if (lllIlIlIllII(this.. ())){
                                                                                        if (lllIlIlIllII(Class73..                                                                                                    .
                                                                                        (var1.getName()))){
                                                                                            var20 = Class60.
                                                                                            (";A¿y4½n\u0006");
                                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var10002 = true;
                                                                                        } else{
                                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var20 = Class60.
                                                                                            (";A¿/2½n\u0006");
                                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var10002 = true;
                                                                                        }
                                                                                    } else{
                                                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                                                            throw null;
                                                                                        }

                                                                                        var20 = "";
                                                                                    }

                                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this.
                                                                                        (String.valueOf(var18.append(var20)), (float) this.                                                                                           .
                                                                                        ());
                                                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            if (lllIlIlIllII(this.. ()))
                                                                                            {
                                                                                                this.
                                                                                                (var1, (float) this.                                                                                           .
                                                                                                ());
                                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                    throw null;
                                                                                                }
                                                                                            }

                                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GlStateManager.disableBlend();
                                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GlStateManager.depthMask(true);
                                                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        GL11.glDisable(2848);
                                                                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GlStateManager.enableTexture2D();
                                                                                                            if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                GlStateManager.enableDepth();
                                                                                                                if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    GlStateManager.popMatrix();
                                                                                                                    if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        GlStateManager.resetColor();
                                                                                                                        if (lllIlIlIlIlI(75834, 5599)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            var15 = true;
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
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        boolean var10001;
        int var2;
        for (int var10000 = var2 = 0; !lllIlIlIlIlI(91893, 3488); var10001 = true) {
            if (!lllIlIllIIll(var10000, this..world.playerEntities.size())){
                if (lllIlIlIlIlI(91893, 3488)) {
                    throw null;
                }

                boolean var5 = true;
                return;
            }

            EntityPlayer var3 = (EntityPlayer) this.                                                                                                    .
            world.playerEntities.get(var2);
            byte var4 = this. (var3);
            if (lllIlIlIlIlI(91893, 3488)) {
                throw null;
            }

            if (lllIlIlIllII(var4)) {
                this. (var3, var1.getPartialTicks());
            }

            if (lllIlIlIlIlI(91893, 3488)) {
                throw null;
            }

            ++var2;
            var10000 = var2;
        }

        throw null;
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, String var2, float var3, int var4, boolean var5) {
        if (lllIlIllIllI(var1)) {
            Class4 var10000 = this.;
            StringBuilder var10001 = new StringBuilder();
            if (lllIlIlIlIlI(32788, 6019)) {
                throw null;
            } else {
                var10001 = var10001.insert(0, var2);
                String var6;
                if (lllIlIlIllII(var5)) {
                    StringBuilder var10002 = new StringBuilder();
                    if (lllIlIlIlIlI(32788, 6019)) {
                        throw null;
                    }

                    String var10004 = Class60. ("{");
                    if (lllIlIlIlIlI(32788, 6019)) {
                        throw null;
                    }

                    var6 = String.valueOf(var10002.insert(0, var10004).append(var1));
                    boolean var10003 = true;
                } else {
                    if (lllIlIlIlIlI(32788, 6019)) {
                        throw null;
                    }

                    var6 = "";
                }

                if (lllIlIlIlIlI(32788, 6019)) {
                    throw null;
                } else {
                    var10000. (String.valueOf(var10001.append(var6)), var3 * 2.0F, (float) var4, -1, true);
                    return 10;
                }
            }
        } else if (lllIlIlIlIlI(32788, 6019)) {
            throw null;
        } else {
            return 0;
        }
    }
}
