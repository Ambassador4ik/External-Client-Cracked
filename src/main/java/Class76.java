import net.minecraft.client.gui.GuiChat;
import net.minecraft.util.MovementInput;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Class76 extends Class171 {
    private static int 35190=-18060;
    private static int 7250=5208;
    private static int 1735=11610;
    private static int 266=17726;
    private static int 37030=-28412;
    private static int 14781=-13759;
    private static int 19968=-7850;
    private static int 2275=20957;

    static {
        boolean var10000 = true;
    }

    public Class76() {
        String var10001 = Class60. ("Bd~+jdx+lxy+Pk$g0");
        if (lllIllIIIIIl(14781, 266)) {
            throw null;
        } else {
            super(var10001, 7, Class188.);
            if (lllIllIIIIIl(14781, 266)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllIlIllllll(Object var0) {
        return var0 == null;
    }

    private static boolean lllIlIllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllIllIIIIll(int var0) {
        return var0 != 0;
    }

    private static boolean lllIllIIIIIl(int var0, int var1) {
        return var0 >= var1;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(InputUpdateEvent var1) {
        boolean var10000;
        if (lllIlIllllIl(this. ()) &&lllIlIllllIl(this..field_71462_r instanceof GuiChat) &&
        !lllIlIllllll(this..field_71462_r)){
            if (lllIllIIIIIl(37030, 1735)) {
                throw null;
            } else {
                MovementInput var3 = var1.getMovementInput();
                float var2 = 1.0F;
                byte var4 = Keyboard.isKeyDown(this..field_71474_y.field_151444_V.func_151463_i());
                if (lllIllIIIIIl(37030, 1735)) {
                    throw null;
                } else {
                    label113:
                    {
                        if (lllIlIllllIl(var4)) {
                            var4 = Class133. (10);
                            if (lllIllIIIIIl(37030, 1735)) {
                                throw null;
                            }

                            if (!lllIllIIIIll(var4)) {
                                break label113;
                            }
                        }

                        if (lllIllIIIIIl(37030, 1735)) {
                            throw null;
                        }

                        var4 = Class13. ();
                        if (lllIllIIIIIl(37030, 1735)) {
                            throw null;
                        }

                        if (lllIllIIIIll(var4)) {
                            this.                                                                                                    .
                            field_71439_g.func_70031_b(true);
                        }
                    }

                    if (lllIllIIIIIl(37030, 1735)) {
                        throw null;
                    } else {
                        var4 = Keyboard.isKeyDown(this..field_71474_y.field_74351_w.func_151463_i());
                        if (lllIllIIIIIl(37030, 1735)) {
                            throw null;
                        } else {
                            if (lllIllIIIIll(var4)) {
                                var3.field_187255_c = true;
                                var3.field_192832_b = var2;
                            }

                            if (lllIllIIIIIl(37030, 1735)) {
                                throw null;
                            } else {
                                var4 = Keyboard.isKeyDown(this..field_71474_y.field_74314_A.func_151463_i());
                                if (lllIllIIIIIl(37030, 1735)) {
                                    throw null;
                                } else {
                                    if (lllIllIIIIll(var4)) {
                                        var3.field_78901_c = true;
                                    }

                                    if (lllIllIIIIIl(37030, 1735)) {
                                        throw null;
                                    } else {
                                        var4 = Keyboard.isKeyDown(this..field_71474_y.field_74370_x.func_151463_i());
                                        if (lllIllIIIIIl(37030, 1735)) {
                                            throw null;
                                        } else {
                                            if (lllIllIIIIll(var4)) {
                                                var3.field_187257_e = true;
                                                var3.field_78902_a = var2;
                                            }

                                            if (lllIllIIIIIl(37030, 1735)) {
                                                throw null;
                                            } else {
                                                var4 = Keyboard.isKeyDown(this..field_71474_y.field_74366_z.func_151463_i())
                                                ;
                                                if (lllIllIIIIIl(37030, 1735)) {
                                                    throw null;
                                                } else {
                                                    if (lllIllIIIIll(var4)) {
                                                        var3.field_187258_f = true;
                                                        var3.field_78902_a = -var2;
                                                    }

                                                    if (lllIllIIIIIl(37030, 1735)) {
                                                        throw null;
                                                    } else {
                                                        var4 = Keyboard.isKeyDown(this..field_71474_y.field_74368_y.func_151463_i())
                                                        ;
                                                        if (lllIllIIIIIl(37030, 1735)) {
                                                            throw null;
                                                        } else {
                                                            if (lllIllIIIIll(var4)) {
                                                                var3.field_187256_d = true;
                                                                var3.field_192832_b = -var2;
                                                            }

                                                            if (lllIllIIIIIl(37030, 1735)) {
                                                                throw null;
                                                            } else {
                                                                var10000 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (lllIllIIIIIl(37030, 1735)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
