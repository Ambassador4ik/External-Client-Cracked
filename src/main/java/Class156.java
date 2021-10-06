import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;

public class Class156 extends Class171 {
    public Class220;
    private static int 5152=28019;
    private static int 3249=21834;
    private static int 48336=-18514;
    private static int 70420=-4029;
    public Class220;
    private static int 6733=8910;
    private static int 6682=24325;
    private static int 46913=-17448;
    private static int 38607=-3202;
    private static int 38949=-29267;
    private static int 329=19120;

    static {
        boolean var10000 = true;
    }

    public Class156() {
        String var10005 = Class60. ("Omm<qs/");
        if (llIllIIIIIll(38949, 6733)) {
            throw null;
        } else {
            super(var10005, 10, Class188.);
            if (llIllIIIIIll(38949, 6733)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Q~9\u007fn;Nj2ix:x/");
                if (llIllIIIIIll(38949, 6733)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 193, this, false);
                    if (llIllIIIIIll(38949, 6733)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("Jf(gK*ey#oc+sc$d5");
                        if (llIllIIIIIll(38949, 6733)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 168, this, false);
                            if (llIllIIIIIll(38949, 6733)) {
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

    private static boolean llIllIIIIlII(int var0) {
        return var0 > 0;
    }

    private static boolean llIllIIIIIIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIllIIIIIlI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIllIIIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        byte var10000;
        boolean var10001;
        if (llIllIIIIIIl(this.. ())){
            var10000 = Class13. ();
            if (llIllIIIIIll(46913, 329)) {
                throw null;
            }

            var10001 = true;
        } else{
            if (llIllIIIIIll(46913, 329)) {
                throw null;
            }

            float var6;
            if (llIllIIIIlII((var6 = this..player.moveForward - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1))){
                var10000 = 1;
                var10001 = true;
            } else{
                if (llIllIIIIIll(46913, 329)) {
                    throw null;
                }

                var10000 = 0;
            }
        }

        if (llIllIIIIIll(46913, 329)) {
            throw null;
        } else {
            EntityPlayerSP var3;
            label51:
            {
                byte var2 = var10000;
                var3 = this.                                                                                                    .
                player;
                if (llIllIIIIIIl(var2)) {
                    byte var4 = Class13. ();
                    if (llIllIIIIIll(46913, 329)) {
                        throw null;
                    }

                    if (llIllIIIIIIl(var4)) {
                        var10001 = true;
                        boolean var10002 = true;
                        break label51;
                    }
                }

                if (llIllIIIIIll(46913, 329)) {
                    throw null;
                }

                var10001 = this.                                                                                                    .
                player.isSprinting();
            }

            if (llIllIIIIIll(46913, 329)) {
                throw null;
            } else {
                var3.setSprinting(var10001);
                boolean var5 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIllIIIIIIl(this.. ()) &&
        llIllIIIIIIl(var1 instanceof CPacketEntityAction) && !llIllIIIIIlI(((CPacketEntityAction) var1).getAction(), Action.STOP_SPRINTING))
        {
            if (llIllIIIIIll(48336, 3249)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIllIIIIIll(48336, 3249)) {
            throw null;
        } else {
            return true;
        }
    }
}
