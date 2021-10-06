import net.minecraft.block.material.Material;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class175 extends Class171 {
    private static int 27346=-24652;
    private static int 1121=179;
    private static int 5365=5910;
    private static int 40713=-15577;
    private static int 98785=-12848;
    private static int 3672=12131;
    private static int 54=2089;
    private static int 16177=-25605;

    static {
        boolean var10000 = true;
    }

    public Class175() {
        String var10001 = Class60. ("Yw|{lL|nw)");
        if (llIIllllIIlI(98785, 5365)) {
            throw null;
        } else {
            super(var10001, 120, Class188.);
            if (llIIllllIIlI(98785, 5365)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIllllIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIllllIlII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIllllIIll(Object var0, Object var1) {
        return var0 != var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(FogDensity var1) {
        if (!llIIllllIIll(var1.getState().getMaterial(), Material.WATER) || llIIllllIlII(var1.getState().getMaterial(), Material.LAVA)) {
            if (llIIllllIIlI(16177, 1121)) {
                throw null;
            }

            var1.setDensity(0.0F);
            var1.setCanceled(true);
        }

        if (llIIllllIIlI(16177, 1121)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
