import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent.Post;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class116 extends Class171 {
    private static int 33074=-7833;
    private static int 96344=-7795;
    private static int 74817=-13464;
    private static int 30105=-31607;
    private static int 8844=23194;
    private static int 893=10461;
    private static int 9672=8076;
    private static int 8997=9318;
    public int;
    private static int 15265=-1610;
    private static int 5997=12261;
    public ResourceLocation;
    private static int 83010=-21852;
    private static int 2851=5540;
    public boolean;

    static {
        boolean var10000 = true;
    }

    public Class116() {
        String var10002 = Class60. ("So9\u007fs;Ksw;f\u007f6)");
        if (lllIIIIIlIll(96344, 9672)) {
            throw null;
        } else {
            super(var10002, 75, Class188.);
            if (lllIIIIIlIll(96344, 9672)) {
                throw null;
            } else {
                ResourceLocation var1 = new ResourceLocation;
                String var10004 = Class60. ("p`\u007fpuwfw#hnt'hjtKgvg{bakik{*hk<");
                if (lllIIIIIlIll(96344, 9672)) {
                    throw null;
                } else {
                    var1.<init> (var10004);
                    if (lllIIIIIlIll(96344, 9672)) {
                        throw null;
                    } else {
                        this. = var1;
                        Color var10001 = new Color(0, 0, 0, 170);
                        if (lllIIIIIlIll(96344, 9672)) {
                            throw null;
                        } else {
                            this. = var10001.getRGB();
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIIIIIlIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIIlIlII(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIIIIIllII(Object var0) {
        return var0 != null;
    }

    private static boolean lllIIIIIllll(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIIIIlllI(int var0) {
        return var0 != 0;
    }

    public static List ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var0) {
        NonNullList var10000 = NonNullList.func_191197_a(27, ItemStack.field_190927_a);
        if (lllIIIIIlIll(15265, 8997)) {
            throw null;
        } else {
            NonNullList var1 = var10000;
            NBTTagCompound var2;
            if (lllIIIIIllII(var2 = var0.func_77978_p())) {
                String var10001 = Class60. ("Xwvyu^sn{ohNw<");
                if (lllIIIIIlIll(15265, 8997)) {
                    throw null;
                }

                if (lllIIIIIlllI(var2.func_150297_b(var10001, 10))) {
                    var10001 = Class60. ("Xwvyu^sn{ohNw<");
                    if (lllIIIIIlIll(15265, 8997)) {
                        throw null;
                    }

                    NBTTagCompound var3 = var2 = var2.func_74775_l(var10001);
                    var10001 = Class60. ("Vjyr(");
                    if (lllIIIIIlIll(15265, 8997)) {
                        throw null;
                    }

                    if (lllIIIIIlllI(var3.func_150297_b(var10001, 9))) {
                        ItemStackHelper.func_191283_b(var2, var1);
                        if (lllIIIIIlIll(15265, 8997)) {
                            throw null;
                        }
                    }
                }
            }

            if (lllIIIIIlIll(15265, 8997)) {
                throw null;
            } else {
                return var1;
            }
        }
    }

    @SubscribeEvent(
            priority = EventPriority.LOWEST
    )
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Post var1) {
        boolean var10000;
        if (lllIIIIIllll(this. ()) &&lllIIIIIlllI(Class73..                                                                                                .                                                                                  ) &&
        !lllIIIIIllll(this..field_71462_r instanceof GuiContainer)){
            if (lllIIIIIlIll(83010, 893)) {
                throw null;
            } else {
                Slot var2;
                if (lllIIIIIllII(var2 = ((GuiContainer) var1.getGui()).getSlotUnderMouse()) && lllIIIIIlllI(var2.func_75216_d()) && lllIIIIIllll(var2.func_75211_c().func_190926_b()) && lllIIIIIlllI(var2.func_75211_c().func_77973_b() instanceof ItemShulkerBox)) {
                    List var10 = (var2.func_75211_c());
                    if (lllIIIIIlIll(83010, 893)) {
                        throw null;
                    }

                    List var8 = var10;
                    int var3 = 0;
                    int var4 = 0;
                    int var7 = var1.getMouseX() + 8;
                    int var9 = var1.getMouseY() - 69;
                    GlStateManager.func_179097_i();
                    if (lllIIIIIlIll(83010, 893)) {
                        throw null;
                    }

                    GlStateManager.func_179140_f();
                    if (lllIIIIIlIll(83010, 893)) {
                        throw null;
                    }

                    this.                                                                                           .
                    ((double) (var7 - 1), (double) (var9 - 1), 154.0D, 52.0D, 2.0D, this.                                                                                  )
                    ;
                    this.                                                                                           .
                    ((float) (var7 - 1), (float) (var9 - 1), 154.0F, 52.0F, 2.0F, 2.3F, Class73.                                                                                       .
                    getRGB());
                    GlStateManager.func_179145_e();
                    if (lllIIIIIlIll(83010, 893)) {
                        throw null;
                    }

                    GlStateManager.func_179126_j();
                    if (lllIIIIIlIll(83010, 893)) {
                        throw null;
                    }

                    Iterator var5 = var8.iterator();

                    while (true) {
                        if (lllIIIIIlIll(83010, 893)) {
                            throw null;
                        }

                        if (!lllIIIIIlllI(var5.hasNext())) {
                            break;
                        }

                        ItemStack var6 = (ItemStack) var5.next();
                        int var11 = var7 + var3;
                        int var10004 = var4 * 17;
                        var3 += 17;
                        this. (var6, var11, var9 + var10004, -100.0F);
                        if (lllIIIIIlIll(var3 / 17, 9)) {
                            var3 = 0;
                            ++var4;
                            var10000 = true;
                        }
                    }
                }

                if (lllIIIIIlIll(83010, 893)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        } else if (lllIIIIIlIll(83010, 893)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ItemStack var1, int var2, int var3, float var4) {
        GlStateManager.func_179094_E();
        if (lllIIIIIlIll(30105, 5997)) {
            throw null;
        } else {
            RenderHelper.func_74520_c();
            if (lllIIIIIlIll(30105, 5997)) {
                throw null;
            } else {
                GlStateManager.func_179097_i();
                if (lllIIIIIlIll(30105, 5997)) {
                    throw null;
                } else {
                    Class4 var10004 = this.;
                    double var10005 = (double) var2;
                    double var10006 = (double) var3;
                    Color var10010 = new Color(0, 0, 0, 150);
                    if (lllIIIIIlIll(30105, 5997)) {
                        throw null;
                    } else {
                        var10004. (var10005, var10006, 16.0D, 16.0D, 2.0D, var10010.getRGB());
                        GlStateManager.func_179126_j();
                        if (lllIIIIIlIll(30105, 5997)) {
                            throw null;
                        } else {
                            this.                                                                                           .
                            (). = 500.0F;
                            this.                                                                                           .
                            ().func_175042_a(var1, var2, var3);
                            this.                                                                                           .
                            (). = 0.0F;
                            String var5 = "";
                            if (lllIIIIlIlII(var1.func_190916_E(), 1)) {
                                String var10000 = String.valueOf(var1.func_190916_E());
                                if (lllIIIIIlIll(30105, 5997)) {
                                    throw null;
                                }

                                var5 = var10000;
                            }

                            if (lllIIIIIlIll(30105, 5997)) {
                                throw null;
                            } else {
                                this.                                                                                           .
                                ().func_180453_a(this..field_71466_p, var1, var2, var3, var5);
                                GlStateManager.func_179121_F();
                                if (lllIIIIIlIll(30105, 5997)) {
                                    throw null;
                                } else {
                                    boolean var6 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
