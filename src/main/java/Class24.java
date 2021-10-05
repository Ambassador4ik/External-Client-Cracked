import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class24 extends Class171 {
    private static int 69141=-1621;
    private static int 6324=18874;
    private static int 83139=-20762;
    private static int 87713=-15235;
    private static int 7286=30339;
    private static int 75=12289;
    private static int 42969=-6961;
    private static int 8135=5103;

    static {
        boolean var10000 = true;
    }

    public Class24() {
        String var10001 = Class60. ("Zz7]~5e}<fvv8y>");
        if (llllllIlIlIl(42969, 6324)) {
            throw null;
        } else {
            super(var10001, 111, Class188.);
            if (llllllIlIlIl(42969, 6324)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llllllIllIII(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llllllIlIlll(int var0) {
        return var0 != 0;
    }

    private static boolean llllllIlIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Pre var1) {
        EntityPlayer var12;
        if (llllllIlIlll((var12 = var1.getEntityPlayer()).func_82150_aj()) && llllllIllIII(var12, this..field_71439_g)){
            float var2 = this.                                                                                                    .
            func_184121_ak();
            RenderManager var3 = this.                                                                                                    .
            func_175598_ae();
            double var4 = var12.field_70142_S + (var12.field_70165_t - var12.field_70142_S) * (double) var2 - var3.field_78730_l;
            double var6 = var12.field_70137_T + (var12.field_70163_u - var12.field_70137_T) * (double) var2 - var3.field_78731_m;
            double var8 = var12.field_70136_U + (var12.field_70161_v - var12.field_70136_U) * (double) var2 - var3.field_78728_n;
            double var10 = (double) (var12.field_70126_B + (var12.field_70177_z - var12.field_70126_B) * var2);
            int var13 = var12.func_70070_b();
            if (llllllIlIlll(var12.func_70027_ad())) {
                var13 = 15728880;
            }

            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, (float) (var13 % 65536), (float) (var13 / 65536));
            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            var12.func_82142_c(false);
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 0.5F);
            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            this.                                                                                                    .
            func_175598_ae().func_188391_a(var12, var4, var6, var8, (float) var10, var2, true);
            var12.func_82142_c(true);
        }

        if (llllllIlIlIl(83139, 75)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
