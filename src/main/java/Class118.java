import java.util.Iterator;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class118 extends Class171 {
    private static int 24100=-9567;
    private static int 58290=-14472;
    public Class220;
    private static int 28099=-9410;
    private static int 62154=-15577;
    private static int 6911=18827;
    public boolean;
    public Class220;
    public Class220;
    private static int 76219=-999;
    private static int 7023=20088;
    private static int 8904=17263;
    private static int 17789=-6804;
    private static int 4555=25325;
    public Class220;
    private static int 5163=4850;
    private static int 9622=5570;
    private static int 36503=-31319;
    private static int 7781=5344;

    static {
        boolean var10000 = true;
    }

    public Class118() {
        String var10006 = Class60. ("Ys|:moX:A\u000b");
        if (llllIIIllllI(24100, 5163)) {
            throw null;
        } else {
            super(var10006, 25, Class188.);
            if (llllIIIllllI(24100, 5163)) {
                throw null;
            } else {
                Class220 var2 = new Class220;
                String var10008 = Class60. ("^rj:jz=tq>");
                if (llllIIIllllI(24100, 5163)) {
                    throw null;
                } else {
                    var2.<init> (var10008, 60, this, true);
                    if (llllIIIllllI(24100, 5163)) {
                        throw null;
                    } else {
                        this. = var2;
                        Class220 var10005 = new Class220;
                        String var10007 = Class60. ("^{~v7qua/");
                        if (llllIIIllllI(24100, 5163)) {
                            throw null;
                        } else {
                            var10005.<init> (var10007, 143, this, false);
                            if (llllIIIllllI(24100, 5163)) {
                                throw null;
                            } else {
                                this. = var10005;
                                Class220 var10004 = new Class220;
                                var10006 = Class60. ("Ohy;|\u007fn(");
                                if (llllIIIllllI(24100, 5163)) {
                                    throw null;
                                } else {
                                    var10004.<init> (var10006, 144, this, false);
                                    if (llllIIIllllI(24100, 5163)) {
                                        throw null;
                                    } else {
                                        this. = var10004;
                                        Class220 var10003 = new Class220;
                                        String var1 = Class60. ("Yt9vq)");
                                        if (llllIIIllllI(24100, 5163)) {
                                            throw null;
                                        } else {
                                            var10003.<init> (var1, this, 41.0D);
                                            if (llllIIIllllI(24100, 5163)) {
                                                throw null;
                                            } else {
                                                this. = var10003;
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

    private static boolean llllIIIllllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIlIllII(Object var0) {
        return var0 != null;
    }

    private static boolean llllIIlIIlIl(int var0) {
        return var0 != 0;
    }

    private static boolean llllIIlIlIll(int var0) {
        return var0 == 0;
    }

    private static boolean llllIIlIlIII(int var0) {
        return var0 > 0;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        String var10002 = String.valueOf(this. ());
        if (llllIIIllllI(76219, 8904)) {
            throw null;
        } else {
            this. (var10002);
            Iterator var8 = this.                                                                                                    .
            world.loadedTileEntityList.iterator();

            while (!llllIIIllllI(76219, 8904)) {
                float var4;
                boolean var13;
                double var10000;
                if (!llllIIlIIlIl(var8.hasNext())) {
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    if (llllIIlIIlIl(this.. ())){
                        var8 = this.                                                                                                    .
                        world.loadedEntityList.iterator();

                        while (true) {
                            if (llllIIIllllI(76219, 8904)) {
                                throw null;
                            }

                            if (!llllIIlIIlIl(var8.hasNext())) {
                                break;
                            }

                            Entity var9;
                            if (llllIIlIIlIl((var9 = (Entity) var8.next()) instanceof EntityMinecartChest)) {
                                RenderManager var10 = this.                                                                                                    .
                                getRenderManager();
                                GlStateManager.pushMatrix();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.disableTexture2D();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.disableDepth();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.disableCull();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.enableBlend();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.depthMask(false);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GL11.glEnable(2848);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GL11.glTranslated(-var10.viewerPosX, -var10.viewerPosY, -var10.viewerPosZ);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.glLineWidth(2.0F);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                var4 = 0.2F;
                                if (llllIIlIIlIl(this.. ())){
                                    var10000 = MathHelper.clamp(this..player.getDistanceSq(var9) / 50.0D, 0.05D, 0.4D)
                                    ;
                                    if (llllIIIllllI(76219, 8904)) {
                                        throw null;
                                    }

                                    var4 = (float) (var10000 - 0.20000000298023224D);
                                }

                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                AxisAlignedBB var11 = var9.getEntityBoundingBox();
                                GL11.glColor4f(0.0F, 255.0F, 0.0F, var4);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                Class181. (var11);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GL11.glColor4f(0.0F, 255.0F, 0.0F, var4 + 0.2F);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                Class181. (var11);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.enableTexture2D();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.enableDepth();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.enableCull();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.disableBlend();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.depthMask(true);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GL11.glDisable(2848);
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.popMatrix();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                GlStateManager.resetColor();
                                if (llllIIIllllI(76219, 8904)) {
                                    throw null;
                                }

                                var13 = true;
                            }
                        }
                    }

                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    var13 = true;
                    return;
                }

                TileEntity var2;
                float var3;
                float var5;
                AxisAlignedBB var6;
                float var7;
                if (llllIIlIIlIl((var2 = (TileEntity) var8.next()) instanceof TileEntityChest)) {
                    var3 = (float) ((double) var2.getPos().getX() - this..getRenderManager().viewerPosX)
                    ;
                    var4 = (float) ((double) var2.getPos().getY() - this..getRenderManager().viewerPosY)
                    ;
                    var5 = (float) ((double) var2.getPos().getZ() - this..getRenderManager().viewerPosZ)
                    ;
                    var6 = this. ((TileEntityChest) var2);
                    GlStateManager.pushMatrix();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableTexture2D();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableDepth();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableCull();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableBlend();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.depthMask(false);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glEnable(2848);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glTranslated((double) var3, (double) var4, (double) var5);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.glLineWidth(2.0F);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    var7 = 0.2F;
                    if (llllIIlIIlIl(this.. ())){
                        var10000 = MathHelper.clamp(this..player.getDistanceSq(var2.getPos()) / 100.0D, 0.05D, 0.4D)
                        ;
                        if (llllIIIllllI(76219, 8904)) {
                            throw null;
                        }

                        var7 = (float) (var10000 - 0.20000000298023224D);
                    }

                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    this.                                                                                           .
                    (this.. (), var7);
                    Class181. (var6);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    this.                                                                                           .
                    (this.. (), var7 + 0.2F);
                    Class181. (var6);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableTexture2D();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableDepth();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableCull();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableBlend();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.depthMask(true);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glDisable(2848);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.popMatrix();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.resetColor();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }
                }

                if (llllIIIllllI(76219, 8904)) {
                    throw null;
                }

                if (llllIIlIIlIl(var2 instanceof TileEntityEnderChest)) {
                    var3 = (float) ((double) var2.getPos().getX() - this..getRenderManager().viewerPosX)
                    ;
                    var4 = (float) ((double) var2.getPos().getY() - this..getRenderManager().viewerPosY)
                    ;
                    var5 = (float) ((double) var2.getPos().getZ() - this..getRenderManager().viewerPosZ)
                    ;
                    AxisAlignedBB var12 = new AxisAlignedBB(0.95D, 0.9D, 0.95D, 0.05D, 0.0D, 0.05D);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    var6 = var12;
                    GlStateManager.pushMatrix();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableTexture2D();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableDepth();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableCull();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableBlend();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.depthMask(false);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glEnable(2848);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glTranslated((double) var3, (double) var4, (double) var5);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.glLineWidth(2.0F);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    var7 = 0.2F;
                    if (llllIIlIIlIl(this.. ())){
                        var10000 = MathHelper.clamp(this..player.getDistanceSq(var2.getPos()) / 100.0D, 0.05D, 0.4D)
                        ;
                        if (llllIIIllllI(76219, 8904)) {
                            throw null;
                        }

                        var7 = (float) (var10000 - 0.20000000298023224D);
                    }

                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glColor4f(255.0F, 0.0F, 255.0F, var7);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    Class181. (var6);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glColor4f(255.0F, 0.0F, 255.0F, var7 + 0.2F);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    Class181. (var6);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableTexture2D();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableDepth();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.enableCull();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.disableBlend();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.depthMask(true);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GL11.glDisable(2848);
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.popMatrix();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    GlStateManager.resetColor();
                    if (llllIIIllllI(76219, 8904)) {
                        throw null;
                    }

                    var13 = true;
                }
            }

            throw null;
        }
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        int var1 = 0;
        Iterator var2 = this.                                                                                                    .
        world.loadedTileEntityList.iterator();

        while (true) {
            boolean var10000;
            TileEntity var3;
            do {
                if (llllIIIllllI(36503, 6911)) {
                    throw null;
                }

                if (!llllIIlIIlIl(var2.hasNext())) {
                    if (llllIIIllllI(36503, 6911)) {
                        throw null;
                    }

                    if (llllIIlIIlIl(this.. ())){
                        var2 = this.                                                                                                    .
                        world.loadedEntityList.iterator();

                        while (true) {
                            if (llllIIIllllI(36503, 6911)) {
                                throw null;
                            }

                            if (!llllIIlIIlIl(var2.hasNext())) {
                                break;
                            }

                            if (llllIIlIIlIl((Entity) var2.next() instanceof EntityMinecartChest)) {
                                ++var1;
                                var10000 = true;
                            }
                        }
                    }

                    if (llllIIIllllI(36503, 6911)) {
                        throw null;
                    }

                    return var1;
                }
            } while (llllIIlIlIll((var3 = (TileEntity) var2.next()) instanceof TileEntityChest) && !llllIIlIIlIl(var3 instanceof TileEntityEnderChest));

            if (llllIIIllllI(36503, 6911)) {
                throw null;
            }

            ++var1;
            var10000 = true;
        }
    }

    public AxisAlignedBB ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntityChest var1) {
        float var10000;
        boolean var10001;
        if (llllIIlIllII(var1.adjacentChestXNeg)) {
            var10000 = -0.9F;
            var10001 = true;
        } else {
            if (llllIIIllllI(58290, 4555)) {
                throw null;
            }

            var10000 = 0.0F;
        }

        if (llllIIIllllI(58290, 4555)) {
            throw null;
        } else {
            float var2 = var10000;
            if (llllIIlIllII(var1.adjacentChestXPos)) {
                var10000 = 1.0F;
                var10001 = true;
            } else {
                if (llllIIIllllI(58290, 4555)) {
                    throw null;
                }

                var10000 = 0.0F;
            }

            if (llllIIIllllI(58290, 4555)) {
                throw null;
            } else {
                float var3 = var10000;
                if (llllIIlIllII(var1.adjacentChestZNeg)) {
                    var10000 = -0.9F;
                    var10001 = true;
                } else {
                    if (llllIIIllllI(58290, 4555)) {
                        throw null;
                    }

                    var10000 = 0.0F;
                }

                if (llllIIIllllI(58290, 4555)) {
                    throw null;
                } else {
                    float var4 = var10000;
                    if (llllIIlIllII(var1.adjacentChestZPos)) {
                        var10000 = 1.0F;
                        var10001 = true;
                    } else {
                        if (llllIIIllllI(58290, 4555)) {
                            throw null;
                        }

                        var10000 = 0.0F;
                    }

                    if (llllIIIllllI(58290, 4555)) {
                        throw null;
                    } else {
                        float var5 = var10000;
                        AxisAlignedBB var6 = new AxisAlignedBB(0.95D + (double) var3, 0.9D + (double) var2 + (double) var4, 0.95D + (double) var5 + (double) var2, 0.05D - (double) var2 - (double) var4, 0.0D, 0.05D - (double) var4);
                        if (llllIIIllllI(58290, 4555)) {
                            throw null;
                        } else {
                            return var6;
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    @SubscribeEvent
    public void ____________________________________________________________________________/* $FF was:                                                                             */(RenderWorldLastEvent var1) {
        boolean var12;
        if (llllIIlIIlIl(this.. ()) &&llllIIlIIlIl(Class73..                                                                                                .                                                                                  ))
        {
            this. = this.                                                                                                    .
            gameSettings.viewBobbing;
            this.                                                                                                    .
            gameSettings.viewBobbing = false;
            Class22. (var1.getPartialTicks(), 2);
            if (llllIIIllllI(28099, 9622)) {
                throw null;
            }

            this.                                                                                                    .
            gameSettings.viewBobbing = this.;
            Iterator var2 = this.                                                                                                    .
            world.loadedTileEntityList.iterator();

            while (true) {
                if (llllIIIllllI(28099, 9622)) {
                    throw null;
                }

                if (!llllIIlIIlIl(var2.hasNext())) {
                    if (llllIIIllllI(28099, 9622)) {
                        throw null;
                    }

                    Class22. (var1.getPartialTicks(), 2);
                    if (llllIIIllllI(28099, 9622)) {
                        throw null;
                    }
                    break;
                }

                TileEntity var3;
                if (llllIIlIIlIl((var3 = (TileEntity) var2.next()) instanceof TileEntityChest)) {
                    RenderManager var4 = this.                                                                                                    .
                    getRenderManager();
                    Vec3d var5 = this.                                                                                                    .
                    player.getLookVec().add(0.0D, (double) this..player.getEyeHeight(), 0.0D);
                    BlockPos var6 = var3.getPos();
                    AxisAlignedBB var8 = this.
                    ((TileEntityChest) var3).contract((double) (-var6.getX()), (double) (-var6.getY()), (double) (-var6.getZ())).contract((double) (-var6.getX()), (double) (-var6.getY()), (double) (-var6.getZ()));
                    Vec3d var10000 = new Vec3d(var8.minX + (var8.maxX - var8.minX) * 0.5D, var8.minY + (var8.maxY - var8.minY) * 0.5D, var8.minZ + (var8.maxZ - var8.minZ) * 0.5D);
                    if (llllIIIllllI(28099, 9622)) {
                        throw null;
                    }

                    Vec3d var7 = var10000.add(-var4.viewerPosX, -var4.viewerPosY, -var4.viewerPosZ);
                    long var10 = Math.round(var8.minY + (var8.maxY - var8.minY));
                    if (llllIIIllllI(28099, 9622)) {
                        throw null;
                    }

                    long var13;
                    if (llllIIlIlIII((var13 = var10 - (long) var3.getPos().getY()) == 0L ? 0 : (var13 < 0L ? -1 : 1))) {
                        GL11.glPushMatrix();
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glDisable(3553);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glBlendFunc(770, 771);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glEnable(2848);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glEnable(3042);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glDisable(2929);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glLineWidth(2.0F);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        float var9 = 1.0F;
                        if (llllIIlIIlIl(this.. ())){
                            double var11 = MathHelper.clamp(this..player.getDistanceSq(var3.getPos()) / 100.0D,
                            0.05D, 0.7D);
                            if (llllIIIllllI(28099, 9622)) {
                                throw null;
                            }

                            var9 = (float) var11;
                        }

                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        this.                                                                                           .
                        (this.. (), var9);
                        GL11.glBegin(1);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glVertex3d(var5.x, var5.y, var5.z);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glVertex3d(var7.x, var7.y, var7.z);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glEnd();
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glEnable(2929);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glDisable(2848);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glDisable(3042);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glEnable(3553);
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GL11.glPopMatrix();
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        GlStateManager.resetColor();
                        if (llllIIIllllI(28099, 9622)) {
                            throw null;
                        }

                        var12 = true;
                    }
                }
            }
        }

        if (llllIIIllllI(28099, 9622)) {
            throw null;
        } else {
            var12 = true;
        }
    }
}
