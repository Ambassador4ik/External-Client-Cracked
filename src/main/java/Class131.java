import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent.Action;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;

@SideOnly(Side.CLIENT)
public class Class131 {
    public static BufferedImage;
    private static int 11373=-25510;
    private static int 6780=20036;
    private static int 4283=31635;
    private static int 52436=-27121;
    private static final Logger;
    private static Minecraft;
    private static int 18248=-27992;
    private static int 5553=8400;
    private static int 70532=-28256;
    private static int 6737=23417;
    private static int 92540=-21748;
    private static IntBuffer;
    public static File;
    private static int 6352=19217;
    private static int 9572=30483;
    private static int 59467=-6865;
    private static int 6512=4382;
    public static Runnable;
    private static int 88997=-21568;
    private static int[];
    private static int 672=15738;
    private static final DateFormat;
    private static int 5355=28383;
    private static int 40473=-25869;
    private static int 92951=-7238;
    private static int 32310=-23998;
    private static int 5034=14839;
    private static int 7367=4114;
    private static int 38055=-19195;

    static {
        Logger var10000 = LogManager.getLogger();
        if (llIlIlIIIllI(38055, 6352)) {
            throw null;
        } else {
                                                                                                   =var10000;
            SimpleDateFormat var0 = new SimpleDateFormat;
            String var10002 = Class60. ("qprq!DB%dm\\@L'je6z(");
            if (llIlIlIIIllI(38055, 6352)) {
                throw null;
            } else {
                var0.<init> (var10002);
                if (llIlIlIIIllI(38055, 6352)) {
                    throw null;
                } else {
                                                                                                           =var0;
                    Minecraft var1 = Minecraft.func_71410_x();
                    if (llIlIlIIIllI(38055, 6352)) {
                        throw null;
                    } else {
                                                                                                                      =
                        var1;
                                                                                                                     =
                        Class131::;
                        boolean var2 = true;
                    }
                }
            }
        }
    }

