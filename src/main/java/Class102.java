import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ScreenshotEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class102 extends GuiNewChat {
    private static int 6301=7716;
    private static int 2805=20698;
    private static int 78923=-15673;
    private static int 46376=-14438;
    public Minecraft;
    public Class92;
    private static int 391=13453;
    private static int 50052=-13366;
    private static int 87934=-22084;
    private static int 9982=27605;
    public Method;
    private static int 7659=7744;
    private static int 95912=-20171;
    private static int 62972=-5088;
    private static int 5949=29021;

    static {
        boolean var10000 = true;
    }

    public Class102(Minecraft var1) {
        super(var1);
        if (llIllIlIllIl(95912, 5949)) {
            throw null;
        } else {
            this. = var1;
            List var10001 = Arrays.asList(GuiNewChat.class.getDeclaredMethods());
            if (llIllIlIllIl(95912, 5949)) {
                throw null;
            } else {
                this. = (Method) var10001.stream().filter(Class102::).findFirst().get();
                this.                                                                                            .
                setAccessible(true);
                Class171 var2 = Class133. (104);
                if (llIllIlIllIl(95912, 5949)) {
                    throw null;
                } else {
                    this. = (Class92) var2;
                    boolean var10000 = true;
                }
            }
        }
    }

    private static boolean llIllIllIIII(int var0) {
        return var0 == 0;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Method var0) {
        if (llIllIllIIlI(var0.getModifiers(), 2)) {
            return true;
        } else if (llIllIlIllIl(78923, 6301)) {
            throw null;
        } else {
            return false;
        }
    }

    private static boolean llIllIllIIlI(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIllIlIllIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIlIllII(int var0) {
        return var0 != 0;
    }

    public void func_146227_a(ITextComponent var1) {
        boolean var10000;
        if (llIllIlIllII(var1.equals(ScreenshotEvent.DEFAULT_CANCEL_REASON))) {
            var10000 = true;
        } else if (llIllIlIllIl(50052, 9982)) {
            throw null;
        } else if (llIllIlIllII(this.isCanceled(var1))) {
            Method var3 = this.;
            GuiNewChat var10001 = this.                                                                                  .
            field_71456_v.func_146158_b();
            Object[] var10002 = new Object[]{var1, null, null, null};
            Integer var10005 = 0;
            if (llIllIlIllIl(50052, 9982)) {
                throw null;
            } else {
                var10002[1] = var10005;
                var10005 = this.                                                                                  .
                field_71456_v.func_73834_c();
                if (llIllIlIllIl(50052, 9982)) {
                    throw null;
                } else {
                    var10002[2] = var10005;
                    Boolean var2 = false;
                    if (llIllIlIllIl(50052, 9982)) {
                        throw null;
                    } else {
                        var10002[3] = var2;
                        Class22. ((Method) var3, (Object) var10001, (Object[]) var10002);
                        if (llIllIlIllIl(50052, 9982)) {
                            throw null;
                        } else {
                            var10000 = true;
                        }
                    }
                }
            }
        } else if (llIllIlIllIl(50052, 9982)) {
            throw null;
        } else {
            super.func_146234_a(var1, 0);
            if (llIllIlIllIl(50052, 9982)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean isCanceled(ITextComponent var1) {
        if (llIllIlIllII(this.. ()) &&llIllIllIIII(this..                                                                                  .
        ()) &&llIllIlIllII(var1.func_150254_d().contains(this.. ()))){
            return true;
        } else if (llIllIlIllIl(62972, 391)) {
            throw null;
        } else {
            return false;
        }
    }
}
