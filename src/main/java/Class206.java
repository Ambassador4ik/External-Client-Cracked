import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.IOUtils;

@SideOnly(Side.CLIENT)
public class Class206 extends FontRenderer implements IResourceManagerReloadListener {
    private int;
    private static int 3966=19831;
    private static int 47285=-12037;
    private boolean;
    private static int 3354=7743;
    private static int 89899=-2291;
    private static int 620=24974;
    private static int 44419=-7496;
    private static int 3244=21008;
    public float;
    private static int 8685=17908;
    private static int 60895=-26901;
    private static int 8012=1845;
    private float;
    public final byte[];
    private static int 36996=-28602;
    private static int 8088=19108;
    public final int[];
    private static int 99593=-29644;
    private static int 48020=-18459;
    private static int 85550=-5054;
    private static int 8784=4827;
    private static int 7708=25280;
    private float;
    private static int 8763=-12552;
    public int;
    private static int 5098=4146;
    private static int 42966=-20245;
    private static int 4481=10379;
    private boolean;
    private float;
    private static int 84796=-26427;
    private static int 5882=1305;
    private static int 99807=-3432;
    private static int 12949=-26360;
    private static int 18865=-14538;
    private static int 24039=-18766;
    private static int 3762=24045;
    public Class95;
    private static int 4069=25683;
    private static int 97778=-6635;
    private final int[];
    private static int 18038=-31534;
    private static int 34370=-11414;
    private static int 61885=-26080;
    private static int 9427=22881;
    private static int 89185=-16117;
    private static int 54624=-10374;
    private static int 2255=24565;
    private static int 7817=4184;
    private static int 5263=32206;
    private boolean;
    private static int 20934=-31633;
    private boolean;
    private static int 93752=-11424;
    private static int 1820=14695;
    private static int 1315=22037;
    private static int 4419=1373;
    private static int 39205=-9984;
    private TextureManager;
    private static int 7670=9130;
    private static int 65346=-10139;
    private static int 3246=12731;
    private static int 8457=30398;
    private static int 56939=-28184;
    private static int 1790=20035;
    private static int 19937=-24197;
    private static int 5782=25861;
    private static int 31423=-10055;
    public Random;
    private static int 46949=-11685;
    private static int 9597=-951;
    private static int 67985=-4377;
    private static int 59506=-12058;
    public float;
    private static int 1096=31436;
    private static int 6335=16663;
    private static int 2375=25637;
    private static int 8428=15448;
    private static int 6248=12070;
    private static int 96473=-4344;
    private static int 1753=10455;
    private static final ResourceLocation[]                                                                                                   =new ResourceLocation[256];
    private static int 122=29180;
    private static int 9075=15341;
    private static int 1706=17192;
    private static int 28316=-31816;
    private static int 3968=7985;
    private static int 16428=-7134;
    private static int 2838=3246;
    private static int 1678=28413;
    private static int 3867=11389;
    public ResourceLocation;
    private static int 9534=27232;
    private static int 42700=-18583;
    private static int 6626=28688;
    private static int 87=26912;
    private static int 6489=28982;
    private static int 61923=-1765;
    private static int 1858=30171;
    private boolean;
    private static int 16614=-4810;
    private static int 59871=-10991;
    private static int 23795=-8076;
    private boolean;
    private static int 32926=-29413;
    private boolean;
    private float;
    private static int 17360=-22590;
    private static int 54784=-7124;
    private static int 60916=-16097;

    static {
        boolean var10000 = true;
    }

    public Class206(GameSettings var1, ResourceLocation var2, TextureManager var3, boolean var4) {
        super(var1, var2, var3, var4);
        if (llIIlllIIIll(34370, 122)) {
            throw null;
        } else {
            this. = new int[256];
            this. = 9;
            Random var10013 = new Random();
            if (llIIlllIIIll(34370, 122)) {
                throw null;
            } else {
                this. = var10013;
                this. = new byte[65536];
                this. = new int[32];
                this. = var2;
                this. = var3;
                this. = var4;
                Class171 var10001 = Class133. (59);
                if (llIIlllIIIll(34370, 122)) {
                    throw null;
                } else {
                    this. = (Class95) var10001;
                    int var10000 = 0;
                    this.bindTexture(this.);

                    boolean var14;
                    for (int var9 = 0; !llIIlllIIIll(34370, 122); var14 = true) {
                        if (!llIIlllIlIIl(var10000, 32)) {
                            if (llIIlllIIIll(34370, 122)) {
                                throw null;
                            }

                            this. ();
                            if (llIIlllIIIll(34370, 122)) {
                                throw null;
                            }

                            boolean var12 = true;
                            return;
                        }

                        int var10 = (var9 >> 3 & 1) * 85;
                        int var11 = (var9 >> 2 & 1) * 170 + var10;
                        int var5 = (var9 >> 1 & 1) * 170 + var10;
                        var10 += (var9 >> 0 & 1) * 170;
                        if (llIIlllIIllI(var9, 6)) {
                            var11 += 85;
                        }

                        if (llIIlllIIIll(34370, 122)) {
                            throw null;
                        }

                        if (llIIlllIIlII(var1.field_74337_g)) {
                            int var6 = (var11 * 30 + var5 * 59 + var10 * 11) / 100;
                            int var7 = (var11 * 30 + var5 * 70) / 100;
                            int var8 = (var11 * 30 + var10 * 70) / 100;
                            var11 = var6;
                            var5 = var7;
                            var10 = var8;
                        }

                        if (llIIlllIIIll(34370, 122)) {
                            throw null;
                        }

                        if (llIIlllIIIll(var9, 16)) {
                            var11 /= 4;
                            var5 /= 4;
                            var10 /= 4;
                        }

                        if (llIIlllIIIll(34370, 122)) {
                            throw null;
                        }

                        int var13 = var9;
                        int var10002 = (var11 & 255) << 16 | (var5 & 255) << 8 | var10 & 255;
                        ++var9;
                        this.                                                                                                  [
                        var13] =var10002;
                        var10000 = var9;
                    }

                    throw null;
                }
            }
        }
    }

