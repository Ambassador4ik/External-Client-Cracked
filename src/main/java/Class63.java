import java.util.Comparator;

import net.minecraft.util.math.BlockPos;

public class Class63 implements Comparator {
    private static int 63037=-24117;
    private static int 75131=-6500;
    private static int 8811=26176;
    private static int 1549=15049;
    private static int 9078=25755;
    private static int 2031=31359;
    public final Class171;
    public final Class27;
    private static int 30868=-18362;
    private static int 6150=15124;
    private static int 95613=-25682;
    private static int 98778=-17941;

    static {
        boolean var10000 = true;
    }

    public Class63(Class27 var1, Class171 var2) {
        this. = var1;
        this. = var2;
        if (llIlIIlIlllI(75131, 1549)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIlIIlIlIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIllIIII(int var0) {
        return var0 > 0;
    }

    private static boolean llIlIIllIIIl(int var0) {
        return var0 < 0;
    }

    private static boolean llIlIIlIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIIlIllII(Object var0) {
        return var0 != null;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1, BlockPos var2) {
        double var3 = this.                                                                                  .                                                                                                    .
        field_71439_g.func_174818_b(var1);
        double var5 = this.                                                                                  .                                                                                                    .
        field_71439_g.func_174818_b(var2);
        if (llIlIIlIlIlI(this.. ()) &&llIlIIlIllII(((Class2) this.).)){
            var3 = ((Class2) this.).                                                                                            .
            func_174818_b(var1);
            var5 = ((Class2) this.).                                                                                            .
            func_174818_b(var2);
        }

        if (llIlIIlIlllI(95613, 9078)) {
            throw null;
        } else {
            double var7;
            if (llIlIIllIIII((var7 = var5 - var3) == 0.0D ? 0 : (var7 < 0.0D ? -1 : 1))) {
                return -1;
            } else if (llIlIIlIlllI(95613, 9078)) {
                throw null;
            } else {
                double var8;
                if (llIlIIllIIIl((var8 = var5 - var3) == 0.0D ? 0 : (var8 < 0.0D ? -1 : 1))) {
                    return 1;
                } else if (llIlIIlIlllI(95613, 9078)) {
                    throw null;
                } else {
                    return 0;
                }
            }
        }
    }

    public int compare(Object var1, Object var2) {
        return this. ((BlockPos) var1, (BlockPos) var2);
    }
}
