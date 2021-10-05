import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.network.play.server.SPacketTabComplete;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.legacydev.reloc.joptsimple.internal.Strings;

public class Class151 extends Class171 {
    private static int 129=14277;
    private static int 37769=-23437;
    private static int 64356=-8341;
    private static int 81971=-26276;
    private boolean;
    private static int 83482=-29515;
    private static int 90608=-6557;
    private static int 5208=20583;
    private static int 9636=6305;
    private static int 1266=14027;
    private static int 89005=-30558;
    private static int 7621=15423;
    private static int 104=9442;

    static {
        boolean var10000 = true;
    }

    public Class151() {
        String var10001 = Class60. ("C~e3p{z3(");
        if (llIlIlIlIlII(64356, 5208)) {
            throw null;
        } else {
            super(var10001, 37, Class188.);
            if (llIlIlIlIlII(64356, 5208)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIlIlIlIlIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlIlIlIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIlIlIllI(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIlIlIlIIll(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIlIlIlll(int var0) {
        return var0 == 0;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        CPacketTabComplete var10005 = new CPacketTabComplete;
        String var10007 = Class60. ("t");
        if (llIlIlIlIlII(81971, 1266)) {
            throw null;
        } else {
            var10005.<init> (var10007, BlockPos.field_177992_a, false);
            if (llIlIlIlIlII(81971, 1266)) {
                throw null;
            } else {
                this. (var10005);
                this. = true;
                this.                                                                                         .();
                super. ();
                if (llIlIlIlIlII(81971, 1266)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIlIlIlIIll(var1 instanceof SPacketTabComplete) && llIlIlIlIIll(this. ())){
            ArrayList var10000 = new ArrayList();
            if (llIlIlIlIlII(90608, 7621)) {
                throw null;
            }

            ArrayList var6 = var10000;
            String[] var5 = ((SPacketTabComplete) var1).func_149630_c();
            int var3;
            int var8 = var3 = 0;

            while (true) {
                if (llIlIlIlIlII(90608, 7621)) {
                    throw null;
                }

                boolean var11;
                String var10001;
                if (!llIlIlIlIlIl(var8, var5.length)) {
                    if (llIlIlIlIlII(90608, 7621)) {
                        throw null;
                    }

                    Collections.sort(var6);
                    if (llIlIlIlIlII(90608, 7621)) {
                        throw null;
                    }

                    Class151 var12;
                    String var10003;
                    if (llIlIlIlIlll(var6.isEmpty())) {
                        StringBuilder var10 = new StringBuilder();
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var10001 = Class60. ("½l");
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        StringBuilder var13 = var10.append(var10001).append(this. ());
                        String var10002 = Class60. ("¸)4¸c");
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var13 = var13.append(var10002).append(var6.size());
                        var10002 = Class60. ("»*6&8ºb");
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var13 = var13.append(var10002);
                        String[] var14 = (String[]) var6.toArray(new String[0]);
                        var10003 = Class60. ("½,5:¹b");
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var10002 = Strings.join(var14, var10003);
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        this. (String.valueOf(var13.append(var10002)));
                        var12 = this;
                        var11 = true;
                    } else {
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var12 = this;
                        Class103 var16 = this.;
                        Class172 var15 = Class172.;
                        var10003 = this. ();
                        StringBuilder var10004 = new StringBuilder();
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var10004 = var10004.insert(0, this. ());
                        String var10005 = Class60. ("0\u007f|d4wxevuu");
                        if (llIlIlIlIlII(90608, 7621)) {
                            throw null;
                        }

                        var16. (var15, var10003, String.valueOf(var10004.append(var10005)), 1500);
                    }

                    if (llIlIlIlIlII(90608, 7621)) {
                        throw null;
                    }

                    var12. = false;
                    this.                                                                                         .();
                    this. (false);
                    break;
                }

                String var9 = var5[var3];
                var10001 = Class60. ("a");
                if (llIlIlIlIlII(90608, 7621)) {
                    throw null;
                }

                String[] var4;
                if (llIlIlIlIllI((var4 = var9.split(var10001)).length, 1)) {
                    var9 = var4[0];
                    var10001 = Class60. ("t");
                    if (llIlIlIlIlII(90608, 7621)) {
                        throw null;
                    }

                    String var7 = var9.replace(var10001, "");
                    if (llIlIlIlIlll(var6.contains(var7))) {
                        var6.add(var7);
                    }
                }

                if (llIlIlIlIlII(90608, 7621)) {
                    throw null;
                }

                ++var3;
                var8 = var3;
                var11 = true;
            }
        }

        if (llIlIlIlIlII(90608, 7621)) {
            throw null;
        } else {
            return true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (llIlIlIlIlll(this.)) {
            this.                                                                                         .();
        }

        if (llIlIlIlIlII(89005, 104)) {
            throw null;
        } else {
            if (llIlIlIlIIll(this.. (1000))){
                this.                                                                                         .();
                this. (false);
            }

            if (llIlIlIlIlII(89005, 104)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }
}
