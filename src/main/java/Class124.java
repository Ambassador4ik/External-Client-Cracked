import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Chat;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import org.lwjgl.opengl.GL11;

public class Class124 extends GuiIngame {
    private static int 3532=5988;
    private static int 82103=-18834;
    public static boolean                                                                                        =true;
    private static int 67663=-26950;
    private static int 2345=3202;
    private static int 237=7306;
    private static int 5648=14336;
    private static int 37346=-25731;
    private static int 84008=-20576;
    private static int 2401=11402;
    private static int 70326=-6063;
    public static boolean                                                                                                =true;
    public static boolean                                                                                                     =true;
    private static int 809=2894;
    private static int 19246=-27044;
    private static int 71639=-632;
    private static int 5365=1556;
    private static int 7434=15029;
    private static int 83277=-7033;
    private static int 113=21080;
    public static boolean                                                                                             =true;
    private static int 5341=16635;
    private static int 1580=2921;
    public Class99;
    private static int 72461=-14228;
    private static int 1695=21294;
    private static int 83134=-22275;
    private static int 69169=-24215;
    private static int 1648=31799;
    public static boolean                                                                                    =true;
    private static int 89637=-20634;
    public static int                                                                                                      =39;
    private static int 4851=15541;
    private static int 47033=-15785;
    public static boolean                                                                                               =true;
    private static int 5687=23330;
    private static int 8986=7447;
    private static int 9884=399;
    private static int 83980=-11889;
    private static int 2579=722;
    private static int 76459=-26886;
    private static int 7871=14874;
    public static boolean                                                                                         =true;
    private static int 61811=-13315;
    private static int 72838=-17128;
    private static int 4293=8905;
    private static int 8300=22853;
    private static int 94925=-27106;
    private Class48;
    private static int 848=20173;
    private static int 52380=-30261;
    private static int 73932=-3964;
    private RenderGameOverlayEvent;
    private static int 19313=-32363;
    private static final int                                                                                           =16777215;
    private static int 34950=-4293;
    private static int 87058=-13538;
    private static int 2762=20275;
    public Class11;
    public static boolean                                                                                                    =true;
    private static int 861=23087;
    private static int 85318=-15600;
    private ScaledResolution;
    private static int 7349=1118;
    public static boolean                                                                                       =true;
    private static int 30442=-10029;
    public static boolean                                                                              =true;
    private static int 867=13585;
    public static boolean                                                                                      =true;
    public static boolean                                                                                            =true;
    private FontRenderer;
    public static boolean                                                                                     =true;
    private static int 3326=23953;
    private static int 62844=-15341;
    private static int 11401=-7343;
    private static int 974=7713;
    private static int 9453=28888;
    private static int 1568=4714;
    private static int 5459=4293;
    private static int 51160=-4490;
    private static int 95123=-28213;
    public static int                                                                                          =39;
    private static int 6572=12275;
    private static int 3235=5827;
    private static int 59979=-10057;
    private static int 62579=-4814;
    private static int 96924=-31477;
    public static boolean                                                                                                       =true;
    private static int 96115=-22562;

    static {
        boolean var10000 = true;
    }

