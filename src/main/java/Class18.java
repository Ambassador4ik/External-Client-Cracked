import java.io.IOException;

import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;

public class Class18 implements Cancellable {
    private static int 9726=13514;
    private static int 20651=-20848;
    private static int 8537=20571;
    public final ConnectionReleaseTrigger;
    private static int 1217=9541;
    public final Class173;
    private static int 51208=-10854;
    private static int 9783=10705;
    private static int 25378=-1951;
    private static int 97642=-12340;

    static {
        boolean var10000 = true;
    }

    public Class18(Class173 var1, ConnectionReleaseTrigger var2) {
        this. = var1;
        this. = var2;
        if (llIIlIlIIIll(20651, 9726)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIIlIlIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    public boolean cancel() {
        boolean var10000;
        try {
            if (llIIlIlIIIll(25378, 1217)) {
                throw null;
            }

            this.                                                                                            .
            abortConnection();
            var10000 = true;
        } catch (IOException var2) {
            if (llIIlIlIIIll(25378, 1217)) {
                throw null;
            }

            return false;
        }

        if (llIIlIlIIIll(25378, 1217)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