    public static String ____________________________________________________________________________/* $FF was:                                                                             */(String var0) {
        String var1 = "";
        int var2 = -1;
        int var3 = var0.length();

        while (!llIIlllIIIll(59506, 620)) {
            if (!llIIlllIIlll(var2 = var0.indexOf(167, var2 + 1), -1)) {
                if (llIIlllIIIll(59506, 620)) {
                    throw null;
                }

                return var1;
            }

            if (llIIlllIlIIl(var2, var3 - 1)) {
                char var4;
                byte var10000 = (var4 = var0.charAt(var2 + 1));
                if (llIIlllIIIll(59506, 620)) {
                    throw null;
                }

                StringBuilder var5;
                boolean var6;
                if (llIIlllIIlII(var10000)) {
                    var5 = new StringBuilder();
                    if (llIIlllIIIll(59506, 620)) {
                        throw null;
                    }

                    String var10002 = Class60. ("ü");
                    if (llIIlllIIIll(59506, 620)) {
                        throw null;
                    }

                    var1 = String.valueOf(var5.insert(0, var10002).append(var4));
                    var6 = true;
                } else {
                    if (llIIlllIIIll(59506, 620)) {
                        throw null;
                    }

                    var10000 = (var4);
                    if (llIIlllIIIll(59506, 620)) {
                        throw null;
                    }

                    if (llIIlllIIlII(var10000)) {
                        var5 = new StringBuilder();
                        if (llIIlllIIIll(59506, 620)) {
                            throw null;
                        }

                        var5 = var5.insert(0, var1);
                        String var10001 = Class60. ("ü");
                        if (llIIlllIIIll(59506, 620)) {
                            throw null;
                        }

                        var1 = String.valueOf(var5.append(var10001).append(var4));
                        var6 = true;
                    }
                }
            }
        }

        throw null;
    }

    private static boolean llIIlllIIIlI(int var0) {
        return var0 == 0;
    }

    private static boolean llIIlllIlIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIlllIllII(int var0) {
        return var0 < 0;
    }

    private static boolean llIIlllIlIll(int var0) {
        return var0 >= 0;
    }

