import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class30 extends Class171 {
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 5764=1581;
    private static int 93882=-17843;
    private static int 632=29495;
    private static int 3004=15653;
    private static int 6074=12373;
    private static int 9635=-12968;
    private static int 92014=-25757;
    private static int 77104=-11573;
    public Class220;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class30() {
        String var10008 = Class60. ("A\u007f4rd6]x?ry77");
        if (llIllIIlIIII(93882, 6074)) {
            throw null;
        } else {
            super(var10008, 114, Class188.);
            if (llIllIIlIIII(93882, 6074)) {
                throw null;
            } else {
                Class220 var4 = new Class220;
                String var10010 = Class60. ("Is8|w:h\u0003");
                if (llIllIIlIIII(93882, 6074)) {
                    throw null;
                } else {
                    var4.<init> (var10010, this, 0.0D, -2.0D, 2.0D, false);
                    if (llIllIIlIIII(93882, 6074)) {
                        throw null;
                    } else {
                        this. = var4;
                        Class220 var10007 = new Class220;
                        String var10009 = Class60. ("Is8|w:h\u0002");
                        if (llIllIIlIIII(93882, 6074)) {
                            throw null;
                        } else {
                            var10007.<init> (var10009, this, 0.0D, -2.0D, 2.0D, false);
                            if (llIllIIlIIII(93882, 6074)) {
                                throw null;
                            } else {
                                this. = var10007;
                                Class220 var10006 = new Class220;
                                var10008 = Class60. ("Is8|w:h\u0001");
                                if (llIllIIlIIII(93882, 6074)) {
                                    throw null;
                                } else {
                                    var10006.<init> (var10008, this, 0.0D, -2.0D, 2.0D, false);
                                    if (llIllIIlIIII(93882, 6074)) {
                                        throw null;
                                    } else {
                                        this. = var10006;
                                        Class220 var10005 = new Class220;
                                        String var3 = Class60. ("Px?zl=\u0003");
                                        if (llIllIIlIIII(93882, 6074)) {
                                            throw null;
                                        } else {
                                            var10005.<init> (var3, this, 0.0D, -2.0D, 2.0D, false);
                                            if (llIllIIlIIII(93882, 6074)) {
                                                throw null;
                                            } else {
                                                this. = var10005;
                                                Class220 var10004 = new Class220;
                                                String var2 = Class60. ("Px?zl=\u0002");
                                                if (llIllIIlIIII(93882, 6074)) {
                                                    throw null;
                                                } else {
                                                    var10004.<init> (var2, this, 0.0D, -2.0D, 2.0D, false);
                                                    if (llIllIIlIIII(93882, 6074)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10004;
                                                        Class220 var10003 = new Class220;
                                                        String var1 = Class60. ("Px?zl=\u0001");
                                                        if (llIllIIlIIII(93882, 6074)) {
                                                            throw null;
                                                        } else {
                                                            var10003.<init> (var1, this, 0.0D, -2.0D, 2.0D, false);
                                                            if (llIllIIlIIII(93882, 6074)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10003;
                                                                this.
                                                                (new Class220[]{this., this., this., this., this., this.});
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
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllIIlIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIIlIIIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIllIIIllll(int var0) {
        return var0 == 0;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderSpecificHandEvent var1) {
        boolean var10000;
        if (llIllIIIllll(Class73..                                                                                                .                                                                                  ))
        {
            var10000 = true;
        } else if (llIllIIlIIII(9635, 632)) {
            throw null;
        } else {
            double var2 = this.                                                                                                   .
            ();
            double var4 = this.                                                                                           .
            ();
            double var6 = this.                                                                              .();
            double var8 = this.                                                                                                  .
            ();
            double var10 = this.                                                                                  .();
            double var12 = this.                                                                                            .
            ();
            if (llIllIIlIIIl(var1.getHand(), EnumHand.MAIN_HAND)) {
                GlStateManager.translate(var2, var4, var6);
                if (llIllIIlIIII(9635, 632)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            } else if (llIllIIlIIII(9635, 632)) {
                throw null;
            } else {
                if (llIllIIlIIIl(var1.getHand(), EnumHand.OFF_HAND)) {
                    GlStateManager.translate(-var2 + var8, -var4 + var10, -var6 + var12);
                    if (llIllIIlIIII(9635, 632)) {
                        throw null;
                    }
                }

                if (llIllIIlIIII(9635, 632)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
