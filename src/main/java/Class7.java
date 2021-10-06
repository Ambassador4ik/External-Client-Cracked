import java.awt.Color;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import org.lwjgl.opengl.GL11;

public class Class7 extends Class171 {
    public Class220;
    private static int 5587=1943;
    public Class220;
    private static int 3554=17565;
    private static int 55885=-12647;
    private static int 17465=-30106;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 5581=14528;
    private static int 77310=-18423;
    private static int 4034=8860;
    public Class220;
    private static int 8536=27911;
    private static int 1348=1705;
    private static int 5340=5233;
    private static int 1266=23331;
    private static int 96373=-31585;
    public Class220;
    private static int 65367=-481;
    private static int 32761=-21989;
    private static int 11172=-4098;
    private static int 51565=-25595;
    private static int 75587=-7603;
    private static int 4793=19959;
    private static int 44778=-19559;
    private static int 1613=17954;

    static {
        boolean var10000 = true;
    }

    public Class7() {
        String var10001 = Class60. ("^:K\u000b");
        if (llIlIIlllIIl(32761, 4793)) {
            throw null;
        } else {
            super(var10001, 14, Class188.);
            if (llIlIIlllIIl(32761, 4793)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Rq<{>");
                if (llIlIIlllIIl(32761, 4793)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("(\u001f");
                    if (llIlIIlllIIl(32761, 4793)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. (")\u001f");
                        if (llIlIIlllIIl(32761, 4793)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var1.<init> (var10003, 72, this, var10006);
                            if (llIlIIlllIIl(32761, 4793)) {
                                throw null;
                            } else {
                                this. = var1;
                                var1 = new Class220;
                                var10003 = Class60. ("Yt9vq)");
                                if (llIlIIlllIIl(32761, 4793)) {
                                    throw null;
                                } else {
                                    var10006 = new String[4];
                                    var10009 = Class60. ("Ynjnq6");
                                    if (llIlIIlllIIl(32761, 4793)) {
                                        throw null;
                                    } else {
                                        var10006[0] = var10009;
                                        var10009 = Class60. ("R~xvj3");
                                        if (llIlIIlllIIl(32761, 4793)) {
                                            throw null;
                                        } else {
                                            var10006[1] = var10009;
                                            var10009 = Class60. ("_sko~t\u007f>");
                                            if (llIlIIlllIIl(32761, 4793)) {
                                                throw null;
                                            } else {
                                                var10006[2] = var10009;
                                                var10009 = Class60. ("O\u007fy6");
                                                if (llIlIIlllIIl(32761, 4793)) {
                                                    throw null;
                                                } else {
                                                    var10006[3] = var10009;
                                                    var1.<init> (var10003, 28, this, var10006);
                                                    if (llIlIIlllIIl(32761, 4793)) {
                                                        throw null;
                                                    } else {
                                                        this. = var1;
                                                        Class220 var10008 = new Class220;
                                                        String var10010 = Class60. ("Ynj:jtp:Qt}:y)");
                                                        if (llIlIIlllIIl(32761, 4793)) {
                                                            throw null;
                                                        } else {
                                                            var10008.<init> (var10010, this, 3.0D);
                                                            if (llIlIIlllIIl(32761, 4793)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10008;
                                                                Class220 var10007 = new Class220;
                                                                var10009 = Class60. ("Kvy;f\u007fn(");
                                                                if (llIlIIlllIIl(32761, 4793)) {
                                                                    throw null;
                                                                } else {
                                                                    var10007.<init> (var10009, 69, this, true);
                                                                    if (llIlIIlllIIl(32761, 4793)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var10007;
                                                                        Class220 var4 = new Class220;
                                                                        String var7 = Class60. ("Rtnr?iuy3vu(");
                                                                        if (llIlIIlllIIl(32761, 4793)) {
                                                                            throw null;
                                                                        } else {
                                                                            var4.<init> (var7, 29, this, true);
                                                                            if (llIlIIlllIIl(32761, 4793)) {
                                                                                throw null;
                                                                            } else {
                                                                                this. = var4;
                                                                                Class220 var10005 = new Class220;
                                                                                String var6 = Class60. ("R|y3zsx3(");
                                                                                if (llIlIIlllIIl(32761, 4793)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var10005.<init>
                                                                                    (var6, 70, this, false);
                                                                                    if (llIlIIlllIIl(32761, 4793)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this. = var10005;
                                                                                        Class220 var10004 = new Class220;
                                                                                        String var5 = Class60.
                                                                                        ("^}~3dfq3)");
                                                                                        if (llIlIIlllIIl(32761, 4793)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            var10004.<init>
                                                                                            (var5, 71, this, false);
                                                                                            if (llIlIIlllIIl(32761, 4793)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                this. = var10004;
                                                                                                Class220 var2 = new Class220;
                                                                                                String var3 = Class60.
                                                                                                ("D~{7d^y7kTs7#");
                                                                                                if (llIlIIlllIIl(32761, 4793)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var2.<init>
                                                                                                    (var3, 43, this, false)
                                                                                                    ;
                                                                                                    if (llIlIIlllIIl(32761, 4793)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        this. = var2;
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
                                                                                                        this.
                                                                                                        ((Class220[]) (new Class220[]{this.}));
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
        }
    }

    private static boolean llIlIIlllIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIllllll(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIlllIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIlIIIIlI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIlIIIIII(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIlIIIIIl(int var0, int var1) {
        return var0 != var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1, float var2) {
        AxisAlignedBB var3 = var1.getEntityBoundingBox();
        double var4 = 0.0D;
        if (llIlIIlllIII(var1.isSneaking())) {
            var4 = 0.05D;
        }

        if (llIlIIlllIIl(51565, 5581)) {
            throw null;
        } else {
            double var6 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) * (double) var2 - this.                                                                                                    .
            getRenderManager().viewerPosX;
            double var8 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) * (double) var2 - this.                                                                                                    .
            getRenderManager().viewerPosY - var4;
            double var10 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) * (double) var2 - this.                                                                                                    .
            getRenderManager().viewerPosZ;
            double var12 = (var3.maxX - var3.minX) / 2.0D;
            double var14 = var3.maxY - var3.minY;
            double var16 = 0.0D;
            String var10000 = this.                                                                                                  .
            ();
            String var10001 = Class60. (")\u001f");
            if (llIlIIlllIIl(51565, 5581)) {
                throw null;
            } else {
                if (llIlIIlllIII(var10000.equals(var10001))) {
                    var16 = (var3.maxZ - var3.minZ) / 2.0D;
                }

                if (llIlIIlllIIl(51565, 5581)) {
                    throw null;
                } else {
                    GlStateManager.pushMatrix();
                    if (llIlIIlllIIl(51565, 5581)) {
                        throw null;
                    } else {
                        GlStateManager.disableTexture2D();
                        if (llIlIIlllIIl(51565, 5581)) {
                            throw null;
                        } else {
                            GlStateManager.disableDepth();
                            if (llIlIIlllIIl(51565, 5581)) {
                                throw null;
                            } else {
                                GlStateManager.disableCull();
                                if (llIlIIlllIIl(51565, 5581)) {
                                    throw null;
                                } else {
                                    GlStateManager.enableBlend();
                                    if (llIlIIlllIIl(51565, 5581)) {
                                        throw null;
                                    } else {
                                        GlStateManager.depthMask(false);
                                        if (llIlIIlllIIl(51565, 5581)) {
                                            throw null;
                                        } else {
                                            GL11.glEnable(2848);
                                            if (llIlIIlllIIl(51565, 5581)) {
                                                throw null;
                                            } else {
                                                GlStateManager.glLineWidth(2.0F);
                                                if (llIlIIlllIIl(51565, 5581)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.translate(var6, var8, var10);
                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                        throw null;
                                                    } else {
                                                        var10000 = this.                                                                                                  .
                                                        ();
                                                        var10001 = Class60. ("(\u001f");
                                                        if (llIlIIlllIIl(51565, 5581)) {
                                                            throw null;
                                                        } else {
                                                            AxisAlignedBB var23;
                                                            boolean var24;
                                                            if (llIlIIlllIII(var10000.equals(var10001))) {
                                                                GlStateManager.rotate(-this..getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F)
                                                                ;
                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                    throw null;
                                                                }

                                                                EntityLivingBase var20 = (EntityLivingBase) var1;
                                                                var6 = (double) (var20.getHealth() + var20.getAbsorptionAmount());
                                                                var8 = (double) (var20.getMaxHealth() + var20.getAbsorptionAmount());
                                                                var10 = 100.0D * var6 / var8;
                                                                double var18 = var14 * var6 / var8;
                                                                float var22 = (float) var10 / 50.0F;
                                                                this. (var1, 1.0F);
                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                    throw null;
                                                                }

                                                                if (llIlIIlllIII(var1 instanceof EntityPlayer) && !llIlIIlllIII(this..
                                                                ())){
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(-0.3499999940395355D, var4, 0.0D, 0.3499999940395355D, 1.8D - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    GL11.glColor4f(2.0F - var22, var22, 0.0F, 1.0F);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(0.550000011920929D, var4, 0.0D, 0.44999998807907104D, 1.8D - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(0.550000011920929D, var4, 0.0D, 0.44999998807907104D, 1.8D * var6 / var8 - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var24 = true;
                                                                } else{
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(-var12 - 0.05000000074505806D, var4, 0.0D, var12 + 0.05000000074505806D, var14 - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    GL11.glColor4f(2.0F - var22, var22, 0.0F, 1.0F);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(var12 + 0.25D, var4, 0.0D, var12 + 0.15000000596046448D, var14 - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var23 = new AxisAlignedBB(var12 + 0.25D, var4, 0.0D, var12 + 0.15000000596046448D, var18 - var4, 0.0D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var23);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    var24 = true;
                                                                }
                                                            } else {
                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                    throw null;
                                                                }

                                                                var10000 = this.                                                                                                  .
                                                                ();
                                                                var10001 = Class60. (")\u001f");
                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                    throw null;
                                                                }

                                                                if (llIlIIlllIII(var10000.equals(var10001))) {
                                                                    var23 = new AxisAlignedBB(0.3D, 0.0D, 0.3D, -0.3D, 1.8D, -0.3D);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    AxisAlignedBB var21 = var23;
                                                                    if (!llIlIIlllIII(var1 instanceof EntityPlayer) || llIlIIlllIII(this..
                                                                    ())){
                                                                        if (llIlIIlllIIl(51565, 5581)) {
                                                                            throw null;
                                                                        }

                                                                        var23 = new AxisAlignedBB(-var12, 0.0D, -var16, var12, var14, var16);
                                                                        if (llIlIIlllIIl(51565, 5581)) {
                                                                            throw null;
                                                                        }

                                                                        var21 = var23;
                                                                    }

                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    GlStateManager.resetColor();
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    this. (var1, 0.15F);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var21);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    GlStateManager.resetColor();
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    this. (var1, 1.0F);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    Class181. (var21);
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }

                                                                    GlStateManager.resetColor();
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    }
                                                                }
                                                            }

                                                            if (llIlIIlllIIl(51565, 5581)) {
                                                                throw null;
                                                            } else {
                                                                GlStateManager.enableCull();
                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                    throw null;
                                                                } else {
                                                                    GlStateManager.disableBlend();
                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                        throw null;
                                                                    } else {
                                                                        GlStateManager.depthMask(true);
                                                                        if (llIlIIlllIIl(51565, 5581)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glDisable(2848);
                                                                            if (llIlIIlllIIl(51565, 5581)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.enableTexture2D();
                                                                                if (llIlIIlllIIl(51565, 5581)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.enableDepth();
                                                                                    if (llIlIIlllIIl(51565, 5581)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.popMatrix();
                                                                                        if (llIlIIlllIIl(51565, 5581)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GlStateManager.resetColor();
                                                                                            if (llIlIIlllIIl(51565, 5581)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var24 = true;
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
        this. (this.. ());
        this.                                                                                                    .
        world.getLoadedEntityList().stream().filter(this::).forEach(this::);
        boolean var10000 = true;
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1, Entity var2) {
        this. (var2, var1.getPartialTicks());
        if (llIlIIlllIIl(75587, 1348)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        Class220 var10000 = this.;
        String var10001 = this.                                                                                     .();
        String var10002 = Class60. ("Ynjnq6");
        if (llIlIIlllIIl(44778, 1613)) {
            throw null;
        } else {
            var10000. (var10001.equals(var10002));
            boolean var2 = true;
        }
    }

    private boolean ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1) {
        if (llIlIIllllll(var1) && llIlIlIIIIII(var1 instanceof EntityArmorStand)) {
            label90:
            {
                if (llIlIIlllIII(var1 instanceof EntityPlayer)) {
                    int var10000 = Class123. ((EntityPlayer) var1);
                    if (llIlIIlllIIl(96373, 5340)) {
                        throw null;
                    }

                    if (!llIlIlIIIIIl(var10000, -1)) {
                        break label90;
                    }
                }

                if (llIlIIlllIIl(96373, 5340)) {
                    throw null;
                }

                if (llIlIlIIIIII(var1.isDead) && !llIlIlIIIIlI(var1, this..player)){
                if (llIlIIlllIIl(96373, 5340)) {
                    throw null;
                }

                if (llIlIlIIIIII(this.. ()) &&llIlIIlllIII(var1.isInvisible())){
                    return false;
                }

                if (llIlIIlllIIl(96373, 5340)) {
                    throw null;
                }

                if (llIlIIlllIII(var1 instanceof EntityPlayer)) {
                    return this.                                                                                  .();
                }

                if (llIlIIlllIIl(96373, 5340)) {
                    throw null;
                }

                if (llIlIlIIIIII(var1 instanceof EntityAnimal) && llIlIlIIIIII(var1 instanceof EntityVillager) && llIlIlIIIIII(var1 instanceof EntitySquid) && !llIlIIlllIII(var1 instanceof EntityBat)) {
                    if (llIlIIlllIIl(96373, 5340)) {
                        throw null;
                    }

                    if (llIlIlIIIIII(var1 instanceof EntityMob) && llIlIlIIIIII(var1 instanceof EntitySlime) && !llIlIIlllIII(var1 instanceof EntityGhast)) {
                        if (llIlIIlllIIl(96373, 5340)) {
                            throw null;
                        }

                        return false;
                    }

                    if (llIlIIlllIIl(96373, 5340)) {
                        throw null;
                    }

                    return this.                                                                                         .
                    ();
                }

                if (llIlIIlllIIl(96373, 5340)) {
                    throw null;
                }

                return this.                                                                              .();
            }
            }
        }

        if (llIlIIlllIIl(96373, 5340)) {
            throw null;
        } else {
            return false;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        boolean var10000 = this. (var1);
        if (llIlIIlllIIl(77310, 4034)) {
            throw null;
        } else {
            return var10000;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1, float var2) {
        String var10000 = this.                                                                                     .();
        String var10001 = Class60. ("Ynjnq6");
        if (llIlIIlllIIl(55885, 8536)) {
            throw null;
        } else {
            boolean var11;
            if (llIlIIlllIII(var10000.equals(var10001))) {
                this.                                                                                           .(this..
                (), var2);
                var11 = true;
            } else {
                if (llIlIIlllIIl(55885, 8536)) {
                    throw null;
                }

                var10000 = this.                                                                                     .
                ();
                var10001 = Class60. ("R~xvj3");
                if (llIlIIlllIIl(55885, 8536)) {
                    throw null;
                }

                if (llIlIIlllIII(var10000.equals(var10001))) {
                    EntityLivingBase var3;
                    EntityLivingBase var12 = var3 = (EntityLivingBase) var1;
                    double var4 = (double) (var12.getHealth() / 2.0F);
                    double var6 = (double) (var12.getMaxHealth() / 2.0F);
                    float var8 = (float) (100.0D * var4 / var6) / 50.0F;
                    GL11.glColor4f(2.0F - var8, var8, 0.0F, var2);
                    if (llIlIIlllIIl(55885, 8536)) {
                        throw null;
                    }

                    var11 = true;
                } else {
                    if (llIlIIlllIIl(55885, 8536)) {
                        throw null;
                    }

                    var10000 = this.                                                                                     .
                    ();
                    var10001 = Class60. ("O\u007fy6");
                    if (llIlIIlllIIl(55885, 8536)) {
                        throw null;
                    }

                    if (llIlIIlllIII(var10000.equals(var10001))) {
                        if (llIlIIlllIII(var1 instanceof EntityPlayer)) {
                            Color var13 = new Color;
                            FontRenderer var10002 = this.                                                                                                    .
                            fontRenderer;
                            char var10003 = Class13. ((EntityPlayer) var1);
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }

                            var13.<init> (var10002.getColorCode(var10003));
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }

                            Color var9 = var13;
                            GL11.glColor4f((float) var13.getRed() / 255.0F, (float) var9.getGreen() / 255.0F, (float) var9.getBlue() / 255.0F, var2);
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }

                            var11 = true;
                        } else {
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }

                            GL11.glColor4f(1.0F, 1.0F, 1.0F, var2);
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }

                            var11 = true;
                        }
                    } else {
                        if (llIlIIlllIIl(55885, 8536)) {
                            throw null;
                        }

                        var10000 = this.                                                                                     .
                        ();
                        var10001 = Class60. ("_sko~t\u007f>");
                        if (llIlIIlllIIl(55885, 8536)) {
                            throw null;
                        }

                        if (llIlIIlllIII(var10000.equals(var10001))) {
                            float var10 = this.                                                                                                    .
                            player.getDistance(var1) / 25.0F;
                            GL11.glColor4f(2.0F - var10, var10, 0.0F, var2);
                            if (llIlIIlllIIl(55885, 8536)) {
                                throw null;
                            }
                        }
                    }
                }
            }

            if (llIlIIlllIIl(55885, 8536)) {
                throw null;
            } else {
                if (llIlIIlllIII(Class73..                                                                                                    .
                (var1.getName()))){
                    GL11.glColor4f(0.0F, 1.0F, 1.0F, var2);
                    if (llIlIIlllIIl(55885, 8536)) {
                        throw null;
                    }
                }

                if (llIlIIlllIIl(55885, 8536)) {
                    throw null;
                } else {
                    var11 = true;
                }
            }
        }
    }
}
