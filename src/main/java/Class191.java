import java.awt.Color;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import org.lwjgl.opengl.GL11;

public class Class191 extends Class171 {
    private static int 77418=-4081;
    private static int 1650=564;
    public Class220;
    private static int 9773=1775;
    private static int 7693=2689;
    private static int 50432=-24024;
    private static int 87184=-16385;
    private static int 2667=30024;
    private static int 67611=-15323;
    private static int 3901=10850;
    private static int 35730=-16426;
    public Class220;
    private static int 63959=-17872;
    private static int 2974=31559;

    static {
        boolean var10000 = true;
    }

    public Class191() {
        String var10005 = Class60. ("Qd3d{1Zy8\u007f>");
        if (llIIlIlIlIlI(87184, 7693)) {
            throw null;
        } else {
            super(var10005, 112, Class188.);
            if (llIIlIlIlIlI(87184, 7693)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Z>O?\u000b");
                if (llIIlIlIlIlI(87184, 7693)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, this, true);
                    if (llIIlIlIlIlI(87184, 7693)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("\\qpp)");
                        if (llIIlIlIlIlI(87184, 7693)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, this, 3.0D);
                            if (llIIlIlIlIlI(87184, 7693)) {
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

    private static boolean llIIlIlIlIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlIlIllII(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlIlIllIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIlIlIlllI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIIlIlIlIll(int var0) {
        return var0 != 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIIlIlIlIll(var1 instanceof CPacketPlayerDigging) && !llIIlIlIlllI(((CPacketPlayerDigging) var1).getAction(), Action.ABORT_DESTROY_BLOCK)) {
            if (llIIlIlIlIlI(50432, 2974)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIIlIlIlIlI(50432, 2974)) {
            throw null;
        } else {
            return true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        if (llIIlIlIlIll(this.. ()) &&llIIlIlIllII(this..objectMouseOver) &&
        llIIlIlIllII(this..objectMouseOver.getBlockPos()) &&llIIlIlIllIl(this..objectMouseOver.typeOfHit, Type.BLOCK))
        {
            BlockPos var4 = this.                                                                                                    .
            objectMouseOver.getBlockPos();
            GlStateManager.pushMatrix();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.disableTexture2D();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.enableBlend();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.disableDepth();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.glLineWidth(2.0F);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GL11.glEnable(2848);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            RenderManager var2 = this.                                                                                                    .
            getRenderManager();
            GL11.glTranslated((double) var4.getX() - var2.viewerPosX, (double) var4.getY() - var2.viewerPosY, (double) var4.getZ() - var2.viewerPosZ);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            IBlockState var5 = this.                                                                                                    .
            world.getBlockState(var4);
            Color var3 = this.                                                                                            .
            ();
            GL11.glColor4f((float) var3.getRed(), (float) var3.getGreen(), (float) var3.getBlue(), 0.6F);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            Class181. (var5.getBoundingBox(this..world, var4));
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GL11.glColor4f((float) var3.getRed(), (float) var3.getGreen(), (float) var3.getBlue(), 0.2F);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            Class181. (var5.getBoundingBox(this..world, var4));
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.enableTexture2D();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.disableBlend();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.enableDepth();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GL11.glDisable(2848);
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.popMatrix();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }

            GlStateManager.resetColor();
            if (llIIlIlIlIlI(35730, 1650)) {
                throw null;
            }
        }

        if (llIIlIlIlIlI(35730, 1650)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (llIIlIlIllIl(var1.phase, Phase.END) && llIIlIlIllII(this..objectMouseOver) &&
        llIIlIlIllII(this..objectMouseOver.getBlockPos()) &&llIIlIlIllIl(this..objectMouseOver.typeOfHit, Type.BLOCK))
        {
            BlockPos var2 = this.                                                                                                    .
            objectMouseOver.getBlockPos();
            this.                                                                                                    .
            player.swingArm(EnumHand.MAIN_HAND);
            this.                                                                                                    .
            playerController.onPlayerDamageBlock(var2, this..player.getHorizontalFacing());
        }

        if (llIIlIlIlIlI(67611, 9773)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }
}
