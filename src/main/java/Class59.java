import java.awt.Color;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.Post;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class59 extends Class171 {
    public Class220;
    private static int 3370=24525;
    private static int 8071=20924;
    private static int 9735=-30915;
    private static int 95502=-4314;
    private static int 5170=18602;
    private static int 89007=-15515;
    private static int 1759=24419;
    private static int 50838=-22398;
    private static int 82454=-2334;
    private static int 2057=27633;
    private static int 6555=20941;
    private static int 1222=4817;
    private static int 96605=-4881;
    private static int 86904=-825;
    private static int 6854=2629;
    private static int 60853=-32444;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class59() {
        String var10001 = Class60. ("Gp3|x1_q8r0");
        if (llIIIlllllIl(50838, 1222)) {
            throw null;
        } else {
            super(var10001, 58, Class188.);
            if (llIIIlllllIl(50838, 1222)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Yt9vq)");
                if (llIIIlllllIl(50838, 1222)) {
                    throw null;
                } else {
                    String[] var10006 = new String[5];
                    String var10009 = Class60. ("Uuv>");
                    if (llIIIlllllIl(50838, 1222)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Ynjnq6");
                        if (llIIIlllllIl(50838, 1222)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var10009 = Class60. ("S\u007fy7");
                            if (llIIIlllllIl(50838, 1222)) {
                                throw null;
                            } else {
                                var10006[2] = var10009;
                                var10009 = Class60. ("O\u007fy6");
                                if (llIIIlllllIl(50838, 1222)) {
                                    throw null;
                                } else {
                                    var10006[3] = var10009;
                                    var10009 = Class60. ("_sko~t\u007f>");
                                    if (llIIIlllllIl(50838, 1222)) {
                                        throw null;
                                    } else {
                                        var10006[4] = var10009;
                                        var1.<init> (var10003, 147, this, var10006);
                                        if (llIIIlllllIl(50838, 1222)) {
                                            throw null;
                                        } else {
                                            this. = var1;
                                            Class220 var2 = new Class220;
                                            String var10005 = Class60. ("Ynj:jtp:Qt1vy)");
                                            if (llIIIlllllIl(50838, 1222)) {
                                                throw null;
                                            } else {
                                                var2.<init> (var10005, this, 3.0D);
                                                if (llIIIlllllIl(50838, 1222)) {
                                                    throw null;
                                                } else {
                                                    this. = var2;
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
            }
        }
    }

    private static boolean llIIlIIIIIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIlIIIIlIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIIlIIIIIIl(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIIIlllllIl(int var0, int var1) {
        return var0 >= var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Post var1) {
        byte var10000 = this. (var1.getEntityPlayer());
        if (llIIIlllllIl(60853, 6854)) {
            throw null;
        } else {
            if (llIIlIIIIIII(var10000)) {
                GlStateManager.disablePolygonOffset();
                if (llIIIlllllIl(60853, 6854)) {
                    throw null;
                }

                GlStateManager.doPolygonOffset(1.0F, 1100000.0F);
                if (llIIIlllllIl(60853, 6854)) {
                    throw null;
                }

                GlStateManager.enableLighting();
                if (llIIIlllllIl(60853, 6854)) {
                    throw null;
                }
            }

            if (llIIIlllllIl(60853, 6854)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var1) {
        if (llIIlIIIIIII(Class73..                                                                                                .                                                                                  ))
        {
            int var10000 = Class123. (var1);
            if (llIIIlllllIl(89007, 2057)) {
                throw null;
            }

            if (llIIlIIIIIIl(var10000, -1)) {
                return true;
            }
        }

        if (llIIIlllllIl(89007, 2057)) {
            throw null;
        } else {
            return false;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Pre var1) {
        byte var10000 = this. (var1.getEntityPlayer());
        if (llIIIlllllIl(82454, 8071)) {
            throw null;
        } else {
            if (llIIlIIIIIII(var10000)) {
                GlStateManager.enablePolygonOffset();
                if (llIIIlllllIl(82454, 8071)) {
                    throw null;
                }

                GlStateManager.doPolygonOffset(1.0F, -1100000.0F);
                if (llIIIlllllIl(82454, 8071)) {
                    throw null;
                }

                GlStateManager.disableLighting();
                if (llIIIlllllIl(82454, 8071)) {
                    throw null;
                }

                this. (var1.getEntity());
                if (llIIIlllllIl(82454, 8071)) {
                    throw null;
                }
            }

            if (llIIIlllllIl(82454, 8071)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        Class220 var10000 = this.;
        String var10001 = this.                                                                                  .();
        String var10002 = Class60. ("Ynjnq6");
        if (llIIIlllllIl(96605, 3370)) {
            throw null;
        } else {
            var10000. (var10001.equals(var10002));
            boolean var2 = true;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        String var10000 = this.                                                                                  .();
        String var10001 = Class60. ("Uuv>");
        if (llIIIlllllIl(95502, 6555)) {
            throw null;
        } else {
            boolean var10;
            if (llIIlIIIIIII(var10000.equals(var10001))) {
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                if (llIIIlllllIl(95502, 6555)) {
                    throw null;
                }

                var10 = true;
            } else {
                if (llIIIlllllIl(95502, 6555)) {
                    throw null;
                }

                var10000 = this.                                                                                  .();
                var10001 = Class60. ("Ynjnq6");
                if (llIIIlllllIl(95502, 6555)) {
                    throw null;
                }

                if (llIIlIIIIIII(var10000.equals(var10001))) {
                    this.                                                                                           .
                    (this.. ());
                    var10 = true;
                } else {
                    if (llIIIlllllIl(95502, 6555)) {
                        throw null;
                    }

                    var10000 = this.                                                                                  .
                    ();
                    var10001 = Class60. ("S\u007fy7");
                    if (llIIIlllllIl(95502, 6555)) {
                        throw null;
                    }

                    if (llIIlIIIIIII(var10000.equals(var10001))) {
                        EntityLivingBase var2;
                        EntityLivingBase var11 = var2 = (EntityLivingBase) var1;
                        double var3 = (double) (var11.getHealth() / 2.0F);
                        double var5 = (double) (var11.getMaxHealth() / 2.0F);
                        float var7 = (float) (100.0D * var3 / var5) / 50.0F;
                        GlStateManager.color(2.0F - var7, var7, 0.0F, 1.0F);
                        if (llIIIlllllIl(95502, 6555)) {
                            throw null;
                        }

                        var10 = true;
                    } else {
                        if (llIIIlllllIl(95502, 6555)) {
                            throw null;
                        }

                        var10000 = this.                                                                                  .
                        ();
                        var10001 = Class60. ("O\u007fy6");
                        if (llIIIlllllIl(95502, 6555)) {
                            throw null;
                        }

                        if (llIIlIIIIIII(var10000.equals(var10001))) {
                            Color var12 = new Color;
                            FontRenderer var10002 = this.                                                                                                    .
                            fontRenderer;
                            char var10003 = Class13. ((EntityPlayer) var1);
                            if (llIIIlllllIl(95502, 6555)) {
                                throw null;
                            }

                            var12.<init> (var10002.getColorCode(var10003));
                            if (llIIIlllllIl(95502, 6555)) {
                                throw null;
                            }

                            Color var8 = var12;
                            GlStateManager.color((float) var12.getRed() / 255.0F, (float) var8.getGreen() / 255.0F, (float) var8.getBlue() / 255.0F, 1.0F);
                            if (llIIIlllllIl(95502, 6555)) {
                                throw null;
                            }

                            var10 = true;
                        } else {
                            if (llIIIlllllIl(95502, 6555)) {
                                throw null;
                            }

                            var10000 = this.                                                                                  .
                            ();
                            var10001 = Class60. ("_sko~t\u007f>");
                            if (llIIIlllllIl(95502, 6555)) {
                                throw null;
                            }

                            if (llIIlIIIIIII(var10000.equals(var10001))) {
                                float var9 = this.                                                                                                    .
                                player.getDistance(var1) / 25.0F;
                                GlStateManager.color(2.0F - var9, var9, 0.0F, 1.0F);
                                if (llIIIlllllIl(95502, 6555)) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }

            if (llIIIlllllIl(95502, 6555)) {
                throw null;
            } else {
                if (llIIlIIIIIII(Class73..                                                                                                    .
                (var1.getName()))){
                    var10000 = this.                                                                                  .
                    ();
                    var10001 = Class60. ("Uuv>");
                    if (llIIIlllllIl(95502, 6555)) {
                        throw null;
                    }

                    if (llIIlIIIIlIl(var10000.equals(var10001))) {
                        GlStateManager.color(0.0F, 1.0F, 1.0F, 1.0F);
                        if (llIIIlllllIl(95502, 6555)) {
                            throw null;
                        }
                    }
                }

                if (llIIIlllllIl(95502, 6555)) {
                    throw null;
                } else {
                    var10 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
