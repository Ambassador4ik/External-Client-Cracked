import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderPlayerEvent.Post;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class146 extends Class171 {
    public Class220;
    private static int 1565=579;
    private static int 6179=30345;
    private static int 39840=-24188;
    private static int 2263=16195;
    public Class220;
    private static int 8963=20140;
    private static int 68608=-10229;
    private static int 70182=-13631;
    public Class220;
    private static int 79172=-7127;
    private static int 18755=-10077;
    private static int 8916=16782;

    static {
        boolean var10000 = true;
    }

    public Class146() {
        String var10005 = Class60. ("Uf7d0pp`<G~`8|4");
        if (llllIIllIlIl(39840, 2263)) {
            throw null;
        } else {
            super(var10005, 91, Class188.);
            if (llllIIllIlIl(39840, 2263)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10007 = Class60. ("\u0003");
                if (llllIIllIlIl(39840, 2263)) {
                    throw null;
                } else {
                    var1.<init> (var10007, 199, this, 1.0D, 0.0D, 5.0D, false);
                    if (llllIIllIlIl(39840, 2263)) {
                        throw null;
                    } else {
                        this. = var1;
                        Class220 var10004 = new Class220;
                        String var10006 = Class60. ("\u0002");
                        if (llllIIllIlIl(39840, 2263)) {
                            throw null;
                        } else {
                            var10004.<init> (var10006, 200, this, 1.0D, 0.0D, 5.0D, false);
                            if (llllIIllIlIl(39840, 2263)) {
                                throw null;
                            } else {
                                this. = var10004;
                                Class220 var10003 = new Class220;
                                var10005 = Class60. ("\u0001");
                                if (llllIIllIlIl(39840, 2263)) {
                                    throw null;
                                } else {
                                    var10003.<init> (var10005, 201, this, 1.0D, 0.0D, 5.0D, false);
                                    if (llllIIllIlIl(39840, 2263)) {
                                        throw null;
                                    } else {
                                        this. = var10003;
                                        this. ((Class220[]) (new Class220[]{this.}));
                                        this. ((Class220[]) (new Class220[]{this.}));
                                        this. ((Class220[]) (new Class220[]{this.}));
                                        boolean var10000 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llllIIllIIll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llllIIllIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIllIlII(int var0) {
        return var0 != 0;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Post var1) {
        if (llllIIllIIll(var1.getEntityPlayer(), this..player) &&llllIIllIlII(Class73..                                                                                                .                                                                                  ))
        {
            GlStateManager.popMatrix();
            if (llllIIllIlIl(68608, 1565)) {
                throw null;
            }
        }

        if (llllIIllIlIl(68608, 1565)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Pre var1) {
        if (llllIIllIIll(var1.getEntityPlayer(), this..player) &&llllIIllIlII(Class73..                                                                                                .                                                                                  ))
        {
            GlStateManager.pushMatrix();
            if (llllIIllIlIl(18755, 6179)) {
                throw null;
            }

            GlStateManager.scale(this.. (), this.                                                                                                   .
            (), this.                                                                                  .());
            if (llllIIllIlIl(18755, 6179)) {
                throw null;
            }
        }

        if (llllIIllIlIl(18755, 6179)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