    public Class131() {
        if (llIlIlIIIllI(18248, 6737)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIlIlIIlIII(Object var0) {
        return var0 != null;
    }

    public static ITextComponent ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        File var10000 = new File;
        File var10002 =                                                                                                    .
        field_71412_D;
        String var10003 = Class60. ("crauq\u007fdxwe(");
        if (llIlIlIIIllI(92540, 6512)) {
            throw null;
        } else {
            var10000.<init> (var10002, var10003);
            if (llIlIlIIIllI(92540, 6512)) {
                throw null;
            } else {
                var10000 = (var10000);
                if (llIlIlIIIllI(92540, 6512)) {
                    throw null;
                } else {
                    File var0 = var10000;

                    label68:
                    {
                        try {
                            if (llIlIlIIIllI(92540, 6512)) {
                                throw null;
                            }

                            var0 = var0.getCanonicalFile();
                        } catch (Exception var2) {
                            if (llIlIlIIIllI(92540, 6512)) {
                                throw null;
                            }
                            break label68;
                        }

                        if (llIlIlIIIllI(92540, 6512)) {
                            throw null;
                        }

                        boolean var3 = true;
                    }

                    if (llIlIlIIIllI(92540, 6512)) {
                        throw null;
                    } else {
                        TextComponentString var4 = new TextComponentString(var0.getName());
                        if (llIlIlIIIllI(92540, 6512)) {
                            throw null;
                        } else {
                            TextComponentString var1 = var4;
                            Style var5 = var4.func_150256_b();
                            ClickEvent var10001 = new ClickEvent(Action.OPEN_FILE, var0.getAbsolutePath());
                            if (llIlIlIIIllI(92540, 6512)) {
                                throw null;
                            } else {
                                var5.func_150241_a(var10001);
                                Style var6 = var1.func_150256_b();
                                Boolean var8 = true;
                                if (llIlIlIIIllI(92540, 6512)) {
                                    throw null;
                                } else {
                                    var6.func_150228_d(var8);
                                    TextComponentTranslation var7 = new TextComponentTranslation;
                                    String var9 = Class60. ("ixk\u007f{unr}o?icxv\u007fy(");
                                    if (llIlIlIIIllI(92540, 6512)) {
                                        throw null;
                                    } else {
                                        var7.<init> (var9, new Object[]{var1});
                                        if (llIlIlIIIllI(92540, 6512)) {
                                            throw null;
                                        } else {
                                            return var7;
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

    public static BufferedImage ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1, Framebuffer var2) {
        byte var10000 = OpenGlHelper.func_148822_b();
        if (llIlIlIIIllI(92951, 672)) {
            throw null;
        } else {
            if (llIlIlIIlIlI(var10000)) {
                var0 = var2.field_147622_a;
                var1 = var2.field_147620_b;
            }

            if (llIlIlIIIllI(92951, 672)) {
                throw null;
            } else {
                int var3 = var0 * var1;
                if (!llIlIlIIlIII() || llIlIlIIllll(.capacity(),var3)){
                    if (llIlIlIIIllI(92951, 672)) {
                        throw null;
                    }

                    IntBuffer var5 = BufferUtils.createIntBuffer(var3);
                    if (llIlIlIIIllI(92951, 672)) {
                        throw null;
                    }

                                                                                                  =var5;
                                                                                                     =new int[var3];
                }

                if (llIlIlIIIllI(92951, 672)) {
                    throw null;
                } else {
                    GlStateManager.func_187425_g(3333, 1);
                    if (llIlIlIIIllI(92951, 672)) {
                        throw null;
                    } else {
                        GlStateManager.func_187425_g(3317, 1);
                        if (llIlIlIIIllI(92951, 672)) {
                            throw null;
                        } else {
                                                                                                       .clear();
                            var10000 = OpenGlHelper.func_148822_b();
                            if (llIlIlIIIllI(92951, 672)) {
                                throw null;
                            } else {
                                if (llIlIlIIlIlI(var10000)) {
                                    GlStateManager.func_179144_i(var2.field_147617_g);
                                    if (llIlIlIIIllI(92951, 672)) {
                                        throw null;
                                    }

                                    GlStateManager.func_187433_a(3553, 0, 32993, 33639, );
                                    if (llIlIlIIIllI(92951, 672)) {
                                        throw null;
                                    }

                                    boolean var6 = true;
                                } else {
                                    if (llIlIlIIIllI(92951, 672)) {
                                        throw null;
                                    }

                                    GlStateManager.func_187413_a(0, 0, var0, var1, 32993, 33639, );
                                    if (llIlIlIIIllI(92951, 672)) {
                                        throw null;
                                    }
                                }

                                if (llIlIlIIIllI(92951, 672)) {
                                    throw null;
                                } else {
                                                                                                             .get();
                                    TextureUtil.func_147953_a(, var0, var1);
                                    if (llIlIlIIIllI(92951, 672)) {
                                        throw null;
                                    } else {
                                        BufferedImage var10001 = new BufferedImage(var0, var1, 1);
                                        if (llIlIlIIIllI(92951, 672)) {
                                            throw null;
                                        } else {
                                            BufferedImage var4 = var10001;
                                            var10001.setRGB(0, 0, var0, var1, , 0, var0);
                                            return var4;
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

    private static File ________________________________________________________________________________________________/* $FF was:                                                                                                 */(File var0) {
        DateFormat var10000 = ;
        Date var10001 = new Date();
        if (llIlIlIIIllI(88997, 5355)) {
            throw null;
        } else {
            String var1 = var10000.format(var10001).toString();

            boolean var5;
            for (int var2 = 1; !llIlIlIIIllI(88997, 5355); var5 = true) {
                File var4 = new File;
                StringBuilder var10003 = new StringBuilder();
                if (llIlIlIIIllI(88997, 5355)) {
                    throw null;
                }

                var10003 = var10003.append(var1);
                String var10004;
                if (llIlIlIIllII(var2, 1)) {
                    var10004 = "";
                    boolean var10005 = true;
                } else {
                    if (llIlIlIIIllI(88997, 5355)) {
                        throw null;
                    }

                    StringBuilder var6 = new StringBuilder();
                    if (llIlIlIIIllI(88997, 5355)) {
                        throw null;
                    }

                    String var10006 = Class60. ("\u0004");
                    if (llIlIlIIIllI(88997, 5355)) {
                        throw null;
                    }

                    var10004 = String.valueOf(var6.insert(0, var10006).append(var2));
                }

                if (llIlIlIIIllI(88997, 5355)) {
                    throw null;
                }

                var10003 = var10003.append(var10004);
                var10004 = Class60. ("5jv<");
                if (llIlIlIIIllI(88997, 5355)) {
                    throw null;
                }

                var4.<init> (var0, String.valueOf(var10003.append(var10004)));
                if (llIlIlIIIllI(88997, 5355)) {
                    throw null;
                }

                File var3 = var4;
                if (llIlIlIIllIl(var4.exists())) {
                    return var3;
                }

                if (llIlIlIIIllI(88997, 5355)) {
                    throw null;
                }

                ++var2;
            }

            throw null;
        }
    }

    public static ITextComponent ________________________________________________________________________________________________/* $FF was:                                                                                                 */(File var0, @Nullable String var1, int var2, int var3, Framebuffer var4) {
        TextComponentTranslation var8;
        String var10002;
        try {
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            File var9 = new File;
            String var10003 = Class60. ("crauq\u007fdxwe(");
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var9.<init> (var0, var10003);
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            File var5 = var9;
            var5.mkdir();
            BufferedImage var14 = (var2, var3, var4);
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

                                                                                        =var14;
            if (llIlIlIIlIll(var1)) {
                var9 = (var5);
                if (llIlIlIIIllI(11373, 6780)) {
                    throw null;
                }

                boolean var10 = true;
            } else {
                if (llIlIlIIIllI(11373, 6780)) {
                    throw null;
                }

                var9 = new File(var5, var1);
                if (llIlIlIIIllI(11373, 6780)) {
                    throw null;
                }
            }

            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

                                                                                                      =var9;
                                                                                                      =                                                                                             .
            getCanonicalFile();
            Thread var12 = new Thread;
            Runnable var16 = ;
            var10003 = Class60. ("ixk\u007f{unr}/");
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var12.<init> (var16, var10003);
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var12.start();
            TextComponentString var15 = new TextComponentString(.getName());
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            TextComponentString var7 = var15;
            Style var17 = var15.func_150256_b();
            ClickEvent var11 = new ClickEvent(Action.OPEN_FILE,.getAbsolutePath());
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var17.func_150241_a(var11);
            Style var13 = var7.func_150256_b();
            Boolean var18 = true;
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var13.func_150228_d(var18);
            var8 = new TextComponentTranslation;
            var10002 = Class60. ("ixk\u007f{unr}o?icxv\u007fy(");
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var8.<init> (var10002, new Object[]{var7});
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }
        } catch (Exception var6) {
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            Logger var10000 = ;
            String var10001 = Class60. ("Xumw{t;o3iqmr:gxy\u007fmu|rc/");
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var10000.warn(var10001, var6);
            var8 = new TextComponentTranslation;
            var10002 = Class60. ("ixk\u007f{unr}o?|wryox>");
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            var8.<init> (var10002, new Object[]{var6.getMessage()});
            if (llIlIlIIIllI(11373, 6780)) {
                throw null;
            }

            return var8;
        }

        if (llIlIlIIIllI(11373, 6780)) {
            throw null;
        } else {
            return var8;
        }
    }

    private static boolean llIlIlIIlIll(Object var0) {
        return var0 == null;
    }

    private static boolean llIlIlIIllIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIlIIIlll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIlIIIllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIlIIllII(int var0, int var1) {
        return var0 == var1;
    }

    private static void ____________________________________________________________________________/* $FF was:                                                                             */() {
        boolean var10000;
        try {
            if (llIlIlIIIllI(32310, 5553)) {
                throw null;
            }

            BufferedImage var2 = ;
            String var10001 = Class60. ("hw<");
            if (llIlIlIIIllI(32310, 5553)) {
                throw null;
            }

            ImageIO.write(var2, var10001, );
            if (llIlIlIIIllI(32310, 5553)) {
                throw null;
            }
        } catch (IOException var1) {
            if (llIlIlIIIllI(32310, 5553)) {
                throw null;
            }

            var10000 = true;
            return;
        }

        if (llIlIlIIIllI(32310, 5553)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        boolean var1;
        if (llIlIlIIIlll(.field_71462_r,Class73.                                                                                      .                                                                                                 ))
        {
            var1 = true;
        } else if (llIlIlIIIllI(70532, 4283)) {
            throw null;
        } else {
            if (llIlIlIIlIII(.field_71462_r) &&llIlIlIIlIIl(.field_71462_r, Class73.                                                                                      .                                                                                                 ))
            {
                if (llIlIlIIlIlI(.field_71474_y.field_74319_N)){
                                                                                                                  .
                field_71456_v.func_175180_a(0.0F);
            }

                if (llIlIlIIIllI(70532, 4283)) {
                    throw null;
                }

                GlStateManager.func_179097_i();
                if (llIlIlIIIllI(70532, 4283)) {
                    throw null;
                }

                GuiScreen var10000 =                                                                                                    .
                field_71462_r;
                int var10001 = Mouse.getX();
                if (llIlIlIIIllI(70532, 4283)) {
                    throw null;
                }

                int var10002 = Mouse.getY();
                if (llIlIlIIIllI(70532, 4283)) {
                    throw null;
                }

                var10000.func_73863_a(var10001, var10002, 0.0F);
            }

            if (llIlIlIIIllI(70532, 4283)) {
                throw null;
            } else {
                GuiNewChat var0 =                                                                                                    .
                field_71456_v.func_146158_b();
                ITextComponent var2 = ();
                if (llIlIlIIIllI(70532, 4283)) {
                    throw null;
                } else {
                    var0.func_146227_a(var2);
                    var1 = true;
                }
            }
        }
    }

    private static boolean llIlIlIIlIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIlIIlIIl(Object var0, Object var1) {
        return var0 != var1;
    }

    public static ITextComponent ________________________________________________________________________________________________/* $FF was:                                                                                                 */(File var0, int var1, int var2, Framebuffer var3) {
        ITextComponent var10000 = (var0, (String) null, var1, var2, var3);
        if (llIlIlIIIllI(52436, 5034)) {
            throw null;
        } else {
            return var10000;
        }
    }

    private static boolean llIlIlIIllll(int var0, int var1) {
        return var0 < var1;
    }

    public static ITextComponent ____________________________________________________________________________/* $FF was:                                                                             */() {
        ITextComponent var10000 = (.field_71412_D,                                                                                                    .
        field_71443_c,                                                                                                    .
        field_71440_d,                                                                                                    .
        func_147110_a());
        if (llIlIlIIIllI(59467, 7367)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