    private static boolean llIIlllIIlll(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIIllllIIII(int var0) {
        return var0 > 0;
    }

    private static boolean llIIlllIIlII(int var0) {
        return var0 != 0;
    }

    private static boolean ____________________________________________________________________________/* $FF was:                                                                             */(char var0) {
        if (!llIIlllIIIll(var0, 107) || llIIlllIlIlI(var0, 111)) {
            if (llIIlllIIIll(56939, 8685)) {
                throw null;
            }

            if (!llIIlllIIIll(var0, 75) || llIIlllIlIlI(var0, 79)) {
                if (llIIlllIIIll(56939, 8685)) {
                    throw null;
                }

                if (llIIlllIIlll(var0, 114) && !llIIlllIIllI(var0, 82)) {
                    if (llIIlllIIIll(56939, 8685)) {
                        throw null;
                    }

                    return false;
                }
            }
        }

        if (llIIlllIIIll(56939, 8685)) {
            throw null;
        } else {
            return true;
        }
    }

    private static boolean llIIlllIIllI(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIIlllIlIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlllIllIl(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llIIlllIIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(char var0) {
        if (!llIIlllIIIll(var0, 48) || llIIlllIlIlI(var0, 57)) {
            if (llIIlllIIIll(24039, 3966)) {
                throw null;
            }

            if (!llIIlllIIIll(var0, 97) || llIIlllIlIlI(var0, 102)) {
                if (llIIlllIIIll(24039, 3966)) {
                    throw null;
                }

                if (!llIIlllIIIll(var0, 65) || !llIIlllIllIl(var0, 70)) {
                    if (llIIlllIIIll(24039, 3966)) {
                        throw null;
                    }

                    return false;
                }
            }
        }

        if (llIIlllIIIll(24039, 3966)) {
            throw null;
        } else {
            return true;
        }
    }

    private static boolean llIIlllIlIlI(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIIlllIllll(Object var0) {
        return var0 == null;
    }

    private void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        IResource var1 = null;

        try {
            try {
                if (llIIlllIIIll(54624, 6248)) {
                    throw null;
                }

                ResourceLocation var10001 = new ResourceLocation;
                String var10003 = Class60. ("}uvo0}pbcrOh~`qh%xa5");
                if (llIIlllIIIll(54624, 6248)) {
                    throw null;
                }

                var10001.<init> (var10003);
                if (llIIlllIIIll(54624, 6248)) {
                    throw null;
                }

                (var1 = this.getResource(var10001)).func_110527_b().read(this.);
            } catch (IOException var5) {
                if (llIIlllIIIll(54624, 6248)) {
                    throw null;
                }

                RuntimeException var10000 = new RuntimeException(var5);
                if (llIIlllIIIll(54624, 6248)) {
                    throw null;
                }

                throw var10000;
            }
        } catch (Throwable var6) {
            if (llIIlllIIIll(54624, 6248)) {
                throw null;
            }

            if (llIIlllIIIll(54624, 6248)) {
                throw null;
            }

            IOUtils.closeQuietly(var1);
            if (llIIlllIIIll(54624, 6248)) {
                throw null;
            }

            throw var6;
        }

        if (llIIlllIIIll(54624, 6248)) {
            throw null;
        } else {
            IOUtils.closeQuietly(var1);
            if (llIIlllIIIll(54624, 6248)) {
                throw null;
            } else {
                boolean var7 = true;
            }
        }
    }

    public void enableAlpha() {
        GlStateManager.func_179141_d();
        if (llIIlllIIIll(89185, 2838)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (llIIlllIIlII(this.)) {
            String var10001 = this. (var1);
            if (llIIlllIIIll(16614, 1706)) {
                throw null;
            }

            int var7 = this.func_78256_a(var10001);
            var2 = var2 + var4 - var7;
        }

        if (llIIlllIIIll(16614, 1706)) {
            throw null;
        } else {
            int var10000 = this. (var1, (float) var2, (float) var3, var5, var6);
            if (llIIlllIIIll(16614, 1706)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    public int func_78263_a(char var1) {
        if (llIIlllIIllI(var1, 160)) {
            return 4;
        } else if (llIIlllIIIll(19937, 8784)) {
            throw null;
        } else if (llIIlllIIllI(var1, 167)) {
            return -1;
        } else if (llIIlllIIIll(19937, 8784)) {
            throw null;
        } else if (llIIlllIIllI(var1, 32)) {
            return 4;
        } else if (llIIlllIIIll(19937, 8784)) {
            throw null;
        } else {
            String var10000 = Class60.
            ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
            if (llIIlllIIIll(19937, 8784)) {
                throw null;
            } else {
                int var2 = var10000.indexOf(var1);
                if (llIIllllIIII(var1) && llIIlllIIlll(var2, -1) && llIIlllIIIlI(this.)) {
                    return this.                                                                                              [
                    var2];
                } else if (llIIlllIIIll(19937, 8784)) {
                    throw null;
                } else if (llIIlllIIlII(this.[var1])){
                    int var3;
                    var2 = (var3 = this.[var1] & 255) >>>4;
                    var3 &= 15;
                    ++var3;
                    return (var3 - var2) / 2 + 1;
                } else if (llIIlllIIIll(19937, 8784)) {
                    throw null;
                } else {
                    return 0;
                }
            }
        }
    }

    public void setColor(float var1, float var2, float var3, float var4) {
        GlStateManager.func_179131_c(var1, var2, var3, var4);
        if (llIIlllIIIll(44419, 1753)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void func_78279_b(String var1, int var2, int var3, int var4, int var5) {
        this. ();
        if (llIIlllIIIll(9597, 9427)) {
            throw null;
        } else {
            this. = var5;
            String var10001 = this. (var1);
            if (llIIlllIIIll(9597, 9427)) {
                throw null;
            } else {
                this. (var10001, var2, var3, var4, false);
                if (llIIlllIIIll(9597, 9427)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    private String ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1) {
        String var4;
        try {
            if (llIIlllIIIll(65346, 8088)) {
                throw null;
            }

            Bidi var10000 = new Bidi;
            ArabicShaping var10002 = new ArabicShaping(8);
            if (llIIlllIIIll(65346, 8088)) {
                throw null;
            }

            var10000.<init> (var10002.shape(var1), 127);
            if (llIIlllIIIll(65346, 8088)) {
                throw null;
            }

            Bidi var2 = var10000;
            var2.setReorderingMode(0);
            var4 = var2.writeReordered(2);
        } catch (ArabicShapingException var3) {
            if (llIIlllIIIll(65346, 8088)) {
                throw null;
            }

            return var1;
        }

        if (llIIlllIIIll(65346, 8088)) {
            throw null;
        } else {
            return var4;
        }
    }

    public int drawStringNoProtect(String var1, float var2, float var3, int var4, boolean var5) {
        this.enableAlpha();
        this. ();
        if (llIIlllIIIll(97778, 1096)) {
            throw null;
        } else {
            int var10000;
            if (llIIlllIIlII(var5)) {
                var10000 = this. (var1, var2 + 1.0F, var3 + 1.0F, var4, true);
                if (llIIlllIIIll(97778, 1096)) {
                    throw null;
                } else {
                    int var10001 = this. (var1, var2, var3, var4, false);
                    if (llIIlllIIIll(97778, 1096)) {
                        throw null;
                    } else {
                        var10000 = Math.max(var10000, var10001);
                        if (llIIlllIIIll(97778, 1096)) {
                            throw null;
                        } else {
                            return var10000;
                        }
                    }
                }
            } else if (llIIlllIIIll(97778, 1096)) {
                throw null;
            } else {
                var10000 = this. (var1, var2, var3, var4, false);
                if (llIIlllIIIll(97778, 1096)) {
                    throw null;
                } else {
                    return var10000;
                }
            }
        }
    }

    public int func_78267_b(String var1, int var2) {
        return this. * this.func_78271_c(var1, var2).size();
    }

    public void func_78264_a(boolean var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public int func_175063_a(String var1, float var2, float var3, int var4) {
        return this.func_175065_a(var1, var2, var3, var4, true);
    }

    public void doDraw(float var1) {
        Tessellator var10000;
        BufferBuilder var3;
        if (llIIlllIIlII(this.)) {
            var10000 = Tessellator.func_178181_a();
            if (llIIlllIIIll(39205, 5782)) {
                throw null;
            }

            var3 = var10000.func_178180_c();
            GlStateManager.func_179090_x();
            if (llIIlllIIIll(39205, 5782)) {
                throw null;
            }

            var3.func_181668_a(7, DefaultVertexFormats.field_181705_e);
            var3.func_181662_b((double) this., (double) (this. + (float) (this. / 2)), 0.0D).func_181675_d();
            var3.func_181662_b((double) (this. + var1), (double) (this. + (float) (this. / 2)), 0.0D).func_181675_d();
            var3.func_181662_b((double) (this. + var1), (double) (this. + (float) (this. / 2) - 1.0F), 0.0D).func_181675_d();
            var3.func_181662_b((double) this., (double) (this. + (float) (this. / 2) - 1.0F), 0.0D).func_181675_d();
            var10000.func_78381_a();
            GlStateManager.func_179098_w();
            if (llIIlllIIIll(39205, 5782)) {
                throw null;
            }
        }

        if (llIIlllIIIll(39205, 5782)) {
            throw null;
        } else {
            if (llIIlllIIlII(this.)) {
                var10000 = Tessellator.func_178181_a();
                if (llIIlllIIIll(39205, 5782)) {
                    throw null;
                }

                Tessellator var2 = var10000;
                var3 = var10000.func_178180_c();
                GlStateManager.func_179090_x();
                if (llIIlllIIIll(39205, 5782)) {
                    throw null;
                }

                var3.func_181668_a(7, DefaultVertexFormats.field_181705_e);
                byte var5;
                if (llIIlllIIlII(this.)) {
                    var5 = -1;
                    boolean var10001 = true;
                } else {
                    if (llIIlllIIIll(39205, 5782)) {
                        throw null;
                    }

                    var5 = 0;
                }

                if (llIIlllIIIll(39205, 5782)) {
                    throw null;
                }

                byte var4 = var5;
                var3.func_181662_b((double) (this. + (float) var4), (double) (this. + (float) this.), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + var1), (double) (this. + (float) this.), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + var1), (double) (this. + (float) this. - 1.0F), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + (float) var4), (double) (this. + (float) this. - 1.0F), 0.0D).func_181675_d();
                var2.func_78381_a();
                GlStateManager.func_179098_w();
                if (llIIlllIIIll(39205, 5782)) {
                    throw null;
                }
            }

            if (llIIlllIIIll(39205, 5782)) {
                throw null;
            } else {
                this. += (float) ((int) var1);
                boolean var6 = true;
            }
        }
    }

    public int func_78256_a(String var1) {
        if (llIIlllIllll(var1 = this.. (var1))){
            return 0;
        } else if (llIIlllIIIll(36996, 3246)) {
            throw null;
        } else {
            int var2 = 0;
            byte var3 = 0;

            boolean var10001;
            int var4;
            for (int var10000 = var4 = 0; !llIIlllIIIll(36996, 3246); var10001 = true) {
                if (!llIIlllIlIIl(var10000, var1.length())) {
                    if (llIIlllIIIll(36996, 3246)) {
                        throw null;
                    }

                    return var2;
                }

                int var6;
                if (llIIlllIllII(var6 = this.func_78263_a(var1.charAt(var4))) && llIIlllIlIIl(var4, var1.length() - 1)) {
                    ++var4;
                    char var5;
                    if (llIIlllIIlll(var5 = var1.charAt(var4), 108) && llIIlllIIlll(var5, 76)) {
                        if (!llIIlllIIlll(var5, 114) || llIIlllIIllI(var5, 82)) {
                            if (llIIlllIIIll(36996, 3246)) {
                                throw null;
                            }

                            var3 = 0;
                            boolean var7 = true;
                        }
                    } else {
                        if (llIIlllIIIll(36996, 3246)) {
                            throw null;
                        }

                        var3 = 1;
                    }

                    if (llIIlllIIIll(36996, 3246)) {
                        throw null;
                    }

                    var6 = 0;
                }

                if (llIIlllIIIll(36996, 3246)) {
                    throw null;
                }

                var2 += var6;
                if (llIIlllIIlII(var3) && llIIllllIIII(var6)) {
                    ++var2;
                }

                if (llIIlllIIIll(36996, 3246)) {
                    throw null;
                }

                ++var4;
                var10000 = var4;
            }

            throw null;
        }
    }

    public String func_78262_a(String var1, int var2, boolean var3) {
        StringBuilder var10000 = new StringBuilder();
        if (llIIlllIIIll(99807, 8012)) {
            throw null;
        } else {
            StringBuilder var4 = var10000;
            int var5 = 0;
            int var12;
            boolean var10001;
            if (llIIlllIIlII(var3)) {
                var12 = var1.length() - 1;
                var10001 = true;
            } else {
                if (llIIlllIIIll(99807, 8012)) {
                    throw null;
                }

                var12 = 0;
            }

            if (llIIlllIIIll(99807, 8012)) {
                throw null;
            } else {
                int var6 = var12;
                byte var13;
                if (llIIlllIIlII(var3)) {
                    var13 = -1;
                    var10001 = true;
                } else {
                    if (llIIlllIIIll(99807, 8012)) {
                        throw null;
                    }

                    var13 = 1;
                }

                if (llIIlllIIIll(99807, 8012)) {
                    throw null;
                } else {
                    byte var7 = var13;
                    byte var8 = 0;
                    byte var9 = 0;
                    var12 = var6 = var6;

                    while (true) {
                        if (llIIlllIIIll(99807, 8012)) {
                            throw null;
                        }

                        if (!llIIlllIlIll(var12) || !llIIlllIlIIl(var6, var1.length()) || !llIIlllIlIIl(var5, var2)) {
                            if (llIIlllIIIll(99807, 8012)) {
                                throw null;
                            }

                            var10000 = var4;
                            break;
                        }

                        char var10;
                        label141:
                        {
                            int var11 = this.func_78263_a(var10 = var1.charAt(var6));
                            if (llIIlllIIlII(var8)) {
                                var8 = 0;
                                if (!llIIlllIIlll(var10, 108) || !llIIlllIIlll(var10, 76)) {
                                    if (llIIlllIIIll(99807, 8012)) {
                                        throw null;
                                    }

                                    var9 = 1;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }

                                if (!llIIlllIIlll(var10, 114) || llIIlllIIllI(var10, 82)) {
                                    if (llIIlllIIIll(99807, 8012)) {
                                        throw null;
                                    }

                                    var9 = 0;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }
                            } else {
                                if (llIIlllIIIll(99807, 8012)) {
                                    throw null;
                                }

                                if (llIIlllIllII(var11)) {
                                    var8 = 1;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }

                                if (llIIlllIIIll(99807, 8012)) {
                                    throw null;
                                }

                                var5 += var11;
                                if (llIIlllIIlII(var9)) {
                                    ++var5;
                                }
                            }

                            if (llIIlllIIIll(99807, 8012)) {
                                throw null;
                            }

                            var12 = var5;
                        }

                        if (llIIlllIIIll(99807, 8012)) {
                            throw null;
                        }

                        if (llIIlllIlIlI(var12, var2)) {
                            var10000 = var4;
                            var10001 = true;
                            break;
                        }

                        if (llIIlllIIIll(99807, 8012)) {
                            throw null;
                        }

                        if (llIIlllIIlII(var3)) {
                            var4.insert(0, var10);
                            var12 = var6;
                            var10001 = true;
                        } else {
                            if (llIIlllIIIll(99807, 8012)) {
                                throw null;
                            }

                            var4.append(var10);
                            var12 = var6;
                        }

                        if (llIIlllIIIll(99807, 8012)) {
                            throw null;
                        }

                        var12 = var6 = var12 + var7;
                        var10001 = true;
                    }

                    if (llIIlllIIIll(99807, 8012)) {
                        throw null;
                    } else {
                        return String.valueOf(var10000);
                    }
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        this. = this. = false;
        this. = false;
        this. = false;
        this. = false;
        boolean var10000 = true;
    }

    private void ____________________________________________________________________________/* $FF was:                                                                             */() {
        IResource var1 = null;

        BufferedImage var2;
        try {
            try {
                if (llIIlllIIIll(32926, 3762)) {
                    throw null;
                }

                BufferedImage var20 = TextureUtil.func_177053_a((var1 = this.getResource(this.)).func_110527_b());
                if (llIIlllIIIll(32926, 3762)) {
                    throw null;
                }

                var2 = var20;
            } catch (IOException var16) {
                if (llIIlllIIIll(32926, 3762)) {
                    throw null;
                }

                RuntimeException var10000 = new RuntimeException(var16);
                if (llIIlllIIIll(32926, 3762)) {
                    throw null;
                }

                throw var10000;
            }
        } catch (Throwable var17) {
            if (llIIlllIIIll(32926, 3762)) {
                throw null;
            }

            if (llIIlllIIIll(32926, 3762)) {
                throw null;
            }

            IOUtils.closeQuietly(var1);
            if (llIIlllIIIll(32926, 3762)) {
                throw null;
            }

            throw var17;
        }

        if (llIIlllIIIll(32926, 3762)) {
            throw null;
        } else {
            IOUtils.closeQuietly(var1);
            if (llIIlllIIIll(32926, 3762)) {
                throw null;
            } else {
                boolean var10001 = true;
                if (llIIlllIIIll(32926, 3762)) {
                    throw null;
                } else {
                    int var3 = var2.getWidth();
                    int var4 = var2.getHeight();
                    int[] var18 = new int[var3 * var4];
                    var2.getRGB(0, 0, var3, var4, var18, 0, var3);
                    int var19 = var4 / 16;
                    var4 = var3 / 16;
                    float var5 = 8.0F / (float) var4;
                    int var6 = 0;

                    for (int var21 = var6; !llIIlllIIIll(32926, 3762); var10001 = true) {
                        boolean var23;
                        if (!llIIlllIlIIl(var21, 256)) {
                            if (llIIlllIIIll(32926, 3762)) {
                                throw null;
                            }

                            var23 = true;
                            return;
                        }

                        int var7 = var6 % 16;
                        int var8 = var6 / 16;
                        if (llIIlllIIllI(var6, 32)) {
                            this.                                                                                              [
                            var6] =4;
                        }

                        if (llIIlllIIIll(32926, 3762)) {
                            throw null;
                        }

                        int var9;
                        var21 = var9 = var4 - 1;

                        label264:
                        while (true) {
                            if (llIIlllIIIll(32926, 3762)) {
                                throw null;
                            }

                            if (!llIIlllIlIll(var21)) {
                                break;
                            }

                            int var10 = var7 * var4 + var9;
                            byte var11 = 1;

                            int var12;
                            for (var21 = var12 = 0; !llIIlllIIIll(32926, 3762); var10001 = true) {
                                if (!llIIlllIlIIl(var21, var19) || !llIIlllIIlII(var11)) {
                                    if (llIIlllIIIll(32926, 3762)) {
                                        throw null;
                                    }

                                    if (llIIlllIIIlI(var11)) {
                                        var23 = true;
                                        break label264;
                                    }

                                    if (llIIlllIIIll(32926, 3762)) {
                                        throw null;
                                    }

                                    --var9;
                                    var21 = var9;
                                    var10001 = true;
                                    continue label264;
                                }

                                int var13 = (var8 * var4 + var12) * var3;
                                if (llIIlllIIlII(var18[var10 + var13] >> 24 & 255)) {
                                    var11 = 0;
                                }

                                if (llIIlllIIIll(32926, 3762)) {
                                    throw null;
                                }

                                ++var12;
                                var21 = var12;
                            }

                            throw null;
                        }

                        if (llIIlllIIIll(32926, 3762)) {
                            throw null;
                        }

                        ++var9;
                        int var22 = var6;
                        int var10002 = (int) (0.5D + (double) ((float) var9 * var5)) + 1;
                        ++var6;
                        this.                                                                                              [
                        var22] =var10002;
                        var21 = var6;
                    }

                    throw null;
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2, int var3, int var4, boolean var5) {
        boolean var10001;
        Iterator var7;
        for (Iterator var10000 = var7 = this.func_78271_c(var1, var4).iterator(); !llIIlllIIIll(60895, 1858); var10001 = true) {
            if (!llIIlllIIlII(var10000.hasNext())) {
                if (llIIlllIIIll(60895, 1858)) {
                    throw null;
                }

                boolean var8 = true;
                return;
            }

            String var6 = (String) var7.next();
            var10000 = var7;
            this. (var6, var2, var3, var4, this., var5);
            if (llIIlllIIIll(60895, 1858)) {
                throw null;
            }

            var3 += this.;
        }

        throw null;
    }

    public List func_78271_c(String var1, int var2) {
        String var10000 = this.func_78280_d(var1, var2);
        String var10001 = Class60. ("Q");
        if (llIIlllIIIll(96473, 7817)) {
            throw null;
        } else {
            List var3 = Arrays.asList(var10000.split(var10001));
            if (llIIlllIIIll(96473, 7817)) {
                throw null;
            } else {
                return var3;
            }
        }
    }

    public void func_78275_b(boolean var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public void bindTexture(ResourceLocation var1) {
        if (llIIlllIlIII(this.)) {
            this.                                                                                .func_110577_a(var1);
        }

        if (llIIlllIIIll(54784, 6489)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public int func_175065_a(String var1, float var2, float var3, int var4, boolean var5) {
        var1 = this.                                                                                            .(var1);
        this.enableAlpha();
        this. ();
        if (llIIlllIIIll(59871, 3244)) {
            throw null;
        } else {
            int var10000;
            if (llIIlllIIlII(var5)) {
                var10000 = this. (var1, var2 + 1.0F, var3 + 1.0F, var4, true);
                if (llIIlllIIIll(59871, 3244)) {
                    throw null;
                } else {
                    int var10001 = this. (var1, var2, var3, var4, false);
                    if (llIIlllIIIll(59871, 3244)) {
                        throw null;
                    } else {
                        var10000 = Math.max(var10000, var10001);
                        if (llIIlllIIIll(59871, 3244)) {
                            throw null;
                        } else {
                            return var10000;
                        }
                    }
                }
            } else if (llIIlllIIIll(59871, 3244)) {
                throw null;
            } else {
                var10000 = this. (var1, var2, var3, var4, false);
                if (llIIlllIIIll(59871, 3244)) {
                    throw null;
                } else {
                    return var10000;
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, boolean var2) {
        int var3;
        boolean var14;
        for (int var10000 = var3 = 0; !llIIlllIIIll(17360, 9534); var14 = true) {
            boolean var16;
            if (!llIIlllIlIIl(var10000, var1.length())) {
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                var16 = true;
                return;
            }

            char var4;
            int var5;
            int var6;
            String var11;
            String var10001;
            if (llIIlllIIllI(var4 = var1.charAt(var3), 167) && llIIlllIlIIl(var3 + 1, var1.length())) {
                var11 = Class60. ("**+)*.+-*\"pxu\u007fp|awdta)");
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                var10001 = String.valueOf(var1.charAt(var3 + 1));
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                if (!llIIlllIlIIl(var5 = var11.indexOf(var10001.toLowerCase(Locale.ROOT).charAt(0)), 16)) {
                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    if (llIIlllIIllI(var5, 16)) {
                        this. = true;
                        var16 = true;
                    } else {
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        if (llIIlllIIllI(var5, 17)) {
                            this. = true;
                            var16 = true;
                        } else {
                            if (llIIlllIIIll(17360, 9534)) {
                                throw null;
                            }

                            if (llIIlllIIllI(var5, 18)) {
                                this. = true;
                                var16 = true;
                            } else {
                                if (llIIlllIIIll(17360, 9534)) {
                                    throw null;
                                }

                                if (llIIlllIIllI(var5, 19)) {
                                    this. = true;
                                    var16 = true;
                                } else {
                                    if (llIIlllIIIll(17360, 9534)) {
                                        throw null;
                                    }

                                    if (llIIlllIIllI(var5, 20)) {
                                        this. = true;
                                        var16 = true;
                                    } else {
                                        if (llIIlllIIIll(17360, 9534)) {
                                            throw null;
                                        }

                                        if (llIIlllIIllI(var5, 21)) {
                                            this. = this. = false;
                                            this. = false;
                                            this. = false;
                                            this. = false;
                                            this.setColor(this., this., this., this.);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this. = this. = false;
                    this. = false;
                    this. = false;
                    this. = false;
                    if (!llIIlllIlIll(var5) || llIIlllIlIlI(var5, 15)) {
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        var5 = 15;
                    }

                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    if (llIIlllIIlII(var2)) {
                        var5 += 16;
                    }

                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    this. = var6 = this.                                                                                                  [
                    var5];
                    this.setColor((float) (var6 >> 16) / 255.0F, (float) (var6 >> 8 & 255) / 255.0F, (float) (var6 & 255) / 255.0F, this.);
                    var16 = true;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                ++var3;
                var16 = true;
            } else {
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                var11 = Class60.
                ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                var5 = var11.indexOf(var4);
                if (llIIlllIIlII(this.) && llIIlllIIlll(var5, -1)) {
                    var6 = this.func_78263_a(var4);

                    while (true) {
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        Random var12 = this.;
                        var10001 = Class60.
                        ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        var5 = var12.nextInt(var10001.length());
                        var11 = Class60.
                        ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        char var7 = var11.charAt(var5);
                        if (llIIlllIIllI(var6, this.func_78263_a(var7))) {
                            var14 = true;
                            if (llIIlllIIIll(17360, 9534)) {
                                throw null;
                            }

                            var4 = var7;
                            break;
                        }
                    }
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                float var13;
                if (llIIlllIIlll(var5, -1) && !llIIlllIIlII(this.)) {
                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    var13 = 1.0F;
                } else {
                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    var13 = 0.5F;
                    var14 = true;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                float var9;
                byte var15;
                label282:
                {
                    var9 = var13;
                    if (!llIIlllIIlII(var4) || !llIIlllIIlll(var5, -1) || llIIlllIIlII(this.)) {
                        if (llIIlllIIIll(17360, 9534)) {
                            throw null;
                        }

                        if (llIIlllIIlII(var2)) {
                            var15 = 1;
                            var14 = true;
                            break label282;
                        }
                    }

                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    var15 = 0;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                byte var10 = var15;
                if (llIIlllIIlII(var10)) {
                    this. -= var9;
                    this. -= var9;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                var13 = this. (var4, this.                                                                                               )
                ;
                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                float var8 = var13;
                if (llIIlllIIlII(var10)) {
                    this. += var9;
                    this. += var9;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                if (llIIlllIIlII(this.)) {
                    this. += var9;
                    if (llIIlllIIlII(var10)) {
                        this. -= var9;
                        this. -= var9;
                    }

                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    this. (var4, this.                                                                                               )
                    ;
                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    this. -= var9;
                    if (llIIlllIIlII(var10)) {
                        this. += var9;
                        this. += var9;
                    }

                    if (llIIlllIIIll(17360, 9534)) {
                        throw null;
                    }

                    ++var8;
                }

                if (llIIlllIIIll(17360, 9534)) {
                    throw null;
                }

                this.doDraw(var8);
            }

            if (llIIlllIIIll(17360, 9534)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public float func_78277_a(char var1, boolean var2) {
        int var3;
        if (llIIlllIIIlI(var3 = this.[var1] & 255)){
            return 0.0F;
        } else if (llIIlllIIIll(18865, 2375)) {
            throw null;
        } else {
            int var4 = var1 / 256;
            this. (var4);
            if (llIIlllIIIll(18865, 2375)) {
                throw null;
            } else {
                var4 = var3 >>> 4;
                var3 &= 15;
                float var10 = (float) var4;
                float var9 = (float) (var3 + 1);
                float var5 = (float) (var1 % 16 * 16) + var10;
                float var7 = (float) ((var1 & 255) / 16 * 16);
                float var6 = var9 - var10 - 0.02F;
                float var10000;
                if (llIIlllIIlII(var2)) {
                    var10000 = 1.0F;
                    boolean var10001 = true;
                } else {
                    if (llIIlllIIIll(18865, 2375)) {
                        throw null;
                    }

                    var10000 = 0.0F;
                }

                if (llIIlllIIIll(18865, 2375)) {
                    throw null;
                } else {
                    float var8 = var10000;
                    GlStateManager.func_187447_r(5);
                    if (llIIlllIIIll(18865, 2375)) {
                        throw null;
                    } else {
                        GlStateManager.func_187426_b(var5 / 256.0F, var7 / 256.0F);
                        if (llIIlllIIIll(18865, 2375)) {
                            throw null;
                        } else {
                            GlStateManager.func_187435_e(this. + var8, this., 0.0F);
                            if (llIIlllIIIll(18865, 2375)) {
                                throw null;
                            } else {
                                GlStateManager.func_187426_b(var5 / 256.0F, (var7 + 15.98F) / 256.0F);
                                if (llIIlllIIIll(18865, 2375)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_187435_e(this. - var8, this. + 7.99F, 0.0F);
                                    if (llIIlllIIIll(18865, 2375)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187426_b((var5 + var6) / 256.0F, var7 / 256.0F);
                                        if (llIIlllIIIll(18865, 2375)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_187435_e(this. + var6 / 2.0F + var8, this., 0.0F);
                                            if (llIIlllIIIll(18865, 2375)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_187426_b((var5 + var6) / 256.0F, (var7 + 15.98F) / 256.0F);
                                                if (llIIlllIIIll(18865, 2375)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.func_187435_e(this. + var6 / 2.0F - var8, this. + 7.99F, 0.0F);
                                                    if (llIIlllIIIll(18865, 2375)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.func_187437_J();
                                                        if (llIIlllIIIll(18865, 2375)) {
                                                            throw null;
                                                        } else {
                                                            return (var9 - var10) / 2.0F + 1.0F;
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

    public String func_78269_a(String var1, int var2) {
        return this.func_78262_a(var1, var2, false);
    }

    public boolean func_82883_a() {
        return this.;
    }

    public String func_78280_d(String var1, int var2) {
        int var10001 = this. (var1, var2);
        if (llIIlllIIIll(20934, 2255)) {
            throw null;
        } else {
            int var3 = var10001;
            if (llIIlllIllIl(var1.length(), var3)) {
                return var1;
            } else if (llIIlllIIIll(20934, 2255)) {
                throw null;
            } else {
                String var4 = var1.substring(0, var3);
                char var5;
                byte var10000;
                if (llIIlllIIlll(var5 = var1.charAt(var3), 32) && !llIIlllIIllI(var5, 10)) {
                    if (llIIlllIIIll(20934, 2255)) {
                        throw null;
                    }

                    var10000 = 0;
                } else {
                    if (llIIlllIIIll(20934, 2255)) {
                        throw null;
                    }

                    var10000 = 1;
                    boolean var8 = true;
                }

                if (llIIlllIIIll(20934, 2255)) {
                    throw null;
                } else {
                    byte var6 = var10000;
                    StringBuilder var7 = new StringBuilder();
                    if (llIIlllIIIll(20934, 2255)) {
                        throw null;
                    } else {
                        String var10002 = (var4);
                        if (llIIlllIIIll(20934, 2255)) {
                            throw null;
                        } else {
                            var7 = var7.insert(0, var10002);
                            byte var10003;
                            if (llIIlllIIlII(var6)) {
                                var10003 = 1;
                                boolean var10004 = true;
                            } else {
                                if (llIIlllIIIll(20934, 2255)) {
                                    throw null;
                                }

                                var10003 = 0;
                            }

                            if (llIIlllIIIll(20934, 2255)) {
                                throw null;
                            } else {
                                var1 = String.valueOf(var7.append(var1.substring(var3 + var10003)));
                                var7 = new StringBuilder();
                                if (llIIlllIIIll(20934, 2255)) {
                                    throw null;
                                } else {
                                    var7 = var7.insert(0, var4);
                                    String var9 = Class60. ("Q");
                                    if (llIIlllIIIll(20934, 2255)) {
                                        throw null;
                                    } else {
                                        return String.valueOf(var7.append(var9).append(this.func_78280_d(var1, var2)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean func_78260_a() {
        return this.;
    }

    public void func_110549_a(IResourceManager var1) {
        this. ();
        if (llIIlllIIIll(16428, 3354)) {
            throw null;
        } else {
            this. ();
            if (llIIlllIIIll(16428, 3354)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(char var1, boolean var2) {
        if (llIIlllIIllI(var1, 160)) {
            return 4.0F;
        } else if (llIIlllIIIll(61885, 4481)) {
            throw null;
        } else if (llIIlllIIllI(var1, 32)) {
            return 4.0F;
        } else if (llIIlllIIIll(61885, 4481)) {
            throw null;
        } else {
            String var10000 = Class60.
            ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
            if (llIIlllIIIll(61885, 4481)) {
                throw null;
            } else {
                int var3;
                if (llIIlllIIlll(var3 = var10000.indexOf(var1), -1) && llIIlllIIIlI(this.)) {
                    return this.func_78266_a(var3, var2);
                } else if (llIIlllIIIll(61885, 4481)) {
                    throw null;
                } else {
                    return this.func_78277_a(var1, var2);
                }
            }
        }
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4, boolean var5) {
        if (llIIlllIllll(var1)) {
            return 0;
        } else if (llIIlllIIIll(8763, 6626)) {
            throw null;
        } else {
            if (llIIlllIIlII(this.)) {
                String var10000 = this. (var1);
                if (llIIlllIIIll(8763, 6626)) {
                    throw null;
                }

                var1 = var10000;
            }

            if (llIIlllIIIll(8763, 6626)) {
                throw null;
            } else {
                if (llIIlllIIIlI(var4 & -67108864)) {
                    var4 |= -16777216;
                }

                if (llIIlllIIIll(8763, 6626)) {
                    throw null;
                } else {
                    if (llIIlllIIlII(var5)) {
                        var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
                    }

                    if (llIIlllIIIll(8763, 6626)) {
                        throw null;
                    } else {
                        this. = (float) (var4 >> 16 & 255) / 255.0F;
                        this. = (float) (var4 >> 8 & 255) / 255.0F;
                        this. = (float) (var4 & 255) / 255.0F;
                        this. = (float) (var4 >> 24 & 255) / 255.0F;
                        this.setColor(this., this., this., this.);
                        this. = var2;
                        this. = var3;
                        this. (var1, (boolean) var5);
                        if (llIIlllIIIll(8763, 6626)) {
                            throw null;
                        } else {
                            return (int) this.;
                        }
                    }
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        ResourceLocation var10001 = this. (var1);
        if (llIIlllIIIll(12949, 8457)) {
            throw null;
        } else {
            this.bindTexture(var10001);
            boolean var10000 = true;
        }
    }

    private String _____________________________________________________________________________________/* $FF was:                                                                                      */(String var1) {
        String var10000 = var1;

        while (true) {
            if (llIIlllIIIll(47285, 3867)) {
                throw null;
            }

            if (!llIIlllIlIII(var10000)) {
                break;
            }

            String var10001 = Class60. ("Q");
            if (llIIlllIIIll(47285, 3867)) {
                throw null;
            }

            if (!llIIlllIIlII(var1.endsWith(var10001))) {
                break;
            }

            var10000 = var1 = var1.substring(0, var1.length() - 1);
            boolean var2 = true;
        }

        if (llIIlllIIIll(47285, 3867)) {
            throw null;
        } else {
            return var1;
        }
    }

    public int func_175064_b(char var1) {
        String var10000 = Class60. ("++*(+/*,+#qyt~q=");
        if (llIIlllIIIll(42700, 5098)) {
            throw null;
        } else {
            int var2;
            if (llIIlllIlIll(var2 = var10000.indexOf(var1)) && llIIlllIlIIl(var2, this..length)){
                return this.                                                                                                  [
                var2];
            } else if (llIIlllIIIll(42700, 5098)) {
                throw null;
            } else {
                return -1;
            }
        }
    }

    public IResource getResource(ResourceLocation var1) throws IOException {
        Minecraft var10000 = Minecraft.func_71410_x();
        if (llIIlllIIIll(28316, 7670)) {
            throw null;
        } else {
            return var10000.func_110442_L().func_110536_a(var1);
        }
    }

    private ResourceLocation ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        if (llIIlllIllll([var1])){
            ResourceLocation[] var10000 = ;
            ResourceLocation var10002 = new ResourceLocation;
            String var10004 = Class60. ("L\\CLIKZK\u001f_\\V@\u0016BVAZD\\If_YG\\|\u001d\u0014\u000b_\u0016hW<");
            if (llIIlllIIIll(18038, 7708)) {
                throw null;
            }

            Object[] var10005 = new Object[1];
            Integer var10008 = var1;
            if (llIIlllIIIll(18038, 7708)) {
                throw null;
            }

            var10005[0] = var10008;
            var10004 = String.format(var10004, var10005);
            if (llIIlllIIIll(18038, 7708)) {
                throw null;
            }

            var10002.<init> (var10004);
            if (llIIlllIIIll(18038, 7708)) {
                throw null;
            }

            var10000[var1] = var10002;
        }

        if (llIIlllIIIll(18038, 7708)) {
            throw null;
        } else {
            return                                                                                                  [
            var1];
        }
    }

    public int func_78276_b(String var1, int var2, int var3, int var4) {
        return this.func_175065_a(var1, (float) var2, (float) var3, var4, false);
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2) {
        int var3 = var1.length();
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        byte var7 = 0;
        int var10000 = var5;

        while (true) {
            if (llIIlllIIIll(48020, 5882)) {
                throw null;
            }

            if (!llIIlllIlIIl(var10000, var3)) {
                if (llIIlllIIIll(48020, 5882)) {
                    throw null;
                }

                var10000 = var5;
                break;
            }

            char var11;
            boolean var10001;
            label149:
            {
                char var8;
                label142:
                {
                    switch (var8 = var1.charAt(var5)) {
                        case '\n':
                            if (llIIlllIIIll(48020, 5882)) {
                                throw null;
                            }

                            --var5;

                            do {
                                if (llIIlllIIIll(48020, 5882)) {
                                    throw null;
                                }
                            } while (!llIIlllIIIlI(0));

                            var11 = var8;
                            var10001 = true;
                            break label149;
                        case ' ':
                            if (llIIlllIIIll(48020, 5882)) {
                                throw null;
                            }

                            var6 = var5;
                        default:
                            if (llIIlllIIIll(48020, 5882)) {
                                throw null;
                            }

                            var4 += this.func_78263_a(var8);
                            if (llIIlllIIlII(var7)) {
                                var11 = var8;
                                ++var4;
                                var10001 = true;
                                break label149;
                            }
                            break;
                        case '§':
                            if (llIIlllIIIll(48020, 5882)) {
                                throw null;
                            }

                            if (llIIlllIlIIl(var5, var3 - 1)) {
                                ++var5;
                                char var9;
                                if (llIIlllIIlll(var9 = var1.charAt(var5), 108) && llIIlllIIlll(var9, 76)) {
                                    if (!llIIlllIIlll(var9, 114) || !llIIlllIIlll(var9, 82)) {
                                        break label142;
                                    }

                                    byte var10 = (var9);
                                    if (llIIlllIIIll(48020, 5882)) {
                                        throw null;
                                    }

                                    if (llIIlllIIlII(var10)) {
                                        break label142;
                                    }
                                } else {
                                    if (llIIlllIIIll(48020, 5882)) {
                                        throw null;
                                    }

                                    var7 = 1;
                                }
                            }
                    }

                    if (llIIlllIIIll(48020, 5882)) {
                        throw null;
                    }

                    var11 = var8;
                    break label149;
                }

                if (llIIlllIIIll(48020, 5882)) {
                    throw null;
                }

                var7 = 0;
                var11 = var8;
                var10001 = true;
            }

            if (llIIlllIIIll(48020, 5882)) {
                throw null;
            }

            if (llIIlllIIllI(var11, 10)) {
                ++var5;
                var6 = var5;
                var10000 = var5;
                var10001 = true;
                break;
            }

            if (llIIlllIIIll(48020, 5882)) {
                throw null;
            }

            if (llIIlllIlIlI(var4, var2)) {
                var10000 = var5;
                var10001 = true;
                break;
            }

            if (llIIlllIIIll(48020, 5882)) {
                throw null;
            }

            ++var5;
            var10000 = var5;
            var10001 = true;
        }

        if (llIIlllIIIll(48020, 5882)) {
            throw null;
        } else if (llIIlllIIlll(var10000, var3) && llIIlllIIlll(var6, -1) && llIIlllIlIIl(var6, var5)) {
            return var6;
        } else if (llIIlllIIIll(48020, 5882)) {
            throw null;
        } else {
            return var5;
        }
    }

    public float func_78266_a(int var1, boolean var2) {
        int var3 = var1 % 16 * 8;
        int var4 = var1 / 16 * 8;
        byte var10000;
        if (llIIlllIIlII(var2)) {
            var10000 = 1;
            boolean var10001 = true;
        } else {
            if (llIIlllIIIll(23795, 3968)) {
                throw null;
            }

            var10000 = 0;
        }

        if (llIIlllIIIll(23795, 3968)) {
            throw null;
        } else {
            var2 = var10000;
            this.bindTexture(this.);
            float var5 = (float) (var1 = this.[var1])-0.01F;
            GlStateManager.func_187447_r(5);
            if (llIIlllIIIll(23795, 3968)) {
                throw null;
            } else {
                GlStateManager.func_187426_b((float) var3 / 128.0F, (float) var4 / 128.0F);
                if (llIIlllIIIll(23795, 3968)) {
                    throw null;
                } else {
                    GlStateManager.func_187435_e(this. + (float) var2, this., 0.0F);
                    if (llIIlllIIIll(23795, 3968)) {
                        throw null;
                    } else {
                        GlStateManager.func_187426_b((float) var3 / 128.0F, ((float) var4 + 7.99F) / 128.0F);
                        if (llIIlllIIIll(23795, 3968)) {
                            throw null;
                        } else {
                            GlStateManager.func_187435_e(this. - (float) var2, this. + 7.99F, 0.0F);
                            if (llIIlllIIIll(23795, 3968)) {
                                throw null;
                            } else {
                                GlStateManager.func_187426_b(((float) var3 + var5 - 1.0F) / 128.0F, (float) var4 / 128.0F);
                                if (llIIlllIIIll(23795, 3968)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_187435_e(this. + var5 - 1.0F + (float) var2, this., 0.0F);
                                    if (llIIlllIIIll(23795, 3968)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187426_b(((float) var3 + var5 - 1.0F) / 128.0F, ((float) var4 + 7.99F) / 128.0F);
                                        if (llIIlllIIIll(23795, 3968)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_187435_e(this. + var5 - 1.0F - (float) var2, this. + 7.99F, 0.0F);
                                            if (llIIlllIIIll(23795, 3968)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_187437_J();
                                                if (llIIlllIIIll(23795, 3968)) {
                                                    throw null;
                                                } else {
                                                    return (float) var1;
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
