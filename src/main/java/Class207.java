import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import java.util.List;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import org.lwjgl.input.Mouse;

public class Class207 extends Class171 {
    private static int 9387=19099;
    private static int 66398=-21401;
    private static int 457=22292;
    private static int 99882=-11350;
    private static int 7898=29770;
    private static int 26776=-16837;
    private static int 9915=-28614;
    private static int 74721=-26328;
    private static int 1298=25114;
    private static int 2849=9230;

    static {
        boolean var10000 = true;
    }

    public Class207() {
        String var10001 = Class60. ("R>_?\u001d");
        if (lllIIIIlllll(99882, 1298)) {
            throw null;
        } else {
            super(var10001, 64, Class188.);
            if (lllIIIIlllll(99882, 1298)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllIIIIlllll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIlIIlll(Object var0) {
        return var0 == null;
    }

    private static boolean lllIIIlIIllI(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIIIlIIIlI(int var0) {
        return var0 >= 0;
    }

    private static boolean lllIIIlIIIll(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIIlIIIIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIIlIIIII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIIIlIIlIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIIIlIIlII(Object var0) {
        return var0 != null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        boolean var6;
        if (lllIIIlIIllI(var1.getButton(), 2)) {
            byte var10000 = Mouse.getEventButtonState();
            if (lllIIIIlllll(26776, 457)) {
                throw null;
            }

            Entity var3;
            if (lllIIIlIIIIl(var10000) && lllIIIlIIlII(var3 = this. (50.0D)) &&
            lllIIIlIIIIl(var3 instanceof EntityPlayer) && lllIIIlIIIll(var3 instanceof EntityArmorStand) && lllIIIlIIIll(this..player.isDead) &&
            lllIIIlIIIIl(this..player.canEntityBeSeen(var3)) &&lllIIIlIIlll(this..currentScreen)){
                String var4 = var3.getName();
                Class172 var10001;
                Class149 var2;
                String var10002;
                StringBuilder var10003;
                Class103 var5;
                String var10005;
                if (lllIIIlIIIIl((var2 = Class73..). (var4))){
                    var2. (var4);
                    var5 = this.;
                    var10001 = Class172.;
                    var10002 = Class60. ("\\i|tz(");
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var10003 = new StringBuilder();
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var10005 = Class60. ("·rAuy~au¿c{");
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var5. (var10001, var10002, String.valueOf(var10003.insert(0, var10005).append(var4)), var4);
                    var6 = true;
                } else{
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var2. (var4);
                    var5 = this.;
                    var10001 = Class172.;
                    var10002 = Class60. ("\\i|tz(");
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var10003 = new StringBuilder();
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var10005 = Class60. ("¼{Y\u007f{½n{");
                    if (lllIIIIlllll(26776, 457)) {
                        throw null;
                    }

                    var5. (var10001, var10002, String.valueOf(var10003.insert(0, var10005).append(var4)), var4);
                }

                if (lllIIIIlllll(26776, 457)) {
                    throw null;
                }

                Class73.                                                                                      .                                                                              .
                ();
            }
        }

        if (lllIIIIlllll(26776, 457)) {
            throw null;
        } else {
            var6 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public Entity ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var1) {
        float var4 = 1.0F;
        Vec3d var7 = this.                                                                                                    .
        getRenderViewEntity().getPositionEyes(var4);
        Vec3d var12 = this.                                                                                                    .
        getRenderViewEntity().getLook(var4);
        Vec3d var8 = var7.add(var12.x * var1, var12.y * var1, var12.z * var1);
        Entity var9 = null;
        WorldClient var10000 = this.                                                                                                    .
        world;
        Entity var10001 = this.                                                                                                    .
        getRenderViewEntity();
        AxisAlignedBB var10002 = this.                                                                                                    .
        getRenderViewEntity().getEntityBoundingBox().expand(var12.x * var1, var12.y * var1, var12.z * var1);
        Predicate var10003 = EntitySelectors.NOT_SPECTATING;
        Class90 var10004 = new Class90(this);
        if (lllIIIIlllll(9915, 2849)) {
            throw null;
        } else {
            var10003 = Predicates.and(var10003, var10004);
            if (lllIIIIlllll(9915, 2849)) {
                throw null;
            } else {
                List var13 = var10000.getEntitiesInAABBexcluding(var10001, var10002, var10003);
                var1 = var1;

                int var3;
                boolean var17;
                for (int var14 = var3 = 0; !lllIIIIlllll(9915, 2849); var17 = true) {
                    if (!lllIIIlIIIII(var14, var13.size())) {
                        if (lllIIIIlllll(9915, 2849)) {
                            throw null;
                        }

                        return var9;
                    }

                    Entity var10;
                    if (lllIIIlIIIIl((var10 = (Entity) var13.get(var3)).canBeCollidedWith())) {
                        AxisAlignedBB var15 = var10.getEntityBoundingBox();
                        RayTraceResult var11 = var15.calculateIntercept(var7, var8);
                        boolean var16;
                        if (lllIIIlIIIIl(var15.contains(var7))) {
                            double var18;
                            double var19;
                            if (!lllIIIlIIIlI((var18 = 0.0D - var1) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1)) || lllIIIlIIIll((var19 = var1 - 0.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))) {
                                if (lllIIIIlllll(9915, 2849)) {
                                    throw null;
                                }

                                var9 = var10;
                                var1 = 0.0D;
                                var16 = true;
                            }
                        } else {
                            if (lllIIIIlllll(9915, 2849)) {
                                throw null;
                            }

                            double var5;
                            double var20;
                            double var21;
                            if (lllIIIlIIlII(var11) && (!lllIIIlIIIlI((var20 = (var5 = var7.distanceTo(var11.hitVec)) - var1) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1)) || lllIIIlIIIll((var21 = var1 - 0.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1)))) {
                                if (lllIIIIlllll(9915, 2849)) {
                                    throw null;
                                }

                                if (lllIIIlIIlIl(var10, this..getRenderViewEntity().getRidingEntity()) &&
                                lllIIIlIIIll(var10.canRiderInteract())){
                                    double var22;
                                    if (lllIIIlIIIll((var22 = var1 - 0.0D) == 0.0D ? 0 : (var22 < 0.0D ? -1 : 1))) {
                                        var9 = var10;
                                        var16 = true;
                                    }
                                } else{
                                    if (lllIIIIlllll(9915, 2849)) {
                                        throw null;
                                    }

                                    var9 = var10;
                                    var1 = var5;
                                }
                            }
                        }
                    }

                    if (lllIIIIlllll(9915, 2849)) {
                        throw null;
                    }

                    ++var3;
                    var14 = var3;
                }

                throw null;
            }
        }
    }
}
