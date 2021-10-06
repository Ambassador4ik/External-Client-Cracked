import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class171 {
    public Minecraft;
    private static int 1893=13351;
    private static int 1510=15821;
    private static int 75349=-4703;
    private static int 4335=1470;
    private static int 3655=19865;
    private static int 60402=-28285;
    private static int 18351=-24766;
    private static int 2005=28507;
    private static int 6427=7323;
    private static int 570=10733;
    private static int 5354=26597;
    private static int 110=14170;
    public boolean;
    private String;
    private static int 9029=3256;
    private static int 31=22776;
    private static int 9758=4461;
    private static int 45548=-4179;
    private Class188;
    private static int 80271=-31518;
    private static int 48641=-11581;
    private static int 36167=-30454;
    private static int 63054=-29093;
    private static int 7926=29905;
    private boolean;
    private static int 9487=-22147;
    private static int 53054=-19895;
    private static int 9696=-23261;
    private static int 5229=11604;
    private static int 65702=-10554;
    private static int 3980=167;
    private static int 72793=-2347;
    public Class28;
    private static int 68521=-6642;
    private static int 4703=17594;
    private static int 79419=-14126;
    private static int 6377=2600;
    private static int 7351=30847;
    private static int 12196=-11591;
    private static int 33160=-23261;
    private static int 91682=-6078;
    private static int 19344=-12982;
    private static int 22788=-3119;
    private static int 9378=19385;
    private static int 63076=-6567;
    private static int 39696=-29794;
    private static int 90799=-19569;
    private static int 8554=11740;
    private static int 3183=14779;
    private static int 9711=11304;
    private static int 19362=-2195;
    public Class4;
    private static int 9419=20352;
    private static int 7312=30696;
    public Class89;
    private static int 31783=-23877;
    private static int 1896=24378;
    private static int 87975=-28990;
    private static int 2246=24126;
    private static int 60827=-27685;
    private static int 5889=26833;
    private static int 28=23771;
    private static int 7416=14223;
    private static int 6574=19165;
    private static int 1945=25799;
    private static int 52625=-3936;
    private String;
    private static int 11342=-24469;
    private static int 30027=-20514;
    private static int 52226=-21080;
    private static int 75786=-21592;
    private static int 79235=-978;
    private static int 9336=9336;
    private static int 5368=9148;
    private static int 3236=13083;
    private static int 71660=-11423;
    private int;
    private static int 8827=-20443;
    private static int 50780=-32196;
    private int;
    private static int 9063=-29224;
    private static int 7156=764;
    private static int 4187=7874;
    private static int 47762=-20832;
    private static int 1071=8667;
    private static int 1215=27979;
    public Class103;
    private static int 3571=1190;
    private static int 75440=-4897;

    static {
        boolean var10000 = true;
    }

    public Class171(String var1, int var2, Class188 var3) {
        if (llIlIIIIIlIl(75786, 3236)) {
            throw null;
        } else {
            Minecraft var10017 = Minecraft.getMinecraft();
            if (llIlIIIIIlIl(75786, 3236)) {
                throw null;
            } else {
                this. = var10017;
                this. = Class73.                                                                                      .;
                Class28 var10015 = new Class28();
                if (llIlIIIIIlIl(75786, 3236)) {
                    throw null;
                } else {
                    this. = var10015;
                    this. = Class73.                                                                                      .
                    ;
                    this. = true;
                    String var10010 = (var1);
                    if (llIlIIIIIlIl(75786, 3236)) {
                        throw null;
                    } else {
                        this. = var10010;
                        this. = var2;
                        this. = 0;
                        this. = var3;
                        this. = false;
                        Class89 var10001 = new Class89(5.0F);
                        if (llIlIIIIIlIl(75786, 3236)) {
                            throw null;
                        } else {
                            this. = var10001;
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    private static boolean llIlIIIIIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIIIIllII(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIIIIlIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIIIlIll(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIIIIlll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlIIIIlIIl(int var0, int var1) {
        return var0 == var1;
    }

    public static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1) {
        Random var10000 = new Random();
        if (llIlIIIIIlIl(47762, 6427)) {
            throw null;
        } else {
            return var10000.nextInt(var1 - var0 + 1) + var0;
        }
    }

    private static boolean llIlIIIIIllI(Object var0) {
        return var0 == null;
    }

    public static String ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var0) {
        String var10001 = Class60. ("{");
        if (llIlIIIIIlIl(91682, 7351)) {
            throw null;
        } else {
            String var10002 = Class60. ("꫱");
            if (llIlIIIIIlIl(91682, 7351)) {
                throw null;
            } else {
                var10002 = Class123. (var10002);
                if (llIlIIIIIlIl(91682, 7351)) {
                    throw null;
                } else {
                    return var0.replace(var10001, var10002);
                }
            }
        }
    }

    public boolean ____________________________________________________________________________/* $FF was:                                                                             */() {
        return this.;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        MinecraftForge.EVENT_BUS.unregister(this);
        this.                                                                                     .(0.0F);
        this.                                                                                     .(0.0F);
        boolean var10000 = true;
    }

    public Class188 ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return this.;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000 = true;
    }

    public boolean __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        return this.;
    }

    public String ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (llIlIIIIlIII(this.) && !llIlIIIIIlll(this..length(),1)){
            if (llIlIIIIIlIl(63054, 7156)) {
                throw null;
            } else {
                StringBuilder var10000 = new StringBuilder();
                if (llIlIIIIIlIl(63054, 7156)) {
                    throw null;
                } else {
                    var10000 = var10000.insert(0, this.);
                    String var10001 = Class60. ("¿z{");
                    if (llIlIIIIIlIl(63054, 7156)) {
                        throw null;
                    } else {
                        return String.valueOf(var10000.append(var10001).append(this.));
                    }
                }
            }
        } else if (llIlIIIIIlIl(63054, 7156)) {
            throw null;
        } else {
            return this.;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(boolean var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        boolean var10000 = true;
    }

    public String _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        StringBuilder var10000 = new StringBuilder();
        if (llIlIIIIIlIl(9487, 5368)) {
            throw null;
        } else {
            String var10002 = Class60. ("¸)G¸8");
            if (llIlIIIIIlIl(9487, 5368)) {
                throw null;
            } else {
                var10000 = var10000.insert(0, var10002).append(this.);
                String var10001 = Class60. ("¿.\u0006");
                if (llIlIIIIIlIl(9487, 5368)) {
                    throw null;
                } else {
                    return String.valueOf(var10000.append(var10001));
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class220... var1) {
        int var2 = 0;
        int var3 = (var1 = var1).length;

        boolean var10001;
        int var4;
        for (int var10000 = var4 = 0; !llIlIIIIIlIl(87975, 9336); var10001 = true) {
            if (!llIlIIIIIlll(var10000, var3)) {
                if (llIlIIIIIlIl(87975, 9336)) {
                    throw null;
                }

                boolean var6 = true;
                return;
            }

            Class220 var5;
            if (llIlIIIIlIIl((var5 = var1[var4]). (), -1)){
                var5. (this. () * 100 + var2);
                ++var2;
            }

            if (llIlIIIIIlIl(87975, 9336)) {
                throw null;
            }

            ++var4;
            Class73.                                                                                      .                                                                                               .
            (var5);
            var10000 = var4;
        }

        throw null;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(String var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        boolean var10001;
        if (llIlIIIIllII(this.)) {
            var10001 = true;
            boolean var10002 = true;
        } else {
            if (llIlIIIIIlIl(52226, 6377)) {
                throw null;
            }

            var10001 = false;
        }

        if (llIlIIIIIlIl(52226, 6377)) {
            throw null;
        } else {
            this. = var10001;
            boolean var10000;
            if (llIlIIIIlIll(this.)) {
                this. ();
                var10000 = true;
            } else if (llIlIIIIIlIl(52226, 6377)) {
                throw null;
            } else {
                this. ();
                var10000 = true;
            }
        }
    }

    public String __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        return this.;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ITextComponent var1) {
        this.                                                                                                    .
        player.sendStatusMessage(var1, false);
        boolean var10000 = true;
    }

    public int ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return this.;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        MinecraftForge.EVENT_BUS.register(this);
        this.                                                                                     .((float) this..
        (this. ()));
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        boolean var10000 = true;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIlIIIIIlIl(90799, 9029)) {
            throw null;
        } else {
            if (llIlIIIIlIII(var10000.player)) {
                var10000 = Minecraft.getMinecraft();
                if (llIlIIIIIlIl(90799, 9029)) {
                    throw null;
                }

                if (!llIlIIIIIllI(var10000.world)) {
                    if (llIlIIIIIlIl(90799, 9029)) {
                        throw null;
                    }

                    return false;
                }
            }

            if (llIlIIIIIlIl(90799, 9029)) {
                throw null;
            } else {
                return true;
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        return true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(long var1) {
        boolean var10000;
        try {
            if (llIlIIIIIlIl(53054, 1945)) {
                throw null;
            }

            Thread.sleep(var1);
            if (llIlIIIIIlIl(53054, 1945)) {
                throw null;
            }
        } catch (InterruptedException var3) {
            if (llIlIIIIIlIl(53054, 1945)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIlIIIIIlIl(53054, 1945)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public boolean _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        return this.;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1) {
        NetHandlerPlayClient var10000 = this.                                                                                                    .
        getConnection();
        CPacketChatMessage var10001 = new CPacketChatMessage(var1);
        if (llIlIIIIIlIl(36167, 1215)) {
            throw null;
        } else {
            var10000.sendPacket(var10001);
            boolean var2 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class171 var1) {
        return var1. ();
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        boolean var10000 = true;
    }

    public String ____________________________________________________________________________/* $FF was:                                                                             */() {
        if (llIlIIIIIllI(this.)) {
            return null;
        } else if (llIlIIIIIlIl(50780, 9378)) {
            throw null;
        } else if (llIlIIIIIlll(this..length(),1)){
            return null;
        } else if (llIlIIIIIlIl(50780, 9378)) {
            throw null;
        } else {
            StringBuilder var10000 = new StringBuilder();
            if (llIlIIIIIlIl(50780, 9378)) {
                throw null;
            } else {
                String var10002 = Class60. ("¿z{");
                if (llIlIIIIIlIl(50780, 9378)) {
                    throw null;
                } else {
                    return String.valueOf(var10000.insert(0, var10002).append(this.));
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Packet var1) {
        this.                                                                                                    .
        getConnection().sendPacket(var1);
        boolean var10000 = true;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */(String var1) {
        EntityPlayerSP var10000 = this.                                                                                                    .
        player;
        TextComponentString var10001 = new TextComponentString(var1);
        if (llIlIIIIIlIl(72793, 9758)) {
            throw null;
        } else {
            var10000.sendStatusMessage(var10001, false);
            boolean var2 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(boolean var1) {
        this. = var1;
        boolean var10000;
        if (llIlIIIIlIll(this.)) {
            this. ();
            var10000 = true;
        } else if (llIlIIIIIlIl(45548, 1510)) {
            throw null;
        } else {
            this. ();
            var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        boolean var10000 = true;
    }

    public int ____________________________________________________________________________/* $FF was:                                                                             */() {
        return this.;
    }

    public Class171 ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return this;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        boolean var10000 = true;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        this. = var1;
        boolean var10000 = true;
    }
}
