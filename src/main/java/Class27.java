import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class27 extends Class171 {
    private static int 9700=-17722;
    private static int 5478=23955;
    private BlockPos;
    private static int 7885=3971;
    private static int 42123=-15464;
    private static int 1563=27147;
    public Class220;
    public Class220;
    private static int 92691=-15063;
    public BlockPos;
    private static int 6993=26342;
    private static int 8110=14316;
    public Class220;
    private static int 22847=-14607;
    public Class220;
    private static int 25463=-14944;
    private BlockPos;
    public EnumFacing;
    public Class220;
    private static int 4933=32054;
    private static int 38201=-28829;
    public Class220;
    private static int 4284=29506;
    public Class220;
    private static int 9594=27086;
    private static int 35150=-27100;
    public EnumFacing[];
    private static int 1246=4814;
    private static int 26742=-2184;
    private static int 56601=-21561;

    static {
        boolean var10000 = true;
    }

    public Class27() {
        String var10003 = Class60. ("Tn9q{)");
        if (lllIIllIllIl(92691, 5478)) {
            throw null;
        } else {
            super(var10003, 63, Class188.);
            if (lllIIllIllIl(92691, 5478)) {
                throw null;
            } else {
                this. = new EnumFacing[]{EnumFacing.NORTH, EnumFacing.EAST, EnumFacing.SOUTH, EnumFacing.WEST};
                this. = EnumFacing.DOWN;
                Class220 var10010 = new Class220;
                String var10012 = Class60. ("Xx?py=\"");
                if (lllIIllIllIl(92691, 5478)) {
                    throw null;
                } else {
                    var10010.<init> (var10012, 173, this, 5.0D, 0.0D, 10.0D, true);
                    if (lllIIllIllIl(92691, 5478)) {
                        throw null;
                    } else {
                        this. = var10010;
                        Class220 var10009 = new Class220;
                        String var10011 = Class60. ("S{<y/");
                        if (lllIIllIllIl(92691, 5478)) {
                            throw null;
                        } else {
                            var10009.<init> (var10011, 158, this, 1.0D, 0.0D, 3.0D, true);
                            if (lllIIllIllIl(92691, 5478)) {
                                throw null;
                            } else {
                                this. = var10009;
                                Class220 var10008 = new Class220;
                                String var6 = Class60. ("Hr9}v/");
                                if (lllIIllIllIl(92691, 5478)) {
                                    throw null;
                                } else {
                                    var10008.<init> (var6, 159, this, 1.0D, 0.0D, 3.0D, true);
                                    if (lllIIllIllIl(92691, 5478)) {
                                        throw null;
                                    } else {
                                        this. = var10008;
                                        Class220 var10007 = new Class220;
                                        String var5 = Class60. ("]uj;h{n?");
                                        if (lllIIllIllIl(92691, 5478)) {
                                            throw null;
                                        } else {
                                            var10007.<init> (var5, 160, this, 1.0D, 0.0D, 3.0D, true);
                                            if (lllIIllIllIl(92691, 5478)) {
                                                throw null;
                                            } else {
                                                this. = var10007;
                                                Class220 var10006 = new Class220;
                                                String var4 = Class60. ("Qss3|e{a?");
                                                if (lllIIllIllIl(92691, 5478)) {
                                                    throw null;
                                                } else {
                                                    var10006.<init> (var4, 161, this, 1.0D, 0.0D, 3.0D, true);
                                                    if (lllIIllIllIl(92691, 5478)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10006;
                                                        Class220 var10005 = new Class220;
                                                        String var3 = Class60. ("O+");
                                                        if (lllIIllIllIl(92691, 5478)) {
                                                            throw null;
                                                        } else {
                                                            var10005.<init> (var3, 162, this, 3.0D, 0.0D, 3.0D, true);
                                                            if (lllIIllIllIl(92691, 5478)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10005;
                                                                Class220 var10004 = new Class220;
                                                                String var2 = Class60. ("[q<h5");
                                                                if (lllIIllIllIl(92691, 5478)) {
                                                                    throw null;
                                                                } else {
                                                                    var10004.<init>
                                                                    (var2, 163, this, 0.0D, 0.0D, 3.0D, true);
                                                                    if (lllIIllIllIl(92691, 5478)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var10004;
                                                                        BlockPos var1 = new BlockPos(0, 0, 0);
                                                                        if (lllIIllIllIl(92691, 5478)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var1;
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

    private static boolean lllIIllIllIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlllIlIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIIllIlIlI(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIllIlIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllIIlllIIll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIIlllIllI(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIIllIllII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIlllIlII(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean lllIIlllIIlI(Object var0) {
        return var0 != null;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lllIIlllIIlI(this.) && lllIIllIllII(var1 instanceof CPacketPlayer)) {
            float[] var10000 = Class13. (this.);
            if (lllIIllIllIl(35150, 6993)) {
                throw null;
            }

            float[] var3 = var10000;
            Class22. ((CPacketPlayer) var1, var3[0]);
            if (lllIIllIllIl(35150, 6993)) {
                throw null;
            }

            Class22. ((CPacketPlayer) var1, var3[1]);
            if (lllIIllIllIl(35150, 6993)) {
                throw null;
            }

            this.                                                                                                    .
            player.rotationYawHead = ((CPacketPlayer) var1).getYaw(0.0F);
        }

        if (lllIIllIllIl(35150, 6993)) {
            throw null;
        } else {
            boolean var4 = super. (var1, var2);
            if (lllIIllIllIl(35150, 6993)) {
                throw null;
            } else {
                return var4;
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        EntityPlayerSP var10004 = this.                                                                                                    .
        player;
        var10004.rotationYaw += 0.001F;
        EnumFacing[] var9 = this.;
        int var10005 = Math.round(this..player.rotationYaw / 90.0F);
        if (lllIIllIllIl(9700, 7885)) {
            throw null;
        } else {
            this. = var9[var10005 & 3].getOpposite();
            ArrayList var7 = this. (this.. (), this.                                                                                            .
            (), this.                                                                                                   .
            (), this.                                                                                           .
            (), this.                                                                                              .
            (), this.                                                                                  .());
            this. = null;
            Iterator var2 = var7.iterator();

            while (!lllIIllIllIl(9700, 7885)) {
                boolean var8;
                if (!lllIIllIllII(var2.hasNext())) {
                    if (lllIIllIllIl(9700, 7885)) {
                        throw null;
                    }

                    var8 = true;
                    return;
                }

                BlockPos var3 = (BlockPos) var2.next();
                BlockPos var10000 = new BlockPos(this..player.posX, this.                                                                                                    .
                player.posY - 1.0D, this.                                                                                                    .
                player.posZ);
                if (lllIIllIllIl(9700, 7885)) {
                    throw null;
                }

                BlockPos var4 = var10000;
                IBlockState var5;
                Material var6 = (var5 = this..world.getBlockState(var4)).getMaterial();
                if (lllIIllIllII(this.. (this.. ())) &&
                (!lllIIlllIIll(var6, Material.LAVA) || lllIIllIlIll(var6, Material.WATER))){
                    if (lllIIllIllIl(9700, 7885)) {
                        throw null;
                    }

                    if (!lllIIlllIllI(var7.size(), 1) || !lllIIlllIlIl(var3.getX(), var4.getX()) || !lllIIlllIlIl(var3.getY(), var4.getY()) || lllIIlllIlII(var3.getZ(), var4.getZ())) {
                        if (lllIIllIllIl(9700, 7885)) {
                            throw null;
                        }

                        this. = var3;
                        float var10;
                        if (lllIIllIlIlI((var10 = var5.getBlock().getPlayerRelativeBlockHardness(var5, this..player, this..world,
                        var4)-0.0F) ==0.0F ? 0 : (var10 < 0.0F ? -1 : 1))){
                            CPacketPlayerDigging var10001 = new CPacketPlayerDigging(Action.START_DESTROY_BLOCK, var3, EnumFacing.DOWN);
                            if (lllIIllIllIl(9700, 7885)) {
                                throw null;
                            }

                            this. ((Packet) var10001);
                        }

                        if (lllIIllIllIl(9700, 7885)) {
                            throw null;
                        }

                        this.                                                                                                    .
                        player.swingArm(EnumHand.MAIN_HAND);
                        this.                                                                                                    .
                        playerController.onPlayerDamageBlock(var3, EnumFacing.DOWN);
                        this.                                                                                         .
                        ();
                        var8 = true;
                    }
                }
            }

            throw null;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Block var1) {
        if (lllIIllIlIlI(var1 instanceof BlockAir) && lllIIllIlIlI(var1 instanceof BlockBarrier) && lllIIllIlIll(var1, Blocks.BEDROCK) && !lllIIllIllII(var1 instanceof BlockLiquid)) {
            if (lllIIllIllIl(25463, 4284)) {
                throw null;
            } else {
                return true;
            }
        } else if (lllIIllIllIl(25463, 4284)) {
            throw null;
        } else {
            return false;
        }
    }

    public ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, int var3, int var4, int var5, int var6) {
        ArrayList var10000 = new ArrayList();
        if (lllIIllIllIl(26742, 9594)) {
            throw null;
        } else {
            ArrayList var7 = var10000;
            BlockPos var16 = new BlockPos(this..player.posX, this.                                                                                                    .
            player.posY, this.                                                                                                    .
            player.posZ);
            if (lllIIllIllIl(26742, 9594)) {
                throw null;
            } else {
                BlockPos var8 = var16;
                Class171 var17 = Class133. (28);
                if (lllIIllIllIl(26742, 9594)) {
                    throw null;
                } else {
                    Class171 var9 = var17;
                    if (lllIIllIllII(var17. ()) &&lllIIlllIIlI(((Class2) var9).)){
                        var16 = new BlockPos(((Class2) var9)..posX, ((Class2) var9).                                                                                            .
                        posY, ((Class2) var9).                                                                                            .
                        posZ);
                        if (lllIIllIllIl(26742, 9594)) {
                            throw null;
                        }

                        var8 = var16;
                    }

                    if (lllIIllIllIl(26742, 9594)) {
                        throw null;
                    } else {
                        byte var10 = -1;
                        int var11;
                        int var12;
                        int var13;
                        BlockPos var14;
                        Block var15;
                        boolean var10001;
                        int var18;
                        BlockPos var10002;
                        BlockPos var10003;
                        Minecraft var19;
                        byte var20;
                        if (lllIIlllIIll(this., EnumFacing.NORTH)) {
                            var18 = var2;
                            var10003 = new BlockPos(var8.getX() - var1, var8.getY() + var5, var8.getZ() + var4);
                            if (lllIIllIllIl(26742, 9594)) {
                                throw null;
                            }

                            this. = var10003;
                            var10002 = new BlockPos(var8.getX() + var2, var8.getY() - var6, var8.getZ() - var3);
                            if (lllIIllIllIl(26742, 9594)) {
                                throw null;
                            }

                            this. = var10002;
                            var11 = var2;

                            label333:
                            while (true) {
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }

                                if (!lllIIllIllIl(var18, -var1)) {
                                    break;
                                }

                                label331:
                                for (var18 = var12 = var5; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                    if (!lllIIllIllIl(var18, -var6)) {
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        --var11;
                                        var18 = var11;
                                        var10001 = true;
                                        continue label333;
                                    }

                                    for (var18 = var13 = var4; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                        if (!lllIIllIllIl(var18, -var3)) {
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            --var12;
                                            var18 = var12;
                                            continue label331;
                                        }

                                        var16 = new BlockPos(var8.getX() + var11, var8.getY() + var12, var8.getZ() + var13);
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        var14 = var16;
                                        var19 = Minecraft.getMinecraft();
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        var15 = var19.world.getBlockState(var14).getBlock();
                                        var20 = this. (var15);
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        if (lllIIllIllII(var20)) {
                                            label439:
                                            {
                                                if (lllIIlllIlII(var10, -1)) {
                                                    var18 = Block.getIdFromBlock(var15);
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    if (!lllIIlllIlIl(var18, var10)) {
                                                        break label439;
                                                    }
                                                }

                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                var7.add(var14);
                                            }
                                        }

                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        --var13;
                                        var18 = var13;
                                    }

                                    throw null;
                                }

                                throw null;
                            }
                        } else {
                            if (lllIIllIllIl(26742, 9594)) {
                                throw null;
                            }

                            if (lllIIlllIIll(this., EnumFacing.EAST)) {
                                var18 = var3;
                                var10003 = new BlockPos(var8.getX() - var4, var8.getY() + var5, var8.getZ() - var1);
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }

                                this. = var10003;
                                var10002 = new BlockPos(var8.getX() + var3, var8.getY() - var6, var8.getZ() + var2);
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }

                                this. = var10002;
                                var11 = var3;

                                label360:
                                while (true) {
                                    if (lllIIllIllIl(26742, 9594)) {
                                        throw null;
                                    }

                                    if (!lllIIllIllIl(var18, -var4)) {
                                        break;
                                    }

                                    label358:
                                    for (var18 = var12 = var5; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                        if (!lllIIllIllIl(var18, -var6)) {
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            --var11;
                                            var18 = var11;
                                            var10001 = true;
                                            continue label360;
                                        }

                                        for (var18 = var13 = var2; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                            if (!lllIIllIllIl(var18, -var1)) {
                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                --var12;
                                                var18 = var12;
                                                continue label358;
                                            }

                                            var16 = new BlockPos(var8.getX() + var11, var8.getY() + var12, var8.getZ() + var13);
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            var14 = var16;
                                            var19 = Minecraft.getMinecraft();
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            var15 = var19.world.getBlockState(var14).getBlock();
                                            var20 = this. (var15);
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            if (lllIIllIllII(var20)) {
                                                label459:
                                                {
                                                    if (lllIIlllIlII(var10, -1)) {
                                                        var18 = Block.getIdFromBlock(var15);
                                                        if (lllIIllIllIl(26742, 9594)) {
                                                            throw null;
                                                        }

                                                        if (!lllIIlllIlIl(var18, var10)) {
                                                            break label459;
                                                        }
                                                    }

                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    var7.add(var14);
                                                }
                                            }

                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            --var13;
                                            var18 = var13;
                                        }

                                        throw null;
                                    }

                                    throw null;
                                }
                            } else {
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }

                                if (lllIIlllIIll(this., EnumFacing.SOUTH)) {
                                    var18 = var1;
                                    var10003 = new BlockPos(var8.getX() + var1, var8.getY() + var5, var8.getZ() - var4);
                                    if (lllIIllIllIl(26742, 9594)) {
                                        throw null;
                                    }

                                    this. = var10003;
                                    var10002 = new BlockPos(var8.getX() - var2, var8.getY() - var6, var8.getZ() + var3);
                                    if (lllIIllIllIl(26742, 9594)) {
                                        throw null;
                                    }

                                    this. = var10002;
                                    var11 = var1;

                                    label386:
                                    while (true) {
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        if (!lllIIllIllIl(var18, -var2)) {
                                            break;
                                        }

                                        var18 = var12 = var5;

                                        label383:
                                        while (!lllIIllIllIl(26742, 9594)) {
                                            if (!lllIIllIllIl(var18, -var6)) {
                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                --var11;
                                                var18 = var11;
                                                var10001 = true;
                                                continue label386;
                                            }

                                            for (var18 = var13 = var3; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                                if (!lllIIllIllIl(var18, -var4)) {
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    --var12;
                                                    var18 = var12;
                                                    var10001 = true;
                                                    continue label383;
                                                }

                                                var16 = new BlockPos(var8.getX() + var11, var8.getY() + var12, var8.getZ() + var13);
                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                var14 = var16;
                                                var19 = Minecraft.getMinecraft();
                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                var15 = var19.world.getBlockState(var14).getBlock();
                                                var20 = this. (var15);
                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                if (lllIIllIllII(var20)) {
                                                    label461:
                                                    {
                                                        if (lllIIlllIlII(var10, -1)) {
                                                            var18 = Block.getIdFromBlock(var15);
                                                            if (lllIIllIllIl(26742, 9594)) {
                                                                throw null;
                                                            }

                                                            if (!lllIIlllIlIl(var18, var10)) {
                                                                break label461;
                                                            }
                                                        }

                                                        if (lllIIllIllIl(26742, 9594)) {
                                                            throw null;
                                                        }

                                                        var7.add(var14);
                                                    }
                                                }

                                                if (lllIIllIllIl(26742, 9594)) {
                                                    throw null;
                                                }

                                                --var13;
                                                var18 = var13;
                                            }

                                            throw null;
                                        }

                                        throw null;
                                    }
                                } else {
                                    if (lllIIllIllIl(26742, 9594)) {
                                        throw null;
                                    }

                                    if (lllIIlllIIll(this., EnumFacing.WEST)) {
                                        var18 = var4;
                                        var10003 = new BlockPos(var8.getX() + var4, var8.getY() + var5, var8.getZ() + var1);
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        this. = var10003;
                                        var10002 = new BlockPos(var8.getX() - var3, var8.getY() - var6, var8.getZ() - var2);
                                        if (lllIIllIllIl(26742, 9594)) {
                                            throw null;
                                        }

                                        this. = var10002;
                                        var11 = var4;

                                        label419:
                                        while (true) {
                                            if (lllIIllIllIl(26742, 9594)) {
                                                throw null;
                                            }

                                            if (!lllIIllIllIl(var18, -var3)) {
                                                break;
                                            }

                                            var18 = var12 = var5;

                                            label416:
                                            while (!lllIIllIllIl(26742, 9594)) {
                                                if (!lllIIllIllIl(var18, -var6)) {
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    --var11;
                                                    var18 = var11;
                                                    var10001 = true;
                                                    continue label419;
                                                }

                                                for (var18 = var13 = var1; !lllIIllIllIl(26742, 9594); var10001 = true) {
                                                    if (!lllIIllIllIl(var18, -var2)) {
                                                        if (lllIIllIllIl(26742, 9594)) {
                                                            throw null;
                                                        }

                                                        --var12;
                                                        var18 = var12;
                                                        var10001 = true;
                                                        continue label416;
                                                    }

                                                    var16 = new BlockPos(var8.getX() + var11, var8.getY() + var12, var8.getZ() + var13);
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    var14 = var16;
                                                    var19 = Minecraft.getMinecraft();
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    var15 = var19.world.getBlockState(var14).getBlock();
                                                    var20 = this. (var15);
                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    if (lllIIllIllII(var20)) {
                                                        label464:
                                                        {
                                                            if (lllIIlllIlII(var10, -1)) {
                                                                var18 = Block.getIdFromBlock(var15);
                                                                if (lllIIllIllIl(26742, 9594)) {
                                                                    throw null;
                                                                }

                                                                if (!lllIIlllIlIl(var18, var10)) {
                                                                    break label464;
                                                                }
                                                            }

                                                            if (lllIIllIllIl(26742, 9594)) {
                                                                throw null;
                                                            }

                                                            var7.add(var14);
                                                        }
                                                    }

                                                    if (lllIIllIllIl(26742, 9594)) {
                                                        throw null;
                                                    }

                                                    --var13;
                                                    var18 = var13;
                                                }

                                                throw null;
                                            }

                                            throw null;
                                        }
                                    }
                                }
                            }
                        }

                        if (lllIIllIllIl(26742, 9594)) {
                            throw null;
                        } else {
                            if (lllIIllIlIlI(var7.isEmpty())) {
                                Class63 var21 = new Class63(this, var9);
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }

                                Collections.sort(var7, var21);
                                if (lllIIllIllIl(26742, 9594)) {
                                    throw null;
                                }
                            }

                            if (lllIIllIllIl(26742, 9594)) {
                                throw null;
                            } else {
                                return var7;
                            }
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        BlockPos var10000 = this.;
        BlockPos var10001 = this.;
        Color var10002 = new Color(0, 255, 255, 100);
        if (lllIIllIllIl(22847, 1246)) {
            throw null;
        } else {
            Class181. (var10000, var10001, var10002);
            if (lllIIllIllIl(22847, 1246)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        boolean var10000;
        if (lllIIllIllII(this. ())){
            this. (false);
            var10000 = true;
        } else if (lllIIllIllIl(56601, 4933)) {
            throw null;
        } else {
            super. ();
            if (lllIIllIllIl(56601, 4933)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }
}
