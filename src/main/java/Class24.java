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
        if (llllllIlIlll((var12 = var1.getEntityPlayer()).isInvisible()) && llllllIllIII(var12, this..player)){
            float var2 = this.                                                                                                    .
            getRenderPartialTicks();
            RenderManager var3 = this.                                                                                                    .
            getRenderManager();
            double var4 = var12.lastTickPosX + (var12.posX - var12.lastTickPosX) * (double) var2 - var3.viewerPosX;
            double var6 = var12.lastTickPosY + (var12.posY - var12.lastTickPosY) * (double) var2 - var3.viewerPosY;
            double var8 = var12.lastTickPosZ + (var12.posZ - var12.lastTickPosZ) * (double) var2 - var3.viewerPosZ;
            double var10 = (double) (var12.prevRotationYaw + (var12.rotationYaw - var12.prevRotationYaw) * var2);
            int var13 = var12.getBrightnessForRender();
            if (llllllIlIlll(var12.isBurning())) {
                var13 = 15728880;
            }

            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) (var13 % 65536), (float) (var13 / 65536));
            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            var12.setInvisible(false);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.5F);
            if (llllllIlIlIl(83139, 75)) {
                throw null;
            }

            this.                                                                                                    .
            getRenderManager().renderEntity(var12, var4, var6, var8, (float) var10, var2, true);
            var12.setInvisible(true);
        }

        if (llllllIlIlIl(83139, 75)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
