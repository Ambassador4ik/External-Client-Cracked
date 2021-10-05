import java.awt.Color;

import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class Class222 extends Class171 {
    private static int 4390=30872;
    private static int 990=22686;
    public int;
    private static int 75170=-2344;
    private static int 49898=-3407;
    private static int 63=7028;
    private static int 9292=26241;
    private static int 7418=14657;
    public static Class220;
    private static int 82927=-30743;
    private static int 32720=-14488;
    private static int 53850=-7993;
    private static int 2519=22710;
    private static int 40795=-5476;
    private static int 2336=2535;
    public double;
    private static int 19663=-12124;

    static {
        boolean var10000 = true;
    }

    public Class222() {
        String var10007 = Class60. ("Yt9wn;|i2(");
        if (llIlIIIlllll(32720, 7418)) {
            throw null;
        } else {
            super(var10007, 76, Class188.);
            if (llIlIIIlllll(32720, 7418)) {
                throw null;
            } else {
                this. = 1.5707963267948966D;
                this. = 3;
                Class220[] var10001 = new Class220[1];
                Class220 var10004 = new Class220;
                boolean var10006 = false;
                String var1 = Class60. ("Rq<{>");
                if (llIlIIIlllll(32720, 7418)) {
                    throw null;
                } else {
                    String[] var10008 = new String[2];
                    String var10011 = Class60. ("B\u0001");
                    if (llIlIIIlllll(32720, 7418)) {
                        throw null;
                    } else {
                        var10008[0] = var10011;
                        var10011 = Class60. ("^rk\u007f}otu|(");
                        if (llIlIIIlllll(32720, 7418)) {
                            throw null;
                        } else {
                            var10008[1] = var10011;
                            var10004.<init> (var1, this, var10008);
                            if (llIlIIIlllll(32720, 7418)) {
                                throw null;
                            } else {
                                                                                                                     =
                                var10004;
                                var10001[0] = var10004;
                                this. ((Class220[]) var10001);
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIlIIIlllll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIIlIIIIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIIlIIIII(int var0, int var1) {
        return var0 < var1;
    }

    public double ____________________________________________________________________________/* $FF was:                                                                             */(double var1) {
        float var10000 = MathHelper.func_76131_a(this..func_175606_aa().field_70125_A + 30.0F, -90.0F, 90.0F);
        if (llIlIIIlllll(82927, 2519)) {
            throw null;
        } else {
            double var5 = Math.toRadians((double) var10000);
            if (llIlIIIlllll(82927, 2519)) {
                throw null;
            } else {
                double var3 = var5;
                var5 = Math.cos(var1);
                if (llIlIIIlllll(82927, 2519)) {
                    throw null;
                } else {
                    double var10001 = Math.sin(var3);
                    if (llIlIIIlllll(82927, 2519)) {
                        throw null;
                    } else {
                        return var5 * var10001 * (double) (this. * 10);
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        ScaledResolution var10000 = var1.getResolution();
        float var11 = (float) (var10000.func_78326_a() / 2);
        float var2 = (float) var10000.func_78328_b() * 0.8F;
        Class36[] var13 = Class36.values();
        if (llIlIIIlllll(19663, 9292)) {
            throw null;
        } else {
            Class36[] var3 = var13;
            int var4 = var13.length;

            int var5;
            boolean var18;
            for (int var14 = var5 = 0; !llIlIIIlllll(19663, 9292); var18 = true) {
                if (!llIlIIlIIIII(var14, var4)) {
                    if (llIlIIIlllll(19663, 9292)) {
                        throw null;
                    }

                    boolean var17 = true;
                    return;
                }

                Class36 var6 = var3[var5];
                double var7 = this. (var6);
                float var9 = var11 + (float) this. (var7) - (float) (this..field_71466_p.func_78256_a(var6. ()) /2);
                float var12 = var2 + (float) this. (var7);
                Class4 var10001 = this.;
                double var10002 = (double) (var9 - 1.0F);
                double var10003 = (double) (var12 - 1.0F);
                double var10004 = (double) (this.. (var6. ())+1);
                double var10005 = (double) this.                                                                                           .
                ();
                Color var10007 = new Color(0, 0, 0, 160);
                if (llIlIIIlllll(19663, 9292)) {
                    throw null;
                }

                var10001. (var10002, var10003, var10004, var10005, 2.0D, var10007.getRGB());
                Class4 var15 = this.;
                String var16 = var6. ();
                int var19;
                if (llIlIIlIIIIl(var6, Class36.)) {
                    var19 = Color.RED.getRGB();
                    boolean var10 = true;
                } else {
                    if (llIlIIIlllll(19663, 9292)) {
                        throw null;
                    }

                    var19 = -1;
                }

                if (llIlIIIlllll(19663, 9292)) {
                    throw null;
                }

                var15. (var16, var9, var12, var19);
                ++var5;
                var14 = var5;
            }

            throw null;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public double ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class36 var1) {
        float var10001 = MathHelper.func_76142_g(this..func_175606_aa().field_70177_z);
        if (llIlIIIlllll(75170, 2336)) {
            throw null;
        } else {
            double var4 = Math.toRadians((double) var10001);
            if (llIlIIIlllll(75170, 2336)) {
                throw null;
            } else {
                double var2 = var4;
                int var5 = var1.ordinal();
                return var2 + (double) var5 * this.;
            }
        }
    }

    public double ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1) {
        double var10000 = Math.sin(var1);
        if (llIlIIIlllll(49898, 990)) {
            throw null;
        } else {
            return var10000 * (double) (this. * 10);
        }
    }
}
