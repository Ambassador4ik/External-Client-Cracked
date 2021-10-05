import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import org.lwjgl.input.Keyboard;

public class Class165 {
    private static int 35647=-5060;
    public boolean;
    public Minecraft;
    private static int 67751=-4305;
    private static int 376=32667;
    private static int 41725=-26387;
    private static int 4333=20636;
    private static int 32068=-12633;
    private static int 1677=17627;
    private static int 2892=19689;
    private static int 48811=-14378;
    private static int 4698=15773;
    private static int 6360=16193;
    public Field;
    private static int 7101=26085;
    private static int 43628=-2859;
    private static int 75108=-22354;
    private static int 6193=19726;
    private static int 27427=-18649;
    private static int 22449=-12824;
    private static int 46055=-18817;
    private static int 729=28581;
    private static int 7800=15412;
    private static int 6654=29833;
    private static int 1107=1123;
    private static int 1144=28714;
    private static int 52292=-15070;
    private static int 70=12516;
    public Class28;
    private static int 75593=-2959;
    private static int 8027=19780;
    private static int 66542=-22480;
    private static int 87438=-2423;
    private static int 7146=14859;
    private static int 57893=-10236;
    private static int 7190=26599;
    private static int 1592=12217;
    public static boolean                                                                                              =false;
    private static int 91909=-22854;
    private static int 98850=-13564;
    private static int 96375=-26130;
    private static int 6941=28114;
    private static int 2359=26520;
    private static int 18371=-16976;
    private static int 9090=2209;
    private static int 90982=-2979;
    private static int 89053=-26970;
    private static int 3721=16434;
    public boolean;
    private static int 57412=-31852;
    private static int 86242=-29891;
    private static int 5288=7798;
    private static int 37082=-22408;
    private static int 4637=13715;
    private static int 35044=-23225;
    private static int 4249=29633;
    private static int 848=26133;
    private static int 80744=-16878;
    private static int 810=18961;
    private static int 48204=-18349;
    private static int 87818=-7464;
    private static int 3388=7637;

    static {
        boolean var10000 = true;
    }