    public Class124(Minecraft var1) {
        super(var1);
        if (llllIlIlIIlI(83134, 848)) {
            throw null;
        } else {
            this. = null;
            this. = null;
            Class48 var10003 = new Class48(this, var1, (Class20) null);
            if (llllIlIlIIlI(83134, 848)) {
                throw null;
            } else {
                this. = var10003;
                Class171 var10001 = Class133. (54);
                if (llllIlIlIIlI(83134, 848)) {
                    throw null;
                } else {
                    this. = (Class99) var10001;
                    var10001 = Class133. (96);
                    if (llllIlIlIIlI(83134, 848)) {
                        throw null;
                    } else {
                        this. = (Class11) var10001;
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llllIlIllIlI(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llllIlIlIlII(int var0) {
        return var0 > 0;
    }

    private static boolean llllIlIlIIll(int var0) {
        return var0 != 0;
    }

    private static boolean llllIllIIlII(Object var0) {
        return var0 == null;
    }

    private static boolean llllIllIIIII(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llllIlIlIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIlIlIllI(int var0) {
        return var0 == 0;
    }

    private static boolean llllIlIlIlll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llllIlIllIII(int var0) {
        return var0 <= 0;
    }

    private static boolean llllIlIllIll(Object var0) {
        return var0 != null;
    }

    private static boolean llllIlIlllll(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llllIlIllIIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llllIllIIIIl(int var0) {
        return var0 >= 0;
    }

    private static boolean llllIllIIIlI(Object var0, Object var1) {
        return var0 == var1;
    }

    public void renderPortal(ScaledResolution var1, float var2) {
        byte var10000 = this. (ElementType.PORTAL);
        if (llllIlIlIIlI(96924, 3235)) {
            throw null;
        } else {
            boolean var3;
            if (llllIlIlIIll(var10000)) {
                var3 = true;
            } else if (llllIlIlIIlI(96924, 3235)) {
                throw null;
            } else {
                float var4;
                if (llllIlIlIlII((var4 = (var2 = this.mc.player.prevTimeInPortal + (this.mc.player.timeInPortal - this.mc.player.prevTimeInPortal) * var2) - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))) {
                    this.renderPortal(var2, var1);
                }

                if (llllIlIlIIlI(96924, 3235)) {
                    throw null;
                } else {
                    this. (ElementType.PORTAL);
                    if (llllIlIlIIlI(96924, 3235)) {
                        throw null;
                    } else {
                        var3 = true;
                    }
                }
            }
        }
    }

    public void renderAir(int var1, int var2) {
        byte var10000 = this. (ElementType.AIR);
        if (llllIlIlIIlI(83277, 9884)) {
            throw null;
        } else {
            boolean var9;
            if (llllIlIlIIll(var10000)) {
                var9 = true;
            } else if (llllIlIlIIlI(83277, 9884)) {
                throw null;
            } else {
                Profiler var10001 = this.mc.profiler;
                String var10002 = Class60. ("yp)");
                if (llllIlIlIIlI(83277, 9884)) {
                    throw null;
                } else {
                    var10001.startSection(var10002);
                    EntityPlayer var3 = (EntityPlayer) this.mc.getRenderViewEntity();
                    GlStateManager.enableBlend();
                    if (llllIlIlIIlI(83277, 9884)) {
                        throw null;
                    } else {
                        var1 = var1 / 2 + 91;
                        var2 -=;
                        if (llllIlIlIIll(var3.isInsideOfMaterial(Material.WATER))) {
                            int var6;
                            int var7 = MathHelper.ceil((double) ((var6 = var3.getAir()) - 2) * 10.0D / 300.0D);
                            if (llllIlIlIIlI(83277, 9884)) {
                                throw null;
                            }

                            int var4 = var7;
                            var7 = MathHelper.ceil((double) var6 * 10.0D / 300.0D);
                            if (llllIlIlIIlI(83277, 9884)) {
                                throw null;
                            }

                            var6 = var7 - var4;
                            int var5;
                            var7 = var5 = 0;

                            while (true) {
                                if (llllIlIlIIlI(83277, 9884)) {
                                    throw null;
                                }

                                if (!llllIlIlIlll(var7, var4 + var6)) {
                                    if (llllIlIlIIlI(83277, 9884)) {
                                        throw null;
                                    }

                                                                                                                    +=
                                    10;
                                    break;
                                }

                                int var8 = var1 - var5 * 8 - 9;
                                byte var10003;
                                if (llllIlIlIlll(var5, var4)) {
                                    var10003 = 16;
                                    boolean var10004 = true;
                                } else {
                                    if (llllIlIlIIlI(83277, 9884)) {
                                        throw null;
                                    }

                                    var10003 = 25;
                                }

                                if (llllIlIlIIlI(83277, 9884)) {
                                    throw null;
                                }

                                ++var5;
                                this.drawTexturedModalRect(var8, var2, var10003, 18, 9, 9);
                                var7 = var5;
                                boolean var10 = true;
                            }
                        }

                        if (llllIlIlIIlI(83277, 9884)) {
                            throw null;
                        } else {
                            GlStateManager.disableBlend();
                            if (llllIlIlIIlI(83277, 9884)) {
                                throw null;
                            } else {
                                this.mc.profiler.endSection();
                                this. (ElementType.AIR);
                                if (llllIlIlIIlI(83277, 9884)) {
                                    throw null;
                                } else {
                                    var9 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void renderPotionIcons(ScaledResolution var1) {
        byte var10000 = this. (ElementType.POTION_ICONS);
        if (llllIlIlIIlI(47033, 4851)) {
            throw null;
        } else {
            boolean var2;
            if (llllIlIlIIll(var10000)) {
                var2 = true;
            } else if (llllIlIlIIlI(47033, 4851)) {
                throw null;
            } else {
                super.renderPotionEffects(var1);
                if (llllIlIlIIlI(47033, 4851)) {
                    throw null;
                } else {
                    this. (ElementType.POTION_ICONS);
                    if (llllIlIlIIlI(47033, 4851)) {
                        throw null;
                    } else {
                        var2 = true;
                    }
                }
            }
        }
    }

    public void renderToolHighlight(ScaledResolution var1) {
        boolean var10000;
        if (llllIlIlIIll(this.mc.gameSettings.heldItemTooltips) && llllIlIlIllI(this.mc.playerController.isSpectator())) {
            Profiler var10001 = this.mc.profiler;
            String var10002 = Class60. ("cy{{[\u007fw\u007fs\u007f{\u007f/");
            if (llllIlIlIIlI(87058, 1695)) {
                throw null;
            } else {
                var10001.startSection(var10002);
                if (llllIlIlIlII(this.remainingHighlightTicks) && llllIlIlIllI(this.highlightingItemStack.isEmpty())) {
                    String var2 = this.highlightingItemStack.getDisplayName();
                    if (llllIlIlIIll(this.highlightingItemStack.hasDisplayName())) {
                        StringBuilder var7 = new StringBuilder();
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        var2 = String.valueOf(var7.append(TextFormatting.ITALIC).append(var2));
                    }

                    if (llllIlIlIIlI(87058, 1695)) {
                        throw null;
                    }

                    var2 = this.highlightingItemStack.getItem().getHighlightTip(this.highlightingItemStack, var2);
                    int var3;
                    if (llllIlIlllll(var3 = (int) ((float) this.remainingHighlightTicks * 256.0F / 10.0F), 255)) {
                        var3 = 255;
                    }

                    if (llllIlIlIIlI(87058, 1695)) {
                        throw null;
                    }

                    if (llllIlIlIlII(var3)) {
                        int var4 = var1.getScaledHeight() - 59;
                        if (llllIlIlIllI(this.mc.playerController.shouldDrawHUD())) {
                            var4 += 14;
                        }

                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        GlStateManager.pushMatrix();
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        GlStateManager.enableBlend();
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        FontRenderer var5;
                        int var6;
                        if (llllIlIllIll(var5 = this.highlightingItemStack.getItem().getFontRenderer(this.highlightingItemStack))) {
                            var6 = (var1.getScaledWidth() - var5.getStringWidth(var2)) / 2;
                            var5.drawStringWithShadow(var2, (float) var6, (float) var4, 16777215 | var3 << 24);
                            var10000 = true;
                        } else {
                            if (llllIlIlIIlI(87058, 1695)) {
                                throw null;
                            }

                            var6 = (var1.getScaledWidth() - this..getStringWidth(var2)) /2;
                            this.                                                                                                 .
                            drawStringWithShadow(var2, (float) var6, (float) var4, 16777215 | var3 << 24);
                        }

                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        GlStateManager.disableBlend();
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }

                        GlStateManager.popMatrix();
                        if (llllIlIlIIlI(87058, 1695)) {
                            throw null;
                        }
                    }
                }

                if (llllIlIlIIlI(87058, 1695)) {
                    throw null;
                } else {
                    this.mc.profiler.endSection();
                    var10000 = true;
                }
            }
        } else if (llllIlIlIIlI(87058, 1695)) {
            throw null;
        } else {
            if (llllIlIlIIll(this.mc.player.isSpectator())) {
                this.spectatorGui.renderSelectedItem(var1);
            }

            if (llllIlIlIIlI(87058, 1695)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void renderHotbar(ScaledResolution var1, float var2) {
        byte var10000 = this. (ElementType.HOTBAR);
        if (llllIlIlIIlI(52380, 2401)) {
            throw null;
        } else {
            boolean var4;
            if (llllIlIlIIll(var10000)) {
                var4 = true;
            } else if (llllIlIlIIlI(52380, 2401)) {
                throw null;
            } else {
                Class124 var3;
                if (llllIlIlIIll(this.mc.playerController.isSpectator())) {
                    var3 = this;
                    this.spectatorGui.renderTooltip(var1, var2);
                    boolean var10001 = true;
                } else {
                    if (llllIlIlIIlI(52380, 2401)) {
                        throw null;
                    }

                    var3 = this;
                    super.renderHotbar(var1, var2);
                    if (llllIlIlIIlI(52380, 2401)) {
                        throw null;
                    }
                }

                if (llllIlIlIIlI(52380, 2401)) {
                    throw null;
                } else {
                    var3. (ElementType.HOTBAR);
                    if (llllIlIlIIlI(52380, 2401)) {
                        throw null;
                    } else {
                        var4 = true;
                    }
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ScaledResolution var1, float var2) {
        byte var10000 = this. (ElementType.HELMET);
        if (llllIlIlIIlI(62579, 861)) {
            throw null;
        } else {
            boolean var8;
            if (llllIlIlIIll(var10000)) {
                var8 = true;
            } else if (llllIlIlIIlI(62579, 861)) {
                throw null;
            } else {
                Class124 var6;
                label76:
                {
                    ItemStack var3 = this.mc.player.inventory.armorItemInSlot(3);
                    if (llllIlIlIllI(this.mc.gameSettings.thirdPersonView) && llllIlIlIllI(var3.isEmpty())) {
                        Item var4;
                        Item var5 = var4 = var3.getItem();
                        Item var10001 = Item.getItemFromBlock(Blocks.PUMPKIN);
                        if (llllIlIlIIlI(62579, 861)) {
                            throw null;
                        }

                        if (llllIllIIIlI(var5, var10001) && (!llllIlIlIIll(this.. ()) ||llllIlIlIllI(this..                                                                                                   .
                        ()))){
                            if (llllIlIlIIlI(62579, 861)) {
                                throw null;
                            }

                            var6 = this;
                            this.renderPumpkinOverlay(var1);
                            boolean var7 = true;
                            break label76;
                        }

                        if (llllIlIlIIlI(62579, 861)) {
                            throw null;
                        }

                        var4.renderHelmetOverlay(var3, this.mc.player, var1, var2);
                    }

                    if (llllIlIlIIlI(62579, 861)) {
                        throw null;
                    }

                    var6 = this;
                }

                if (llllIlIlIIlI(62579, 861)) {
                    throw null;
                } else {
                    var6. (ElementType.HELMET);
                    if (llllIlIlIIlI(62579, 861)) {
                        throw null;
                    } else {
                        var8 = true;
                    }
                }
            }
        }
    }

    public ScaledResolution getResolution() {
        return this.;
    }

    public void renderSubtitles(ScaledResolution var1) {
        byte var10000 = this. (ElementType.SUBTITLES);
        if (llllIlIlIIlI(89637, 7349)) {
            throw null;
        } else {
            boolean var2;
            if (llllIlIlIIll(var10000)) {
                var2 = true;
            } else if (llllIlIlIIlI(89637, 7349)) {
                throw null;
            } else {
                this.overlaySubtitle.renderSubtitles(this.);
                this. (ElementType.SUBTITLES);
                if (llllIlIlIIlI(89637, 7349)) {
                    throw null;
                } else {
                    var2 = true;
                }
            }
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ElementType var1) {
        EventBus var10000 = MinecraftForge.EVENT_BUS;
        Pre var10001 = new Pre(this., var1);
        if (llllIlIlIIlI(96115, 5341)) {
            throw null;
        } else {
            return var10000.post(var10001);
        }
    }

    public void renderGameOverlay(float var1) {
        ScaledResolution var10005 = new ScaledResolution(this.mc);
        if (llllIlIlIIlI(71639, 7871)) {
            throw null;
        } else {
            this. = var10005;
            RenderGameOverlayEvent var10004 = new RenderGameOverlayEvent(var1, this.);
            if (llllIlIlIIlI(71639, 7871)) {
                throw null;
            } else {
                this. = var10004;
                int var2 = this.                                                                                            .
                getScaledWidth();
                int var3 = this.                                                                                            .
                getScaledHeight();
                                                                                               =
                this.mc.player.getRidingEntity() instanceof EntityLivingBase;
                boolean var10000;
                boolean var10001;
                if (llllIllIIlII(this.mc.player.getRidingEntity())) {
                    var10000 = true;
                    var10001 = true;
                } else {
                    if (llllIlIlIIlI(71639, 7871)) {
                        throw null;
                    }

                    var10000 = false;
                }

                if (llllIlIlIIlI(71639, 7871)) {
                    throw null;
                } else {
                                                                                                    =var10000;
                                                                                                                     =
                    this.mc.player.isRidingHorse();
                                                                                                        =39;
                                                                                                                    =39;
                    byte var9 = this. (ElementType.ALL);
                    if (llllIlIlIIlI(71639, 7871)) {
                        throw null;
                    } else if (llllIlIlIIll(var9)) {
                        var10000 = true;
                    } else if (llllIlIlIIlI(71639, 7871)) {
                        throw null;
                    } else {
                        this. = this.mc.fontRenderer;
                        this.mc.entityRenderer.setupOverlayRendering();
                        GlStateManager.enableBlend();
                        if (llllIlIlIIlI(71639, 7871)) {
                            throw null;
                        } else {
                            label250:
                            {
                                if (llllIlIlIIll()) {
                                    var9 = Minecraft.isFancyGraphicsEnabled();
                                    if (llllIlIlIIlI(71639, 7871)) {
                                        throw null;
                                    }

                                    if (llllIlIlIIll(var9)) {
                                        this.renderVignette(this.mc.player.getBrightness(), this.);
                                        var10000 = true;
                                        break label250;
                                    }
                                }

                                if (llllIlIlIIlI(71639, 7871)) {
                                    throw null;
                                }

                                GlStateManager.enableDepth();
                                if (llllIlIlIIlI(71639, 7871)) {
                                    throw null;
                                }

                                GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                if (llllIlIlIIlI(71639, 7871)) {
                                    throw null;
                                }
                            }

                            if (llllIlIlIIlI(71639, 7871)) {
                                throw null;
                            } else {
                                if (llllIlIlIIll()) {
                                    this. (this., var1);
                                    if (llllIlIlIIlI(71639, 7871)) {
                                        throw null;
                                    }
                                }

                                if (llllIlIlIIlI(71639, 7871)) {
                                    throw null;
                                } else {
                                    if (llllIlIlIIll() && llllIlIlIllI(this.mc.player.isPotionActive(MobEffects.NAUSEA))) {
                                        this.renderPortal(this., var1);
                                    }

                                    if (llllIlIlIIlI(71639, 7871)) {
                                        throw null;
                                    } else {
                                        if (llllIlIlIIll()) {
                                            this.renderHotbar(this., var1);
                                        }

                                        if (llllIlIlIIlI(71639, 7871)) {
                                            throw null;
                                        } else {
                                            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                            if (llllIlIlIIlI(71639, 7871)) {
                                                throw null;
                                            } else {
                                                this.zLevel = -90.0F;
                                                this.rand.setSeed((long) (this.updateCounter * 312871));
                                                if (llllIlIlIIll()) {
                                                    this.renderCrosshairs(var1);
                                                }

                                                if (llllIlIlIIlI(71639, 7871)) {
                                                    throw null;
                                                } else {
                                                    if (llllIlIlIIll()) {
                                                        this.renderBossHealth();
                                                    }

                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                                        if (llllIlIlIIlI(71639, 7871)) {
                                                            throw null;
                                                        } else {
                                                            if (llllIlIlIIll(this.mc.playerController.shouldDrawHUD()) && llllIlIlIIll(this.mc.getRenderViewEntity() instanceof EntityPlayer)) {
                                                                if (llllIlIlIIll()) {
                                                                    this.renderHealth(var2, var3);
                                                                }

                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                    throw null;
                                                                }

                                                                if (llllIlIlIIll()) {
                                                                    this.renderArmor(var2, var3);
                                                                }

                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                    throw null;
                                                                }

                                                                if (llllIlIlIIll()) {
                                                                    this.renderFood(var2, var3);
                                                                }

                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                    throw null;
                                                                }

                                                                if (llllIlIlIIll()) {
                                                                    this.renderHealthMount(var2, var3);
                                                                }

                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                    throw null;
                                                                }

                                                                if (llllIlIlIIll()) {
                                                                    this.renderAir(var2, var3);
                                                                }
                                                            }

                                                            if (llllIlIlIIlI(71639, 7871)) {
                                                                throw null;
                                                            } else {
                                                                this.renderSleepFade(var2, var3);
                                                                Class124 var10;
                                                                if (llllIlIlIIll()) {
                                                                    var10 = this;
                                                                    this.renderJumpBar(var2, var3);
                                                                    var10001 = true;
                                                                } else {
                                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                                        throw null;
                                                                    }

                                                                    if (llllIlIlIIll()) {
                                                                        this.renderExperience(var2, var3);
                                                                    }

                                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                                        throw null;
                                                                    }

                                                                    var10 = this;
                                                                }

                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                    throw null;
                                                                } else {
                                                                    var10.renderToolHighlight(this.);
                                                                    this.renderHUDText(var2, var3);
                                                                    this.renderFPSGraph();
                                                                    this.renderPotionIcons(this.);
                                                                    this.renderRecordOverlay(var2, var3, var1);
                                                                    this.renderSubtitles(this.);
                                                                    this.renderTitle(var2, var3, var1);
                                                                    Scoreboard var7 = this.mc.world.getScoreboard();
                                                                    ScoreObjective var4 = null;
                                                                    ScorePlayerTeam var5;
                                                                    int var6;
                                                                    if (llllIlIllIll(var5 = var7.getPlayersTeam(this.mc.player.getName())) && llllIllIIIIl(var6 = var5.getColor().getColorIndex())) {
                                                                        var4 = var7.getObjectiveInDisplaySlot(3 + var6);
                                                                    }

                                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                                        throw null;
                                                                    } else {
                                                                        ScoreObjective var11;
                                                                        if (llllIlIllIll(var4)) {
                                                                            var11 = var4;
                                                                            var10001 = true;
                                                                        } else {
                                                                            if (llllIlIlIIlI(71639, 7871)) {
                                                                                throw null;
                                                                            }

                                                                            var11 = var7.getObjectiveInDisplaySlot(1);
                                                                        }

                                                                        if (llllIlIlIIlI(71639, 7871)) {
                                                                            throw null;
                                                                        } else {
                                                                            ScoreObjective var8 = var11;
                                                                            if (llllIlIlIIll() && llllIlIllIll(var8) && llllIlIlIllI(this..
                                                                            ())){
                                                                                this.renderScoreboard(var8, this.);
                                                                            }

                                                                            if (llllIlIlIIlI(71639, 7871)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.enableBlend();
                                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                                                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.disableAlpha();
                                                                                        if (llllIlIlIIlI(71639, 7871)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            this.renderChat(var2, var3);
                                                                                            this.renderPlayerList(var2, var3);
                                                                                            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                                                                            if (llllIlIlIIlI(71639, 7871)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GlStateManager.disableLighting();
                                                                                                if (llllIlIlIIlI(71639, 7871)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GlStateManager.enableAlpha();
                                                                                                    if (llllIlIlIIlI(71639, 7871)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        this.
                                                                                                        (ElementType.ALL);
                                                                                                        if (llllIlIlIIlI(71639, 7871)) {
                                                                                                            throw null;
                                                                                                        } else {
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

    public void renderChat(int var1, int var2) {
        Profiler var10000 = this.mc.profiler;
        String var10001 = Class60. ("xry/");
        if (llllIlIlIIlI(51160, 5687)) {
            throw null;
        } else {
            var10000.startSection(var10001);
            Chat var4 = new Chat(this., 0, var2 - 48);
            if (llllIlIlIIlI(51160, 5687)) {
                throw null;
            } else {
                Chat var3 = var4;
                boolean var5;
                if (llllIlIlIIll(MinecraftForge.EVENT_BUS.post(var3))) {
                    var5 = true;
                } else if (llllIlIlIIlI(51160, 5687)) {
                    throw null;
                } else {
                    GlStateManager.pushMatrix();
                    if (llllIlIlIIlI(51160, 5687)) {
                        throw null;
                    } else {
                        GlStateManager.translate((float) var3.getPosX(), (float) var3.getPosY(), 0.0F);
                        if (llllIlIlIIlI(51160, 5687)) {
                            throw null;
                        } else {
                            this.persistantChatGUI.drawChat(this.updateCounter);
                            GlStateManager.popMatrix();
                            if (llllIlIlIIlI(51160, 5687)) {
                                throw null;
                            } else {
                                this. (ElementType.CHAT);
                                if (llllIlIlIIlI(51160, 5687)) {
                                    throw null;
                                } else {
                                    this.mc.profiler.endSection();
                                    var5 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void renderSleepFade(int var1, int var2) {
        if (llllIlIlIlII(this.mc.player.getSleepTimer())) {
            Profiler var10001 = this.mc.profiler;
            String var10002 = Class60. ("lryz+");
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            var10001.startSection(var10002);
            GlStateManager.disableDepth();
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            GlStateManager.disableAlpha();
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            int var3;
            float var4;
            float var5;
            if (llllIlIlIlII((var5 = (var4 = (float) (var3 = this.mc.player.getSleepTimer()) / 100.0F) - 1.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1))) {
                var4 = 1.0F - (float) (var3 - 100) / 10.0F;
            }

            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            var3 = (int) (220.0F * var4) << 24 | 1052704;
            drawRect(0, 0, var1, var2, var3);
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            GlStateManager.enableAlpha();
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            GlStateManager.enableDepth();
            if (llllIlIlIIlI(11401, 7434)) {
                throw null;
            }

            this.mc.profiler.endSection();
        }

        if (llllIlIlIIlI(11401, 7434)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void renderExperience(int var1, int var2) {
        this. (ICONS);
        if (llllIlIlIIlI(95123, 3532)) {
            throw null;
        } else {
            byte var10000 = this. (ElementType.EXPERIENCE);
            if (llllIlIlIIlI(95123, 3532)) {
                throw null;
            } else {
                boolean var12;
                if (llllIlIlIIll(var10000)) {
                    var12 = true;
                } else if (llllIlIlIIlI(95123, 3532)) {
                    throw null;
                } else {
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    if (llllIlIlIIlI(95123, 3532)) {
                        throw null;
                    } else {
                        GlStateManager.disableBlend();
                        if (llllIlIlIIlI(95123, 3532)) {
                            throw null;
                        } else {
                            if (llllIlIlIIll(this.mc.playerController.gameIsSurvivalOrAdventure())) {
                                Profiler var10001 = this.mc.profiler;
                                String var10002 = Class60. ("\u007fciX\u007f)");
                                if (llllIlIlIIlI(95123, 3532)) {
                                    throw null;
                                }

                                var10001.startSection(var10002);
                                int var3 = this.mc.player.xpBarCap();
                                int var4 = var1 / 2 - 91;
                                int var5;
                                if (llllIlIlIlII(var3)) {
                                    short var7 = 182;
                                    var5 = (int) (this.mc.player.experience * (float) (var7 + 1));
                                    int var6 = var2 - 32 + 3;
                                    this.drawTexturedModalRect(var4, var6, 0, 64, var7, 5);
                                    if (llllIlIlIlII(var5)) {
                                        this.drawTexturedModalRect(var4, var6, 0, 69, var5, 5);
                                    }
                                }

                                if (llllIlIlIIlI(95123, 3532)) {
                                    throw null;
                                }

                                this.mc.profiler.endSection();
                                if (llllIlIlIIll(this.mc.playerController.gameIsSurvivalOrAdventure()) && llllIlIlIlII(this.mc.player.experienceLevel)) {
                                    var10001 = this.mc.profiler;
                                    var10002 = Class60. ("~bhWzly7");
                                    if (llllIlIlIIlI(95123, 3532)) {
                                        throw null;
                                    }

                                    var10001.startSection(var10002);
                                    boolean var8 = false;
                                    int var10;
                                    if (llllIlIlIIll(0)) {
                                        var10 = 16777215;
                                        boolean var13 = true;
                                    } else {
                                        if (llllIlIlIIlI(95123, 3532)) {
                                            throw null;
                                        }

                                        var10 = 8453920;
                                    }

                                    if (llllIlIlIIlI(95123, 3532)) {
                                        throw null;
                                    }

                                    var5 = var10;
                                    StringBuilder var11 = new StringBuilder();
                                    if (llllIlIlIIlI(95123, 3532)) {
                                        throw null;
                                    }

                                    String var9 = String.valueOf(var11.insert(0, "").append(this.mc.player.experienceLevel));
                                    var1 = (var1 - this..getStringWidth(var9)) /2;
                                    var2 = var2 - 31 - 4;
                                    this.                                                                                                 .
                                    drawString(var9, var1 + 1, var2, 0);
                                    this.                                                                                                 .
                                    drawString(var9, var1 - 1, var2, 0);
                                    this.                                                                                                 .
                                    drawString(var9, var1, var2 + 1, 0);
                                    this.                                                                                                 .
                                    drawString(var9, var1, var2 - 1, 0);
                                    this.                                                                                                 .
                                    drawString(var9, var1, var2, var5);
                                    this.mc.profiler.endSection();
                                }
                            }

                            if (llllIlIlIIlI(95123, 3532)) {
                                throw null;
                            } else {
                                GlStateManager.enableBlend();
                                if (llllIlIlIIlI(95123, 3532)) {
                                    throw null;
                                } else {
                                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                    if (llllIlIlIIlI(95123, 3532)) {
                                        throw null;
                                    } else {
                                        this. (ElementType.EXPERIENCE);
                                        if (llllIlIlIIlI(95123, 3532)) {
                                            throw null;
                                        } else {
                                            var12 = true;
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

    public void renderVignette(float var1, ScaledResolution var2) {
        byte var10000 = this. (ElementType.VIGNETTE);
        if (llllIlIlIIlI(19246, 113)) {
            throw null;
        } else {
            boolean var3;
            if (llllIlIlIIll(var10000)) {
                GlStateManager.enableDepth();
                if (llllIlIlIIlI(19246, 113)) {
                    throw null;
                } else {
                    GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                    if (llllIlIlIIlI(19246, 113)) {
                        throw null;
                    } else {
                        var3 = true;
                    }
                }
            } else if (llllIlIlIIlI(19246, 113)) {
                throw null;
            } else {
                super.renderVignette(var1, var2);
                if (llllIlIlIIlI(19246, 113)) {
                    throw null;
                } else {
                    this. (ElementType.VIGNETTE);
                    if (llllIlIlIIlI(19246, 113)) {
                        throw null;
                    } else {
                        var3 = true;
                    }
                }
            }
        }
    }

    public void renderPlayerList(int var1, int var2) {
        ScoreObjective var4 = this.mc.world.getScoreboard().getObjectiveInDisplaySlot(0);
        NetHandlerPlayClient var3 = this.mc.player.connection;
        boolean var10000;
        if (llllIlIlIIll(this.mc.gameSettings.keyBindPlayerList.isKeyDown()) && (!llllIlIlIIll(this.mc.isIntegratedServerRunning()) || !llllIlIllIlI(var3.getPlayerInfoMap().size(), 1) || llllIlIllIll(var4))) {
            if (llllIlIlIIlI(61811, 5459)) {
                throw null;
            } else {
                this.overlayPlayerList.updatePlayerList(true);
                byte var5 = this. (ElementType.PLAYER_LIST);
                if (llllIlIlIIlI(61811, 5459)) {
                    throw null;
                } else if (llllIlIlIIll(var5)) {
                    var10000 = true;
                } else if (llllIlIlIIlI(61811, 5459)) {
                    throw null;
                } else {
                    this.overlayPlayerList.renderPlayerlist(var1, this.mc.world.getScoreboard(), var4);
                    this. (ElementType.PLAYER_LIST);
                    if (llllIlIlIIlI(61811, 5459)) {
                        throw null;
                    } else {
                        var10000 = true;
                    }
                }
            }
        } else if (llllIlIlIIlI(61811, 5459)) {
            throw null;
        } else {
            this.overlayPlayerList.updatePlayerList(false);
            var10000 = true;
        }
    }

    public void renderArmor(int var1, int var2) {
        byte var10000 = this. (ElementType.ARMOR);
        if (llllIlIlIIlI(82103, 8986)) {
            throw null;
        } else {
            boolean var6;
            if (llllIlIlIIll(var10000)) {
                var6 = true;
            } else if (llllIlIlIIlI(82103, 8986)) {
                throw null;
            } else {
                Profiler var10002 = this.mc.profiler;
                String var10003 = Class60. ("~lqp)");
                if (llllIlIlIIlI(82103, 8986)) {
                    throw null;
                } else {
                    var10002.startSection(var10003);
                    GlStateManager.enableBlend();
                    if (llllIlIlIIlI(82103, 8986)) {
                        throw null;
                    } else {
                        var1 = var1 / 2 - 91;
                        var2 -=;
                        int var5 = ForgeHooks.getTotalArmorValue(this.mc.player);
                        if (llllIlIlIIlI(82103, 8986)) {
                            throw null;
                        } else {
                            int var3 = var5;
                            int var4 = 1;

                            boolean var10001;
                            for (var5 = var3; !llllIlIlIIlI(82103, 8986); var10001 = true) {
                                if (!llllIlIlIlII(var5) || !llllIlIlIlll(var4, 20)) {
                                    if (llllIlIlIIlI(82103, 8986)) {
                                        throw null;
                                    } else {
                                                                                                                                   +=
                                        10;
                                        GlStateManager.disableBlend();
                                        if (llllIlIlIIlI(82103, 8986)) {
                                            throw null;
                                        } else {
                                            this.mc.profiler.endSection();
                                            this. (ElementType.ARMOR);
                                            if (llllIlIlIIlI(82103, 8986)) {
                                                throw null;
                                            } else {
                                                var6 = true;
                                                return;
                                            }
                                        }
                                    }
                                }

                                if (llllIlIlIlll(var4, var3)) {
                                    this.drawTexturedModalRect(var1, var2, 34, 9, 9, 9);
                                    var6 = true;
                                } else {
                                    if (llllIlIlIIlI(82103, 8986)) {
                                        throw null;
                                    }

                                    if (llllIlIllIIl(var4, var3)) {
                                        this.drawTexturedModalRect(var1, var2, 25, 9, 9, 9);
                                        var6 = true;
                                    } else {
                                        if (llllIlIlIIlI(82103, 8986)) {
                                            throw null;
                                        }

                                        if (llllIlIlllll(var4, var3)) {
                                            this.drawTexturedModalRect(var1, var2, 16, 9, 9, 9);
                                        }
                                    }
                                }

                                if (llllIlIlIIlI(82103, 8986)) {
                                    throw null;
                                }

                                var1 += 8;
                                var5 = var3;
                                var4 += 2;
                            }

                            throw null;
                        }
                    }
                }
            }
        }
    }

    public void renderHUDText(int var1, int var2) {
        Profiler var10002 = this.mc.profiler;
        String var10003 = Class60. ("}uj|zRi\u007fG\u007fh/");
        if (llllIlIlIIlI(30442, 9453)) {
            throw null;
        } else {
            var10002.startSection(var10003);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            if (llllIlIlIIlI(30442, 9453)) {
                throw null;
            } else {
                ArrayList var10001 = new ArrayList();
                if (llllIlIlIIlI(30442, 9453)) {
                    throw null;
                } else {
                    ArrayList var7 = var10001;
                    var10001 = new ArrayList();
                    if (llllIlIlIIlI(30442, 9453)) {
                        throw null;
                    } else {
                        ArrayList var3;
                        Class124 var10000;
                        boolean var18;
                        label157:
                        {
                            var3 = var10001;
                            if (llllIlIlIIll(this.mc.isDemo())) {
                                long var4;
                                String var14;
                                long var21;
                                if (llllIllIIIIl((var21 = (var4 = this.mc.world.getTotalWorldTime()) - 120500L) == 0L ? 0 : (var21 < 0L ? -1 : 1))) {
                                    var14 = Class60. ("\u007f\u007fut1~yv|_hk~hq?");
                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    }

                                    var14 = I18n.format(var14, new Object[0]);
                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    }

                                    var3.add(var14);
                                    var10000 = this;
                                    var18 = true;
                                    break label157;
                                }

                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                }

                                var14 = Class60. ("~~tu0ixwsr\u007fsx|Asg>");
                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                }

                                Object[] var16 = new Object[1];
                                String var10005 = StringUtils.ticksToElapsedTime((int) (120500L - var4));
                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                }

                                var16[0] = var10005;
                                var14 = I18n.format(var14, var16);
                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                }

                                var3.add(var14);
                            }

                            if (llllIlIlIIlI(30442, 9453)) {
                                throw null;
                            }

                            var10000 = this;
                        }

                        if (llllIlIlIIlI(30442, 9453)) {
                            throw null;
                        } else {
                            if (llllIlIlIIll(var10000.mc.gameSettings.showDebugInfo)) {
                                byte var12 = this. (ElementType.DEBUG);
                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                }

                                if (llllIlIlIllI(var12)) {
                                    List var19 = Class48. (this.);
                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    }

                                    var7.addAll(var19);
                                    List var17 = Class48. (this.);
                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    }

                                    var3.addAll(var17);
                                    this. (ElementType.DEBUG);
                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    }
                                }
                            }

                            if (llllIlIlIIlI(30442, 9453)) {
                                throw null;
                            } else {
                                Text var13 = new Text(this., var7, var3);
                                if (llllIlIlIIlI(30442, 9453)) {
                                    throw null;
                                } else {
                                    Text var10 = var13;
                                    if (llllIlIlIllI(MinecraftForge.EVENT_BUS.post(var10))) {
                                        int var5 = 2;
                                        Iterator var8;
                                        Iterator var15 = var8 = var7.iterator();

                                        label133:
                                        while (true) {
                                            if (llllIlIlIIlI(30442, 9453)) {
                                                throw null;
                                            }

                                            String var11;
                                            if (!llllIlIlIIll(var15.hasNext())) {
                                                if (llllIlIlIIlI(30442, 9453)) {
                                                    throw null;
                                                }

                                                var5 = 2;
                                                var15 = var8 = var3.iterator();

                                                while (!llllIlIlIIlI(30442, 9453)) {
                                                    if (!llllIlIlIIll(var15.hasNext())) {
                                                        break label133;
                                                    }

                                                    if (llllIllIIlII(var11 = (String) var8.next())) {
                                                        var15 = var8;
                                                        var18 = true;
                                                    } else {
                                                        if (llllIlIlIIlI(30442, 9453)) {
                                                            throw null;
                                                        }

                                                        int var9 = this.                                                                                                 .
                                                        getStringWidth(var11);
                                                        int var6;
                                                        drawRect((var6 = var1 - 2 - var9) - 1, var5 - 1, var6 + var9 + 1, var5 + this..FONT_HEIGHT - 1, -1873784752)
                                                        ;
                                                        if (llllIlIlIIlI(30442, 9453)) {
                                                            throw null;
                                                        }

                                                        this.                                                                                                 .
                                                        drawString(var11, var6, var5, 14737632);
                                                        var5 += this.                                                                                                 .
                                                        FONT_HEIGHT;
                                                        var15 = var8;
                                                        var18 = true;
                                                    }
                                                }

                                                throw null;
                                            }

                                            if (llllIllIIlII(var11 = (String) var8.next())) {
                                                var15 = var8;
                                                var18 = true;
                                            } else {
                                                if (llllIlIlIIlI(30442, 9453)) {
                                                    throw null;
                                                }

                                                drawRect(1, var5 - 1, 2 + this..getStringWidth(var11) + 1, var5 + this.                                                                                                 .
                                                FONT_HEIGHT - 1, -1873784752);
                                                if (llllIlIlIIlI(30442, 9453)) {
                                                    throw null;
                                                }

                                                var15 = var8;
                                                this.                                                                                                 .
                                                drawString(var11, 2, var5, 14737632);
                                                var5 += this.                                                                                                 .
                                                FONT_HEIGHT;
                                                var18 = true;
                                            }
                                        }
                                    }

                                    if (llllIlIlIIlI(30442, 9453)) {
                                        throw null;
                                    } else {
                                        this.mc.profiler.endSection();
                                        this. (ElementType.TEXT);
                                        if (llllIlIlIIlI(30442, 9453)) {
                                            throw null;
                                        } else {
                                            boolean var20 = true;
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

    public void renderCrosshairs(float var1) {
        byte var10000 = this. (ElementType.CROSSHAIRS);
        if (llllIlIlIIlI(67663, 974)) {
            throw null;
        } else {
            boolean var2;
            if (llllIlIlIIll(var10000)) {
                var2 = true;
            } else if (llllIlIlIIlI(67663, 974)) {
                throw null;
            } else {
                this. (Gui.ICONS);
                if (llllIlIlIIlI(67663, 974)) {
                    throw null;
                } else {
                    GlStateManager.enableBlend();
                    if (llllIlIlIIlI(67663, 974)) {
                        throw null;
                    } else {
                        super.renderAttackIndicator(var1, this.);
                        if (llllIlIlIIlI(67663, 974)) {
                            throw null;
                        } else {
                            this. (ElementType.CROSSHAIRS);
                            if (llllIlIlIIlI(67663, 974)) {
                                throw null;
                            } else {
                                var2 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void renderHotbarItem(int var1, int var2, float var3, EntityPlayer var4, ItemStack var5) {
        if (llllIlIlIllI(var5.isEmpty())) {
            float var7;
            if (llllIlIlIlII((var7 = (var3 = (float) var5.getAnimationsToGo() - var3) - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1))) {
                GlStateManager.pushMatrix();
                if (llllIlIlIIlI(76459, 6572)) {
                    throw null;
                }

                float var6 = 1.0F + var3 / 5.0F;
                GlStateManager.translate((float) (var1 + 8), (float) (var2 + 12), 0.0F);
                if (llllIlIlIIlI(76459, 6572)) {
                    throw null;
                }

                GlStateManager.scale(1.0F / var6, (var6 + 1.0F) / 2.0F, 1.0F);
                if (llllIlIlIIlI(76459, 6572)) {
                    throw null;
                }

                GlStateManager.translate((float) (-(var1 + 8)), (float) (-(var2 + 12)), 0.0F);
                if (llllIlIlIIlI(76459, 6572)) {
                    throw null;
                }
            }

            if (llllIlIlIIlI(76459, 6572)) {
                throw null;
            }

            Class73.                                                                                      .                                                                             .
            ().renderItemAndEffectIntoGUI(var4, var5, var1, var2);
            float var8;
            if (llllIlIlIlII((var8 = var3 - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1))) {
                GlStateManager.popMatrix();
                if (llllIlIlIIlI(76459, 6572)) {
                    throw null;
                }
            }

            if (llllIlIlIIlI(76459, 6572)) {
                throw null;
            }

            Class73.                                                                                      .                                                                             .
            ().renderItemOverlays(this.mc.fontRenderer, var5, var1, var2);
        }

        if (llllIlIlIIlI(76459, 6572)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void renderFood(int var1, int var2) {
        byte var10000 = this. (ElementType.FOOD);
        if (llllIlIlIIlI(37346, 8300)) {
            throw null;
        } else {
            boolean var13;
            if (llllIlIlIIll(var10000)) {
                var13 = true;
            } else if (llllIlIlIIlI(37346, 8300)) {
                throw null;
            } else {
                Profiler var10001 = this.mc.profiler;
                String var10002 = Class60. ("}uw?");
                if (llllIlIlIIlI(37346, 8300)) {
                    throw null;
                } else {
                    var10001.startSection(var10002);
                    EntityPlayer var3 = (EntityPlayer) this.mc.getRenderViewEntity();
                    GlStateManager.enableBlend();
                    if (llllIlIlIIlI(37346, 8300)) {
                        throw null;
                    } else {
                        var1 = var1 / 2 + 91;
                        var2 -=;
                                                                                                           +=10;
                        byte var4 = 0;
                        int var5 = this.mc.player.getFoodStats().getFoodLevel();

                        int var6;
                        boolean var14;
                        for (int var12 = var6 = 0; !llllIlIlIIlI(37346, 8300); var14 = true) {
                            if (!llllIlIlIlll(var12, 10)) {
                                if (llllIlIlIIlI(37346, 8300)) {
                                    throw null;
                                }

                                GlStateManager.disableBlend();
                                if (llllIlIlIIlI(37346, 8300)) {
                                    throw null;
                                }

                                this.mc.profiler.endSection();
                                this. (ElementType.FOOD);
                                if (llllIlIlIIlI(37346, 8300)) {
                                    throw null;
                                }

                                var13 = true;
                                return;
                            }

                            int var7 = var6 * 2 + 1;
                            int var8 = var1 - var6 * 8 - 9;
                            int var9 = var2;
                            int var10 = 16;
                            byte var11 = 0;
                            if (llllIlIlIIll(this.mc.player.isPotionActive(MobEffects.HUNGER))) {
                                var11 = 13;
                                var10 += 36;
                            }

                            if (llllIlIlIIlI(37346, 8300)) {
                                throw null;
                            }

                            if (llllIlIlIIll(var4)) {
                                var11 = 1;
                            }

                            if (llllIlIlIIlI(37346, 8300)) {
                                throw null;
                            }

                            float var15;
                            if (llllIlIllIII((var15 = var3.getFoodStats().getSaturationLevel() - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1)) && llllIlIlIllI(this.updateCounter % (var5 * 3 + 1))) {
                                var9 = var2 + (this.rand.nextInt(3) - 1);
                            }

                            if (llllIlIlIIlI(37346, 8300)) {
                                throw null;
                            }

                            this.drawTexturedModalRect(var8, var9, 16 + var11 * 9, 27, 9, 9);
                            if (llllIlIlIlll(var7, var5)) {
                                this.drawTexturedModalRect(var8, var9, var10 + 36, 27, 9, 9);
                                var13 = true;
                            } else {
                                if (llllIlIlIIlI(37346, 8300)) {
                                    throw null;
                                }

                                if (llllIlIllIIl(var7, var5)) {
                                    this.drawTexturedModalRect(var8, var9, var10 + 45, 27, 9, 9);
                                }
                            }

                            if (llllIlIlIIlI(37346, 8300)) {
                                throw null;
                            }

                            ++var6;
                            var12 = var6;
                        }

                        throw null;
                    }
                }
            }
        }
    }

    public void renderFPSGraph() {
        if (llllIlIlIIll(this.mc.gameSettings.showDebugInfo) && llllIlIlIIll(this.mc.gameSettings.showLagometer)) {
            byte var10000 = this. (ElementType.FPS_GRAPH);
            if (llllIlIlIIlI(69169, 4293)) {
                throw null;
            }

            if (llllIlIlIllI(var10000)) {
                this.                                                                                               .
                renderLagometer();
                this. (ElementType.FPS_GRAPH);
                if (llllIlIlIIlI(69169, 4293)) {
                    throw null;
                }
            }
        }

        if (llllIlIlIIlI(69169, 4293)) {
            throw null;
        } else {
            boolean var1 = true;
        }
    }

    public void renderHealth(int var1, int var2) {
        this. (ICONS);
        if (llllIlIlIIlI(72461, 1580)) {
            throw null;
        } else {
            byte var10000 = this. (ElementType.HEALTH);
            if (llllIlIlIIlI(72461, 1580)) {
                throw null;
            } else {
                boolean var19;
                if (llllIlIlIIll(var10000)) {
                    var19 = true;
                } else if (llllIlIlIIlI(72461, 1580)) {
                    throw null;
                } else {
                    Profiler var10001 = this.mc.profiler;
                    String var10002 = Class60. ("r~xvj3");
                    if (llllIlIlIIlI(72461, 1580)) {
                        throw null;
                    } else {
                        var10001.startSection(var10002);
                        GlStateManager.enableBlend();
                        if (llllIlIlIIlI(72461, 1580)) {
                            throw null;
                        } else {
                            EntityPlayer var3 = (EntityPlayer) this.mc.getRenderViewEntity();
                            int var18 = MathHelper.ceil(var3.getHealth());
                            if (llllIlIlIIlI(72461, 1580)) {
                                throw null;
                            } else {
                                int var4 = var18;
                                boolean var20;
                                long var27;
                                long var28;
                                if (llllIlIlIlII((var27 = this.healthUpdateCounter - (long) this.updateCounter) == 0L ? 0 : (var27 < 0L ? -1 : 1)) && llllIlIlIllI((var28 = (this.healthUpdateCounter - (long) this.updateCounter) / 3L % 2L - 1L) == 0L ? 0 : (var28 < 0L ? -1 : 1))) {
                                    var10000 = 1;
                                    var20 = true;
                                } else {
                                    if (llllIlIlIIlI(72461, 1580)) {
                                        throw null;
                                    }

                                    var10000 = 0;
                                }

                                if (llllIlIlIIlI(72461, 1580)) {
                                    throw null;
                                } else {
                                    byte var5 = var10000;
                                    long var10003;
                                    if (llllIlIlIlll(var4, this.playerHealth) && llllIlIlIlII(var3.hurtResistantTime)) {
                                        var10003 = Minecraft.getSystemTime();
                                        if (llllIlIlIIlI(72461, 1580)) {
                                            throw null;
                                        }

                                        this.lastSystemTime = var10003;
                                        this.healthUpdateCounter = (long) (this.updateCounter + 20);
                                        var19 = true;
                                    } else {
                                        if (llllIlIlIIlI(72461, 1580)) {
                                            throw null;
                                        }

                                        if (llllIlIlllll(var4, this.playerHealth) && llllIlIlIlII(var3.hurtResistantTime)) {
                                            var10003 = Minecraft.getSystemTime();
                                            if (llllIlIlIIlI(72461, 1580)) {
                                                throw null;
                                            }

                                            this.lastSystemTime = var10003;
                                            this.healthUpdateCounter = (long) (this.updateCounter + 10);
                                        }
                                    }

                                    if (llllIlIlIIlI(72461, 1580)) {
                                        throw null;
                                    } else {
                                        long var21 = Minecraft.getSystemTime();
                                        if (llllIlIlIIlI(72461, 1580)) {
                                            throw null;
                                        } else {
                                            long var29;
                                            if (llllIlIlIlII((var29 = var21 - this.lastSystemTime - 1000L) == 0L ? 0 : (var29 < 0L ? -1 : 1))) {
                                                this.playerHealth = var4;
                                                this.lastPlayerHealth = var4;
                                                long var22 = Minecraft.getSystemTime();
                                                if (llllIlIlIIlI(72461, 1580)) {
                                                    throw null;
                                                }

                                                this.lastSystemTime = var22;
                                            }

                                            if (llllIlIlIIlI(72461, 1580)) {
                                                throw null;
                                            } else {
                                                this.playerHealth = var4;
                                                int var6 = this.lastPlayerHealth;
                                                float var7 = (float) var3.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getAttributeValue();
                                                var18 = MathHelper.ceil(var3.getAbsorptionAmount());
                                                if (llllIlIlIIlI(72461, 1580)) {
                                                    throw null;
                                                } else {
                                                    float var8 = (float) var18;
                                                    var18 = MathHelper.ceil((var7 + var8) / 2.0F / 10.0F);
                                                    if (llllIlIlIIlI(72461, 1580)) {
                                                        throw null;
                                                    } else {
                                                        int var9 = var18;
                                                        var18 = Math.max(10 - (var9 - 2), 3);
                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                            throw null;
                                                        } else {
                                                            int var10 = var18;
                                                            this.rand.setSeed((long) (this.updateCounter * 312871));
                                                            var1 = var1 / 2 - 91;
                                                            var2 -=;
                                                                                                                                                  +=
                                                            var9 * var10;
                                                            if (llllIllIIIII(var10, 10)) {
                                                                                                                                                     +=
                                                                10 - var10;
                                                            }

                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                throw null;
                                                            } else {
                                                                var9 = -1;
                                                                if (llllIlIlIIll(var3.isPotionActive(MobEffects.REGENERATION))) {
                                                                    var9 = this.updateCounter % 25;
                                                                }

                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                    throw null;
                                                                } else {
                                                                    byte var25;
                                                                    if (llllIlIlIIll(this.mc.world.getWorldInfo().isHardcoreModeEnabled())) {
                                                                        var25 = 5;
                                                                        boolean var23 = true;
                                                                    } else {
                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                            throw null;
                                                                        }

                                                                        var25 = 0;
                                                                    }

                                                                    if (llllIlIlIIlI(72461, 1580)) {
                                                                        throw null;
                                                                    } else {
                                                                        int var11 = 9 * var25;
                                                                        if (llllIlIlIIll(var5)) {
                                                                            var10000 = 25;
                                                                            var20 = true;
                                                                        } else {
                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                throw null;
                                                                            }

                                                                            var10000 = 16;
                                                                        }

                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                            throw null;
                                                                        } else {
                                                                            byte var12 = var10000;
                                                                            int var13 = 16;
                                                                            float var24;
                                                                            if (llllIlIlIIll(var3.isPotionActive(MobEffects.POISON))) {
                                                                                var24 = var8;
                                                                                var13 += 36;
                                                                                var20 = true;
                                                                            } else {
                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                    throw null;
                                                                                }

                                                                                if (llllIlIlIIll(var3.isPotionActive(MobEffects.WITHER))) {
                                                                                    var13 += 72;
                                                                                }

                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                    throw null;
                                                                                }

                                                                                var24 = var8;
                                                                            }

                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                throw null;
                                                                            } else {
                                                                                float var14 = var24;
                                                                                int var26 = MathHelper.ceil((var7 + var8) / 2.0F);
                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    int var16;
                                                                                    for (var26 = var16 = var26 - 1; !llllIlIlIIlI(72461, 1580); var20 = true) {
                                                                                        if (!llllIllIIIIl(var26)) {
                                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                                throw null;
                                                                                            }

                                                                                            GlStateManager.disableBlend();
                                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                                throw null;
                                                                                            }

                                                                                            this.mc.profiler.endSection();
                                                                                            this. (ElementType.HEALTH);
                                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var19 = true;
                                                                                            return;
                                                                                        }

                                                                                        var26 = MathHelper.ceil((float) (var16 + 1) / 10.0F);
                                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                                            throw null;
                                                                                        }

                                                                                        int var17 = var26 - 1;
                                                                                        int var15 = var1 + var16 % 10 * 8;
                                                                                        var17 = var2 - var17 * var10;
                                                                                        if (llllIlIllIlI(var4, 4)) {
                                                                                            var17 += this.rand.nextInt(2);
                                                                                        }

                                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                                            throw null;
                                                                                        }

                                                                                        if (llllIlIllIIl(var16, var9)) {
                                                                                            var17 -= 2;
                                                                                        }

                                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                                            throw null;
                                                                                        }

                                                                                        label283:
                                                                                        {
                                                                                            this.drawTexturedModalRect(var15, var17, var12, var11, 9, 9);
                                                                                            if (llllIlIlIIll(var5)) {
                                                                                                if (llllIlIlIlll(var16 * 2 + 1, var6)) {
                                                                                                    var24 = var14;
                                                                                                    this.drawTexturedModalRect(var15, var17, var13 + 54, var11, 9, 9);
                                                                                                    var20 = true;
                                                                                                    break label283;
                                                                                                }

                                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                if (llllIlIllIIl(var16 * 2 + 1, var6)) {
                                                                                                    this.drawTexturedModalRect(var15, var17, var13 + 63, var11, 9, 9);
                                                                                                }
                                                                                            }

                                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var24 = var14;
                                                                                        }

                                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                                            throw null;
                                                                                        }

                                                                                        float var30;
                                                                                        if (llllIlIlIlII((var30 = var24 - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1))) {
                                                                                            float var31;
                                                                                            float var32;
                                                                                            if (llllIlIlIllI((var31 = var14 - var8) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1)) && llllIlIlIllI((var32 = var8 % 2.0F - 1.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1))) {
                                                                                                this.drawTexturedModalRect(var15, var17, var13 + 153, var11, 9, 9);
                                                                                                --var14;
                                                                                                var19 = true;
                                                                                            } else {
                                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                this.drawTexturedModalRect(var15, var17, var13 + 144, var11, 9, 9);
                                                                                                var14 -= 2.0F;
                                                                                                var19 = true;
                                                                                            }
                                                                                        } else {
                                                                                            if (llllIlIlIIlI(72461, 1580)) {
                                                                                                throw null;
                                                                                            }

                                                                                            if (llllIlIlIlll(var16 * 2 + 1, var4)) {
                                                                                                this.drawTexturedModalRect(var15, var17, var13 + 36, var11, 9, 9);
                                                                                                var19 = true;
                                                                                            } else {
                                                                                                if (llllIlIlIIlI(72461, 1580)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                if (llllIlIllIIl(var16 * 2 + 1, var4)) {
                                                                                                    this.drawTexturedModalRect(var15, var17, var13 + 45, var11, 9, 9);
                                                                                                }
                                                                                            }
                                                                                        }

                                                                                        if (llllIlIlIIlI(72461, 1580)) {
                                                                                            throw null;
                                                                                        }

                                                                                        --var16;
                                                                                        var26 = var16;
                                                                                    }

                                                                                    throw null;
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

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ElementType var1) {
        EventBus var10000 = MinecraftForge.EVENT_BUS;
        Post var10001 = new Post(this., var1);
        if (llllIlIlIIlI(62844, 2579)) {
            throw null;
        } else {
            var10000.post(var10001);
            boolean var2 = true;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ResourceLocation var1) {
        this.mc.getTextureManager().bindTexture(var1);
        boolean var10000 = true;
    }

    public void renderHealthMount(int var1, int var2) {
        Entity var3;
        boolean var18;
        if (llllIlIlIllI((var3 = ((EntityPlayer) this.mc.getRenderViewEntity()).getRidingEntity()) instanceof EntityLivingBase)) {
            var18 = true;
        } else if (llllIlIlIIlI(59979, 1648)) {
            throw null;
        } else {
            this. (ICONS);
            if (llllIlIlIIlI(59979, 1648)) {
                throw null;
            } else {
                byte var10000 = this. (ElementType.HEALTHMOUNT);
                if (llllIlIlIIlI(59979, 1648)) {
                    throw null;
                } else if (llllIlIlIIll(var10000)) {
                    var18 = true;
                } else if (llllIlIlIIlI(59979, 1648)) {
                    throw null;
                } else {
                    byte var4 = 0;
                    var1 = var1 / 2 + 91;
                    Profiler var10001 = this.mc.profiler;
                    String var10002 = Class60. ("}~f~`Yrqte3");
                    if (llllIlIlIIlI(59979, 1648)) {
                        throw null;
                    } else {
                        var10001.endStartSection(var10002);
                        GlStateManager.enableBlend();
                        if (llllIlIlIIlI(59979, 1648)) {
                            throw null;
                        } else {
                            EntityLivingBase var14 = (EntityLivingBase) var3;
                            double var16 = Math.ceil((double) ((EntityLivingBase) var3).getHealth());
                            if (llllIlIlIIlI(59979, 1648)) {
                                throw null;
                            } else {
                                int var11 = (int) var16;
                                int var5;
                                if (llllIlIlllll(var5 = (int) (var14.getMaxHealth() + 0.5F) / 2, 30)) {
                                    var5 = 30;
                                }

                                if (llllIlIlIIlI(59979, 1648)) {
                                    throw null;
                                } else {
                                    boolean var6 = true;
                                    byte var17;
                                    if (llllIlIlIIll(var4)) {
                                        var17 = 1;
                                        boolean var19 = true;
                                    } else {
                                        if (llllIlIlIIlI(59979, 1648)) {
                                            throw null;
                                        }

                                        var17 = 0;
                                    }

                                    if (llllIlIlIIlI(59979, 1648)) {
                                        throw null;
                                    } else {
                                        int var12 = 52 + var17;
                                        var6 = true;
                                        var6 = true;
                                        int var13 = 0;

                                        boolean var20;
                                        label119:
                                        for (int var15 = var5; !llllIlIlIIlI(59979, 1648); var20 = true) {
                                            if (!llllIlIlIlII(var15)) {
                                                if (llllIlIlIIlI(59979, 1648)) {
                                                    throw null;
                                                }

                                                GlStateManager.disableBlend();
                                                if (llllIlIlIIlI(59979, 1648)) {
                                                    throw null;
                                                }

                                                this. (ElementType.HEALTHMOUNT);
                                                if (llllIlIlIIlI(59979, 1648)) {
                                                    throw null;
                                                }

                                                var18 = true;
                                                return;
                                            }

                                            int var7 = var2 -;
                                            var15 = Math.min(var5, 10);
                                            if (llllIlIlIIlI(59979, 1648)) {
                                                throw null;
                                            }

                                            int var8 = var15;
                                            var5 -= var8;

                                            int var9;
                                            for (var15 = var9 = 0; !llllIlIlIIlI(59979, 1648); var20 = true) {
                                                if (!llllIlIlIlll(var15, var8)) {
                                                    if (llllIlIlIIlI(59979, 1648)) {
                                                        throw null;
                                                    }

                                                    var13 += 20;
                                                                                                                                +=
                                                    10;
                                                    var15 = var5;
                                                    continue label119;
                                                }

                                                int var10 = var1 - var9 * 8 - 9;
                                                this.drawTexturedModalRect(var10, var7, var12, 9, 9, 9);
                                                if (llllIlIlIlll(var9 * 2 + 1 + var13, var11)) {
                                                    this.drawTexturedModalRect(var10, var7, 88, 9, 9, 9);
                                                    var18 = true;
                                                } else {
                                                    if (llllIlIlIIlI(59979, 1648)) {
                                                        throw null;
                                                    }

                                                    if (llllIlIllIIl(var9 * 2 + 1 + var13, var11)) {
                                                        this.drawTexturedModalRect(var10, var7, 97, 9, 9, 9);
                                                    }
                                                }

                                                if (llllIlIlIIlI(59979, 1648)) {
                                                    throw null;
                                                }

                                                ++var9;
                                                var15 = var9;
                                            }

                                            throw null;
                                        }

                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void renderBossHealth() {
        byte var10000 = this. (ElementType.BOSSHEALTH);
        if (llllIlIlIIlI(34950, 1568)) {
            throw null;
        } else {
            boolean var1;
            if (llllIlIlIIll(var10000)) {
                var1 = true;
            } else if (llllIlIlIIlI(34950, 1568)) {
                throw null;
            } else {
                this. (Gui.ICONS);
                if (llllIlIlIIlI(34950, 1568)) {
                    throw null;
                } else {
                    GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                    if (llllIlIlIIlI(34950, 1568)) {
                        throw null;
                    } else {
                        Profiler var10003 = this.mc.profiler;
                        String var10004 = Class60. ("xtjiV~|vf3");
                        if (llllIlIlIIlI(34950, 1568)) {
                            throw null;
                        } else {
                            var10003.startSection(var10004);
                            GlStateManager.enableBlend();
                            if (llllIlIlIIlI(34950, 1568)) {
                                throw null;
                            } else {
                                this.overlayBoss.renderBossHealth();
                                GlStateManager.disableBlend();
                                if (llllIlIlIIlI(34950, 1568)) {
                                    throw null;
                                } else {
                                    this.mc.profiler.endSection();
                                    this. (ElementType.BOSSHEALTH);
                                    if (llllIlIlIIlI(34950, 1568)) {
                                        throw null;
                                    } else {
                                        var1 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void setOverlayMessage(ITextComponent var1, boolean var2) {
        this.setOverlayMessage(var1.getFormattedText(), var2);
        boolean var10000 = true;
    }

    public void renderJumpBar(int var1, int var2) {
        this. (ICONS);
        if (llllIlIlIIlI(73932, 5365)) {
            throw null;
        } else {
            byte var10000 = this. (ElementType.JUMPBAR);
            if (llllIlIlIIlI(73932, 5365)) {
                throw null;
            } else {
                boolean var6;
                if (llllIlIlIIll(var10000)) {
                    var6 = true;
                } else if (llllIlIlIIlI(73932, 5365)) {
                    throw null;
                } else {
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    if (llllIlIlIIlI(73932, 5365)) {
                        throw null;
                    } else {
                        GlStateManager.disableBlend();
                        if (llllIlIlIIlI(73932, 5365)) {
                            throw null;
                        } else {
                            Profiler var10002 = this.mc.profiler;
                            String var10003 = Class60. ("vhrlZ|)");
                            if (llllIlIlIIlI(73932, 5365)) {
                                throw null;
                            } else {
                                var10002.startSection(var10003);
                                float var3 = this.mc.player.getHorseJumpPower();
                                boolean var4 = true;
                                var1 = var1 / 2 - 91;
                                int var5 = (int) (var3 * 183.0F);
                                var2 = var2 - 32 + 3;
                                this.drawTexturedModalRect(var1, var2, 0, 84, 182, 5);
                                if (llllIlIlIlII(var5)) {
                                    this.drawTexturedModalRect(var1, var2, 0, 89, var5, 5);
                                }

                                if (llllIlIlIIlI(73932, 5365)) {
                                    throw null;
                                } else {
                                    GlStateManager.enableBlend();
                                    if (llllIlIlIIlI(73932, 5365)) {
                                        throw null;
                                    } else {
                                        this.mc.profiler.endSection();
                                        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                                        if (llllIlIlIIlI(73932, 5365)) {
                                            throw null;
                                        } else {
                                            this. (ElementType.JUMPBAR);
                                            if (llllIlIlIIlI(73932, 5365)) {
                                                throw null;
                                            } else {
                                                var6 = true;
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

    public void renderTitle(int var1, int var2, float var3) {
        if (llllIlIlIlII(this.titlesTimer)) {
            Profiler var10002 = this.mc.profiler;
            String var10003 = Class60. ("oslwz[r\u007f@oro~nx>");
            if (llllIlIlIIlI(83980, 809)) {
                throw null;
            }

            var10002.startSection(var10003);
            var3 = (float) this.titlesTimer - var3;
            int var4 = 255;
            if (llllIlIlllll(this.titlesTimer, this.titleFadeOut + this.titleDisplayTime)) {
                var4 = (int) (((float) (this.titleFadeIn + this.titleDisplayTime + this.titleFadeOut) - var3) * 255.0F / (float) this.titleFadeIn);
            }

            if (llllIlIlIIlI(83980, 809)) {
                throw null;
            }

            if (llllIlIllIlI(this.titlesTimer, this.titleFadeOut)) {
                var4 = (int) (var3 * 255.0F / (float) this.titleFadeOut);
            }

            if (llllIlIlIIlI(83980, 809)) {
                throw null;
            }

            int var10000 = MathHelper.clamp(var4, 0, 255);
            if (llllIlIlIIlI(83980, 809)) {
                throw null;
            }

            var4 = var10000;
            if (llllIlIlllll(var10000, 8)) {
                GlStateManager.pushMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.translate((float) (var1 / 2), (float) (var2 / 2), 0.0F);
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.pushMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.scale(4.0F, 4.0F, 4.0F);
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                int var5 = var4 << 24 & -16777216;
                this.getFontRenderer().drawString(this.displayedTitle, (float) (-this.getFontRenderer().getStringWidth(this.displayedTitle) / 2), -10.0F, 16777215 | var5, true);
                GlStateManager.popMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.pushMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.scale(2.0F, 2.0F, 2.0F);
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                this.getFontRenderer().drawString(this.displayedSubTitle, (float) (-this.getFontRenderer().getStringWidth(this.displayedSubTitle) / 2), 5.0F, 16777215 | var5, true);
                GlStateManager.popMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.disableBlend();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }

                GlStateManager.popMatrix();
                if (llllIlIlIIlI(83980, 809)) {
                    throw null;
                }
            }

            if (llllIlIlIIlI(83980, 809)) {
                throw null;
            }

            this.mc.profiler.endSection();
        }

        if (llllIlIlIIlI(83980, 809)) {
            throw null;
        } else {
            boolean var6 = true;
        }
    }

    public protected private abstract final synchronized native void _??????????_??????????/* $FF was: _?????????? ??????????*/();

    public void renderRecordOverlay(int var1, int var2, float var3) {
        if (llllIlIlIlII(this.overlayMessageTime)) {
            Profiler var10001 = this.mc.profiler;
            String var10002 = Class60. ("um|hrzdWwhb{q>");
            if (llllIlIlIIlI(85318, 3326)) {
                throw null;
            }

            var10001.startSection(var10002);
            int var4;
            if (llllIlIlllll(var4 = (int) ((var3 = (float) this.overlayMessageTime - var3) * 256.0F / 20.0F), 255)) {
                var4 = 255;
            }

            if (llllIlIlIIlI(85318, 3326)) {
                throw null;
            }

            if (llllIlIlIlII(var4)) {
                GlStateManager.pushMatrix();
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                GlStateManager.translate((float) (var1 / 2), (float) (var2 - 68), 0.0F);
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                int var10000;
                if (llllIlIlIIll(this.animateOverlayMessageColor)) {
                    var10000 = Color.HSBtoRGB(var3 / 50.0F, 0.7F, 0.6F);
                    if (llllIlIlIIlI(85318, 3326)) {
                        throw null;
                    }

                    var10000 &= 16777215;
                    boolean var6 = true;
                } else {
                    if (llllIlIlIIlI(85318, 3326)) {
                        throw null;
                    }

                    var10000 = 16777215;
                }

                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                var1 = var10000;
                this.                                                                                                 .
                drawString(this.overlayMessage, -this..getStringWidth(this.overlayMessage) / 2, -4, var1 | var4 << 24);
                GlStateManager.disableBlend();
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }

                GlStateManager.popMatrix();
                if (llllIlIlIIlI(85318, 3326)) {
                    throw null;
                }
            }

            if (llllIlIlIIlI(85318, 3326)) {
                throw null;
            }

            this.mc.profiler.endSection();
        }

        if (llllIlIlIIlI(85318, 3326)) {
            throw null;
        } else {
            boolean var5 = true;
        }
    }
}
