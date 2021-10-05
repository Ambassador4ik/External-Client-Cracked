import net.minecraft.block.BlockLiquid;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class94 extends Class171 {
    public Class220;
    private static int 65957=-14028;
    private static int 44000=-27422;
    private static int 6002=1603;
    private static int 18379=-9901;
    private static int 4421=160;
    private static int 85515=-11514;
    private static int 8930=24531;
    private static int 9661=7312;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class94() {
        String var10005 = Class60. ("@w4cv6b]?cq7+");
        if (llIllllIlIll(85515, 6002)) {
            throw null;
        } else {
            super(var10005, 97, Class188.);
            if (llIllllIlIll(85515, 6002)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("J|?pm=>");
                if (llIllllIlIll(85515, 6002)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 214, this, 5.0D, 0.1D, 20.0D, false);
                    if (llIllllIlIll(85515, 6002)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("[y9uh;xM2ze:s)");
                        if (llIllllIlIll(85515, 6002)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 216, this, true);
                            if (llIllllIlIll(85515, 6002)) {
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

    private static boolean llIllllIlIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllllIlIlI(int var0) {
        return var0 == 0;
    }

    private static boolean llIllllIlIIl(int var0) {
        return var0 != 0;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        label45:
        {
            Class94 var2;
            if (llIllllIlIIl(this.. ())){
            if (!llIllllIlIlI(this..field_71439_g.func_70090_H())){
                break label45;
            }

            WorldClient var10000 = this.                                                                                                    .
            field_71441_e;
            BlockPos var10001 = new BlockPos;
            Vec3d var10003 = this.                                                                                                    .
            field_71439_g.func_174791_d();
            Vec3d var10004 = new Vec3d(0.0D, -1.0D, 0.0D);
            if (llIllllIlIll(44000, 4421)) {
                throw null;
            }

            var10001.<init> (var10003.func_178787_e(var10004));
            if (llIllllIlIll(44000, 4421)) {
                throw null;
            }

            if (!llIllllIlIIl(var10000.func_180495_p(var10001).func_177230_c() instanceof BlockLiquid)) {
                break label45;
            }

            var2 = this;
            boolean var4 = true;
        } else{
            if (llIllllIlIll(44000, 4421)) {
                throw null;
            }

            if (!llIllllIlIIl(this..field_71439_g.func_70090_H())){
                break label45;
            }

            var2 = this;
        }

            if (llIllllIlIll(44000, 4421)) {
                throw null;
            }

            var2.                                                                                                    .
            field_71439_g.field_70181_x = this.                                                                                  .
            ();
        }

        if (llIllllIlIll(44000, 4421)) {
            throw null;
        } else {
            boolean var3 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
