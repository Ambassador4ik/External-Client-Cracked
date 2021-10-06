import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class137 extends Class171 {
    private static int 13235=-23037;
    private static int 79515=-5212;
    private static int 49152=-29646;
    private static int 4896=21644;
    private static int 6754=23147;
    private static int 48093=-24764;
    private static int 9831=21910;
    private static final AxisAlignedBB;
    private static int 8833=6802;
    private static int 22834=-17242;
    public Class220;
    private static int 363=25920;
    private static int 76422=-10533;
    private static int 6346=18478;
    private static int 592=20859;
    private static int 26496=-15641;

    static {
        AxisAlignedBB var10000 = new AxisAlignedBB(-0.15000000596046448D, 0.0D, -0.15000000596046448D, 0.15000000596046448D, 0.30000001192092896D, 0.15000000596046448D);
        if (lllIlIlllIII(48093, 6754)) {
            throw null;
        } else {
                                                                                            =var10000;
            boolean var0 = true;
        }
    }

    public Class137() {
        String var10004 = Class60. ("So9\u007fs;XI2\u000b");
        if (lllIlIlllIII(76422, 363)) {
            throw null;
        } else {
            super(var10004, 92, Class188.);
            if (lllIlIlllIII(76422, 363)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("\\qpp)");
                if (lllIlIlllIII(76422, 363)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, this, 42.0D);
                    if (lllIlIlllIII(76422, 363)) {
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

    private static boolean lllIlIlllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        return var0 instanceof EntityItem;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        this. (var1);
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        this.                                                                                                    .
        world.getLoadedEntityList().stream().filter(Class137::).forEach(this::);
        boolean var10000 = true;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1) {
        double var2 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) * (double) this.                                                                                                    .
        getRenderPartialTicks() - this.                                                                                                    .
        getRenderManager().viewerPosX;
        double var4 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) * (double) this.                                                                                                    .
        getRenderPartialTicks() - this.                                                                                                    .
        getRenderManager().viewerPosY;
        double var6 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) * (double) this.                                                                                                    .
        getRenderPartialTicks() - this.                                                                                                    .
        getRenderManager().viewerPosZ;
        GlStateManager.pushMatrix();
        if (lllIlIlllIII(26496, 4896)) {
            throw null;
        } else {
            GlStateManager.disableTexture2D();
            if (lllIlIlllIII(26496, 4896)) {
                throw null;
            } else {
                GlStateManager.disableDepth();
                if (lllIlIlllIII(26496, 4896)) {
                    throw null;
                } else {
                    GlStateManager.disableCull();
                    if (lllIlIlllIII(26496, 4896)) {
                        throw null;
                    } else {
                        GlStateManager.enableBlend();
                        if (lllIlIlllIII(26496, 4896)) {
                            throw null;
                        } else {
                            GlStateManager.depthMask(false);
                            if (lllIlIlllIII(26496, 4896)) {
                                throw null;
                            } else {
                                GL11.glEnable(2848);
                                if (lllIlIlllIII(26496, 4896)) {
                                    throw null;
                                } else {
                                    GL11.glTranslated(var2, var4, var6);
                                    if (lllIlIlllIII(26496, 4896)) {
                                        throw null;
                                    } else {
                                        GlStateManager.glLineWidth(2.0F);
                                        if (lllIlIlllIII(26496, 4896)) {
                                            throw null;
                                        } else {
                                            this.                                                                                           .
                                            (this.. (), 0.2F);
                                            Class181. ();
                                            if (lllIlIlllIII(26496, 4896)) {
                                                throw null;
                                            } else {
                                                this.                                                                                           .
                                                (this.. (), 1.0F);
                                                Class181. ();
                                                if (lllIlIlllIII(26496, 4896)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.enableTexture2D();
                                                    if (lllIlIlllIII(26496, 4896)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.enableDepth();
                                                        if (lllIlIlllIII(26496, 4896)) {
                                                            throw null;
                                                        } else {
                                                            GlStateManager.enableCull();
                                                            if (lllIlIlllIII(26496, 4896)) {
                                                                throw null;
                                                            } else {
                                                                GlStateManager.disableBlend();
                                                                if (lllIlIlllIII(26496, 4896)) {
                                                                    throw null;
                                                                } else {
                                                                    GlStateManager.depthMask(true);
                                                                    if (lllIlIlllIII(26496, 4896)) {
                                                                        throw null;
                                                                    } else {
                                                                        GL11.glDisable(2848);
                                                                        if (lllIlIlllIII(26496, 4896)) {
                                                                            throw null;
                                                                        } else {
                                                                            GlStateManager.popMatrix();
                                                                            if (lllIlIlllIII(26496, 4896)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.resetColor();
                                                                                if (lllIlIlllIII(26496, 4896)) {
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
