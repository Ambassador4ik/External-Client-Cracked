import com.google.common.collect.Maps;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.client.model.ModelShulker;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityBedRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEndGatewayRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityPistonRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntityShulkerBoxRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityStructureRenderer;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBed;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityEndGateway;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.tileentity.TileEntityStructure;
import net.minecraft.util.Timer;

public class Class22 {
    private static int 25436=-19627;
    private static int 13188=-555;
    private static Field;
    private static int 36008=-13973;
    private static int 8709=16528;
    private static int 5238=17802;
    private static int 31510=-23908;
    private static int 8592=14602;
    private static int 42922=-2009;
    public static Method;
    private static int 35395=-18504;
    private static int 2680=28880;
    private static Field;
    private static Method;
    private static int 44234=-18339;
    private static int 23249=-27907;
    private static Field;
    private static Field;
    private static int 6418=28824;
    private static int 8181=14615;
    private static Field;
    private static int 29927=-10233;
    private static Field;
    private static int 2344=18694;
    private static int 3943=18967;
    private static int 4118=28992;
    private static int 6933=7660;
    private static Field;
    private static int 4367=6589;
    private static int 6912=6695;
    private static int 54090=-16695;
    private static int 3023=18596;
    public static boolean;
    private static int 8002=10050;
    private static Field;
    private static Method;
    private static int 60917=-18493;
    private static int 8105=14702;
    private static int 2378=32407;
    private static int 1091=12802;
    private static Field;
    private static Field;
    private static int 6753=15663;
    private static int 9065=22566;
    private static boolean                                                                                               =false;
    private static int 44985=-22518;
    private static Field;
    private static int 6000=21244;
    private static int 954=21687;
    private static int 7054=18990;
    private static int 2109=30999;
    private static int 52075=-15505;
    private static Method;
    private static int 6372=25950;
    private static int 34617=-22767;
    private static int 39307=-14222;
    private static int 80882=-1058;
    private static int 91609=-9268;
    private static int 74235=-14664;
    private static Field;
    private static int 1110=12713;
    private static int 45842=-666;
    private static int 8930=-20904;
    private static Field;
    private static int 24526=-2158;
    private static int 21703=-17992;
    private static int 7164=3801;
    private static Method;
    private static int 15356=-6413;
    private static Field;
    private static int 2569=32237;
    private static int 32365=-18455;
    private static Field;
    private static int 3392=10269;
    private static Field;
    private static Minecraft;
    private static int 57913=-14730;
    private static int 3912=12290;
    private static Field;
    private static int 8297=28134;
    private static Field;
    private static int 53099=-1769;
    private static int 1826=2835;
    private static int 23374=-4805;
    private static int 6874=28158;
    private static int 65=14837;
    private static int 41952=-2820;
    private static int 8944=26048;
    private static int 590=6273;
    private static Field;
    private static int 37656=-10983;
    private static int 84602=-23822;
    private static Field;
    private static int 75634=-18633;
    private static int 1356=15812;
    private static int 72736=-32808;
    private static Field;
    private static int 66330=-28725;
    private static int 3918=30952;
    private static int 87666=-13962;
    private static int 8830=27857;
    private static int 74750=-12274;
    private static int 87534=-28203;
    private static int 92294=-12922;
    private static int 4369=14484;
    private static int 4939=23935;
    private static Field;
    private static int 19674=-13104;
    private static int 8255=26709;
    private static int 8838=10881;
    private static int 3491=29923;
    private static int 52257=-7528;
    private static Field;
    private static int 27441=-22484;
    private static int 62666=-2882;
    private static int 65845=-27250;
    private static int 74457=-8064;
    private static int 11785=-30169;
    private static int 6624=773;
    private static int 7329=23285;
    private static int 9011=17553;
    private static int 58885=-11274;
    private static Field;
    private static Field;
    private static int 7024=11799;
    private static int 12757=-10020;
    private static int 1393=9170;
    private static int 4390=21932;
    private static Field;
    private static int 95179=-17900;
    private static int 13796=-14069;
    private static int 3555=3924;
    private static int 10491=-17036;
    private static int 58198=-23658;
    private static int 6568=8119;
    private static int 68811=-21652;

    static {
        boolean var10000 = ();
        if (llIllllIIllI(72736, 9011)) {
            throw null;
        } else {
                                                                                                      =var10000;
            Minecraft var0 = Minecraft.func_71410_x();
            if (llIllllIIllI(72736, 9011)) {
                throw null;
            } else {
                                                                                                            =var0;
                var10000 = true;
            }
        }
    }

