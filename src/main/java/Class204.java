import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;

public class Class204 extends Class171 {
    private static int 70397=-132;
    private static int 9926=31508;
    private static int 1275=15688;
    private static int 4923=1450;
    private static int 26710=-15783;
    private static int 53427=-19443;
    private static int 6681=17549;
    private static int 62227=-17497;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class204() {
        String var10004 = Class60. ("Hr}:wuz:Akt:s?");
        if (lllllIIlllll(62227, 6681)) {
            throw null;
        } else {
            super(var10004, 50, Class188.);
            if (lllllIIlllll(62227, 6681)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Ik9\u007f{?");
                if (lllllIIlllll(62227, 6681)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 130, this, 30.0D, 0.0D, 100.0D, true);
                    if (lllllIIlllll(62227, 6681)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean lllllIlIIIlI(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIIlllll(int var0, int var1) {
        return var0 >= var1;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        int var4 = this.                                                                                  .();
        StringBuilder var10002 = new StringBuilder();
        if (lllllIIlllll(26710, 1275)) {
            throw null;
        } else {
            var10002 = var10002.append(var4);
            String var10003 = Class60. ("~");
            if (lllllIIlllll(26710, 1275)) {
                throw null;
            } else {
                this. (String.valueOf(var10002.append(var10003)));
                if (lllllIlIIIlI(this..player.isRiding()) &&
                lllllIlIIIlI(this..gameSettings.keyBindForward.isKeyDown())){
                    Entity var2 = this.                                                                                                    .
                    player.getRidingEntity();
                    float var3 = this.                                                                                                    .
                    player.rotationYaw * 0.017453292F;
                    float var5 = 0.001F * (float) var4;
                    double var6 = var2.motionX;
                    float var8 = MathHelper.sin(var3);
                    if (lllllIIlllll(26710, 1275)) {
                        throw null;
                    }

                    var2.motionX = var6 - (double) (var8 * var5);
                    double var10001 = var2.motionZ;
                    float var7 = MathHelper.cos(var3);
                    if (lllllIIlllll(26710, 1275)) {
                        throw null;
                    }

                    var2.motionZ = var10001 + (double) (var7 * var5);
                }

                if (lllllIIlllll(26710, 1275)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _??????????_??????????/* $FF was: _?????????? ??????????*/();
}
