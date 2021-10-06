import java.util.Iterator;

import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class13 {
    public static Minecraft;
    private static int 83011=-9190;
    private static int 89892=-18352;
    private static int 4436=20886;
    private static int 93777=-4805;
    private static int 4698=20264;
    private static int 8622=15942;
    private static int 40624=-32552;
    private static int 8383=25125;
    private static int 7151=12286;
    private static int 19173=-6454;
    private static int 1785=26128;
    private static int 4771=18958;
    private static int 8360=26421;
    private static int 5717=20217;
    private static int 8857=19449;
    private static int 8713=19513;
    private static int 58029=-17745;
    private static int 94445=-25093;
    private static int 83678=-32621;
    private static int 304=25840;
    private static int 20192=-3518;
    private static int 23696=-15144;
    private static int 8241=-21563;
    private static int 76372=-5319;
    private static int 34269=-12146;
    private static int 54286=-25782;
    private static int 60280=-16016;
    private static int 3135=6347;
    private static int 1418=15583;
    private static int 92673=-11348;
    private static int 60703=-5239;
    private static int 8547=1045;
    private static int 62535=-3107;
    private static int 293=8921;
    private static int 25368=-27938;
    private static int 4922=24220;
    private static int 75492=-13690;
    private static int 2725=10878;
    private static int 95681=-26192;
    private static int 7391=19362;
    private static int 21168=-20901;
    private static int 3257=27139;
    private static int 49875=-26487;
    private static int 44515=-10185;
    private static int 56567=-8150;
    private static int 1238=30505;
    private static int 95720=-2764;
    private static int 2517=4007;
    private static int 42707=-873;
    private static int 48386=-21936;
    private static int 96967=-13945;
    private static int 58266=-22112;
    private static int 91972=-24319;
    private static int 6274=30058;
    private static int 3033=19251;
    private static int 19574=-29468;
    private static int 76287=-6429;
    private static int 9150=12846;
    private static int 841=24313;
    private static int 67638=-22454;
    private static int 4088=22741;
    private static int 68271=-29692;
    private static int 6058=18384;
    private static int 4134=29823;
    private static int 5546=20434;
    private static int 4445=1721;
    private static int 1497=2581;
    private static int 23166=-27590;
    private static int 5183=18786;
    private static int 8213=30932;
    private static int 9201=9935;
    private static int 5907=1263;

    static {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIllIIlIIlI(44515, 2517)) {
            throw null;
        } else {
                                                                                            =var10000;
            boolean var0 = true;
        }
    }

    public Class13() {
        if (llIllIIlIIlI(95720, 293)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public static float[] ____________________________________________________________________________/* $FF was:                                                                             */(Entity var0, float var1) {
        double var2 = var0.posX -                                                                                   .
        player.posX;
        double var4 = var0.posZ -                                                                                   .
        player.posZ;
        double var6 = var0.posY -                                                                                   .
        player.posY - 0.5D;
        float var10000 = MathHelper.sqrt(var2 * var2 + var4 * var4);
        if (llIllIIlIIlI(58266, 1238)) {
            throw null;
        } else {
            double var8 = (double) var10000;
            double var12 = Math.atan2(var4, var2);
            if (llIllIIlIIlI(58266, 1238)) {
                throw null;
            } else {
                float var11 = (float) (var12 * 180.0D / 3.141592653589793D) - 90.0F;
                var12 = Math.atan2(var6, var8);
                if (llIllIIlIIlI(58266, 1238)) {
                    throw null;
                } else {
                    float var3 = (float) (-(var12 * 180.0D / 3.141592653589793D));
                    var10000 = (.player.rotationPitch, var3, var1);
                    if (llIllIIlIIlI(58266, 1238)) {
                        throw null;
                    } else {
                        float var10 = var10000;
                        var10000 = (.player.rotationYaw, var11, var1);
                        if (llIllIIlIIlI(58266, 1238)) {
                            throw null;
                        } else {
                            var1 = var10000;
                            return new float[]{var1, var10};
                        }
                    }
                }
            }
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, float var1, float var2, boolean var3, boolean var4) {
        double var10000 = var0.posX;
        double var10001;
        boolean var10002;
        if (llIllIIlIlll(var3)) {
            var10001 =                                                                                   .
            player.prevPosX;
            var10002 = true;
        } else {
            if (llIllIIlIIlI(56567, 4436)) {
                throw null;
            }

            var10001 =                                                                                   .
            player.posX;
        }

        if (llIllIIlIIlI(56567, 4436)) {
            throw null;
        } else {
            double var5 = var10000 - var10001;
            var10000 = var0.posZ;
            if (llIllIIlIlll(var3)) {
                var10001 =                                                                                   .
                player.prevPosZ;
                var10002 = true;
            } else {
                if (llIllIIlIIlI(56567, 4436)) {
                    throw null;
                }

                var10001 =                                                                                   .
                player.posZ;
            }

            if (llIllIIlIIlI(56567, 4436)) {
                throw null;
            } else {
                double var7 = var10000 - var10001;
                double var10 = (double) ((float) var0.posY + var0.getEyeHeight() * 0.7F) - (.player.posY + (
                double)                                                                                  .
                player.getEyeHeight());
                float var16 = MathHelper.sqrt(var5 * var5 + var7 * var7);
                if (llIllIIlIIlI(56567, 4436)) {
                    throw null;
                } else {
                    double var12 = (double) var16;
                    float var14 = 2.0F;
                    float var9 = 2.0F;
                    var10000 = Math.atan2(var7, var5);
                    if (llIllIIlIIlI(56567, 4436)) {
                        throw null;
                    } else {
                        var16 = (float) (var10000 * 180.0D / 3.141592653589793D - 90.0D);
                        float var17;
                        if (llIllIIlIlll(var4)) {
                            var17 = (-var14, var14);
                            if (llIllIIlIIlI(56567, 4436)) {
                                throw null;
                            }

                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(56567, 4436)) {
                                throw null;
                            }

                            var17 = 0.0F;
                        }

                        if (llIllIIlIIlI(56567, 4436)) {
                            throw null;
                        } else {
                            var14 = var16 + var17;
                            var10000 = Math.atan2(var10, var12);
                            if (llIllIIlIIlI(56567, 4436)) {
                                throw null;
                            } else {
                                var16 = (float) (-(var10000 * 180.0D / 3.141592653589793D));
                                if (llIllIIlIlll(var4)) {
                                    var17 = (-var9, var9);
                                    if (llIllIIlIIlI(56567, 4436)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else {
                                    if (llIllIIlIIlI(56567, 4436)) {
                                        throw null;
                                    }

                                    var17 = 0.0F;
                                }

                                if (llIllIIlIIlI(56567, 4436)) {
                                    throw null;
                                } else {
                                    float var15 = var16 + var17;
                                    var17 = MathHelper.wrapDegrees(var14 - var1);
                                    if (llIllIIlIIlI(56567, 4436)) {
                                        throw null;
                                    } else {
                                        var17 = Class109. (var17);
                                        if (llIllIIlIIlI(56567, 4436)) {
                                            throw null;
                                        } else {
                                            var14 = var1 + var17;
                                            var17 = MathHelper.wrapDegrees(var15 - var2);
                                            if (llIllIIlIIlI(56567, 4436)) {
                                                throw null;
                                            } else {
                                                var17 = Class109. (var17);
                                                if (llIllIIlIIlI(56567, 4436)) {
                                                    throw null;
                                                } else {
                                                    var16 = var2 + var17;
                                                    var17 += var2;
                                                    var16 = MathHelper.clamp(var16, -90.0F, 90.0F);
                                                    if (llIllIIlIIlI(56567, 4436)) {
                                                        throw null;
                                                    } else {
                                                        var15 = var16;
                                                        return new float[]{var14, var15};
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

    public static boolean ____________________________________________________________________________/* $FF was:                                                                             */() {
        if (llIllIIllIlI(.player.collidedHorizontally) &&
        llIllIIlIIlI(.player.getFoodStats().getFoodLevel() / 2, 3)){
            return true;
        } else if (llIllIIlIIlI(58029, 5183)) {
            throw null;
        } else {
            return false;
        }
    }

    public static EntityPlayer ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        if (llIllIIllIIl(var0)) {
            return null;
        } else if (llIllIIlIIlI(48386, 3257)) {
            throw null;
        } else {
            Iterator var1 =                                                                                   .
            world.loadedEntityList.iterator();

            while (!llIllIIlIIlI(48386, 3257)) {
                if (!llIllIIlIlll(var1.hasNext())) {
                    if (llIllIIlIIlI(48386, 3257)) {
                        throw null;
                    }

                    return null;
                }

                Entity var2 = (Entity) var1.next();
                if (llIllIIlIlll(var0.getName().contains(var2.getName())) && llIllIIllIlI(var2 instanceof EntityArmorStand) && llIllIIlIlll(var2 instanceof EntityPlayer)) {
                    return (EntityPlayer) var2;
                }
            }

            throw null;
        }
    }

    private static boolean llIllIIlIlll(int var0) {
        return var0 != 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, double var2, double var4) {
        double var6 = 0.0D;
        boolean var11;
        double var13;
        double var14;
        if (llIllIIllIlI((var13 = var4 - 0.0D) == 0.0D ? 0 : (var13 < 0.0D ? -1 : 1)) && llIllIIllIlI((var14 = var6 - 0.0D) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1))) {
                                                                                           .
            player.motionX = 0.0D;
                                                                                           .
            player.motionZ = 0.0D;
            var11 = true;
        } else if (llIllIIlIIlI(34269, 841)) {
            throw null;
        } else {
            double var15;
            if (llIllIIlIlll((var15 = var4 - 0.0D) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1))) {
                double var16;
                byte var10001;
                boolean var10002;
                if (llIllIIlIllI((var16 = var6 - 0.0D) == 0.0D ? 0 : (var16 < 0.0D ? -1 : 1))) {
                    double var17;
                    if (llIllIIlIllI((var17 = var4 - 0.0D) == 0.0D ? 0 : (var17 < 0.0D ? -1 : 1))) {
                        var10001 = -45;
                        var10002 = true;
                    } else {
                        if (llIllIIlIIlI(34269, 841)) {
                            throw null;
                        }

                        var10001 = 45;
                        var10002 = true;
                    }
                } else {
                    if (llIllIIlIIlI(34269, 841)) {
                        throw null;
                    }

                    double var18;
                    if (llIllIIlIllI((var18 = var4 - 0.0D) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1))) {
                        var10001 = 45;
                        var10002 = true;
                    } else {
                        if (llIllIIlIIlI(34269, 841)) {
                            throw null;
                        }

                        var10001 = -45;
                    }
                }

                if (llIllIIlIIlI(34269, 841)) {
                    throw null;
                }

                var2 += (double) var10001;
                var6 = 0.0D;
                byte var10000;
                double var19;
                if (llIllIIlIllI((var19 = var4 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                    var10000 = 1;
                    boolean var12 = true;
                } else {
                    if (llIllIIlIIlI(34269, 841)) {
                        throw null;
                    }

                    var10000 = -1;
                }

                if (llIllIIlIIlI(34269, 841)) {
                    throw null;
                }

                var4 = (double) var10000;
            }

            if (llIllIIlIIlI(34269, 841)) {
                throw null;
            } else {
                double var10 = Math.toRadians(var2);
                if (llIllIIlIIlI(34269, 841)) {
                    throw null;
                } else {
                    var10 = Math.cos(var10 + 90.0D);
                    if (llIllIIlIIlI(34269, 841)) {
                        throw null;
                    } else {
                        double var8 = var10;
                        var10 = Math.toRadians(var2);
                        if (llIllIIlIIlI(34269, 841)) {
                            throw null;
                        } else {
                            var10 = Math.sin(var10 + 90.0D);
                            if (llIllIIlIIlI(34269, 841)) {
                                throw null;
                            } else {
                                var2 = var10;
                                                                                                          .
                                player.motionX = var4 * var0 + var6 * var8 * var0 * var2;
                                                                                                          .
                                player.motionZ = var4 * var0 - var6 * var2 * var0 * var8;
                                var11 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        float var0;
        float var1;
        if (llIllIIllIlI((var0 =.player.moveForward - 0.0F) == 0.0F ? 0 : (var0 < 0.0F ? -1 : 1)) &&
        !llIllIIlIlll((var1 =.player.moveStrafing - 0.0F) == 0.0F ? 0 : (var1 < 0.0F ? -1 : 1))){
            if (llIllIIlIIlI(23696, 5907)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIllIIlIIlI(23696, 5907)) {
            throw null;
        } else {
            return true;
        }
    }

    private static boolean llIllIIlIllI(int var0) {
        return var0 > 0;
    }

    private static boolean llIllIIlIlIl(int var0) {
        return var0 < 0;
    }

    public static double ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityLivingBase var0) {
        double var1 = (double) var0.getHealth();
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIllIIlIIlI(8241, 3033)) {
            throw null;
        } else {
            double var3 = (double) var10000.player.getDistance(var0);
            double var5 = 0.0D;
            if (llIllIIlIlll(var0.isInLava())) {
                var5 += 10.0D;
            }

            if (llIllIIlIIlI(8241, 3033)) {
                throw null;
            } else {
                if (llIllIIlIlll(var0.isInWater())) {
                    var5 += 10.0D;
                }

                if (llIllIIlIIlI(8241, 3033)) {
                    throw null;
                } else {
                    if (llIllIIlIlll(var0.isInsideOfMaterial(Material.WEB))) {
                        var5 += 20.0D;
                    }

                    if (llIllIIlIIlI(8241, 3033)) {
                        throw null;
                    } else {
                        var10000 = Minecraft.getMinecraft();
                        if (llIllIIlIIlI(8241, 3033)) {
                            throw null;
                        } else {
                            WorldClient var8 = var10000.world;
                            BlockPos var10001 = new BlockPos(var0.posX, var0.posY, var0.posZ);
                            if (llIllIIlIIlI(8241, 3033)) {
                                throw null;
                            } else {
                                if (llIllIlIIIll(var8.getBlockState(var10001).getBlock(), Blocks.WEB)) {
                                    var5 += 10.0D;
                                }

                                if (llIllIIlIIlI(8241, 3033)) {
                                    throw null;
                                } else {
                                    float var11;
                                    if (llIllIIlIllI((var11 = var0.rotationPitch - 50.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1))) {
                                        var5 += 10.0D;
                                    }

                                    if (llIllIIlIIlI(8241, 3033)) {
                                        throw null;
                                    } else {
                                        if (llIllIIlIlll(var0.isWet())) {
                                            var5 += 10.0D;
                                        }

                                        if (llIllIIlIIlI(8241, 3033)) {
                                            throw null;
                                        } else {
                                            if (llIllIIlIlll(var0.isInvisible())) {
                                                var5 -= 10.0D;
                                            }

                                            if (llIllIIlIIlI(8241, 3033)) {
                                                throw null;
                                            } else {
                                                ItemStack var7;
                                                if (llIllIlIIlII(var7 = var0.getHeldItemMainhand()) && llIllIIllIlI(var7.getItem() instanceof ItemAir) && llIllIlIIIll(var7.getItem(), Items.TOTEM_OF_UNDYING)) {
                                                    var5 += 10.0D;
                                                }

                                                if (llIllIIlIIlI(8241, 3033)) {
                                                    throw null;
                                                } else {
                                                    EntityLivingBase var9;
                                                    label145:
                                                    {
                                                        if (llIllIlIIlII(var7) && llIllIIllIlI(var7.getItem() instanceof ItemAir)) {
                                                            boolean var10;
                                                            if (llIllIIlIlll(var7.getItem() instanceof ItemAppleGold)) {
                                                                var5 += 20.0D;
                                                                var9 = var0;
                                                                var10 = true;
                                                                break label145;
                                                            }

                                                            if (llIllIIlIIlI(8241, 3033)) {
                                                                throw null;
                                                            }

                                                            if (llIllIIlIlll(var7.getItem() instanceof ItemEnderPearl)) {
                                                                var5 += 20.0D;
                                                                var9 = var0;
                                                                var10 = true;
                                                                break label145;
                                                            }

                                                            if (llIllIIlIIlI(8241, 3033)) {
                                                                throw null;
                                                            }

                                                            if (llIllIIlIlll(var7.getItem() instanceof ItemPickaxe)) {
                                                                var5 += 10.0D;
                                                                var9 = var0;
                                                                var10 = true;
                                                                break label145;
                                                            }

                                                            if (llIllIIlIIlI(8241, 3033)) {
                                                                throw null;
                                                            }

                                                            if (llIllIIlIlll(var7.getItem() instanceof ItemSword)) {
                                                                var5 += 10.0D;
                                                                var9 = var0;
                                                                var10 = true;
                                                                break label145;
                                                            }

                                                            if (llIllIIlIIlI(8241, 3033)) {
                                                                throw null;
                                                            }

                                                            if (llIllIlIIIll(var7.getItem(), Items.TOTEM_OF_UNDYING)) {
                                                                var5 += 10.0D;
                                                            }
                                                        }

                                                        if (llIllIIlIIlI(8241, 3033)) {
                                                            throw null;
                                                        }

                                                        var9 = var0;
                                                    }

                                                    if (llIllIIlIIlI(8241, 3033)) {
                                                        throw null;
                                                    } else {
                                                        if (llIllIIlIlll(var9.isOnLadder())) {
                                                            var5 += 10.0D;
                                                        }

                                                        if (llIllIIlIIlI(8241, 3033)) {
                                                            throw null;
                                                        } else {
                                                            return -(-var3 + -var1 + var5 / 2.0D);
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

    private static boolean llIllIlIIlII(Object var0) {
        return var0 != null;
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0) {
        int var10000 = Class22. ();
        if (llIllIIlIIlI(23166, 9201)) {
            throw null;
        } else {
            float var1;
            if (llIllIIlIIll((var1 = (float) var10000 /.player.getCooldownPeriod() - var0) == 0.0F ? 0 : (var1 < 0.0F ? -1 : 1)))
            {
                return true;
            } else if (llIllIIlIIlI(23166, 9201)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    public static double[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0) {
        float var2;
        float var3;
        float var4;
        float var11;
        label88:
        {
            var2 =                                                                                   .
            player.movementInput.moveForward;
            var3 =                                                                                   .
            player.movementInput.moveStrafe;
            var4 =                                                                                   .
            player.prevRotationYaw + (.player.rotationYaw -                                                                                   .
            player.prevRotationYaw) *                                                                                   .
            getRenderPartialTicks();
            float var14;
            if (llIllIIlIlll((var14 = var2 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1))) {
                float var15;
                byte var10001;
                boolean var10002;
                if (llIllIIlIllI((var15 = var3 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1))) {
                    float var16;
                    if (llIllIIlIllI((var16 = var2 - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1))) {
                        var10001 = -45;
                        var10002 = true;
                    } else {
                        if (llIllIIlIIlI(21168, 8713)) {
                            throw null;
                        }

                        var10001 = 45;
                    }

                    if (llIllIIlIIlI(21168, 8713)) {
                        throw null;
                    }

                    var4 += (float) var10001;
                    boolean var10000 = true;
                } else {
                    if (llIllIIlIIlI(21168, 8713)) {
                        throw null;
                    }

                    float var17;
                    if (llIllIIlIlIl((var17 = var3 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1))) {
                        float var18;
                        if (llIllIIlIllI((var18 = var2 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1))) {
                            var10001 = 45;
                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(21168, 8713)) {
                                throw null;
                            }

                            var10001 = -45;
                        }

                        if (llIllIIlIIlI(21168, 8713)) {
                            throw null;
                        }

                        var4 += (float) var10001;
                    }
                }

                if (llIllIIlIIlI(21168, 8713)) {
                    throw null;
                }

                var3 = 0.0F;
                float var19;
                if (llIllIIlIllI((var19 = var2 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1))) {
                    var2 = 1.0F;
                    var11 = var4;
                    boolean var13 = true;
                    break label88;
                }

                if (llIllIIlIIlI(21168, 8713)) {
                    throw null;
                }

                float var20;
                if (llIllIIlIlIl((var20 = var2 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1))) {
                    var2 = -1.0F;
                }
            }

            if (llIllIIlIIlI(21168, 8713)) {
                throw null;
            }

            var11 = var4;
        }

        if (llIllIIlIIlI(21168, 8713)) {
            throw null;
        } else {
            double var12 = Math.toRadians((double) (var11 + 90.0F));
            if (llIllIIlIIlI(21168, 8713)) {
                throw null;
            } else {
                var12 = Math.sin(var12);
                if (llIllIIlIIlI(21168, 8713)) {
                    throw null;
                } else {
                    double var5 = var12;
                    var12 = Math.toRadians((double) (var4 + 90.0F));
                    if (llIllIIlIIlI(21168, 8713)) {
                        throw null;
                    } else {
                        var12 = Math.cos(var12);
                        if (llIllIIlIIlI(21168, 8713)) {
                            throw null;
                        } else {
                            double var7 = var12;
                            double var9 = (double) var2 * var0 * var7 + (double) var3 * var0 * var5;
                            var5 = (double) var2 * var0 * var5 - (double) var3 * var0 * var7;
                            return new double[]{var9, var5};
                        }
                    }
                }
            }
        }
    }

    public static double _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        float var0 =                                                                                   .
        player.rotationYaw;
        float var1 = 1.0F;
        float var4;
        if (llIllIIlIlIl((var4 =.player.moveForward - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))){
            var0 += 180.0F;
        }

        if (llIllIIlIIlI(94445, 6058)) {
            throw null;
        } else {
            float var5;
            if (llIllIIlIlIl((var5 =.player.moveForward - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1))){
                var1 = -0.5F;
                boolean var10000 = true;
            } else{
                if (llIllIIlIIlI(94445, 6058)) {
                    throw null;
                }

                float var6;
                if (llIllIIlIllI((var6 =.player.moveForward - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1))){
                    var1 = 0.5F;
                }
            }

            if (llIllIIlIIlI(94445, 6058)) {
                throw null;
            } else {
                float var2;
                float var7;
                if (llIllIIlIllI((var7 =.player.moveStrafing - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1))){
                    var2 = var0 - 90.0F * var1;
                    boolean var10001 = true;
                } else{
                    if (llIllIIlIIlI(94445, 6058)) {
                        throw null;
                    }

                    float var8;
                    if (llIllIIlIlIl((var8 =.player.moveStrafing - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1)))
                    {
                        var0 += 90.0F * var1;
                    }

                    if (llIllIIlIIlI(94445, 6058)) {
                        throw null;
                    }

                    var2 = var0;
                }

                if (llIllIIlIIlI(94445, 6058)) {
                    throw null;
                } else {
                    double var3 = Math.toRadians((double) var2);
                    if (llIllIIlIIlI(94445, 6058)) {
                        throw null;
                    } else {
                        return var3;
                    }
                }
            }
        }
    }

    public static float ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        double var10000 = Math.sqrt(.player.motionX *                                                                                   .
        player.motionX +                                                                                   .
        player.motionZ *                                                                                   .
        player.motionZ);
        if (llIllIIlIIlI(83011, 7151)) {
            throw null;
        } else {
            return (float) var10000;
        }
    }

    public static char ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var0) {
        String var1 = var0.getDisplayName().getFormattedText();
        char[] var4;
        int var3 = (var4 = new char[]{'e', 'a', 'b', 'c', '7', 'd', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'n', 'm', 'r', 'o', 'l', 'f'}).length;

        byte var2;
        boolean var6;
        for (byte var10000 = var2 = 0; !llIllIIlIIlI(68271, 8547); var6 = true) {
            if (!llIllIlIIIlI(var10000, var3)) {
                if (llIllIIlIIlI(68271, 8547)) {
                    throw null;
                }

                return 'f';
            }

            char var5 = var4[var2];
            StringBuilder var10001 = new StringBuilder();
            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            String var10002 = Class60. ("ü");
            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            var10001 = var10001.append(var10002).append(var5);
            var10002 = Class60. ("UJ[{");
            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            if (llIllIIlIlll(var1.startsWith(String.valueOf(var10001.append(var10002))))) {
                return '-';
            }

            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            var10001 = new StringBuilder();
            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            String var10003 = Class60. ("ü");
            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            if (llIllIIlIlll(var1.startsWith(String.valueOf(var10001.insert(0, var10003).append(var5))))) {
                return var5;
            }

            if (llIllIIlIIlI(68271, 8547)) {
                throw null;
            }

            var10000 = ++var2;
        }

        throw null;
    }

    public static double[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        double var1 = var0.lastTickPosX + (var0.posX - var0.lastTickPosX);
        double var3 = var0.lastTickPosY + (var0.posY - var0.lastTickPosY);
        double var5 = var0.lastTickPosZ + (var0.posZ - var0.lastTickPosZ);
        return new double[]{var1, var3, var5};
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, float var1, float var2, boolean var3, boolean var4, float var5) {
        double var10000 = var0.posX;
        double var10001;
        boolean var10002;
        if (llIllIIlIlll(var3)) {
            var10001 =                                                                                   .
            player.prevPosX;
            var10002 = true;
        } else {
            if (llIllIIlIIlI(75492, 7391)) {
                throw null;
            }

            var10001 =                                                                                   .
            player.posX;
        }

        if (llIllIIlIIlI(75492, 7391)) {
            throw null;
        } else {
            double var6 = var10000 - var10001;
            var10000 = var0.posZ;
            if (llIllIIlIlll(var3)) {
                var10001 =                                                                                   .
                player.prevPosZ;
                var10002 = true;
            } else {
                if (llIllIIlIIlI(75492, 7391)) {
                    throw null;
                }

                var10001 =                                                                                   .
                player.posZ;
            }

            if (llIllIIlIIlI(75492, 7391)) {
                throw null;
            } else {
                double var8 = var10000 - var10001;
                double var10 = (double) ((float) var0.posY + var0.getEyeHeight() * 0.7F) - (.player.posY + (
                double)                                                                                  .
                player.getEyeHeight());
                float var16 = MathHelper.sqrt(var6 * var6 + var8 * var8);
                if (llIllIIlIIlI(75492, 7391)) {
                    throw null;
                } else {
                    double var12 = (double) var16;
                    var10000 = Math.atan2(var8, var6);
                    if (llIllIIlIIlI(75492, 7391)) {
                        throw null;
                    } else {
                        var16 = (float) (var10000 * 180.0D / 3.141592653589793D - 90.0D);
                        float var17;
                        if (llIllIIlIlll(var4)) {
                            var17 = (-var5, var5);
                            if (llIllIIlIIlI(75492, 7391)) {
                                throw null;
                            }

                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(75492, 7391)) {
                                throw null;
                            }

                            var17 = 0.0F;
                        }

                        if (llIllIIlIIlI(75492, 7391)) {
                            throw null;
                        } else {
                            float var14 = var16 + var17;
                            var10000 = Math.atan2(var10, var12);
                            if (llIllIIlIIlI(75492, 7391)) {
                                throw null;
                            } else {
                                var16 = (float) (-(var10000 * 180.0D / 3.141592653589793D));
                                if (llIllIIlIlll(var4)) {
                                    var17 = (-var5, var5);
                                    if (llIllIIlIIlI(75492, 7391)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else {
                                    if (llIllIIlIIlI(75492, 7391)) {
                                        throw null;
                                    }

                                    var17 = 0.0F;
                                }

                                if (llIllIIlIIlI(75492, 7391)) {
                                    throw null;
                                } else {
                                    float var15 = var16 + var17;
                                    var17 = MathHelper.wrapDegrees(var14 - var1);
                                    if (llIllIIlIIlI(75492, 7391)) {
                                        throw null;
                                    } else {
                                        var17 = Class109. (var17);
                                        if (llIllIIlIIlI(75492, 7391)) {
                                            throw null;
                                        } else {
                                            var14 = var1 + var17;
                                            var17 = MathHelper.wrapDegrees(var15 - var2);
                                            if (llIllIIlIIlI(75492, 7391)) {
                                                throw null;
                                            } else {
                                                var17 = Class109. (var17);
                                                if (llIllIIlIIlI(75492, 7391)) {
                                                    throw null;
                                                } else {
                                                    var16 = var2 + var17;
                                                    var17 += var2;
                                                    var16 = MathHelper.clamp(var16, -90.0F, 90.0F);
                                                    if (llIllIIlIIlI(75492, 7391)) {
                                                        throw null;
                                                    } else {
                                                        var15 = var16;
                                                        return new float[]{var14, var15};
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

    private static boolean llIllIIlIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    public static float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0, float var1) {
        float var2;
        float var3;
        if (llIllIIlIlll((var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1)) && !llIllIlIIIIl((var3 = var1 - var0 - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1))) {
            if (llIllIIlIIlI(60280, 4771)) {
                throw null;
            } else {
                double var10000 = (double) var0;
                double var10001 = (double) (var1 - var0);
                double var10002 = Math.random();
                if (llIllIIlIIlI(60280, 4771)) {
                    throw null;
                } else {
                    return (float) (var10000 + var10001 * var10002);
                }
            }
        } else if (llIllIIlIIlI(60280, 4771)) {
            throw null;
        } else {
            return var0;
        }
    }

    private static boolean llIllIIllIlI(int var0) {
        return var0 == 0;
    }

    private static boolean llIllIlIIIll(Object var0, Object var1) {
        return var0 == var1;
    }

    public static double[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, float var2) {
        float var3;
        float var4;
        float var11;
        label88:
        {
            var3 =                                                                                   .
            player.movementInput.moveStrafe;
            var4 =                                                                                   .
            player.prevRotationYaw + (.player.rotationYaw -                                                                                   .
            player.prevRotationYaw) *                                                                                   .
            getRenderPartialTicks();
            float var14;
            if (llIllIIlIlll((var14 = var2 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1))) {
                float var15;
                byte var10001;
                boolean var10002;
                if (llIllIIlIllI((var15 = var3 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1))) {
                    float var16;
                    if (llIllIIlIllI((var16 = var2 - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1))) {
                        var10001 = -45;
                        var10002 = true;
                    } else {
                        if (llIllIIlIIlI(91972, 4698)) {
                            throw null;
                        }

                        var10001 = 45;
                    }

                    if (llIllIIlIIlI(91972, 4698)) {
                        throw null;
                    }

                    var4 += (float) var10001;
                    boolean var10000 = true;
                } else {
                    if (llIllIIlIIlI(91972, 4698)) {
                        throw null;
                    }

                    float var17;
                    if (llIllIIlIlIl((var17 = var3 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1))) {
                        float var18;
                        if (llIllIIlIllI((var18 = var2 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1))) {
                            var10001 = 45;
                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(91972, 4698)) {
                                throw null;
                            }

                            var10001 = -45;
                        }

                        if (llIllIIlIIlI(91972, 4698)) {
                            throw null;
                        }

                        var4 += (float) var10001;
                    }
                }

                if (llIllIIlIIlI(91972, 4698)) {
                    throw null;
                }

                var3 = 0.0F;
                float var19;
                if (llIllIIlIllI((var19 = var2 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1))) {
                    var2 = 1.0F;
                    var11 = var4;
                    boolean var13 = true;
                    break label88;
                }

                if (llIllIIlIIlI(91972, 4698)) {
                    throw null;
                }

                float var20;
                if (llIllIIlIlIl((var20 = var2 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1))) {
                    var2 = -1.0F;
                }
            }

            if (llIllIIlIIlI(91972, 4698)) {
                throw null;
            }

            var11 = var4;
        }

        if (llIllIIlIIlI(91972, 4698)) {
            throw null;
        } else {
            double var12 = Math.toRadians((double) (var11 + 90.0F));
            if (llIllIIlIIlI(91972, 4698)) {
                throw null;
            } else {
                var12 = Math.sin(var12);
                if (llIllIIlIIlI(91972, 4698)) {
                    throw null;
                } else {
                    double var5 = var12;
                    var12 = Math.toRadians((double) (var4 + 90.0F));
                    if (llIllIIlIIlI(91972, 4698)) {
                        throw null;
                    } else {
                        var12 = Math.cos(var12);
                        if (llIllIIlIIlI(91972, 4698)) {
                            throw null;
                        } else {
                            double var7 = var12;
                            double var9 = (double) var2 * var0 * var7 + (double) var3 * var0 * var5;
                            var5 = (double) var2 * var0 * var5 - (double) var3 * var0 * var7;
                            return new double[]{var9, var5};
                        }
                    }
                }
            }
        }
    }

    public static double ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (llIllIIlIlll(.player.onGround)){
            return 0.0D;
        } else if (llIllIIlIIlI(76372, 4445)) {
            throw null;
        } else {
            double var0;
            boolean var10001;
            for (double var10000 = var0 = 0.0D; !llIllIIlIIlI(76372, 4445); var10001 = true) {
                double var4;
                if (!llIllIIlIlIl((var4 = var10000 - 256.0D) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1))) {
                    if (llIllIIlIIlI(76372, 4445)) {
                        throw null;
                    }

                    return -1.0D;
                }

                BlockPos var3 = new BlockPos(.player.posX,                                                                                   .
                player.posY - var0,                                                                                   .
                player.posZ);
                if (llIllIIlIIlI(76372, 4445)) {
                    throw null;
                }

                BlockPos var2 = var3;
                if (llIllIIllIlI(.world.getBlockState(var2).getBlock() instanceof BlockAir) &&
                llIllIIllIlI(.world.getBlockState(var2).getBlock() instanceof BlockLiquid)){
                    return var0;
                }

                if (llIllIIlIIlI(76372, 4445)) {
                    throw null;
                }

                var10000 = ++var0;
            }

            throw null;
        }
    }

    public static float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0, float var1, float var2) {
        float var10000 = MathHelper.wrapDegrees(var1 - var0);
        if (llIllIIlIIlI(60703, 3135)) {
            throw null;
        } else {
            var1 = var10000;
            float var3;
            if (llIllIIlIllI((var3 = var10000 - var2) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1))) {
                var1 = var2;
            }

            if (llIllIIlIIlI(60703, 3135)) {
                throw null;
            } else {
                float var4;
                if (llIllIIlIlIl((var4 = var1 - -var2) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))) {
                    var1 = -var2;
                }

                if (llIllIIlIIlI(60703, 3135)) {
                    throw null;
                } else {
                    return var0 + var1;
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, float var2, double var3, double var5) {
        double var11;
        boolean var13;
        boolean var10000;
        label109:
        {
            double var14;
            if (llIllIIlIlll((var14 = var5 - 0.0D) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1))) {
                double var15;
                byte var10001;
                boolean var10002;
                if (llIllIIlIllI((var15 = var3 - 0.0D) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1))) {
                    double var16;
                    if (llIllIIlIllI((var16 = var5 - 0.0D) == 0.0D ? 0 : (var16 < 0.0D ? -1 : 1))) {
                        var10001 = -45;
                        var10002 = true;
                    } else {
                        if (llIllIIlIIlI(42707, 304)) {
                            throw null;
                        }

                        var10001 = 45;
                    }

                    if (llIllIIlIIlI(42707, 304)) {
                        throw null;
                    }

                    var2 += (float) var10001;
                    var10000 = true;
                } else {
                    if (llIllIIlIIlI(42707, 304)) {
                        throw null;
                    }

                    double var17;
                    if (llIllIIlIlIl((var17 = var3 - 0.0D) == 0.0D ? 0 : (var17 < 0.0D ? -1 : 1))) {
                        double var18;
                        if (llIllIIlIllI((var18 = var5 - 0.0D) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1))) {
                            var10001 = 45;
                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(42707, 304)) {
                                throw null;
                            }

                            var10001 = -45;
                        }

                        if (llIllIIlIIlI(42707, 304)) {
                            throw null;
                        }

                        var2 += (float) var10001;
                    }
                }

                if (llIllIIlIIlI(42707, 304)) {
                    throw null;
                }

                var3 = 0.0D;
                double var19;
                if (llIllIIlIllI((var19 = var5 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                    var5 = 1.0D;
                    var11 = var3;
                    var13 = true;
                    break label109;
                }

                if (llIllIIlIIlI(42707, 304)) {
                    throw null;
                }

                double var20;
                if (llIllIIlIlIl((var20 = var5 - 0.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1))) {
                    var5 = -1.0D;
                }
            }

            if (llIllIIlIIlI(42707, 304)) {
                throw null;
            }

            var11 = var3;
        }

        if (llIllIIlIIlI(42707, 304)) {
            throw null;
        } else {
            float var12;
            double var21;
            if (llIllIIlIllI((var21 = var11 - 0.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1))) {
                var3 = 1.0D;
                var12 = var2;
                var13 = true;
            } else {
                if (llIllIIlIIlI(42707, 304)) {
                    throw null;
                }

                double var22;
                if (llIllIIlIlIl((var22 = var3 - 0.0D) == 0.0D ? 0 : (var22 < 0.0D ? -1 : 1))) {
                    var3 = -1.0D;
                }

                if (llIllIIlIIlI(42707, 304)) {
                    throw null;
                }

                var12 = var2;
            }

            if (llIllIIlIIlI(42707, 304)) {
                throw null;
            } else {
                var11 = Math.toRadians((double) (var12 + 90.0F));
                if (llIllIIlIIlI(42707, 304)) {
                    throw null;
                } else {
                    var11 = Math.cos(var11);
                    if (llIllIIlIIlI(42707, 304)) {
                        throw null;
                    } else {
                        double var7 = var11;
                        var11 = Math.toRadians((double) (var2 + 90.0F));
                        if (llIllIIlIIlI(42707, 304)) {
                            throw null;
                        } else {
                            var11 = Math.sin(var11);
                            if (llIllIIlIIlI(42707, 304)) {
                                throw null;
                            } else {
                                double var9 = var11;
                                                                                                          .
                                player.motionX = var5 * var0 * var7 + var3 * var0 * var9;
                                                                                                          .
                                player.motionZ = var5 * var0 * var9 - var3 * var0 * var7;
                                var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0) {
        (var0,                                                                                   .
        player.rotationYaw, ( double)                                                                                  .
        player.movementInput.moveStrafe, ( double)                                                                                  .
        player.movementInput.moveForward);
        if (llIllIIlIIlI(25368, 2725)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        double var1 = var0.posX -                                                                                   .
        player.posX;
        double var3 = var0.posZ -                                                                                   .
        player.posZ;
        double var5 = var0.posY -                                                                                   .
        player.posY - 0.5D;
        float var10000 = MathHelper.sqrt(var1 * var1 + var3 * var3);
        if (llIllIIlIIlI(20192, 8360)) {
            throw null;
        } else {
            double var7 = (double) var10000;
            double var10 = Math.atan2(var3, var1);
            if (llIllIIlIIlI(20192, 8360)) {
                throw null;
            } else {
                float var9 = (float) (var10 * 180.0D / 3.141592653589793D - 90.0D);
                var10 = Math.atan2(var5, var7);
                if (llIllIIlIIlI(20192, 8360)) {
                    throw null;
                } else {
                    float var2 = (float) (-(var10 * 180.0D / 3.141592653589793D));
                    return new float[]{var9, var2};
                }
            }
        }
    }

    public static double ____________________________________________________________________________/* $FF was:                                                                             */() {
        double var0 = 0.2875D;
        EntityPlayerSP var10000 =                                                                                   .
        player;
        Potion var10001 = Potion.getPotionById(1);
        if (llIllIIlIIlI(19173, 8213)) {
            throw null;
        } else {
            if (llIllIIlIlll(var10000.isPotionActive(var10001))) {
                EntityPlayerSP var10003 =                                                                                   .
                player;
                Potion var10004 = Potion.getPotionById(1);
                if (llIllIIlIIlI(19173, 8213)) {
                    throw null;
                }

                var0 *= 1.0D + 0.2D * (double) (var10003.getActivePotionEffect(var10004).getAmplifier() + 1);
            }

            if (llIllIIlIIlI(19173, 8213)) {
                throw null;
            } else {
                return var0;
            }
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, float var1) {
        double var2 = var0.posX -                                                                                   .
        player.prevPosX;
        double var4 = var0.posZ -                                                                                   .
        player.prevPosZ;
        double var6 = var0.posY -                                                                                   .
        player.prevPosY - 0.5D;
        float var10000 = MathHelper.sqrt(var2 * var2 + var4 * var4);
        if (llIllIIlIIlI(49875, 8857)) {
            throw null;
        } else {
            double var8 = (double) var10000;
            double var11 = Math.atan2(var4, var2);
            if (llIllIIlIIlI(49875, 8857)) {
                throw null;
            } else {
                float var10 = (float) (var11 * 180.0D / 3.141592653589793D - 90.0D);
                var11 = Math.atan2(var6, var8);
                if (llIllIIlIIlI(49875, 8857)) {
                    throw null;
                } else {
                    float var3 = (float) (-(var11 * 180.0D / 3.141592653589793D));
                    var10000 = (.player.rotationYaw, var10, var1);
                    if (llIllIIlIIlI(49875, 8857)) {
                        throw null;
                    } else {
                        var10 = var10000;
                        var10000 = (.player.rotationPitch, var3, var1);
                        if (llIllIIlIIlI(49875, 8857)) {
                            throw null;
                        } else {
                            var3 = var10000;
                            var10000 =                                                                                   .
                            player.rotationYaw;
                            float var10001 = MathHelper.wrapDegrees(var10 -.player.rotationYaw);
                            if (llIllIIlIIlI(49875, 8857)) {
                                throw null;
                            } else {
                                var10001 = Class109. (var10001);
                                if (llIllIIlIIlI(49875, 8857)) {
                                    throw null;
                                } else {
                                    var10 = var10000 + var10001;
                                    var10000 =                                                                                   .
                                    player.rotationPitch;
                                    var10001 = MathHelper.wrapDegrees(var3 -.player.rotationPitch);
                                    if (llIllIIlIIlI(49875, 8857)) {
                                        throw null;
                                    } else {
                                        var10001 = Class109. (var10001);
                                        if (llIllIIlIIlI(49875, 8857)) {
                                            throw null;
                                        } else {
                                            var3 = var10000 + var10001;
                                            return new float[]{var10, var3};
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

    public static double[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, float var1) {
        RenderManager var2 =                                                                                   .
        getRenderManager();
        double var3 = var0.lastTickPosX + (var0.posX - var0.lastTickPosX) * (double) var1 - var2.viewerPosX;
        double var5 = var0.lastTickPosY + (var0.posY - var0.lastTickPosY) * (double) var1 - var2.viewerPosY;
        double var7 = var0.lastTickPosZ + (var0.posZ - var0.lastTickPosZ) * (double) var1 - var2.viewerPosZ;
        return new double[]{var3, var5, var7};
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, Entity var1) {
        double var2 = var1.lastTickPosX - var0.posX;
        double var4 = var1.lastTickPosZ - var0.posZ;
        double var6 = var1.lastTickPosY - var0.posY - 0.5D;
        float var10000 = MathHelper.sqrt(var2 * var2 + var4 * var4);
        if (llIllIIlIIlI(54286, 6274)) {
            throw null;
        } else {
            double var8 = (double) var10000;
            double var12 = Math.atan2(var4, var2);
            if (llIllIIlIIlI(54286, 6274)) {
                throw null;
            } else {
                float var10 = (float) (var12 * 180.0D / 3.141592653589793D - 90.0D);
                var12 = Math.atan2(var6, var8);
                if (llIllIIlIIlI(54286, 6274)) {
                    throw null;
                } else {
                    float var11 = (float) (-(var12 * 180.0D / 3.141592653589793D));
                    return new float[]{var10, var11};
                }
            }
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0) {
        double var1 = (double) var0.getX() + 0.5D -                                                                                   .
        player.posX;
        double var3 = (double) var0.getY() + 0.5D - (.player.posY + ( double)                                                                                  .
        player.getEyeHeight());
        double var5 = (double) var0.getZ() + 0.5D -                                                                                   .
        player.posZ;
        float var10000 = MathHelper.sqrt(var1 * var1 + var5 * var5);
        if (llIllIIlIIlI(62535, 8383)) {
            throw null;
        } else {
            double var7 = (double) var10000;
            double var10 = Math.atan2(var5, var1);
            if (llIllIIlIIlI(62535, 8383)) {
                throw null;
            } else {
                float var9 = (float) (var10 * 180.0D / 3.141592653589793D) - 90.0F;
                var10 = Math.atan2(var3, var7);
                if (llIllIIlIIlI(62535, 8383)) {
                    throw null;
                } else {
                    float var2 = (float) (-(var10 * 180.0D / 3.141592653589793D));
                    var10000 =                                                                                   .
                    player.rotationYaw;
                    float var10001 = MathHelper.wrapDegrees(var9 -.player.rotationYaw);
                    if (llIllIIlIIlI(62535, 8383)) {
                        throw null;
                    } else {
                        var9 = var10000 + var10001;
                        var10000 =                                                                                   .
                        player.rotationPitch;
                        var10001 = MathHelper.wrapDegrees(var2 -.player.rotationPitch);
                        if (llIllIIlIIlI(62535, 8383)) {
                            throw null;
                        } else {
                            var2 = var10000 + var10001;
                            return new float[]{var9, var2};
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllIlIIIlI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIllIIllIIl(Object var0) {
        return var0 == null;
    }

    public static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        int var0;
        boolean var10001;
        for (int var10000 = var0 = 0; !llIllIIlIIlI(40624, 9150); var10001 = true) {
            if (!llIllIlIIIlI(var10000, 9)) {
                if (llIllIIlIIlI(40624, 9150)) {
                    throw null;
                }

                return                                                                                   .
                player.inventory.currentItem;
            }

            if (llIllIIlIlll(.player.inventory.getStackInSlot(var0).getItem() instanceof ItemAxe)){
                return var0;
            }

            if (llIllIIlIIlI(40624, 9150)) {
                throw null;
            }

            ++var0;
            var10000 = var0;
        }

        throw null;
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, Entity var1, float var2) {
        double var3 = var1.posX - var0.posX;
        double var10000 = Math.atan2(var1.posZ - var0.posZ, var3);
        if (llIllIIlIIlI(19574, 1785)) {
            throw null;
        } else {
            var10000 = Math.toDegrees(var10000);
            if (llIllIIlIIlI(19574, 1785)) {
                throw null;
            } else {
                var10000 = ((double) ((float) (var10000 - 90.0D)), (double) var0.rotationYaw);
                if (llIllIIlIIlI(19574, 1785)) {
                    throw null;
                } else {
                    double var5;
                    if (llIllIlIIIIl((var5 = var10000 - (double) var2) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1))) {
                        return true;
                    } else if (llIllIIlIIlI(19574, 1785)) {
                        throw null;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(AxisAlignedBB var0) {
        Vec3d var10000 = new Vec3d(var0.minX + (var0.maxX - var0.minX) * 0.5D, var0.minY + (var0.maxY - var0.minY) * 0.01D, var0.minZ + (var0.maxZ - var0.minZ) * 0.5D);
        if (llIllIIlIIlI(89892, 5717)) {
            throw null;
        } else {
            double var2 = var10000.x -                                                                                   .
            player.posX;
            double var4 = var10000.y -                                                                                   .
            player.posY - 0.5D;
            double var6 = var10000.z -                                                                                   .
            player.posZ;
            float var11 = MathHelper.sqrt(var2 * var2 + var6 * var6);
            if (llIllIIlIIlI(89892, 5717)) {
                throw null;
            } else {
                double var8 = (double) var11;
                double var12 = Math.atan2(var6, var2);
                if (llIllIIlIIlI(89892, 5717)) {
                    throw null;
                } else {
                    float var1 = (float) (var12 * 180.0D / 3.141592653589793D - 90.0D);
                    var12 = Math.atan2(var4, var8);
                    if (llIllIIlIIlI(89892, 5717)) {
                        throw null;
                    } else {
                        float var10 = (float) (-(var12 * 180.0D / 3.141592653589793D));
                        return new float[]{var1, var10};
                    }
                }
            }
        }
    }

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, boolean var1, boolean var2) {
        double var10000 = var0.posX;
        double var10001;
        boolean var10002;
        if (llIllIIlIlll(var1)) {
            var10001 =                                                                                   .
            player.prevPosX;
            var10002 = true;
        } else {
            if (llIllIIlIIlI(93777, 4922)) {
                throw null;
            }

            var10001 =                                                                                   .
            player.posX;
        }

        if (llIllIIlIIlI(93777, 4922)) {
            throw null;
        } else {
            double var3 = var10000 - var10001;
            var10000 = var0.posZ;
            if (llIllIIlIlll(var1)) {
                var10001 =                                                                                   .
                player.prevPosZ;
                var10002 = true;
            } else {
                if (llIllIIlIIlI(93777, 4922)) {
                    throw null;
                }

                var10001 =                                                                                   .
                player.posZ;
            }

            if (llIllIIlIIlI(93777, 4922)) {
                throw null;
            } else {
                double var5 = var10000 - var10001;
                double var8 = (double) ((float) var0.posY + var0.getEyeHeight() * 0.7F) - (.player.posY + (
                double)                                                                                  .
                player.getEyeHeight());
                float var14 = MathHelper.sqrt(var3 * var3 + var5 * var5);
                if (llIllIIlIIlI(93777, 4922)) {
                    throw null;
                } else {
                    double var10 = (double) var14;
                    float var12 = 2.0F;
                    float var7 = 2.0F;
                    var10000 = Math.atan2(var5, var3);
                    if (llIllIIlIIlI(93777, 4922)) {
                        throw null;
                    } else {
                        var14 = (float) (var10000 * 180.0D / 3.141592653589793D - 90.0D);
                        float var15;
                        if (llIllIIlIlll(var2)) {
                            var15 = (-var12, var12);
                            if (llIllIIlIIlI(93777, 4922)) {
                                throw null;
                            }

                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(93777, 4922)) {
                                throw null;
                            }

                            var15 = 0.0F;
                        }

                        if (llIllIIlIIlI(93777, 4922)) {
                            throw null;
                        } else {
                            var12 = var14 + var15;
                            var10000 = Math.atan2(var8, var10);
                            if (llIllIIlIIlI(93777, 4922)) {
                                throw null;
                            } else {
                                var14 = (float) (-(var10000 * 180.0D / 3.141592653589793D));
                                if (llIllIIlIlll(var2)) {
                                    var15 = (-var7, var7);
                                    if (llIllIIlIIlI(93777, 4922)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else {
                                    if (llIllIIlIIlI(93777, 4922)) {
                                        throw null;
                                    }

                                    var15 = 0.0F;
                                }

                                if (llIllIIlIIlI(93777, 4922)) {
                                    throw null;
                                } else {
                                    float var13 = var14 + var15;
                                    var14 =                                                                                   .
                                    player.rotationYaw;
                                    var15 = MathHelper.wrapDegrees(var12 -.player.rotationYaw);
                                    if (llIllIIlIIlI(93777, 4922)) {
                                        throw null;
                                    } else {
                                        var15 = Class109. (var15);
                                        if (llIllIIlIIlI(93777, 4922)) {
                                            throw null;
                                        } else {
                                            var12 = var14 + var15;
                                            var14 =                                                                                   .
                                            player.rotationPitch;
                                            var15 = MathHelper.wrapDegrees(var13 -.player.rotationPitch);
                                            if (llIllIIlIIlI(93777, 4922)) {
                                                throw null;
                                            } else {
                                                var15 = Class109. (var15);
                                                if (llIllIIlIIlI(93777, 4922)) {
                                                    throw null;
                                                } else {
                                                    var14 = MathHelper.clamp(var14 + var15, -90.0F, 90.0F);
                                                    if (llIllIIlIIlI(93777, 4922)) {
                                                        throw null;
                                                    } else {
                                                        var13 = var14;
                                                        return new float[]{var12, var13};
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

    public static float[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0, float var1, float var2, boolean var3) {
        double var4 = (double) var0.getX() + 0.5D -                                                                                   .
        player.posX;
        double var6 = (double) var0.getY() + 0.5D - (.player.posY + ( double)                                                                                  .
        player.getEyeHeight());
        double var8 = (double) var0.getZ() + 0.5D -                                                                                   .
        player.posZ;
        float var10000 = MathHelper.sqrt(var4 * var4 + var8 * var8);
        if (llIllIIlIIlI(76287, 4088)) {
            throw null;
        } else {
            double var10 = (double) var10000;
            double var14 = Math.atan2(var8, var4);
            if (llIllIIlIIlI(76287, 4088)) {
                throw null;
            } else {
                var10000 = (float) (var14 * 180.0D / 3.141592653589793D) - 90.0F;
                float var10001;
                boolean var10002;
                if (llIllIIlIlll(var3)) {
                    var10001 = (-2.0F, 2.0F);
                    if (llIllIIlIIlI(76287, 4088)) {
                        throw null;
                    }

                    var10002 = true;
                } else {
                    if (llIllIIlIIlI(76287, 4088)) {
                        throw null;
                    }

                    var10001 = 0.0F;
                }

                if (llIllIIlIIlI(76287, 4088)) {
                    throw null;
                } else {
                    float var13 = var10000 + var10001;
                    var14 = Math.atan2(var6, var10);
                    if (llIllIIlIIlI(76287, 4088)) {
                        throw null;
                    } else {
                        var10000 = (float) (-(var14 * 180.0D / 3.141592653589793D));
                        if (llIllIIlIlll(var3)) {
                            var10001 = (-2.0F, 2.0F);
                            if (llIllIIlIIlI(76287, 4088)) {
                                throw null;
                            }

                            var10002 = true;
                        } else {
                            if (llIllIIlIIlI(76287, 4088)) {
                                throw null;
                            }

                            var10001 = 0.0F;
                        }

                        if (llIllIIlIIlI(76287, 4088)) {
                            throw null;
                        } else {
                            float var12 = var10000 + var10001;
                            var10001 = MathHelper.wrapDegrees(var13 - var1);
                            if (llIllIIlIIlI(76287, 4088)) {
                                throw null;
                            } else {
                                var13 = var1 + var10001;
                                var10001 = MathHelper.wrapDegrees(var12 - var2);
                                if (llIllIIlIIlI(76287, 4088)) {
                                    throw null;
                                } else {
                                    var12 = var2 + var10001;
                                    return new float[]{var13, var13};
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllIIlIIll(int var0) {
        return var0 >= 0;
    }

    public static double ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, double var2) {
        double var10000 = Math.abs(var0 - var2);
        if (llIllIIlIIlI(95681, 8622)) {
            throw null;
        } else {
            float var1;
            float var4;
            if (llIllIIlIllI((var4 = (var1 = (float) (var10000 % 360.0D)) - 180.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))) {
                var1 = 360.0F - var1;
            }

            if (llIllIIlIIlI(95681, 8622)) {
                throw null;
            } else {
                return (double) var1;
            }
        }
    }

    public static float[] ____________________________________________________________________________/* $FF was:                                                                             */(Entity var0) {
        float[] var10000 = (var0, true, false);
        if (llIllIIlIIlI(67638, 5546)) {
            throw null;
        } else {
            return var10000;
        }
    }

    private static boolean llIllIlIIIIl(int var0) {
        return var0 <= 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
