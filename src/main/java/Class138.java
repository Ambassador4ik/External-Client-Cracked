import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;

public class Class138 extends Class171 {
    private static int 18766=-9747;
    private static int 78348=-31531;
    private static int 76275=-5365;
    private static int 58768=-7252;
    private static int 2901=15770;
    private static int 2042=5561;
    private static int 5792=2984;
    private static int 41793=-20434;
    private static int 9504=23907;
    private static int 82094=-28792;
    public Class220;
    private static int 5598=15326;
    private static int 2182=3649;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class138() {
        String var10005 = Class60. ("Uu8Xss<+");
        if (llIIlIlIllll(76275, 2901)) {
            throw null;
        } else {
            super(var10005, 51, Class188.);
            if (llIIlIlIllll(76275, 2901)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Xx4{jT0{pu<|(");
                if (llIIlIlIllll(76275, 2901)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 136, this, true);
                    if (llIIlIlIllll(76275, 2901)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("BI8kz:y?");
                        if (llIIlIlIllll(76275, 2901)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 137, this, 0.5D, 0.1D, 1.0D, false);
                            if (llIIlIlIllll(76275, 2901)) {
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

    private static boolean llIIlIllIIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIlIlIllll(int var0, int var1) {
        return var0 >= var1;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        var1.setCanceled(true);
        if (!llIIlIllIIII(this.. ()) ||llIIlIllIIII(this. ())){
            if (llIIlIlIllll(82094, 2182)) {
                throw null;
            }

            this.                                                                                                    .
            player.noClip = true;
            this.                                                                                                    .
            player.fallDistance = 0.0F;
            this.                                                                                                    .
            player.onGround = false;
            this.                                                                                                    .
            player.motionY = 0.0D;
            this.                                                                                                    .
            player.jumpMovementFactor = 0.0365F;
            EntityPlayerSP var10000;
            if (llIIlIllIIII(this..gameSettings.keyBindJump.isKeyDown())){
                var10000 = this.                                                                                                    .
                player;
                var10000.motionY += this.                                                                                            .
                ();
            }

            if (llIIlIlIllll(82094, 2182)) {
                throw null;
            }

            if (llIIlIllIIII(this..gameSettings.keyBindSneak.isKeyDown())){
                var10000 = this.                                                                                                    .
                player;
                var10000.motionY -= this.                                                                                            .
                ();
            }
        }

        if (llIIlIlIllll(82094, 2182)) {
            throw null;
        } else {
            boolean var2 = true;
        }
    }

    public boolean __________________________________________________________________________________/* $FF was:                                                                                   */() {
        BlockPos var10000 = new BlockPos(this..player.posX, this.                                                                                                    .
        player.posY, this.                                                                                                    .
        player.posZ);
        if (llIIlIlIllll(78348, 9504)) {
            throw null;
        } else {
            BlockPos var1 = var10000;
            Block var2 = this.                                                                                                    .
            world.getBlockState(var1).getBlock();
            Block var3 = this.                                                                                                    .
            world.getBlockState(var1.up()).getBlock();
            if (llIIlIllIIII(var2 instanceof BlockAir) && llIIlIllIIII(var3 instanceof BlockAir)) {
                return false;
            } else if (llIIlIlIllll(78348, 9504)) {
                throw null;
            } else {
                return true;
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        return true;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
