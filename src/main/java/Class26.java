import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class26 extends GuiButton {
    public Class4;
    private static int 21938=-32005;
    public int;
    private static int 1115=6225;
    public int;
    private static int 9602=23442;
    private static int 1718=3584;
    private static int 8980=20245;
    private static int 3140=13658;
    private static int 8026=9110;
    private static int 20638=-30016;
    public String;
    private static int 5812=32793;
    private static int 600=29209;
    private static int 75960=-23819;
    private static int 7766=24755;
    private static int 30169=-25694;
    private static int 81529=-3696;
    private static int 35783=-25788;
    private static int 7516=19258;
    private static int 24408=-20901;
    private static int 34199=-4137;
    private static int 42396=-5048;
    private static int 58906=-25784;
    private static int 6725=18763;
    public int;
    public int;
    public boolean;
    public boolean;
    public int;
    public static final ResourceLocation;
    private static int 7361=19974;
    public int;
    private static int 34465=-28134;
    private static int 9125=5486;
    private static int 3819=12827;
    private static int 1849=21504;
    private static int 11515=-5036;
    private static int 19264=-8998;
    private static int 73882=-10375;
    public boolean;
    public Class89;
    private static int 70725=-14442;

    static {
        ResourceLocation var10000 = new ResourceLocation;
        String var10002 = Class60. ("o\u007f`ojhyh<}er8m}\u007fl\u007f|h!jb<");
        if (llIIllllIlll(24408, 6725)) {
            throw null;
        } else {
            var10000.<init> (var10002);
            if (llIIllllIlll(24408, 6725)) {
                throw null;
            } else {
                                                                                                               =
                var10000;
                boolean var0 = true;
            }
        }
    }

    public Class26(int var1, int var2, int var3, String var4) {
        this(var1, var2, var3, 200, 20, var4);
        if (llIIllllIlll(81529, 600)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public Class26(int var1, int var2, int var3, int var4, int var5, String var6) {
        super(var1, var2, var3, var6);
        if (llIIllllIlll(73882, 8026)) {
            throw null;
        } else {
            this. = Class73.                                                                                      .;
            Class89 var10021 = new Class89(0.3F);
            if (llIIllllIlll(73882, 8026)) {
                throw null;
            } else {
                this. = var10021;
                this. = 200;
                this. = 20;
                this. = true;
                this. = true;
                this. = var1;
                this. = var2;
                this. = var3;
                this. = var4;
                this. = var5;
                this. = var6;
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIlllllIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIllllIlll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlllllIIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIllllIllI(int var0) {
        return var0 == 0;
    }

    public boolean func_146116_c(Minecraft var1, int var2, int var3) {
        if (llIIlllllIII(this.) && llIIlllllIII(this.) && llIIllllIlll(var2, this.) && llIIllllIlll(var3, this.) && llIIlllllIIl(var2, this. + this.) && llIIlllllIIl(var3, this. + this.)) {
            return true;
        } else if (llIIllllIlll(42396, 5812)) {
            throw null;
        } else {
            return false;
        }
    }

    public boolean func_146115_a() {
        return this.;
    }

    public void func_191745_a(Minecraft var1, int var2, int var3, float var4) {
        if (llIIlllllIII(this.)) {
            var1.func_110434_K().func_110577_a();
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
            if (llIIllllIlll(20638, 1718)) {
                throw null;
            }

            boolean var10001;
            boolean var10002;
            if (llIIllllIlll(var2, this.) && llIIllllIlll(var3, this.) && llIIlllllIIl(var2, this. + this.) && llIIlllllIIl(var3, this. + this.)) {
                var10001 = true;
                var10002 = true;
            } else {
                if (llIIllllIlll(20638, 1718)) {
                    throw null;
                }

                var10001 = false;
            }

            if (llIIllllIlll(20638, 1718)) {
                throw null;
            }

            this. = var10001;
            Class89 var10000 = this.;
            float var6;
            if (llIIlllllIII(this.)) {
                var6 = 1.0F;
                var10002 = true;
            } else {
                if (llIIllllIlll(20638, 1718)) {
                    throw null;
                }

                var6 = 2.0F;
            }

            if (llIIllllIlll(20638, 1718)) {
                throw null;
            }

            var10000. (var6);
            this.                                                                                      .();
            this.                                                                                      .(0.3F);
            Class4 var7 = this.;
            double var10003 = (double) ((float) this. + this.. () * 3.0F);
            double var10004 = (double) ((float) this. + this.. ());
            double var10005 = (double) ((float) this. - this.. () * 6.0F);
            double var10006 = (double) ((float) this. - this.. () * 2.0F);
            Color var10008 = new Color(0, 0, 0, 170);
            if (llIIllllIlll(20638, 1718)) {
                throw null;
            }

            var7. (var10003, var10004, var10005, var10006, 2.0D, var10008.getRGB());
            this.drawCenteredString(this., this. + this. / 2, this. + (this. - 8) / 2, -1);
        }

        if (llIIllllIlll(20638, 1718)) {
            throw null;
        } else {
            boolean var5 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void func_146113_a(SoundHandler var1) {
        PositionedSoundRecord var10001 = PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F);
        if (llIIllllIlll(58906, 7516)) {
            throw null;
        } else {
            var1.func_147682_a(var10001);
            boolean var10000 = true;
        }
    }

    public void func_175211_a(int var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public int func_146114_a(boolean var1) {
        byte var2 = 1;
        if (llIIllllIllI(this.)) {
            boolean var3 = false;
            return 0;
        } else if (llIIllllIlll(35783, 3819)) {
            throw null;
        } else {
            if (llIIlllllIII(var1)) {
                var2 = 2;
            }

            if (llIIllllIlll(35783, 3819)) {
                throw null;
            } else {
                return var2;
            }
        }
    }

    public void drawCenteredString(String var1, int var2, int var3, int var4) {
        this.                                                                                  .
        (var1, (float) (var2 - this.. (var1) / 2),(float) var3, var4);
        boolean var10000 = true;
    }

    public void func_146118_a(int var1, int var2) {
        boolean var10000 = true;
    }

    public void func_146119_b(Minecraft var1, int var2, int var3) {
        boolean var10000 = true;
    }

    public int func_146117_b() {
        return this.;
    }

    public void func_146111_b(int var1, int var2) {
        boolean var10000 = true;
    }
}