    public Class165() {
        if (llIIIllIIIll(80744, 4333)) {
            throw null;
        } else {
            this. = true;
            Field var10005 = Class22. (Minecraft.class, 92);
            if (llIIIllIIIll(80744, 4333)) {
                throw null;
            } else {
                this. = var10005;
                Minecraft var10004 = Minecraft.func_71410_x();
                if (llIIIllIIIll(80744, 4333)) {
                    throw null;
                } else {
                    this. = var10004;
                    this. = false;
                    Class28 var10001 = new Class28();
                    if (llIIIllIIIll(80744, 4333)) {
                        throw null;
                    } else {
                        this. = var10001;
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean ____________________________________________________________________________/* $FF was:                                                                             */(Class171 var0) {
        return var0. ();
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class171 var0) {
        return var0. ();
    }

    private static boolean llIIIllIlIlI(Object var0) {
        return var0 != null;
    }

    private static boolean llIIIllIllll(Object var0) {
        return var0 == null;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    private static boolean llIIIllIlIIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIIllllIII(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean _________________________________________________________________________________/* $FF was:                                                                                  */(Class171 var0) {
        return var0. ();
    }

    private static boolean llIIIlllIllI(int var0) {
        return var0 <= 0;
    }

    private static boolean __________________________________________________________________________________/* $FF was:                                                                                   */(Class171 var0) {
        return var0. ();
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    private static boolean _____________________________________________________________________________________/* $FF was:                                                                                      */(Class171 var0) {
        return var0. ();
    }

    private static boolean llIIIllIlIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIIlllIlll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    private static boolean llIIIlllIIlI(int var0) {
        return var0 > 0;
    }

    private static boolean llIIIllIlIll(int var0, int var1) {
        return var0 < var1;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    private static boolean llIIIllIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Post var0, Class171 var1) {
        var1. ((RenderGameOverlayEvent) var0);
        boolean var10000 = true;
    }

    private static boolean __________________________________________________________________________________________/* $FF was:                                                                                           */(Class171 var0) {
        return var0. ();
    }

    private static boolean llIIIlllIlII(int var0) {
        return var0 >= 0;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class171 var0) {
        var0. ();
        boolean var10000 = true;
    }

    private static boolean llIIIllIllII(int var0) {
        return var0 < 0;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, Class171 var1) {
        if (llIIIllllIII(var1. (), var0)){
            return true;
        } else if (llIIIllIIIll(32068, 1144)) {
            throw null;
        } else {
            return false;
        }
    }

    private static boolean llIIIllIllIl(int var0) {
        return var0 == 0;
    }

    private static void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var0, Class171 var1) {
        var1. (var0);
        boolean var10000 = true;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ClientTickEvent var1) {
        boolean var9;
        if (llIIIllIlIII(this. ())){
                                                                                                      =false;
            var9 = true;
        } else if (llIIIllIIIll(90982, 4637)) {
            throw null;
        } else {
            if (llIIIllIllIl()) {
                new Class164(Class73..                                                                                                )
                ;
                if (llIIIllIIIll(90982, 4637)) {
                    throw null;
                }

                                                                                                         =true;
            }

            if (llIIIllIIIll(90982, 4637)) {
                throw null;
            } else {
                if (llIIIllIllIl(this..field_71456_v instanceof Class124)){
                    Minecraft var10002 = this.;
                    Class124 var10003 = new Class124(this.);
                    if (llIIIllIIIll(90982, 4637)) {
                        throw null;
                    }

                    Class22. (Minecraft.class, 45, var10002, var10003);
                    if (llIIIllIIIll(90982, 4637)) {
                        throw null;
                    }
                }

                if (llIIIllIIIll(90982, 4637)) {
                    throw null;
                } else {
                    if (llIIIllIllIl(this..field_71456_v.func_146158_b() instanceof Class102)){
                        Class22. ();
                        if (llIIIllIIIll(90982, 4637)) {
                            throw null;
                        }
                    }

                    if (llIIIllIIIll(90982, 4637)) {
                        throw null;
                    } else {
                        Class206 var2;
                        if (llIIIllIllIl(this..field_71466_p instanceof Class206)){
                            Class206 var10000 = new Class206;
                            GameSettings var10 = this.                                                                                                   .
                            field_71474_y;
                            ResourceLocation var11 = new ResourceLocation;
                            String var10005 = Class60. ("xhwx}\u007fn\u007f+khbt\"b\u007f\u007fdv\"hc<");
                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            }

                            var11.<init> (var10005);
                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            }

                            var10000.<init> (var10, var11, this.                                                                                                   .
                            field_71446_o, false);
                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            }

                            var2 = var10000;
                            if (llIIIllIlIlI(this..field_71474_y.field_74363_ab)){
                                var2.func_78264_a(this..func_152349_b());
                                var2.func_78275_b(this..func_135016_M().func_135044_b());
                            }

                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            }

                            Class22. ((IResourceManagerReloadListener) var2);
                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            }

                            this.                                                                                                   .
                            field_71466_p = var2;
                        }

                        if (llIIIllIIIll(90982, 4637)) {
                            throw null;
                        } else {
                            if (llIIIllIllIl(this..field_71460_t instanceof Class25)){
                                if (llIIIllIllll(Class73..) &&llIIIllIlIlI(this..field_71460_t)){
                                    Class73.                                                                                      .                                                                                         =
                                    this.                                                                                                   .
                                    field_71460_t;
                                    Class73 var6 = Class73.;
                                    Class25 var10001 = new Class25(this., this..func_110442_L());
                                    if (llIIIllIIIll(90982, 4637)) {
                                        throw null;
                                    }

                                    var6. = var10001;
                                }

                                if (llIIIllIIIll(90982, 4637)) {
                                    throw null;
                                }

                                this.                                                                                                   .
                                field_71460_t = Class73.                                                                                      .
                                ;
                                Class22. ();
                                if (llIIIllIIIll(90982, 4637)) {
                                    throw null;
                                }
                            }

                            if (llIIIllIIIll(90982, 4637)) {
                                throw null;
                            } else {
                                if (llIIIllIllIl(this..func_175599_af() instanceof Class136)){
                                    label168:
                                    {
                                        try {
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }

                                            var2 = null;
                                            Field var7 = Class22. (Minecraft.class, 89);
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }

                                            ModelManager var5 = (ModelManager) var7.get(this.);
                                            Class136 var8 = new Class136(this..func_110434_K(), var5, this.                                                                                                   .
                                            getItemColors());
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }

                                            Class136 var3 = var8;
                                            Class22. ((IResourceManagerReloadListener) var3);
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }

                                            Class73.                                                                                      .                                                                                              =
                                            var3;
                                            var7 = Class22. (Minecraft.class, 25);
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }

                                            var7.set(this., var3);
                                        } catch (Exception var4) {
                                            if (llIIIllIIIll(90982, 4637)) {
                                                throw null;
                                            }
                                            break label168;
                                        }

                                        if (llIIIllIIIll(90982, 4637)) {
                                            throw null;
                                        }

                                        var9 = true;
                                    }
                                }

                                if (llIIIllIIIll(90982, 4637)) {
                                    throw null;
                                } else {
                                    Class73.                                                                                      .                                                                                .                                                                                                   .
                                    stream().filter(Class165::).forEach(Class165::);
                                    var9 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Post var1) {
        if (llIIIllIllIl(this.) && llIIIllIlIIl(var1.getType(), ElementType.ALL)) {
            Class131. ();
            if (llIIIllIIIll(57893, 729)) {
                throw null;
            }

            this. = true;
        }

        if (llIIIllIIIll(57893, 729)) {
            throw null;
        } else {
            boolean var10000;
            if (llIIIllIllIl(this. ()) &&llIIIllIlIII(this.) && !llIIIlllIlll(var1.getType(), ElementType.ALL)){
                if (llIIIllIIIll(57893, 729)) {
                    throw null;
                } else {
                    Class73.                                                                                      .                                                                                .                                                                                                   .
                    stream().filter(Class165::).forEach(Class165::);
                    var10000 = true;
                }
            } else if (llIIIllIIIll(57893, 729)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerSPPushOutOfBlocksEvent var1) {
        boolean var10000;
        if (llIIIllIlIII(this. ())){
            var10000 = true;
        } else if (llIIIllIIIll(87438, 3721)) {
            throw null;
        } else {
            Class73.                                                                                      .                                                                                .                                                                                                   .
            stream().filter(Class165::).forEach(Class165::);
            var10000 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        boolean var10000;
        if (llIIIllIllIl(this. ()) &&!llIIIllIllIl(Class73..                                                                                                .                                                                                  ))
        {
            if (llIIIllIIIll(86242, 6193)) {
                throw null;
            } else {
                Class73.                                                                                      .                                                                                .                                                                                                   .
                stream().filter(Class165::).forEach(Class165::);
                var10000 = true;
            }
        } else if (llIIIllIIIll(86242, 6193)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        boolean var10000;
        if (llIIIllIlIII(this. ())){
            var10000 = true;
        } else if (llIIIllIIIll(41725, 4249)) {
            throw null;
        } else {
            Class73.                                                                                      .                                                                                .                                                                                                   .
            stream().filter(Class165::).forEach(Class165::);
            float var3;
            if (llIIIllIlIIl(var1.phase, Phase.END) && llIIIllIlIlI(var1.player) && llIIIllIlIll(var1.player.func_145782_y(), -1) && llIIIllIllII((var3 = var1.player.func_70032_d(this..field_71439_g) - 4.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1)))
            {
                float[] var10004 = Class13. (var1.player, this.                                                                                                   .
                field_71439_g);
                if (llIIIllIIIll(41725, 4249)) {
                    throw null;
                }

                float[] var2 = var10004;
                var1.player.field_70125_A = var2[1];
                var1.player.func_70034_d(var2[0]);
                var1.player.field_70177_z = var2[0];
                if (llIIIllIllIl(var1.player.field_70173_aa % 12)) {
                    var1.player.func_70652_k(this..field_71439_g);
                    var1.player.func_184609_a(EnumHand.MAIN_HAND);
                    var1.player.func_184821_cY();
                    this.                                                                                                   .
                    field_71439_g.func_184185_a((SoundEvent) SoundEvent.field_187505_a.func_148754_a(359), 100.0F, 1.0F);
                }
            }

            if (llIIIllIIIll(41725, 4249)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (llIIIllIlIlI(this..field_71439_g) &&!llIIIllIllll(this..field_71441_e)){
            if (llIIIllIIIll(46055, 376)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIIIllIIIll(46055, 376)) {
            throw null;
        } else {
            return true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        int var3 = 1;
        if (llIIIllIlIII(this. ())){
            return true;
        } else if (llIIIllIIIll(27427, 1677)) {
            throw null;
        } else if (llIIIllIllll(var1)) {
            return true;
        } else if (llIIIllIIIll(27427, 1677)) {
            throw null;
        } else {
            Iterator var4 = Class73.                                                                                      .                                                                                .
            ().iterator();

            while (!llIIIllIIIll(27427, 1677)) {
                if (!llIIIllIlIII(var4.hasNext())) {
                    if (llIIIllIIIll(27427, 1677)) {
                        throw null;
                    }

                    if (llIIIllIlIII(var3)) {
                        Class73.                                                                                      .                                                                                                     .
                        (var2);
                    }

                    if (llIIIllIIIll(27427, 1677)) {
                        throw null;
                    }

                    return (boolean) var3;
                }

                Class171 var5;
                if (llIIIllIlIII((var5 = (Class171) var4.next()). ())){
                    var3 &= var5. (var1, var2);
                    boolean var10000 = true;
                }
            }

            throw null;
        }
    }

    @SubscribeEvent
    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000;
        if (llIIIllIlIII(this. ())){
            var10000 = true;
        } else if (llIIIllIIIll(48811, 7146)) {
            throw null;
        } else {
            if (llIIIlllIIlI(Class29..size()) &&llIIIllIlIlI(Class73..                                                                                               ) &&
            llIIIlllIIlI(Class73..                                                                                               .
            ().size())){
                int var2 = ((Class19) Class29..get(0)).() - 3;
                Iterator var3 = Class73.                                                                                      .                                                                                               .
                ().iterator();

                while (true) {
                    if (llIIIllIIIll(48811, 7146)) {
                        throw null;
                    }

                    if (!llIIIllIlIII(var3.hasNext())) {
                        break;
                    }

                    Class220 var4;
                    if (llIIIllIlIII((var4 = (Class220) var3.next()). ()) &&llIIIllIlIII(var4. ())){
                        double var6;
                        if (llIIIlllIlII((var6 = var4. () - (double) var2) ==0.0D ? 0 : (var6 < 0.0D ? -1 : 1))){
                            var4. (3.0D);
                        }

                        if (llIIIllIIIll(48811, 7146)) {
                            throw null;
                        }

                        double var7;
                        if (llIIIllIllII((var7 = var4. () - 3.0D) ==0.0D ? 0 : (var7 < 0.0D ? -1 : 1))){
                            var4. (3.0D);
                        }

                        if (llIIIllIIIll(48811, 7146)) {
                            throw null;
                        }

                        var4. (var4. () + 0.10000000149011612D);
                        Color var10001 = Color.getHSBColor((float) (var4. () - 3.0D) /(float) (var2 - 4), 1.0F, 1.0F);
                        if (llIIIllIIIll(48811, 7146)) {
                            throw null;
                        }

                        var4. (var10001);
                        var10000 = true;
                    }
                }
            }

            if (llIIIllIIIll(48811, 7146)) {
                throw null;
            } else {
                Class220 var5 = Class75. (24);
                if (llIIIllIIIll(48811, 7146)) {
                    throw null;
                } else {
                    Class73. = var5. ();
                    Class73.                                                                                      .                                                                                .                                                                                                   .
                    forEach(Class165::);
                    var10000 = true;
                }
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        boolean var10000;
        if (llIIIllIlIII(this. ())){
            var10000 = true;
        } else if (llIIIllIIIll(37082, 2359)) {
            throw null;
        } else {
            Class73.                                                                                      .                                                                                .                                                                                                   .
            stream().filter(Class165::).forEach(Class165::);
            var10000 = true;
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(KeyInputEvent var1) {
        boolean var3;
        if (llIIIllIllIl(this. ())){
            byte var10000 = Class73. ();
            if (llIIIllIIIll(91909, 70)) {
                throw null;
            }

            if (!llIIIllIlIII(var10000)) {
                if (llIIIllIIIll(91909, 70)) {
                    throw null;
                }

                var10000 = Keyboard.isCreated();
                if (llIIIllIIIll(91909, 70)) {
                    throw null;
                }

                if (llIIIllIlIII(var10000)) {
                    var10000 = Keyboard.getEventKeyState();
                    if (llIIIllIIIll(91909, 70)) {
                        throw null;
                    }

                    if (llIIIllIlIII(var10000)) {
                        int var4 = Keyboard.getEventKey();
                        if (llIIIllIIIll(91909, 70)) {
                            throw null;
                        }

                        int var2 = var4;
                        if (llIIIlllIllI(var4)) {
                            var3 = true;
                            return;
                        }

                        if (llIIIllIIIll(91909, 70)) {
                            throw null;
                        }

                        Class73.                                                                                      .                                                                                .                                                                                                   .
                        stream().filter(Class165::).forEach(Class165::);
                    }
                }

                if (llIIIllIIIll(91909, 70)) {
                    throw null;
                }

                var3 = true;
                return;
            }
        }

        if (llIIIllIIIll(91909, 70)) {
            throw null;
        } else {
            var3 = true;
        }
    }
}
