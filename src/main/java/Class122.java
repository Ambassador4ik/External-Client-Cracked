import java.awt.Color;
import java.util.Iterator;
import java.util.stream.Stream;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShield;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class Class122 extends Class171 {
    private static int 9508=17711;
    private static int 77723=-28327;
    public Class220;
    private static int 82986=-2633;
    public Class220;
    private static int 8344=21170;
    private static int 21=16007;
    public static EntityLivingBase;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 7012=16937;
    private static int 5405=8894;
    public float;
    private static int 40962=-4510;
    public Class220;
    private static int 57707=-32764;
    public Class220;
    public Class220;
    private static int 3654=1829;
    public Class220;
    private static int 46184=-8292;
    private static int 7110=21242;
    private static int 8598=25204;
    private static int 41746=-8975;
    private static int 95465=-8866;
    private static int 68423=-23650;
    private static int 5648=19840;
    public float;
    private static int 4772=7625;
    private static int 28195=-31567;
    public Class220;
    public Class220;
    private static int 11799=-14217;
    private static int 39608=-8767;
    private static int 97471=-13911;
    public Class220;
    private static int 5271=30566;
    private static int 11341=-9527;
    private static int 67=14277;
    public Class220;
    public Class220;
    public Class220;
    private static int 3991=25768;

    static {
        boolean var10000 = true;
    }

    public Class122() {
        String var10006 = Class60. ("[x3|x1Ve8c:");
        if (llllIlIIIlII(46184, 8344)) {
            throw null;
        } else {
            super(var10006, 31, Class188.);
            if (llllIlIIIlII(46184, 8344)) {
                throw null;
            } else {
                this. = 0.0F;
                this. = 0.0F;
                Class220 var10001 = new Class220;
                String var10003 = Class60. ("B~3du1cy8~5");
                if (llllIlIIIlII(46184, 8344)) {
                    throw null;
                } else {
                    String[] var5 = new String[2];
                    String var10009 = Class60. ("Jzzq{/");
                    if (llllIlIIIlII(46184, 8344)) {
                        throw null;
                    } else {
                        var5[0] = var10009;
                        var10009 = Class60. ("Ywp\u007fp/");
                        if (llllIlIIIlII(46184, 8344)) {
                            throw null;
                        } else {
                            var5[1] = var10009;
                            var10001.<init> (var10003, 315, this, var5);
                            if (llllIlIIIlII(46184, 8344)) {
                                throw null;
                            } else {
                                this. = var10001;
                                var10001 = new Class220;
                                var10003 = Class60. ("Rq<{>");
                                if (llllIlIIIlII(46184, 8344)) {
                                    throw null;
                                } else {
                                    var5 = new String[3];
                                    var10009 = Class60. ("Wzmhw#");
                                    if (llllIlIIIlII(46184, 8344)) {
                                        throw null;
                                    } else {
                                        var5[0] = var10009;
                                        var10009 = Class60. ("T\u001c");
                                        if (llllIlIIIlII(46184, 8344)) {
                                            throw null;
                                        } else {
                                            var5[1] = var10009;
                                            var10009 = Class60. ("WU\u001f");
                                            if (llllIlIIIlII(46184, 8344)) {
                                                throw null;
                                            } else {
                                                var5[2] = var10009;
                                                var10001.<init> (var10003, 311, this, var5);
                                                if (llllIlIIIlII(46184, 8344)) {
                                                    throw null;
                                                } else {
                                                    this. = var10001;
                                                    var10001 = new Class220;
                                                    var10003 = Class60. ("Zn8o~:\u007f0");
                                                    if (llllIlIIIlII(46184, 8344)) {
                                                        throw null;
                                                    } else {
                                                        String[] var10005 = new String[2];
                                                        String var10008 = Class60. ("Irw}r>");
                                                        if (llllIlIIIlII(46184, 8344)) {
                                                            throw null;
                                                        } else {
                                                            var10005[0] = var10008;
                                                            var10008 = Class60. ("Ilpn}3");
                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                throw null;
                                                            } else {
                                                                var10005[1] = var10008;
                                                                var10001.<init> (var10003, this, var10005);
                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                    throw null;
                                                                } else {
                                                                    this. = var10001;
                                                                    Class220 var10013 = new Class220;
                                                                    String var10015 = Class60. ("Hz9ty>");
                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10013.<init>
                                                                        (var10015, 89, this, 3.6D, 3.0D, 8.0D, false);
                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10013;
                                                                            Class220 var10012 = new Class220;
                                                                            String var10014 = Class60.
                                                                            ("_\u007f3|m1Tb8x/");
                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10012.<init>
                                                                                (var10014, 312, this, true);
                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this. = var10012;
                                                                                    Class220 var10011 = new Class220;
                                                                                    String var13 = Class60.
                                                                                    ("Qd3d{1]e8|+");
                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var10011.<init>
                                                                                        (var13, 313, this, true);
                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            this. = var10011;
                                                                                            Class220 var10010 = new Class220;
                                                                                            String var12 = Class60.
                                                                                            ("Hx(b{*Hb#yt+fd$h>");
                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10010.<init>
                                                                                                (var12, 318, this, 0.1D, 0.08D, 0.4D, false)
                                                                                                ;
                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    this. = var10010;
                                                                                                    Class220 var10 = new Class220;
                                                                                                    String var11 = Class60.
                                                                                                    ("Mz9vr(");
                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var10.<init>
                                                                                                        (var11, 314, this, false)
                                                                                                        ;
                                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            this. = var10;
                                                                                                            Class220 var8 = new Class220;
                                                                                                            String var9 = Class60.
                                                                                                            ("^xb7zey7}zy7(");
                                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                var8.<init>
                                                                                                                (var9, 105, this, false)
                                                                                                                ;
                                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    this. = var8;
                                                                                                                    Class220 var10007 = new Class220;
                                                                                                                    var10009 = Class60.
                                                                                                                    ("Lq~<ax)");
                                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        var10007.<init>
                                                                                                                        (var10009, 90, this, true)
                                                                                                                        ;
                                                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            this. = var10007;
                                                                                                                            Class220 var6 = new Class220;
                                                                                                                            var10008 = Class60.
                                                                                                                            ("R|y3zsx3(");
                                                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                var6.<init>
                                                                                                                                (var10008, 91, this, false)
                                                                                                                                ;
                                                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    this. = var6;
                                                                                                                                    Class220 var3 = new Class220;
                                                                                                                                    String var7 = Class60.
                                                                                                                                    ("Vuv;lny)");
                                                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        var3.<init>
                                                                                                                                        (var7, 92, this, false)
                                                                                                                                        ;
                                                                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            this. = var3;
                                                                                                                                            Class220 var10004 = new Class220;
                                                                                                                                            var10006 = Class60.
                                                                                                                                            ("Io9un;Nj2ix:xo5sd<");
                                                                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                var10004.<init>
                                                                                                                                                (var10006, this, true)
                                                                                                                                                ;
                                                                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    this. = var10004;
                                                                                                                                                    Class220 var1 = new Class220;
                                                                                                                                                    String var4 = Class60.
                                                                                                                                                    ("Tt9Sp;i\u007f2ip:u/");
                                                                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var1.<init>
                                                                                                                                                        (var4, 316, this, true)
                                                                                                                                                        ;
                                                                                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            this. = var1;
                                                                                                                                                            Class220 var10002 = new Class220;
                                                                                                                                                            String var2 = Class60.
                                                                                                                                                            ("[n9nq;Nr2rt:z?");
                                                                                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                var10002.<init>
                                                                                                                                                                (var2, 317, this, true)
                                                                                                                                                                ;
                                                                                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    this. = var10002;
                                                                                                                                                                    var10001 = new Class220;
                                                                                                                                                                    var10003 = Class60.
                                                                                                                                                                    ("Lq<m/");
                                                                                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        var5 = new String[3];
                                                                                                                                                                        var10009 = Class60.
                                                                                                                                                                        ("_sko~t\u007f>");
                                                                                                                                                                        if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            var5[0] = var10009;
                                                                                                                                                                            var10009 = Class60.
                                                                                                                                                                            ("R~xvj3");
                                                                                                                                                                            if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                var5[1] = var10009;
                                                                                                                                                                                var10009 = Class60.
                                                                                                                                                                                ("Ls}m/");
                                                                                                                                                                                if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var5[2] = var10009;
                                                                                                                                                                                    var10001.<init>
                                                                                                                                                                                    (var10003, 106, this, var5)
                                                                                                                                                                                    ;
                                                                                                                                                                                    if (llllIlIIIlII(46184, 8344)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        this. = var10001;
                                                                                                                                                                                        this.
                                                                                                                                                                                        ((Class220[]) (new Class220[]{this., this., this., this., this., this., this., this., this., this., this., this., this., this., this., this.}));
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

    private static boolean llllIlIIllII(int var0) {
        return var0 != 0;
    }

    private static boolean llllIlIlIIII(int var0) {
        return var0 <= 0;
    }

    private static boolean llllIlIIlIIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llllIlIlIlIl(int var0) {
        return var0 < 0;
    }

    private static boolean llllIlIIllll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llllIlIlIIIl(Object var0) {
        return var0 != null;
    }

    private static boolean llllIlIIIlll(Object var0) {
        return var0 == null;
    }

    private static boolean llllIlIIlIII(int var0) {
        return var0 == 0;
    }

    private static boolean llllIlIIlIlI(int var0) {
        return var0 > 0;
    }

    private static boolean llllIlIIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (llllIlIIIlII(95465, 8598)) {
            throw null;
        } else {
                                                                                                        =null;
            boolean var10000 = true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llllIlIlIIIl() && llllIlIIllII(var1 instanceof CPacketPlayer)) {
            String var10000 = this.                                                                                     .
            ();
            String var10001 = Class60. ("WU\u001f");
            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            boolean var9;
            boolean var10;
            if (llllIlIIlIII(var10000.equals(var10001))) {
                var9 = true;
                var10 = true;
            } else {
                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                }

                var9 = false;
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            boolean var6 = var9;
            float var18;
            float var19;
            if (!llllIlIIllII((var18 = this. - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1)) || llllIlIIlIII((var19 = this. - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1))) {
                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                }

                this. = this.                                                                                                    .
                player.rotationYaw;
                this. = this.                                                                                                    .
                player.rotationPitch;
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            EntityLivingBase var11 = ;
            float var12 = this.;
            float var10002 = this.;
            String var10005 = this.                                                                                     .
            ();
            String var10006 = Class60. ("T\u001c");
            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            float var16;
            if (llllIlIIllII(var10005.equals(var10006))) {
                var16 = 3.0F;
                boolean var17 = true;
            } else {
                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                }

                var16 = 2.0F;
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            float[] var13 = Class13. (var11, var12, var10002, var6, var6, var16);
            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            float[] var3;
            byte var14;
            label226:
            {
                byte var5;
                var3 = var13;
                this. = var3[0];
                this. = var13[1];
                String var4 = this.                                                                                  .
                ();
                var5 = -1;
                label200:
                switch (var4.hashCode()) {
                    case -1911998296:
                        if (llllIlIIIlII(68423, 67)) {
                            throw null;
                        }

                        while (!llllIlIIIlII(68423, 67)) {
                            if (llllIlIIlIII(0)) {
                                var10001 = Class60. ("Jzzq{/");
                                if (llllIlIIIlII(68423, 67)) {
                                    throw null;
                                }

                                if (llllIlIIllII(var4.equals(var10001))) {
                                    byte var8;
                                    var14 = var8 = 0;
                                    var10 = true;
                                    break label226;
                                }
                                break label200;
                            }

                            if (llllIlIIIlII(68423, 67)) {
                                throw null;
                            }

                            var10 = true;
                        }

                        throw null;
                    case 2021122027:
                        if (llllIlIIIlII(68423, 67)) {
                            throw null;
                        }

                        var10001 = Class60. ("Ywp\u007fp/");
                        if (llllIlIIIlII(68423, 67)) {
                            throw null;
                        }

                        if (llllIlIIllII(var4.equals(var10001))) {
                            var5 = 1;
                        }
                }

                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                }

                var14 = var5;
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            Class122 var15;
            label187:
            switch (var14) {
                case 0:
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }

                    while (!llllIlIIIlII(68423, 67)) {
                        if (llllIlIIlIII(0)) {
                            Class22. (var1, var3[0]);
                            if (llllIlIIIlII(68423, 67)) {
                                throw null;
                            }

                            Class22. (var1, var3[1]);
                            if (llllIlIIIlII(68423, 67)) {
                                throw null;
                            }

                            var15 = this;
                            var10 = true;
                            break label187;
                        }

                        if (llllIlIIIlII(68423, 67)) {
                            throw null;
                        }

                        var10 = true;
                    }

                    throw null;
                case 1:
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }

                    var15 = this;
                    this.                                                                                                    .player.rotationYaw = var3[0];
                    this.                                                                                                    .player.rotationPitch = var3[1];
                    var10 = true;
                    break;
                default:
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }

                    var15 = this;
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            }

            var15.                                                                                                    .
            player.setRotationYawHead(var3[0]);
            this.                                                                                                    .
            player.setRenderYawOffset(var3[0]);
        }

        if (llllIlIIIlII(68423, 67)) {
            throw null;
        } else {
            if (llllIlIlIIIl() && llllIlIIllII(this.. ())){
                CPacketUseEntity var7;
                if (llllIlIIllII(var1 instanceof CPacketUseEntity) && llllIlIIlIIl((var7 = (CPacketUseEntity) var1).getEntityFromWorld(this..world),                                                                                               ) &&
                (!llllIlIIllll(var7.getAction(), Action.INTERACT) || llllIlIIlIIl(var7.getAction(), Action.INTERACT_AT)))
                {
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }

                    return false;
                }

                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                }

                if (llllIlIIllII(var1 instanceof CPacketPlayerTryUseItemOnBlock)) {
                    return false;
                }
            }

            if (llllIlIIIlII(68423, 67)) {
                throw null;
            } else {
                if (llllIlIIllII(var1 instanceof SPacketPlayerPosLook)) {
                    Class22. (var1, this.                                                                                                    .
                    player.rotationYaw);
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }

                    Class22. (var1, this.                                                                                                    .
                    player.rotationPitch);
                    if (llllIlIIIlII(68423, 67)) {
                        throw null;
                    }
                }

                if (llllIlIIIlII(68423, 67)) {
                    throw null;
                } else {
                    return true;
                }
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        if (llllIlIIllII(var1 instanceof EntityLivingBase)) {
            byte var10000 = this. ((EntityLivingBase) var1);
            if (llllIlIIIlII(41746, 7110)) {
                throw null;
            }

            double var2;
            if (llllIlIIllII(var10000) && llllIlIlIIII((var2 = (double) this..player.getDistance(var1) - this..
            ()) ==0.0D ? 0 : (var2 < 0.0D ? -1 : 1))){
                return true;
            }
        }

        if (llllIlIIIlII(41746, 7110)) {
            throw null;
        } else {
            return false;
        }
    }

    private Entity ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        Stream var10000 = this.                                                                                                    .
        world.getLoadedEntityList().stream().filter(this::);
        Class81 var10001 = new Class81(this);
        if (llllIlIIIlII(28195, 5271)) {
            throw null;
        } else {
            return (Entity) var10000.sorted(var10001).findFirst().orElse((Object) null);
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (llllIlIIIlII(11799, 3991)) {
            throw null;
        } else {
                                                                                                        =null;
            boolean var10000 = true;
        }
    }

    public boolean _________________________________________________________________________________/* $FF was:                                                                                  */() {
        if (llllIlIIlIII(this.. ())){
            return false;
        } else if (llllIlIIIlII(39608, 3654)) {
            throw null;
        } else {
            Iterator var1 = this.                                                                                                    .
            world.loadedEntityList.iterator();

            while (!llllIlIIIlII(39608, 3654)) {
                if (!llllIlIIllII(var1.hasNext())) {
                    if (llllIlIIIlII(39608, 3654)) {
                        throw null;
                    }

                    return false;
                }

                Entity var2;
                float var3;
                if (llllIlIIllII((var2 = (Entity) var1.next()) instanceof EntityLivingBase) && llllIlIIllll(var2, this..player) &&
                llllIlIlIIII((var3 = this..player.getDistance(var2) - 10.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1)) &&
                llllIlIIllII(this..player.onGround) &&
                llllIlIIlIII(this..gameSettings.keyBindJump.isKeyDown()) &&
                llllIlIIlIII(this..player.isInWater()) &&llllIlIIlIII(this..player.isInLava())){
                    return true;
                }
            }

            throw null;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        if (llllIlIlIIIl() && llllIlIIllII(.isEntityAlive())){
            EntityLivingBase var10000 = ;
            Color var10001 = new Color(255, 0, 0);
            if (llllIlIIIlII(82986, 5648)) {
                throw null;
            }

            Class181. (var10000, var10001, var1.getPartialTicks(), 0.5D);
            if (llllIlIIIlII(82986, 5648)) {
                throw null;
            }
        }

        if (llllIlIIIlII(82986, 5648)) {
            throw null;
        } else {
            boolean var2 = true;
        }
    }

    public boolean __________________________________________________________________________________/* $FF was:                                                                                   */() {
        float var9;
        byte var10000;
        if (llllIlIIlIII(this..player.onGround) &&
        llllIlIIlIlI((var9 = this..player.fallDistance - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1)) &&
        llllIlIIlIII(this..player.isOnLadder()) &&llllIlIIlIII(this..player.isInWater()) &&
        llllIlIIlIII(this..player.isInLava())){
            var10000 = 1;
            boolean var10001 = true;
        } else{
            if (llllIlIIIlII(11341, 7012)) {
                throw null;
            }

            var10000 = 0;
        }

        if (llllIlIIIlII(11341, 7012)) {
            throw null;
        } else {
            byte var1 = var10000;
            double var5 = (double) this.                                                                                                    .
            player.fallDistance;
            long var10;
            double var10002;
            if (llllIlIlIlIl((var10 = this.. () - 120L) ==0L ? 0 : (var10 < 0L ? -1 : 1))){
                var10002 = 0.07999999821186066D;
                boolean var10003 = true;
            } else{
                if (llllIlIIIlII(11341, 7012)) {
                    throw null;
                }

                var10002 = this.                                                                               .();
            }

            if (llllIlIIIlII(11341, 7012)) {
                throw null;
            } else {
                byte var6;
                boolean var8;
                double var11;
                if (llllIlIlIlIl((var11 = var5 - var10002) == 0.0D ? 0 : (var11 < 0.0D ? -1 : 1))) {
                    var6 = 1;
                    var8 = true;
                } else {
                    if (llllIlIIIlII(11341, 7012)) {
                        throw null;
                    }

                    var6 = 0;
                }

                if (llllIlIIIlII(11341, 7012)) {
                    throw null;
                } else {
                    int var3 = var1 & var6;
                    double var12;
                    if (llllIlIIlIlI((var12 = (double) this..player.getDistance() - this.. ()) ==
                    0.0D ? 0 : (var12 < 0.0D ? -1 : 1))){
                        return false;
                    } else if (llllIlIIIlII(11341, 7012)) {
                        throw null;
                    } else {
                        byte var2 = this.                                                                            .
                        ();
                        float var4 = this.                                                                                                    .
                        player.getCooledAttackStrength(1.0F);
                        float var7;
                        if (llllIlIIllII(var2)) {
                            var7 = 0.95F;
                            var8 = true;
                        } else {
                            if (llllIlIIIlII(11341, 7012)) {
                                throw null;
                            }

                            var7 = 1.0F;
                        }

                        if (llllIlIIIlII(11341, 7012)) {
                            throw null;
                        } else {
                            float var13;
                            if (llllIlIlIlIl((var13 = var4 - var7) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1))) {
                                return false;
                            } else if (llllIlIIIlII(11341, 7012)) {
                                throw null;
                            } else if (llllIlIIllII(this.. ()) &&!llllIlIIllII(var3)){
                                if (llllIlIIIlII(11341, 7012)) {
                                    throw null;
                                } else {
                                    var10000 = Class133. (57);
                                    if (llllIlIIIlII(11341, 7012)) {
                                        throw null;
                                    } else {
                                        if (!llllIlIIlIII(var10000) || llllIlIIlIII(this..player.isInWater()))
                                        {
                                            if (llllIlIIIlII(11341, 7012)) {
                                                throw null;
                                            }

                                            var10000 = Class22. ();
                                            if (llllIlIIIlII(11341, 7012)) {
                                                throw null;
                                            }

                                            if (llllIlIIlIII(var10000) && !llllIlIIllII(this..player.isInLava()))
                                            {
                                                if (llllIlIIIlII(11341, 7012)) {
                                                    throw null;
                                                }

                                                return false;
                                            }
                                        }

                                        if (llllIlIIIlII(11341, 7012)) {
                                            throw null;
                                        } else {
                                            return true;
                                        }
                                    }
                                }
                            } else if (llllIlIIIlII(11341, 7012)) {
                                throw null;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityLivingBase var1) {
        if (llllIlIIIlll(var1)) {
            return false;
        } else if (llllIlIIIlII(77723, 21)) {
            throw null;
        } else if (llllIlIIlIII(var1.isEntityAlive())) {
            return false;
        } else if (llllIlIIIlII(77723, 21)) {
            throw null;
        } else if (llllIlIIlIIl(var1, this..player)){
            return false;
        } else if (llllIlIIIlII(77723, 21)) {
            throw null;
        } else {
            float var2;
            if (llllIlIIlIlI((var2 = this..player.getDistance(var1) - 10.0F) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1)))
            {
                return false;
            } else if (llllIlIIIlII(77723, 21)) {
                throw null;
            } else if (llllIlIIlIII(this.. ()) &&llllIlIIlIII(var1.canEntityBeSeen(this..player))){
                return false;
            } else if (llllIlIIIlII(77723, 21)) {
                throw null;
            } else if (llllIlIIlIII(this.. ()) &&llllIlIIllII(var1.isInvisible())){
                return false;
            } else if (llllIlIIIlII(77723, 21)) {
                throw null;
            } else if (llllIlIIllII(this.. ()) &&llllIlIIllII(var1 instanceof EntityPlayer)){
                if (llllIlIIlIII(Class73..                                                                                                    .
                (var1.getName()))){
                    return true;
                } else if (llllIlIIIlII(77723, 21)) {
                    throw null;
                } else {
                    return false;
                }
            } else if (llllIlIIIlII(77723, 21)) {
                throw null;
            } else if (llllIlIIlIII(var1 instanceof EntityAnimal) && llllIlIIlIII(var1 instanceof EntityVillager) && llllIlIIlIII(var1 instanceof EntitySquid) && !llllIlIIllII(var1 instanceof EntityBat)) {
                if (llllIlIIIlII(77723, 21)) {
                    throw null;
                } else if (llllIlIIlIII(var1 instanceof EntityMob) && llllIlIIlIII(var1 instanceof EntitySlime) && llllIlIIlIII(var1 instanceof EntityGhast) && !llllIlIIllII(var1 instanceof EntityShulker)) {
                    if (llllIlIIIlII(77723, 21)) {
                        throw null;
                    } else {
                        return false;
                    }
                } else if (llllIlIIIlII(77723, 21)) {
                    throw null;
                } else {
                    return this.                                                                                .();
                }
            } else if (llllIlIIIlII(77723, 21)) {
                throw null;
            } else {
                return this.                                                                                                  .
                ();
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        this. (this.. ());
        Phase var10000 = var1.phase;
        String var10001 = this.                                                                                     .();
        String var10002 = Class60. ("Wzmhw#");
        if (llllIlIIIlII(97471, 5405)) {
            throw null;
        } else {
            Phase var6;
            boolean var8;
            if (llllIlIIllII(var10001.equals(var10002))) {
                var6 = Phase.END;
                var8 = true;
            } else {
                if (llllIlIIIlII(97471, 5405)) {
                    throw null;
                }

                var6 = Phase.START;
            }

            if (llllIlIIIlII(97471, 5405)) {
                throw null;
            } else {
                boolean var11;
                if (llllIlIIllll(var10000, var6)) {
                    var11 = true;
                } else if (llllIlIIIlII(97471, 5405)) {
                    throw null;
                } else {
                    EntityPlayerSP var3;
                    byte var4;
                    label149:
                    {
                        label150:
                        {
                            var3 = this.                                                                                                    .
                            player;
                            var3.rotationYaw += 0.001F;
                            if (llllIlIlIIIl()) {
                                var4 = this. ();
                                if (llllIlIIIlII(97471, 5405)) {
                                    throw null;
                                }

                                if (!llllIlIIllII(var4)) {
                                    break label150;
                                }
                            }

                            if (llllIlIIIlII(97471, 5405)) {
                                throw null;
                            }

                            if (llllIlIlIIIl()) {
                                String var5 = this.                                                                              .
                                ();
                                var10001 = Class60. ("Ilpn}3");
                                if (llllIlIIIlII(97471, 5405)) {
                                    throw null;
                                }

                                if (!llllIlIIllII(var5.equals(var10001))) {
                                    break label149;
                                }
                            }
                        }

                        if (llllIlIIIlII(97471, 5405)) {
                            throw null;
                        }

                        Entity var7 = this. ();
                        if (llllIlIIIlII(97471, 5405)) {
                            throw null;
                        }

                                                                                                                 =
                        (EntityLivingBase) var7;
                    }

                    if (llllIlIIIlII(97471, 5405)) {
                        throw null;
                    } else if (llllIlIIIlll()) {
                        var11 = true;
                    } else if (llllIlIIIlII(97471, 5405)) {
                        throw null;
                    } else {
                        if (llllIlIIllII(this.. ()) &&llllIlIIllII(this. ())){
                            this.                                                                                                    .
                            player.jump();
                            this.                                                                                         .
                            ();
                        }

                        if (llllIlIIIlII(97471, 5405)) {
                            throw null;
                        } else if (llllIlIIlIII(this. ())){
                            var11 = true;
                        } else if (llllIlIIIlII(97471, 5405)) {
                            throw null;
                        } else {
                            if (llllIlIIllII(this.. ()) &&
                            llllIlIIllII(this..player.getHeldItemOffhand().getItem() instanceof ItemShield) &&
                            llllIlIIlIIl(this..player.getActiveHand(), EnumHand.OFF_HAND)){
                                CPacketPlayerDigging var9 = new CPacketPlayerDigging;
                                net.minecraft.network.play.client.CPacketPlayerDigging.Action var10003 = net.minecraft.network.play.client.CPacketPlayerDigging.Action.RELEASE_USE_ITEM;
                                BlockPos var10004 = new BlockPos(-1, -1, -1);
                                if (llllIlIIIlII(97471, 5405)) {
                                    throw null;
                                }

                                var9.<init> (var10003, var10004, this.                                                                                                    .
                                player.getHorizontalFacing());
                                if (llllIlIIIlII(97471, 5405)) {
                                    throw null;
                                }

                                this. ((Packet) var9);
                            }

                            if (llllIlIIIlII(97471, 5405)) {
                                throw null;
                            } else {
                                boolean var10;
                                if (llllIlIIllII(this.. ()) &&llllIlIIllII(this..player.isSprinting())){
                                    var4 = 1;
                                    var10 = true;
                                } else{
                                    if (llllIlIIIlII(97471, 5405)) {
                                        throw null;
                                    }

                                    var4 = 0;
                                }

                                if (llllIlIIIlII(97471, 5405)) {
                                    throw null;
                                } else {
                                    byte var2 = var4;
                                    var3 = this.                                                                                                    .
                                    player;
                                    if (llllIlIIllII(var2)) {
                                        var10 = false;
                                        var8 = true;
                                    } else {
                                        if (llllIlIIIlII(97471, 5405)) {
                                            throw null;
                                        }

                                        var10 = this.                                                                                                    .
                                        player.isSprinting();
                                    }

                                    if (llllIlIIIlII(97471, 5405)) {
                                        throw null;
                                    } else {
                                        var3.setSprinting(var10);
                                        this. (8L);
                                        CPacketUseEntity var12 = new CPacketUseEntity();
                                        if (llllIlIIIlII(97471, 5405)) {
                                            throw null;
                                        } else {
                                            this. ((Packet) var12);
                                            this.                                                                                                    .
                                            player.swingArm(EnumHand.MAIN_HAND);
                                            this.                                                                                                    .
                                            player.resetCooldown();
                                            var11 = true;
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
