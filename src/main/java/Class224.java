import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import java.util.List;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class224 extends Class171 {
    private static int 4457=32457;
    private static int 88715=-18987;
    public Class220;
    private static int 1287=30918;
    private static int 3286=11771;
    private static int 97639=-13272;
    private static int 715=19141;
    private static int 920=27610;
    private static int 42860=-21771;
    private static int 63161=-26460;
    private static int 80240=-12310;
    public Class220;
    public Class220;
    private static int 5852=13144;
    private static int 42916=-3366;
    private static int 71906=-1165;
    public RayTraceResult;
    private static int 46438=-21363;
    public Class106;
    private static int 6779=25793;
    private static int 31988=-28695;
    private static int 90741=-6094;
    public Class220;
    private static int 95768=-31055;
    private static int 3678=30291;
    private static int 3836=17402;
    public Class220;
    private static int 55895=-28163;
    private static int 9066=9046;
    private static int 4452=8851;
    public Entity;
    private static int 8360=23941;
    private static int 2513=11016;
    public Class220;
    private static int 11584=-31344;

    static {
        boolean var10000 = true;
    }

    public Class224() {
        String var10001 = Class60. ("Ss8o]:s#");
        if (lllIlIIlIIlI(63161, 5852)) {
            throw null;
        } else {
            super(var10001, 4, Class188.);
            if (lllIlIIlIIlI(63161, 5852)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10003 = Class60. ("Rq<{>");
                if (lllIlIIlIIlI(63161, 5852)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("Jtluzq>");
                    if (lllIlIIlIIlI(63161, 5852)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Z|fzd{v\u007f>");
                        if (lllIlIIlIIlI(63161, 5852)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var1.<init> (var10003, 226, this, var10006);
                            if (lllIlIIlIIlI(63161, 5852)) {
                                throw null;
                            } else {
                                this. = var1;
                                Class220 var10007 = new Class220;
                                var10009 = Class60. ("^bh;~t<?");
                                if (lllIlIIlIIlI(63161, 5852)) {
                                    throw null;
                                } else {
                                    var10007.<init> (var10009, 15, this, 0.1D, 0.0D, 2.0D, false);
                                    if (lllIlIIlIIlI(63161, 5852)) {
                                        throw null;
                                    } else {
                                        this. = var10007;
                                        Class220 var4 = new Class220;
                                        String var10008 = Class60. ("^x4aze0~}z<r(");
                                        if (lllIlIIlIIlI(63161, 5852)) {
                                            throw null;
                                        } else {
                                            var4.<init> (var10008, 177, this, true);
                                            if (lllIlIIlIIlI(63161, 5852)) {
                                                throw null;
                                            } else {
                                                this. = var4;
                                                Class220 var10005 = new Class220;
                                                String var6 = Class60. ("C~q3nwf3(");
                                                if (lllIlIIlIIlI(63161, 5852)) {
                                                    throw null;
                                                } else {
                                                    var10005.<init> (var6, 178, this, true);
                                                    if (lllIlIIlIIlI(63161, 5852)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10005;
                                                        Class220 var10004 = new Class220;
                                                        String var5 = Class60. ("R|y3zsx3(");
                                                        if (lllIlIIlIIlI(63161, 5852)) {
                                                            throw null;
                                                        } else {
                                                            var10004.<init> (var5, 179, this, false);
                                                            if (lllIlIIlIIlI(63161, 5852)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10004;
                                                                Class220 var2 = new Class220;
                                                                String var3 = Class60. ("^}0}df4v)");
                                                                if (lllIlIIlIIlI(63161, 5852)) {
                                                                    throw null;
                                                                } else {
                                                                    var2.<init> (var3, 180, this, false);
                                                                    if (lllIlIIlIIlI(63161, 5852)) {
                                                                        throw null;
                                                                    } else {
                                                                        this. = var2;
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                                        this. ((Class220[]) (new Class220[]{this.}));
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

    private static boolean lllIlIIllIII(int var0) {
        return var0 >= 0;
    }

    private static boolean lllIlIIlIlII(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllIlIIlIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIIlIIll(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlIIlIlll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIlIIllIlI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIlIIlIllI(Object var0) {
        return var0 != null;
    }

    private static boolean lllIlIIlIlIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllIlIIllIIl(Object var0) {
        return var0 == null;
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        if (!lllIlIIlIIll(var1.isEntityAlive()) || !lllIlIIlIlII(var1, this..player) ||
        lllIlIIlIlIl(var1 instanceof EntityLivingBase) && (!lllIlIIlIIll(var1 instanceof EntityPlayer) || lllIlIIlIlIl(Class73...
        (var1.getName())))){
            if (lllIlIIlIIlI(80240, 1287)) {
                throw null;
            } else {
                return false;
            }
        } else if (lllIlIIlIIlI(80240, 1287)) {
            throw null;
        } else if (lllIlIIlIIll(var1 instanceof EntityPlayer) && lllIlIIlIIll(var1.isInvisible()) && lllIlIIlIlIl(Class73..                                                                                                    .
        (var1.getName()))){
            return this.                                                                                                  .
            ();
        } else if (lllIlIIlIIlI(80240, 1287)) {
            throw null;
        } else if (lllIlIIlIIll(var1 instanceof EntityPlayer) && lllIlIIlIlIl(Class73..                                                                                                    .
        (var1.getName()))){
            return this.                                                                              .();
        } else if (lllIlIIlIIlI(80240, 1287)) {
            throw null;
        } else if (lllIlIIlIlIl(var1 instanceof EntityAnimal) && lllIlIIlIlIl(var1 instanceof EntityVillager) && lllIlIIlIlIl(var1 instanceof EntitySquid) && !lllIlIIlIIll(var1 instanceof EntityBat)) {
            if (lllIlIIlIIlI(80240, 1287)) {
                throw null;
            } else if (lllIlIIlIlIl(var1 instanceof EntityMob) && lllIlIIlIlIl(var1 instanceof EntitySlime) && !lllIlIIlIIll(var1 instanceof EntityGhast)) {
                if (lllIlIIlIIlI(80240, 1287)) {
                    throw null;
                } else {
                    return false;
                }
            } else if (lllIlIIlIIlI(80240, 1287)) {
                throw null;
            } else {
                return this.                                                                                            .
                ();
            }
        } else if (lllIlIIlIIlI(80240, 1287)) {
            throw null;
        } else {
            return this.                                                                            .();
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (lllIlIIlIIlI(95768, 4452)) {
            throw null;
        } else {
            boolean var10000;
            if (lllIlIIlIIll(this. ())){
                var10000 = true;
            } else if (lllIlIIlIIlI(95768, 4452)) {
                throw null;
            } else {
                this.                                                                                                    .
                world.loadedEntityList.forEach(this::);
                var10000 = true;
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1) {
        boolean var22;
        if (lllIlIIlIllI(this..getRenderViewEntity()) &&lllIlIIlIllI(this..world)){
            this.                                                                                                    .
            pointedEntity = null;
            double var10000;
            boolean var10001;
            if (lllIlIIlIIll(this.. ())){
                var10000 = this.                                                                                         .                                                                              .
                ();
                var10001 = true;
            } else{
                if (lllIlIIlIIlI(97639, 9066)) {
                    throw null;
                }

                var10000 = 3.1D;
            }

            if (lllIlIIlIIlI(97639, 9066)) {
                throw null;
            }

            double var3 = var10000;
            this. = this.                                                                                                    .
            getRenderViewEntity().rayTrace(var3, 1.0F);
            double var5 = var3;
            Vec3d var7 = this.                                                                                                    .
            getRenderViewEntity().getPositionEyes(1.0F);
            if (lllIlIIlIllI(this.)) {
                var5 = this.                                                                                     .
                hitVec.distanceTo(var7);
            }

            if (lllIlIIlIIlI(97639, 9066)) {
                throw null;
            }

            Vec3d var8 = this.                                                                                                    .
            getRenderViewEntity().getLook(1.0F);
            Vec3d var9 = var7.add(var8.x * var3, var8.y * var3, var8.z * var3);
            this. = null;
            Vec3d var10 = null;
            WorldClient var18 = this.                                                                                                    .
            world;
            Entity var19 = this.                                                                                                    .
            getRenderViewEntity();
            AxisAlignedBB var10002 = this.                                                                                                    .
            getRenderViewEntity().getEntityBoundingBox().expand(var8.x * var3, var8.y * var3, var8.z * var3);
            Predicate var10003 = EntitySelectors.NOT_SPECTATING;
            Class135 var10004 = new Class135(this);
            if (lllIlIIlIIlI(97639, 9066)) {
                throw null;
            }

            var10003 = Predicates.and(var10003, var10004);
            if (lllIlIIlIIlI(97639, 9066)) {
                throw null;
            }

            List var16 = var18.getEntitiesInAABBexcluding(var19, var10002, var10003);
            var3 = var5;
            int var11;
            int var20 = var11 = 0;

            while (true) {
                if (lllIlIIlIIlI(97639, 9066)) {
                    throw null;
                }

                if (!lllIlIIlIlll(var20, var16.size())) {
                    if (lllIlIIlIIlI(97639, 9066)) {
                        throw null;
                    }

                    double var26;
                    if (lllIlIIlIllI(this.) && (!lllIlIIllIII((var26 = var3 - var5) == 0.0D ? 0 : (var26 < 0.0D ? -1 : 1)) || lllIlIIllIIl(this.))) {
                        if (lllIlIIlIIlI(97639, 9066)) {
                            throw null;
                        }

                        RayTraceResult var23 = new RayTraceResult(this., var10);
                        if (lllIlIIlIIlI(97639, 9066)) {
                            throw null;
                        }

                        this. = var23;
                        byte var25 = this. (this..entityHit);
                        if (lllIlIIlIIlI(97639, 9066)) {
                            throw null;
                        }

                        if (lllIlIIlIIll(var25)) {
                            this.                                                                                                    .
                            objectMouseOver = this.;
                            if (!lllIlIIlIlIl(this. instanceof EntityLivingBase) || lllIlIIlIIll(this. instanceof EntityItemFrame)) {
                                if (lllIlIIlIIlI(97639, 9066)) {
                                    throw null;
                                }

                                this.                                                                                                    .
                                pointedEntity = this.;
                            }
                        }
                    }
                    break;
                }

                Entity var12;
                if (lllIlIIlIIll((var12 = (Entity) var16.get(var11)).canBeCollidedWith())) {
                    float var13 = (float) var1;
                    AxisAlignedBB var21 = var12.getEntityBoundingBox().expand((double) var13, (double) var13, (double) var13).expand((double) (-var13), (double) (-var13), (double) (-var13));
                    RayTraceResult var17 = var21.calculateIntercept(var7, var9);
                    if (lllIlIIlIIll(var21.contains(var7))) {
                        double var27;
                        double var28;
                        if (!lllIlIIllIII((var27 = 0.0D - var3) == 0.0D ? 0 : (var27 < 0.0D ? -1 : 1)) || lllIlIIlIlIl((var28 = var3 - 0.0D) == 0.0D ? 0 : (var28 < 0.0D ? -1 : 1))) {
                            if (lllIlIIlIIlI(97639, 9066)) {
                                throw null;
                            }

                            this. = var12;
                            Vec3d var24;
                            if (lllIlIIllIIl(var17)) {
                                var24 = var7;
                                var10001 = true;
                            } else {
                                if (lllIlIIlIIlI(97639, 9066)) {
                                    throw null;
                                }

                                var24 = var17.hitVec;
                            }

                            if (lllIlIIlIIlI(97639, 9066)) {
                                throw null;
                            }

                            var10 = var24;
                            var3 = 0.0D;
                            var22 = true;
                        }
                    } else {
                        if (lllIlIIlIIlI(97639, 9066)) {
                            throw null;
                        }

                        double var14;
                        double var29;
                        double var30;
                        if (lllIlIIlIllI(var17) && (!lllIlIIllIII((var29 = (var14 = var7.distanceTo(var17.hitVec)) - var3) == 0.0D ? 0 : (var29 < 0.0D ? -1 : 1)) || lllIlIIlIlIl((var30 = var3 - 0.0D) == 0.0D ? 0 : (var30 < 0.0D ? -1 : 1)))) {
                            if (lllIlIIlIIlI(97639, 9066)) {
                                throw null;
                            }

                            if (lllIlIIllIlI(var12, this..getRenderViewEntity().getRidingEntity()) &&
                            lllIlIIlIlIl(var12.canRiderInteract())){
                                double var31;
                                if (lllIlIIlIlIl((var31 = var3 - 0.0D) == 0.0D ? 0 : (var31 < 0.0D ? -1 : 1))) {
                                    this. = var12;
                                    var10 = var17.hitVec;
                                    var22 = true;
                                }
                            } else{
                                if (lllIlIIlIIlI(97639, 9066)) {
                                    throw null;
                                }

                                this. = var12;
                                var10 = var17.hitVec;
                                var3 = var14;
                            }
                        }
                    }
                }

                if (lllIlIIlIIlI(97639, 9066)) {
                    throw null;
                }

                ++var11;
                var20 = var11;
                var10001 = true;
            }
        }

        if (lllIlIIlIIlI(97639, 9066)) {
            throw null;
        } else {
            var22 = true;
        }
    }

    private boolean ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1) {
        boolean var10000 = this. (var1);
        if (lllIlIIlIIlI(88715, 715)) {
            throw null;
        } else {
            return var10000;
        }
    }

    private void ____________________________________________________________________________/* $FF was:                                                                             */(Entity var1) {
        this. (var1, 0.0D);
        boolean var10000 = true;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        Class171 var10001 = Class133. (27);
        if (lllIlIIlIIlI(46438, 4457)) {
            throw null;
        } else {
            this. = (Class106) var10001;
            super. ();
            if (lllIlIIlIIlI(46438, 4457)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        String var10000 = this.                                                                                  .();
        String var10001 = Class60. ("Z|fzd{v\u007f>");
        if (lllIlIIlIIlI(90741, 8360)) {
            throw null;
        } else {
            if (lllIlIIlIIll(var10000.equals(var10001))) {
                this. (this.. ());
                if (lllIlIIlIIlI(90741, 8360)) {
                    throw null;
                }
            }

            if (lllIlIIlIIlI(90741, 8360)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        String var10001 = Class60. (">4)=");
        if (lllIlIIlIIlI(42916, 920)) {
            throw null;
        } else {
            Object[] var10002 = new Object[1];
            Double var10005 = this.                                                                                           .
            ();
            if (lllIlIIlIIlI(42916, 920)) {
                throw null;
            } else {
                var10002[0] = var10005;
                var10001 = String.format(var10001, var10002);
                if (lllIlIIlIIlI(42916, 920)) {
                    throw null;
                } else {
                    this. ((String) var10001);
                    String var10000 = this.                                                                                  .
                    ();
                    var10001 = Class60. ("Jtluzq>");
                    if (lllIlIIlIIlI(42916, 920)) {
                        throw null;
                    } else {
                        if (lllIlIIlIIll(var10000.equals(var10001))) {
                            this.                                                                                                    .
                            world.loadedEntityList.stream().filter(this::).forEach(this::);
                        }

                        if (lllIlIIlIIlI(42916, 920)) {
                            throw null;
                        } else {
                            boolean var2 = true;
                        }
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1, double var2) {
        double var4 = ((double) var1.width + var2) / 2.0D;
        var2 = (double) var1.height + var2 / 2.0D;
        AxisAlignedBB var10000 = new AxisAlignedBB(var1.posX - var4, var1.posY, var1.posZ - var4, var1.posX + var4, var1.posY + var2, var1.posZ + var4);
        if (lllIlIIlIIlI(42860, 3836)) {
            throw null;
        } else {
            var1.setEntityBoundingBox(var10000);
            boolean var6 = true;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        this. (var1, this.                                                                                           .())
        ;
        boolean var10000 = true;
    }
}
