import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.GameType;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class193 extends Class171 {
    private static int 28014=-20400;
    private static int 83781=-3891;
    public Class220;
    private static int 4487=7066;
    private static int 95830=-16760;
    private static int 69154=-1312;
    public Class220;
    public Class220;
    private static int 12185=-31206;
    private static int 3690=2964;
    private static int 39410=-4436;
    private static int 61889=-30359;
    private static int 7447=470;
    private static int 3612=1568;
    private static int 9041=10636;
    private static int 5511=12005;
    private static int 77791=-31258;
    private static int 2045=9236;
    private static int 1082=4827;
    private static int 557=31379;
    private static int 53802=-19934;
    private static int 71788=-1590;
    private static int 93977=-21089;
    private static int 7067=10776;
    public List;
    private static int 4397=25461;

    static {
        boolean var10000 = true;
    }

    public Class193() {
        String var10002 = Class60. ("[u9nw;_:}/");
        if (lllIllllIIII(77791, 2045)) {
            throw null;
        } else {
            super(var10002, 33, Class188.);
            if (lllIllllIIII(77791, 2045)) {
                throw null;
            } else {
                ArrayList var2 = new ArrayList();
                if (lllIllllIIII(77791, 2045)) {
                    throw null;
                } else {
                    this. = var2;
                    Class220 var10001 = new Class220;
                    String var10003 = Class60. ("Rq<{>");
                    if (lllIllllIIII(77791, 2045)) {
                        throw null;
                    } else {
                        String[] var10005 = new String[3];
                        String var10008 = Class60. ("Lx9");
                        if (lllIllllIIII(77791, 2045)) {
                            throw null;
                        } else {
                            var10005[0] = var10008;
                            var10008 = Class60. ("Wzmhw#");
                            if (lllIllllIIII(77791, 2045)) {
                                throw null;
                            } else {
                                var10005[1] = var10008;
                                var10008 = Class60. ("L\u007ftwRun>");
                                if (lllIllllIIII(77791, 2045)) {
                                    throw null;
                                } else {
                                    var10005[2] = var10008;
                                    var10001.<init> (var10003, this, var10005);
                                    if (lllIllllIIII(77791, 2045)) {
                                        throw null;
                                    } else {
                                        this. = var10001;
                                        Class220 var10004 = new Class220;
                                        String var10006 = Class60. ("Sq<p0");
                                        if (lllIllllIIII(77791, 2045)) {
                                            throw null;
                                        } else {
                                            var10004.<init> (var10006, this, 3.0D, 1.0D, 20.0D, true);
                                            if (lllIllllIIII(77791, 2045)) {
                                                throw null;
                                            } else {
                                                this. = var10004;
                                                Class220 var3 = new Class220;
                                                String var1 = Class60. ("Xx?py=\"");
                                                if (lllIllllIIII(77791, 2045)) {
                                                    throw null;
                                                } else {
                                                    var3.<init> (var1, this, 4.0D, 0.0D, 20.0D, true);
                                                    if (lllIllllIIII(77791, 2045)) {
                                                        throw null;
                                                    } else {
                                                        this. = var3;
                                                        this. ((Class220[]) (new Class220[]{this., this., this.}));
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

    private static boolean lllIlllIllll(int var0) {
        return var0 != 0;
    }

    private static boolean lllIllllIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlllllIII(int var0, int var1) {
        return var0 > var1;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var0) {
        return 1;
    }

    private static boolean lllIllllIIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(NetworkPlayerInfo var0) {
        return 1;
    }

    private static boolean lllIllllllIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var0, NetworkPlayerInfo var1) {
        return var1.func_178845_a().getName().equals(var0.func_70005_c_());
    }

    private static boolean lllIllllIlIl(int var0) {
        return var0 >= 0;
    }

    private static boolean lllIlllllIlI(Object var0) {
        return var0 == null;
    }

    private static boolean lllIlllllIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIllllIllI(int var0) {
        return var0 == 0;
    }

    private static boolean lllIllllIlll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIlllllIll(int var0) {
        return var0 > 0;
    }

    private static boolean lllIllllIlII(int var0) {
        return var0 <= 0;
    }

    private static boolean lllIllllllII(int var0) {
        return var0 < 0;
    }

    private static boolean lllIllllIIlI(Object var0) {
        return var0 != null;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var0) {
        if (lllIllllIllI(var0.func_190926_b()) && lllIllllIllI(var0.func_77948_v())) {
            return true;
        } else if (lllIllllIIII(61889, 3690)) {
            throw null;
        } else {
            return false;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        StringBuilder var10002 = new StringBuilder();
        if (lllIllllIIII(69154, 3612)) {
            throw null;
        } else {
            this. (String.valueOf(var10002.append(this.. ()).append("")));
            String var10000 = this.                                                                                                   .
            ();
            String var10001 = Class60. ("Wzmhw#");
            if (lllIllllIIII(69154, 3612)) {
                throw null;
            } else {
                int var6;
                int var9;
                boolean var10;
                boolean var12;
                String var15;
                if (!lllIlllIllll(var10000.equals(var10001))) {
                    if (lllIllllIIII(69154, 3612)) {
                        throw null;
                    }

                    var10000 = this.                                                                                                   .
                    ();
                    var10001 = Class60. ("L\u007ftwRun>");
                    if (lllIllllIIII(69154, 3612)) {
                        throw null;
                    }

                    if (lllIlllIllll(var10000.equals(var10001))) {
                        var9 = var6 = 0;

                        while (true) {
                            if (lllIllllIIII(69154, 3612)) {
                                throw null;
                            }

                            if (!lllIlllllIIl(var9, this..field_71441_e.field_73010_i.size())){
                                break;
                            }

                            EntityPlayer var7;
                            if (lllIllllIIlI(var7 = (EntityPlayer) this..field_71441_e.field_73010_i.get(var6)) &&
                            lllIlllIllll(var7.func_82150_aj()) && lllIlllllIIl(var7.field_70173_aa, 10)){
                                var15 = Class60. ("½-[uj;ºy7h1½ ipweml:&LhvnVnhcr");
                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                var15 = String.format(var15, var7.func_70005_c_());
                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                this. (var7, var15);
                            }

                            if (lllIllllIIII(69154, 3612)) {
                                throw null;
                            }

                            ++var6;
                            var9 = var6;
                            var12 = true;
                        }
                    }
                } else {
                    var9 = var6 = 0;

                    while (true) {
                        if (lllIllllIIII(69154, 3612)) {
                            throw null;
                        }

                        if (!lllIlllllIIl(var9, this..size())){
                            break;
                        }

                        Class79 var2;
                        if (lllIlllllIlI((var2 = (Class79) this..get(var6)).)){
                            this.                                                                                  .
                            remove(var6);
                            var10 = true;
                        } else{
                            if (lllIllllIIII(69154, 3612)) {
                                throw null;
                            }

                            long var11 = System.currentTimeMillis();
                            if (lllIllllIIII(69154, 3612)) {
                                throw null;
                            }

                            long var17;
                            if (lllIlllllIll((var17 = var11 - var2. - 10000L) == 0L ? 0 : (var17 < 0L ? -1 : 1))) {
                                this.                                                                                  .
                                remove(var6);
                                var10 = true;
                            } else {
                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                double var3;
                                byte var13;
                                double var18;
                                double var19;
                                if (lllIllllllII((var18 = (var3 = (double) this..field_71439_g.func_70032_d(var2.)) - var2.) == 0.0D ? 0 : (var18 < 0.0D ? -1 : 1)) &&
                                lllIlllllIll((var19 = var3 - 3.0D) == 0.0D ? 0 : (var19 < 0.0D ? -1 : 1))){
                                    var13 = 1;
                                    var12 = true;
                                } else{
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var13 = 0;
                                }

                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                byte var5 = var13;
                                double var16 = Class199. (var2.);
                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                double var20;
                                if (lllIlllllIll((var20 = var16 - 4.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1))) {
                                    var13 = 1;
                                    var12 = true;
                                } else {
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var13 = 0;
                                }

                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                byte var8 = var13;
                                if (lllIllllllIl(var2..field_71071_by.field_70460_b.stream().filter(Class193::).mapToInt(Class193::).sum(),
                                4) &&lllIllllIllI(var2..field_71071_by.func_70448_g().func_190926_b())){
                                    var13 = 1;
                                    var12 = true;
                                } else{
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var13 = 0;
                                }

                                if (lllIllllIIII(69154, 3612)) {
                                    throw null;
                                }

                                byte var4 = var13;
                                EntityPlayer var14;
                                if (lllIlllIllll(var5 & var8 & var4)) {
                                    var14 = var2.;
                                    var15 = Class60. ("¼,Ztk:»x6i0¼!hqvdlm;'Wmoqsxr");
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var15 = String.format(var15, var2..func_70005_c_());
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    this. (var14, var15);
                                    var10 = true;
                                } else {
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var16 = Class123. (this..field_71439_g.field_70163_u - var2.                                                                                                   .
                                    field_70163_u);
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var10000 = String.valueOf(var16);
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    var10001 = Class60. ("\u001e");
                                    if (lllIllllIIII(69154, 3612)) {
                                        throw null;
                                    }

                                    if (lllIlllIllll(var10000.contains(var10001))) {
                                        var14 = var2.;
                                        var15 = Class60. ("£3Ekt%¤g)v/£>wni{sr$8G|pZd|pwwr");
                                        if (lllIllllIIII(69154, 3612)) {
                                            throw null;
                                        }

                                        var15 = String.format(var15, var2..func_70005_c_());
                                        if (lllIllllIIII(69154, 3612)) {
                                            throw null;
                                        }

                                        this. (var14, var15);
                                        var10 = true;
                                    }
                                }
                            }
                        }

                        if (lllIllllIIII(69154, 3612)) {
                            throw null;
                        }

                        ++var6;
                        var9 = var6;
                        var12 = true;
                    }
                }

                if (lllIllllIIII(69154, 3612)) {
                    throw null;
                } else {
                    var10 = true;
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityPlayer var1, String var2) {
        int var10000 = 0;
        this.                                                                                                   .
        (Class172., this. (), var2, 1500);
        this.                                                                                                    .
        field_71441_e.func_72900_e(var1);
        this. (var2);

        boolean var10001;
        for (int var3 = 0; !lllIllllIIII(95830, 1082); var10001 = true) {
            if (!lllIlllllIIl(var10000, this..size())){
                if (lllIllllIIII(95830, 1082)) {
                    throw null;
                }

                boolean var4 = true;
                return;
            }

            if (lllIllllIlll(((Class79) this..get(var3)).                                                                                                   ,
            var1)){
                this.                                                                                  .remove(var3);
            }

            if (lllIllllIIII(95830, 1082)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        String var10002 = this.                                                                                                   .
        ();
        String var10003 = Class60. ("Wzmhw#");
        if (lllIllllIIII(12185, 4487)) {
            throw null;
        } else {
            boolean var2 = var10002.equals(var10003);
            this.                                                                                            .(var2);
            this.                                                                              .(var2);
            boolean var10000 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityJoinWorldEvent var1) {
        boolean var19;
        if (lllIlllIllll(this. ())){
            var19 = true;
        } else if (lllIllllIIII(28014, 4397)) {
            throw null;
        } else {
            Entity var10;
            if (lllIllllIIlI(var10 = var1.getEntity()) && lllIlllIllll(var10 instanceof EntityPlayer) && lllIllllIIll(var10, this..field_71439_g))
            {
                EntityPlayer var2 = (EntityPlayer) var10;
                double var3 = (double) this.                                                                                                    .
                field_71439_g.func_70032_d(var10);
                NetworkPlayerInfo var11 = this.                                                                                                    .
                func_147114_u().func_175102_a(var2.func_110124_au());
                byte var10000;
                boolean var10001;
                double var20;
                double var21;
                if (lllIllllIlII((var20 = var3 - 16.0D) == 0.0D ? 0 : (var20 < 0.0D ? -1 : 1)) && lllIllllIlIl((var21 = var3 - 10.0D) == 0.0D ? 0 : (var21 < 0.0D ? -1 : 1))) {
                    var10000 = 1;
                    var10001 = true;
                } else {
                    if (lllIllllIIII(28014, 4397)) {
                        throw null;
                    }

                    var10000 = 0;
                }

                if (lllIllllIIII(28014, 4397)) {
                    throw null;
                }

                byte var5 = var10000;
                float var22;
                if (lllIllllIllI((var22 = var2.func_110143_aJ() - 20.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1))) {
                    var10000 = 1;
                    var10001 = true;
                } else {
                    if (lllIllllIIII(28014, 4397)) {
                        throw null;
                    }

                    var10000 = 0;
                }

                if (lllIllllIIII(28014, 4397)) {
                    throw null;
                }

                byte var6 = var10000;
                if (lllIllllIlll(var11.func_178848_b(), GameType.SURVIVAL)) {
                    var10000 = 1;
                    var10001 = true;
                } else {
                    if (lllIllllIIII(28014, 4397)) {
                        throw null;
                    }

                    var10000 = 0;
                }

                if (lllIllllIIII(28014, 4397)) {
                    throw null;
                }

                byte var12 = var10000;
                byte var14 = Class13. (var2, this.                                                                                                    .
                field_71439_g, (float) this.                                                                                            .
                ());
                if (lllIllllIIII(28014, 4397)) {
                    throw null;
                }

                byte var7;
                byte var16;
                label191:
                {
                    byte var9;
                    var7 = var14;
                    String var8 = this.                                                                                                   .
                    ();
                    var9 = -1;
                    String var15;
                    label164:
                    switch (var8.hashCode()) {
                        case -1997372447:
                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            while (!lllIllllIIII(28014, 4397)) {
                                if (lllIllllIllI(0)) {
                                    var15 = Class60. ("Wzmhw#");
                                    if (lllIllllIIII(28014, 4397)) {
                                        throw null;
                                    }

                                    if (lllIlllIllll(var8.equals(var15))) {
                                        var9 = 1;
                                    }
                                    break label164;
                                }

                                if (lllIllllIIII(28014, 4397)) {
                                    throw null;
                                }

                                var10001 = true;
                            }

                            throw null;
                        case 83829:
                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            var15 = Class60. ("Lx9");
                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            if (lllIlllIllll(var8.equals(var15))) {
                                byte var13;
                                var16 = var13 = 0;
                                var10001 = true;
                                break label191;
                            }
                    }

                    if (lllIllllIIII(28014, 4397)) {
                        throw null;
                    }

                    var16 = var9;
                }

                if (lllIllllIIII(28014, 4397)) {
                    throw null;
                }

                label135:
                switch (var16) {
                    case 0:
                        if (lllIllllIIII(28014, 4397)) {
                            throw null;
                        }

                        while (!lllIllllIIII(28014, 4397)) {
                            if (lllIllllIllI(0)) {
                                if (lllIlllllIII(this..func_147114_u().func_175106_d().stream().filter(Class193::).mapToInt(Class193::).sum(),
                                1)){
                                    String var10002 = Class60. ("¤4Bls\"£`.q(¤9pin|tu#?Vuar");
                                    if (lllIllllIIII(28014, 4397)) {
                                        throw null;
                                    }

                                    var10002 = String.format(var10002, var2.func_70005_c_());
                                    if (lllIllllIIII(28014, 4397)) {
                                        throw null;
                                    }

                                    this. (var2, var10002);
                                    var19 = true;
                                    return;
                                }
                                break label135;
                            }

                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            var10001 = true;
                        }

                        throw null;
                    case 1:
                        if (lllIllllIIII(28014, 4397)) {
                            throw null;
                        }

                        if (lllIlllIllll(var5 & var6 & var12 & var7)) {
                            List var18 = this.;
                            Class79 var17 = new Class79;
                            long var10006 = System.currentTimeMillis();
                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            var17.<init> (this, var2, var3, var10006);
                            if (lllIllllIIII(28014, 4397)) {
                                throw null;
                            }

                            var18.add(var17);
                        }
                }
            }

            if (lllIllllIIII(28014, 4397)) {
                throw null;
            } else {
                var19 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
