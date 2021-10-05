import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class23 extends Class171 {
    private static int 26579=-22090;
    public float;
    private static int 2686=7188;
    private static int 9935=30999;
    public float;
    private static int 310=10492;
    private static int 26455=-26959;
    private static int 17455=-6445;
    private static int 61430=-12417;
    public Class220;
    private static int 9503=19950;

    static {
        boolean var10000 = true;
    }

    public Class23() {
        String var10008 = Class60. ("Oim<y{>");
        if (llIllIIIIlIl(26579, 9503)) {
            throw null;
        } else {
            super(var10008, 11, Class188.);
            if (llIllIIIIlIl(26579, 9503)) {
                throw null;
            } else {
                this. = 0.0F;
                this. = 0.0F;
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("Iok:{uz:f3");
                if (llIllIIIIlIl(26579, 9503)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, this, 100.0D, 0.0D, 100.0D, true);
                    if (llIllIIIIlIl(26579, 9503)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llIllIIIlIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIllIIIIllI(Object var0) {
        return var0 != null;
    }

    private static boolean llIllIIIIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIIIIlll(int var0) {
        return var0 == 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        String var10001 = Class60. ("?5)|;~");
        if (llIllIIIIlIl(17455, 2686)) {
            throw null;
        } else {
            Object[] var10002 = new Object[1];
            Double var10005 = this.                                                                                            .
            ();
            if (llIllIIIIlIl(17455, 2686)) {
                throw null;
            } else {
                var10002[0] = var10005;
                var10001 = String.format(var10001, var10002);
                if (llIllIIIIlIl(17455, 2686)) {
                    throw null;
                } else {
                    boolean var8;
                    label78:
                    {
                        this. (var10001);
                        byte var10000;
                        if (llIllIIIIllI(Class122.)) {
                            var10000 = Class133. (34);
                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            if (!llIllIIIIlll(var10000)) {
                                break label78;
                            }
                        }

                        if (llIllIIIIlIl(17455, 2686)) {
                            throw null;
                        }

                        if (llIllIIIIllI(this..field_71439_g)){
                        var10000 = Class13. ();
                        if (llIllIIIIlIl(17455, 2686)) {
                            throw null;
                        }

                        if (!llIllIIIIlll(var10000)) {
                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            float var6 = (float) this.                                                                                            .
                            () * 0.01F;
                            double var11 = Class13. ();
                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            double var2 = var11;
                            float var12 = Class13. ();
                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            float var4 = var12 * var6;
                            float var5 = (float) (this..field_71439_g.field_70159_w * (double) (1.0F - var6));
                            var6 = (float) (this..field_71439_g.field_70179_y * (double) (1.0F - var6));
                            var10000 = Class13. ();
                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            if (llIllIIIlIII(var10000)) {
                                EntityPlayerSP var9 = this.                                                                                                    .
                                field_71439_g;
                                var11 = Math.sin(var2);
                                if (llIllIIIIlIl(17455, 2686)) {
                                    throw null;
                                }

                                var9.field_70159_w = -var11 * (double) var4 + (double) var5;
                                EntityPlayerSP var7 = this.                                                                                                    .
                                field_71439_g;
                                double var10 = Math.cos(var2);
                                if (llIllIIIIlIl(17455, 2686)) {
                                    throw null;
                                }

                                var7.field_70179_y = var10 * (double) var4 + (double) var6;
                            }

                            if (llIllIIIIlIl(17455, 2686)) {
                                throw null;
                            }

                            var8 = true;
                            return;
                        }
                    }
                    }

                    if (llIllIIIIlIl(17455, 2686)) {
                        throw null;
                    } else {
                        var8 = true;
                    }
                }
            }
        }
    }
}
