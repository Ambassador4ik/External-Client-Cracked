import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class125 extends Class171 {
    private static int 85294=-19779;
    private static int 6751=787;
    private static int 8843=10479;
    private static int 73512=-7139;
    private static int 7139=4717;
    public Class220;
    private static int 94997=-10206;
    public Class220;
    public Class220;
    private static int 8112=28644;
    private static int 89078=-19824;
    private static int 2425=5608;
    public Class220;
    private static int 5878=31205;
    private static int 66823=-7023;
    private static int 3773=23982;
    private static int 3121=8825;
    private static int 47158=-8766;
    private static int 25054=-30691;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 3516=29329;
    private static int 573=21689;
    public Class220;
    private static int 9864=4451;
    private static int 5554=32360;
    private static int 19378=-18956;
    private static int 56702=-21426;
    public Class220;
    public Class220;
    private static int 8810=18464;
    public Class220;
    private static int 58957=-4929;
    private static int 5101=11108;
    public Class220;
    private static int 96484=-5474;
    public Class220;
    public Class220;
    private static int 41247=-21211;
    private static int 9215=-3277;
    public Class220;
    private static int 8142=31433;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    public int;
    private static int 71863=-7171;
    public Class220;
    private static int 88266=-9497;
    private static int 9678=25454;
    private static int 44069=-871;

    static {
        boolean var10000 = true;
    }

    public Class125() {
        String var10019 = Class60. ("Pl?");
        if (llllllIllIIl(56702, 573)) {
            throw null;
        } else {
            super(var10019, 16, Class188.);
            if (llllllIllIIl(56702, 573)) {
                throw null;
            } else {
                Color var18 = new Color(0, 0, 0, 160);
                if (llllllIllIIl(56702, 573)) {
                    throw null;
                } else {
                    this. = var18.getRGB();
                    Class220 var10018 = new Class220;
                    String var10020 = Class60. ("Zzc4ysz4\u007ftk4qz5");
                    if (llllllIllIIl(56702, 573)) {
                        throw null;
                    } else {
                        var10018.<init> (var10020, 131, this, true);
                        if (llllllIllIIl(56702, 573)) {
                            throw null;
                        } else {
                            this. = var10018;
                            Class220 var10017 = new Class220;
                            var10019 = Class60. ("Gpg0qcz0yc0");
                            if (llllllIllIIl(56702, 573)) {
                                throw null;
                            } else {
                                var10017.<init> (var10019, 38, this, true);
                                if (llllllIllIIl(56702, 573)) {
                                    throw null;
                                } else {
                                    this. = var10017;
                                    Class220 var10016 = new Class220;
                                    String var17 = Class60. ("Qca0uh[0qb/");
                                    if (llllllIllIIl(56702, 573)) {
                                        throw null;
                                    } else {
                                        var10016.<init> (var17, 133, this, true);
                                        if (llllllIllIIl(56702, 573)) {
                                            throw null;
                                        } else {
                                            this. = var10016;
                                            Class220 var10015 = new Class220;
                                            String var16 = Class60. ("Jz9yu;xn2(");
                                            if (llllllIllIIl(56702, 573)) {
                                                throw null;
                                            } else {
                                                var10015.<init> (var16, 68, this, false);
                                                if (llllllIllIIl(56702, 573)) {
                                                    throw null;
                                                } else {
                                                    this. = var10015;
                                                    Class220 var10014 = new Class220;
                                                    String var15 = Class60. ("Xuw;m~<(");
                                                    if (llllllIllIIl(56702, 573)) {
                                                        throw null;
                                                    } else {
                                                        var10014.<init> (var15, 42, this, false);
                                                        if (llllllIllIIl(56702, 573)) {
                                                            throw null;
                                                        } else {
                                                            this. = var10014;
                                                            Class220 var10013 = new Class220;
                                                            String var14 = Class60. ("Zp7`x5vf<Vp{8g?");
                                                            if (llllllIllIIl(56702, 573)) {
                                                                throw null;
                                                            } else {
                                                                var10013.<init> (var14, 132, this, false);
                                                                if (llllllIllIIl(56702, 573)) {
                                                                    throw null;
                                                                } else {
                                                                    this. = var10013;
                                                                    Class220 var10012 = new Class220;
                                                                    String var13 = Class60. ("]j8(");
                                                                    if (llllllIllIIl(56702, 573)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10012.<init> (var13, 40, this, false);
                                                                        if (llllllIllIIl(56702, 573)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10012;
                                                                            Class220 var10011 = new Class220;
                                                                            String var12 = Class60. ("Owr?<");
                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10011.<init> (var12, 41, this, false)
                                                                                ;
                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this. = var10011;
                                                                                    Class220 var10010 = new Class220;
                                                                                    String var11 = Class60. ("Y:H\b");
                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var10010.<init>
                                                                                        (var11, 245, this, false);
                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            this. = var10010;
                                                                                            Class220 var10009 = new Class220;
                                                                                            String var10 = Class60.
                                                                                            ("W{8|[:yo3\u007fs/");
                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10009.<init>
                                                                                                (var10, 246, this, false)
                                                                                                ;
                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    this. = var10009;
                                                                                                    Class220 var10008 = new Class220;
                                                                                                    String var9 = Class60.
                                                                                                    ("]{8xv:r<");
                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var10008.<init>
                                                                                                        (var9, -59, this, false)
                                                                                                        ;
                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            this. = var10008;
                                                                                                            Class220 var10007 = new Class220;
                                                                                                            String var8 = Class60.
                                                                                                            ("]o?qw=)");
                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                var10007.<init>
                                                                                                                (var8, 39, this, true)
                                                                                                                ;
                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    this. = var10007;
                                                                                                                    Class220 var10006 = new Class220;
                                                                                                                    String var7 = Class60.
                                                                                                                    ("^x4av6~c?yn7\"");
                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        var10006.<init>
                                                                                                                        (var7, 146, this, false)
                                                                                                                        ;
                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            this. = var10006;
                                                                                                                            Class220 var10005 = new Class220;
                                                                                                                            String var6 = Class60.
                                                                                                                            ("Bd(}N*bb#ga+sc$d5");
                                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                var10005.<init>
                                                                                                                                (var6, 242, this, true)
                                                                                                                                ;
                                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    this. = var10005;
                                                                                                                                    Class220 var10004 = new Class220;
                                                                                                                                    String var5 = Class60.
                                                                                                                                    ("Sw<q>");
                                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        var10004.<init>
                                                                                                                                        (var5, this, true)
                                                                                                                                        ;
                                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            this. = var10004;
                                                                                                                                            Class220 var10003 = new Class220;
                                                                                                                                            String var3 = Class60.
                                                                                                                                            ("Hz9sp;\u007fu2,");
                                                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                var10003.<init>
                                                                                                                                                (var3, 243, this, true)
                                                                                                                                                ;
                                                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    this. = var10003;
                                                                                                                                                    Class220 var10002 = new Class220;
                                                                                                                                                    String var2 = Class60.
                                                                                                                                                    ("Ft7}~5q{<bK4}m/");
                                                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var10002.<init>
                                                                                                                                                        (var2, this, false)
                                                                                                                                                        ;
                                                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            this. = var10002;
                                                                                                                                                            Class220 var10001 = new Class220;
                                                                                                                                                            String var1 = Class60.
                                                                                                                                                            ("Rq<{>");
                                                                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                String[] var4 = new String[2];
                                                                                                                                                                var7 = Class60.
                                                                                                                                                                ("Ttkw\u007f7");
                                                                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    var4[0] = var7;
                                                                                                                                                                    var7 = Class60.
                                                                                                                                                                    ("^rlw:");
                                                                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        var4[1] = var7;
                                                                                                                                                                        var10001.<init>
                                                                                                                                                                        (var1, this, var4)
                                                                                                                                                                        ;
                                                                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            this. = var10001;
                                                                                                                                                                            var10010 = new Class220;
                                                                                                                                                                            var11 = Class60.
                                                                                                                                                                            ("[w9jv;|Ib;t\u007f6?");
                                                                                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                var10010.<init>
                                                                                                                                                                                (var11, this, 10.0D, 1.0D, 100.0D, true)
                                                                                                                                                                                ;
                                                                                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    this. = var10010;
                                                                                                                                                                                    var10009 = new Class220;
                                                                                                                                                                                    var10 = Class60.
                                                                                                                                                                                    ("Iz9nk;o{2ox:y5");
                                                                                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        var10009.<init>
                                                                                                                                                                                        (var10, this, 6.0D, 0.0D, 10.0D, true)
                                                                                                                                                                                        ;
                                                                                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            this. = var10009;
                                                                                                                                                                                            var10008 = new Class220;
                                                                                                                                                                                            var9 = Class60.
                                                                                                                                                                                            ("Yt9vq)");
                                                                                                                                                                                            if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                var10008.<init>
                                                                                                                                                                                                (var9, this, 0.0D)
                                                                                                                                                                                                ;
                                                                                                                                                                                                if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    this. = var10008;
                                                                                                                                                                                                    var10007 = new Class220;
                                                                                                                                                                                                    var8 = Class60.
                                                                                                                                                                                                    ("Lj<z+");
                                                                                                                                                                                                    if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        var10007.<init>
                                                                                                                                                                                                        (var8, this, 60.0D, 0.0D, 100.0D, true)
                                                                                                                                                                                                        ;
                                                                                                                                                                                                        if (llllllIllIIl(56702, 573)) {
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            this. = var10007;
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            (true);
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            (false);
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                                                            this.
                                                                                                                                                                                                            ((Class220[]) (new Class220[]{this., this., this., this., this., this., this., this.}));
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
                    }
                }
            }
        }
    }

    private static boolean ____________________________________________________________________________/* $FF was:                                                                             */(PotionEffect var0) {
        return var0.func_188418_e();
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PotionEffect var0) {
        return 1;
    }

    private static boolean llllllIllIlI(int var0) {
        return var0 != 0;
    }

    private static boolean lllllllIIIII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllllllIIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PotionEffect var0) {
        if (llllllIllIlI(var0.func_188418_e()) && llllllIllIlI(var0.func_188419_a().func_76398_f())) {
            return true;
        } else if (llllllIllIIl(25054, 9678)) {
            throw null;
        } else {
            return false;
        }
    }

    private static boolean lllllllIIlII(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llllllIllIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static Class171[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0) {
        return new Class171[var0];
    }

    private static boolean llllllIlllll(int var0) {
        return var0 > 0;
    }

    private static int ____________________________________________________________________________/* $FF was:                                                                             */(PotionEffect var0) {
        return 1;
    }

    private static boolean llllllIlllII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllllllIIIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean ____________________________________________________________________________/* $FF was:                                                                             */(Class171 var0) {
        if (llllllIllIlI(var0. ()) &&llllllIllIlI(var0. ())){
            return true;
        } else if (llllllIllIIl(41247, 9864)) {
            throw null;
        } else {
            return false;
        }
    }

    private static boolean lllllllIIIlI(int var0) {
        return var0 <= 0;
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class171 var1, Class171 var2) {
        return this.                                                                                           .(var2.
        ())-this.                                                                                           .(var1. ());
    }

    public Color ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, float var3, float var4, float var5) {
        long var10000 = System.currentTimeMillis();
        if (llllllIllIIl(47158, 7139)) {
            throw null;
        } else {
            int var8;
            if (lllllllIIlII(var1 = (int) ((var10000 / (long) var2 + (long) var1) % 360L), 180)) {
                var8 = 360 - var1;
                boolean var10001 = true;
            } else {
                if (llllllIllIIl(47158, 7139)) {
                    throw null;
                }

                var8 = var1;
            }

            if (llllllIllIIl(47158, 7139)) {
                throw null;
            } else {
                float var6 = (float) (var8 + 180) / 360.0F;
                var8 = Color.HSBtoRGB(var4, var3, var6);
                if (llllllIllIIl(47158, 7139)) {
                    throw null;
                } else {
                    var1 = var8;
                    Color var9 = new Color(var1);
                    if (llllllIllIIl(47158, 7139)) {
                        throw null;
                    } else {
                        Color var7 = var9;
                        var9 = new Color;
                        int var10002 = var7.getRed();
                        int var10003 = var7.getGreen();
                        int var10004 = var7.getBlue();
                        int var10006 = Math.min(255, (int) (var5 * 255.0F));
                        if (llllllIllIIl(47158, 7139)) {
                            throw null;
                        } else {
                            int var10005 = Math.max(0, var10006);
                            if (llllllIllIIl(47158, 7139)) {
                                throw null;
                            } else {
                                var9.<init> (var10002, var10003, var10004, var10005);
                                if (llllllIllIIl(47158, 7139)) {
                                    throw null;
                                } else {
                                    return var9;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llllllIllIlI(this.. ()) &&llllllIlllII(var2, Class170.)){
            this.                                                                                         .();
        }

        if (llllllIllIIl(19378, 8843)) {
            throw null;
        } else {
            boolean var10000 = super. (var1, var2);
            if (llllllIllIIl(19378, 8843)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(GuiOpenEvent var1) {
        if (llllllIllIlI(this.. ()) &&llllllIllIlI(var1.getGui() instanceof GuiInventory)){
            Class127 var10001 = new Class127;
            Minecraft var10003 = Minecraft.func_71410_x();
            if (llllllIllIIl(96484, 3773)) {
                throw null;
            }

            var10001.<init> (var10003.field_71439_g);
            if (llllllIllIIl(96484, 3773)) {
                throw null;
            }

            var1.setGui(var10001);
        }

        if (llllllIllIIl(96484, 3773)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public int __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        int var1 = 0;

        boolean var10001;
        int var2;
        for (int var10000 = var2 = 0; !llllllIllIIl(85294, 5878); var10001 = true) {
            if (!lllllllIIIII(var10000, this..field_71439_g.field_71071_by.func_70302_i_())){
                if (llllllIllIIl(85294, 5878)) {
                    throw null;
                }

                return var1;
            }

            ItemStack var3;
            if (lllllllIIIIl((var3 = this..field_71439_g.field_71071_by.func_70301_a(var2)).func_77973_b() instanceof ItemAir) &&
            llllllIlllII(var3.func_77973_b(), Items.field_151032_g)){
                var1 += var3.func_190916_E();
            }

            if (llllllIllIIl(85294, 5878)) {
                throw null;
            }

            ++var2;
            var10000 = var2;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        boolean var62;
        if (llllllIllIlI(this..field_71474_y.field_74330_P)){
            var62 = true;
        } else if (llllllIllIIl(44069, 5554)) {
            throw null;
        } else {
            ScaledResolution var10000 = new ScaledResolution(this.);
            if (llllllIllIIl(44069, 5554)) {
                throw null;
            } else {
                ScaledResolution var2 = var10000;
                int var15 = var2.func_78326_a();
                int var3 = var2.func_78328_b();
                String var4;
                String var36;
                if (llllllIllIlI(this.. ()) &&llllllIllIlI(this.. (1000))){
                    var36 = Class60. ("I~kl{i=vs|1?e(");
                    if (llllllIllIIl(44069, 5554)) {
                        throw null;
                    }

                    Object[] var38 = new Object[1];
                    Integer var10004 = (int) this.                                                                                         .
                    () / 1000;
                    if (llllllIllIIl(44069, 5554)) {
                        throw null;
                    }

                    var38[0] = var10004;
                    var36 = String.format(var36, var38);
                    if (llllllIllIIl(44069, 5554)) {
                        throw null;
                    }

                    var4 = var36;
                    this.                                                                                           .
                    (var4, (float) (var15 / 2 - this.. (var4) / 2),50.0F, 2, Class73., this.                                                                                )
                    ;
                }

                if (llllllIllIIl(44069, 5554)) {
                    throw null;
                } else {
                    if (llllllIllIlI(this..field_71462_r instanceof GuiChat)){
                        var3 -= 14;
                    }

                    if (llllllIllIIl(44069, 5554)) {
                        throw null;
                    } else {
                        ArrayList var37 = new ArrayList();
                        if (llllllIllIIl(44069, 5554)) {
                            throw null;
                        } else {
                            ArrayList var17 = var37;
                            boolean var10002;
                            StringBuilder var39;
                            String var40;
                            if (llllllIllIlI(this.. ())){
                                var39 = new StringBuilder();
                                if (llllllIllIIl(44069, 5554)) {
                                    throw null;
                                }

                                var39 = var39.insert(0, Class73.);
                                var40 = Class60. ("{");
                                if (llllllIllIIl(44069, 5554)) {
                                    throw null;
                                }

                                var39 = var39.append(var40);
                                Object var41;
                                if (llllllIllIlI(this.. ())){
                                    var41 = Class73.                                                                                      .                                                                                                     .
                                    ();
                                    if (llllllIllIIl(44069, 5554)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else{
                                    if (llllllIllIIl(44069, 5554)) {
                                        throw null;
                                    }

                                    var41 = Class73.;
                                }

                                if (llllllIllIIl(44069, 5554)) {
                                    throw null;
                                }

                                String var5 = String.valueOf(var39.append(var41));
                                this.                                                                                           .
                                (var5, 1.0F, 1.0F, 2, Class73.                                                                                       .
                                getRGB(), this.                                                                                )
                                ;
                            }

                            if (llllllIllIIl(44069, 5554)) {
                                throw null;
                            } else {
                                BlockPos var42 = new BlockPos(this..field_71439_g.field_70165_t, this.                                                                                                    .
                                field_71439_g.field_70163_u, this.                                                                                                    .
                                field_71439_g.field_70161_v);
                                if (llllllIllIIl(44069, 5554)) {
                                    throw null;
                                } else {
                                    BlockPos var19 = var42;
                                    Integer var10005;
                                    Object[] var43;
                                    if (llllllIllIlI(this.. ())){
                                        var40 = Class60. ("B!<i>B'?a;K 3(");
                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        }

                                        var43 = new Object[3];
                                        var10005 = var19.func_177958_n();
                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        }

                                        var43[0] = var10005;
                                        var10005 = var19.func_177956_o();
                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        }

                                        var43[1] = var10005;
                                        var10005 = var19.func_177952_p();
                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        }

                                        var43[2] = var10005;
                                        var40 = String.format(var40, var43);
                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        }

                                        var17.add(var40);
                                    }

                                    if (llllllIllIIl(44069, 5554)) {
                                        throw null;
                                    } else {
                                        if (llllllIllIlI(this.. ())){
                                            var40 = Class60. ("¼.@!:i<B)?c;M 1(");
                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            }

                                            var43 = new Object[3];
                                            var10005 = var19.func_177958_n() / 8;
                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            }

                                            var43[0] = var10005;
                                            var10005 = var19.func_177956_o();
                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            }

                                            var43[1] = var10005;
                                            var10005 = var19.func_177952_p() / 8;
                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            }

                                            var43[2] = var10005;
                                            var40 = String.format(var40, var43);
                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            }

                                            var17.add(var40);
                                        }

                                        if (llllllIllIIl(44069, 5554)) {
                                            throw null;
                                        } else {
                                            boolean var46;
                                            StringBuilder var51;
                                            if (llllllIllIlI(this.. ())){
                                                EnumFacing var20 = this.                                                                                                    .
                                                field_71439_g.func_174811_aO();
                                                String var6 = "";
                                                if (llllllIlllII(var20, EnumFacing.NORTH)) {
                                                    var36 = Class60. ("7\u0001");
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    var6 = var36;
                                                    var37 = var17;
                                                    var46 = true;
                                                } else {
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    if (llllllIlllII(var20, EnumFacing.SOUTH)) {
                                                        var36 = Class60. ("1\u0001");
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        var6 = var36;
                                                        var37 = var17;
                                                        var46 = true;
                                                    } else {
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        if (llllllIlllII(var20, EnumFacing.WEST)) {
                                                            var36 = Class60. ("7\u0003");
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            var6 = var36;
                                                            var37 = var17;
                                                            var46 = true;
                                                        } else {
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            if (llllllIlllII(var20, EnumFacing.EAST)) {
                                                                var36 = Class60. ("1\u0003");
                                                                if (llllllIllIIl(44069, 5554)) {
                                                                    throw null;
                                                                }

                                                                var6 = var36;
                                                            }

                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            var37 = var17;
                                                        }
                                                    }
                                                }

                                                if (llllllIllIIl(44069, 5554)) {
                                                    throw null;
                                                }

                                                var51 = new StringBuilder();
                                                if (llllllIllIIl(44069, 5554)) {
                                                    throw null;
                                                }

                                                String var10003 = Class60. ("]{{rq}&{");
                                                if (llllllIllIIl(44069, 5554)) {
                                                    throw null;
                                                }

                                                var40 = String.format(String.valueOf(var51.insert(0, var10003).append(var6)));
                                                if (llllllIllIIl(44069, 5554)) {
                                                    throw null;
                                                }

                                                var37.add(var40);
                                            }

                                            if (llllllIllIIl(44069, 5554)) {
                                                throw null;
                                            } else {
                                                int var54;
                                                if (llllllIllIlI(this.. ())){
                                                    var40 = Class60. ("Zml&88(");
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    var43 = new Object[1];
                                                    var54 = Minecraft.func_175610_ah();
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    var10005 = var54;
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    var43[0] = var10005;
                                                    var40 = String.format(var40, var43);
                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    }

                                                    var17.add(var40);
                                                }

                                                if (llllllIllIIl(44069, 5554)) {
                                                    throw null;
                                                } else {
                                                    if (llllllIllIlI(this.. ())){
                                                        var40 = Class60. ("Ksv|%:9(");
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        var43 = new Object[1];
                                                        var54 = Class123. ((EntityPlayer) this..field_71439_g);
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        var10005 = var54;
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        var43[0] = var10005;
                                                        var40 = String.format(var40, var43);
                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        }

                                                        var17.add(var40);
                                                    }

                                                    if (llllllIllIIl(44069, 5554)) {
                                                        throw null;
                                                    } else {
                                                        if (llllllIllIlI(this.. ())){
                                                            var40 = Class60. ("QBC)77:\"=");
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            var43 = new Object[1];
                                                            double var57 = Class199. (this..field_71439_g);
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            Double var59 = var57;
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            var43[0] = var59;
                                                            var40 = String.format(var40, var43);
                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            }

                                                            var17.add(var40);
                                                        }

                                                        if (llllllIllIIl(44069, 5554)) {
                                                            throw null;
                                                        } else {
                                                            int var52;
                                                            if (llllllIllIlI(this.. ())){
                                                                var52 = this.                                                                                           .
                                                                ();
                                                                var46 = true;
                                                            } else{
                                                                if (llllllIllIIl(44069, 5554)) {
                                                                    throw null;
                                                                }

                                                                var52 = 0;
                                                            }

                                                            if (llllllIllIIl(44069, 5554)) {
                                                                throw null;
                                                            } else {
                                                                int var21 = var52;

                                                                Iterator var25;
                                                                for (Iterator var53 = var25 = var17.iterator(); !llllllIllIIl(44069, 5554); var46 = true) {
                                                                    if (!llllllIllIlI(var53.hasNext())) {
                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                            throw null;
                                                                        }

                                                                        boolean var27 = true;
                                                                        int var30 = 1 + this. ();
                                                                        if (llllllIllIlI(this.. ()) &&
                                                                        llllllIlllll(super.. ().size())){
                                                                            Class66 var55 = (Class66) super.                                                                                                   .
                                                                            ().get(0);
                                                                            int var45 = var30;
                                                                            var30 += 22;
                                                                            var55. (var1, var45 - 1);
                                                                        }

                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                            throw null;
                                                                        }

                                                                        int var11;
                                                                        int var18;
                                                                        String var47;
                                                                        if (llllllIllIlI(this.. ())){
                                                                            var18 = 0;
                                                                            Class171[] var7 = (Class171[]) Class73.                                                                                      .                                                                                .                                                                                                   .
                                                                            stream().filter(Class125::).sorted(this::).toArray(Class125::);
                                                                            int var8 = var7.length;
                                                                            int var9;
                                                                            var52 = var9 = 0;

                                                                            while (true) {
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                if (!lllllllIIIII(var52, var8)) {
                                                                                    break;
                                                                                }

                                                                                Class171 var10;
                                                                                Class125 var60;
                                                                                label644:
                                                                                {
                                                                                    Class171 var56 = var10 = var7[var9];
                                                                                    var56.                                                                                     .
                                                                                    ();
                                                                                    var56.                                                                                     .
                                                                                    ((float) this.. (var10. ()));
                                                                                    var11 = Class73.                                                                                       .
                                                                                    getRGB();
                                                                                    if (llllllIllIlI(this.. ())){
                                                                                    byte var58;
                                                                                    label646:
                                                                                    {
                                                                                        byte var13;
                                                                                        String var12 = this.                                                                                         .
                                                                                        ();
                                                                                        var13 = -1;
                                                                                        label609:
                                                                                        switch (var12.hashCode()) {
                                                                                            case -1955878649:
                                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                while (!llllllIllIIl(44069, 5554)) {
                                                                                                    if (lllllllIIIIl(0)) {
                                                                                                        var40 = Class60.
                                                                                                        ("Ttkw\u007f7");
                                                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                                                            throw null;
                                                                                                        }

                                                                                                        if (llllllIllIlI(var12.equals(var40))) {
                                                                                                            byte var35;
                                                                                                            var58 = var35 = 0;
                                                                                                            var46 = true;
                                                                                                            break label646;
                                                                                                        }
                                                                                                        break label609;
                                                                                                    }

                                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var46 = true;
                                                                                                }

                                                                                                throw null;
                                                                                            case 63357246:
                                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                var40 = Class60. ("^rlw:");
                                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                if (llllllIllIlI(var12.equals(var40))) {
                                                                                                    var13 = 1;
                                                                                                }
                                                                                        }

                                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                                            throw null;
                                                                                        }

                                                                                        var58 = var13;
                                                                                    }

                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    switch (var58) {
                                                                                        case 0:
                                                                                            if (llllllIllIIl(44069, 5554)) {
                                                                                                throw null;
                                                                                            }

                                                                                            for (var60 = this; !llllllIllIIl(44069, 5554); var46 = true) {
                                                                                                if (lllllllIIIIl(0)) {
                                                                                                    var11 = this.                                                                                           .
                                                                                                    (8000, var18).
                                                                                                    getRGB();
                                                                                                    var46 = true;
                                                                                                    break label644;
                                                                                                }

                                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                                    throw null;
                                                                                                }
                                                                                            }

                                                                                            throw null;
                                                                                        case 1:
                                                                                            if (llllllIllIIl(44069, 5554)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var60 = this;
                                                                                            var11 = this. (var18, 11 - (int) (this.. () * 0.1D),(float) this.                                                                                      .() * 0.1F, (float) (this.. () * 100.0D / 76.0D - 3.0D) *0.01F, 1.0F).getRGB();
                                                                                            var46 = true;
                                                                                            break label644;
                                                                                    }
                                                                                }

                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var60 = this;
                                                                                }

                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                Class4 var61 = var60.;
                                                                                var51 = new StringBuilder();
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var51 = var51.insert(0, var10. ());
                                                                                var47 = Class60. ("{");
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var40 = String.valueOf(var51.append(var47));
                                                                                float var50 = (float) var15 - var10.                                                                                     .
                                                                                ();
                                                                                byte var44;
                                                                                if (llllllIllIlI(this.. ())){
                                                                                    var44 = 1;
                                                                                    boolean var48 = true;
                                                                                } else{
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var44 = 0;
                                                                                }

                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var50 -= (float) var44;
                                                                                float var49 = (float) var30;
                                                                                Class125 var10006;
                                                                                if (llllllIllIlI(this.. ())){
                                                                                    var54 = var11;
                                                                                    var10006 = this;
                                                                                    boolean var10007 = true;
                                                                                } else{
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var54 = Class73.;
                                                                                    var10006 = this;
                                                                                }

                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var61.
                                                                                (var40, var50, var49, 2, var54, var10006.                                                                                )
                                                                                ;
                                                                                if (llllllIllIlI(this.. ())){
                                                                                    this.                                                                                           .
                                                                                    ((float) var15, (float) (var30 - 1), (float) (var15 - 1), (float) (var30 + 8), var11)
                                                                                    ;
                                                                                }

                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var40 = this.                                                                                         .
                                                                                ();
                                                                                var47 = Class60. ("Ttkw\u007f7");
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                int var64;
                                                                                if (llllllIllIlI(var40.equals(var47))) {
                                                                                    var64 = 120;
                                                                                    var10002 = true;
                                                                                } else {
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var64 = this.                                                                               .
                                                                                    ();
                                                                                }

                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                var18 -= var64;
                                                                                ++var9;
                                                                                var52 = var9;
                                                                                var30 += 9;
                                                                                var46 = true;
                                                                            }
                                                                        }

                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                            throw null;
                                                                        }

                                                                        int var14;
                                                                        Iterator var23;
                                                                        if (llllllIllIlI(this.. ())){
                                                                            var18 = 0;
                                                                            var14 = 9;
                                                                            byte var22 = 0;
                                                                            var23 = this.                                                                                                    .
                                                                            field_71439_g.field_71071_by.field_70460_b.iterator();

                                                                            label580:
                                                                            while (true) {
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                if (!llllllIllIlI(var23.hasNext())) {
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    if (lllllllIIIIl(this..field_71439_g.field_71071_by.func_70448_g().func_77973_b() instanceof ItemAir))
                                                                                    {
                                                                                        var22 = 1;
                                                                                    }

                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    byte var63;
                                                                                    if (llllllIllIlI(this.. ()) &&
                                                                                    llllllIllIlI(var22)){
                                                                                        var63 = 17;
                                                                                        var46 = true;
                                                                                    } else{
                                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                                            throw null;
                                                                                        }

                                                                                        var63 = 0;
                                                                                    }

                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    byte var24 = var63;
                                                                                    Iterator var29 = this.                                                                                                    .
                                                                                    field_71439_g.field_71071_by.field_70462_a.iterator();

                                                                                    while (true) {
                                                                                        while (!llllllIllIIl(44069, 5554)) {
                                                                                            if (!llllllIllIlI(var29.hasNext())) {
                                                                                                break label580;
                                                                                            }

                                                                                            ItemStack var33 = (ItemStack) var29.next();
                                                                                            int var34 = var15 - 17 * var14 - var24;
                                                                                            var11 = var3 - 17 - 17 * var18;
                                                                                            this.                                                                                           .
                                                                                            ((double) var34, (double) var11, 16.0D, 16.0D, 5.0D, this.                                                                                )
                                                                                            ;
                                                                                            --var14;
                                                                                            this.                                                                                           .
                                                                                            (var33, var34, var11, -100.0F)
                                                                                            ;
                                                                                            if (lllllllIIIlI(var14) && lllllllIIIIl(var18)) {
                                                                                                var18 = 3;
                                                                                                var14 = 9;
                                                                                                var62 = true;
                                                                                            } else {
                                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                if (lllllllIIIlI(var14) && lllllllIIIlI(var14) && llllllIlllll(var18)) {
                                                                                                    var14 = 9;
                                                                                                    --var18;
                                                                                                    var62 = true;
                                                                                                }
                                                                                            }
                                                                                        }

                                                                                        throw null;
                                                                                    }
                                                                                }

                                                                                if (lllllllIIIIl(((ItemStack) var23.next()).func_77973_b() instanceof ItemAir)) {
                                                                                    var22 = 1;
                                                                                    var62 = true;
                                                                                }
                                                                            }
                                                                        }

                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                            throw null;
                                                                        }

                                                                        if (llllllIllIlI(this.. ())){
                                                                            var18 = 0;
                                                                            boolean var16 = false;
                                                                            boolean var26 = false;
                                                                            var53 = var23 = this.                                                                                                    .
                                                                            field_71439_g.field_71071_by.field_70460_b.iterator();

                                                                            while (true) {
                                                                                if (llllllIllIIl(44069, 5554)) {
                                                                                    throw null;
                                                                                }

                                                                                if (!llllllIllIlI(var53.hasNext())) {
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    ItemStack var28;
                                                                                    if (lllllllIIIll((var28 = this..field_71439_g.field_71071_by.func_70448_g()).func_77973_b(),
                                                                                    Items.field_190931_a)){
                                                                                        var52 = var15 - 17;
                                                                                        ++var18;
                                                                                        var14 = var52;
                                                                                        var21 = var3 - 17 * var18;
                                                                                        this.                                                                                           .
                                                                                        ((double) var14, (double) var21, 16.0D, 16.0D, 5.0D, this.                                                                                )
                                                                                        ;
                                                                                        this.                                                                                           .
                                                                                        (var28, var14, var21, -100.0F);
                                                                                        if (llllllIlllII(var28.func_77973_b(), Items.field_151031_f)) {
                                                                                            var39 = new StringBuilder();
                                                                                            if (llllllIllIIl(44069, 5554)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var47 = String.valueOf(this.
                                                                                            ());
                                                                                            if (llllllIllIIl(44069, 5554)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var39 = var39.insert(0, var47);
                                                                                            var40 = Class60. ("#");
                                                                                            if (llllllIllIIl(44069, 5554)) {
                                                                                                throw null;
                                                                                            }

                                                                                            String var32 = String.valueOf(var39.append(var40));
                                                                                            this.                                                                                           .
                                                                                            (var32, (float) (var15 - this..
                                                                                            (var32) - 1),
                                                                                            (float) (var21 - this..field_71466_p.field_78288_b),
                                                                                            Class73., true);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }

                                                                                ItemStack var31;
                                                                                if (llllllIllIlI((var31 = (ItemStack) var23.next()).func_190926_b())) {
                                                                                    var53 = var23;
                                                                                    var46 = true;
                                                                                } else {
                                                                                    if (llllllIllIIl(44069, 5554)) {
                                                                                        throw null;
                                                                                    }

                                                                                    ++var18;
                                                                                    var14 = var15 - 17;
                                                                                    var21 = var3 - 17 * var18;
                                                                                    var53 = var23;
                                                                                    this.                                                                                           .
                                                                                    ((double) var14, (double) var21, 16.0D, 16.0D, 5.0D, this.                                                                                )
                                                                                    ;
                                                                                    this.                                                                                           .
                                                                                    (var31, var14, var21, -100.0F);
                                                                                    var46 = true;
                                                                                }
                                                                            }
                                                                        }

                                                                        if (llllllIllIIl(44069, 5554)) {
                                                                            throw null;
                                                                        }

                                                                        var62 = true;
                                                                        return;
                                                                    }

                                                                    var4 = (String) var25.next();
                                                                    var53 = var25;
                                                                    this.                                                                                           .
                                                                    (var4, 1.0F, (float) (var21 + 1), 2, Class73., this.                                                                                )
                                                                    ;
                                                                    var21 += this.                                                                                           .
                                                                    ();
                                                                }

                                                                throw null;
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

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        if (llllllIlllll(this..field_71439_g.func_70651_bq().stream().filter(Class125::).mapToInt(Class125::).sum())){
            if (llllllIlllll(this..field_71439_g.func_70651_bq().stream().filter(Class125::).mapToInt(Class125::).sum()))
            {
                return 52;
            } else if (llllllIllIIl(71863, 3121)) {
                throw null;
            } else {
                return 26;
            }
        } else if (llllllIllIIl(71863, 3121)) {
            throw null;
        } else {
            return 0;
        }
    }
}
