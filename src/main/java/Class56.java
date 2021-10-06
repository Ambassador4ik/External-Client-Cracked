import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import org.lwjgl.opengl.GL11;

public class Class56 extends Class171 {
    private static int 595=18163;
    private static int 15182=-27890;
    private static int 4388=4910;
    private static int 9651=21143;
    public AxisAlignedBB;
    private static int 8039=25334;
    public Class220;
    private static int 5163=10607;
    private static int 30307=-24083;
    private static int 13142=-30368;
    private static int 96837=-22484;
    private static int 5309=17109;
    private static int 83743=-10309;
    public List;
    private static int 58299=-22696;
    private static int 2921=29842;
    private static int 48270=-11646;
    private static int 55034=-12477;
    private static int 2701=16483;
    private static int 22684=-10901;
    private static int 46653=-24888;
    private static int 3182=197;
    private static int 3703=9473;

    static {
        boolean var10000 = true;
    }

    public Class56() {
        String var10005 = Class60. ("¼tPt?vy;VI0\u000b");
        if (llllllIllIll(48270, 8039)) {
            throw null;
        } else {
            super(var10005, 109, Class188.);
            if (llllllIllIll(48270, 8039)) {
                throw null;
            } else {
                ArrayList var1 = new ArrayList();
                if (llllllIllIll(48270, 8039)) {
                    throw null;
                } else {
                    this. = var1;
                    AxisAlignedBB var10004 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1D, 1.0D);
                    if (llllllIllIll(48270, 8039)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("N|?r\u007f=>");
                        if (llllllIllIll(48270, 8039)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 244, this, 5.0D, 3.0D, 10.0D, true);
                            if (llllllIllIll(48270, 8039)) {
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
        }
    }

    private static boolean llllllIllllI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llllllIlllIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllllllIIlIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllllllIlIIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llllllIllIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllllIIllI(int var0) {
        return var0 == 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        BlockPos[] var5;
        int var2 = (var5 = this. (var1)).length;

        boolean var10001;
        int var3;
        for (int var10000 = var3 = 0; !llllllIllIll(22684, 4388); var10001 = true) {
            if (!llllllIlllIl(var10000, var2)) {
                if (llllllIllIll(22684, 4388)) {
                    throw null;
                }

                return true;
            }

            BlockPos var4 = var5[var3];
            Block var6;
            if (!llllllIllllI(var6 = this..world.getBlockState(var4).getBlock(),Blocks.AIR) ||
            llllllIllllI(var6, Blocks.BEDROCK)){
                if (llllllIllIll(22684, 4388)) {
                    throw null;
                }

                return false;
            }

            if (llllllIllIll(22684, 4388)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        // $FF: Couldn't be decompiled
    }

    public BlockPos[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        return new BlockPos[]{var1.north(), var1.south(), var1.east(), var1.west(), var1.down()};
    }

    public boolean ____________________________________________________________________________/* $FF was:                                                                             */(BlockPos var1) {
        BlockPos[] var5;
        int var2 = (var5 = this. (var1)).length;

        boolean var10001;
        int var3;
        for (int var10000 = var3 = 0; !llllllIllIll(30307, 3703); var10001 = true) {
            if (!llllllIlllIl(var10000, var2)) {
                if (llllllIllIll(30307, 3703)) {
                    throw null;
                }

                return true;
            }

            BlockPos var4 = var5[var3];
            Block var6;
            if (!llllllIllllI(var6 = this..world.getBlockState(var4).getBlock(),Blocks.AIR) ||
            llllllIllllI(var6, Blocks.OBSIDIAN) && llllllIllllI(var6, Blocks.BEDROCK)){
                if (llllllIllIll(30307, 3703)) {
                    throw null;
                }

                return false;
            }

            if (llllllIllIll(30307, 3703)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public boolean _____________________________________________________________________________________/* $FF was:                                                                                      */(BlockPos var1) {
        BlockPos[] var5;
        int var2 = (var5 = this. (var1)).length;

        boolean var10001;
        int var3;
        for (int var10000 = var3 = 0; !llllllIllIll(55034, 2701); var10001 = true) {
            if (!llllllIlllIl(var10000, var2)) {
                if (llllllIllIll(55034, 2701)) {
                    throw null;
                }

                return true;
            }

            BlockPos var4 = var5[var3];
            Block var6;
            if (!llllllIllllI(var6 = this..world.getBlockState(var4).getBlock(),Blocks.AIR) ||
            llllllIllllI(var6, Blocks.OBSIDIAN)){
                if (llllllIllIll(55034, 2701)) {
                    throw null;
                }

                return false;
            }

            if (llllllIllIll(55034, 2701)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public Class34 ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        boolean var10001;
        int var2;
        for (int var10000 = var2 = 0; !llllllIllIll(13142, 9651); var10001 = true) {
            if (!llllllIlllIl(var10000, 3)) {
                if (llllllIllIll(13142, 9651)) {
                    throw null;
                }

                if (lllllllIIlIl(this. (var1))){
                    return Class34.;
                }

                if (llllllIllIll(13142, 9651)) {
                    throw null;
                }

                if (lllllllIIlIl(this. (var1))){
                    return Class34.;
                }

                if (llllllIllIll(13142, 9651)) {
                    throw null;
                }

                if (lllllllIIlIl(this. (var1))){
                    return Class34.;
                }

                if (llllllIllIll(13142, 9651)) {
                    throw null;
                }

                return Class34.;
            }

            if (llllllIllllI(this..world.getBlockState(var1.up(var2)).getBlock(),
            Blocks.AIR)){
                return Class34.;
            }

            if (llllllIllIll(13142, 9651)) {
                throw null;
            }

            ++var2;
            var10000 = var2;
        }

        throw null;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var13;
        if (llllllIllllI(var1.phase, Phase.START)) {
            var13 = true;
        } else if (llllllIllIll(46653, 5309)) {
            throw null;
        } else {
            this.                                                                                                   .
            clear();
            Vec3i var10001 = Class123. (this..player.getPositionVector());
            if (llllllIllIll(46653, 5309)) {
                throw null;
            } else {
                Vec3i var8 = var10001;
                int var2 = this.                                                                                  .();

                int var3;
                boolean var12;
                label80:
                for (int var10000 = var3 = var8.getX() - var2; !llllllIllIll(46653, 5309); var12 = true) {
                    if (!llllllIlllIl(var10000, var8.getX() + var2)) {
                        if (llllllIllIll(46653, 5309)) {
                            throw null;
                        }

                        var13 = true;
                        return;
                    }

                    int var4;
                    var10000 = var4 = var8.getZ() - var2;

                    label77:
                    while (!llllllIllIll(46653, 5309)) {
                        if (!llllllIlllIl(var10000, var8.getZ() + var2)) {
                            if (llllllIllIll(46653, 5309)) {
                                throw null;
                            }

                            ++var3;
                            var10000 = var3;
                            continue label80;
                        }

                        int var5;
                        for (var10000 = var5 = var8.getY(); !llllllIllIll(46653, 5309); var12 = true) {
                            if (!lllllllIlIIl(var10000, var8.getY() - 7)) {
                                if (llllllIllIll(46653, 5309)) {
                                    throw null;
                                }

                                ++var4;
                                var10000 = var4;
                                var12 = true;
                                continue label77;
                            }

                            BlockPos var9 = new BlockPos(var3, var5, var4);
                            if (llllllIllIll(46653, 5309)) {
                                throw null;
                            }

                            BlockPos var6 = var9;
                            Class34 var7;
                            if (llllllIllllI(var7 = this. (var6), Class34.                                                                                            ))
                            {
                                List var10 = this.;
                                Class126 var11 = new Class126(this, var6, var7);
                                if (llllllIllIll(46653, 5309)) {
                                    throw null;
                                }

                                var10.add(var11);
                            }

                            if (llllllIllIll(46653, 5309)) {
                                throw null;
                            }

                            --var5;
                            var10000 = var5;
                        }

                        throw null;
                    }

                    throw null;
                }

                throw null;
            }
        }
    }
}
