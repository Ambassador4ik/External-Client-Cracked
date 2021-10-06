import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import java.util.List;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class106 extends Class171 {
    private RayTraceResult;
    private static int 64017=-26572;
    private static int 9504=3924;
    private Entity;
    private static int 5025=10737;
    public Class220;
    private static int 279=7649;
    private static int 41351=-12681;
    private static int 85441=-10463;
    private static int 6358=24458;
    private static int 3582=6566;
    private static int 79829=-24127;
    private static int 65866=-29616;
    private static int 7565=20677;
    private static int 64152=-18033;
    private static int 72479=-31871;
    public Class224;
    private static int 5449=17169;

    static {
        boolean var10000 = true;
    }

    public Class106() {
        String var10004 = Class60. ("Nx?}{=3");
        if (llIIIlIIIllI(72479, 9504)) {
            throw null;
        } else {
            super(var10004, 27, Class188.);
            if (llIIIlIIIllI(72479, 9504)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("^b8k~:r?");
                if (llIIIlIIIllI(72479, 9504)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 83, this, 3.4D, 3.1D, 6.0D, false);
                    if (llIIIlIIIllI(72479, 9504)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. ((Class220[]) (new Class220[]{this.}));
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llIIIlIllIll(Object var0) {
        return var0 == null;
    }

    private static boolean llIIIlIlIIIl(Object var0) {
        return var0 != null;
    }

    private static boolean llIIIlIIlIll(int var0) {
        return var0 != 0;
    }

    private static boolean llIIIlIllllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIIlIlIlII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIIlIlIlll(int var0) {
        return var0 >= 0;
    }

    private static boolean llIIIlIllIlI(int var0) {
        return var0 == 0;
    }

    private static boolean llIIIlIIIllI(int var0, int var1) {
        return var0 >= var1;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        String var10001 = Class60. (">4)=");
        if (llIIIlIIIllI(65866, 7565)) {
            throw null;
        } else {
            Object[] var10002 = new Object[1];
            Double var10005 = this.                                                                              .();
            if (llIIIlIIIllI(65866, 7565)) {
                throw null;
            } else {
                var10002[0] = var10005;
                var10001 = String.format(var10001, var10002);
                if (llIIIlIIIllI(65866, 7565)) {
                    throw null;
                } else {
                    this. (var10001);
                    boolean var10000 = true;
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, double var2) {
        boolean var18;
        if (llIIIlIlIIIl(this..getRenderViewEntity()) &&llIIIlIlIIIl(this..world)){
            this.                                                                                                    .
            pointedEntity = null;
            this. = this.                                                                                                    .
            getRenderViewEntity().rayTrace(var2, var1);
            double var5 = var2;
            Vec3d var7 = this.                                                                                                    .
            getRenderViewEntity().getPositionEyes(var1);
            if (llIIIlIlIIIl(this.)) {
                var5 = this.                                                                                  .
                hitVec.distanceTo(var7);
            }

            if (llIIIlIIIllI(41351, 5449)) {
                throw null;
            }

            Vec3d var14 = this.                                                                                                    .
            getRenderViewEntity().getLook(var1);
            Vec3d var8 = var7.add(var14.x * var2, var14.y * var2, var14.z * var2);
            this. = null;
            Vec3d var9 = null;
            WorldClient var10000 = this.                                                                                                    .
            world;
            Entity var10001 = this.                                                                                                    .
            getRenderViewEntity();
            AxisAlignedBB var10002 = this.                                                                                                    .
            getRenderViewEntity().getEntityBoundingBox().expand(var14.x * var2, var14.y * var2, var14.z * var2);
            Predicate var10003 = EntitySelectors.NOT_SPECTATING;
            Class205 var10004 = new Class205(this);
            if (llIIIlIIIllI(41351, 5449)) {
                throw null;
            }

            var10003 = Predicates.and(var10003, var10004);
            if (llIIIlIIIllI(41351, 5449)) {
                throw null;
            }

            List var15 = var10000.getEntitiesInAABBexcluding(var10001, var10002, var10003);
            var2 = var5;
            int var4;
            int var16 = var4 = 0;

            while (true) {
                if (llIIIlIIIllI(41351, 5449)) {
                    throw null;
                }

                if (!llIIIlIlIlII(var16, var15.size())) {
                    if (llIIIlIIIllI(41351, 5449)) {
                        throw null;
                    }

                    double var22;
                    if (llIIIlIlIIIl(this.) && (!llIIIlIlIlll((var22 = var2 - var5) == 0.0D ? 0 : (var22 < 0.0D ? -1 : 1)) || llIIIlIllIll(this.))) {
                        if (llIIIlIIIllI(41351, 5449)) {
                            throw null;
                        }

                        RayTraceResult var21 = new RayTraceResult(this., var9);
                        if (llIIIlIIIllI(41351, 5449)) {
                            throw null;
                        }

                        this. = var21;
                        this.                                                                                                    .
                        objectMouseOver = this.;
                        if (!llIIIlIllIlI(this. instanceof EntityLivingBase) || llIIIlIIlIll(this. instanceof EntityItemFrame)) {
                            if (llIIIlIIIllI(41351, 5449)) {
                                throw null;
                            }

                            this.                                                                                                    .
                            pointedEntity = this.;
                        }
                    }
                    break;
                }

                Entity var10;
                boolean var20;
                if (llIIIlIIlIll((var10 = (Entity) var15.get(var4)).canBeCollidedWith())) {
                    AxisAlignedBB var17 = var10.getEntityBoundingBox();
                    RayTraceResult var11 = var17.calculateIntercept(var7, var8);
                    if (llIIIlIIlIll(var17.contains(var7))) {
                        double var23;
                        double var24;
                        if (!llIIIlIlIlll((var23 = 0.0D - var2) == 0.0D ? 0 : (var23 < 0.0D ? -1 : 1)) || llIIIlIllIlI((var24 = var2 - 0.0D) == 0.0D ? 0 : (var24 < 0.0D ? -1 : 1))) {
                            if (llIIIlIIIllI(41351, 5449)) {
                                throw null;
                            }

                            this. = var10;
                            Vec3d var19;
                            if (llIIIlIllIll(var11)) {
                                var19 = var7;
                                var20 = true;
                            } else {
                                if (llIIIlIIIllI(41351, 5449)) {
                                    throw null;
                                }

                                var19 = var11.hitVec;
                            }

                            if (llIIIlIIIllI(41351, 5449)) {
                                throw null;
                            }

                            var9 = var19;
                            var2 = 0.0D;
                            var18 = true;
                        }
                    } else {
                        if (llIIIlIIIllI(41351, 5449)) {
                            throw null;
                        }

                        double var12;
                        double var25;
                        double var26;
                        if (llIIIlIlIIIl(var11) && (!llIIIlIlIlll((var25 = (var12 = var7.distanceTo(var11.hitVec)) - var2) == 0.0D ? 0 : (var25 < 0.0D ? -1 : 1)) || llIIIlIllIlI((var26 = var2 - 0.0D) == 0.0D ? 0 : (var26 < 0.0D ? -1 : 1)))) {
                            if (llIIIlIIIllI(41351, 5449)) {
                                throw null;
                            }

                            if (llIIIlIllllI(var10, this..getRenderViewEntity().getRidingEntity()) &&
                            llIIIlIllIlI(var10.canRiderInteract())){
                                double var27;
                                if (llIIIlIllIlI((var27 = var2 - 0.0D) == 0.0D ? 0 : (var27 < 0.0D ? -1 : 1))) {
                                    this. = var10;
                                    var9 = var11.hitVec;
                                    var18 = true;
                                }
                            } else{
                                if (llIIIlIIIllI(41351, 5449)) {
                                    throw null;
                                }

                                this. = var10;
                                var9 = var11.hitVec;
                                var2 = var12;
                            }
                        }
                    }
                }

                if (llIIIlIIIllI(41351, 5449)) {
                    throw null;
                }

                ++var4;
                var16 = var4;
                var20 = true;
            }
        }

        if (llIIIlIIIllI(41351, 5449)) {
            throw null;
        } else {
            var18 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        Class171 var10001 = Class133. (4);
        if (llIIIlIIIllI(85441, 5025)) {
            throw null;
        } else {
            this. = (Class224) var10001;
            super. ();
            if (llIIIlIIIllI(85441, 5025)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        boolean var10000;
        if (llIIIlIIlIll(this.. ())){
            var10000 = true;
        } else if (llIIIlIIIllI(79829, 279)) {
            throw null;
        } else {
            this. (1.0F, this.                                                                              .());
            var10000 = true;
        }
    }
}
