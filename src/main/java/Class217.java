import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Class217 implements Runnable {
    private static int 98374=-20951;
    private static int 262=4495;
    public final Class219;
    private static int 8407=19347;
    private static int 59336=-14324;
    private static int 8744=32558;
    private static int 93547=-15628;
    private static int 51729=-22275;
    private static int 7547=8648;

    static {
        boolean var10000 = true;
    }

    public Class217(Class219 var1) {
        this. = var1;
        if (lllIIIlllIII(59336, 262)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean lllIIIlllIlI(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIIlllIll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIIIlllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIlllIIl(int var0) {
        return var0 != 0;
    }

    public void run() {
        boolean var4;
        if (lllIIIlllIIl(this.. ())){
            var4 = true;
        } else if (lllIIIlllIII(51729, 8744)) {
            throw null;
        } else {
            if (lllIIIlllIlI(this..                                                                                             .
            isEmpty())){
                this.                                                                                  .                                                                                             .
                clear();
            }

            if (lllIIIlllIII(51729, 8744)) {
                throw null;
            } else {
                this.                                                                                  .                                                                                     =
                0;
                this.                                                                                  .                                                                                              =
                this.                                                                                  .();
                ArrayList var10000 = this.                                                                                  .
                ;
                Class167 var10001 = new Class167(this);
                if (lllIIIlllIII(51729, 8744)) {
                    throw null;
                } else {
                    Collections.sort(var10000, var10001);
                    if (lllIIIlllIII(51729, 8744)) {
                        throw null;
                    } else {
                        int var1;
                        boolean var7;
                        for (int var3 = var1 = 0; !lllIIIlllIII(51729, 8744); var7 = true) {
                            if (!lllIIIlllIll(var3, this..                                                                                             .
                            size())){
                                if (lllIIIlllIII(51729, 8744)) {
                                    throw null;
                                }

                                Class217 var5 = this;
                                this.                                                                                  .                                                                                                   .
                                ();

                                while (!lllIIIlllIII(51729, 8744)) {
                                    if (lllIIIlllIIl(var5..                                                                                                     .
                                    isEmpty()) &&!lllIIIlllIlI(this..                                                                                                   .
                                    (600))){
                                        if (lllIIIlllIII(51729, 8744)) {
                                            throw null;
                                        }

                                        var4 = true;
                                        return;
                                    }

                                    if (lllIIIlllIII(51729, 8744)) {
                                        throw null;
                                    }

                                    var5 = this;
                                    this.                                                                                  .
                                    ();
                                    var7 = true;
                                }

                                throw null;
                            }

                            BlockPos var2 = (BlockPos) this.                                                                                  .                                                                                             .
                            get(var1);
                            if (!lllIIIlllIIl(this.. ()) ||lllIIIlllIIl(this.. ())){
                                if (lllIIIlllIII(51729, 8744)) {
                                    throw null;
                                }

                                var4 = true;
                                return;
                            }

                            if (lllIIIlllIII(51729, 8744)) {
                                throw null;
                            }

                            Class219 var6;
                            if (lllIIIlllIlI(this.. (this.., var2))){
                                var6 = this.;
                                CPacketPlayerDigging var10002 = new CPacketPlayerDigging(Action.STOP_DESTROY_BLOCK, var2, EnumFacing.UP);
                                if (lllIIIlllIII(51729, 8744)) {
                                    throw null;
                                }

                                var6. ((Packet) var10002);
                                if (lllIIIlllIlI(this..                                                                                .
                                contains(var2))){
                                    this.                                                                                  .                                                                                .
                                    add(var2);
                                }

                                if (lllIIIlllIII(51729, 8744)) {
                                    throw null;
                                }

                                this.                                                                                  .
                                ((long) this..                                                                               .
                                ());
                            }

                            if (lllIIIlllIII(51729, 8744)) {
                                throw null;
                            }

                            var6 = this.;
                            int var8 = var6. + 1;
                            ++var1;
                            var6. = var8;
                            this.                                                                                  .();
                            var3 = var1;
                        }

                        throw null;
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
