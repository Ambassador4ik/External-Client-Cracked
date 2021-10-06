import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class161 extends Class171 {
    private static int 8869=8170;
    private static int 69476=-325;
    private static int 64624=-29075;
    private static int 64853=-32063;
    private static int 5230=2293;
    private static int 3730=29801;
    private static int 75353=-3548;
    private static int 4607=11650;
    private static int 9449=12771;
    private static int 44211=-20216;
    public Class220;
    private static int 89738=-1488;
    public Class220;
    private static int 3376=12685;

    static {
        boolean var10000 = true;
    }

    public Class161() {
        String var10005 = Class60. ("Mz9n{;oI2kt:s?");
        if (lllIllIIlIll(64624, 9449)) {
            throw null;
        } else {
            super(var10005, 89, Class188.);
            if (lllIllIIlIll(64624, 9449)) {
                throw null;
            } else {
                Class220 var10004 = new Class220;
                String var10006 = Class60. ("Om?y}=?");
                if (lllIllIIlIll(64624, 9449)) {
                    throw null;
                } else {
                    var10004.<init> (var10006, 215, this, 1.0D, 0.1D, 5.0D, false);
                    if (lllIllIIlIll(64624, 9449)) {
                        throw null;
                    } else {
                        this. = var10004;
                        Class220 var10003 = new Class220;
                        var10005 = Class60. ("Uu9vg;Mu2ox:y5");
                        if (lllIllIIlIll(64624, 9449)) {
                            throw null;
                        } else {
                            var10003.<init> (var10005, this, true);
                            if (lllIllIIlIll(64624, 9449)) {
                                throw null;
                            } else {
                                this. = var10003;
                                this. (new Class220[]{this., this.});
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIllIIllll(int var0) {
        return var0 < 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, float var2, double var3, double var5) {
        double var11;
        boolean var13;
        boolean var10000;
        label117:
        {
            double var15;
            if (lllIllIIllIl((var15 = var5 - 0.0D) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1))) {
                double var16;
                byte var10001;
                boolean var10002;
                if (lllIllIIlllI((var16 = var3 - 0.0D) == 0.0D ? 0 : (var16 < 0.0D ? -1 : 1))) {
                    double var17;
                    if (lllIllIIlllI((var17 = var5 - 0.0D) == 0.0D ? 0 : (var17 < 0.0D ? -1 : 1))) {
                        var10001 = -45;
                        var10002 = true;
                    } else {
                        if (lllIllIIlIll(75353, 3730)) {
                            throw null;
                        }

                        var10001 = 45;
                    }

                    if (lllIllIIlIll(75353, 3730)) {
                        throw null;
                    }

                    var2 += (float) var10001;
                    var10000 = true;
                } else {
                    if (lllIllIIlIll(75353, 3730)) {
                        throw null;
                    }

                    double var18;
                    if (lllIllIIllll((var18 = var3 - 0.0D) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1))) {
                        double var19;
                        if (lllIllIIlllI((var19 = var5 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                            var10001 = 45;
                            var10002 = true;
                        } else {
                            if (lllIllIIlIll(75353, 3730)) {
                                throw null;
                            }

                            var10001 = -45;
                        }

                        if (lllIllIIlIll(75353, 3730)) {
                            throw null;
                        }

                        var2 += (float) var10001;
                    }
                }

                if (lllIllIIlIll(75353, 3730)) {
                    throw null;
                }

                var3 = 0.0D;
                double var20;
                if (lllIllIIlllI((var20 = var5 - 0.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1))) {
                    var5 = 1.0D;
                    var11 = var3;
                    var13 = true;
                    break label117;
                }

                if (lllIllIIlIll(75353, 3730)) {
                    throw null;
                }

                double var21;
                if (lllIllIIllll((var21 = var5 - 0.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1))) {
                    var5 = -1.0D;
                }
            }

            if (lllIllIIlIll(75353, 3730)) {
                throw null;
            }

            var11 = var3;
        }

        if (lllIllIIlIll(75353, 3730)) {
            throw null;
        } else {
            float var12;
            double var22;
            if (lllIllIIlllI((var22 = var11 - 0.0D) == 0.0D ? 0 : (var22 < 0.0D ? -1 : 1))) {
                var3 = 1.0D;
                var12 = var2;
                var13 = true;
            } else {
                if (lllIllIIlIll(75353, 3730)) {
                    throw null;
                }

                double var23;
                if (lllIllIIllll((var23 = var3 - 0.0D) == 0.0D ? 0 : (var23 < 0.0D ? -1 : 1))) {
                    var3 = -1.0D;
                }

                if (lllIllIIlIll(75353, 3730)) {
                    throw null;
                }

                var12 = var2;
            }

            if (lllIllIIlIll(75353, 3730)) {
                throw null;
            } else {
                var11 = Math.toRadians((double) (var12 + 90.0F));
                if (lllIllIIlIll(75353, 3730)) {
                    throw null;
                } else {
                    var11 = Math.cos(var11);
                    if (lllIllIIlIll(75353, 3730)) {
                        throw null;
                    } else {
                        double var7 = var11;
                        var11 = Math.toRadians((double) (var2 + 90.0F));
                        if (lllIllIIlIll(75353, 3730)) {
                            throw null;
                        } else {
                            var11 = Math.sin(var11);
                            if (lllIllIIlIll(75353, 3730)) {
                                throw null;
                            } else {
                                double var9 = var11;
                                Minecraft var14 = Minecraft.getMinecraft();
                                if (lllIllIIlIll(75353, 3730)) {
                                    throw null;
                                } else {
                                    var14.player.motionX = var5 * var0 * var7 + var3 * var0 * var9;
                                    var14 = Minecraft.getMinecraft();
                                    if (lllIllIIlIll(75353, 3730)) {
                                        throw null;
                                    } else {
                                        var14.player.motionZ = var5 * var0 * var9 - var3 * var0 * var7;
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

    private static boolean lllIllIIlllI(int var0) {
        return var0 > 0;
    }

    private static boolean lllIllIIllII(int var0) {
        return var0 == 0;
    }

    private static boolean lllIllIIlIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIllIIllIl(int var0) {
        return var0 != 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (lllIllIIlIll(69476, 3376)) {
            throw null;
        } else {
            Minecraft var2 = var10000;
            double var3 = (double) var10000.player.movementInput.moveForward;
            double var5 = (double) var10000.player.movementInput.moveStrafe;
            float var7 = var10000.player.rotationYaw;
            boolean var8;
            double var13;
            double var14;
            if (lllIllIIllII((var13 = var3 - 0.0D) == 0.0D ? 0 : (var13 < 0.0D ? -1 : 1)) && lllIllIIllII((var14 = var5 - 0.0D) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1))) {
                var2.player.motionX = 0.0D;
                var2.player.motionZ = 0.0D;
                var8 = true;
            } else if (lllIllIIlIll(69476, 3376)) {
                throw null;
            } else {
                label118:
                {
                    double var15;
                    if (lllIllIIllIl((var15 = var3 - 0.0D) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1))) {
                        double var16;
                        byte var10001;
                        boolean var10002;
                        if (lllIllIIlllI((var16 = var5 - 0.0D) == 0.0D ? 0 : (var16 < 0.0D ? -1 : 1))) {
                            double var17;
                            if (lllIllIIlllI((var17 = var3 - 0.0D) == 0.0D ? 0 : (var17 < 0.0D ? -1 : 1))) {
                                var10001 = -45;
                                var10002 = true;
                            } else {
                                if (lllIllIIlIll(69476, 3376)) {
                                    throw null;
                                }

                                var10001 = 45;
                            }

                            if (lllIllIIlIll(69476, 3376)) {
                                throw null;
                            }

                            var7 += (float) var10001;
                            var8 = true;
                        } else {
                            if (lllIllIIlIll(69476, 3376)) {
                                throw null;
                            }

                            double var18;
                            if (lllIllIIllll((var18 = var5 - 0.0D) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1))) {
                                double var19;
                                if (lllIllIIlllI((var19 = var3 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                                    var10001 = 45;
                                    var10002 = true;
                                } else {
                                    if (lllIllIIlIll(69476, 3376)) {
                                        throw null;
                                    }

                                    var10001 = -45;
                                }

                                if (lllIllIIlIll(69476, 3376)) {
                                    throw null;
                                }

                                var7 += (float) var10001;
                            }
                        }

                        if (lllIllIIlIll(69476, 3376)) {
                            throw null;
                        }

                        var5 = 0.0D;
                        double var20;
                        if (lllIllIIlllI((var20 = var3 - 0.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1))) {
                            var3 = 1.0D;
                            var10000 = var2;
                            boolean var11 = true;
                            break label118;
                        }

                        if (lllIllIIlIll(69476, 3376)) {
                            throw null;
                        }

                        double var21;
                        if (lllIllIIllll((var21 = var3 - 0.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1))) {
                            var3 = -1.0D;
                        }
                    }

                    if (lllIllIIlIll(69476, 3376)) {
                        throw null;
                    }

                    var10000 = var2;
                }

                if (lllIllIIlIll(69476, 3376)) {
                    throw null;
                } else {
                    EntityPlayerSP var9 = var10000.player;
                    double var12 = var3 * var0;
                    double var10 = Math.toRadians((double) (var7 + 90.0F));
                    if (lllIllIIlIll(69476, 3376)) {
                        throw null;
                    } else {
                        var10 = Math.cos(var10);
                        if (lllIllIIlIll(69476, 3376)) {
                            throw null;
                        } else {
                            var12 *= var10;
                            var10 = var5 * var0;
                            double var10003 = Math.toRadians((double) (var7 + 90.0F));
                            if (lllIllIIlIll(69476, 3376)) {
                                throw null;
                            } else {
                                var10003 = Math.sin(var10003);
                                if (lllIllIIlIll(69476, 3376)) {
                                    throw null;
                                } else {
                                    var9.motionX = var12 + var10 * var10003;
                                    var9 = var2.player;
                                    var12 = var3 * var0;
                                    var10 = Math.toRadians((double) (var7 + 90.0F));
                                    if (lllIllIIlIll(69476, 3376)) {
                                        throw null;
                                    } else {
                                        var10 = Math.sin(var10);
                                        if (lllIllIIlIll(69476, 3376)) {
                                            throw null;
                                        } else {
                                            var12 *= var10;
                                            var10 = var5 * var0;
                                            var10003 = Math.toRadians((double) (var7 + 90.0F));
                                            if (lllIllIIlIll(69476, 3376)) {
                                                throw null;
                                            } else {
                                                var10003 = Math.cos(var10003);
                                                if (lllIllIIlIll(69476, 3376)) {
                                                    throw null;
                                                } else {
                                                    var9.motionZ = var12 - var10 * var10003;
                                                    var8 = true;
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

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (lllIllIIllIl(this..player.isInWater())){
            label30:
            {
                if (lllIllIIllIl(this.. ())){
                EntityPlayerSP var10000 = this.                                                                                                    .
                player;
                Potion var10001 = Potion.getPotionById(1);
                if (lllIllIIlIll(44211, 5230)) {
                    throw null;
                }

                if (!lllIllIIllIl(var10000.isPotionActive(var10001))) {
                    break label30;
                }
            }

                if (lllIllIIlIll(44211, 5230)) {
                    throw null;
                }

                (this.. (), this.                                                                                                    .
                player.rotationYaw, (double) this.                                                                                                    .
                player.movementInput.moveStrafe, (double) this.                                                                                                    .
                player.movementInput.moveForward);
                if (lllIllIIlIll(44211, 5230)) {
                    throw null;
                }
            }
        }

        if (lllIllIIlIll(44211, 5230)) {
            throw null;
        } else {
            boolean var2 = true;
        }
    }
}
