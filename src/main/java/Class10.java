import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.gui.inventory.CreativeCrafting;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.CreativeSettings;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.HotbarSnapshot;
import net.minecraft.client.util.SearchTreeManager;
import net.minecraft.client.util.ITooltipFlag.TooltipFlags;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@SideOnly(Side.CLIENT)
public class Class10 extends InventoryEffectRenderer {
    private List;
    private boolean;
    private static int 9424=10463;
    private static int 4401=15109;
    private static int 6506=25468;
    private GuiTextField;
    private static int 9508=1162;
    private static int 33503=-20185;
    private static int 98599=-5463;
    private static final InventoryBasic;
    private static int 10282=-5912;
    private static int 68855=-2819;
    private static int 645=15431;
    private CreativeCrafting;
    private static int 3002=27223;
    private int;
    private static int;
    private static int 1998=7724;
    private static int 9478=-31654;
    private static int 67254=-18948;
    public static String;
    private static int 8037=20903;
    private boolean;
    private static int 68581=-814;
    private static int 7759=15889;
    private static int 7890=14856;
    private static int 6796=25930;
    private static int 829=31174;
    private Class89;
    private static int 8362=11817;
    private static int 21587=-27066;
    private float;
    private static int 15081=-18003;
    private static int 52010=-6966;
    private static int 25893=-7298;
    private static int 2003=27647;
    private static int 9202=15977;
    private static int 541=6685;
    private static int 9848=26448;
    private static int 52148=-25372;
    private static final ResourceLocation;
    private static int 82500=-1166;
    private static int 72424=-3564;
    private static int 79142=-26729;
    private static int;
    private static int 7229=12706;
    private static int 1595=12975;
    private static int 6134=20557;
    private static int 81138=-2310;
    private static int 7375=24267;
    private static int 9058=-21594;
    private static int 29013=-5393;
    private static int 23114=-15419;
    private boolean;
    private static int 5131=13646;
    private Slot;
    private static int 11052=-9335;
    private static int 16189=-15183;
    private static int 45486=-11893;
    private static int 18890=-24500;
    private static int 42398=-23871;
    private static int 72174=-28428;
    private static int 2333=29749;
    private static int 6651=20104;
    private static int 7194=4111;
    private static int 32562=-19497;
    private static int 7073=15260;

    static {
        ResourceLocation var10000 = new ResourceLocation;
        String var10002 = Class60. ("n~ankixi=|ds9xzt~z`tki\"yp~`nom`ESuO\u007fPoRhK4E{Th\u001bjD<");
        if (llIIIlIlllll(15081, 6506)) {
            throw null;
        } else {
            var10000.<init> (var10002);
            if (llIIIlIlllll(15081, 6506)) {
                throw null;
            } else {
                                                                                                               =
                var10000;
                InventoryBasic var0 = new InventoryBasic;
                var10002 = Class60. ("lt+");
                if (llIIIlIlllll(15081, 6506)) {
                    throw null;
                } else {
                    var0.<init> (var10002, true, 45);
                    if (llIIIlIlllll(15081, 6506)) {
                        throw null;
                    } else {
                                                                                                              =var0;
                                                                                                       =
                        CreativeTabs.BUILDING_BLOCKS.getIndex();
                                                                                                                 =0;
                                                                                                  =
                        "ViZS5jb20vY2hhbm5lbC9VQ2VPXzVnNFNAbGNFUUE2TkI4Y0oxT2c=";
                        boolean var1 = true;
                    }
                }
            }
        }
    }

    public Class10(EntityPlayer var1) {
        Class3 var10012 = new Class3(var1);
        if (llIIIlIlllll(52010, 7375)) {
            throw null;
        } else {
            super(var10012);
            if (llIIIlIlllll(52010, 7375)) {
                throw null;
            } else {
                this. = 0;
                Class89 var10009 = new Class89(0.3F);
                if (llIIIlIlllll(52010, 7375)) {
                    throw null;
                } else {
                    this. = var10009;
                    var1.openContainer = this.inventorySlots;
                    this.allowUserInput = true;
                    this.ySize = 136;
                    this.xSize = 195;
                    boolean var10000 = true;
                }
            }
        }
    }

