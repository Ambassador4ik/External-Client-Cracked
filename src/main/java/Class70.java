import net.minecraft.entity.Entity;
import net.minecraft.util.MovementInput;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import org.lwjgl.input.Keyboard;

public class Class70 extends Class171 {
    public Class220;
    private static int 82677=-16919;
    private static int 4176=17628;
    private static int 73774=-16180;
    private static int 68332=-23647;
    public Class220;
    private static int 951=391;
    private static int 37103=-15830;
    private static int 53686=-31839;
    public Class220;
    private static int 84134=-2780;
    private int;
    private static int 274=4536;
    private static int 6469=304;
    public Class220;
    public Class220;
    private static int 9971=13303;
    public Class220;
    private static int 2736=4729;

    static {
        boolean var10000 = true;
    }

    public Class70() {
        String var10010 = Class60. ("@te4wpg4Oam4ys>");
        if (lllllIIIIIlI(73774, 2736)) {
            throw null;
        } else {
            super(var10010, 34, Class188.);
            if (lllllIIIIIlI(73774, 2736)) {
                throw null;
            } else {
                this. = -1;
                Class220 var10008 = new Class220;
                var10010 = Class60. ("Hz9ty>");
                if (lllllIIIIIlI(73774, 2736)) {
                    throw null;
                } else {
                    var10008.<init> (var10010, 107, this, 3.0D, 0.1D, 6.0D, false);
                    if (lllllIIIIIlI(73774, 2736)) {
                        throw null;
                    } else {
                        this. = var10008;
                        Class220 var10007 = new Class220;
                        String var10009 = Class60. ("HIh;z\u007f<?");
                        if (lllllIIIIIlI(73774, 2736)) {
                            throw null;
                        } else {
                            var10007.<init> (var10009, 165, this, 2.3D, 2.0D, 4.0D, false);
                            if (lllllIIIIIlI(73774, 2736)) {
                                throw null;
                            } else {
                                this. = var10007;
                                Class220 var10006 = new Class220;
                                String var4 = Class60. ("]I8kz:y?");
                                if (lllllIIIIIlI(73774, 2736)) {
                                    throw null;
                                } else {
                                    var10006.<init> (var4, 108, this, 2.3D, 2.0D, 4.0D, false);
                                    if (lllllIIIIIlI(73774, 2736)) {
                                        throw null;
                                    } else {
                                        this. = var10006;
                                        Class220 var10005 = new Class220;
                                        String var3 = Class60. ("Io9{r;v\u007f2)");
                                        if (lllllIIIIIlI(73774, 2736)) {
                                            throw null;
                                        } else {
                                            var10005.<init> (var3, this, true);
                                            if (lllllIIIIIlI(73774, 2736)) {
                                                throw null;
                                            } else {
                                                this. = var10005;
                                                Class220 var10004 = new Class220;
                                                String var2 = Class60. ("I\u007f8mz:n(");
                                                if (lllllIIIIIlI(73774, 2736)) {
                                                    throw null;
                                                } else {
                                                    var10004.<init> (var2, this, false);
                                                    if (lllllIIIIIlI(73774, 2736)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10004;
                                                        Class220 var10003 = new Class220;
                                                        String var1 = Class60. ("Dz{`ZpEdz_hr6");
                                                        if (lllllIIIIIlI(73774, 2736)) {
                                                            throw null;
                                                        } else {
                                                            var10003.<init> (var1, this, false);
                                                            if (lllllIIIIIlI(73774, 2736)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10003;
                                                                this.
                                                                (new Class220[]{this., this., this., this., this., this.});
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
                        }
                    }
                }
            }
        }
    }

    private static boolean lllllIIIIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIIIlIII(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIIIIlll(Object var0) {
        return var0 != null;
    }

    private static boolean lllllIIIlIlI(int var0) {
        return var0 < 0;
    }

    private static boolean lllllIIIIIII(int var0) {
        return var0 == 0;
    }

    private static boolean lllllIIIIIIl(Object var0) {
        return var0 == null;
    }

    private static boolean lllllIIIlIll(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllllIIIIllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllllIIIlIIl(int var0) {
        return var0 > 0;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(InputUpdateEvent var1) {
        boolean var10000;
        if (lllllIIIIIII(this. ()) &&!lllllIIIIIIl(Class122.)){
            if (lllllIIIIIlI(53686, 4176)) {
                throw null;
            } else {
                MovementInput var2 = var1.getMovementInput();
                var2.field_192832_b = 0.0F;
                var2.field_78902_a = 0.0F;
                var10000 = true;
            }
        } else if (lllllIIIIIlI(53686, 4176)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        String var10001 = Class60. (">4)=");
        if (lllllIIIIIlI(84134, 951)) {
            throw null;
        } else {
            Object[] var10002 = new Object[1];
            Double var10005 = this.                                                                                                  .
            ();
            if (lllllIIIIIlI(84134, 951)) {
                throw null;
            } else {
                var10002[0] = var10005;
                var10001 = String.format(var10001, var10002);
                if (lllllIIIIIlI(84134, 951)) {
                    throw null;
                } else {
                    this. (var10001);
                    if (lllllIIIIllI(var1.phase, Phase.END) && lllllIIIIlll(Class122.) && lllllIIIlIII(Class122..func_70089_S()))
                    {
                        byte var10000 = Keyboard.isKeyDown(this..field_71474_y.field_74366_z.func_151463_i());
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        if (lllllIIIlIII(var10000)) {
                            this. = -1;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        var10000 = Keyboard.isKeyDown(this..field_71474_y.field_74370_x.func_151463_i());
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        if (lllllIIIlIII(var10000)) {
                            this. = 1;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        if (lllllIIIlIII(this..field_71439_g.field_70123_F) &&lllllIIIlIII(this.. (80))){
                        this. = -this.;
                        this.                                                                                         .
                        ();
                    }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        boolean var10;
                        double var19;
                        if (lllllIIIlIIl((var19 = (double) this..field_71439_g.func_70032_d(Class122.) - this.. ()) ==
                        0.0D ? 0 : (var19 < 0.0D ? -1 : 1))){
                        var10000 = 1;
                        var10 = true;
                    } else{
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        var10000 = 0;
                    }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        byte var9 = var10000;
                        double var13;
                        if (lllllIIIlIII(this.. ())){
                        int var11;
                        if (lllllIIIlIII(var9)) {
                            var11 = 0;
                            var10 = true;
                        } else {
                            if (lllllIIIIIlI(84134, 951)) {
                                throw null;
                            }

                            var11 = this.;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        var13 = (double) var11;
                        var10 = true;
                    } else{
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        var13 = (double) this.;
                    }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        double var2 = var13;
                        if (lllllIIIlIII(var9)) {
                            var13 = 1.0D;
                            var10 = true;
                        } else {
                            if (lllllIIIIIlI(84134, 951)) {
                                throw null;
                            }

                            byte var16;
                            if (lllllIIIlIII(this.. ())){
                                var16 = -1;
                                var10 = true;
                            } else{
                                if (lllllIIIIIlI(84134, 951)) {
                                    throw null;
                                }

                                var16 = 0;
                            }

                            if (lllllIIIIIlI(84134, 951)) {
                                throw null;
                            }

                            var13 = (double) var16;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        double var4 = var13;
                        if (lllllIIIlIII(this.. ()) &&lllllIIIlIII(this..field_71439_g.func_184587_cr())){
                        var10000 = 1;
                        var10 = true;
                    } else{
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        var10000 = 0;
                    }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        byte var6 = var10000;
                        boolean var12;
                        byte var15;
                        if (lllllIIIlIII(var9)) {
                            var13 = this.                                                                              .
                            ();
                            var15 = var6;
                            var12 = true;
                        } else {
                            if (lllllIIIIIlI(84134, 951)) {
                                throw null;
                            }

                            var13 = this.                                                                                         .
                            ();
                            var15 = var6;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        double var17;
                        if (lllllIIIlIII(var15)) {
                            var17 = 0.06D;
                            var12 = true;
                        } else {
                            if (lllllIIIIIlI(84134, 951)) {
                                throw null;
                            }

                            var17 = 0.1D;
                        }

                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        double var7 = var13 * var17;
                        float[] var14 = Class13. ((Entity) Class122.);
                        if (lllllIIIIIlI(84134, 951)) {
                            throw null;
                        }

                        this. (var7, var14[0], var2, var4);
                    }

                    if (lllllIIIIIlI(84134, 951)) {
                        throw null;
                    } else {
                        boolean var18 = true;
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1, float var3, double var4, double var6) {
        double var15;
        boolean var10000;
        double var16;
        if (lllllIIIIIII((var15 = var6 - 0.0D) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1)) && lllllIIIIIII((var16 = var4 - 0.0D) == 0.0D ? 0 : (var16 < 0.0D ? -1 : 1))) {
            this.                                                                                                    .
            field_71439_g.field_70159_w = 0.0D;
            this.                                                                                                    .
            field_71439_g.field_70179_y = 0.0D;
            var10000 = true;
        } else if (lllllIIIIIlI(68332, 274)) {
            throw null;
        } else {
            Class70 var12;
            boolean var14;
            label111:
            {
                double var17;
                if (lllllIIIlIII((var17 = var6 - 0.0D) == 0.0D ? 0 : (var17 < 0.0D ? -1 : 1))) {
                    byte var10001;
                    boolean var10002;
                    double var18;
                    if (lllllIIIlIIl((var18 = var4 - 0.0D) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1))) {
                        double var19;
                        if (lllllIIIlIIl((var19 = var6 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                            var10001 = -45;
                            var10002 = true;
                        } else {
                            if (lllllIIIIIlI(68332, 274)) {
                                throw null;
                            }

                            var10001 = 45;
                        }

                        if (lllllIIIIIlI(68332, 274)) {
                            throw null;
                        }

                        var3 += (float) var10001;
                        var10000 = true;
                    } else {
                        if (lllllIIIIIlI(68332, 274)) {
                            throw null;
                        }

                        double var20;
                        if (lllllIIIlIlI((var20 = var4 - 0.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1))) {
                            double var21;
                            if (lllllIIIlIIl((var21 = var6 - 0.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1))) {
                                var10001 = 45;
                                var10002 = true;
                            } else {
                                if (lllllIIIIIlI(68332, 274)) {
                                    throw null;
                                }

                                var10001 = -45;
                            }

                            if (lllllIIIIIlI(68332, 274)) {
                                throw null;
                            }

                            var3 += (float) var10001;
                        }
                    }

                    if (lllllIIIIIlI(68332, 274)) {
                        throw null;
                    }

                    var4 = 0.0D;
                    double var22;
                    if (lllllIIIlIIl((var22 = var6 - 0.0D) == 0.0D ? 0 : (var22 < 0.0D ? -1 : 1))) {
                        var6 = 1.0D;
                        var12 = this;
                        var14 = true;
                        break label111;
                    }

                    if (lllllIIIIIlI(68332, 274)) {
                        throw null;
                    }

                    double var23;
                    if (lllllIIIlIlI((var23 = var6 - 0.0D) == 0.0D ? 0 : (var23 < 0.0D ? -1 : 1))) {
                        var6 = -1.0D;
                    }
                }

                if (lllllIIIIIlI(68332, 274)) {
                    throw null;
                }

                var12 = this;
            }

            if (lllllIIIIIlI(68332, 274)) {
                throw null;
            } else {
                double var13;
                if (lllllIIIlIll(var12., 1)) {
                    var13 = this.                                                                                                  .
                    ();
                    var14 = true;
                } else {
                    if (lllllIIIIIlI(68332, 274)) {
                        throw null;
                    }

                    var13 = -this.                                                                                                  .
                    ();
                }

                if (lllllIIIIIlI(68332, 274)) {
                    throw null;
                } else {
                    double var8 = var13;
                    var13 = Math.toRadians((double) (var3 + 90.0F) + var8);
                    if (lllllIIIIIlI(68332, 274)) {
                        throw null;
                    } else {
                        var13 = Math.cos(var13);
                        if (lllllIIIIIlI(68332, 274)) {
                            throw null;
                        } else {
                            double var10 = var13;
                            var13 = Math.toRadians((double) (var3 + 90.0F) + var8);
                            if (lllllIIIIIlI(68332, 274)) {
                                throw null;
                            } else {
                                var13 = Math.sin(var13);
                                if (lllllIIIIIlI(68332, 274)) {
                                    throw null;
                                } else {
                                    var8 = var13;
                                    this.                                                                                                    .
                                    field_71439_g.field_70159_w = var6 * var1 * var10 + var4 * var1 * var8;
                                    this.                                                                                                    .
                                    field_71439_g.field_70179_y = var6 * var1 * var8 - var4 * var1 * var10;
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
