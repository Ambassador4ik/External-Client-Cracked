import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Class29 extends GuiScreen {
    private static int 3502=3502;
    public Class4;
    public Class38;
    private static int 90575=-21895;
    private static int 8891=9270;
    private static int 578=32472;
    private static int 4733=24622;
    private static int 2162=24769;
    private static int 91746=-1269;
    private static int 54161=-32034;
    private static int 73015=-23909;
    public static ArrayList;
    private static int 93282=-2824;
    private static int 78283=-22884;
    private static int 28346=-32655;
    private static int 67230=-29416;
    private static int 93519=-24115;
    private static int 7097=11203;
    private static int 57453=-16730;
    public Class28;
    private static int 8731=16101;
    private static int 95453=-6153;
    private static int 2707=23849;
    private static int 580=23876;
    private static int 9202=20184;
    private static int 6774=13763;
    private static int 1997=12570;
    private static int 18628=-2726;

    static {
        boolean var10000 = true;
    }

    public Class29() {
        if (lllIIIIlIlll(93519, 2707)) {
            throw null;
        } else {
            Class28 var10004 = new Class28();
            if (lllIIIIlIlll(93519, 2707)) {
                throw null;
            } else {
                this. = var10004;
                this. = Class73.                                                                                      .;
                Class171 var10001 = Class133. (13);
                if (lllIIIIlIlll(93519, 2707)) {
                    throw null;
                } else {
                    this. = (Class38) var10001;
                    ArrayList var10000 = new ArrayList();
                    if (lllIIIIlIlll(93519, 2707)) {
                        throw null;
                    } else {
                                                                                                               =
                        var10000;
                        int var1 = 2;
                        Class188[] var7 = Class188.values();
                        if (lllIIIIlIlll(93519, 2707)) {
                            throw null;
                        } else {
                            Class188[] var2 = var7;
                            int var3 = var7.length;

                            int var4;
                            boolean var10;
                            for (int var8 = var4 = 0; !lllIIIIlIlll(93519, 2707); var10 = true) {
                                if (!lllIIIIllIIl(var8, var3)) {
                                    if (lllIIIIlIlll(93519, 2707)) {
                                        throw null;
                                    }

                                    boolean var11 = true;
                                    return;
                                }

                                Class188 var5 = var2[var4];
                                Class19 var9 = new Class19(var5);
                                if (lllIIIIlIlll(93519, 2707)) {
                                    throw null;
                                }

                                Class19 var6 = var9;
                                var9. (var1);
                                                                                                                    .
                                add(var6);
                                int var10002 = var6. ();
                                ++var4;
                                var1 += var10002 + 2;
                                var8 = var4;
                            }

                            throw null;
                        }
                    }
                }
            }
        }
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1, int var2, Class5 var3) {
        var3. (var0, var1, var2);
        boolean var10000 = true;
    }

    private static boolean lllIIIIlIlll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIIllIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIIIIlllII(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIIIllIlI(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIIIlllIl(Object var0) {
        return var0 == null;
    }

    private static boolean lllIIIIllIII(int var0) {
        return var0 >= 0;
    }

    private static boolean lllIIIIllllI(int var0, int var1) {
        return var0 == var1;
    }

    private static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1, Class5 var2) {
        var2. (var0, var1);
        boolean var10000 = true;
    }

    private static boolean lllIIIIllIll(Object var0) {
        return var0 != null;
    }

    public void onGuiClosed() {
        if (lllIIIIllIlI(this.mc.entityRenderer.isShaderActive())) {
            this.mc.entityRenderer.stopUseShader();
        }

        if (lllIIIIlIlll(18628, 578)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void mouseClicked(int var1, int var2, int var3) throws IOException {
        int var4 = 0;
        boolean var10000;
        if (lllIIIIllIlI(this.. (100))){
            Iterator var5 =                                                                                             .
            iterator();

            label103:
            while (true) {
                Class19 var6;
                do {
                    do {
                        if (lllIIIIlIlll(78283, 4733)) {
                            throw null;
                        }

                        if (!lllIIIIllIlI(var5.hasNext())) {
                            if (lllIIIIlIlll(78283, 4733)) {
                                throw null;
                            }

                            this.                                                                                                   .
                            ();
                            break label103;
                        }

                        if (lllIIIIllIlI((var6 = (Class19) var5.next()). (var1, var2)) &&lllIIIIlllII(var3)){
                            if (lllIIIIlllII(var4)) {
                                Collections.swap(,.indexOf(var6), 0);
                                if (lllIIIIlIlll(78283, 4733)) {
                                    throw null;
                                }

                                var6. (true);
                                var6. = var1 - var6. ();
                                var6. = var2 - var6. ();
                            }

                            if (lllIIIIlIlll(78283, 4733)) {
                                throw null;
                            }

                            ++var4;
                        }

                        if (lllIIIIlIlll(78283, 4733)) {
                            throw null;
                        }

                        if (lllIIIIllIlI(var6. (var1, var2)) &&lllIIIIllllI(var3, 1)){
                            boolean var10001;
                            if (lllIIIIlllII(var6. ())){
                                var10001 = true;
                                boolean var10002 = true;
                            } else{
                                if (lllIIIIlIlll(78283, 4733)) {
                                    throw null;
                                }

                                var10001 = false;
                            }

                            if (lllIIIIlIlll(78283, 4733)) {
                                throw null;
                            }

                            var6. (var10001);
                        }

                        if (lllIIIIlIlll(78283, 4733)) {
                            throw null;
                        }
                    } while (!lllIIIIllIlI(var6. ()));
                } while (!lllIIIIlllII(var6. ().isEmpty()));

                Iterator var7 = var6. ().iterator();

                while (!lllIIIIlIlll(78283, 4733)) {
                    if (!lllIIIIllIlI(var7.hasNext())) {
                        if (lllIIIIlIlll(78283, 4733)) {
                            throw null;
                        }

                        var6. ().forEach(Class29::);
                        var10000 = true;
                        continue label103;
                    }

                    Class5 var8;
                    if (lllIIIIllIlI((var8 = (Class5) var7.next()) instanceof Class45)) {
                        ((Class45) var8). = false;
                        var10000 = true;
                    }
                }

                throw null;
            }
        }

        if (lllIIIIlIlll(78283, 4733)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public void keyTyped(char var1, int var2) {
        if (lllIIIIllllI(var2, 1)) {
            this.mc.displayGuiScreen((GuiScreen) null);
        }

        if (lllIIIIlIlll(90575, 7097)) {
            throw null;
        } else {
            Iterator var3 =                                                                                             .
            iterator();

            label43:
            while (!lllIIIIlIlll(90575, 7097)) {
                if (!lllIIIIllIlI(var3.hasNext())) {
                    if (lllIIIIlIlll(90575, 7097)) {
                        throw null;
                    }

                    boolean var6 = true;
                    return;
                }

                Class19 var4;
                if (lllIIIIllIlI((var4 = (Class19) var3.next()). ()) &&lllIIIIlllII(var4. ().isEmpty())){
                    var4. (var1, var2);

                    boolean var10001;
                    Iterator var5;
                    for (Iterator var10000 = var5 = var4. ().iterator(); !lllIIIIlIlll(90575, 7097) ;
                    var10001 = true){
                        if (!lllIIIIllIlI(var10000.hasNext())) {
                            continue label43;
                        }

                        ((Class5) var5.next()). (var1, var2);
                        var10000 = var5;
                    }

                    throw null;
                }
            }

            throw null;
        }
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    public void initGui() {
        if (lllIIIIllIll(this.) && lllIIIIllIlI(this..                                                                                            .
        ()) &&lllIIIIlllII(this.mc.entityRenderer.isShaderActive())){
            EntityRenderer var10000 = this.mc.entityRenderer;
            ResourceLocation var10001 = new ResourceLocation;
            String var10003 = Class60. ("isx~{in5btbn9yyox5cia5");
            if (lllIIIIlIlll(57453, 9202)) {
                throw null;
            }

            var10001.<init> (var10003);
            if (lllIIIIlIlll(57453, 9202)) {
                throw null;
            }

            var10000.loadShader(var10001);
        }

        if (lllIIIIlIlll(57453, 9202)) {
            throw null;
        } else {
            if (lllIIIIlllIl(Class73..                                                                            .                                                                                            ))
            {
                Class73.                                                                                      .                                                                            .
                ();
            }

            if (lllIIIIlIlll(57453, 9202)) {
                throw null;
            } else {
                boolean var1 = true;
            }
        }
    }

    public void mouseReleased(int var1, int var2, int var3) {
        if (lllIIIIllIll(Class73..)){
            Class73.                                                                                      .                                                                              .
            ();
        }

        if (lllIIIIlIlll(91746, 3502)) {
            throw null;
        } else {
            Iterator var10000;
            boolean var10001;
            Iterator var4;
            Class19 var5;
            if (lllIIIIlllII(var3)) {
                var10000 = var4 =                                                                                             .
                iterator();

                while (true) {
                    if (lllIIIIlIlll(91746, 3502)) {
                        throw null;
                    }

                    if (!lllIIIIllIlI(var10000.hasNext())) {
                        break;
                    }

                    var5 = (Class19) var4.next();
                    var10000 = var4;
                    var5. (false);
                    var10001 = true;
                }
            }

            if (lllIIIIlIlll(91746, 3502)) {
                throw null;
            } else {
                var4 =                                                                                             .
                iterator();

                label51:
                while (!lllIIIIlIlll(91746, 3502)) {
                    if (!lllIIIIllIlI(var4.hasNext())) {
                        if (lllIIIIlIlll(91746, 3502)) {
                            throw null;
                        }

                        boolean var7 = true;
                        return;
                    }

                    if (lllIIIIllIlI((var5 = (Class19) var4.next()). ()) &&lllIIIIlllII(var5. ().isEmpty())){
                        Iterator var6;
                        for (var10000 = var6 = var5. ().iterator(); !lllIIIIlIlll(91746, 3502) ;
                        var10001 = true){
                            if (!lllIIIIllIlI(var10000.hasNext())) {
                                continue label51;
                            }

                            ((Class5) var6.next()). (var1, var2, var3);
                            var10000 = var6;
                        }

                        throw null;
                    }
                }

                throw null;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void drawScreen(int var1, int var2, float var3) {
        this.drawDefaultBackground();
        GL11.glPushMatrix();
        if (lllIIIIlIlll(93282, 2162)) {
            throw null;
        } else {
            boolean var10001;
            int var5;
            for (int var10000 = var5 =                                                                                             .
            size() - 1;
            !lllIIIIlIlll(93282, 2162);
            var10001 = true){
                if (!lllIIIIllIII(var10000)) {
                    if (lllIIIIlIlll(93282, 2162)) {
                        throw null;
                    }

                    GL11.glPopMatrix();
                    if (lllIIIIlIlll(93282, 2162)) {
                        throw null;
                    }

                    boolean var7 = true;
                    return;
                }

                Class19 var4 = (Class19).get(var5);
                var4. ();
                var4. (var1, var2);
                ArrayList var6 = var4. ();
                --var5;
                var6.forEach(Class29::);
                var10000 = var5;
            }

            throw null;
        }
    }
}
