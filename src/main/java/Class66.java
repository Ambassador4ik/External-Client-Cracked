import java.awt.Color;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class Class66 {
    private String;
    private Class172;
    private Class4;
    private static int 8153=28323;
    private static int 2686=27630;
    private static int 34211=-7991;
    private static int 88736=-22691;
    private int;
    private static int 8452=14168;
    private String;
    private boolean;
    private static int 9632=2168;
    private static int 8162=-10653;
    private Class89;
    private static int 8804=15300;
    private static int 9400=-26599;
    private double;
    private String;
    private Class28;
    private static int 86824=-17604;

    static {
        boolean var10000 = true;
    }

    public Class66(Class172 var1, String var2, String var3, int var4) {
        if (llIlIIIlIIll(8162, 8452)) {
            throw null;
        } else {
            this. = Class73.                                                                                      .;
            Class28 var10014 = new Class28();
            if (llIlIIIlIIll(8162, 8452)) {
                throw null;
            } else {
                this. = var10014;
                Class89 var10013 = new Class89(6.0F);
                if (llIlIIIlIIll(8162, 8452)) {
                    throw null;
                } else {
                    this. = var10013;
                    this. = true;
                    this. = var2;
                    StringBuilder var10008 = new StringBuilder();
                    if (llIlIIIlIIll(8162, 8452)) {
                        throw null;
                    } else {
                        var10008 = var10008.insert(0, var3);
                        String var10009 = Class60. ("{");
                        if (llIlIIIlIIll(8162, 8452)) {
                            throw null;
                        } else {
                            this. = String.valueOf(var10008.append(var10009));
                            this. = var4;
                            this. = var1;
                            int var5 = this.                                                                                     .
                            (var2);
                            int var6 = this.                                                                                     .
                            (var3);
                            double var10001;
                            if (llIlIIIlIlII(var5, var6)) {
                                var10001 = (double) var6;
                                boolean var10002 = true;
                            } else {
                                if (llIlIIIlIIll(8162, 8452)) {
                                    throw null;
                                }

                                var10001 = (double) var5;
                            }

                            if (llIlIIIlIIll(8162, 8452)) {
                                throw null;
                            } else {
                                this. = var10001;
                                this.                                                                                    .
                                ((float) this. + 2.0F);
                                this.                                                                                    .
                                (0.0F);
                                this.                                                                                    .
                                (true);
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public Class66(Class172 var1, String var2, String var3, String var4, int var5) {
        if (llIlIIIlIIll(9400, 8153)) {
            throw null;
        } else {
            this. = Class73.                                                                                      .;
            Class28 var10016 = new Class28();
            if (llIlIIIlIIll(9400, 8153)) {
                throw null;
            } else {
                this. = var10016;
                Class89 var10015 = new Class89(6.0F);
                if (llIlIIIlIIll(9400, 8153)) {
                    throw null;
                } else {
                    this. = var10015;
                    this. = true;
                    this. = var2;
                    StringBuilder var10010 = new StringBuilder();
                    if (llIlIIIlIIll(9400, 8153)) {
                        throw null;
                    } else {
                        var10010 = var10010.insert(0, var3);
                        String var10011 = Class60. ("{");
                        if (llIlIIIlIIll(9400, 8153)) {
                            throw null;
                        } else {
                            this. = String.valueOf(var10010.append(var10011));
                            this. = var5;
                            this. = var1;
                            this. = var4;
                            int var6 = this.                                                                                     .
                            (var2);
                            int var7 = this.                                                                                     .
                            (var3);
                            double var10001;
                            if (llIlIIIlIlII(var6, var7)) {
                                var10001 = (double) var7;
                                boolean var10002 = true;
                            } else {
                                if (llIlIIIlIIll(9400, 8153)) {
                                    throw null;
                                }

                                var10001 = (double) var6;
                            }

                            if (llIlIIIlIIll(9400, 8153)) {
                                throw null;
                            } else {
                                this. = var10001;
                                this.                                                                                    .
                                ((float) this. + 2.0F);
                                this.                                                                                    .
                                (0.0F);
                                this.                                                                                    .
                                (true);
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIlIIIlIlII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlIIIlIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIIIlIllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIIIllIlI(int var0) {
        return var0 <= 0;
    }

    private static boolean llIlIIIllIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIIlIlIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIIIllIIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIIlIlll(int var0) {
        return var0 < 0;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1, int var2) {
        float var16;
        if (llIlIIIlIlIl((var16 = this.. () - this.                                                                                    .
        ()) ==0.0F ? 0 : (var16 < 0.0F ? -1 : 1))){
            this.                                                                                            .();
        }

        if (llIlIIIlIIll(88736, 2686)) {
            throw null;
        } else {
            int var7 = (int) ((float) var1.getResolution().getScaledWidth() - this.. ());
            ++var2;
            int var3 = 0;
            int var4 = -1;
            Class66 var8;
            Color var10000;
            boolean var10001;
            if (llIlIIIlIllI(this., Class172.)) {
                var10000 = new Color(255, 0, 0);
                if (llIlIIIlIIll(88736, 2686)) {
                    throw null;
                }

                var4 = var10000.getRGB();
                var8 = this;
                var10001 = true;
            } else {
                if (llIlIIIlIIll(88736, 2686)) {
                    throw null;
                }

                if (llIlIIIlIllI(this., Class172.)) {
                    var10000 = new Color(0, 255, 255);
                    if (llIlIIIlIIll(88736, 2686)) {
                        throw null;
                    }

                    var4 = var10000.getRGB();
                    var8 = this;
                    var10001 = true;
                } else {
                    if (llIlIIIlIIll(88736, 2686)) {
                        throw null;
                    }

                    if (llIlIIIlIllI(this., Class172.)) {
                        var10000 = new Color(255, 255, 0);
                        if (llIlIIIlIIll(88736, 2686)) {
                            throw null;
                        }

                        var4 = var10000.getRGB();
                        var8 = this;
                        var10001 = true;
                    } else {
                        if (llIlIIIlIIll(88736, 2686)) {
                            throw null;
                        }

                        if (llIlIIIlIllI(this., Class172.)) {
                            var3 -= 20;
                            var10000 = new Color(255, 255, 0);
                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }

                            var4 = var10000.getRGB();
                        }

                        if (llIlIIIlIIll(88736, 2686)) {
                            throw null;
                        }

                        var8 = this;
                    }
                }
            }

            if (llIlIIIlIIll(88736, 2686)) {
                throw null;
            } else {
                float var5;
                float var17;
                if (llIlIIIlIlll((var17 = (var5 = (float) (((long) var8. - this.. ()) *100L / (long) this.                                                                                                  ))
                -0.0F) ==0.0F ? 0 : (var17 < 0.0F ? -1 : 1))){
                    var5 = 0.0F;
                }

                if (llIlIIIlIIll(88736, 2686)) {
                    throw null;
                } else {
                    this.                                                                                    .();
                    Class4 var10004 = this.;
                    double var10005 = (double) (var7 + var3);
                    double var10006 = (double) var2;
                    double var10007 = this. + 4.0D - (double) var3;
                    Color var10010 = new Color(0, 0, 0, 160);
                    if (llIlIIIlIIll(88736, 2686)) {
                        throw null;
                    } else {
                        var10004. (var10005, var10006, var10007, 20.0D, 2.0D, var10010.getRGB());
                        this.                                                                                     .
                        ((float) (var7 + 2), (float) (var2 + 19), (float) var7 + (float) this. * var5 * 0.01F + 2.0F, (float) (var2 + 20), var4)
                        ;
                        this.                                                                                     .
                        (this., (float) (var7 + 2), (float) (var2 + 2), var4);
                        this.                                                                                     .
                        (this., (float) (var7 + 2), (float) (var2 + this.. () + 2),-1);
                        if (llIlIIIlIllI(this., Class172.) && llIlIIIllIII(this.)) {
                            if (llIlIIIllIIl(this.)) {
                                label179:
                                {
                                    try {
                                        if (llIlIIIlIIll(88736, 2686)) {
                                            throw null;
                                        }

                                        ResourceLocation var11 = AbstractClientPlayer.getLocationSkin(this.);
                                        if (llIlIIIlIIll(88736, 2686)) {
                                            throw null;
                                        }

                                        ThreadDownloadImageData var12 = AbstractClientPlayer.getDownloadImageSkin(var11, this.);
                                        if (llIlIIIlIIll(88736, 2686)) {
                                            throw null;
                                        }

                                        Minecraft var9 = Minecraft.getMinecraft();
                                        if (llIlIIIlIIll(88736, 2686)) {
                                            throw null;
                                        }

                                        var12.loadTexture(var9.getResourceManager());
                                    } catch (IOException var6) {
                                        if (llIlIIIlIIll(88736, 2686)) {
                                            throw null;
                                        }

                                        var8 = this;
                                        break label179;
                                    }

                                    if (llIlIIIlIIll(88736, 2686)) {
                                        throw null;
                                    }

                                    var8 = this;
                                    var10001 = true;
                                }

                                if (llIlIIIlIIll(88736, 2686)) {
                                    throw null;
                                }

                                var8. = false;
                            }

                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }

                            GlStateManager.resetColor();
                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }

                            Minecraft var13 = Minecraft.getMinecraft();
                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }

                            TextureManager var14 = var13.getTextureManager();
                            ResourceLocation var10 = AbstractClientPlayer.getLocationSkin(this.);
                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }

                            var14.bindTexture(var10);
                            Gui.drawScaledCustomSizeModalRect(var7 + var3 + 1, var2 + 1, 8.0F, 8.0F, 8, 8, 18, 18, 64.0F, 64.0F);
                            if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            }
                        }

                        if (llIlIIIlIIll(88736, 2686)) {
                            throw null;
                        } else {
                            boolean var15;
                            if (llIlIIIllIIl(this.. (this.))){
                                this.                                                                                    .
                                (0.0F);
                                float var18;
                                if (llIlIIIllIlI((var18 = this.. () - 1.0F) ==0.0F ? 0 : (var18 < 0.0F ? -1 : 1))){
                                    Class73.                                                                                      .                                                                                                                   .
                                    ().remove(this);
                                    this. = true;
                                }

                                if (llIlIIIlIIll(88736, 2686)) {
                                    throw null;
                                } else {
                                    var15 = true;
                                }
                            } else if (llIlIIIlIIll(88736, 2686)) {
                                throw null;
                            } else {
                                var15 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
