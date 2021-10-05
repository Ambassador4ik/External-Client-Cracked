import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketEntityAction.Action;

public class Class1 extends Class171 {
    private static int 4642=12953;
    private static int 66311=-25287;
    private static int 1750=18334;
    private static int 61473=-10685;
    private static int 9492=29351;
    private static int 11511=-25055;
    private static int 41510=-13348;
    private static int 6627=7534;

    static {
        boolean var10000 = true;
    }

    public Class1() {
        String var10001 = Class60. ("HJ<~+");
        if (llIIlIllIIll(41510, 4642)) {
            throw null;
        } else {
            super(var10001, 69, Class188.);
            if (llIIlIllIIll(41510, 4642)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIlIllIIlI(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlIllIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlIllIIIl(int var0) {
        return var0 != 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIIlIllIIIl(var1 instanceof CPacketUseEntity) && llIIlIllIIlI(((CPacketUseEntity) var1).func_149564_a(this..field_71441_e)) &&
        llIIlIllIIIl(this..field_71439_g.field_70122_E)){
            if (llIIlIllIIIl(this..field_71439_g.func_70051_ag())){
                CPacketEntityAction var10000 = new CPacketEntityAction(this..field_71439_g, Action.STOP_SPRINTING);
                if (llIIlIllIIll(11511, 9492)) {
                    throw null;
                }

                this. (var10000);
            }

            if (llIIlIllIIll(11511, 9492)) {
                throw null;
            }

            CPacketEntityAction var10001 = new CPacketEntityAction(this..field_71439_g, Action.START_SPRINTING);
            if (llIIlIllIIll(11511, 9492)) {
                throw null;
            }

            this. (var10001);
        }

        if (llIIlIllIIll(11511, 9492)) {
            throw null;
        } else {
            boolean var3 = super. (var1, var2);
            if (llIIlIllIIll(11511, 9492)) {
                throw null;
            } else {
                return var3;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
