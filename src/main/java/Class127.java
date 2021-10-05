import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiButtonImage;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.recipebook.GuiRecipeBook;
import net.minecraft.client.gui.recipebook.IRecipeShownListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.Slot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class127 extends InventoryEffectRenderer implements IRecipeShownListener {
    private static int 2457=9770;
    private static int 47792=-5967;
    private boolean;
    private static int 39586=-1073;
    private static int 59278=-10391;
    private static int 9537=-21308;
    private static int 8604=6132;
    private static int 67398=-4964;
    private static int 5832=11287;
    private static int 8787=31907;
    private static int 48691=-3332;
    private static int 7706=8971;
    private GuiButtonImage;
    private static int 658=28871;
    private static int 384=22538;
    private static int 62015=-6135;
    private static int 84550=-24182;
    private final GuiRecipeBook;
    private static int 49195=-11540;
    private static int 7586=18895;
    private float;
    private static int 28674=-26897;
    private static int 966=4537;
    private static int 988=20958;
    private static int 9285=19299;
    private static int 58057=-3503;
    private static int 4336=30886;
    private float;
    private static int 96102=-17788;
    private static int 27240=-18196;
    private boolean;
    private static int 9031=4689;
    private static int 39813=-6512;
    private static int 80796=-7422;
    private static int 8245=31497;
    private static int 65406=-23959;
    private static int 9461=29609;
    private static int 6765=14765;
    private static int 8355=32331;
    private static int 80380=-16192;
    private Class89;
    private static int 2729=4068;
    private static int 6955=28676;
    private static int 62522=-11154;
    private static int 36965=-25008;

    static {
        boolean var10000 = true;
    }

    public Class127(EntityPlayer var1) {
        super(var1.field_71069_bz);
        if (lllIllIIIlIl(49195, 8245)) {
            throw null;
        } else {
            GuiRecipeBook var10004 = new GuiRecipeBook();
            if (lllIllIIIlIl(49195, 8245)) {
                throw null;
            } else {
                this. = var10004;
                Class89 var10003 = new Class89(0.3F);
                if (lllIllIIIlIl(49195, 8245)) {
                    throw null;
                } else {
                    this. = var10003;
                    this.field_146291_p = true;
                    boolean var10000 = true;
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1, int var2, float var3, float var4, EntityLivingBase var5) {
        GlStateManager.func_179142_g();
        if (lllIllIIIlIl(39813, 8787)) {
            throw null;
        } else {
            GlStateManager.func_179094_E();
            if (lllIllIIIlIl(39813, 8787)) {
                throw null;
            } else {
                GlStateManager.func_179109_b((float) var0, (float) var1, 50.0F);
                if (lllIllIIIlIl(39813, 8787)) {
                    throw null;
                } else {
                    GlStateManager.func_179152_a((float) (-var2), (float) var2, (float) var2);
                    if (lllIllIIIlIl(39813, 8787)) {
                        throw null;
                    } else {
                        GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
                        if (lllIllIIIlIl(39813, 8787)) {
                            throw null;
                        } else {
                            float var9 = var5.field_70761_aq;
                            float var10 = var5.field_70177_z;
                            float var6 = var5.field_70125_A;
                            float var7 = var5.field_70758_at;
                            float var8 = var5.field_70759_as;
                            GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
                            if (lllIllIIIlIl(39813, 8787)) {
                                throw null;
                            } else {
                                RenderHelper.func_74519_b();
                                if (lllIllIIIlIl(39813, 8787)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
                                    if (lllIllIIIlIl(39813, 8787)) {
                                        throw null;
                                    } else {
                                        double var10012 = Math.atan((double) (var4 / 40.0F));
                                        if (lllIllIIIlIl(39813, 8787)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_179114_b(-((float) var10012) * 20.0F, 1.0F, 0.0F, 0.0F);
                                            if (lllIllIIIlIl(39813, 8787)) {
                                                throw null;
                                            } else {
                                                var10012 = Math.atan((double) (var3 / 40.0F));
                                                if (lllIllIIIlIl(39813, 8787)) {
                                                    throw null;
                                                } else {
                                                    var5.field_70761_aq = (float) var10012 * 20.0F;
                                                    double var10011 = Math.atan((double) (var3 / 40.0F));
                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                        throw null;
                                                    } else {
                                                        var5.field_70177_z = (float) var10011 * 40.0F;
                                                        double var10010 = Math.atan((double) (var4 / 40.0F));
                                                        if (lllIllIIIlIl(39813, 8787)) {
                                                            throw null;
                                                        } else {
                                                            var5.field_70125_A = -((float) var10010) * 20.0F;
                                                            var5.field_70759_as = var5.field_70177_z;
                                                            var5.field_70758_at = var5.field_70177_z;
                                                            GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
                                                            if (lllIllIIIlIl(39813, 8787)) {
                                                                throw null;
                                                            } else {
                                                                Minecraft var10005 = Minecraft.func_71410_x();
                                                                if (lllIllIIIlIl(39813, 8787)) {
                                                                    throw null;
                                                                } else {
                                                                    RenderManager var11 = var10005.func_175598_ae();
                                                                    var11.func_178631_a(180.0F);
                                                                    var11.func_178633_a(false);
                                                                    var11.func_188391_a(var5, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
                                                                    var11.func_178633_a(true);
                                                                    var5.field_70761_aq = var9;
                                                                    var5.field_70177_z = var10;
                                                                    var5.field_70125_A = var6;
                                                                    var5.field_70758_at = var7;
                                                                    var5.field_70759_as = var8;
                                                                    GlStateManager.func_179121_F();
                                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                                        throw null;
                                                                    } else {
                                                                        RenderHelper.func_74518_a();
                                                                        if (lllIllIIIlIl(39813, 8787)) {
                                                                            throw null;
                                                                        } else {
                                                                            GlStateManager.func_179101_C();
                                                                            if (lllIllIIIlIl(39813, 8787)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
                                                                                if (lllIllIIIlIl(39813, 8787)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.func_179090_x();
                                                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
                                                                                        if (lllIllIIIlIl(39813, 8787)) {
                                                                                            throw null;
                                                                                        } else {
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
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIllIIlIII(int var0) {
        return var0 == 0;
    }

    private static boolean lllIllIIlIIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIllIIIlll(int var0) {
        return var0 != 0;
    }

    private static boolean lllIllIIIllI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIllIIIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    public GuiRecipeBook func_194310_f() {
        return this.;
    }

    public void func_73866_w_() {
        this.field_146292_n.clear();
        Class127 var10000;
        boolean var2;
        if (lllIllIIIlll(this.field_146297_k.field_71442_b.func_78758_h())) {
            var10000 = this;
            Minecraft var10001 = this.field_146297_k;
            Class10 var10002 = new Class10(this.field_146297_k.field_71439_g);
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }

            var10001.func_147108_a(var10002);
            var2 = true;
        } else {
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }

            var10000 = this;
            super.func_73866_w_();
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }
        }

        if (lllIllIIIlIl(59278, 8355)) {
            throw null;
        } else {
            if (lllIllIIIllI(this.field_146294_l, 379)) {
                var2 = true;
                boolean var3 = true;
            } else {
                if (lllIllIIIlIl(59278, 8355)) {
                    throw null;
                }

                var2 = false;
            }

            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            } else {
                var10000. = var2;
                this.                                                                                            .
                func_194303_a(this.field_146294_l, this.field_146295_m, this.field_146297_k, this., ((ContainerPlayer) this.field_147002_h).field_75181_e);
                this.field_147003_i = this.                                                                                            .
                func_193011_a(this., this.field_146294_l, this.field_146999_f);
                GuiButtonImage var4 = new GuiButtonImage(10, this.field_147003_i + 104, this.field_146295_m / 2 - 22, 20, 18, 178, 0, 19, field_147001_a);
                if (lllIllIIIlIl(59278, 8355)) {
                    throw null;
                } else {
                    this. = var4;
                    this.field_146292_n.add(this.);
                    this.                                                                                                   .
                    (1.0F);
                    boolean var1 = true;
                }
            }
        }
    }

    public void func_73863_a(int var1, int var2, float var3) {
        this.func_146276_q_();
        boolean var10001;
        if (lllIllIIlIII(this..func_191878_b())){
            var10001 = true;
            boolean var10002 = true;
        } else{
            if (lllIllIIIlIl(67398, 8604)) {
                throw null;
            }

            var10001 = false;
        }

        if (lllIllIIIlIl(67398, 8604)) {
            throw null;
        } else {
            this.field_147045_u = var10001;
            this.                                                                                                   .();
            ScaledResolution var6 = new ScaledResolution(this.field_146297_k);
            if (lllIllIIIlIl(67398, 8604)) {
                throw null;
            } else {
                int var4 = var6.func_78326_a();
                int var5 = var6.func_78328_b();
                GlStateManager.func_179094_E();
                if (lllIllIIIlIl(67398, 8604)) {
                    throw null;
                } else {
                    GlStateManager.func_179109_b((float) (var4 / 2), (float) (var5 / 2), 0.0F);
                    if (lllIllIIIlIl(67398, 8604)) {
                        throw null;
                    } else {
                        GlStateManager.func_179152_a(this.. (), this.                                                                                                   .
                        (), 1.0F);
                        if (lllIllIIIlIl(67398, 8604)) {
                            throw null;
                        } else {
                            GlStateManager.func_179109_b((float) (-var4 / 2), (float) (-var5 / 2), 0.0F);
                            if (lllIllIIIlIl(67398, 8604)) {
                                throw null;
                            } else {
                                boolean var10000;
                                if (lllIllIIIlll(this..func_191878_b()) &&lllIllIIIlll(this.)){
                                    this.func_146976_a(var3, var1, var2);
                                    this.                                                                                            .
                                    func_191861_a(var1, var2, var3);
                                    var10000 = true;
                                } else{
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    }

                                    this.                                                                                            .
                                    func_191861_a(var1, var2, var3);
                                    super.func_73863_a(var1, var2, var3);
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    }

                                    this.                                                                                            .
                                    func_191864_a(this.field_147003_i, this.field_147009_r, false, var3);
                                }

                                if (lllIllIIIlIl(67398, 8604)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179121_F();
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    } else {
                                        this.func_191948_b(var1, var2);
                                        this.                                                                                            .
                                        func_191876_c(this.field_147003_i, this.field_147009_r, var1, var2);
                                        this. = (float) var1;
                                        this. = (float) var2;
                                        var10000 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void func_146286_b(int var1, int var2, int var3) {
        boolean var10000;
        if (lllIllIIIlll(this.)) {
            this. = false;
            var10000 = true;
        } else if (lllIllIIIlIl(62015, 9285)) {
            throw null;
        } else {
            super.func_146286_b(var1, var2, var3);
            if (lllIllIIIlIl(62015, 9285)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void func_73869_a(char var1, int var2) throws IOException {
        if (lllIllIIlIII(this..func_191859_a(var1, var2))){
            super.func_73869_a(var1, var2);
            if (lllIllIIIlIl(65406, 658)) {
                throw null;
            }
        }

        if (lllIllIIIlIl(65406, 658)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void func_192043_J_() {
        this.                                                                                            .
        func_193948_e();
        boolean var10000 = true;
    }

    public void func_146284_a(GuiButton var1) throws IOException {
        if (lllIllIIlIIl(var1.field_146127_k, 10)) {
            this.                                                                                            .
            func_193014_a(this., ((ContainerPlayer) this.field_147002_h).field_75181_e);
            this.                                                                                            .
            func_191866_a();
            this.field_147003_i = this.                                                                                            .
            func_193011_a(this., this.field_146294_l, this.field_146999_f);
            this.                                                                                           .
            func_191746_c(this.field_147003_i + 104, this.field_146295_m / 2 - 22);
            this. = true;
        }

        if (lllIllIIIlIl(28674, 966)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void func_146976_a(float var1, int var2, int var3) {
        GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
        if (lllIllIIIlIl(84550, 5832)) {
            throw null;
        } else {
            this.field_146297_k.func_110434_K().func_110577_a(field_147001_a);
            int var4 = this.field_147003_i;
            var2 = this.field_147009_r;
            this.func_73729_b(var4, var2, 0, 0, this.field_146999_f, this.field_147000_g);
            (var4 + 51, var2 + 75, 30, (float) (var4 + 51) - this., (float) (var2 + 75 - 50) - this., this.field_146297_k.field_71439_g)
            ;
            if (lllIllIIIlIl(84550, 5832)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    public boolean func_193983_c(int var1, int var2, int var3, int var4) {
        byte var10000;
        if (lllIllIIIlIl(var1, var3) && lllIllIIIlIl(var2, var4) && lllIllIIIllI(var1, var3 + this.field_146999_f) && !lllIllIIIlIl(var2, var4 + this.field_147000_g)) {
            if (lllIllIIIlIl(39586, 9461)) {
                throw null;
            }

            var10000 = 0;
        } else {
            if (lllIllIIIlIl(39586, 9461)) {
                throw null;
            }

            var10000 = 1;
            boolean var10001 = true;
        }

        if (lllIllIIIlIl(39586, 9461)) {
            throw null;
        } else {
            byte var5 = var10000;
            if (lllIllIIIlll(this..func_193955_c(var1, var2, this.field_147003_i, this.field_147009_r, this.field_146999_f, this.field_147000_g)) &&
            lllIllIIIlll(var5)){
                return true;
            } else if (lllIllIIIlIl(39586, 9461)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    public void func_73864_a(int var1, int var2, int var3) throws IOException {
        if (lllIllIIlIII(this..func_191862_a(var1, var2, var3)) &&
        (!lllIllIIIlll(this.) || lllIllIIlIII(this..func_191878_b()))){
            if (lllIllIIIlIl(80380, 2729)) {
                throw null;
            }

            super.func_73864_a(var1, var2, var3);
            if (lllIllIIIlIl(80380, 2729)) {
                throw null;
            }
        }

        if (lllIllIIIlIl(80380, 2729)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public boolean func_146978_c(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (!lllIllIIIlll(this.) || lllIllIIlIII(this..func_191878_b())){
            if (lllIllIIIlIl(58057, 9031)) {
                throw null;
            }

            byte var10000 = super.func_146978_c(var1, var2, var3, var4, var5, var6);
            if (lllIllIIIlIl(58057, 9031)) {
                throw null;
            }

            if (lllIllIIIlll(var10000)) {
                return true;
            }
        }

        if (lllIllIIIlIl(58057, 9031)) {
            throw null;
        } else {
            return false;
        }
    }

    public void func_146281_b() {
        this.                                                                                            .
        func_191871_c();
        this.                                                                                                   .(0.0F);
        super.func_146281_b();
        if (lllIllIIIlIl(96102, 2457)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void func_73876_c() {
        if (lllIllIIIlll(this.field_146297_k.field_71442_b.func_78758_h())) {
            Minecraft var10000 = this.field_146297_k;
            Class10 var10001 = new Class10(this.field_146297_k.field_71439_g);
            if (lllIllIIIlIl(9537, 4336)) {
                throw null;
            }

            var10000.func_147108_a(var10001);
        }

        if (lllIllIIIlIl(9537, 4336)) {
            throw null;
        } else {
            this.                                                                                            .
            func_193957_d();
            boolean var1 = true;
        }
    }

    public void func_146979_b(int var1, int var2) {
        FontRenderer var10000 = this.field_146289_q;
        String var10001 = Class60. ("ytwn\u007frs\u007f`5rhw}asd<");
        if (lllIllIIIlIl(80796, 6765)) {
            throw null;
        } else {
            var10001 = I18n.func_135052_a(var10001, new Object[0]);
            if (lllIllIIIlIl(80796, 6765)) {
                throw null;
            } else {
                var10000.func_78276_b(var10001, 97, 8, 4210752);
                boolean var3 = true;
            }
        }
    }

    public void func_184098_a(Slot var1, int var2, int var3, ClickType var4) {
        super.func_184098_a(var1, var2, var3, var4);
        if (lllIllIIIlIl(62522, 384)) {
            throw null;
        } else {
            this.                                                                                            .
            func_191874_a(var1);
            boolean var10000 = true;
        }
    }
}
