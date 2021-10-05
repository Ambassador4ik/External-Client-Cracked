import java.util.Iterator;
import java.util.List;

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
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class Class88 extends Class171 {
    public Class220;
    public Class220;
    private static int 3179=19335;
    private static int 40257=-29662;
    private static int 6844=23739;
    public Class220;
    public Class220;
    private static int 93583=-17893;
    public Class220;
    private static int 64125=-3446;
    private static int 94548=-5365;
    public Class220;
    private static int 9894=28983;
    public Class220;
    public Class220;
    public Class220;
    private static int 232=17542;
    public Class220;
    private static int 5438=31223;
    public Class220;
    private static int 84465=-5382;

    static {
        boolean var10000 = true;
    }

    public Class88() {
        String var10013 = Class60. ("V\u007f4zR6cd?\u007fo7/");
        if (llllllIlIIII(93583, 232)) {
            throw null;
        } else {
            super(var10013, 1, Class188.);
            if (llllllIlIIII(93583, 232)) {
                throw null;
            } else {
                Class220 var9 = new Class220;
                String var10015 = Class60. ("@su7cy~7Px<{\"");
                if (llllllIlIIII(93583, 232)) {
                    throw null;
                } else {
                    var9.<init> (var10015, 2, this, true);
                    if (llllllIlIIII(93583, 232)) {
                        throw null;
                    } else {
                        this. = var9;
                        Class220 var10012 = new Class220;
                        String var10014 = Class60. ("@~4~\u007fs0Sz6pv\"");
                        if (llllllIlIIII(93583, 232)) {
                            throw null;
                        } else {
                            var10012.<init> (var10014, 3, this, false);
                            if (llllllIlIIII(93583, 232)) {
                                throw null;
                            } else {
                                this. = var10012;
                                Class220 var10011 = new Class220;
                                var10013 = Class60. ("D~3X}1cr8~#");
                                if (llllllIlIIII(93583, 232)) {
                                    throw null;
                                } else {
                                    var10011.<init> (var10013, 4, this, false);
                                    if (llllllIlIIII(93583, 232)) {
                                        throw null;
                                    } else {
                                        this. = var10011;
                                        Class220 var10010 = new Class220;
                                        String var8 = Class60. ("L~9hjr~:s7");
                                        if (llllllIlIIII(93583, 232)) {
                                            throw null;
                                        } else {
                                            var10010.<init> (var8, 64, this, false);
                                            if (llllllIlIIII(93583, 232)) {
                                                throw null;
                                            } else {
                                                this. = var10010;
                                                Class220 var10009 = new Class220;
                                                String var7 = Class60. ("^x4aze0~}z<r(");
                                                if (llllllIlIIII(93583, 232)) {
                                                    throw null;
                                                } else {
                                                    var10009.<init> (var7, 5, this, false);
                                                    if (llllllIlIIII(93583, 232)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10009;
                                                        Class220 var10008 = new Class220;
                                                        String var6 = Class60. ("C~q3nwf3(");
                                                        if (llllllIlIIII(93583, 232)) {
                                                            throw null;
                                                        } else {
                                                            var10008.<init> (var6, 65, this, true);
                                                            if (llllllIlIIII(93583, 232)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10008;
                                                                Class220 var10007 = new Class220;
                                                                String var5 = Class60. ("R|y3zsx3(");
                                                                if (llllllIlIIII(93583, 232)) {
                                                                    throw null;
                                                                } else {
                                                                    var10007.<init> (var5, 66, this, false);
                                                                    if (llllllIlIIII(93583, 232)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var10007;
                                                                        Class220 var10006 = new Class220;
                                                                        String var4 = Class60. ("^}0}df4v)");
                                                                        if (llllllIlIIII(93583, 232)) {
                                                                            throw null;
                                                                        } else {
                                                                            var10006.<init> (var4, 67, this, false);
                                                                            if (llllllIlIIII(93583, 232)) {
                                                                                throw null;
                                                                            } else {
                                                                                this. = var10006;
                                                                                Class220 var10005 = new Class220;
                                                                                String var3 = Class60. ("N|?r\u007f=>");
                                                                                if (llllllIlIIII(93583, 232)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var10005.<init>
                                                                                    (var3, 9, this, 4.0D, 3.0D, 6.0D, false)
                                                                                    ;
                                                                                    if (llllllIlIIII(93583, 232)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this. = var10005;
                                                                                        Class220 var10004 = new Class220;
                                                                                        String var2 = Class60. ("]:w-");
                                                                                        if (llllllIlIIII(93583, 232)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            var10004.<init>
                                                                                            (var2, 10, this, 100.0D, 20.0D, 180.0D, 10.0D, true)
                                                                                            ;
                                                                                            if (llllllIlIIII(93583, 232)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                this. = var10004;
                                                                                                Class220 var10003 = new Class220;
                                                                                                String var1 = Class60.
                                                                                                ("Lnyz?");
                                                                                                if (llllllIlIIII(93583, 232)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var10003.<init>
                                                                                                    (var1, 11, this, 40.0D, 20.0D, 360.0D, 5.0D, true)
                                                                                                    ;
                                                                                                    if (llllllIlIIII(93583, 232)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        this. = var10003;
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
                                                                                                        this.
                                                                                                        (new Class220[]{this.});
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

    private static boolean llllllIIlllI(int var0) {
        return var0 <= 0;
    }

    private static boolean llllllIIllII(int var0) {
        return var0 >= 0;
    }

    private static boolean llllllIlIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllllIlIIll(Object var0) {
        return var0 == null;
    }

    private static boolean llllllIlIlII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llllllIIlIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llllllIIlIIl(Object var0) {
        return var0 != null;
    }

    private static boolean llllllIIlIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llllllIIllIl(int var0) {
        return var0 == 0;
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        double var2;
        double var3;
        if (llllllIIlIIl(var1) && llllllIIlIlI(var1 instanceof EntityLivingBase) && llllllIIlIll(var1, this..field_71439_g) &&
        llllllIIlIlI(var1.func_70089_S()) && llllllIIllII((var2 = (double) this..field_71439_g.func_70032_d(var1) - 0.5D) == 0.0D ? 0 : (var2 < 0.0D ? -1 : 1)) &&
        llllllIIllIl(var1 instanceof EntityArmorStand) && llllllIIlllI((var3 = (double) this..field_71439_g.func_70032_d(var1) - this..
        ()) ==0.0D ? 0 : (var3 < 0.0D ? -1 : 1))){
            byte var10000 = Class13. (this..field_71439_g, var1, (float) this.                                                                                                  .
            ());
            if (llllllIlIIII(64125, 5438)) {
                throw null;
            }

            if (llllllIIlIlI(var10000) && (!llllllIIlIlI(var1 instanceof EntityPlayer) || llllllIIllIl(Class73...
            (var1.func_70005_c_())))){
                if (llllllIlIIII(64125, 5438)) {
                    throw null;
                }

                if (llllllIIlIlI(((EntityLivingBase) var1).func_70685_l(this..field_71439_g)) &&
                !llllllIIllIl(this..field_71415_G)){
                    if (llllllIlIIII(64125, 5438)) {
                        throw null;
                    }

                    if (llllllIIlIlI(var1 instanceof EntityPlayer) && llllllIIlIlI(var1.func_82150_aj())) {
                        return this.                                                                                                   .
                        ();
                    }

                    if (llllllIlIIII(64125, 5438)) {
                        throw null;
                    }

                    if (llllllIIlIlI(var1 instanceof EntityPlayer)) {
                        return this.                                                                                  .
                        ();
                    }

                    if (llllllIlIIII(64125, 5438)) {
                        throw null;
                    }

                    if (llllllIIllIl(var1 instanceof EntityAnimal) && llllllIIllIl(var1 instanceof EntityVillager) && llllllIIllIl(var1 instanceof EntitySquid) && !llllllIIlIlI(var1 instanceof EntityBat)) {
                        if (llllllIlIIII(64125, 5438)) {
                            throw null;
                        }

                        if (llllllIIllIl(var1 instanceof EntityMob) && llllllIIllIl(var1 instanceof EntitySlime) && !llllllIIlIlI(var1 instanceof EntityGhast)) {
                            if (llllllIlIIII(64125, 5438)) {
                                throw null;
                            }

                            return true;
                        }

                        if (llllllIlIIII(64125, 5438)) {
                            throw null;
                        }

                        return this.                                                                                    .
                        ();
                    }

                    if (llllllIlIIII(64125, 5438)) {
                        throw null;
                    }

                    return this.                                                                            .();
                }
            }
        }

        if (llllllIlIIII(64125, 5438)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        List var2 = this.                                                                                                    .
        field_71441_e.field_72996_f;
        Class84 var10002 = new Class84(this);
        if (llllllIlIIII(40257, 9894)) {
            throw null;
        } else {
            var2.sort(var10002);
            Iterator var5 = var2.iterator();

            while (!llllllIlIIII(40257, 9894)) {
                boolean var7;
                if (!llllllIIlIlI(var5.hasNext())) {
                    if (llllllIlIIII(40257, 9894)) {
                        throw null;
                    }

                    var7 = true;
                    return;
                }

                Entity var3;
                if (llllllIIlIIl(var3 = (Entity) var5.next())) {
                    byte var10000 = this. (var3);
                    if (llllllIlIIII(40257, 9894)) {
                        throw null;
                    }

                    if (llllllIIlIlI(var10000)) {
                        label93:
                        {
                            Item var4 = this.                                                                                                    .
                            field_71439_g.func_184614_ca().func_77973_b();
                            if (!llllllIIlIlI(this.. ()) ||llllllIlIIll(this..field_71476_x.field_72308_g)){
                            if (llllllIlIIII(40257, 9894)) {
                                throw null;
                            }

                            if (!llllllIIlIlI(this.. ()) ||
                            !llllllIIllIl(var4 instanceof ItemAxe) || llllllIIlIlI(var4 instanceof ItemSword)){
                                if (llllllIlIIII(40257, 9894)) {
                                    throw null;
                                }

                                if (!llllllIIlIlI(this.. ())){
                                    break label93;
                                }

                                var10000 = Class13. (0.9F);
                                if (llllllIlIIII(40257, 9894)) {
                                    throw null;
                                }

                                if (!llllllIIlIlI(var10000)) {
                                    break label93;
                                }
                            }
                        }

                            if (llllllIlIIII(40257, 9894)) {
                                throw null;
                            }

                            var7 = true;
                            return;
                        }

                        if (llllllIlIIII(40257, 9894)) {
                            throw null;
                        }

                        float[] var8 = Class13. (var3, (float) this.                                                                                           .
                        () / 25.0F);
                        if (llllllIlIIII(40257, 9894)) {
                            throw null;
                        }

                        float[] var6 = var8;
                        if (llllllIlIlII(var1.phase, Phase.END)) {
                            this.                                                                                                    .
                            field_71439_g.field_70177_z = var6[0];
                            var7 = true;
                        }
                    }
                }
            }

            throw null;
        }
    }
}
