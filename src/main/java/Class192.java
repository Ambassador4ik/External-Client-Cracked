import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketUseEntity.Action;

public class Class192 extends Class171 {
    public Class220;
    private static int 45229=-6442;
    private static int 21572=-13179;
    private static int 2140=70;
    private static int 2180=18695;
    private static int 95754=-8545;
    private static int 4256=18299;
    public Class220;
    private static int 26220=-16526;
    private static int 3254=6477;
    public Runnable;
    private static int 2045=21006;
    private static int 51610=-21436;

    static {
        boolean var10000 = true;
    }

    public Class192() {
        String var10001 = Class60. ("Zo8opI<sz|0oC{49");
        if (lllllIlIIIII(26220, 2180)) {
            throw null;
        } else {
            super(var10001, 2, Class188.);
            if (lllllIlIIIII(26220, 2180)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Rq<{>");
                if (lllllIlIIIII(26220, 2180)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("Ywp\u007fp/");
                    if (lllllIlIIIII(26220, 2180)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Jzzq{/");
                        if (lllllIlIIIII(26220, 2180)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var1.<init> (var10003, 57, this, var10006);
                            if (lllllIlIIIII(26220, 2180)) {
                                throw null;
                            } else {
                                this. = var1;
                                Class220 var2 = new Class220;
                                String var10005 = Class60. ("Xr8zq:\u007f>");
                                if (lllllIlIIIII(26220, 2180)) {
                                    throw null;
                                } else {
                                    var2.<init> (var10005, 1, this, 20.0D, 10.0D, 100.0D, 5.0D, true);
                                    if (lllllIlIIIII(26220, 2180)) {
                                        throw null;
                                    } else {
                                        this. = var2;
                                        this. = this::;
                                        this. (new Class220[]{this.});
                                        this. (new Class220[]{this.});
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

    private static boolean lllllIlIIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIlIIlIl(int var0) {
        return var0 >= 0;
    }

    private static boolean lllllIlIIIll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllllIlIIIIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIlIIlII(Object var0) {
        return var0 != null;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lllllIlIIIIl(var1 instanceof CPacketUseEntity) && lllllIlIIIll(((CPacketUseEntity) var1).func_149565_c(), Action.ATTACK) && lllllIlIIlII(((CPacketUseEntity) var1).func_149564_a(this..field_71441_e)))
        {
            double var10000 = this.                                                                                            .
            ();
            int var10001 = (1, 100);
            if (lllllIlIIIII(45229, 2045)) {
                throw null;
            }

            double var5;
            if (lllllIlIIlIl((var5 = var10000 - (double) var10001) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1))) {
                Thread var3 = new Thread;
                Runnable var10002 = this.;
                String var10003 = Class60. ("\u001d");
                if (lllllIlIIIII(45229, 2045)) {
                    throw null;
                }

                var3.<init> (var10002, var10003);
                if (lllllIlIIIII(45229, 2045)) {
                    throw null;
                }

                var3.start();
            }
        }

        if (lllllIlIIIII(45229, 2045)) {
            throw null;
        } else {
            boolean var4 = super. (var1, var2);
            if (lllllIlIIIII(45229, 2045)) {
                throw null;
            } else {
                return var4;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        String var10000 = this.                                                                                  .();
        String var10001 = Class60. ("Ywp\u007fp/");
        if (lllllIlIIIII(21572, 2140)) {
            throw null;
        } else {
            boolean var2;
            if (lllllIlIIIIl(var10000.equals(var10001))) {
                KeyBinding var1 = this.                                                                                                    .
                field_71474_y.field_74311_E;
                KeyBinding.func_74510_a(var1.func_151463_i(), true);
                if (lllllIlIIIII(21572, 2140)) {
                    throw null;
                } else {
                    this. (120L);
                    int var3 = var1.func_151463_i();
                    boolean var5 = GameSettings.func_100015_a(var1);
                    if (lllllIlIIIII(21572, 2140)) {
                        throw null;
                    } else {
                        KeyBinding.func_74510_a(var3, var5);
                        if (lllllIlIIIII(21572, 2140)) {
                            throw null;
                        } else {
                            var2 = true;
                        }
                    }
                }
            } else if (lllllIlIIIII(21572, 2140)) {
                throw null;
            } else {
                CPacketEntityAction var10004 = new CPacketEntityAction(this..field_71439_g, net.
                minecraft.network.play.client.CPacketEntityAction.Action.START_SNEAKING);
                if (lllllIlIIIII(21572, 2140)) {
                    throw null;
                } else {
                    this. (var10004);
                    this. (120L);
                    CPacketEntityAction var4 = new CPacketEntityAction(this..field_71439_g, net.
                    minecraft.network.play.client.CPacketEntityAction.Action.STOP_SNEAKING);
                    if (lllllIlIIIII(21572, 2140)) {
                        throw null;
                    } else {
                        this. (var4);
                        var2 = true;
                    }
                }
            }
        }
    }
}
