import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.ThreadDownloadImageData;
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
public class Class195 implements IResourceManagerReloadListener {
    private static int 5128=27095;
    private static int 63029=-28673;
    private static int 8844=18378;
    private static int 1129=31010;
    private static int 21692=-13653;
    private static int 4945=1970;
    public final byte[];
    private static int 36466=-30387;
    private static int 4777=13117;
    private static int 58963=-22674;
    private boolean;
    private static int 87857=-20574;
    private static int 6716=6720;
    private static int 49408=-10043;
    private static final ResourceLocation[]                                                                                                  =new ResourceLocation[256];
    private static int 2521=8857;
    private static int 8071=2199;
    private boolean;
    private int;
    private static int 605=1321;
    private static int 23515=-5310;
    private final TextureManager;
    private static int 16269=-10452;
    private static int 9950=10547;
    private static int 8023=24600;
    private static int 95158=-27022;
    private static int 4285=19654;
    private static int 9996=9185;
    private static int 45200=-8347;
    private static int 2503=17873;
    private static int 82570=-7744;
    private static int 4084=18250;
    private static int 28960=-13124;
    private static int 44825=-29913;
    private static int 91640=-5880;
    private static int 9055=11548;
    private static int 47397=-17140;
    private static int 6819=5981;
    public Random;
    private static int 88637=-19943;
    private float;
    private static int 76412=-18731;
    private static int 36333=-20632;
    private static int 84957=-14223;
    private static int 7425=5421;
    private static int 35140=-10869;
    private static int 60949=-3687;
    private static int 23084=-22985;
    private static int 83261=-15807;
    private boolean;
    private static int 51724=-30296;
    private static int 7914=7081;
    private static int 9606=-16220;
    public final int[];
    public Class28;
    private static int 5657=13837;
    private boolean;
    private static int 1233=4115;
    private static int 8235=-21195;
    private static int 7526=10590;
    private boolean;
    private static int 69644=-14962;
    public float;
    private static int 80295=-18944;
    private static int 4097=28674;
    private static int 6275=2570;
    private float;
    private static int 58=5505;
    private static int 45553=-1159;
    public ResourceLocation;
    private static int 1973=14695;
    private static int 2792=26603;
    private static int 88005=-12302;
    private static int 6867=30502;
    private static int 767=25876;
    public Class95;
    private boolean;
    private static int 5774=15060;
    private boolean;
    private static int 59226=-8591;
    private static int 88700=-9128;
    private static int 1361=7012;
    private static int 7040=15341;
    private static int 1279=11554;
    private static int 68785=-26028;
    private static int 7199=3881;
    public float;
    private static int 90451=-7559;
    private static int 3780=10374;
    public int;
    private static int 1958=27547;
    private static int 556=8023;
    private static int 55723=-24368;
    private static int 861=10965;
    private static int 8998=1400;
    private static int 3052=889;
    private float;
    private static int 60928=-30231;
    private static int 62754=-30212;
    private static int 66179=-5673;
    private static int 66365=-20851;
    private static int 9270=10714;
    private static int 48525=-27507;
    private static int 3699=30470;
    private static int 8385=17158;
    private static int 58214=-28933;
    private static int 20911=-4271;
    private static int 7941=13573;
    private static int 9763=23927;
    private float;
    private static int 18339=-447;
    private static int 7320=15986;
    private static int 86953=-9923;
    private static int 4236=213;
    private static int 64343=-109;
    private final int[];
    private static int 61753=-5014;
    private static int 99873=-31905;
    private boolean;

    static {
        boolean var10000 = true;
    }

