import net.minecraft.util.MovementInput;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class107 extends Class171 {
    private static int 302=8247;
    public Class220;
    private static int 94582=-11491;
    private static int 63665=-20597;
    private static int 9280=4828;
    public Class220;
    private static int 73460=-9876;
    private static int 9788=20282;
    private static int 34396=-14693;
    private static int 513=25557;

    static {
        boolean var10000 = true;
    }

    public Class107() {
        String var10005 = Class60. ("Yy4D\u007f6\u007f`[6s`5");
        if (llIllllllIIl(34396, 9280)) {
            throw null;
        } else {
            super(var10005, 8, Class188.);
            if (llIllllllIIl(34396, 9280)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("]~3t}1qy8t)");
                if (llIllllllIIl(34396, 9280)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 20, this, 60.0D, 1.0D, 100.0D, true);
                    if (llIllllllIIl(34396, 9280)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("Uu9vg;\\s2)");
                        if (llIllllllIIl(34396, 9280)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, 24200, this, false);
                            if (llIllllllIIl(34396, 9280)) {
                                throw null;
                            } else {
                                this. = var10003;
                                this. (new Class220[]{this., this.});
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllllllIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIllllllIll(int var0) {
        return var0 == 0;
    }

    private static boolean llIllllllIIl(int var0, int var1) {
        return var0 >= var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(InputUpdateEvent var1) {
        StringBuilder var10004 = new StringBuilder();
        if (llIllllllIIl(94582, 9788)) {
            throw null;
        } else {
            var10004 = var10004.append(this.. ());
            String var10005 = Class60. ("~");
            if (llIllllllIIl(94582, 9788)) {
                throw null;
            } else {
                this. (String.valueOf(var10004.append(var10005)));
                MovementInput var4 = var1.getMovementInput();
                double var2 = (double) this.                                                                                            .
                () * 0.05D;
                if (llIllllllIlI(this..player.isHandActive()) &&
                llIllllllIll(this..player.isRiding()) &&(!llIllllllIlI(this.. ()) ||
                llIllllllIll(this..player.onGround))){
                    if (llIllllllIIl(94582, 9788)) {
                        throw null;
                    }

                    var4.moveForward = (float) ((double) var4.moveForward * var2);
                    var4.moveStrafe = (float) ((double) var4.moveStrafe * var2);
                }

                if (llIllllllIIl(94582, 9788)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