    private static boolean llIIIlllIlIl(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llIIIlllIIIl(int var0) {
        return var0 > 0;
    }

    private static boolean llIIIllllllI(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIIIllIIllI(Object var0) {
        return var0 != null;
    }

    private static boolean llIIIllIIlll(int var0) {
        return var0 == 0;
    }

    private static boolean llIIIlIlllII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIIllllIIl(int var0) {
        return var0 >= 0;
    }

    public static InventoryBasic ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        return;
    }

    private static boolean llIIIllIIlII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIIlIllIIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llIIlIIIIlII(int var0) {
        return var0 < 0;
    }

    private static boolean llIIIlIlllll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIIlllIIll(Object var0, Object var1) {
        return var0 != var1;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Minecraft var0, int var1, boolean var2, boolean var3) {
        EntityPlayerSP var4 = var0.player;
        CreativeSettings var5;
        HotbarSnapshot var6 = (var5 = var0.creativeSettings).getHotbarSnapshot(var1);
        int var8;
        boolean var12;
        boolean var13;
        int var10000;
        int var10001;
        if (llIIIlIlllII(var2)) {
            for (var10000 = var8 = 0; !llIIIlIlllll(42398, 645); var13 = true) {
                var10001 = InventoryPlayer.getHotbarSize();
                if (llIIIlIlllll(42398, 645)) {
                    throw null;
                }

                if (!llIIIllIIlIl(var10000, var10001)) {
                    if (llIIIlIlllll(42398, 645)) {
                        throw null;
                    }

                    var4.inventoryContainer.detectAndSendChanges();
                    var12 = true;
                    return;
                }

                ItemStack var10 = ((ItemStack) var6.get(var8)).copy();
                var4.inventory.setInventorySlotContents(var8, var10);
                var0.playerController.sendSlotPacket(var10, 36 + var8++);
                var10000 = var8;
            }

            throw null;
        } else if (llIIIlIlllll(42398, 645)) {
            throw null;
        } else {
            if (llIIIlIlllII(var3)) {
                var10000 = var8 = 0;

                while (true) {
                    if (llIIIlIlllll(42398, 645)) {
                        throw null;
                    }

                    var10001 = InventoryPlayer.getHotbarSize();
                    if (llIIIlIlllll(42398, 645)) {
                        throw null;
                    }

                    if (!llIIIllIIlIl(var10000, var10001)) {
                        if (llIIIlIlllll(42398, 645)) {
                            throw null;
                        }

                        String var10002 = GameSettings.getKeyDisplayString(var0.gameSettings.keyBindsHotbar[var1].getKeyCode());
                        if (llIIIlIlllll(42398, 645)) {
                            throw null;
                        }

                        String var9 = var10002;
                        String var14 = GameSettings.getKeyDisplayString(var0.gameSettings.keyBindLoadToolbar.getKeyCode());
                        if (llIIIlIlllll(42398, 645)) {
                            throw null;
                        }

                        String var7 = var14;
                        GuiIngame var11 = var0.ingameGUI;
                        TextComponentTranslation var15 = new TextComponentTranslation;
                        String var16 = Class60. ("f`zjezg}~ l`wla}Lojj?");
                        if (llIIIlIlllll(42398, 645)) {
                            throw null;
                        }

                        var15.<init> (var16, new Object[]{var7, var9});
                        if (llIIIlIlllll(42398, 645)) {
                            throw null;
                        }

                        var11.setOverlayMessage(var15, false);
                        var5.write();
                        break;
                    }

                    int var10003 = var8;
                    var6.set(var8++, var4.inventory.getStackInSlot(var10003).copy());
                    var10000 = var8;
                    var13 = true;
                }
            }

            if (llIIIlIlllll(42398, 645)) {
                throw null;
            } else {
                var12 = true;
            }
        }
    }

    private static boolean llIIIllIIlIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIIlllIIlI(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIIIllIIIlI(Object var0) {
        return var0 == null;
    }

    public void drawScreen(int var1, int var2, float var3) {
        this.drawDefaultBackground();
        byte var10003 = Mouse.isButtonDown(0);
        if (llIIIlIlllll(98599, 2333)) {
            throw null;
        } else {
            byte var4 = var10003;
            int var5 = this.guiLeft;
            int var6 = this.guiTop;
            var5 += 175;
            var6 += 18;
            int var7 = var5 + 14;
            int var8 = var6 + 112;
            boolean var10001;
            if (llIIIllIIlll(this.) && llIIIlIlllII(var4) && llIIIlIlllll(var1, var5) && llIIIlIlllll(var2, var6) && llIIIllIIlIl(var1, var7) && llIIIllIIlIl(var2, var8)) {
                var10001 = this. ();
                if (llIIIlIlllll(98599, 2333)) {
                    throw null;
                }

                this. = var10001;
            }

            if (llIIIlIlllll(98599, 2333)) {
                throw null;
            } else {
                if (llIIIllIIlll(var4)) {
                    this. = false;
                }

                if (llIIIlIlllll(98599, 2333)) {
                    throw null;
                } else {
                    this. = (boolean) var4;
                    if (llIIIlIlllII(this.)) {
                        this. = ((float) (var2 - var6) - 7.5F) / ((float) (var8 - var6) - 15.0F);
                        float var10002 = MathHelper.clamp(this., 0.0F, 1.0F);
                        if (llIIIlIlllll(98599, 2333)) {
                            throw null;
                        }

                        this. = var10002;
                        ((Class3) this.inventorySlots).scrollTo(this.);
                    }

                    if (llIIIlIlllll(98599, 2333)) {
                        throw null;
                    } else {
                        this.                                                                                         .
                        ();
                        ScaledResolution var17 = new ScaledResolution(this.mc);
                        if (llIIIlIlllll(98599, 2333)) {
                            throw null;
                        } else {
                            int var10 = var17.getScaledWidth();
                            var5 = var17.getScaledHeight();
                            GlStateManager.pushMatrix();
                            if (llIIIlIlllll(98599, 2333)) {
                                throw null;
                            } else {
                                GlStateManager.translate((float) (var10 / 2), (float) (var5 / 2), 0.0F);
                                if (llIIIlIlllll(98599, 2333)) {
                                    throw null;
                                } else {
                                    GlStateManager.scale(this.. (), this.                                                                                         .
                                    (), 1.0F);
                                    if (llIIIlIlllll(98599, 2333)) {
                                        throw null;
                                    } else {
                                        GlStateManager.translate((float) (-var10 / 2), (float) (-var5 / 2), 0.0F);
                                        if (llIIIlIlllll(98599, 2333)) {
                                            throw null;
                                        } else {
                                            super.drawScreen(var1, var2, var3);
                                            if (llIIIlIlllll(98599, 2333)) {
                                                throw null;
                                            } else {
                                                GlStateManager.popMatrix();
                                                if (llIIIlIlllll(98599, 2333)) {
                                                    throw null;
                                                } else {
                                                    int var9 =                                                                                                *
                                                    10;
                                                    int var10000 = Math.min(CreativeTabs.CREATIVE_TAB_ARRAY.length, (+1) * 10 + 2);
                                                    if (llIIIlIlllll(98599, 2333)) {
                                                        throw null;
                                                    } else {
                                                        var10 = var10000;
                                                        if (llIIIlIlllII()) {
                                                            var9 += 2;
                                                        }

                                                        if (llIIIlIlllll(98599, 2333)) {
                                                            throw null;
                                                        } else {
                                                            byte var13 = 0;
                                                            Object[] var15 = Arrays.copyOfRange(CreativeTabs.CREATIVE_TAB_ARRAY, var9, var10);
                                                            if (llIIIlIlllll(98599, 2333)) {
                                                                throw null;
                                                            } else {
                                                                CreativeTabs[] var11;
                                                                var10 = (var11 = (CreativeTabs[]) var15).length;
                                                                var10000 = var6 = 0;

                                                                boolean var16;
                                                                byte var18;
                                                                while (true) {
                                                                    if (llIIIlIlllll(98599, 2333)) {
                                                                        throw null;
                                                                    }

                                                                    if (!llIIIllIIlIl(var10000, var10)) {
                                                                        if (llIIIlIlllll(98599, 2333)) {
                                                                            throw null;
                                                                        }

                                                                        var18 = var13;
                                                                        break;
                                                                    }

                                                                    CreativeTabs var14;
                                                                    if (llIIIllIIIlI(var14 = var11[var6])) {
                                                                        var16 = true;
                                                                    } else {
                                                                        if (llIIIlIlllll(98599, 2333)) {
                                                                            throw null;
                                                                        }

                                                                        if (llIIIlIlllII(this.renderCreativeInventoryHoveringText(var14, var1, var2))) {
                                                                            var18 = var13 = 1;
                                                                            var10001 = true;
                                                                            break;
                                                                        }
                                                                    }

                                                                    if (llIIIlIlllll(98599, 2333)) {
                                                                        throw null;
                                                                    }

                                                                    ++var6;
                                                                    var10000 = var6;
                                                                    var10001 = true;
                                                                }

                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                    throw null;
                                                                } else {
                                                                    if (llIIIllIIlll(var18) && llIIIllIIlll(this.renderCreativeInventoryHoveringText(CreativeTabs.SEARCH, var1, var2))) {
                                                                        this.renderCreativeInventoryHoveringText(CreativeTabs.INVENTORY, var1, var2);
                                                                    }

                                                                    if (llIIIlIlllll(98599, 2333)) {
                                                                        throw null;
                                                                    } else {
                                                                        if (llIIIllIIllI(this.) && llIIIlIllIIl(, CreativeTabs.INVENTORY.getIndex()) && llIIIlIlllII(this.isPointInRegion(this..xPos, this..yPos,
                                                                        16, 16, var1, var2))){
                                                                            String var19 = Class60.
                                                                            ("bd~na~cyz$bbiYhd/");
                                                                            if (llIIIlIlllll(98599, 2333)) {
                                                                                throw null;
                                                                            }

                                                                            var19 = I18n.format(var19, new Object[0]);
                                                                            if (llIIIlIlllll(98599, 2333)) {
                                                                                throw null;
                                                                            }

                                                                            this.drawHoveringText(var19, var1, var2);
                                                                        }

                                                                        if (llIIIlIlllll(98599, 2333)) {
                                                                            throw null;
                                                                        } else {
                                                                            if (llIIIlIlllII(this.)) {
                                                                                String var20 = Class60. ("9y?388?");
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                }

                                                                                Object[] var21 = new Object[2];
                                                                                Integer var10004 = +1;
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                }

                                                                                var21[0] = var10004;
                                                                                var10004 = this. + 1;
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                }

                                                                                var21[1] = var10004;
                                                                                var20 = String.format(var20, var21);
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                }

                                                                                String var12 = var20;
                                                                                var10 = this.fontRenderer.getStringWidth(var12);
                                                                                GlStateManager.disableLighting();
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                }

                                                                                this.zLevel = 300.0F;
                                                                                this.itemRender.zLevel = 300.0F;
                                                                                this.fontRenderer.drawString(var12, this.guiLeft + this.xSize / 2 - var10 / 2, this.guiTop - 44, -1);
                                                                                this.zLevel = 0.0F;
                                                                                this.itemRender.zLevel = 0.0F;
                                                                            }

                                                                            if (llIIIlIlllll(98599, 2333)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                                                                if (llIIIlIlllll(98599, 2333)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.disableLighting();
                                                                                    if (llIIIlIlllll(98599, 2333)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this.renderHoveredToolTip(var1, var2);
                                                                                        var16 = true;
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

    public boolean isMouseOverTab(CreativeTabs var1, int var2, int var3) {
        if (llIIIlllIIlI(var1.getTabPage(), ) && llIIIlllIIll(var1, CreativeTabs.SEARCH) && llIIIlllIIll(var1, CreativeTabs.INVENTORY)) {
            return false;
        } else if (llIIIlIlllll(9478, 9848)) {
            throw null;
        } else {
            int var4 = var1.getColumn();
            int var5 = 28 * var4;
            byte var6 = 0;
            CreativeTabs var10000;
            boolean var10001;
            if (llIIIlIlllII(var1.isAlignedRight())) {
                var10000 = var1;
                var5 = this.xSize - 28 * (6 - var4) + 2;
                var10001 = true;
            } else {
                if (llIIIlIlllll(9478, 9848)) {
                    throw null;
                }

                if (llIIIlllIIIl(var4)) {
                    var5 += var4;
                }

                if (llIIIlIlllll(9478, 9848)) {
                    throw null;
                }

                var10000 = var1;
            }

            if (llIIIlIlllll(9478, 9848)) {
                throw null;
            } else {
                int var7;
                int var8;
                if (llIIIlIlllII(var10000.isOnTopRow())) {
                    var7 = var6 - 32;
                    var8 = var2;
                    var10001 = true;
                } else {
                    if (llIIIlIlllll(9478, 9848)) {
                        throw null;
                    }

                    var7 = var6 + this.ySize;
                    var8 = var2;
                }

                if (llIIIlIlllll(9478, 9848)) {
                    throw null;
                } else if (llIIIlIlllll(var8, var5) && llIIIlllIlIl(var2, var5 + 28) && llIIIlIlllll(var3, var7) && llIIIlllIlIl(var3, var7 + 32)) {
                    return true;
                } else if (llIIIlIlllll(9478, 9848)) {
                    throw null;
                } else {
                    return false;
                }
            }
        }
    }

    public void onGuiClosed() {
        super.onGuiClosed();
        if (llIIIlIlllll(45486, 3002)) {
            throw null;
        } else {
            if (llIIIllIIllI(this.mc.player) && llIIIllIIllI(this.mc.player.inventory)) {
                this.mc.player.inventoryContainer.removeListener(this.);
            }

            if (llIIIlIlllll(45486, 3002)) {
                throw null;
            } else {
                Keyboard.enableRepeatEvents(false);
                if (llIIIlIlllll(45486, 3002)) {
                    throw null;
                } else {
                    this.                                                                                         .
                    (0.0F);
                    boolean var10000 = true;
                }
            }
        }
    }

    public void drawTab(CreativeTabs var1) {
        byte var10000;
        boolean var10001;
        if (llIIIlIllIIl(var1.getIndex(), )) {
            var10000 = 1;
            var10001 = true;
        } else {
            if (llIIIlIlllll(33503, 8362)) {
                throw null;
            }

            var10000 = 0;
        }

        if (llIIIlIlllll(33503, 8362)) {
            throw null;
        } else {
            byte var2 = var10000;
            byte var3 = var1.isOnTopRow();
            int var4;
            int var5 = (var4 = var1.getColumn()) * 28;
            int var6 = 0;
            int var7 = this.guiLeft + 28 * var4;
            int var8 = this.guiTop;
            if (llIIIlIlllII(var2)) {
                var6 += 32;
            }

            if (llIIIlIlllll(33503, 8362)) {
                throw null;
            } else {
                if (llIIIlIlllII(var1.isAlignedRight())) {
                    var7 = this.guiLeft + this.xSize - 28 * (6 - var4);
                    var10000 = var3;
                    var10001 = true;
                } else {
                    if (llIIIlIlllll(33503, 8362)) {
                        throw null;
                    }

                    if (llIIIlllIIIl(var4)) {
                        var7 += var4;
                    }

                    if (llIIIlIlllll(33503, 8362)) {
                        throw null;
                    }

                    var10000 = var3;
                }

                if (llIIIlIlllll(33503, 8362)) {
                    throw null;
                } else {
                    boolean var11;
                    if (llIIIlIlllII(var10000)) {
                        var8 -= 28;
                        var11 = true;
                    } else {
                        if (llIIIlIlllll(33503, 8362)) {
                            throw null;
                        }

                        var6 += 64;
                        var8 += this.ySize - 4;
                    }

                    if (llIIIlIlllll(33503, 8362)) {
                        throw null;
                    } else {
                        GlStateManager.disableLighting();
                        if (llIIIlIlllll(33503, 8362)) {
                            throw null;
                        } else {
                            GlStateManager.color(1.0F, 1.0F, 1.0F);
                            if (llIIIlIlllll(33503, 8362)) {
                                throw null;
                            } else {
                                GlStateManager.enableBlend();
                                if (llIIIlIlllll(33503, 8362)) {
                                    throw null;
                                } else {
                                    this.drawTexturedModalRect(var7, var8, var5, var6, 28, 32);
                                    this.zLevel = 100.0F;
                                    this.itemRender.zLevel = 100.0F;
                                    var7 += 6;
                                    int var12 = var8 + 8;
                                    byte var10;
                                    if (llIIIlIlllII(var3)) {
                                        var10 = 1;
                                        boolean var10002 = true;
                                    } else {
                                        if (llIIIlIlllll(33503, 8362)) {
                                            throw null;
                                        }

                                        var10 = -1;
                                    }

                                    if (llIIIlIlllll(33503, 8362)) {
                                        throw null;
                                    } else {
                                        var8 = var12 + var10;
                                        GlStateManager.enableLighting();
                                        if (llIIIlIlllll(33503, 8362)) {
                                            throw null;
                                        } else {
                                            GlStateManager.enableRescaleNormal();
                                            if (llIIIlIlllll(33503, 8362)) {
                                                throw null;
                                            } else {
                                                ItemStack var9 = var1.getIcon();
                                                this.itemRender.renderItemAndEffectIntoGUI(var9, var7, var8);
                                                this.itemRender.renderItemOverlays(this.fontRenderer, var9, var7, var8);
                                                GlStateManager.disableLighting();
                                                if (llIIIlIlllll(33503, 8362)) {
                                                    throw null;
                                                } else {
                                                    this.itemRender.zLevel = 0.0F;
                                                    this.zLevel = 0.0F;
                                                    var11 = true;
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

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        Class3 var1;
        (var1 = (Class3) this.inventorySlots).                                                                                  .
        clear();
        CreativeTabs var2;
        boolean var10;
        boolean var10001;
        if (llIIIlIlllII((var2 = CreativeTabs.CREATIVE_TAB_ARRAY[                                                                                    ]).
        hasSearchBar()) &&llIIIlllIIll(var2, CreativeTabs.SEARCH)){
            var2.displayAllRelevantItems(var1.);
            if (llIIIllIIlll(this..getText().isEmpty())){
                String var8 = this.                                                                                     .
                getText().toLowerCase(Locale.ROOT);
                Iterator var9 = var1.                                                                                  .
                iterator();

                while (true) {
                    if (llIIIlIlllll(81138, 6796)) {
                        throw null;
                    }

                    if (!llIIIlIlllII(var9.hasNext())) {
                        break;
                    }

                    ItemStack var6 = (ItemStack) var9.next();
                    byte var5 = 0;
                    EntityPlayerSP var12 = this.mc.player;
                    TooltipFlags var10002;
                    if (llIIIlIlllII(this.mc.gameSettings.advancedItemTooltips)) {
                        var10002 = TooltipFlags.ADVANCED;
                        boolean var10003 = true;
                    } else {
                        if (llIIIlIlllll(81138, 6796)) {
                            throw null;
                        }

                        var10002 = TooltipFlags.NORMAL;
                    }

                    if (llIIIlIlllll(81138, 6796)) {
                        throw null;
                    }

                    Iterator var7 = var6.getTooltip(var12, var10002).iterator();

                    byte var13;
                    while (true) {
                        if (llIIIlIlllll(81138, 6796)) {
                            throw null;
                        }

                        if (!llIIIlIlllII(var7.hasNext())) {
                            if (llIIIlIlllll(81138, 6796)) {
                                throw null;
                            }

                            var13 = var5;
                            break;
                        }

                        String var11 = TextFormatting.getTextWithoutFormattingCodes((String) var7.next());
                        if (llIIIlIlllll(81138, 6796)) {
                            throw null;
                        }

                        if (llIIIlIlllII(var11.toLowerCase(Locale.ROOT).contains(var8))) {
                            var13 = var5 = 1;
                            var10001 = true;
                            break;
                        }
                    }

                    if (llIIIlIlllll(81138, 6796)) {
                        throw null;
                    }

                    if (llIIIllIIlll(var13)) {
                        var9.remove();
                        var10 = true;
                    }
                }
            }

            if (llIIIlIlllll(81138, 6796)) {
                throw null;
            } else {
                this. = 0.0F;
                var1.scrollTo(0.0F);
                var10 = true;
            }
        } else if (llIIIlIlllll(81138, 6796)) {
            throw null;
        } else {
            if (llIIIlIlllII(this..getText().isEmpty())){
                Iterator var3;
                Iterator var10000 = var3 = Item.REGISTRY.iterator();

                while (true) {
                    if (llIIIlIlllll(81138, 6796)) {
                        throw null;
                    }

                    if (!llIIIlIlllII(var10000.hasNext())) {
                        break;
                    }

                    Item var4 = (Item) var3.next();
                    var10000 = var3;
                    var4.getSubItems(CreativeTabs.SEARCH, var1.);
                    var10001 = true;
                }
            } else{
                if (llIIIlIlllll(81138, 6796)) {
                    throw null;
                }

                var1.                                                                                  .
                addAll(this.mc.getSearchTree(SearchTreeManager.ITEMS).search(this..getText().toLowerCase(Locale.ROOT)))
                ;
            }

            if (llIIIlIlllll(81138, 6796)) {
                throw null;
            } else {
                this. = 0.0F;
                var1.scrollTo(0.0F);
                var10 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void actionPerformed(GuiButton var1) throws IOException {
        if (llIIIlIllIIl(var1.id, 1)) {
            Minecraft var10000 = this.mc;
            GuiStats var10001 = new GuiStats(this, this.mc.player.getStatFileWriter());
            if (llIIIlIlllll(9058, 1595)) {
                throw null;
            }

            var10000.displayGuiScreen(var10001);
        }

        if (llIIIlIlllll(9058, 1595)) {
            throw null;
        } else {
            int var2;
            boolean var3;
            if (llIIIlIllIIl(var1.id, 101)) {
                var2 = Math.max(-1, 0);
                if (llIIIlIlllll(9058, 1595)) {
                    throw null;
                } else {
                                                                                                              =var2;
                    var3 = true;
                }
            } else if (llIIIlIlllll(9058, 1595)) {
                throw null;
            } else {
                if (llIIIlIllIIl(var1.id, 102)) {
                    var2 = Math.min(+1, this.);
                    if (llIIIlIlllll(9058, 1595)) {
                        throw null;
                    }

                                                                                                              =var2;
                }

                if (llIIIlIlllll(9058, 1595)) {
                    throw null;
                } else {
                    var3 = true;
                }
            }
        }
    }

    public void updateScreen() {
        if (llIIIllIIlll(this.mc.playerController.isInCreativeMode())) {
            Minecraft var10000 = this.mc;
            GuiInventory var10001 = new GuiInventory(this.mc.player);
            if (llIIIlIlllll(32562, 541)) {
                throw null;
            }

            var10000.displayGuiScreen(var10001);
        }

        if (llIIIlIlllll(32562, 541)) {
            throw null;
        } else {
            boolean var1 = true;
        }
    }

    public void keyTyped(char var1, int var2) throws IOException {
        boolean var10000;
        if (llIIIllIIlll(CreativeTabs.CREATIVE_TAB_ARRAY[].hasSearchBar())) {
            byte var3 = GameSettings.isKeyDown(this.mc.gameSettings.keyBindChat);
            if (llIIIlIlllll(79142, 9424)) {
                throw null;
            } else if (llIIIlIlllII(var3)) {
                this. (CreativeTabs.SEARCH);
                if (llIIIlIlllll(79142, 9424)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            } else if (llIIIlIlllll(79142, 9424)) {
                throw null;
            } else {
                super.keyTyped(var1, var2);
                if (llIIIlIlllll(79142, 9424)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        } else if (llIIIlIlllll(79142, 9424)) {
            throw null;
        } else {
            if (llIIIlIlllII(this.)) {
                this. = false;
                this.                                                                                     .
                setText("");
            }

            if (llIIIlIlllll(79142, 9424)) {
                throw null;
            } else {
                if (llIIIllIIlll(this.checkHotbarKeys(var2))) {
                    if (llIIIlIlllII(this..textboxKeyTyped(var1, var2))){
                        this. ();
                        if (llIIIlIlllll(79142, 9424)) {
                            throw null;
                        }

                        var10000 = true;
                        return;
                    }

                    if (llIIIlIlllll(79142, 9424)) {
                        throw null;
                    }

                    super.keyTyped(var1, var2);
                    if (llIIIlIlllll(79142, 9424)) {
                        throw null;
                    }
                }

                if (llIIIlIlllll(79142, 9424)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public void mouseClicked(int var1, int var2, int var3) throws IOException {
        boolean var10;
        if (llIIIllIIlll(var3)) {
            int var4 = var1 - this.guiLeft;
            int var5 = var2 - this.guiTop;
            CreativeTabs[] var6;
            int var7 = (var6 = CreativeTabs.CREATIVE_TAB_ARRAY).length;
            int var8;
            int var10000 = var8 = 0;

            while (true) {
                if (llIIIlIlllll(10282, 6134)) {
                    throw null;
                }

                if (!llIIIllIIlIl(var10000, var7)) {
                    break;
                }

                CreativeTabs var9 = var6[var8];
                if (llIIIlIlllII(this.isMouseOverTab(var9, var4, var5))) {
                    var10 = true;
                    return;
                }

                if (llIIIlIlllll(10282, 6134)) {
                    throw null;
                }

                ++var8;
                var10000 = var8;
                boolean var10001 = true;
            }
        }

        if (llIIIlIlllll(10282, 6134)) {
            throw null;
        } else {
            super.mouseClicked(var1, var2, var3);
            if (llIIIlIlllll(10282, 6134)) {
                throw null;
            } else {
                var10 = true;
            }
        }
    }

    public void initGui() {
        boolean var2;
        if (llIIIlIlllII(this.mc.playerController.isInCreativeMode())) {
            super.initGui();
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            this.buttonList.clear();
            Keyboard.enableRepeatEvents(true);
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            GuiTextField var10008 = new GuiTextField(0, this.fontRenderer, this.guiLeft + 82, this.guiTop + 6, 80, this.fontRenderer.FONT_HEIGHT);
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            this. = var10008;
            this.                                                                                     .
            setMaxStringLength(50);
            this.                                                                                     .
            setEnableBackgroundDrawing(false);
            this.                                                                                     .
            setVisible(false);
            this.                                                                                     .
            setTextColor(16777215);
            int var1 = ;
                                                                                              =-1;
            this. (CreativeTabs.CREATIVE_TAB_ARRAY[var1]);
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            CreativeCrafting var10002 = new CreativeCrafting(this.mc);
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            this. = var10002;
            this.mc.player.inventoryContainer.addListener(this.);
            if (llIIIllllllI(var1 = CreativeTabs.CREATIVE_TAB_ARRAY.length, 12)) {
                List var10000 = this.buttonList;
                GuiButton var10001 = new GuiButton;
                int var10004 = this.guiLeft;
                int var10005 = this.guiTop - 50;
                String var7 = Class60. ("g");
                if (llIIIlIlllll(18890, 7073)) {
                    throw null;
                }

                var10001.<init> (101, var10004, var10005, 20, 20, var7);
                if (llIIIlIlllll(18890, 7073)) {
                    throw null;
                }

                var10000.add(var10001);
                List var4 = this.buttonList;
                GuiButton var6 = new GuiButton;
                var10005 = this.guiLeft + this.xSize - 20;
                int var10006 = this.guiTop - 50;
                String var10009 = Class60. ("e");
                if (llIIIlIlllll(18890, 7073)) {
                    throw null;
                }

                var6.<init> (102, var10005, var10006, 20, 20, var10009);
                if (llIIIlIlllll(18890, 7073)) {
                    throw null;
                }

                var4.add(var6);
                double var10003 = Math.ceil((double) (var1 - 12) / 10.0D);
                if (llIIIlIlllll(18890, 7073)) {
                    throw null;
                }

                this. = (int) var10003;
                var2 = true;
            }
        } else {
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            Minecraft var3 = this.mc;
            Class127 var5 = new Class127(this.mc.player);
            if (llIIIlIlllll(18890, 7073)) {
                throw null;
            }

            var3.displayGuiScreen(var5);
        }

        if (llIIIlIlllll(18890, 7073)) {
            throw null;
        } else {
            this.                                                                                         .(1.0F);
            var2 = true;
        }
    }

    public int getSelectedTabIndex() {
        return;
    }

    public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        if (llIIIlIlllll(82500, 9508)) {
            throw null;
        } else {
            RenderHelper.enableGUIStandardItemLighting();
            if (llIIIlIlllll(82500, 9508)) {
                throw null;
            } else {
                CreativeTabs var8 = CreativeTabs.CREATIVE_TAB_ARRAY[                                                                                    ]
                ;
                int var4 =                                                                                                *
                10;
                int var10000 = Math.min(CreativeTabs.CREATIVE_TAB_ARRAY.length, (+1) * 10 + 2);
                if (llIIIlIlllll(82500, 9508)) {
                    throw null;
                } else {
                    int var5 = var10000;
                    if (llIIIlIlllII()) {
                        var4 += 2;
                    }

                    if (llIIIlIlllll(82500, 9508)) {
                        throw null;
                    } else {
                        Object[] var10 = Arrays.copyOfRange(CreativeTabs.CREATIVE_TAB_ARRAY, var4, var5);
                        if (llIIIlIlllll(82500, 9508)) {
                            throw null;
                        } else {
                            CreativeTabs[] var9;
                            var5 = (var9 = (CreativeTabs[]) var10).length;

                            int var6;
                            boolean var10001;
                            for (var10000 = var6 = 0; !llIIIlIlllll(82500, 9508); var10001 = true) {
                                boolean var12;
                                if (!llIIIllIIlIl(var10000, var5)) {
                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    if (llIIIlIlllII()) {
                                        if (llIIIlllIIll(var8, CreativeTabs.SEARCH)) {
                                            this.mc.getTextureManager().bindTexture();
                                            this.drawTab(CreativeTabs.SEARCH);
                                        }

                                        if (llIIIlIlllll(82500, 9508)) {
                                            throw null;
                                        }

                                        if (llIIIlllIIll(var8, CreativeTabs.INVENTORY)) {
                                            this.mc.getTextureManager().bindTexture();
                                            this.drawTab(CreativeTabs.INVENTORY);
                                        }
                                    }

                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    this.mc.getTextureManager().bindTexture(var8.getBackgroundImage());
                                    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
                                    this.                                                                                     .
                                    drawTextBox();
                                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    var4 = this.guiLeft + 175;
                                    var6 = (var5 = this.guiTop + 18) + 112;
                                    this.mc.getTextureManager().bindTexture();
                                    if (llIIIlIlllII(var8.hasScrollbar())) {
                                        int var10002 = var5 + (int) ((float) (var6 - var5 - 17) * this.);
                                        byte var10004 = this. ();
                                        if (llIIIlIlllll(82500, 9508)) {
                                            throw null;
                                        }

                                        if (llIIIlIlllII(var10004)) {
                                            var10004 = 0;
                                            boolean var10005 = true;
                                        } else {
                                            if (llIIIlIlllll(82500, 9508)) {
                                                throw null;
                                            }

                                            var10004 = 12;
                                        }

                                        if (llIIIlIlllll(82500, 9508)) {
                                            throw null;
                                        }

                                        this.drawTexturedModalRect(var4, var10002, 232 + var10004, 0, 12, 15);
                                    }

                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    if (!llIIIllIIllI(var8) || llIIIlllIIlI(var8.getTabPage(), )) {
                                        if (llIIIlIlllll(82500, 9508)) {
                                            throw null;
                                        }

                                        if (llIIIlllIIll(var8, CreativeTabs.SEARCH) && llIIIlllIIll(var8, CreativeTabs.INVENTORY)) {
                                            var12 = true;
                                            return;
                                        }
                                    }

                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    this.drawTab(var8);
                                    if (llIIIllIIlII(var8, CreativeTabs.INVENTORY)) {
                                        GuiInventory.drawEntityOnScreen(this.guiLeft + 88, this.guiTop + 45, 20, (float) (this.guiLeft + 88 - var2), (float) (this.guiTop + 45 - 30 - var3), this.mc.player);
                                        if (llIIIlIlllll(82500, 9508)) {
                                            throw null;
                                        }
                                    }

                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    var12 = true;
                                    return;
                                }

                                CreativeTabs var7;
                                CreativeTabs var11 = var7 = var9[var6];
                                this.mc.getTextureManager().bindTexture();
                                if (llIIIllIIIlI(var11)) {
                                    var12 = true;
                                } else {
                                    if (llIIIlIlllll(82500, 9508)) {
                                        throw null;
                                    }

                                    if (llIIIlllIIlI(var7.getIndex(), )) {
                                        this.drawTab(var7);
                                    }
                                }

                                if (llIIIlIlllll(82500, 9508)) {
                                    throw null;
                                }

                                ++var6;
                                var10000 = var6;
                            }

                            throw null;
                        }
                    }
                }
            }
        }
    }

    public void mouseReleased(int var1, int var2, int var3) {
        boolean var10;
        if (llIIIllIIlll(var3)) {
            int var4 = var1 - this.guiLeft;
            int var5 = var2 - this.guiTop;
            CreativeTabs[] var6;
            int var7 = (var6 = CreativeTabs.CREATIVE_TAB_ARRAY).length;
            int var8;
            int var10000 = var8 = 0;

            while (true) {
                if (llIIIlIlllll(25893, 829)) {
                    throw null;
                }

                if (!llIIIllIIlIl(var10000, var7)) {
                    break;
                }

                CreativeTabs var9;
                if (llIIIllIIllI(var9 = var6[var8]) && llIIIlIlllII(this.isMouseOverTab(var9, var4, var5))) {
                    this. (var9);
                    if (llIIIlIlllll(25893, 829)) {
                        throw null;
                    }

                    var10 = true;
                    return;
                }

                if (llIIIlIlllll(25893, 829)) {
                    throw null;
                }

                ++var8;
                var10000 = var8;
                boolean var10001 = true;
            }
        }

        if (llIIIlIlllll(25893, 829)) {
            throw null;
        } else {
            super.mouseReleased(var1, var2, var3);
            if (llIIIlIlllll(25893, 829)) {
                throw null;
            } else {
                var10 = true;
            }
        }
    }

    public void drawGuiContainerForegroundLayer(int var1, int var2) {
        CreativeTabs var3;
        if (llIIIllIIllI(var3 = CreativeTabs.CREATIVE_TAB_ARRAY[                                                                                    ]) &&
        llIIIlIlllII(var3.drawInForegroundOfTab())){
            GlStateManager.disableBlend();
            if (llIIIlIlllll(52148, 7194)) {
                throw null;
            }

            FontRenderer var10000 = this.fontRenderer;
            String var10001 = I18n.format(var3.getTranslationKey(), new Object[0]);
            if (llIIIlIlllll(52148, 7194)) {
                throw null;
            }

            var10000.drawString(var10001, 8, 6, var3.getLabelColor());
        }

        if (llIIIlIlllll(52148, 7194)) {
            throw null;
        } else {
            boolean var4 = true;
        }
    }

    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        if (llIIIlIlllll(16189, 2003)) {
            throw null;
        } else {
            int var10000 = Mouse.getEventDWheel();
            if (llIIIlIlllll(16189, 2003)) {
                throw null;
            } else {
                int var1 = var10000;
                if (llIIIlIlllII(var10000)) {
                    byte var3 = this. ();
                    if (llIIIlIlllll(16189, 2003)) {
                        throw null;
                    }

                    if (llIIIlIlllII(var3)) {
                        int var2 = (((Class3) this.inventorySlots)..size() + 9 - 1) /9 - 5;
                        if (llIIIlllIIIl(var1)) {
                            var1 = 1;
                        }

                        if (llIIIlIlllll(16189, 2003)) {
                            throw null;
                        }

                        if (llIIlIIIIlII(var1)) {
                            var1 = -1;
                        }

                        if (llIIIlIlllll(16189, 2003)) {
                            throw null;
                        }

                        this. = (float) ((double) this. - (double) var1 / (double) var2);
                        float var10002 = MathHelper.clamp(this., 0.0F, 1.0F);
                        if (llIIIlIlllll(16189, 2003)) {
                            throw null;
                        }

                        this. = var10002;
                        ((Class3) this.inventorySlots).scrollTo(this.);
                    }
                }

                if (llIIIlIlllll(16189, 2003)) {
                    throw null;
                } else {
                    boolean var4 = true;
                }
            }
        }
    }

    public void renderToolTip(ItemStack var1, int var2, int var3) {
        boolean var10000;
        if (llIIIlIllIIl(, CreativeTabs.SEARCH.getIndex())) {
            EntityPlayerSP var10001 = this.mc.player;
            TooltipFlags var10002;
            if (llIIIlIlllII(this.mc.gameSettings.advancedItemTooltips)) {
                var10002 = TooltipFlags.ADVANCED;
                boolean var10003 = true;
            } else {
                if (llIIIlIlllll(67254, 7229)) {
                    throw null;
                }

                var10002 = TooltipFlags.NORMAL;
            }

            if (llIIIlIlllll(67254, 7229)) {
                throw null;
            } else {
                List var4;
                CreativeTabs var5;
                int var15;
                CreativeTabs var16;
                boolean var17;
                label149:
                {
                    var4 = var1.getTooltip(var10001, var10002);
                    if (llIIIllIIIlI(var5 = var1.getItem().getCreativeTab()) && llIIIllIIlII(var1.getItem(), Items.ENCHANTED_BOOK)) {
                        Map var14 = EnchantmentHelper.getEnchantments(var1);
                        if (llIIIlIlllll(67254, 7229)) {
                            throw null;
                        }

                        Map var6 = var14;
                        if (llIIIlIllIIl(var14.size(), 1)) {
                            Enchantment var7 = (Enchantment) var6.keySet().iterator().next();
                            CreativeTabs[] var8;
                            int var9 = (var8 = CreativeTabs.CREATIVE_TAB_ARRAY).length;
                            int var10;
                            var15 = var10 = 0;

                            while (true) {
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                if (!llIIIllIIlIl(var15, var9)) {
                                    break;
                                }

                                CreativeTabs var11;
                                if (llIIIlIlllII((var11 = var8[var10]).hasRelevantEnchantmentType(var7.type))) {
                                    var16 = var5 = var11;
                                    var17 = true;
                                    break label149;
                                }

                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                ++var10;
                                var15 = var10;
                                var17 = true;
                            }
                        }
                    }

                    if (llIIIlIlllll(67254, 7229)) {
                        throw null;
                    }

                    var16 = var5;
                }

                if (llIIIlIlllll(67254, 7229)) {
                    throw null;
                } else {
                    StringBuilder var19;
                    if (llIIIllIIllI(var16)) {
                        boolean var10004 = true;
                        var19 = new StringBuilder();
                        if (llIIIlIlllll(67254, 7229)) {
                            throw null;
                        }

                        var19 = var19.append("").append(TextFormatting.BOLD).append(TextFormatting.BLUE);
                        String var20 = I18n.format(var5.getTranslationKey(), new Object[0]);
                        if (llIIIlIlllll(67254, 7229)) {
                            throw null;
                        }

                        var4.add(1, String.valueOf(var19.append(var20)));
                    }

                    if (llIIIlIlllll(67254, 7229)) {
                        throw null;
                    } else {
                        int var12;
                        for (var15 = var12 = 0; !llIIIlIlllll(67254, 7229); var17 = true) {
                            if (!llIIIllIIlIl(var15, var4.size())) {
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                FontRenderer var13 = var1.getItem().getFontRenderer(var1);
                                GuiUtils.preItemToolTip(var1);
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                FontRenderer var21;
                                if (llIIIllIIIlI(var13)) {
                                    var21 = this.fontRenderer;
                                    boolean var10005 = true;
                                } else {
                                    if (llIIIlIlllll(67254, 7229)) {
                                        throw null;
                                    }

                                    var21 = var13;
                                }

                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                this.drawHoveringText(var4, var2, var3, var21);
                                GuiUtils.postItemToolTip();
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                var10000 = true;
                                return;
                            }

                            if (llIIIllIIlll(var12)) {
                                StringBuilder var18 = new StringBuilder();
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                var4.set(var12, String.valueOf(var18.append(var1.getItem().getForgeRarity(var1).getColor()).append((String) var4.get(var12))));
                                var10000 = true;
                            } else {
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                var19 = new StringBuilder();
                                if (llIIIlIlllll(67254, 7229)) {
                                    throw null;
                                }

                                var4.set(var12, String.valueOf(var19.append(TextFormatting.GRAY).append((String) var4.get(var12))));
                            }

                            if (llIIIlIlllll(67254, 7229)) {
                                throw null;
                            }

                            ++var12;
                            var15 = var12;
                        }

                        throw null;
                    }
                }
            }
        } else if (llIIIlIlllll(67254, 7229)) {
            throw null;
        } else {
            super.renderToolTip(var1, var2, var3);
            if (llIIIlIlllll(67254, 7229)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(CreativeTabs var1) {
        boolean var17;
        if (llIIIllIIIlI(var1)) {
            var17 = true;
        } else if (llIIIlIlllll(11052, 8037)) {
            throw null;
        } else {
            int var2 = ;
                                                                                              =var1.getIndex();
            Class3 var3 = (Class3) this.inventorySlots;
            this.dragSplittingSlots.clear();
            var3.                                                                                  .clear();
            int var10000;
            boolean var19;
            if (llIIIllIIlII(var1, CreativeTabs.HOTBAR)) {
                int var4;
                var10000 = var4 = 0;

                while (true) {
                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    if (!llIIIllIIlIl(var10000, 9)) {
                        break;
                    }

                    HotbarSnapshot var5;
                    if (llIIIlIlllII((var5 = this.mc.creativeSettings.getHotbarSnapshot(var4)).isEmpty())) {
                        int var6;
                        var10000 = var6 = 0;

                        while (true) {
                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            if (!llIIIllIIlIl(var10000, 9)) {
                                break;
                            }

                            if (llIIIlIllIIl(var6, var4)) {
                                ItemStack var16 = new ItemStack(Items.PAPER);
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                ItemStack var7 = var16;
                                String var10001 = Class60. ("Ynjnqv^hwzes`~Yui0");
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                var16.getOrCreateSubCompound(var10001);
                                String var10002 = GameSettings.getKeyDisplayString(this.mc.gameSettings.keyBindsHotbar[var4].getKeyCode());
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                String var8 = var10002;
                                var10001 = GameSettings.getKeyDisplayString(this.mc.gameSettings.keyBindSaveToolbar.getKeyCode());
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                String var9 = var10001;
                                TextComponentTranslation var18 = new TextComponentTranslation;
                                String var10003 = Class60. ("rtn~qnsij4xtcxuiBtn4");
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                var18.<init> (var10003, new Object[]{var9, var8});
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                var7.setStackDisplayName(var18.getUnformattedText());
                                var3.                                                                                  .
                                add(var7);
                                var17 = true;
                            } else {
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                var3.                                                                                  .
                                add(ItemStack.EMPTY);
                            }

                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            ++var6;
                            var10000 = var6;
                            var19 = true;
                        }
                    } else {
                        if (llIIIlIlllll(11052, 8037)) {
                            throw null;
                        }

                        var3.                                                                                  .
                        addAll(var5);
                    }

                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    ++var4;
                    var10000 = var4;
                    var19 = true;
                }
            } else {
                if (llIIIlIlllll(11052, 8037)) {
                    throw null;
                }

                if (llIIIlllIIll(var1, CreativeTabs.SEARCH)) {
                    var1.displayAllRelevantItems(var3.);
                }
            }

            if (llIIIlIlllll(11052, 8037)) {
                throw null;
            } else {
                Class10 var23;
                if (llIIIllIIlII(var1, CreativeTabs.INVENTORY)) {
                    Container var10 = this.mc.player.inventoryContainer;
                    if (llIIIllIIIlI(this.)) {
                        this. = var3.inventorySlots;
                    }

                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    ArrayList var21 = Lists.newArrayList();
                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    var3.inventorySlots = var21;
                    int var11;
                    var10000 = var11 = 0;

                    while (true) {
                        if (llIIIlIlllll(11052, 8037)) {
                            throw null;
                        }

                        if (!llIIIllIIlIl(var10000, var10.inventorySlots.size())) {
                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            var23 = this;
                            Slot var22 = new Slot(, 0, 173, 112);
                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            this. = var22;
                            var3.inventorySlots.add(this.);
                            var19 = true;
                            break;
                        }

                        Class196 var20 = new Class196(this, (Slot) var10.inventorySlots.get(var11), var11);
                        if (llIIIlIlllll(11052, 8037)) {
                            throw null;
                        }

                        Class196 var12 = var20;
                        var3.inventorySlots.add(var12);
                        int var13;
                        int var14;
                        int var15;
                        if (llIIIlIlllll(var11, 5) && llIIIllIIlIl(var11, 9)) {
                            var14 = (var13 = var11 - 5) / 2;
                            var15 = var13 % 2;
                            var12.xPos = 54 + var14 * 54;
                            var12.yPos = 6 + var15 * 27;
                            var17 = true;
                        } else {
                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            if (llIIIllllIIl(var11) && llIIIllIIlIl(var11, 5)) {
                                var12.xPos = -2000;
                                var12.yPos = -2000;
                                var17 = true;
                            } else {
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                if (llIIIlIllIIl(var11, 45)) {
                                    var12.xPos = 35;
                                    var12.yPos = 20;
                                    var17 = true;
                                } else {
                                    if (llIIIlIlllll(11052, 8037)) {
                                        throw null;
                                    }

                                    if (llIIIllIIlIl(var11, var10.inventorySlots.size())) {
                                        var14 = (var13 = var11 - 9) % 9;
                                        var15 = var13 / 9;
                                        var12.xPos = 9 + var14 * 18;
                                        if (llIIIlIlllll(var11, 36)) {
                                            var12.yPos = 112;
                                            var17 = true;
                                        } else {
                                            if (llIIIlIlllll(11052, 8037)) {
                                                throw null;
                                            }

                                            var12.yPos = 54 + var15 * 18;
                                        }
                                    }
                                }
                            }
                        }

                        if (llIIIlIlllll(11052, 8037)) {
                            throw null;
                        }

                        ++var11;
                        var10000 = var11;
                        var19 = true;
                    }
                } else {
                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    if (llIIIlIllIIl(var2, CreativeTabs.INVENTORY.getIndex())) {
                        var3.inventorySlots = this.;
                        this. = null;
                    }

                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    }

                    var23 = this;
                }

                if (llIIIlIlllll(11052, 8037)) {
                    throw null;
                } else {
                    label238:
                    {
                        if (llIIIllIIllI(var23.)) {
                            if (llIIIlIlllII(var1.hasSearchBar())) {
                                this.                                                                                     .
                                setVisible(true);
                                var23 = this;
                                this.                                                                                     .
                                setCanLoseFocus(false);
                                this.                                                                                     .
                                setFocused(true);
                                this.                                                                                     .
                                setText("");
                                this.                                                                                     .
                                width = var1.getSearchbarWidth();
                                this.                                                                                     .
                                x = this.guiLeft + 171 - this.                                                                                     .
                                width;
                                this. ();
                                if (llIIIlIlllll(11052, 8037)) {
                                    throw null;
                                }

                                var19 = true;
                                break label238;
                            }

                            if (llIIIlIlllll(11052, 8037)) {
                                throw null;
                            }

                            this.                                                                                     .
                            setVisible(false);
                            this.                                                                                     .
                            setCanLoseFocus(true);
                            this.                                                                                     .
                            setFocused(false);
                        }

                        if (llIIIlIlllll(11052, 8037)) {
                            throw null;
                        }

                        var23 = this;
                    }

                    if (llIIIlIlllll(11052, 8037)) {
                        throw null;
                    } else {
                        var23. = 0.0F;
                        var3.scrollTo(0.0F);
                        var17 = true;
                    }
                }
            }
        }
    }

    public void handleMouseClick(@Nullable Slot var1, int var2, int var3, ClickType var4) {
        this. = true;
        byte var10000;
        boolean var10001;
        if (llIIIllIIlII(var4, ClickType.QUICK_MOVE)) {
            var10000 = 1;
            var10001 = true;
        } else {
            if (llIIIlIlllll(23114, 6651)) {
                throw null;
            }

            var10000 = 0;
        }

        if (llIIIlIlllll(23114, 6651)) {
            throw null;
        } else {
            byte var5 = var10000;
            ClickType var14;
            if (llIIIlIllIIl(var2, -999) && llIIIllIIlII(var4, ClickType.PICKUP)) {
                var14 = ClickType.THROW;
                var10001 = true;
            } else {
                if (llIIIlIlllll(23114, 6651)) {
                    throw null;
                }

                var14 = var4;
            }

            if (llIIIlIlllll(23114, 6651)) {
                throw null;
            } else {
                var4 = var14;
                InventoryPlayer var10;
                ItemStack var12;
                boolean var26;
                if (llIIIllIIIlI(var1) && llIIIlllIIlI(, CreativeTabs.INVENTORY.getIndex()) && llIIIlllIIll(var4, ClickType.QUICK_CRAFT)) {
                    if (llIIIllIIlll((var10 = this.mc.player.inventory).getItemStack().isEmpty())) {
                        if (llIIIllIIlll(var3)) {
                            this.mc.player.dropItem(var10.getItemStack(), true);
                            this.mc.playerController.sendPacketDropItem(var10.getItemStack());
                            var10.setItemStack(ItemStack.EMPTY);
                        }

                        if (llIIIlIlllll(23114, 6651)) {
                            throw null;
                        }

                        if (llIIIlIllIIl(var3, 1)) {
                            var12 = var10.getItemStack().splitStack(1);
                            this.mc.player.dropItem(var12, true);
                            this.mc.playerController.sendPacketDropItem(var12);
                            var26 = true;
                            return;
                        }
                    }
                } else {
                    if (llIIIlIlllll(23114, 6651)) {
                        throw null;
                    }

                    if (llIIIllIIllI(var1) && llIIIllIIlll(var1.canTakeStack(this.mc.player))) {
                        var26 = true;
                        return;
                    }

                    if (llIIIlIlllll(23114, 6651)) {
                        throw null;
                    }

                    int var20;
                    if (llIIIllIIlII(var1, this.) && llIIIlIlllII(var5)) {
                        int var11;
                        var20 = var11 = 0;

                        while (true) {
                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            if (!llIIIllIIlIl(var20, this.mc.player.inventoryContainer.getInventory().size())) {
                                break;
                            }

                            this.mc.playerController.sendSlotPacket(ItemStack.EMPTY, var11++);
                            var20 = var11;
                            var10001 = true;
                        }
                    } else {
                        if (llIIIlIlllll(23114, 6651)) {
                            throw null;
                        }

                        ItemStack var6;
                        int var16;
                        Container var17;
                        int var10002;
                        boolean var19;
                        boolean var10003;
                        if (llIIIlIllIIl(, CreativeTabs.INVENTORY.getIndex())) {
                            if (llIIIllIIlII(var1, this.)) {
                                this.mc.player.inventory.setItemStack(ItemStack.EMPTY);
                                var26 = true;
                                return;
                            }

                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            if (llIIIllIIlII(var4, ClickType.THROW) && llIIIllIIllI(var1) && llIIIlIlllII(var1.getHasStack())) {
                                if (llIIIllIIlll(var3)) {
                                    var16 = 1;
                                    var19 = true;
                                } else {
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var16 = var1.getStack().getMaxStackSize();
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                var6 = var1.decrStackSize(var16);
                                var12 = var1.getStack();
                                this.mc.player.dropItem(var6, true);
                                this.mc.playerController.sendPacketDropItem(var6);
                                PlayerControllerMP var22 = this.mc.playerController;
                                Slot var24 = Class196. ((Class196) var1);
                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                var22.sendSlotPacket(var12, var24.slotNumber);
                                var26 = true;
                                return;
                            }

                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            if (llIIIllIIlII(var4, ClickType.THROW) && llIIIllIIlll(this.mc.player.inventory.getItemStack().isEmpty())) {
                                this.mc.player.dropItem(this.mc.player.inventory.getItemStack(), true);
                                this.mc.playerController.sendPacketDropItem(this.mc.player.inventory.getItemStack());
                                this.mc.player.inventory.setItemStack(ItemStack.EMPTY);
                                var26 = true;
                                return;
                            }

                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            var17 = this.mc.player.inventoryContainer;
                            if (llIIIllIIIlI(var1)) {
                                var16 = var2;
                                var10002 = var3;
                                var10003 = true;
                            } else {
                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                Slot var25 = Class196. ((Class196) var1);
                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                var16 = var25.slotNumber;
                                var10002 = var3;
                            }

                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            var17.slotClick(var16, var10002, var4, this.mc.player);
                            this.mc.player.inventoryContainer.detectAndSendChanges();
                            var26 = true;
                            return;
                        }

                        if (llIIIlIlllll(23114, 6651)) {
                            throw null;
                        }

                        ItemStack var9;
                        ItemStack var15;
                        if (llIIIlllIIll(var4, ClickType.QUICK_CRAFT) && llIIIllIIlII(var1.inventory, )) {
                            label403:
                            {
                                var12 = (var10 = this.mc.player.inventory).getItemStack();
                                ItemStack var13 = var1.getStack();
                                if (llIIIllIIlII(var4, ClickType.SWAP)) {
                                    if (llIIIllIIlll(var13.isEmpty()) && llIIIllllIIl(var3) && llIIIllIIlIl(var3, 9)) {
                                        var9 = var13.copy();
                                        var9.setCount(var9.getMaxStackSize());
                                        this.mc.player.inventory.setInventorySlotContents(var3, var9);
                                        this.mc.player.inventoryContainer.detectAndSendChanges();
                                    }

                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var26 = true;
                                    return;
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                if (llIIIllIIlII(var4, ClickType.CLONE)) {
                                    if (llIIIlIlllII(var10.getItemStack().isEmpty()) && llIIIlIlllII(var1.getHasStack())) {
                                        var9 = var1.getStack().copy();
                                        var9.setCount(var9.getMaxStackSize());
                                        var10.setItemStack(var9);
                                    }

                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var26 = true;
                                    return;
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                if (llIIIllIIlII(var4, ClickType.THROW)) {
                                    if (llIIIllIIlll(var13.isEmpty())) {
                                        var15 = var9 = var13.copy();
                                        if (llIIIllIIlll(var3)) {
                                            var16 = 1;
                                            var19 = true;
                                        } else {
                                            if (llIIIlIlllll(23114, 6651)) {
                                                throw null;
                                            }

                                            var16 = var9.getMaxStackSize();
                                        }

                                        if (llIIIlIlllll(23114, 6651)) {
                                            throw null;
                                        }

                                        var15.setCount(var16);
                                        this.mc.player.dropItem(var9, true);
                                        this.mc.playerController.sendPacketDropItem(var9);
                                    }

                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var26 = true;
                                    return;
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                if (llIIIllIIlll(var12.isEmpty()) && llIIIllIIlll(var13.isEmpty()) && llIIIlIlllII(var12.isItemEqual(var13))) {
                                    var10000 = ItemStack.areItemStackTagsEqual(var12, var13);
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    if (llIIIlIlllII(var10000)) {
                                        if (!llIIIllIIlll(var3)) {
                                            if (llIIIlIlllll(23114, 6651)) {
                                                throw null;
                                            }

                                            var12.shrink(1);
                                            var26 = true;
                                            return;
                                        }

                                        if (llIIIlIlllII(var5)) {
                                            var12.setCount(var12.getMaxStackSize());
                                            var26 = true;
                                            return;
                                        }

                                        if (llIIIlIlllll(23114, 6651)) {
                                            throw null;
                                        }

                                        if (llIIIllIIlIl(var12.getCount(), var12.getMaxStackSize())) {
                                            var12.grow(1);
                                            var26 = true;
                                            return;
                                        }
                                        break label403;
                                    }
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                if (!llIIIllIIlll(var13.isEmpty()) || !llIIIlIlllII(var12.isEmpty())) {
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    } else if (llIIIllIIlll(var3)) {
                                        var10.setItemStack(ItemStack.EMPTY);
                                        var26 = true;
                                        return;
                                    } else if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    } else {
                                        var10.getItemStack().shrink(1);
                                        var26 = true;
                                        return;
                                    }
                                }

                                var10.setItemStack(var13.copy());
                                var12 = var10.getItemStack();
                                if (llIIIlIlllII(var5)) {
                                    var12.setCount(var12.getMaxStackSize());
                                    var26 = true;
                                    return;
                                }
                            }
                        } else {
                            if (llIIIlIlllll(23114, 6651)) {
                                throw null;
                            }

                            if (llIIIllIIllI(this.inventorySlots)) {
                                if (llIIIllIIIlI(var1)) {
                                    var15 = ItemStack.EMPTY;
                                    var10001 = true;
                                } else {
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var15 = this.inventorySlots.getSlot(var1.slotNumber).getStack();
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                var6 = var15;
                                var17 = this.inventorySlots;
                                if (llIIIllIIIlI(var1)) {
                                    var16 = var2;
                                    var10002 = var3;
                                    var10003 = true;
                                } else {
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    var16 = var1.slotNumber;
                                    var10002 = var3;
                                }

                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                var17.slotClick(var16, var10002, var4, this.mc.player);
                                var20 = Container.getDragEvent(var3);
                                if (llIIIlIlllll(23114, 6651)) {
                                    throw null;
                                }

                                if (llIIIlIllIIl(var20, 2)) {
                                    int var7;
                                    var20 = var7 = 0;

                                    while (true) {
                                        if (llIIIlIlllll(23114, 6651)) {
                                            throw null;
                                        }

                                        if (!llIIIllIIlIl(var20, 9)) {
                                            break;
                                        }

                                        this.mc.playerController.sendSlotPacket(this.inventorySlots.getSlot(45 + var7).getStack(), 36 + var7++);
                                        var20 = var7;
                                        var10001 = true;
                                    }
                                } else {
                                    if (llIIIlIlllll(23114, 6651)) {
                                        throw null;
                                    }

                                    if (llIIIllIIllI(var1)) {
                                        var12 = this.inventorySlots.getSlot(var1.slotNumber).getStack();
                                        this.mc.playerController.sendSlotPacket(var12, var1.slotNumber - this.inventorySlots.inventorySlots.size() + 9 + 36);
                                        int var8 = 45 + var3;
                                        Class10 var23;
                                        if (llIIIllIIlII(var4, ClickType.SWAP)) {
                                            var23 = this;
                                            this.mc.playerController.sendSlotPacket(var6, var8 - this.inventorySlots.inventorySlots.size() + 9 + 36);
                                            var10001 = true;
                                        } else {
                                            if (llIIIlIlllll(23114, 6651)) {
                                                throw null;
                                            }

                                            if (llIIIllIIlII(var4, ClickType.THROW) && llIIIllIIlll(var6.isEmpty())) {
                                                var15 = var9 = var6.copy();
                                                if (llIIIllIIlll(var3)) {
                                                    var16 = 1;
                                                    var19 = true;
                                                } else {
                                                    if (llIIIlIlllll(23114, 6651)) {
                                                        throw null;
                                                    }

                                                    var16 = var9.getMaxStackSize();
                                                }

                                                if (llIIIlIlllll(23114, 6651)) {
                                                    throw null;
                                                }

                                                var15.setCount(var16);
                                                this.mc.player.dropItem(var9, true);
                                                this.mc.playerController.sendPacketDropItem(var9);
                                            }

                                            if (llIIIlIlllll(23114, 6651)) {
                                                throw null;
                                            }

                                            var23 = this;
                                        }

                                        if (llIIIlIlllll(23114, 6651)) {
                                            throw null;
                                        }

                                        var23.mc.player.inventoryContainer.detectAndSendChanges();
                                    }
                                }
                            }
                        }
                    }
                }

                if (llIIIlIlllll(23114, 6651)) {
                    throw null;
                } else {
                    var26 = true;
                }
            }
        }
    }

    public void updateActivePotionEffects() {
        int var1 = this.guiLeft;
        super.updateActivePotionEffects();
        if (llIIIlIlllll(29013, 5131)) {
            throw null;
        } else {
            if (llIIIllIIllI(this.) && llIIIlllIIlI(this.guiLeft, var1)) {
                this.                                                                                     .
                x = this.guiLeft + 82;
            }

            if (llIIIlIlllll(29013, 5131)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (llIIIllIIIlI(CreativeTabs.CREATIVE_TAB_ARRAY[                                                                                    ]))
        {
            return false;
        } else if (llIIIlIlllll(68855, 7759)) {
            throw null;
        } else if (llIIIlllIIlI(, CreativeTabs.INVENTORY.getIndex()) && llIIIlIlllII(CreativeTabs.CREATIVE_TAB_ARRAY[].hasScrollbar()) && llIIIlIlllII(((Class3) this.inventorySlots).canScroll())) {
            return true;
        } else if (llIIIlIlllll(68855, 7759)) {
            throw null;
        } else {
            return false;
        }
    }

    public boolean renderCreativeInventoryHoveringText(CreativeTabs var1, int var2, int var3) {
        int var4 = var1.getColumn();
        int var5 = 28 * var4;
        byte var6 = 0;
        CreativeTabs var10000;
        boolean var10001;
        if (llIIIlIlllII(var1.isAlignedRight())) {
            var10000 = var1;
            var5 = this.xSize - 28 * (6 - var4) + 2;
            var10001 = true;
        } else {
            if (llIIIlIlllll(72424, 4401)) {
                throw null;
            }

            if (llIIIlllIIIl(var4)) {
                var5 += var4;
            }

            if (llIIIlIlllll(72424, 4401)) {
                throw null;
            }

            var10000 = var1;
        }

        if (llIIIlIlllll(72424, 4401)) {
            throw null;
        } else {
            int var7;
            Class10 var8;
            if (llIIIlIlllII(var10000.isOnTopRow())) {
                var7 = var6 - 32;
                var8 = this;
                var10001 = true;
            } else {
                if (llIIIlIlllll(72424, 4401)) {
                    throw null;
                }

                var7 = var6 + this.ySize;
                var8 = this;
            }

            if (llIIIlIlllll(72424, 4401)) {
                throw null;
            } else if (llIIIlIlllII(var8.isPointInRegion(var5 + 3, var7 + 3, 23, 27, var2, var3))) {
                String var9 = I18n.format(var1.getTranslationKey(), new Object[0]);
                if (llIIIlIlllll(72424, 4401)) {
                    throw null;
                } else {
                    this.drawHoveringText(var9, var2, var3);
                    return true;
                }
            } else if (llIIIlIlllll(72424, 4401)) {
                throw null;
            } else {
                return false;
            }
        }
    }
}
