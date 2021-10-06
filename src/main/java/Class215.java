import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.block.BlockBed;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class215 extends Class171 {
    private static int 16666=-6898;
    private static int 5990=24632;
    private static int 5918=20041;
    public EnumFacing[];
    private static int 41751=-29414;
    private static int 81055=-22186;
    private static int 10671=-2382;
    private static int 40237=-32532;
    private static int 2043=3303;
    private static int 7040=27006;
    private static int 99135=-1071;
    private static int 2541=26438;
    private static int 603=24332;

    static {
        boolean var10000 = true;
    }

    public Class215() {
        String var10003 = Class60. ("Y\u007f8\u007f]hyz3qu)");
        if (llIIllIIIIII(10671, 603)) {
            throw null;
        } else {
            super(var10003, 67, Class188.);
            if (llIIllIIIIII(10671, 603)) {
                throw null;
            } else {
                this. = new EnumFacing[]{EnumFacing.NORTH, EnumFacing.EAST, EnumFacing.SOUTH, EnumFacing.WEST};
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIlIllllll(int var0) {
        return var0 != 0;
    }

    private static boolean llIIllIIIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIIllIIIIII(int var0, int var1) {
        return var0 >= var1;
    }

    public ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        ArrayList var10000 = new ArrayList();
        if (llIIllIIIIII(81055, 7040)) {
            throw null;
        } else {
            ArrayList var1 = var10000;
            Minecraft var8 = Minecraft.getMinecraft();
            if (llIIllIIIIII(81055, 7040)) {
                throw null;
            } else {
                BlockPos var2 = var8.player.getPosition();
                byte var3 = 3;
                int var4 = 3;

                boolean var10001;
                label76:
                for (int var9 = var4; !llIIllIIIIII(81055, 7040); var10001 = true) {
                    if (!llIIllIIIIII(var9, -var3)) {
                        if (llIIllIIIIII(81055, 7040)) {
                            throw null;
                        }

                        return var1;
                    }

                    int var5;
                    var9 = var5 = var3;

                    label73:
                    while (!llIIllIIIIII(81055, 7040)) {
                        if (!llIIllIIIIII(var9, -var3)) {
                            if (llIIllIIIIII(81055, 7040)) {
                                throw null;
                            }

                            --var4;
                            var9 = var4;
                            continue label76;
                        }

                        int var6;
                        for (var9 = var6 = var3; !llIIllIIIIII(81055, 7040); var10001 = true) {
                            if (!llIIllIIIIII(var9, -var3)) {
                                if (llIIllIIIIII(81055, 7040)) {
                                    throw null;
                                }

                                --var5;
                                var9 = var5;
                                var10001 = true;
                                continue label73;
                            }

                            BlockPos var10 = new BlockPos(var2.getX() + var4, var2.getY() + var5, var2.getZ() + var6);
                            if (llIIllIIIIII(81055, 7040)) {
                                throw null;
                            }

                            BlockPos var7 = var10;
                            var8 = Minecraft.getMinecraft();
                            if (llIIllIIIIII(81055, 7040)) {
                                throw null;
                            }

                            if (llIIlIllllll(var8.world.getBlockState(var7).getBlock() instanceof BlockBed)) {
                                var1.add(var7);
                            }

                            if (llIIllIIIIII(81055, 7040)) {
                                throw null;
                            }

                            --var6;
                            var9 = var6;
                        }

                        throw null;
                    }

                    throw null;
                }

                throw null;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        if (llIIlIllllll(this.. (20))){
            EnumFacing[] var10001 = this.;
            int var10002 = Math.round(this..player.rotationYaw / 90.0F);
            if (llIIllIIIIII(40237, 5918)) {
                throw null;
            }

            EnumFacing var2 = var10001[var10002 & 3].getOpposite();
            this.                                                                                                    .
            playerController.onPlayerDamageBlock(var1, var2);
            this.                                                                                                    .
            player.swingArm(EnumHand.MAIN_HAND);
            this.                                                                                         .();
        }

        if (llIIllIIIIII(40237, 5918)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        ArrayList var2;
        if (llIIllIIIIIl((var2 = this. ()).isEmpty())){
            Class91 var10001 = new Class91(this);
            if (llIIllIIIIII(16666, 2541)) {
                throw null;
            }

            Collections.sort(var2, var10001);
            if (llIIllIIIIII(16666, 2541)) {
                throw null;
            }
        }

        if (llIIllIIIIII(16666, 2541)) {
            throw null;
        } else {
            var2.forEach(this::);
            boolean var10000 = true;
        }
    }
}