    public Class22() {
        if (llIllllIIllI(21703, 3943)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public static Method ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class var0, int var1) {
        Method var10000;
        try {
            if (llIllllIIllI(39307, 8105)) {
                throw null;
            }

            Method var3;
            (var3 = var0.getDeclaredMethods()[var1]).setAccessible(true);
            var10000 = var3;
        } catch (Exception var2) {
            if (llIllllIIllI(39307, 8105)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(39307, 8105)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(39307, 8105)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(53099, 1110)) {
                throw null;
            }

                                                                                            .setFloat(Class73.., var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(53099, 1110)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(53099, 1110)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(53099, 1110)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */(boolean var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(95179, 4367)) {
                throw null;
            }

                                                                                              .
            setBoolean(.field_71439_g, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(95179, 4367)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(95179, 4367)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(95179, 4367)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */(int var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(34617, 590)) {
                throw null;
            }

                                                                                     .setInt(.field_71442_b, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(34617, 590)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(34617, 590)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(34617, 590)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0, boolean var1) {
        float var4;
        try {
            if (llIllllIIllI(23249, 7054)) {
                throw null;
            }

            Method var10000 = ;
            EntityRenderer var10001 = Class73.                                                                                      .
            ;
            Object[] var10002 = new Object[2];
            Float var10005 = var0;
            if (llIllllIIllI(23249, 7054)) {
                throw null;
            }

            var10002[0] = var10005;
            Boolean var3 = var1;
            if (llIllllIIllI(23249, 7054)) {
                throw null;
            }

            var10002[1] = var3;
            var4 = (Float) var10000.invoke(var10001, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(23249, 7054)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(23249, 7054)) {
                throw null;
            }

            return 0.0F;
        }

        if (llIllllIIllI(23249, 7054)) {
            throw null;
        } else {
            return var4;
        }
    }

    public static Object ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Method var0, Object var1, Object... var2) {
        Object var10000;
        try {
            if (llIllllIIllI(31510, 2680)) {
                throw null;
            }

            var10000 = var0.invoke(var1, var2);
        } catch (ReflectiveOperationException var3) {
            if (llIllllIIllI(31510, 2680)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(31510, 2680)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(31510, 2680)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static TileEntitySign ________________________________________________________________________________________________/* $FF was:                                                                                                 */(GuiEditSign var0) {
        TileEntitySign var10000;
        try {
            if (llIllllIIllI(36008, 8181)) {
                throw null;
            }

            var10000 = (TileEntitySign).get(var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(36008, 8181)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(36008, 8181)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(36008, 8181)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var0, Field var1, Object var2) {
        boolean var10000;
        try {
            if (llIllllIIllI(27441, 3392)) {
                throw null;
            }

            var1.setAccessible(true);
            String var10002 = Class60. ("~}tzq{qa(");
            if (llIllllIIllI(27441, 3392)) {
                throw null;
            }

            Field var3 = Field.class.getDeclaredField(var10002);
            var3.setAccessible(true);
            var3.setInt(var1, var1.getModifiers() & -17);
            var1.set(var0, var2);
        } catch (ReflectiveOperationException var4) {
            if (llIllllIIllI(27441, 3392)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(27441, 3392)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(27441, 3392)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _________________________________________________________________________________/* $FF was:                                                                                  */() {
        boolean var10000;
        try {
            if (llIllllIIllI(68811, 6372)) {
                throw null;
            }

            Method var3 = ;
            EntityRenderer var10001 =                                                                                                .
            field_71460_t;
            Object[] var10002 = new Object[2];
            Float var10005 =                                                                                                .
            func_184121_ak();
            if (llIllllIIllI(68811, 6372)) {
                throw null;
            }

            var10002[0] = var10005;
            Integer var2 = 0;
            if (llIllllIIllI(68811, 6372)) {
                throw null;
            }

            var10002[1] = var2;
            var3.invoke(var10001, var10002);
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(68811, 6372)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(68811, 6372)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(68811, 6372)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void __________________________________________________________________________________/* $FF was:                                                                                   */() {
        boolean var10000 = true;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(CPacketCustomPayload var0, PacketBuffer var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(52257, 4939)) {
                throw null;
            }

                                                                                      .set(var0, var1);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(52257, 4939)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(52257, 4939)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(52257, 4939)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntityMobSpawner var0) {
        int var10000;
        try {
            if (llIllllIIllI(41952, 6753)) {
                throw null;
            }

            var10000 =                                                                                                        .
            getInt(var0.func_145881_a());
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(41952, 6753)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(41952, 6753)) {
                throw null;
            }

            return -1;
        }

        if (llIllllIIllI(41952, 6753)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static boolean ____________________________________________________________________________/* $FF was:                                                                             */() {
        boolean var2;
        try {
            if (llIllllIIllI(23374, 8002)) {
                throw null;
            }

            Field var10000 = ;
            Minecraft var10001 = Minecraft.func_71410_x();
            if (llIllllIIllI(23374, 8002)) {
                throw null;
            }

            var2 = var10000.getBoolean(var10001.field_71439_g);
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(23374, 8002)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(23374, 8002)) {
                throw null;
            }

            return false;
        }

        if (llIllllIIllI(23374, 8002)) {
            throw null;
        } else {
            return var2;
        }
    }

    public static Object ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Field var0, Object var1) {
        Object var10000;
        try {
            if (llIllllIIllI(44985, 8592)) {
                throw null;
            }

            var10000 = var0.get(var1);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(44985, 8592)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(44985, 8592)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(44985, 8592)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */(Object var0, float var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(24526, 6933)) {
                throw null;
            }

            Field var3 = ;
            Float var10002 = var1;
            if (llIllllIIllI(24526, 6933)) {
                throw null;
            }

            var3.set(var0, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(24526, 6933)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(24526, 6933)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(24526, 6933)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */(int var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(54090, 6568)) {
                throw null;
            }

                                                                                                           .
            setInt(, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(54090, 6568)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(54090, 6568)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(54090, 6568)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static int ____________________________________________________________________________/* $FF was:                                                                             */() {
        int var10000;
        try {
            if (llIllllIIllI(25436, 9065)) {
                throw null;
            }

            var10000 =                                                                             .
            getInt(.field_71442_b);
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(25436, 9065)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(25436, 9065)) {
                throw null;
            }

            return 0;
        }

        if (llIllllIIllI(25436, 9065)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(CPacketUpdateSign var0, String[] var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(74457, 8297)) {
                throw null;
            }

                                                                                                 .set(var0, var1);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(74457, 8297)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(74457, 8297)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(74457, 8297)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static Method ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class var0, String var1, Class... var2) {
        Method var10000;
        try {
            if (llIllllIIllI(84602, 3555)) {
                throw null;
            }

            Method var4;
            (var4 = var0.getDeclaredMethod(var1, var2)).setAccessible(true);
            var10000 = var4;
        } catch (ReflectiveOperationException var3) {
            if (llIllllIIllI(84602, 3555)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(84602, 3555)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(84602, 3555)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________/* $FF was:                                                                                 */() {
        String var10001;
        boolean var10002;
        if (llIllllIIlll()) {
            var10001 = Class60. ("f|p|dV\u007f}\u007f~R{mf>");
            if (llIllllIIllI(66330, 7164)) {
                throw null;
            }

            var10002 = true;
        } else {
            if (llIllllIIllI(66330, 7164)) {
                throw null;
            }

            var10001 = Class60. ("|nwyA*)-#) Ew<");
            if (llIllllIIllI(66330, 7164)) {
                throw null;
            }
        }

        if (llIllllIIllI(66330, 7164)) {
            throw null;
        } else {
            Method var10000 = (Minecraft.class, var10001);
            if (llIllllIIllI(66330, 7164)) {
                throw null;
            } else {
                                                                                                                =
                var10000;
                if (llIllllIIlll()) {
                    var10001 = Class60. ("ywpyuVroa>");
                    if (llIllllIIllI(66330, 7164)) {
                        throw null;
                    }

                    var10002 = true;
                } else {
                    if (llIllllIIllI(66330, 7164)) {
                        throw null;
                    }

                    var10001 = Class60. ("|nwyA*)-#*'Ew=");
                    if (llIllllIIllI(66330, 7164)) {
                        throw null;
                    }
                }

                if (llIllllIIllI(66330, 7164)) {
                    throw null;
                } else {
                    var10000 = (Minecraft.class, var10001);
                    if (llIllllIIllI(66330, 7164)) {
                        throw null;
                    } else {
                                                                                                                                   =
                        var10000;
                        Field var0 = (CPacketPlayer.class, 3);
                        if (llIllllIIllI(66330, 7164)) {
                            throw null;
                        } else {
                                                                                                     =var0;
                            var0 = (CPacketPlayer.class, 4);
                            if (llIllllIIllI(66330, 7164)) {
                                throw null;
                            } else {
                                                                                                                                        =
                                var0;
                                if (llIllllIIlll()) {
                                    var10001 = Class60. ("rtHtmn}7");
                                    if (llIllllIIllI(66330, 7164)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else {
                                    if (llIllllIIllI(66330, 7164)) {
                                        throw null;
                                    }

                                    var10001 = Class60. ("|r|vzD*+\"#&Et\u0003");
                                    if (llIllllIIllI(66330, 7164)) {
                                        throw null;
                                    }
                                }

                                if (llIllllIIllI(66330, 7164)) {
                                    throw null;
                                } else {
                                    var0 = (Entity.class, var10001);
                                    if (llIllllIIllI(66330, 7164)) {
                                        throw null;
                                    } else {
                                                                                                                             =
                                        var0;
                                        var0 = (SPacketPlayerPosLook.class, 3);
                                        if (llIllllIIllI(66330, 7164)) {
                                            throw null;
                                        } else {
                                                                                                                      =
                                            var0;
                                            var0 = (SPacketPlayerPosLook.class, 4);
                                            if (llIllllIIllI(66330, 7164)) {
                                                throw null;
                                            } else {
                                                                                                                                          =
                                                var0;
                                                Class var1 =                                                                                                .
                                                field_71460_t.getClass();
                                                if (llIllllIIlll()) {
                                                    var10001 = Class60. ("h\u007flnoY}vvhqOe{zhmuz6");
                                                    if (llIllllIIllI(66330, 7164)) {
                                                        throw null;
                                                    }

                                                    var10002 = true;
                                                } else {
                                                    if (llIllllIIllI(66330, 7164)) {
                                                        throw null;
                                                    }

                                                    var10001 = Class60. ("}ovx@-$/$#O:");
                                                    if (llIllllIIllI(66330, 7164)) {
                                                        throw null;
                                                    }
                                                }

                                                if (llIllllIIllI(66330, 7164)) {
                                                    throw null;
                                                } else {
                                                    var10000 = (var1, var10001, Float.TYPE, Integer.TYPE);
                                                    if (llIllllIIllI(66330, 7164)) {
                                                        throw null;
                                                    } else {
                                                                                                                                           =
                                                        var10000;
                                                        if (llIllllIIlll()) {
                                                            var10001 = Class60. ("|`hc\u007fZffclOiw}T\u007fqg<");
                                                            if (llIllllIIllI(66330, 7164)) {
                                                                throw null;
                                                            }

                                                            var10002 = true;
                                                        } else {
                                                            if (llIllllIIllI(66330, 7164)) {
                                                                throw null;
                                                            }

                                                            var10001 = Class60. ("r|rxtJ\",(#.#Gt\u001f");
                                                            if (llIllllIIllI(66330, 7164)) {
                                                                throw null;
                                                            }
                                                        }

                                                        if (llIllllIIllI(66330, 7164)) {
                                                            throw null;
                                                        } else {
                                                            var0 = (EntityLivingBase.class, var10001);
                                                            if (llIllllIIllI(66330, 7164)) {
                                                                throw null;
                                                            } else {
                                                                                                                                          =
                                                                var0;
                                                                if (llIllllIIlll()) {
                                                                    var10001 = Class60. ("uz{tx^yc[spv\"");
                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                        throw null;
                                                                    }

                                                                    var10002 = true;
                                                                } else {
                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                        throw null;
                                                                    }

                                                                    var10001 = Class60. ("q\u007fq{wI'/(.-H2");
                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                        throw null;
                                                                    }
                                                                }

                                                                if (llIllllIIllI(66330, 7164)) {
                                                                    throw null;
                                                                } else {
                                                                    var0 = (PlayerControllerMP.class, var10001);
                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                        throw null;
                                                                    } else {
                                                                                                                                   =
                                                                        var0;
                                                                        if (llIllllIIlll()) {
                                                                            var10001 = Class60.
                                                                            ("xojYsu\u007fpW{}zp\u007fY\u000b");
                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                throw null;
                                                                            }

                                                                            var10002 = true;
                                                                        } else {
                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                throw null;
                                                                            }

                                                                            var10001 = Class60. ("q\u007fq{wI'/(!,H=");
                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                throw null;
                                                                            }
                                                                        }

                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                            throw null;
                                                                        } else {
                                                                            var0 = (PlayerControllerMP.class, var10001);
                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                throw null;
                                                                            } else {
                                                                                                                                                              =
                                                                                var0;
                                                                                if (llIllllIIlll()) {
                                                                                    var10001 = Class60.
                                                                                    ("ik|\u007fzRs[{)");
                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var10002 = true;
                                                                                } else {
                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var10001 = Class60.
                                                                                    ("|r|vzD*+#+#Eu>");
                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                        throw null;
                                                                                    }
                                                                                }

                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var0 = (EntityPlayer.class, var10001)
                                                                                    ;
                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                                                                                                                        =
                                                                                        var0;
                                                                                        var0 = (Minecraft.class, 20);
                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                                                                                                                        =
                                                                                            var0;
                                                                                            var0 = (Timer.class, 4);
                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                                                                                    =
                                                                                                var0;
                                                                                                if (llIllllIIlll()) {
                                                                                                    var10001 = Class60.
                                                                                                    ("shQsjottuY}uu0");
                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var10002 = true;
                                                                                                } else {
                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var10001 = Class60.
                                                                                                    ("q\u007fq{wI'/(!$H1");
                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                        throw null;
                                                                                                    }
                                                                                                }

                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var0 = (PlayerControllerMP.class, var10001)
                                                                                                    ;
                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                                                                                      =
                                                                                                        var0;
                                                                                                        if (llIllllIIlll()) {
                                                                                                            var10001 = Class60.
                                                                                                            ("is\u007fskYprpqT~{{mObwm)");
                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            var10002 = true;
                                                                                                        } else {
                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            var10001 = Class60.
                                                                                                            ("|r|vzD*+&-&Ew8");
                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }

                                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            var0 = (Minecraft.class, var10001)
                                                                                                            ;
                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                                                                                       =
                                                                                                                var0;
                                                                                                                if (llIllllIIlll()) {
                                                                                                                    var10001 = Class60.
                                                                                                                    ("unVrOx9");
                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                        throw null;
                                                                                                                    }

                                                                                                                    var10002 = true;
                                                                                                                } else {
                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                        throw null;
                                                                                                                    }

                                                                                                                    var10001 = Class60.
                                                                                                                    ("q\u007fq{wI''.%(H\u0011");
                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }

                                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    var0 = (Entity.class, var10001)
                                                                                                                    ;
                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                                                                                     =
                                                                                                                        var0;
                                                                                                                        if (llIllllIIlll()) {
                                                                                                                            var10001 = Class60.
                                                                                                                            ("fiZn|eyy`oMjikcn)");
                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                throw null;
                                                                                                                            }

                                                                                                                            var10002 = true;
                                                                                                                        } else {
                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                throw null;
                                                                                                                            }

                                                                                                                            var10001 = Class60.
                                                                                                                            ("r|rxtJ\"%,!*%Gt6");
                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }

                                                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            var0 = (Minecraft.class, var10001)
                                                                                                                            ;
                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                                                                                     =
                                                                                                                                var0;
                                                                                                                                if (llIllllIIlll()) {
                                                                                                                                    var10001 = Class60.
                                                                                                                                    ("{ozxfyxjm~Ccf~C^\u0012");
                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    var10002 = true;
                                                                                                                                } else {
                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                        throw null;
                                                                                                                                    }

                                                                                                                                    var10001 = Class60.
                                                                                                                                    ("q\u007fq{wI'$'\",H>");
                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }

                                                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    var0 = (GuiIngame.class, var10001)
                                                                                                                                    ;
                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                                                                                                                    =
                                                                                                                                        var0;
                                                                                                                                        if (llIllllIIlll()) {
                                                                                                                                            var10001 = Class60.
                                                                                                                                            ("ikxmp_xvs\"");
                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                throw null;
                                                                                                                                            }

                                                                                                                                            var10002 = true;
                                                                                                                                        } else {
                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                throw null;
                                                                                                                                            }

                                                                                                                                            var10001 = Class60.
                                                                                                                                            ("q\u007fq{wI)/-.*H9");
                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                        }

                                                                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            var0 = (MobSpawnerBaseLogic.class, var10001)
                                                                                                                                            ;
                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                                                                                    =
                                                                                                                                                var0;
                                                                                                                                                if (llIllllIIlll()) {
                                                                                                                                                    var10001 = Class60.
                                                                                                                                                    ("h~w~{iU{|?");
                                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10002 = true;
                                                                                                                                                } else {
                                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10001 = Class60.
                                                                                                                                                    ("}ovx@-$/$,O9");
                                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }

                                                                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    var10000 = (EntityRenderer.class, var10001, Float.TYPE, Integer.TYPE)
                                                                                                                                                    ;
                                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                                                                    =
                                                                                                                                                        var10000;
                                                                                                                                                        var0 = (GuiEditSign.class, 0)
                                                                                                                                                        ;
                                                                                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                                                                            =
                                                                                                                                                            var0;
                                                                                                                                                            var0 = (CPacketUpdateSign.class, 1)
                                                                                                                                                            ;
                                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                                                                 =
                                                                                                                                                                var0;
                                                                                                                                                                var0 = (CPacketCloseWindow.class, 0)
                                                                                                                                                                ;
                                                                                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                                                          =
                                                                                                                                                                    var0;
                                                                                                                                                                    var0 = (TileEntityRendererDispatcher.class, 0)
                                                                                                                                                                    ;
                                                                                                                                                                    if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                                                                 =
                                                                                                                                                                        var0;
                                                                                                                                                                        var0 = (CPacketCustomPayload.class, 1)
                                                                                                                                                                        ;
                                                                                                                                                                        if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                                                               =
                                                                                                                                                                            var0;
                                                                                                                                                                            var0 = (Entity.class, 54)
                                                                                                                                                                            ;
                                                                                                                                                                            if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                                                          =
                                                                                                                                                                                var0;
                                                                                                                                                                                var0 = (EntityLivingBase.class, 66)
                                                                                                                                                                                ;
                                                                                                                                                                                if (llIllllIIllI(66330, 7164)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                                                        =
                                                                                                                                                                                    var0;
                                                                                                                                                                                    boolean var2 = true;
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

    public static void __________________________________________________________________________________________/* $FF was:                                                                                           */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(52075, 7024)) {
                throw null;
            }

                                                                                                          .
            setFloat(.field_71442_b, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(52075, 7024)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(52075, 7024)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(52075, 7024)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static Field ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class var0, String var1) {
        Field var10000;
        try {
            if (llIllllIIllI(62666, 6912)) {
                throw null;
            }

            Field var3;
            (var3 = var0.getDeclaredField(var1)).setAccessible(true);
            var10000 = var3;
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(62666, 6912)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(62666, 6912)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(62666, 6912)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Field var0, Object var1, Object var2) {
        boolean var10000;
        try {
            if (llIllllIIllI(65845, 1826)) {
                throw null;
            }

            var0.set(var1, var2);
        } catch (ReflectiveOperationException var3) {
            if (llIllllIIllI(65845, 1826)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(65845, 1826)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(65845, 1826)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void __________________________________________________________________________________________/* $FF was:                                                                                           */(Object var0, float var1) {
        boolean var10000;
        label40:
        {
            try {
                if (llIllllIIllI(11785, 2344)) {
                    throw null;
                }

                float var4;
                if (llIllllIIlll((var4 = ((CPacketPlayer) var0).func_186998_b(-1.0F) - 91.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))) {
                    Field var3 = ;
                    Float var10002 = var1;
                    if (llIllllIIllI(11785, 2344)) {
                        throw null;
                    }

                    var3.set(var0, var10002);
                    break label40;
                }
            } catch (ReflectiveOperationException var2) {
                if (llIllllIIllI(11785, 2344)) {
                    throw null;
                }
            }

            if (llIllllIIllI(11785, 2344)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(11785, 2344)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static Field ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class var0, int var1) {
        Field var10000;
        try {
            if (llIllllIIllI(10491, 8255)) {
                throw null;
            }

            Field var3;
            (var3 = var0.getDeclaredFields()[var1]).setAccessible(true);
            var10000 = var3;
        } catch (Exception var2) {
            if (llIllllIIllI(10491, 8255)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(10491, 8255)) {
                throw null;
            }

            return null;
        }

        if (llIllllIIllI(10491, 8255)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        boolean var10000;
        try {
            if (llIllllIIllI(58885, 3912)) {
                throw null;
            }

            String var10001 = Class60. ("rtko~t\u007f>");
            if (llIllllIIllI(58885, 3912)) {
                throw null;
            }

            if (llIllllIlIII(Minecraft.class.getDeclaredField(var10001))) {
                return true;
            }

            if (llIllllIIllI(58885, 3912)) {
                throw null;
            }

            var10000 = false;
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(58885, 3912)) {
                throw null;
            }

            return false;
        }

        if (llIllllIIllI(58885, 3912)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */(Object var0, float var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(13796, 8944)) {
                throw null;
            }

            Field var3 = ;
            Float var10002 = var1;
            if (llIllllIIllI(13796, 8944)) {
                throw null;
            }

            var3.set(var0, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(13796, 8944)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(13796, 8944)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _________________________________________________________________________________/* $FF was:                                                                                  */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(75634, 6000)) {
                throw null;
            }

                                                                                                    .
            setFloat(.get(), 1000.0F / (var0 * 20.0F));
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(75634, 6000)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(75634, 6000)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(75634, 6000)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0, int var1) {
        boolean var10000;
        if (llIllllIlIII()) {
            label58:
            {
                try {
                    if (llIllllIIllI(19674, 954)) {
                        throw null;
                    }

                    Method var4 = ;
                    EntityRenderer var10001 =                                                                                                .
                    field_71460_t;
                    Object[] var10002 = new Object[2];
                    Float var10005 = var0;
                    if (llIllllIIllI(19674, 954)) {
                        throw null;
                    }

                    var10002[0] = var10005;
                    Integer var3 = var1;
                    if (llIllllIIllI(19674, 954)) {
                        throw null;
                    }

                    var10002[1] = var3;
                    var4.invoke(var10001, var10002);
                } catch (ReflectiveOperationException var2) {
                    if (!llIllllIIllI(19674, 954)) {
                        if (llIllllIIlll()) {
                            var10000 = true;
                            return;
                        }
                        break label58;
                    }

                    throw null;
                }

                if (llIllllIIllI(19674, 954)) {
                    throw null;
                }

                var10000 = true;
                return;
            }
        } else {
            if (llIllllIIllI(19674, 954)) {
                throw null;
            }

            ();
            if (llIllllIIllI(19674, 954)) {
                throw null;
            }
        }

        if (llIllllIIllI(19674, 954)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    private static boolean llIllllIlIII(Object var0) {
        return var0 != null;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        boolean var10000;
        try {
            if (llIllllIIllI(29927, 7329)) {
                throw null;
            }

                                                                                                            .invoke();
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(29927, 7329)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(29927, 7329)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(29927, 7329)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(CPacketCloseWindow var0) {
        int var10000;
        try {
            if (llIllllIIllI(92294, 4390)) {
                throw null;
            }

            var10000 =                                                                               .getInt(var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(92294, 4390)) {
                throw null;
            }

            return -1;
        }

        if (llIllllIIllI(92294, 4390)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class var0, int var1, Object var2, Object var3) {
        boolean var10000;
        try {
            if (llIllllIIllI(8930, 1356)) {
                throw null;
            }

            Field var5 = var0.getDeclaredFields()[var1];
            var5.setAccessible(true);
            var5.set(var2, var3);
        } catch (ReflectiveOperationException var4) {
            if (llIllllIIllI(8930, 1356)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(8930, 1356)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(8930, 1356)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        GuiIngame var10000 =                                                                                                .
        field_71456_v;
        Field var10001 = ;
        Class102 var10002 = new Class102();
        if (llIllllIIllI(15356, 1393)) {
            throw null;
        } else {
            ((Object) var10000, (Field) var10001, (Object) var10002);
            if (llIllllIIllI(15356, 1393)) {
                throw null;
            } else {
                boolean var0 = true;
            }
        }
    }

    public static void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        HashMap var10000 = Maps.newHashMap();
        if (llIllllIIllI(35395, 6874)) {
            throw null;
        } else {
            HashMap var0 = var10000;
            Class96 var10002 = new Class96();
            if (llIllllIIllI(35395, 6874)) {
                throw null;
            } else {
                var10000.put(TileEntitySign.class, var10002);
                TileEntityMobSpawnerRenderer var10003 = new TileEntityMobSpawnerRenderer();
                if (llIllllIIllI(35395, 6874)) {
                    throw null;
                } else {
                    var0.put(TileEntityMobSpawner.class, var10003);
                    TileEntityPistonRenderer var10004 = new TileEntityPistonRenderer();
                    if (llIllllIIllI(35395, 6874)) {
                        throw null;
                    } else {
                        var0.put(TileEntityPiston.class, var10004);
                        TileEntityChestRenderer var10005 = new TileEntityChestRenderer();
                        if (llIllllIIllI(35395, 6874)) {
                            throw null;
                        } else {
                            var0.put(TileEntityChest.class, var10005);
                            TileEntityEnderChestRenderer var10006 = new TileEntityEnderChestRenderer();
                            if (llIllllIIllI(35395, 6874)) {
                                throw null;
                            } else {
                                var0.put(TileEntityEnderChest.class, var10006);
                                TileEntityEnchantmentTableRenderer var10007 = new TileEntityEnchantmentTableRenderer();
                                if (llIllllIIllI(35395, 6874)) {
                                    throw null;
                                } else {
                                    var0.put(TileEntityEnchantmentTable.class, var10007);
                                    TileEntityEndPortalRenderer var10008 = new TileEntityEndPortalRenderer();
                                    if (llIllllIIllI(35395, 6874)) {
                                        throw null;
                                    } else {
                                        var0.put(TileEntityEndPortal.class, var10008);
                                        TileEntityEndGatewayRenderer var10009 = new TileEntityEndGatewayRenderer();
                                        if (llIllllIIllI(35395, 6874)) {
                                            throw null;
                                        } else {
                                            var0.put(TileEntityEndGateway.class, var10009);
                                            TileEntityBeaconRenderer var10010 = new TileEntityBeaconRenderer();
                                            if (llIllllIIllI(35395, 6874)) {
                                                throw null;
                                            } else {
                                                var0.put(TileEntityBeacon.class, var10010);
                                                TileEntitySkullRenderer var10011 = new TileEntitySkullRenderer();
                                                if (llIllllIIllI(35395, 6874)) {
                                                    throw null;
                                                } else {
                                                    var0.put(TileEntitySkull.class, var10011);
                                                    TileEntityBannerRenderer var10012 = new TileEntityBannerRenderer();
                                                    if (llIllllIIllI(35395, 6874)) {
                                                        throw null;
                                                    } else {
                                                        var0.put(TileEntityBanner.class, var10012);
                                                        TileEntityStructureRenderer var10013 = new TileEntityStructureRenderer();
                                                        if (llIllllIIllI(35395, 6874)) {
                                                            throw null;
                                                        } else {
                                                            var0.put(TileEntityStructure.class, var10013);
                                                            TileEntityShulkerBoxRenderer var10014 = new TileEntityShulkerBoxRenderer;
                                                            ModelShulker var10016 = new ModelShulker();
                                                            if (llIllllIIllI(35395, 6874)) {
                                                                throw null;
                                                            } else {
                                                                var10014.<init> (var10016);
                                                                if (llIllllIIllI(35395, 6874)) {
                                                                    throw null;
                                                                } else {
                                                                    var0.put(TileEntityShulkerBox.class, var10014);
                                                                    TileEntityBedRenderer var10015 = new TileEntityBedRenderer();
                                                                    if (llIllllIIllI(35395, 6874)) {
                                                                        throw null;
                                                                    } else {
                                                                        var0.put(TileEntityBed.class, var10015);
                                                                        Iterator var1 = var0.values().iterator();

                                                                        boolean var10001;
                                                                        for (Iterator var2 = var1; !llIllllIIllI(35395, 6874); var10001 = true) {
                                                                            if (!llIllllIIlll(var2.hasNext())) {
                                                                                if (llIllllIIllI(35395, 6874)) {
                                                                                    throw null;
                                                                                }

                                                                                ((Object) TileEntityRendererDispatcher.field_147556_a, (Field), (Object) var0)
                                                                                ;
                                                                                if (llIllllIIllI(35395, 6874)) {
                                                                                    throw null;
                                                                                }

                                                                                boolean var3 = true;
                                                                                return;
                                                                            }

                                                                            ((TileEntitySpecialRenderer) var1.next()).func_147497_a(TileEntityRendererDispatcher.field_147556_a);
                                                                            var2 = var1;
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
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */() {
        Class var10000 =                                                                                                .
        field_71460_t.getClass();
        String var10001;
        boolean var10002;
        if (llIllllIIlll()) {
            var10001 = Class60. ("h\u007flnoY}vvhqOe{zhmuz6");
            if (llIllllIIllI(32365, 2378)) {
                throw null;
            }

            var10002 = true;
        } else {
            if (llIllllIIllI(32365, 2378)) {
                throw null;
            }

            var10001 = Class60. ("}ovx@-$/$#O:");
            if (llIllllIIllI(32365, 2378)) {
                throw null;
            }
        }

        if (llIllllIIllI(32365, 2378)) {
            throw null;
        } else {
            Method var0 = (var10000, var10001, Float.TYPE, Integer.TYPE);
            if (llIllllIIllI(32365, 2378)) {
                throw null;
            } else {
                                                                                                             =var0;
                var10000 = Class73.                                                                                      .                                                                                        .
                getClass();
                if (llIllllIIlll()) {
                    var10001 = Class60. ("}~m\\QMPuvrwss)");
                    if (llIllllIIllI(32365, 2378)) {
                        throw null;
                    }

                    var10002 = true;
                } else {
                    if (llIllllIIllI(32365, 2378)) {
                        throw null;
                    }

                    var10001 = Class60. ("}ovx@-$/++O:");
                    if (llIllllIIllI(32365, 2378)) {
                        throw null;
                    }
                }

                if (llIllllIIllI(32365, 2378)) {
                    throw null;
                } else {
                    var0 = (var10000, var10001, Float.TYPE, Boolean.TYPE);
                    if (llIllllIIllI(32365, 2378)) {
                        throw null;
                    } else {
                                                                                                                                      =
                        var0;
                        var10000 = Class73.                                                                                      .                                                                                        .
                        getClass();
                        if (llIllllIIlll()) {
                            var10001 = Class60. ("nf}Ecmfnilq@egcXjl-");
                            if (llIllllIIllI(32365, 2378)) {
                                throw null;
                            }

                            var10002 = true;
                        } else {
                            if (llIllllIIllI(32365, 2378)) {
                                throw null;
                            }

                            var10001 = Class60. ("q\u007fq{wI'/*&*H\b");
                            if (llIllllIIllI(32365, 2378)) {
                                throw null;
                            }
                        }

                        if (llIllllIIllI(32365, 2378)) {
                            throw null;
                        } else {
                            Field var1 = (var10000, var10001);
                            if (llIllllIIllI(32365, 2378)) {
                                throw null;
                            } else {
                                                                                                            =var1;
                                var10000 = Class73.                                                                                      .                                                                                        .
                                getClass();
                                if (llIllllIIlll()) {
                                    var10001 = Class60. ("rzaY\u007fqzrupm\\y{?");
                                    if (llIllllIIllI(32365, 2378)) {
                                        throw null;
                                    }

                                    var10002 = true;
                                } else {
                                    if (llIllllIIllI(32365, 2378)) {
                                        throw null;
                                    }

                                    var10001 = Class60. ("q\u007fq{wI'/*&+H\t");
                                    if (llIllllIIllI(32365, 2378)) {
                                        throw null;
                                    }
                                }

                                if (llIllllIIllI(32365, 2378)) {
                                    throw null;
                                } else {
                                    var1 = (var10000, var10001);
                                    if (llIllllIIllI(32365, 2378)) {
                                        throw null;
                                    } else {
                                                                                                                                                       =
                                        var1;
                                        boolean var2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(boolean var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(58198, 3023)) {
                throw null;
            }

            Field var3 = ;
            Minecraft var10001 = Minecraft.func_71410_x();
            if (llIllllIIllI(58198, 3023)) {
                throw null;
            }

            var3.setBoolean(var10001.field_71439_g, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(58198, 3023)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(58198, 3023)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(58198, 3023)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void __________________________________________________________________________________/* $FF was:                                                                                   */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(42922, 65)) {
                throw null;
            }

                                                                                                                                 .
            setFloat(Class73.., var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(42922, 65)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(42922, 65)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(42922, 65)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static float ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        float var10000;
        try {
            if (llIllllIIllI(37656, 1091)) {
                throw null;
            }

            var10000 =                                                                                                  .
            getFloat(.field_71442_b);
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(37656, 1091)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(37656, 1091)) {
                throw null;
            }

            return -1.0F;
        }

        if (llIllllIIllI(37656, 1091)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(IResourceManagerReloadListener var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(57913, 8709)) {
                throw null;
            }

            ((IReloadableResourceManager).get()).func_110542_a(var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(57913, 8709)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(57913, 8709)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(87534, 2109)) {
                throw null;
            }

            Field var3 = ;
            Minecraft var10001 = ;
            Timer var10002 = new Timer(var0);
            if (llIllllIIllI(87534, 2109)) {
                throw null;
            }

            var3.set(var10001, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(87534, 2109)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(87534, 2109)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(87534, 2109)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    private static boolean llIllllIIllI(int var0, int var1) {
        return var0 >= var1;
    }

    public static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        int var10000;
        try {
            if (llIllllIIllI(80882, 4369)) {
                throw null;
            }

            var10000 =                                                                                          .
            getInt(.field_71439_g);
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(80882, 4369)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(80882, 4369)) {
                throw null;
            }

            return -1;
        }

        if (llIllllIIllI(80882, 4369)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var0, float var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(74235, 2569)) {
                throw null;
            }

            Field var3 = ;
            Float var10002 = var1;
            if (llIllllIIllI(74235, 2569)) {
                throw null;
            }

            var3.set(var0, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(74235, 2569)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(74235, 2569)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(74235, 2569)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */(boolean var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(87666, 8830)) {
                throw null;
            }

            Field var3 = ;
            EntityPlayerSP var10001 =                                                                                                .
            field_71439_g;
            Boolean var10002 = var0;
            if (llIllllIIllI(87666, 8830)) {
                throw null;
            }

            var3.set(var10001, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(87666, 8830)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(87666, 8830)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(87666, 8830)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(60917, 4118)) {
                throw null;
            }

                                                                                         .setInt(.field_71439_g, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(60917, 4118)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(60917, 4118)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(60917, 4118)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _____________________________________________________________________________________________________/* $FF was:                                                                                                      */() {
        boolean var10000;
        try {
            if (llIllllIIllI(12757, 3491)) {
                throw null;
            }

                                                                                                                         .
            invoke();
        } catch (ReflectiveOperationException var1) {
            if (llIllllIIllI(12757, 3491)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(12757, 3491)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(12757, 3491)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void __________________________________________________________________________________________/* $FF was:                                                                                           */(boolean var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(91609, 6418)) {
                throw null;
            }

                                                                                                .
            setBoolean(.field_71442_b, var0);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(91609, 6418)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(91609, 6418)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(91609, 6418)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */(float var0) {
        boolean var10000;
        try {
            if (llIllllIIllI(74750, 6624)) {
                throw null;
            }

            Field var3 = ;
            EntityPlayerSP var10001 =                                                                                                .
            field_71439_g;
            Float var10002 = var0;
            if (llIllllIIllI(74750, 6624)) {
                throw null;
            }

            var3.set(var10001, var10002);
        } catch (ReflectiveOperationException var2) {
            if (llIllllIIllI(74750, 6624)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(74750, 6624)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(74750, 6624)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    private static boolean llIllllIIlll(int var0) {
        return var0 != 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Field var0, Object var1) {
        boolean var10000;
        try {
            if (llIllllIIllI(45842, 5238)) {
                throw null;
            }

            var0.setAccessible(true);
            String var10002 = Class60. ("~}tzq{qa(");
            if (llIllllIIllI(45842, 5238)) {
                throw null;
            }

            Field var2 = Field.class.getDeclaredField(var10002);
            var2.setAccessible(true);
            var2.setInt(var0, var0.getModifiers() & -17);
            var0.set((Object) null, var1);
        } catch (ReflectiveOperationException var3) {
            if (llIllllIIllI(45842, 5238)) {
                throw null;
            }

            if (llIllllIIlll()) {
            }

            if (llIllllIIllI(45842, 5238)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIllllIIllI(45842, 5238)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
