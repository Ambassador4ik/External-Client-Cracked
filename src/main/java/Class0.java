import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class0 extends Class171 {
    private static int -212264=-17938;
    private static int 8437=20471;
    private static int 64949=-9754;
    private static int 88=24034;
    private static int 83709=-19582;
    private static int 35954=-25291;
    public Class220;
    private static int 2142=19098;
    private static int 1125=9784;
    private static int 199577=30343;
    private static int 51448=-8861;

    static {
        boolean var10000 = true;
    }

    public Class0() {
        String var10004 = Class60. ("Iz\u007f:{L|:~0");
        if (llllIllllIII(64949, 2142)) {
            throw null;
        } else {
            super(var10004, 35, Class188.);
            if (llllIllllIII(64949, 2142)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Iw9ui;tt2<");
                if (llllIllllIII(64949, 2142)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 208, this, true);
                    if (llllIllllIII(64949, 2142)) {
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

    private static boolean llllIllllIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llllIllllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIllllIlI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llllIlllIlll(int var0) {
        return var0 != 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Block var1) {
        if (llllIllllIlI(var1, Blocks.AIR) && llllIllllIlI(var1, Blocks.BEETROOTS) && llllIllllIlI(var1, Blocks.CARROTS) && llllIllllIlI(var1, Blocks.DEADBUSH) && llllIllllIlI(var1, Blocks.DOUBLE_PLANT) && llllIllllIlI(var1, Blocks.FLOWING_LAVA) && llllIllllIlI(var1, Blocks.FLOWING_WATER) && llllIllllIlI(var1, Blocks.LAVA) && llllIllllIlI(var1, Blocks.MELON_STEM) && llllIllllIlI(var1, Blocks.NETHER_WART) && llllIllllIlI(var1, Blocks.POTATOES) && llllIllllIlI(var1, Blocks.PUMPKIN_STEM) && llllIllllIlI(var1, Blocks.RED_FLOWER) && llllIllllIlI(var1, Blocks.RED_MUSHROOM) && llllIllllIlI(var1, Blocks.REDSTONE_TORCH) && llllIllllIlI(var1, Blocks.TALLGRASS) && llllIllllIlI(var1, Blocks.TORCH) && llllIllllIlI(var1, Blocks.UNLIT_REDSTONE_TORCH) && llllIllllIlI(var1, Blocks.YELLOW_FLOWER) && llllIllllIlI(var1, Blocks.VINE) && llllIllllIlI(var1, Blocks.WATER) && llllIllllIlI(var1, Blocks.WEB) && llllIllllIlI(var1, Blocks.WHEAT)) {
            return true;
        } else if (llllIllllIII(83709, 88)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(InputUpdateEvent var1) {
        boolean var4;
        if (llllIlllIlll(this. ())){
            var4 = true;
        } else if (llllIllllIII(-212264, 199577)) {
            throw null;
        } else {
            MovementInput var3 = var1.getMovementInput();
            float var10000;
            if (llllIlllIlll(this.. ())){
                var10000 = 0.29400003F;
                boolean var10001 = true;
            } else{
                if (llllIllllIII(-212264, 199577)) {
                    throw null;
                }

                var10000 = 1.0F;
            }

            if (llllIllllIII(-212264, 199577)) {
                throw null;
            } else {
                float var2 = var10000;
                if (llllIlllIlll(this..player.onGround) &&
                llllIllllIIl(this..gameSettings.keyBindJump.isPressed())){
                    WorldClient var5 = this.                                                                                                    .
                    world;
                    BlockPos var10002 = new BlockPos;
                    Vec3d var10004 = this.                                                                                                    .
                    player.getPositionVector();
                    Vec3d var10005 = new Vec3d(0.0D, -0.5D, 0.0D);
                    if (llllIllllIII(-212264, 199577)) {
                        throw null;
                    }

                    var10002.<init> (var10004.add(var10005));
                    if (llllIllllIII(-212264, 199577)) {
                        throw null;
                    }

                    if (llllIllllIIl(this. (var5.getBlockState(var10002).getBlock()))){
                        var3.sneak = true;
                        var3.moveForward *= var2;
                        var3.moveStrafe *= var2;
                    }
                }

                if (llllIllllIII(-212264, 199577)) {
                    throw null;
                } else {
                    var4 = true;
                }
            }
        }
    }
}
