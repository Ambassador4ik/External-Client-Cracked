import net.minecraft.network.play.client.CPacketCloseWindow;

public class Class168 extends Class171 {
    private static int 69819=-7482;
    private static int 1399=3199;
    private static int 10968=-24229;
    private static int 75274=-25144;
    private static int 4909=25708;
    private static int 51=32725;
    private static int 1967=10572;
    private static int 77848=-24578;
    private static int 50476=-20192;
    private static int 865=23307;

    static {
        boolean var10000 = true;
    }

    public Class168() {
        String var10001 = Class60. ("K2Sr7`f3\"");
        if (lllIIIllIlII(69819, 1967)) {
            throw null;
        } else {
            super(var10001, 74, Class188.);
            if (lllIIIllIlII(69819, 1967)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllIIIllIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIllIlll(Object var0) {
        return var0 == null;
    }

    private static boolean lllIIIllIllI(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean lllIIIllIlIl(int var0) {
        return var0 != 0;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (lllIIIllIlII(77848, 4909)) {
            throw null;
        } else {
            boolean var10000;
            if (lllIIIllIlll(this..player)){
                var10000 = true;
            } else if (lllIIIllIlII(77848, 4909)) {
                throw null;
            } else {
                CPacketCloseWindow var10001 = new CPacketCloseWindow(this..player.inventoryContainer.windowId);
                if (lllIIIllIlII(77848, 4909)) {
                    throw null;
                } else {
                    this. (var10001);
                    var10000 = true;
                }
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lllIIIllIlIl(var1 instanceof CPacketCloseWindow)) {
            int var10000 = Class22. ((CPacketCloseWindow) var1);
            if (lllIIIllIlII(10968, 1399)) {
                throw null;
            }

            if (!lllIIIllIllI(var10000, this..player.inventoryContainer.windowId)){
                if (lllIIIllIlII(10968, 1399)) {
                    throw null;
                }

                return false;
            }
        }

        if (lllIIIllIlII(10968, 1399)) {
            throw null;
        } else {
            return true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
