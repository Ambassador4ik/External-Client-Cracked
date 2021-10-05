import com.google.common.base.Predicate;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;

public class Class135 implements Predicate {
    private static int 6655=5631;
    private static int 87385=-9278;
    private static int 3797=8339;
    private static int 6037=28517;
    private static int 48538=-18868;
    private static int 80333=-7199;
    private static int 6369=7863;
    private static int 59407=-10788;
    private static int 8846=27390;
    private static int 19343=-17897;
    public final Class224;

    static {
        boolean var10000 = true;
    }

    public Class135(Class224 var1) {
        this. = var1;
        if (llIllIIIlllI(48538, 6369)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIllIIIllIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIllIIIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIIIllII(Object var0) {
        return var0 != null;
    }

    public boolean apply(@Nullable Object var1) {
        return this.apply((Entity) var1);
    }

    public boolean apply(@Nullable Entity var1) {
        if (llIllIIIllII(var1) && llIllIIIllIl(var1.func_70067_L())) {
            return true;
        } else if (llIllIIIlllI(59407, 8846)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
