import java.awt.Color;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class64 extends Class171 {
    private static int 57641=-23203;
    private static int 7546=22915;
    private static int 53680=-13560;
    private static int 65767=-7300;
    private static int 51070=-14544;
    public boolean;
    private static int 81546=-12498;
    private static int 5391=19353;
    private static int 1816=11537;
    private static int 72281=-10865;
    private static int 2988=27600;
    private static int 3780=8002;
    private static int 3623=3327;

    static {
        boolean var10000 = true;
    }

    public Class64() {
        String var10001 = Class60. ("@gv4zpp4hzm4qp(");
        if (llIlllIIllII(72281, 2988)) {
            throw null;
        } else {
            super(var10001, 19, Class188.);
            if (llIlllIIllII(72281, 2988)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIlllIlIIll(int var0) {
        return var0 != 0;
    }

    private static boolean llIlllIIlIlI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIlllIllIll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlllIlIIII(Object var0) {
        return var0 == null;
    }

    private static boolean llIlllIlIlIl(int var0) {
        return var0 <= 0;
    }

    private static boolean llIlllIllIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlllIIllII(int var0, int var1) {
        return var0 >= var1;
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Block var0) {
        if (llIlllIIlIlI(var0, Blocks.AIR) && llIlllIIlIlI(var0, Blocks.BEETROOTS) && llIlllIIlIlI(var0, Blocks.CARROTS) && llIlllIIlIlI(var0, Blocks.DEADBUSH) && llIlllIIlIlI(var0, Blocks.DOUBLE_PLANT) && llIlllIIlIlI(var0, Blocks.FLOWING_LAVA) && llIlllIIlIlI(var0, Blocks.FLOWING_WATER) && llIlllIIlIlI(var0, Blocks.LAVA) && llIlllIIlIlI(var0, Blocks.MELON_STEM) && llIlllIIlIlI(var0, Blocks.NETHER_WART) && llIlllIIlIlI(var0, Blocks.POTATOES) && llIlllIIlIlI(var0, Blocks.PUMPKIN_STEM) && llIlllIIlIlI(var0, Blocks.RED_FLOWER) && llIlllIIlIlI(var0, Blocks.RED_MUSHROOM) && llIlllIIlIlI(var0, Blocks.REDSTONE_TORCH) && llIlllIIlIlI(var0, Blocks.TALLGRASS) && llIlllIIlIlI(var0, Blocks.TORCH) && llIlllIIlIlI(var0, Blocks.UNLIT_REDSTONE_TORCH) && llIlllIIlIlI(var0, Blocks.YELLOW_FLOWER) && llIlllIIlIlI(var0, Blocks.VINE) && llIlllIIlIlI(var0, Blocks.WATER) && llIlllIIlIlI(var0, Blocks.WEB) && llIlllIIlIlI(var0, Blocks.WHEAT)) {
            return true;
        } else if (llIlllIIllII(81546, 5391)) {
            throw null;
        } else {
            return false;
        }
    }

    private static boolean llIlllIlIIIl(int var0) {
        return var0 == 0;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        this. = this.                                                                                                    .
        gameSettings.viewBobbing;
        EntityPlayerSP var2;
        ItemStack var3;
        boolean var33;
        if (llIlllIlIIII(var3 = (var2 = this..player).inventory.getCurrentItem())){
            var33 = true;
        } else if (llIlllIIllII(57641, 7546)) {
            throw null;
        } else {
            Item var4;
            if (llIlllIlIIIl((var4 = var3.getItem()) instanceof ItemBow) && llIlllIlIIIl(var4 instanceof ItemSnowball) && llIlllIlIIIl(var4 instanceof ItemEgg) && llIlllIlIIIl(var4 instanceof ItemEnderPearl) && llIlllIlIIIl(var4 instanceof ItemSplashPotion) && llIlllIlIIIl(var4 instanceof ItemLingeringPotion) && llIlllIlIIIl(var4 instanceof ItemFishingRod)) {
                var33 = true;
            } else if (llIlllIIllII(57641, 7546)) {
                throw null;
            } else {
                this.                                                                                                    .
                gameSettings.viewBobbing = false;
                Class22. (var1.getPartialTicks(), 2);
                if (llIlllIIllII(57641, 7546)) {
                    throw null;
                } else {
                    this.                                                                                                    .
                    gameSettings.viewBobbing = this.;
                    byte var25 = var3.getItem() instanceof ItemBow;
                    double var10001 = var2.lastTickPosX + (var2.posX - var2.lastTickPosX) * (double) var1.getPartialTicks();
                    double var10002 = Math.toRadians((double) var2.rotationYaw);
                    if (llIlllIIllII(57641, 7546)) {
                        throw null;
                    } else {
                        var10002 = Math.cos((double) ((float) var10002));
                        if (llIlllIIllII(57641, 7546)) {
                            throw null;
                        } else {
                            double var5 = var10001 - var10002 * 0.07999999821186066D;
                            double var7 = var2.lastTickPosY + (var2.posY - var2.lastTickPosY) * (double) var1.getPartialTicks() + (double) var2.getEyeHeight() - 0.04D;
                            double var10000 = var2.lastTickPosZ + (var2.posZ - var2.lastTickPosZ) * (double) var1.getPartialTicks();
                            var10001 = Math.toRadians((double) var2.rotationYaw);
                            if (llIlllIIllII(57641, 7546)) {
                                throw null;
                            } else {
                                var10001 = Math.sin((double) ((float) var10001));
                                if (llIlllIIllII(57641, 7546)) {
                                    throw null;
                                } else {
                                    double var9 = var10000 - var10001 * 0.07999999821186066D;
                                    float var30;
                                    boolean var31;
                                    if (llIlllIlIIll(var25)) {
                                        var30 = 1.0F;
                                        var31 = true;
                                    } else {
                                        if (llIlllIIllII(57641, 7546)) {
                                            throw null;
                                        }

                                        var30 = 0.4F;
                                    }

                                    if (llIlllIIllII(57641, 7546)) {
                                        throw null;
                                    } else {
                                        float var11 = var30;
                                        var10001 = Math.toRadians((double) var2.rotationYaw);
                                        if (llIlllIIllII(57641, 7546)) {
                                            throw null;
                                        } else {
                                            float var12 = (float) var10001;
                                            var10000 = Math.toRadians((double) var2.rotationPitch);
                                            if (llIlllIIllII(57641, 7546)) {
                                                throw null;
                                            } else {
                                                float var13 = (float) var10000;
                                                var10000 = Math.sin((double) var12);
                                                if (llIlllIIllII(57641, 7546)) {
                                                    throw null;
                                                } else {
                                                    var10000 = -var10000;
                                                    var10001 = Math.cos((double) var13);
                                                    if (llIlllIIllII(57641, 7546)) {
                                                        throw null;
                                                    } else {
                                                        double var14 = var10000 * var10001 * (double) var11;
                                                        var10000 = Math.sin((double) var13);
                                                        if (llIlllIIllII(57641, 7546)) {
                                                            throw null;
                                                        } else {
                                                            double var16 = -var10000 * (double) var11;
                                                            var10000 = Math.cos((double) var12);
                                                            if (llIlllIIllII(57641, 7546)) {
                                                                throw null;
                                                            } else {
                                                                var10001 = Math.cos((double) var13);
                                                                if (llIlllIIllII(57641, 7546)) {
                                                                    throw null;
                                                                } else {
                                                                    double var18 = var10000 * var10001 * (double) var11;
                                                                    var10000 = Math.sqrt(var14 * var14 + var16 * var16 + var18 * var18);
                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                        throw null;
                                                                    } else {
                                                                        double var20 = var10000;
                                                                        var14 /= var20;
                                                                        var16 /= var20;
                                                                        var18 /= var20;
                                                                        if (llIlllIlIIll(var25)) {
                                                                            var30 = var11 = (float) (72000 - var2.getItemInUseCount()) / 20.0F;
                                                                            float var41;
                                                                            float var42;
                                                                            if (!llIlllIlIlIl((var41 = (var11 = (var30 * var30 + var11 * 2.0F) / 3.0F) - 1.0F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1)) || llIlllIlIlIl((var42 = var11 - 0.1F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1))) {
                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                    throw null;
                                                                                }

                                                                                var11 = 1.0F;
                                                                            }

                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                throw null;
                                                                            }

                                                                            var11 *= 3.0F;
                                                                            var14 *= (double) var11;
                                                                            var16 *= (double) var11;
                                                                            var18 *= (double) var11;
                                                                            var33 = true;
                                                                        } else {
                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                throw null;
                                                                            }

                                                                            var14 *= 1.5D;
                                                                            var16 *= 1.5D;
                                                                            var18 *= 1.5D;
                                                                        }

                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glPushMatrix();
                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glDisable(3553);
                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GL11.glBlendFunc(770, 771);
                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GL11.glEnable(2848);
                                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GL11.glEnable(3042);
                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GL11.glDisable(2929);
                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GL11.glLineWidth(2.0F);
                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        RenderManager var29 = this.                                                                                                    .
                                                                                                        getRenderManager();
                                                                                                        if (llIlllIlIIll(var25)) {
                                                                                                            var10000 = 0.005D;
                                                                                                            var31 = true;
                                                                                                        } else {
                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            if (llIlllIlIIll(var4 instanceof ItemPotion)) {
                                                                                                                var10000 = 0.04D;
                                                                                                                var31 = true;
                                                                                                            } else {
                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                    throw null;
                                                                                                                }

                                                                                                                if (llIlllIlIIll(var4 instanceof ItemFishingRod)) {
                                                                                                                    var10000 = 0.015D;
                                                                                                                    var31 = true;
                                                                                                                } else {
                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                        throw null;
                                                                                                                    }

                                                                                                                    var10000 = 0.003D;
                                                                                                                }
                                                                                                            }
                                                                                                        }

                                                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            var20 = var10000;
                                                                                                            Vec3d var35 = new Vec3d(var2.posX, var2.posY + (double) var2.getEyeHeight(), var2.posZ);
                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                Vec3d var22 = var35;
                                                                                                                var25 = 0;
                                                                                                                Vec3d var32 = new Vec3d(var5, var7, var9);
                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    Vec3d var10003 = new Vec3d(var14, var16, var18);
                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        Color var23 = this.
                                                                                                                        (var22, var32, var10003, var20)
                                                                                                                        ;
                                                                                                                        GL11.glBegin(3);
                                                                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            int var37 = 0;
                                                                                                                            GL11.glColor3f((float) var23.getRed(), (float) var23.getGreen(), (float) var23.getBlue());
                                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                int var24 = 0;

                                                                                                                                while (!llIlllIIllII(57641, 7546)) {
                                                                                                                                    if (llIlllIllIIl(var37, 1000)) {
                                                                                                                                        GL11.glVertex3d(var5 - var29.viewerPosX, var7 - var29.viewerPosY, var9 - var29.viewerPosZ);
                                                                                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var5 += var14 * 0.1D;
                                                                                                                                        var7 += var16 * 0.1D;
                                                                                                                                        var9 += var18 * 0.1D;
                                                                                                                                        var14 *= 0.999D;
                                                                                                                                        var16 *= 0.999D;
                                                                                                                                        var18 *= 0.999D;
                                                                                                                                        var16 -= var20;
                                                                                                                                        Iterator var26 = this.                                                                                                    .
                                                                                                                                        world.loadedEntityList.iterator();

                                                                                                                                        Vec3d var34;
                                                                                                                                        AxisAlignedBB var38;
                                                                                                                                        byte var39;
                                                                                                                                        while (true) {
                                                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                throw null;
                                                                                                                                            }

                                                                                                                                            if (!llIlllIlIIll(var26.hasNext())) {
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                var39 = var25;
                                                                                                                                                break;
                                                                                                                                            }

                                                                                                                                            Entity var27;
                                                                                                                                            if (llIlllIlIIll((var27 = (Entity) var26.next()) instanceof EntityLiving)) {
                                                                                                                                                var38 = var27.getEntityBoundingBox().grow(0.35D, 0.35D, 0.35D);
                                                                                                                                                var34 = new Vec3d(var5, var7, var9);
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                if (llIlllIlIIll(var38.contains(var34))) {
                                                                                                                                                    var39 = var25 = 1;
                                                                                                                                                    var31 = true;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }

                                                                                                                                        if (llIlllIIllII(57641, 7546)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        if (llIlllIlIIll(var39)) {
                                                                                                                                            var33 = true;
                                                                                                                                        } else {
                                                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                throw null;
                                                                                                                                            }

                                                                                                                                            var26 = this.                                                                                                    .
                                                                                                                                            world.playerEntities.iterator();

                                                                                                                                            while (true) {
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                if (!llIlllIlIIll(var26.hasNext())) {
                                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var39 = var25;
                                                                                                                                                    break;
                                                                                                                                                }

                                                                                                                                                EntityPlayer var28;
                                                                                                                                                if (llIlllIIlIlI(var28 = (EntityPlayer) var26.next(), this..player))
                                                                                                                                                {
                                                                                                                                                    var38 = var28.getEntityBoundingBox().grow(0.35D, 0.35D, 0.35D);
                                                                                                                                                    var34 = new Vec3d(var5, var7, var9);
                                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    if (llIlllIlIIll(var38.contains(var34))) {
                                                                                                                                                        var39 = var25 = 1;
                                                                                                                                                        var31 = true;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                            if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                throw null;
                                                                                                                                            }

                                                                                                                                            if (llIlllIlIIll(var39)) {
                                                                                                                                                var33 = true;
                                                                                                                                            } else {
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                WorldClient var40 = this.                                                                                                    .
                                                                                                                                                world;
                                                                                                                                                BlockPos var36 = new BlockPos;
                                                                                                                                                var10003 = new Vec3d(var5, var7, var9);
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                var36.<init>
                                                                                                                                                (var10003);
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                var39 = (var40.getBlockState(var36).getBlock());
                                                                                                                                                if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                    throw null;
                                                                                                                                                }

                                                                                                                                                if (!llIlllIlIIll(var39)) {
                                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    ++var24;
                                                                                                                                                    var37 = var24;
                                                                                                                                                    var31 = true;
                                                                                                                                                    continue;
                                                                                                                                                }

                                                                                                                                                var33 = true;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }

                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glEnd();
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glEnable(2929);
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glDisable(2848);
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glDisable(3042);
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glEnable(3553);
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    GL11.glPopMatrix();
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    Class22.
                                                                                                                                    (var1.getPartialTicks(), 2)
                                                                                                                                    ;
                                                                                                                                    if (llIlllIIllII(57641, 7546)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    var33 = true;
                                                                                                                                    return;
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

    public protected private abstract final synchronized native void _??????????_??????????/* $FF was: _?????????? ??????????*/();

    public Color ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Vec3d var1, Vec3d var2, Vec3d var3, double var4) {
        byte var10 = 0;
        Color var10000 = new Color(0, 1, 0);
        if (llIlllIIllII(53680, 3623)) {
            throw null;
        } else {
            Color var6 = var10000;

            int var7;
            boolean var10001;
            for (int var11 = var7 = 0; !llIlllIIllII(53680, 3623); var10001 = true) {
                if (!llIlllIllIIl(var11, 250)) {
                    if (llIlllIIllII(53680, 3623)) {
                        throw null;
                    }

                    return var6;
                }

                var2 = var2.add(var3.scale(0.4D));
                Vec3d var12 = new Vec3d(var3.x * 0.996D, var3.y * 0.996D - var4 * 4.0D, var3.z * 0.996D);
                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                var3 = var12;
                Iterator var8 = this.                                                                                                    .
                world.loadedEntityList.iterator();

                byte var15;
                label117:
                {
                    while (true) {
                        if (llIlllIIllII(53680, 3623)) {
                            throw null;
                        }

                        if (!llIlllIlIIll(var8.hasNext())) {
                            break;
                        }

                        Entity var9;
                        if (!llIlllIlIIIl((var9 = (Entity) var8.next()) instanceof EntityLiving) || llIlllIlIIll(var9 instanceof EntityPlayer)) {
                            if (llIlllIIllII(53680, 3623)) {
                                throw null;
                            }

                            if (llIlllIlIIll(var9.getEntityBoundingBox().grow(0.22D, 0.35D, 0.25D).contains(var2))) {
                                var10 = 1;
                                Entity var13;
                                if (llIlllIlIIll(Class73..                                                                                                    .
                                (var9.getName()))){
                                    var10000 = new Color(0, 1, 1);
                                    if (llIlllIIllII(53680, 3623)) {
                                        throw null;
                                    }

                                    var6 = var10000;
                                    var13 = var9;
                                    var10001 = true;
                                } else{
                                    if (llIlllIIllII(53680, 3623)) {
                                        throw null;
                                    }

                                    var10000 = new Color(1, 0, 0);
                                    if (llIlllIIllII(53680, 3623)) {
                                        throw null;
                                    }

                                    var6 = var10000;
                                    var13 = var9;
                                }

                                if (llIlllIIllII(53680, 3623)) {
                                    throw null;
                                }

                                if (llIlllIllIll(var13, this..player)){
                                    var10000 = new Color(0, 1, 0);
                                    if (llIlllIIllII(53680, 3623)) {
                                        throw null;
                                    }

                                    var6 = var10000;
                                    var15 = var10;
                                    var10001 = true;
                                    break label117;
                                }
                                break;
                            }
                        }
                    }

                    if (llIlllIIllII(53680, 3623)) {
                        throw null;
                    }

                    var15 = var10;
                }

                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                if (llIlllIlIIll(var15)) {
                    return var6;
                }

                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                WorldClient var16 = this.                                                                                                    .
                world;
                BlockPos var14 = new BlockPos(var2);
                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                var15 = (var16.getBlockState(var14).getBlock());
                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                if (llIlllIlIIll(var15)) {
                    return var6;
                }

                if (llIlllIIllII(53680, 3623)) {
                    throw null;
                }

                ++var7;
                var11 = var7;
            }

            throw null;
        }
    }
}
