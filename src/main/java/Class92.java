import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import org.lwjgl.opengl.GL11;

public class Class92 extends Class171 {
    private static int 93511=-26762;
    private static int 17995=-32553;
    private static int 78441=-17816;
    private static int 34429=-19051;
    private static int 8413=564;
    private static int 2525=30138;
    private Map;
    private static int 92533=-30165;
    public Class220;
    public Class220;
    private static int 41214=-32112;
    private static int 49483=-9761;
    public Class220;
    public Class220;
    private static int 91175=-22169;
    private static int 3879=9545;
    private static int 72=13521;
    private static int 223=274;
    private static int 9092=24814;
    private static int 9592=26721;
    public Class220;
    private static int 2048=13918;

    static {
        boolean var10000 = true;
    }

    public Class92() {
        String var10008 = Class60. ("K\u007f8zm:pW3uw;p\u007f4)");
        if (lIIIIIIIIlIII(91175, 2048)) {
            throw null;
        } else {
            super(var10008, 104, Class188.);
            if (lIIIIIIIIlIII(91175, 2048)) {
                throw null;
            } else {
                HashMap var4 = new HashMap();
                if (lIIIIIIIIlIII(91175, 2048)) {
                    throw null;
                } else {
                    this. = var4;
                    Class220 var10007 = new Class220;
                    String var10009 = Class60. ("Dp7ub5\u007f@n5~w}5)");
                    if (lIIIIIIIIlIII(91175, 2048)) {
                        throw null;
                    } else {
                        var10007.<init> (var10009, 233, this, true);
                        if (lIIIIIIIIlIII(91175, 2048)) {
                            throw null;
                        } else {
                            this. = var10007;
                            Class220 var10006 = new Class220;
                            var10008 = Class60. ("_r?pw=)");
                            if (lIIIIIIIIlIII(91175, 2048)) {
                                throw null;
                            } else {
                                var10006.<init> (var10008, this, 3.0D);
                                if (lIIIIIIIIlIII(91175, 2048)) {
                                    throw null;
                                } else {
                                    this. = var10006;
                                    Class220 var10005 = new Class220;
                                    String var3 = Class60. ("Ee(\u007ff*jb#ia+sc$d5");
                                    if (lIIIIIIIIlIII(91175, 2048)) {
                                        throw null;
                                    } else {
                                        var10005.<init> (var3, 235, this, true);
                                        if (lIIIIIIIIlIII(91175, 2048)) {
                                            throw null;
                                        } else {
                                            this. = var10005;
                                            Class220 var10004 = new Class220;
                                            String var2 = Class60. ("\\v<~/");
                                            if (lIIIIIIIIlIII(91175, 2048)) {
                                                throw null;
                                            } else {
                                                var10004.<init> (var2, 236, this, false);
                                                if (lIIIIIIIIlIII(91175, 2048)) {
                                                    throw null;
                                                } else {
                                                    this. = var10004;
                                                    Class220 var10003 = new Class220;
                                                    String var1 = Class60. ("H{8mz:_;{{0o[:{<");
                                                    if (lIIIIIIIIlIII(91175, 2048)) {
                                                        throw null;
                                                    } else {
                                                        var10003.<init> (var1, 237, this, false);
                                                        if (lIIIIIIIIlIII(91175, 2048)) {
                                                            throw null;
                                                        } else {
                                                            this. = var10003;
                                                            this.
                                                            ((Class220[]) (new Class220[]{this., this., this., this., this.}));
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

    private static boolean lIIIIIIIIIlll(int var0) {
        return var0 != 0;
    }

    private static boolean lIIIIIIIIlllI(int var0) {
        return var0 == 0;
    }

    private static boolean lIIIIIIIIlIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lIIIIIIIIllIl(int var0) {
        return var0 > 0;
    }

    private static boolean lIIIIIIIIlIlI(Object var0) {
        return var0 == null;
    }

    private static boolean lIIIIIIIIlIll(int var0) {
        return var0 < 0;
    }

    private static boolean lIIIIIIIIllII(Object var0) {
        return var0 != null;
    }

    private static boolean lIIIIIIIIlIII(int var0, int var1) {
        return var0 >= var1;
    }

    private EntityPlayer ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        EntityPlayer var2 = null;
        float var3 = 3.0F;
        Iterator var4 = this.                                                                                                    .
        world.playerEntities.iterator();

        while (!lIIIIIIIIlIII(78441, 8413)) {
            if (!lIIIIIIIIIlll(var4.hasNext())) {
                if (lIIIIIIIIlIII(78441, 8413)) {
                    throw null;
                }

                return var2;
            }

            EntityPlayer var5 = (EntityPlayer) var4.next();
            float var6;
            if (lIIIIIIIIlIll((var6 = var1.getDistance(var5) - var3) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1))) {
                var3 = var1.getDistance(var5);
                var2 = var5;
                boolean var10000 = true;
            }
        }

        throw null;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lIIIIIIIIIlll(var1 instanceof SPacketDestroyEntities)) {
            SPacketDestroyEntities var6 = (SPacketDestroyEntities) var1;
            int var7;
            int var10000 = var7 = 0;

            while (true) {
                if (lIIIIIIIIlIII(34429, 2525)) {
                    throw null;
                }

                if (!lIIIIIIIIlIIl(var10000, var6.getEntityIDs().length)) {
                    break;
                }

                Entity var3;
                boolean var10001;
                if (lIIIIIIIIIlll((var3 = this..world.getEntityByID(var6.getEntityIDs()[var7])) instanceof EntityEnderPearl) &&
                lIIIIIIIIIlll(this..containsKey(var3))){
                    EntityEnderPearl var8 = (EntityEnderPearl) var3;
                    BlockPos var10 = new BlockPos(var8.posX, var8.posY, var8.posZ);
                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    BlockPos var4 = var10;
                    String var11;
                    if (lIIIIIIIIlIlI(var8.getThrower())) {
                        var11 = Class60. ("uot7");
                        if (lIIIIIIIIlIII(34429, 2525)) {
                            throw null;
                        }

                        var10001 = true;
                    } else {
                        if (lIIIIIIIIlIII(34429, 2525)) {
                            throw null;
                        }

                        var11 = var8.getThrower().getName();
                    }

                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    String var5 = var11;
                    StringBuilder var13 = new StringBuilder();
                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    var13 = var13.insert(0, var5);
                    String var12 = Class60. (":6':Fa");
                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    var13 = var13.append(var12).append(var4.getX());
                    var12 = Class60. ("8@a");
                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    var13 = var13.append(var12).append(var4.getY());
                    var12 = Class60. ("8Ca");
                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    String var9 = String.valueOf(var13.append(var12).append(var4.getZ()));
                    if (lIIIIIIIIIlll(this.. ())){
                        this.                                                                                                   .
                        (Class172., this. (), var9, 3000);
                    }

                    if (lIIIIIIIIlIII(34429, 2525)) {
                        throw null;
                    }

                    if (lIIIIIIIIIlll(this.. ())){
                        var13 = new StringBuilder();
                        if (lIIIIIIIIlIII(34429, 2525)) {
                            throw null;
                        }

                        StringBuilder var14 = var13.append(this. ());
                        String var10002 = Class60. ("!:¿)");
                        if (lIIIIIIIIlIII(34429, 2525)) {
                            throw null;
                        }

                        this. (String.valueOf(var14.append(var10002).append(var9)));
                    }
                }

                if (lIIIIIIIIlIII(34429, 2525)) {
                    throw null;
                }

                ++var7;
                var10000 = var7;
                var10001 = true;
            }
        }

        if (lIIIIIIIIlIII(34429, 2525)) {
            throw null;
        } else {
            return true;
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        this.                                                                                                   .
        clear();
        super. ();
        if (lIIIIIIIIlIII(41214, 3879)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        boolean var10000;
        if (lIIIIIIIIIlll(this.. ()) &&!lIIIIIIIIIlll(this..isEmpty())){
            if (lIIIIIIIIlIII(49483, 9592)) {
                throw null;
            } else {
                boolean var10001;
                int var4;
                for (int var8 = var4 = 0; !lIIIIIIIIlIII(49483, 9592); var10001 = true) {
                    if (!lIIIIIIIIlIIl(var8, this..size())){
                        if (lIIIIIIIIlIII(49483, 9592)) {
                            throw null;
                        }

                        var10000 = true;
                        return;
                    }

                    Entity var2 = (Entity) this.                                                                                                   .
                    keySet().toArray()[var4];
                    ArrayList var5;
                    if (lIIIIIIIIllII(var5 = ((Class104) this..get(var2)). ())){
                        if (lIIIIIIIIIlll(var5.isEmpty())) {
                            var10000 = true;
                        } else {
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glPushMatrix();
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glDisable(3553);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glEnable(3042);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glDisable(2929);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glEnable(2848);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glLineWidth(1.5F);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            this.                                                                                           .
                            (this.. ());
                            RenderManager var3 = this.                                                                                                    .
                            getRenderManager();
                            GL11.glTranslated(-var3.viewerPosX, -var3.viewerPosY, -var3.viewerPosZ);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            GL11.glBegin(3);
                            if (lIIIIIIIIlIII(49483, 9592)) {
                                throw null;
                            }

                            Iterator var6;
                            Iterator var9 = var6 = var5.iterator();

                            while (true) {
                                if (lIIIIIIIIlIII(49483, 9592)) {
                                    throw null;
                                }

                                if (!lIIIIIIIIIlll(var9.hasNext())) {
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glEnd();
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glDisable(2848);
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glEnable(2929);
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glDisable(3042);
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glEnable(3553);
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }

                                    GL11.glPopMatrix();
                                    if (lIIIIIIIIlIII(49483, 9592)) {
                                        throw null;
                                    }
                                    break;
                                }

                                Vec3d var7 = (Vec3d) var6.next();
                                var9 = var6;
                                GL11.glVertex3d(var7.x, var7.y, var7.z);
                                if (lIIIIIIIIlIII(49483, 9592)) {
                                    throw null;
                                }

                                var10001 = true;
                            }
                        }
                    }

                    if (lIIIIIIIIlIII(49483, 9592)) {
                        throw null;
                    }

                    ++var4;
                    var8 = var4;
                }

                throw null;
            }
        } else if (lIIIIIIIIlIII(49483, 9592)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var6;
        if (lIIIIIIIIIlll(this..isEmpty())){
            var6 = true;
        } else if (lIIIIIIIIlIII(93511, 223)) {
            throw null;
        } else {
            int var4;
            boolean var8;
            for (int var10000 = var4 = 0; !lIIIIIIIIlIII(93511, 223); var8 = true) {
                if (!lIIIIIIIIlIIl(var10000, this..size())){
                    if (lIIIIIIIIlIII(93511, 223)) {
                        throw null;
                    }

                    this.                                                                                         .();
                    var6 = true;
                    return;
                }

                Entity var2;
                if (lIIIIIIIIlIlI(var2 = (Entity) this..keySet().toArray()[var4])){
                    var6 = true;
                } else{
                    label81:
                    {
                        if (lIIIIIIIIlIII(93511, 223)) {
                            throw null;
                        }

                        Class104 var3 = (Class104) this.                                                                                                   .
                        get(var2);
                        if (lIIIIIIIIllII(this..world.getEntityByID(var2.getEntityId()))){
                        long var7 = System.currentTimeMillis();
                        if (lIIIIIIIIlIII(93511, 223)) {
                            throw null;
                        }

                        long var9;
                        if (!lIIIIIIIIllIl((var9 = var7 - var3. () - 10000L) ==0L ? 0 : (var9 < 0L ? -1 : 1))){
                            if (lIIIIIIIIlIII(93511, 223)) {
                                throw null;
                            }

                            if (lIIIIIIIIlllI(this.. ()) &&lIIIIIIIIIlll(this.. (100)) &&
                            lIIIIIIIIIlll(this..containsKey(var2))){
                                var6 = true;
                            } else{
                                if (lIIIIIIIIlIII(93511, 223)) {
                                    throw null;
                                }

                                ArrayList var5 = ((Class104) this..get(var2)).();
                                Vec3d var10001 = new Vec3d(var2.posX, var2.posY, var2.posZ);
                                if (lIIIIIIIIlIII(93511, 223)) {
                                    throw null;
                                }

                                var5.add(var10001);
                            }
                            break label81;
                        }
                    }

                        if (lIIIIIIIIlIII(93511, 223)) {
                            throw null;
                        }

                        this.                                                                                                   .
                        remove(var2);
                        var6 = true;
                    }
                }

                if (lIIIIIIIIlIII(93511, 223)) {
                    throw null;
                }

                ++var4;
                var10000 = var4;
            }

            throw null;
        }
    }
}