    public Class195(GameSettings var1, TextureManager var2) {
        int var10000 = 0;
        super();
        if (llIlIlllIIlI(86953, 9950)) {
            throw null;
        } else {
            this. = new int[256];
            this. = 9;
            Random var10016 = new Random();
            if (llIlIlllIIlI(86953, 9950)) {
                throw null;
            } else {
                this. = var10016;
                this. = new byte[65536];
                this. = new int[32];
                this. = true;
                Class28 var10009 = new Class28();
                if (llIlIlllIIlI(86953, 9950)) {
                    throw null;
                } else {
                    this. = var10009;
                    ResourceLocation var10008 = new ResourceLocation;
                    String var10010 = Class60. ("xhwx}\u007fn\u007f+khbt\"b\u007f\u007fdv\"hc<");
                    if (llIlIlllIIlI(86953, 9950)) {
                        throw null;
                    } else {
                        var10008.<init> (var10010);
                        if (llIlIlllIIlI(86953, 9950)) {
                            throw null;
                        } else {
                            this. = var10008;
                            this. = var2;
                            this. = false;
                            this.bindTexture(this.);

                            boolean var11;
                            for (int var9 = 0; !llIlIlllIIlI(86953, 9950); var11 = true) {
                                if (!llIlIlllIIll(var10000, 32)) {
                                    if (llIlIlllIIlI(86953, 9950)) {
                                        throw null;
                                    }

                                    this. ();
                                    if (llIlIlllIIlI(86953, 9950)) {
                                        throw null;
                                    }

                                    boolean var10 = true;
                                    return;
                                }

                                int var3 = (var9 >> 3 & 1) * 85;
                                int var4 = (var9 >> 2 & 1) * 170 + var3;
                                int var5 = (var9 >> 1 & 1) * 170 + var3;
                                var3 += (var9 >> 0 & 1) * 170;
                                if (llIlIlllIlII(var9, 6)) {
                                    var4 += 85;
                                }

                                if (llIlIlllIIlI(86953, 9950)) {
                                    throw null;
                                }

                                if (llIlIlllIlIl(var1.field_74337_g)) {
                                    int var6 = (var4 * 30 + var5 * 59 + var3 * 11) / 100;
                                    int var7 = (var4 * 30 + var5 * 70) / 100;
                                    int var8 = (var4 * 30 + var3 * 70) / 100;
                                    var4 = var6;
                                    var5 = var7;
                                    var3 = var8;
                                }

                                if (llIlIlllIIlI(86953, 9950)) {
                                    throw null;
                                }

                                if (llIlIlllIIlI(var9, 16)) {
                                    var4 /= 4;
                                    var5 /= 4;
                                    var3 /= 4;
                                }

                                if (llIlIlllIIlI(86953, 9950)) {
                                    throw null;
                                }

                                int var10001 = var9;
                                int var10002 = (var4 & 255) << 16 | (var5 & 255) << 8 | var3 & 255;
                                ++var9;
                                this.                                                                                              [
                                var10001] =var10002;
                                var10000 = var9;
                            }

                            throw null;
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllIIIIIII(int var0) {
        return var0 < 0;
    }

    private static boolean llIlIllllIIl(int var0) {
        return var0 >= 0;
    }

    private static boolean llIlIllllllI(int var0) {
        return var0 > 0;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(char var0) {
        if (!llIlIlllIIlI(var0, 107) || llIlIllllIll(var0, 111)) {
            if (llIlIlllIIlI(23515, 4236)) {
                throw null;
            }

            if (!llIlIlllIIlI(var0, 75) || llIlIllllIll(var0, 79)) {
                if (llIlIlllIIlI(23515, 4236)) {
                    throw null;
                }

                if (llIlIlllllIl(var0, 114) && !llIlIlllIlII(var0, 82)) {
                    if (llIlIlllIIlI(23515, 4236)) {
                        throw null;
                    }

                    return false;
                }
            }
        }

        if (llIlIlllIIlI(23515, 4236)) {
            throw null;
        } else {
            return true;
        }
    }

    private static boolean ____________________________________________________________________________/* $FF was:                                                                             */(char var0) {
        if (!llIlIlllIIlI(var0, 48) || llIlIllllIll(var0, 57)) {
            if (llIlIlllIIlI(64343, 3052)) {
                throw null;
            }

            if (!llIlIlllIIlI(var0, 97) || llIlIllllIll(var0, 102)) {
                if (llIlIlllIIlI(64343, 3052)) {
                    throw null;
                }

                if (!llIlIlllIIlI(var0, 65) || !llIlIlllllII(var0, 70)) {
                    if (llIlIlllIIlI(64343, 3052)) {
                        throw null;
                    }

                    return false;
                }
            }
        }

        if (llIlIlllIIlI(64343, 3052)) {
            throw null;
        } else {
            return true;
        }
    }

    public static String ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var0) {
        String var1 = "";
        int var2 = -1;
        int var3 = var0.length();

        while (!llIlIlllIIlI(58963, 4097)) {
            if (!llIlIlllllIl(var2 = var0.indexOf(167, var2 + 1), -1)) {
                if (llIlIlllIIlI(58963, 4097)) {
                    throw null;
                }

                return var1;
            }

            if (llIlIlllIIll(var2, var3 - 1)) {
                char var4;
                byte var10000 = (var4 = var0.charAt(var2 + 1));
                if (llIlIlllIIlI(58963, 4097)) {
                    throw null;
                }

                StringBuilder var5;
                boolean var6;
                if (llIlIlllIlIl(var10000)) {
                    var5 = new StringBuilder();
                    if (llIlIlllIIlI(58963, 4097)) {
                        throw null;
                    }

                    String var10002 = Class60. ("ü");
                    if (llIlIlllIIlI(58963, 4097)) {
                        throw null;
                    }

                    var1 = String.valueOf(var5.insert(0, var10002).append(var4));
                    var6 = true;
                } else {
                    if (llIlIlllIIlI(58963, 4097)) {
                        throw null;
                    }

                    var10000 = (var4);
                    if (llIlIlllIIlI(58963, 4097)) {
                        throw null;
                    }

                    if (llIlIlllIlIl(var10000)) {
                        var5 = new StringBuilder();
                        if (llIlIlllIIlI(58963, 4097)) {
                            throw null;
                        }

                        var5 = var5.insert(0, var1);
                        String var10001 = Class60. ("ü");
                        if (llIlIlllIIlI(58963, 4097)) {
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

    private static boolean llIlIlllIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIlllllIl(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIlIlllIlII(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIlIllllIll(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIlIlllIIll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlIlllllll(Object var0) {
        return var0 == null;
    }

    private static boolean llIlIllllIII(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIlllllII(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llIlIllllIlI(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIlllIlIl(int var0) {
        return var0 != 0;
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        IResource var1 = null;

        try {
            try {
                if (llIlIlllIIlI(18339, 1129)) {
                    throw null;
                }

                ResourceLocation var10001 = new ResourceLocation;
                String var10003 = Class60. ("}uvo0}pbcrOh~`qh%xa5");
                if (llIlIlllIIlI(18339, 1129)) {
                    throw null;
                }

                var10001.<init> (var10003);
                if (llIlIlllIIlI(18339, 1129)) {
                    throw null;
                }

                (var1 = this.getResource(var10001)).func_110527_b().read(this.);
            } catch (IOException var5) {
                if (llIlIlllIIlI(18339, 1129)) {
                    throw null;
                }

                RuntimeException var10000 = new RuntimeException(var5);
                if (llIlIlllIIlI(18339, 1129)) {
                    throw null;
                }

                throw var10000;
            }
        } catch (Throwable var6) {
            if (llIlIlllIIlI(18339, 1129)) {
                throw null;
            }

            if (llIlIlllIIlI(18339, 1129)) {
                throw null;
            }

            IOUtils.closeQuietly(var1);
            if (llIlIlllIIlI(18339, 1129)) {
                throw null;
            }

            throw var6;
        }

        if (llIlIlllIIlI(18339, 1129)) {
            throw null;
        } else {
            IOUtils.closeQuietly(var1);
            if (llIlIlllIIlI(18339, 1129)) {
                throw null;
            } else {
                boolean var7 = true;
            }
        }
    }

    public boolean getUnicodeFlag() {
        return this.;
    }

    public void setUnicodeFlag(boolean var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public int getStringWidth(String var1) {
        return this.getStringWidth(var1, true);
    }

    public int getStringWidthNotNp(String var1) {
        return this.getStringWidth(var1, false);
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2) {
        int var3 = var1.length();
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        byte var7 = 0;
        int var10000 = var5;

        while (true) {
            if (llIlIlllIIlI(20911, 6716)) {
                throw null;
            }

            if (!llIlIlllIIll(var10000, var3)) {
                if (llIlIlllIIlI(20911, 6716)) {
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
                            if (llIlIlllIIlI(20911, 6716)) {
                                throw null;
                            }

                            --var5;

                            do {
                                if (llIlIlllIIlI(20911, 6716)) {
                                    throw null;
                                }
                            } while (!llIlIllllIII(0));

                            var11 = var8;
                            var10001 = true;
                            break label149;
                        case ' ':
                            if (llIlIlllIIlI(20911, 6716)) {
                                throw null;
                            }

                            var6 = var5;
                        default:
                            if (llIlIlllIIlI(20911, 6716)) {
                                throw null;
                            }

                            var4 += this.getCharWidth(var8);
                            if (llIlIlllIlIl(var7)) {
                                var11 = var8;
                                ++var4;
                                var10001 = true;
                                break label149;
                            }
                            break;
                        case '§':
                            if (llIlIlllIIlI(20911, 6716)) {
                                throw null;
                            }

                            if (llIlIlllIIll(var5, var3 - 1)) {
                                ++var5;
                                char var9;
                                if (llIlIlllllIl(var9 = var1.charAt(var5), 108) && llIlIlllllIl(var9, 76)) {
                                    if (!llIlIlllllIl(var9, 114) || !llIlIlllllIl(var9, 82)) {
                                        break label142;
                                    }

                                    byte var10 = (var9);
                                    if (llIlIlllIIlI(20911, 6716)) {
                                        throw null;
                                    }

                                    if (llIlIlllIlIl(var10)) {
                                        break label142;
                                    }
                                } else {
                                    if (llIlIlllIIlI(20911, 6716)) {
                                        throw null;
                                    }

                                    var7 = 1;
                                }
                            }
                    }

                    if (llIlIlllIIlI(20911, 6716)) {
                        throw null;
                    }

                    var11 = var8;
                    break label149;
                }

                if (llIlIlllIIlI(20911, 6716)) {
                    throw null;
                }

                var7 = 0;
                var11 = var8;
                var10001 = true;
            }

            if (llIlIlllIIlI(20911, 6716)) {
                throw null;
            }

            if (llIlIlllIlII(var11, 10)) {
                ++var5;
                var6 = var5;
                var10000 = var5;
                var10001 = true;
                break;
            }

            if (llIlIlllIIlI(20911, 6716)) {
                throw null;
            }

            if (llIlIllllIll(var4, var2)) {
                var10000 = var5;
                var10001 = true;
                break;
            }

            if (llIlIlllIIlI(20911, 6716)) {
                throw null;
            }

            ++var5;
            var10000 = var5;
            var10001 = true;
        }

        if (llIlIlllIIlI(20911, 6716)) {
            throw null;
        } else if (llIlIlllllIl(var10000, var3) && llIlIlllllIl(var6, -1) && llIlIlllIIll(var6, var5)) {
            return var6;
        } else if (llIlIlllIIlI(20911, 6716)) {
            throw null;
        } else {
            return var5;
        }
    }

    public float renderUnicodeChar(char var1, boolean var2) {
        int var3;
        if (llIlIllllIII(var3 = this.[var1] & 255)){
            return 0.0F;
        } else if (llIlIlllIIlI(21692, 1973)) {
            throw null;
        } else {
            int var4 = var1 / 256;
            this. (var4);
            if (llIlIlllIIlI(21692, 1973)) {
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
                if (llIlIlllIlIl(var2)) {
                    var10000 = 1.0F;
                    boolean var10001 = true;
                } else {
                    if (llIlIlllIIlI(21692, 1973)) {
                        throw null;
                    }

                    var10000 = 0.0F;
                }

                if (llIlIlllIIlI(21692, 1973)) {
                    throw null;
                } else {
                    float var8 = var10000;
                    GlStateManager.func_187447_r(5);
                    if (llIlIlllIIlI(21692, 1973)) {
                        throw null;
                    } else {
                        GlStateManager.func_187426_b(var5 / 256.0F, var7 / 256.0F);
                        if (llIlIlllIIlI(21692, 1973)) {
                            throw null;
                        } else {
                            GlStateManager.func_187435_e(this. + var8, this., 0.0F);
                            if (llIlIlllIIlI(21692, 1973)) {
                                throw null;
                            } else {
                                GlStateManager.func_187426_b(var5 / 256.0F, (var7 + 15.98F) / 256.0F);
                                if (llIlIlllIIlI(21692, 1973)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_187435_e(this. - var8, this. + 7.99F, 0.0F);
                                    if (llIlIlllIIlI(21692, 1973)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187426_b((var5 + var6) / 256.0F, var7 / 256.0F);
                                        if (llIlIlllIIlI(21692, 1973)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_187435_e(this. + var6 / 2.0F + var8, this., 0.0F);
                                            if (llIlIlllIIlI(21692, 1973)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_187426_b((var5 + var6) / 256.0F, (var7 + 15.98F) / 256.0F);
                                                if (llIlIlllIIlI(21692, 1973)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.func_187435_e(this. + var6 / 2.0F - var8, this. + 7.99F, 0.0F);
                                                    if (llIlIlllIIlI(21692, 1973)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.func_187437_J();
                                                        if (llIlIlllIIlI(21692, 1973)) {
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

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void doDraw(float var1) {
        Tessellator var10000;
        BufferBuilder var3;
        if (llIlIlllIlIl(this.)) {
            var10000 = Tessellator.func_178181_a();
            if (llIlIlllIIlI(51724, 7199)) {
                throw null;
            }

            var3 = var10000.func_178180_c();
            GlStateManager.func_179090_x();
            if (llIlIlllIIlI(51724, 7199)) {
                throw null;
            }

            var3.func_181668_a(7, DefaultVertexFormats.field_181705_e);
            var3.func_181662_b((double) this., (double) (this. + (float) (this. / 2)), 0.0D).func_181675_d();
            var3.func_181662_b((double) (this. + var1), (double) (this. + (float) (this. / 2)), 0.0D).func_181675_d();
            var3.func_181662_b((double) (this. + var1), (double) (this. + (float) (this. / 2) - 1.0F), 0.0D).func_181675_d();
            var3.func_181662_b((double) this., (double) (this. + (float) (this. / 2) - 1.0F), 0.0D).func_181675_d();
            var10000.func_78381_a();
            GlStateManager.func_179098_w();
            if (llIlIlllIIlI(51724, 7199)) {
                throw null;
            }
        }

        if (llIlIlllIIlI(51724, 7199)) {
            throw null;
        } else {
            if (llIlIlllIlIl(this.)) {
                var10000 = Tessellator.func_178181_a();
                if (llIlIlllIIlI(51724, 7199)) {
                    throw null;
                }

                Tessellator var2 = var10000;
                var3 = var10000.func_178180_c();
                GlStateManager.func_179090_x();
                if (llIlIlllIIlI(51724, 7199)) {
                    throw null;
                }

                var3.func_181668_a(7, DefaultVertexFormats.field_181705_e);
                byte var5;
                if (llIlIlllIlIl(this.)) {
                    var5 = -1;
                    boolean var10001 = true;
                } else {
                    if (llIlIlllIIlI(51724, 7199)) {
                        throw null;
                    }

                    var5 = 0;
                }

                if (llIlIlllIIlI(51724, 7199)) {
                    throw null;
                }

                byte var4 = var5;
                var3.func_181662_b((double) (this. + (float) var4), (double) (this. + (float) this.), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + var1), (double) (this. + (float) this.), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + var1), (double) (this. + (float) this. - 1.0F), 0.0D).func_181675_d();
                var3.func_181662_b((double) (this. + (float) var4), (double) (this. + (float) this. - 1.0F), 0.0D).func_181675_d();
                var2.func_78381_a();
                GlStateManager.func_179098_w();
                if (llIlIlllIIlI(51724, 7199)) {
                    throw null;
                }
            }

            if (llIlIlllIIlI(51724, 7199)) {
                throw null;
            } else {
                this. += (float) ((int) var1);
                boolean var6 = true;
            }
        }
    }

    public IResource getResource(ResourceLocation var1) throws IOException {
        Minecraft var10000 = Minecraft.func_71410_x();
        if (llIlIlllIIlI(48525, 4285)) {
            throw null;
        } else {
            return var10000.func_110442_L().func_110536_a(var1);
        }
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (llIlIlllIlIl(this.)) {
            String var10001 = this. (var1);
            if (llIlIlllIIlI(87857, 7941)) {
                throw null;
            }

            int var7 = this.getStringWidth(var10001);
            var2 = var2 + var4 - var7;
        }

        if (llIlIlllIIlI(87857, 7941)) {
            throw null;
        } else {
            int var10000 = this. (var1, (float) var2, (float) var3, var5, var6);
            if (llIlIlllIIlI(87857, 7941)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, int var2, int var3, int var4, boolean var5) {
        boolean var10001;
        Iterator var7;
        for (Iterator var10000 = var7 = this.listFormattedStringToWidth(var1, var4).iterator(); !llIlIlllIIlI(36466, 4777); var10001 = true) {
            if (!llIlIlllIlIl(var10000.hasNext())) {
                if (llIlIlllIIlI(36466, 4777)) {
                    throw null;
                }

                boolean var8 = true;
                return;
            }

            String var6 = (String) var7.next();
            var10000 = var7;
            this. (var6, var2, var3, var4, this., var5);
            if (llIlIlllIIlI(36466, 4777)) {
                throw null;
            }

            var3 += this.;
        }

        throw null;
    }

    public void bindTexture(ResourceLocation var1) {
        Minecraft var10000 = Minecraft.func_71410_x();
        if (llIlIlllIIlI(58214, 9763)) {
            throw null;
        } else {
            Minecraft var2 = var10000;
            if (llIlIllllIlI(this.)) {
                if (llIlIllllIlI(var2.field_71441_e)) {
                    label82:
                    {
                        if (llIlIllllIII(this.)) {
                            TextureManager var6 = var2.func_110434_K();
                            ResourceLocation var10001 = new ResourceLocation;
                            String var10003 = Class60. ("rasz~<d}<");
                            if (llIlIlllIIlI(58214, 9763)) {
                                throw null;
                            }

                            var10001.<init> (var10003);
                            if (llIlIlllIIlI(58214, 9763)) {
                                throw null;
                            }

                            if (!llIlIlllllll(var6.func_110581_b(var10001))) {
                                break label82;
                            }
                        }

                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        if (llIlIlllIlIl(this.. (1000))){
                        this.                                                                                          .
                        ();
                        String var7 = Class60.
                        ("TIKL\u0002\u0012\u0014_G\u000e\u0006\u0005\u0002\b\u001dHAJJ^\u0006O^\u0013M^HRS\u0012BO\u007fTv\u0012hS<");
                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        String var3 = var7;
                        ResourceLocation var8 = new ResourceLocation;
                        String var10002 = Class60. ("rasz~<d}<");
                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        var8.<init> (var10002);
                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        ResourceLocation var4 = var8;
                        new ThreadDownloadImageData((File) null, var3, (ResourceLocation) null, (IImageBuffer) null);
                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        ThreadDownloadImageData var9 = new ThreadDownloadImageData((File) null, var3, (ResourceLocation) null, (IImageBuffer) null);
                        if (llIlIlllIIlI(58214, 9763)) {
                            throw null;
                        }

                        ThreadDownloadImageData var5 = var9;
                        var2.func_110434_K().func_110579_a(var4, var5);
                        this. = var4;
                        this. = false;
                    }
                    }
                }

                if (llIlIlllIIlI(58214, 9763)) {
                    throw null;
                }

                if (llIlIllllIlI(var2.field_71439_g)) {
                    this.                                                                                .
                    func_110577_a(var1);
                }
            }

            if (llIlIlllIIlI(58214, 9763)) {
                throw null;
            } else {
                boolean var10 = true;
            }
        }
    }

    public void setColor(float var1, float var2, float var3, float var4) {
        GlStateManager.func_179131_c(var1, var2, var3, var4);
        if (llIlIlllIIlI(45200, 4945)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private String _____________________________________________________________________________________/* $FF was:                                                                                      */(String var1) {
        String var10000 = var1;

        while (true) {
            if (llIlIlllIIlI(88637, 9996)) {
                throw null;
            }

            if (!llIlIllllIlI(var10000)) {
                break;
            }

            String var10001 = Class60. ("Q");
            if (llIlIlllIIlI(88637, 9996)) {
                throw null;
            }

            if (!llIlIlllIlIl(var1.endsWith(var10001))) {
                break;
            }

            var10000 = var1 = var1.substring(0, var1.length() - 1);
            boolean var2 = true;
        }

        if (llIlIlllIIlI(88637, 9996)) {
            throw null;
        } else {
            return var1;
        }
    }

    private String ____________________________________________________________________________/* $FF was:                                                                             */(String var1) {
        String var4;
        try {
            if (llIlIlllIIlI(84957, 1361)) {
                throw null;
            }

            Bidi var10000 = new Bidi;
            ArabicShaping var10002 = new ArabicShaping(8);
            if (llIlIlllIIlI(84957, 1361)) {
                throw null;
            }

            var10000.<init> (var10002.shape(var1), 127);
            if (llIlIlllIIlI(84957, 1361)) {
                throw null;
            }

            Bidi var2 = var10000;
            var2.setReorderingMode(0);
            var4 = var2.writeReordered(2);
        } catch (ArabicShapingException var3) {
            if (llIlIlllIIlI(84957, 1361)) {
                throw null;
            }

            return var1;
        }

        if (llIlIlllIIlI(84957, 1361)) {
            throw null;
        } else {
            return var4;
        }
    }

    private void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        this. = this. = false;
        this. = false;
        this. = false;
        this. = false;
        boolean var10000 = true;
    }

    public void func_110549_a(IResourceManager var1) {
        this. ();
        if (llIlIlllIIlI(66365, 3699)) {
            throw null;
        } else {
            this. ();
            if (llIlIlllIIlI(66365, 3699)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        ResourceLocation var10001 = this. (var1);
        if (llIlIlllIIlI(88700, 1958)) {
            throw null;
        } else {
            this.bindTexture(var10001);
            boolean var10000 = true;
        }
    }

    public int getStringWidth(String var1, boolean var2) {
        if (llIlIllllIlI(this.)) {
            var1 = this.                                                                                  .(var1);
        }

        if (llIlIlllIIlI(95158, 3780)) {
            throw null;
        } else if (llIlIlllllll(var1)) {
            return 0;
        } else if (llIlIlllIIlI(95158, 3780)) {
            throw null;
        } else {
            int var7 = 0;
            byte var3 = 0;

            boolean var10001;
            int var4;
            for (int var10000 = var4 = 0; !llIlIlllIIlI(95158, 3780); var10001 = true) {
                if (!llIlIlllIIll(var10000, var1.length())) {
                    if (llIlIlllIIlI(95158, 3780)) {
                        throw null;
                    }

                    return var7;
                }

                int var6;
                if (llIllIIIIIII(var6 = this.getCharWidth(var1.charAt(var4))) && llIlIlllIIll(var4, var1.length() - 1)) {
                    ++var4;
                    char var5;
                    if (llIlIlllllIl(var5 = var1.charAt(var4), 108) && llIlIlllllIl(var5, 76)) {
                        if (!llIlIlllllIl(var5, 114) || llIlIlllIlII(var5, 82)) {
                            if (llIlIlllIIlI(95158, 3780)) {
                                throw null;
                            }

                            var3 = 0;
                            boolean var8 = true;
                        }
                    } else {
                        if (llIlIlllIIlI(95158, 3780)) {
                            throw null;
                        }

                        var3 = 1;
                    }

                    if (llIlIlllIIlI(95158, 3780)) {
                        throw null;
                    }

                    var6 = 0;
                }

                if (llIlIlllIIlI(95158, 3780)) {
                    throw null;
                }

                var7 += var6;
                if (llIlIlllIlIl(var3) && llIlIllllllI(var6)) {
                    ++var7;
                }

                if (llIlIlllIIlI(95158, 3780)) {
                    throw null;
                }

                ++var4;
                var10000 = var4;
            }

            throw null;
        }
    }

    public int drawString(String var1, float var2, float var3, int var4) {
        return this.drawString(var1, var2, var3, var4, false, true);
    }

    public void enableAlpha() {
        GlStateManager.func_179141_d();
        if (llIlIlllIIlI(60928, 2792)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public boolean getBidiFlag() {
        return this.;
    }

    public void setBidiFlag(boolean var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public String trimStringToWidth(String var1, int var2) {
        return this.trimStringToWidth(var1, var2, false);
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, boolean var2) {
        int var3;
        boolean var14;
        for (int var10000 = var3 = 0; !llIlIlllIIlI(8235, 7040); var14 = true) {
            boolean var16;
            if (!llIlIlllIIll(var10000, var1.length())) {
                if (llIlIlllIIlI(8235, 7040)) {
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
            if (llIlIlllIlII(var4 = var1.charAt(var3), 167) && llIlIlllIIll(var3 + 1, var1.length())) {
                var11 = Class60. ("**+)*.+-*\"pxu\u007fp|awdta)");
                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                var10001 = String.valueOf(var1.charAt(var3 + 1));
                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                if (!llIlIlllIIll(var5 = var11.indexOf(var10001.toLowerCase(Locale.ROOT).charAt(0)), 16)) {
                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    if (llIlIlllIlII(var5, 16)) {
                        this. = true;
                        var16 = true;
                    } else {
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        if (llIlIlllIlII(var5, 17)) {
                            this. = true;
                            var16 = true;
                        } else {
                            if (llIlIlllIIlI(8235, 7040)) {
                                throw null;
                            }

                            if (llIlIlllIlII(var5, 18)) {
                                this. = true;
                                var16 = true;
                            } else {
                                if (llIlIlllIIlI(8235, 7040)) {
                                    throw null;
                                }

                                if (llIlIlllIlII(var5, 19)) {
                                    this. = true;
                                    var16 = true;
                                } else {
                                    if (llIlIlllIIlI(8235, 7040)) {
                                        throw null;
                                    }

                                    if (llIlIlllIlII(var5, 20)) {
                                        this. = true;
                                        var16 = true;
                                    } else {
                                        if (llIlIlllIIlI(8235, 7040)) {
                                            throw null;
                                        }

                                        if (llIlIlllIlII(var5, 21)) {
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
                    if (!llIlIllllIIl(var5) || llIlIllllIll(var5, 15)) {
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        var5 = 15;
                    }

                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    if (llIlIlllIlIl(var2)) {
                        var5 += 16;
                    }

                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    this. = var6 = this.                                                                                              [
                    var5];
                    this.setColor((float) (var6 >> 16) / 255.0F, (float) (var6 >> 8 & 255) / 255.0F, (float) (var6 & 255) / 255.0F, this.);
                    var16 = true;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                ++var3;
                var16 = true;
            } else {
                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                var11 = Class60.
                ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                var5 = var11.indexOf(var4);
                if (llIlIlllIlIl(this.) && llIlIlllllIl(var5, -1)) {
                    var6 = this.getCharWidth(var4);

                    while (true) {
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        Random var12 = this.;
                        var10001 = Class60.
                        ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        var5 = var12.nextInt(var10001.length());
                        var11 = Class60.
                        ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        char var7 = var11.charAt(var5);
                        if (llIlIlllIlII(var6, this.getCharWidth(var7))) {
                            var14 = true;
                            if (llIlIlllIIlI(8235, 7040)) {
                                throw null;
                            }

                            var4 = var7;
                            break;
                        }
                    }
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                float var13;
                if (llIlIlllllIl(var5, -1) && !llIlIlllIlIl(this.)) {
                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    var13 = 1.0F;
                } else {
                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    var13 = 0.5F;
                    var14 = true;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                float var9;
                byte var15;
                label282:
                {
                    var9 = var13;
                    if (!llIlIlllIlIl(var4) || !llIlIlllllIl(var5, -1) || llIlIlllIlIl(this.)) {
                        if (llIlIlllIIlI(8235, 7040)) {
                            throw null;
                        }

                        if (llIlIlllIlIl(var2)) {
                            var15 = 1;
                            var14 = true;
                            break label282;
                        }
                    }

                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    var15 = 0;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                byte var10 = var15;
                if (llIlIlllIlIl(var10)) {
                    this. -= var9;
                    this. -= var9;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                var13 = this. (var4, this.                                                                                                     )
                ;
                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                float var8 = var13;
                if (llIlIlllIlIl(var10)) {
                    this. += var9;
                    this. += var9;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                if (llIlIlllIlIl(this.)) {
                    this. += var9;
                    if (llIlIlllIlIl(var10)) {
                        this. -= var9;
                        this. -= var9;
                    }

                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    this. (var4, this.                                                                                                     )
                    ;
                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    this. -= var9;
                    if (llIlIlllIlIl(var10)) {
                        this. += var9;
                        this. += var9;
                    }

                    if (llIlIlllIIlI(8235, 7040)) {
                        throw null;
                    }

                    ++var8;
                }

                if (llIlIlllIIlI(8235, 7040)) {
                    throw null;
                }

                this.doDraw(var8);
            }

            if (llIlIlllIIlI(8235, 7040)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public int drawStringNotNp(String var1, float var2, float var3, int var4) {
        return this.drawString(var1, var2, var3, var4, false, false);
    }

    public String trimStringToWidth(String var1, int var2, boolean var3) {
        StringBuilder var10000 = new StringBuilder();
        if (llIlIlllIIlI(49408, 8385)) {
            throw null;
        } else {
            StringBuilder var4 = var10000;
            int var5 = 0;
            int var12;
            boolean var10001;
            if (llIlIlllIlIl(var3)) {
                var12 = var1.length() - 1;
                var10001 = true;
            } else {
                if (llIlIlllIIlI(49408, 8385)) {
                    throw null;
                }

                var12 = 0;
            }

            if (llIlIlllIIlI(49408, 8385)) {
                throw null;
            } else {
                int var6 = var12;
                byte var13;
                if (llIlIlllIlIl(var3)) {
                    var13 = -1;
                    var10001 = true;
                } else {
                    if (llIlIlllIIlI(49408, 8385)) {
                        throw null;
                    }

                    var13 = 1;
                }

                if (llIlIlllIIlI(49408, 8385)) {
                    throw null;
                } else {
                    byte var7 = var13;
                    byte var8 = 0;
                    byte var9 = 0;
                    var12 = var6 = var6;

                    while (true) {
                        if (llIlIlllIIlI(49408, 8385)) {
                            throw null;
                        }

                        if (!llIlIllllIIl(var12) || !llIlIlllIIll(var6, var1.length()) || !llIlIlllIIll(var5, var2)) {
                            if (llIlIlllIIlI(49408, 8385)) {
                                throw null;
                            }

                            var10000 = var4;
                            break;
                        }

                        char var10;
                        label141:
                        {
                            int var11 = this.getCharWidth(var10 = var1.charAt(var6));
                            if (llIlIlllIlIl(var8)) {
                                var8 = 0;
                                if (!llIlIlllllIl(var10, 108) || !llIlIlllllIl(var10, 76)) {
                                    if (llIlIlllIIlI(49408, 8385)) {
                                        throw null;
                                    }

                                    var9 = 1;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }

                                if (!llIlIlllllIl(var10, 114) || llIlIlllIlII(var10, 82)) {
                                    if (llIlIlllIIlI(49408, 8385)) {
                                        throw null;
                                    }

                                    var9 = 0;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }
                            } else {
                                if (llIlIlllIIlI(49408, 8385)) {
                                    throw null;
                                }

                                if (llIllIIIIIII(var11)) {
                                    var8 = 1;
                                    var12 = var5;
                                    var10001 = true;
                                    break label141;
                                }

                                if (llIlIlllIIlI(49408, 8385)) {
                                    throw null;
                                }

                                var5 += var11;
                                if (llIlIlllIlIl(var9)) {
                                    ++var5;
                                }
                            }

                            if (llIlIlllIIlI(49408, 8385)) {
                                throw null;
                            }

                            var12 = var5;
                        }

                        if (llIlIlllIIlI(49408, 8385)) {
                            throw null;
                        }

                        if (llIlIllllIll(var12, var2)) {
                            var10000 = var4;
                            var10001 = true;
                            break;
                        }

                        if (llIlIlllIIlI(49408, 8385)) {
                            throw null;
                        }

                        if (llIlIlllIlIl(var3)) {
                            var4.insert(0, var10);
                            var12 = var6;
                            var10001 = true;
                        } else {
                            if (llIlIlllIIlI(49408, 8385)) {
                                throw null;
                            }

                            var4.append(var10);
                            var12 = var6;
                        }

                        if (llIlIlllIIlI(49408, 8385)) {
                            throw null;
                        }

                        var12 = var6 = var12 + var7;
                        var10001 = true;
                    }

                    if (llIlIlllIIlI(49408, 8385)) {
                        throw null;
                    } else {
                        return String.valueOf(var10000);
                    }
                }
            }
        }
    }

    public int drawStringWithShadow(String var1, float var2, float var3, int var4) {
        return this.drawString(var1, var2, var3, var4, true, true);
    }

    public List listFormattedStringToWidth(String var1, int var2) {
        String var10000 = this.wrapFormattedStringToWidth(var1, var2);
        String var10001 = Class60. ("Q");
        if (llIlIlllIIlI(82570, 556)) {
            throw null;
        } else {
            List var3 = Arrays.asList(var10000.split(var10001));
            if (llIlIlllIIlI(82570, 556)) {
                throw null;
            } else {
                return var3;
            }
        }
    }

    public void drawSplitString(String var1, int var2, int var3, int var4, int var5) {
        this. ();
        if (llIlIlllIIlI(23084, 861)) {
            throw null;
        } else {
            this. = var5;
            String var10001 = this. (var1);
            if (llIlIlllIIlI(23084, 861)) {
                throw null;
            } else {
                this. (var10001, var2, var3, var4, false);
                if (llIlIlllIIlI(23084, 861)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    private float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(char var1, boolean var2) {
        if (llIlIlllIlII(var1, 160)) {
            return 4.0F;
        } else if (llIlIlllIIlI(69644, 7425)) {
            throw null;
        } else if (llIlIlllIlII(var1, 32)) {
            return 4.0F;
        } else if (llIlIlllIIlI(69644, 7425)) {
            throw null;
        } else {
            String var10000 = Class60.
            ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
            if (llIlIlllIIlI(69644, 7425)) {
                throw null;
            } else {
                int var3;
                if (llIlIlllllIl(var3 = var10000.indexOf(var1), -1) && llIlIllllIII(this.)) {
                    return this.renderDefaultChar(var3, var2);
                } else if (llIlIlllIIlI(69644, 7425)) {
                    throw null;
                } else {
                    return this.renderUnicodeChar(var1, var2);
                }
            }
        }
    }

    public int getWordWrappedHeight(String var1, int var2) {
        return this. * this.listFormattedStringToWidth(var1, var2).size();
    }

    private ResourceLocation ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        if (llIlIlllllll([var1])){
            ResourceLocation[] var10000 = ;
            ResourceLocation var10002 = new ResourceLocation;
            String var10004 = Class60. ("L\\CLIKZK\u001f_\\V@\u0016BVAZD\\If_YG\\|\u001d\u0014\u000b_\u0016hW<");
            if (llIlIlllIIlI(76412, 7320)) {
                throw null;
            }

            Object[] var10005 = new Object[1];
            Integer var10008 = var1;
            if (llIlIlllIIlI(76412, 7320)) {
                throw null;
            }

            var10005[0] = var10008;
            var10004 = String.format(var10004, var10005);
            if (llIlIlllIIlI(76412, 7320)) {
                throw null;
            }

            var10002.<init> (var10004);
            if (llIlIlllIIlI(76412, 7320)) {
                throw null;
            }

            var10000[var1] = var10002;
        }

        if (llIlIlllIIlI(76412, 7320)) {
            throw null;
        } else {
            return                                                                                                 [var1]
            ;
        }
    }

    public String wrapFormattedStringToWidth(String var1, int var2) {
        int var10001 = this. (var1, var2);
        if (llIlIlllIIlI(16269, 4084)) {
            throw null;
        } else {
            int var3 = var10001;
            if (llIlIlllllII(var1.length(), var3)) {
                return var1;
            } else if (llIlIlllIIlI(16269, 4084)) {
                throw null;
            } else {
                String var4 = var1.substring(0, var3);
                char var5;
                byte var10000;
                if (llIlIlllllIl(var5 = var1.charAt(var3), 32) && !llIlIlllIlII(var5, 10)) {
                    if (llIlIlllIIlI(16269, 4084)) {
                        throw null;
                    }

                    var10000 = 0;
                } else {
                    if (llIlIlllIIlI(16269, 4084)) {
                        throw null;
                    }

                    var10000 = 1;
                    boolean var8 = true;
                }

                if (llIlIlllIIlI(16269, 4084)) {
                    throw null;
                } else {
                    byte var6 = var10000;
                    StringBuilder var7 = new StringBuilder();
                    if (llIlIlllIIlI(16269, 4084)) {
                        throw null;
                    } else {
                        String var10002 = (var4);
                        if (llIlIlllIIlI(16269, 4084)) {
                            throw null;
                        } else {
                            var7 = var7.insert(0, var10002);
                            byte var10003;
                            if (llIlIlllIlIl(var6)) {
                                var10003 = 1;
                                boolean var10004 = true;
                            } else {
                                if (llIlIlllIIlI(16269, 4084)) {
                                    throw null;
                                }

                                var10003 = 0;
                            }

                            if (llIlIlllIIlI(16269, 4084)) {
                                throw null;
                            } else {
                                var1 = String.valueOf(var7.append(var1.substring(var3 + var10003)));
                                var7 = new StringBuilder();
                                if (llIlIlllIIlI(16269, 4084)) {
                                    throw null;
                                } else {
                                    var7 = var7.insert(0, var4);
                                    String var9 = Class60. ("Q");
                                    if (llIlIlllIIlI(16269, 4084)) {
                                        throw null;
                                    } else {
                                        return String.valueOf(var7.append(var9).append(this.wrapFormattedStringToWidth(var1, var2)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int drawString(String var1, float var2, float var3, int var4, boolean var5) {
        return this.drawString(var1, var2, var3, var4, var5, true);
    }

    public int getCharWidth(char var1) {
        if (llIlIlllIlII(var1, 160)) {
            return 4;
        } else if (llIlIlllIIlI(47397, 8998)) {
            throw null;
        } else if (llIlIlllIlII(var1, 167)) {
            return -1;
        } else if (llIlIlllIIlI(47397, 8998)) {
            throw null;
        } else if (llIlIlllIlII(var1, 32)) {
            return 4;
        } else if (llIlIlllIIlI(47397, 8998)) {
            throw null;
        } else {
            String var10000 = Class60.
            ("ÛÛÚÓÕÑÑÈÇÏÊÄôïċīĺňśŅŐŮŹťȄ\u001a\u0000\u001b\u0007\u001a\u0004\u001b\u001b;\u001a8\u001b?\u001a<\u001b3\u001a0\u001b7\u001a4\u001b+\u001a(\u001b/\u001a,\u001b#\u001a \u001b'\u001a$[[ZX[_Z\\[SZP[WZT[KZH[OZL[CZ@[GZD[{Zx[\u007fZ|[sZp[wZt[kZh[oZl[cZ`[gZ\u001bÜæñùûúùüùñøôùöÐÞÂüÎïùè÷âüÌÜã¤ÂÓƉÚ÷ËáÎË\u0096¡\u008c´\u009c¦\u008b»\u009f ►█▻┙┋╻╎╍╶╹╱╌╺╆╿┋┏┮┴┇┟┦╂╄╉╎╹╽╷╊╸╼╣╾╭╂╗╈╟╰╩│┌▓▃▖▔▛ΊΨΫϛΜϙ\u0380ϟΕ\u0382Ιί∩∟∼∲≊«≍≿⌏⌻Û≓\u0093∃\u0097∁⁘¨▄[");
            if (llIlIlllIIlI(47397, 8998)) {
                throw null;
            } else {
                int var2 = var10000.indexOf(var1);
                if (llIlIllllllI(var1) && llIlIlllllIl(var2, -1) && llIlIllllIII(this.)) {
                    return this.                                                                                           [
                    var2];
                } else if (llIlIlllIIlI(47397, 8998)) {
                    throw null;
                } else if (llIlIlllIlIl(this.[var1])){
                    int var3;
                    var2 = (var3 = this.[var1] & 255) >>>4;
                    var3 &= 15;
                    ++var3;
                    return (var3 - var2) / 2 + 1;
                } else if (llIlIlllIIlI(47397, 8998)) {
                    throw null;
                } else {
                    return 0;
                }
            }
        }
    }

    public int getColorCode(char var1) {
        String var10000 = Class60. ("++*(+/*,+#qyt~q=");
        if (llIlIlllIIlI(45553, 605)) {
            throw null;
        } else {
            int var2;
            if (llIlIllllIIl(var2 = var10000.indexOf(var1)) && llIlIlllIIll(var2, this..length)){
                return this.                                                                                              [
                var2];
            } else if (llIlIlllIIlI(45553, 605)) {
                throw null;
            } else {
                return -1;
            }
        }
    }

    private int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, float var2, float var3, int var4, boolean var5) {
        if (llIlIlllllll(var1)) {
            return 0;
        } else if (llIlIlllIIlI(61753, 8844)) {
            throw null;
        } else {
            if (llIlIlllIlIl(this.)) {
                String var10000 = this. (var1);
                if (llIlIlllIIlI(61753, 8844)) {
                    throw null;
                }

                var1 = var10000;
            }

            if (llIlIlllIIlI(61753, 8844)) {
                throw null;
            } else {
                if (llIlIllllIII(var4 & -67108864)) {
                    var4 |= -16777216;
                }

                if (llIlIlllIIlI(61753, 8844)) {
                    throw null;
                } else {
                    if (llIlIlllIlIl(var5)) {
                        var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
                    }

                    if (llIlIlllIIlI(61753, 8844)) {
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
                        if (llIlIlllIIlI(61753, 8844)) {
                            throw null;
                        } else {
                            return (int) this.;
                        }
                    }
                }
            }
        }
    }

    public float renderDefaultChar(int var1, boolean var2) {
        int var3 = var1 % 16 * 8;
        int var4 = var1 / 16 * 8;
        byte var10000;
        if (llIlIlllIlIl(var2)) {
            var10000 = 1;
            boolean var10001 = true;
        } else {
            if (llIlIlllIIlI(83261, 7526)) {
                throw null;
            }

            var10000 = 0;
        }

        if (llIlIlllIIlI(83261, 7526)) {
            throw null;
        } else {
            var2 = var10000;
            this.bindTexture(this.);
            float var5 = (float) (var1 = this.[var1])-0.01F;
            GlStateManager.func_187447_r(5);
            if (llIlIlllIIlI(83261, 7526)) {
                throw null;
            } else {
                GlStateManager.func_187426_b((float) var3 / 128.0F, (float) var4 / 128.0F);
                if (llIlIlllIIlI(83261, 7526)) {
                    throw null;
                } else {
                    GlStateManager.func_187435_e(this. + (float) var2, this., 0.0F);
                    if (llIlIlllIIlI(83261, 7526)) {
                        throw null;
                    } else {
                        GlStateManager.func_187426_b((float) var3 / 128.0F, ((float) var4 + 7.99F) / 128.0F);
                        if (llIlIlllIIlI(83261, 7526)) {
                            throw null;
                        } else {
                            GlStateManager.func_187435_e(this. - (float) var2, this. + 7.99F, 0.0F);
                            if (llIlIlllIIlI(83261, 7526)) {
                                throw null;
                            } else {
                                GlStateManager.func_187426_b(((float) var3 + var5 - 1.0F) / 128.0F, (float) var4 / 128.0F);
                                if (llIlIlllIIlI(83261, 7526)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_187435_e(this. + var5 - 1.0F + (float) var2, this., 0.0F);
                                    if (llIlIlllIIlI(83261, 7526)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187426_b(((float) var3 + var5 - 1.0F) / 128.0F, ((float) var4 + 7.99F) / 128.0F);
                                        if (llIlIlllIIlI(83261, 7526)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_187435_e(this. + var5 - 1.0F - (float) var2, this. + 7.99F, 0.0F);
                                            if (llIlIlllIIlI(83261, 7526)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_187437_J();
                                                if (llIlIlllIIlI(83261, 7526)) {
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

    public int drawString(String var1, float var2, float var3, int var4, boolean var5, boolean var6) {
        if (llIlIlllIlIl(var6)) {
            var1 = this.                                                                                  .(var1);
        }

        if (llIlIlllIIlI(80295, 7914)) {
            throw null;
        } else {
            this.enableAlpha();
            this. ();
            if (llIlIlllIIlI(80295, 7914)) {
                throw null;
            } else {
                int var10000;
                if (llIlIlllIlIl(var5)) {
                    var10000 = this. (var1, var2 + 1.0F, var3 + 1.0F, var4, true);
                    if (llIlIlllIIlI(80295, 7914)) {
                        throw null;
                    } else {
                        int var10001 = this. (var1, var2, var3, var4, false);
                        if (llIlIlllIIlI(80295, 7914)) {
                            throw null;
                        } else {
                            var10000 = Math.max(var10000, var10001);
                            if (llIlIlllIIlI(80295, 7914)) {
                                throw null;
                            } else {
                                return var10000;
                            }
                        }
                    }
                } else if (llIlIlllIIlI(80295, 7914)) {
                    throw null;
                } else {
                    var10000 = this. (var1, var2, var3, var4, false);
                    if (llIlIlllIIlI(80295, 7914)) {
                        throw null;
                    } else {
                        return var10000;
                    }
                }
            }
        }
    }

    private void ____________________________________________________________________________/* $FF was:                                                                             */() {
        boolean var23;
        if (llIlIllllIII(this.)) {
            var23 = true;
        } else if (llIlIlllIIlI(60949, 6867)) {
            throw null;
        } else {
            IResource var1 = null;

            BufferedImage var2;
            try {
                try {
                    if (llIlIlllIIlI(60949, 6867)) {
                        throw null;
                    }

                    BufferedImage var20 = TextureUtil.func_177053_a((var1 = this.getResource(this.)).func_110527_b());
                    if (llIlIlllIIlI(60949, 6867)) {
                        throw null;
                    }

                    var2 = var20;
                } catch (IOException var16) {
                    if (llIlIlllIIlI(60949, 6867)) {
                        throw null;
                    }

                    RuntimeException var10000 = new RuntimeException(var16);
                    if (llIlIlllIIlI(60949, 6867)) {
                        throw null;
                    }

                    throw var10000;
                }
            } catch (Throwable var17) {
                if (llIlIlllIIlI(60949, 6867)) {
                    throw null;
                }

                if (llIlIlllIIlI(60949, 6867)) {
                    throw null;
                }

                IOUtils.closeQuietly(var1);
                if (llIlIlllIIlI(60949, 6867)) {
                    throw null;
                }

                throw var17;
            }

            if (llIlIlllIIlI(60949, 6867)) {
                throw null;
            } else {
                IOUtils.closeQuietly(var1);
                if (llIlIlllIIlI(60949, 6867)) {
                    throw null;
                } else {
                    boolean var10001 = true;
                    if (llIlIlllIIlI(60949, 6867)) {
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

                        for (int var21 = var6; !llIlIlllIIlI(60949, 6867); var10001 = true) {
                            if (!llIlIlllIIll(var21, 256)) {
                                if (llIlIlllIIlI(60949, 6867)) {
                                    throw null;
                                }

                                var23 = true;
                                return;
                            }

                            int var7 = var6 % 16;
                            int var8 = var6 / 16;
                            if (llIlIlllIlII(var6, 32)) {
                                this.                                                                                           [
                                var6] =4;
                            }

                            if (llIlIlllIIlI(60949, 6867)) {
                                throw null;
                            }

                            int var9;
                            var21 = var9 = var4 - 1;

                            label277:
                            while (true) {
                                if (llIlIlllIIlI(60949, 6867)) {
                                    throw null;
                                }

                                if (!llIlIllllIIl(var21)) {
                                    break;
                                }

                                int var10 = var7 * var4 + var9;
                                byte var11 = 1;

                                int var12;
                                for (var21 = var12 = 0; !llIlIlllIIlI(60949, 6867); var10001 = true) {
                                    if (!llIlIlllIIll(var21, var19) || !llIlIlllIlIl(var11)) {
                                        if (llIlIlllIIlI(60949, 6867)) {
                                            throw null;
                                        }

                                        if (llIlIllllIII(var11)) {
                                            var23 = true;
                                            break label277;
                                        }

                                        if (llIlIlllIIlI(60949, 6867)) {
                                            throw null;
                                        }

                                        --var9;
                                        var21 = var9;
                                        var10001 = true;
                                        continue label277;
                                    }

                                    int var13 = (var8 * var4 + var12) * var3;
                                    if (llIlIlllIlIl(var18[var10 + var13] >> 24 & 255)) {
                                        var11 = 0;
                                    }

                                    if (llIlIlllIIlI(60949, 6867)) {
                                        throw null;
                                    }

                                    ++var12;
                                    var21 = var12;
                                }

                                throw null;
                            }

                            if (llIlIlllIIlI(60949, 6867)) {
                                throw null;
                            }

                            ++var9;
                            int var22 = var6;
                            int var10002 = (int) (0.5D + (double) ((float) var9 * var5)) + 1;
                            ++var6;
                            this.                                                                                           [
                            var22] =var10002;
                            var21 = var6;
                        }

                        throw null;
                    }
                }
            }
        }
    }
}
