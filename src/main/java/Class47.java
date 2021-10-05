import java.awt.Color;
import java.util.Iterator;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import org.lwjgl.opengl.GL11;

public class Class47 extends Class171 {
    private static int 8952=10678;
    private static int 18437=-30602;
    public Class220;
    private static int 48004=-22544;
    private static int 43079=-19067;
    private static int 2172=30580;
    public boolean;
    private static int 41080=-25192;
    private static int 43542=-12920;
    private static int 9286=32374;
    public Class220;
    private static int 13697=-23972;
    private static int 9428=9374;
    private static int 9082=16014;
    public Class220;
    private static int 37294=-30601;
    public Class220;
    public Class220;
    private static int 7255=3295;
    public Class220;
    public Class220;
    private static int 6055=10396;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class47() {
        String var10001 = Class60. ("G`q3tw4a(");
        if (lllIIlIIIlII(43079, 9286)) {
            throw null;
        } else {
            super(var10001, 18, Class188.);
            if (lllIIlIIIlII(43079, 9286)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Yt9vq)");
                if (lllIIlIIIlII(43079, 9286)) {
                    throw null;
                } else {
                    String[] var10006 = new String[4];
                    String var10009 = Class60. ("Ynjnq6");
                    if (lllIIlIIIlII(43079, 9286)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("R~xvj3");
                        if (lllIIlIIIlII(43079, 9286)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var10009 = Class60. ("O\u007fy6");
                            if (lllIIlIIIlII(43079, 9286)) {
                                throw null;
                            } else {
                                var10006[2] = var10009;
                                var10009 = Class60. ("_sko~t\u007f>");
                                if (lllIIlIIIlII(43079, 9286)) {
                                    throw null;
                                } else {
                                    var10006[3] = var10009;
                                    var1.<init> (var10003, 148, this, var10006);
                                    if (lllIIlIIIlII(43079, 9286)) {
                                        throw null;
                                    } else {
                                        this. = var1;
                                        Class220 var8 = new Class220;
                                        String var10011 = Class60. ("Ynj:jtp:Qt1vy)");
                                        if (lllIIlIIIlII(43079, 9286)) {
                                            throw null;
                                        } else {
                                            var8.<init> (var10011, this, 3.0D);
                                            if (lllIIlIIIlII(43079, 9286)) {
                                                throw null;
                                            } else {
                                                this. = var8;
                                                Class220 var10008 = new Class220;
                                                String var10010 = Class60. ("C~0rn2qa(");
                                                if (lllIIlIIIlII(43079, 9286)) {
                                                    throw null;
                                                } else {
                                                    var10008.<init> (var10010, 73, this, true);
                                                    if (lllIIlIIIlII(43079, 9286)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10008;
                                                        Class220 var10007 = new Class220;
                                                        var10009 = Class60. ("^xb7zey7}zy7(");
                                                        if (lllIIlIIIlII(43079, 9286)) {
                                                            throw null;
                                                        } else {
                                                            var10007.<init> (var10009, 36, this, true);
                                                            if (lllIIlIIIlII(43079, 9286)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10007;
                                                                Class220 var4 = new Class220;
                                                                String var7 = Class60. ("Ztq;r{p(");
                                                                if (lllIIlIIIlII(43079, 9286)) {
                                                                    throw null;
                                                                } else {
                                                                    var4.<init> (var7, 74, this, false);
                                                                    if (lllIIlIIIlII(43079, 9286)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var4;
                                                                        Class220 var10005 = new Class220;
                                                                        String var6 = Class60. ("Vuv;lny)");
                                                                        if (lllIIlIIIlII(43079, 9286)) {
                                                                            throw null;
                                                                        } else {
                                                                            var10005.<init> (var6, 75, this, false);
                                                                            if (lllIIlIIIlII(43079, 9286)) {
                                                                                throw null;
                                                                            } else {
                                                                                this. = var10005;
                                                                                Class220 var10004 = new Class220;
                                                                                String var5 = Class60. ("Zov<}s?");
                                                                                if (lllIIlIIIlII(43079, 9286)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var10004.<init>
                                                                                    (var5, 81, this, true);
                                                                                    if (lllIIlIIIlII(43079, 9286)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this. = var10004;
                                                                                        Class220 var2 = new Class220;
                                                                                        String var3 = Class60.
                                                                                        ("Qd}r3xtTp6px)");
                                                                                        if (lllIIlIIIlII(43079, 9286)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            var2.<init>
                                                                                            (var3, this, 41.0D);
                                                                                            if (lllIIlIIIlII(43079, 9286)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                this. = var2;
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

    private static boolean lllIIIllllll(Object var0) {
        return var0 != null;
    }

    private static boolean lllIIlIIIIII(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIlIIlIII(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIIlIIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlIIIIlI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIIlIIIllI(int var0) {
        return var0 != 0;
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        String var10000 = this.                                                                                         .
        ();
        String var10001 = Class60. ("Ynjnq6");
        if (lllIIlIIIlII(48004, 2172)) {
            throw null;
        } else {
            Entity var10;
            boolean var11;
            if (lllIIlIIIllI(var10000.equals(var10001))) {
                var10 = var1;
                this.                                                                                           .(this..
                ());
                var11 = true;
            } else {
                if (lllIIlIIIlII(48004, 2172)) {
                    throw null;
                }

                var10000 = this.                                                                                         .
                ();
                var10001 = Class60. ("R~xvj3");
                if (lllIIlIIIlII(48004, 2172)) {
                    throw null;
                }

                if (lllIIlIIIllI(var10000.equals(var10001))) {
                    EntityLivingBase var2 = (EntityLivingBase) var1;
                    var10 = var1;
                    double var3 = (double) (var2.func_110143_aJ() / 2.0F);
                    double var5 = (double) (var2.func_110138_aP() / 2.0F);
                    float var7 = (float) (100.0D * var3 / var5) / 50.0F;
                    GL11.glColor4f(2.0F - var7, var7, 0.0F, 1.0F);
                    if (lllIIlIIIlII(48004, 2172)) {
                        throw null;
                    }

                    var11 = true;
                } else {
                    if (lllIIlIIIlII(48004, 2172)) {
                        throw null;
                    }

                    var10000 = this.                                                                                         .
                    ();
                    var10001 = Class60. ("O\u007fy6");
                    if (lllIIlIIIlII(48004, 2172)) {
                        throw null;
                    }

                    if (lllIIlIIIllI(var10000.equals(var10001))) {
                        if (lllIIlIIIllI(var1 instanceof EntityPlayer)) {
                            Color var12 = new Color;
                            FontRenderer var10002 = this.                                                                                                    .
                            field_71466_p;
                            char var10003 = Class13. ((EntityPlayer) var1);
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }

                            var12.<init> (var10002.func_175064_b(var10003));
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }

                            Color var8 = var12;
                            var10 = var1;
                            GL11.glColor4f((float) var8.getRed() / 255.0F, (float) var8.getGreen() / 255.0F, (float) var8.getBlue() / 255.0F, 1.0F);
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }

                            var11 = true;
                        } else {
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }

                            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }

                            var10 = var1;
                            var11 = true;
                        }
                    } else {
                        if (lllIIlIIIlII(48004, 2172)) {
                            throw null;
                        }

                        var10000 = this.                                                                                         .
                        ();
                        var10001 = Class60. ("_sko~t\u007f>");
                        if (lllIIlIIIlII(48004, 2172)) {
                            throw null;
                        }

                        if (lllIIlIIIllI(var10000.equals(var10001))) {
                            float var9 = this.                                                                                                    .
                            field_71439_g.func_70032_d(var1) / 25.0F;
                            GL11.glColor4f(2.0F - var9, var9, 0.0F, 1.0F);
                            if (lllIIlIIIlII(48004, 2172)) {
                                throw null;
                            }
                        }

                        if (lllIIlIIIlII(48004, 2172)) {
                            throw null;
                        }

                        var10 = var1;
                    }
                }
            }

            if (lllIIlIIIlII(48004, 2172)) {
                throw null;
            } else {
                if (lllIIlIIIllI(var10 instanceof EntityPlayer) && lllIIlIIIllI(Class73..                                                                                                    .
                (var1.func_70005_c_()))){
                    this.                                                                                           .
                    (this.. (), 1.0F);
                }

                if (lllIIlIIIlII(48004, 2172)) {
                    throw null;
                } else {
                    boolean var13 = true;
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        Class220 var10000 = this.;
        String var10001 = this.                                                                                         .
        ();
        String var10002 = Class60. ("Ynjnq6");
        if (lllIIlIIIlII(37294, 9082)) {
            throw null;
        } else {
            var10000. (var10001.equals(var10002));
            boolean var2 = true;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        if (lllIIIllllll(var1) && lllIIlIIIIII(var1 instanceof EntityArmorStand) && lllIIlIIIIII(var1.field_70128_L) && !lllIIlIIIIlI(var1, this..field_71439_g))
        {
            if (lllIIlIIIlII(18437, 6055)) {
                throw null;
            } else {
                if (lllIIlIIIllI(var1 instanceof EntityPlayer)) {
                    int var10000 = Class123. ((EntityPlayer) var1);
                    if (lllIIlIIIlII(18437, 6055)) {
                        throw null;
                    }

                    if (lllIIlIIlIII(var10000, -1)) {
                        return false;
                    }
                }

                if (lllIIlIIIlII(18437, 6055)) {
                    throw null;
                } else if (lllIIlIIIllI(Class73..                                                                                                    .
                (var1.func_70005_c_())) &&lllIIlIIIIII(this.. ())){
                    return false;
                } else if (lllIIlIIIlII(18437, 6055)) {
                    throw null;
                } else if (lllIIlIIIllI(var1 instanceof EntityPlayer)) {
                    return this.                                                                                            .
                    ();
                } else if (lllIIlIIIlII(18437, 6055)) {
                    throw null;
                } else if (lllIIlIIIIII(var1 instanceof EntityAnimal) && lllIIlIIIIII(var1 instanceof EntityVillager) && lllIIlIIIIII(var1 instanceof EntitySquid) && !lllIIlIIIllI(var1 instanceof EntityBat)) {
                    if (lllIIlIIIlII(18437, 6055)) {
                        throw null;
                    } else if (lllIIlIIIIII(var1 instanceof EntityMob) && lllIIlIIIIII(var1 instanceof EntitySlime) && !lllIIlIIIllI(var1 instanceof EntityGhast)) {
                        if (lllIIlIIIlII(18437, 6055)) {
                            throw null;
                        } else if (lllIIlIIIllI(var1.func_82150_aj()) && lllIIlIIIIII(this.. ())){
                            return false;
                        } else if (lllIIlIIIlII(18437, 6055)) {
                            throw null;
                        } else {
                            return false;
                        }
                    } else if (lllIIlIIIlII(18437, 6055)) {
                        throw null;
                    } else {
                        return this.                                                                                     .
                        ();
                    }
                } else if (lllIIlIIIlII(18437, 6055)) {
                    throw null;
                } else {
                    return this.                                                                            .();
                }
            }
        } else if (lllIIlIIIlII(18437, 6055)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        this. = this.                                                                                                    .
        field_71474_y.field_74336_f;
        this.                                                                                                    .
        field_71474_y.field_74336_f = false;
        Class22. (var1.getPartialTicks(), 2);
        if (lllIIlIIIlII(41080, 7255)) {
            throw null;
        } else {
            this.                                                                                                    .
            field_71474_y.field_74336_f = this.;
            GL11.glPushMatrix();
            if (lllIIlIIIlII(41080, 7255)) {
                throw null;
            } else {
                GL11.glDisable(3553);
                if (lllIIlIIIlII(41080, 7255)) {
                    throw null;
                } else {
                    GL11.glBlendFunc(770, 771);
                    if (lllIIlIIIlII(41080, 7255)) {
                        throw null;
                    } else {
                        GL11.glEnable(2848);
                        if (lllIIlIIIlII(41080, 7255)) {
                            throw null;
                        } else {
                            GL11.glEnable(3042);
                            if (lllIIlIIIlII(41080, 7255)) {
                                throw null;
                            } else {
                                GL11.glDisable(2929);
                                if (lllIIlIIIlII(41080, 7255)) {
                                    throw null;
                                } else {
                                    GL11.glLineWidth(1.5F);
                                    if (lllIIlIIIlII(41080, 7255)) {
                                        throw null;
                                    } else {
                                        RenderManager var2 = this.                                                                                                    .
                                        func_175598_ae();
                                        Vec3d var3 = this.                                                                                                    .
                                        field_71439_g.func_70040_Z().func_72441_c(0.0D, (double) this..field_71439_g.func_70047_e(), 0.0D)
                                        ;
                                        Iterator var4 = this.                                                                                                    .
                                        field_71441_e.func_72910_y().iterator();

                                        while (!lllIIlIIIlII(41080, 7255)) {
                                            boolean var9;
                                            if (!lllIIlIIIllI(var4.hasNext())) {
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glEnable(2929);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glDisable(2848);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glDisable(3042);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glEnable(3553);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glPopMatrix();
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179117_G();
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                Class22. (var1.getPartialTicks(), 2);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                var9 = true;
                                                return;
                                            }

                                            Entity var5 = (Entity) var4.next();
                                            byte var10000 = this. (var5);
                                            if (lllIIlIIIlII(41080, 7255)) {
                                                throw null;
                                            }

                                            if (lllIIlIIIllI(var10000)) {
                                                AxisAlignedBB var6 = var5.func_174813_aQ();
                                                Vec3d var8 = new Vec3d(var6.field_72340_a + (var6.field_72336_d - var6.field_72340_a) * 0.5D, var6.field_72338_b + (var6.field_72337_e - var6.field_72338_b) * 0.0D, var6.field_72339_c + (var6.field_72334_f - var6.field_72339_c) * 0.5D);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                Vec3d var10001 = new Vec3d(var5.field_70165_t, var5.field_70163_u, var5.field_70161_v);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                Vec3d var7;
                                                var8 = var7 = var8.func_178788_d(var10001.func_178786_a(var5.field_70169_q, var5.field_70167_r, var5.field_70166_s).func_186678_a((double) (1.0F - var1.getPartialTicks()))).func_72441_c(-var2.field_78730_l, -var2.field_78731_m, -var2.field_78728_n);
                                                this. (var5);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glBegin(1);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glVertex3d(var3.field_72450_a, var3.field_72448_b, var3.field_72449_c);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glVertex3d(var8.field_72450_a, var7.field_72448_b, var7.field_72449_c);
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                GL11.glEnd();
                                                if (lllIIlIIIlII(41080, 7255)) {
                                                    throw null;
                                                }

                                                var9 = true;
                                            }
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
