import java.util.Comparator;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class Class81 implements Comparator {
    private static int 29304=-16061;
    public final Class122;
    private static int 64454=-4049;
    private static int 1044=12055;
    private static int 6773=19615;
    private static int 76631=-8171;
    private static int 3559=3717;
    private static int 3131=26723;
    private static int 16013=-17838;
    private static int 28597=-20141;
    private static int 9546=25419;

    static {
        boolean var10000 = true;
    }

    public Class81(Class122 var1) {
        this. = var1;
        if (llIllIIIlIIl(28597, 3559)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIllIIIlIll(int var0) {
        return var0 == 0;
    }

    private static boolean llIllIIIlIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIIIlIlI(int var0) {
        return var0 != 0;
    }

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1, Entity var2) {
        EntityLivingBase var3;
        EntityLivingBase var6;
        byte var10000;
        label104:
        {
            var3 = (EntityLivingBase) var1;
            var6 = (EntityLivingBase) var2;
            String var4 = this.                                                                                  .                                                                                    .
            ();
            byte var5 = -1;
            String var10001;
            switch (var4.hashCode()) {
                case -2137395588:
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    }

                    do {
                        if (llIllIIIlIIl(16013, 9546)) {
                            throw null;
                        }
                    } while (!llIllIIIlIll(0));

                    var10001 = Class60. ("R~xvj3");
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    }

                    if (llIllIIIlIlI(var4.equals(var10001))) {
                        var5 = 1;
                    }
                    break;
                case 79996329:
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    }

                    var10001 = Class60. ("Ls}m/");
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    }

                    if (llIllIIIlIlI(var4.equals(var10001))) {
                        byte var7;
                        var10000 = var7 = 0;
                        boolean var9 = true;
                        break label104;
                    }
            }

            if (llIllIIIlIIl(16013, 9546)) {
                throw null;
            }

            var10000 = var5;
        }

        if (llIllIIIlIIl(16013, 9546)) {
            throw null;
        } else {
            int var8;
            switch (var10000) {
                case 0:
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    } else {
                        while (!llIllIIIlIIl(16013, 9546)) {
                            if (llIllIIIlIll(0)) {
                                double var10 = Class13. (var3);
                                if (llIllIIIlIIl(16013, 9546)) {
                                    throw null;
                                }

                                double var11 = Class13. (var6);
                                if (llIllIIIlIIl(16013, 9546)) {
                                    throw null;
                                }

                                var8 = Double.compare(var10, var11);
                                if (llIllIIIlIIl(16013, 9546)) {
                                    throw null;
                                }

                                return var8;
                            }
                        }

                        throw null;
                    }
                case 1:
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    } else {
                        var8 = Double.compare((double) var3.func_110143_aJ(), (double) var6.func_110143_aJ());
                        if (llIllIIIlIIl(16013, 9546)) {
                            throw null;
                        }

                        return var8;
                    }
                default:
                    if (llIllIIIlIIl(16013, 9546)) {
                        throw null;
                    } else {
                        var8 = Double.compare((double) this..                                                                                                    .
                        field_71439_g.func_70032_d(var3), (double) this.                                                                                  .                                                                                                    .
                        field_71439_g.func_70032_d(var6));
                        if (llIllIIIlIIl(16013, 9546)) {
                            throw null;
                        } else {
                            return var8;
                        }
                    }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public int compare(Object var1, Object var2) {
        return this. ((Entity) var1, (Entity) var2);
    }
}
