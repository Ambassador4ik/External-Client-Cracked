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
        super(var1.inventoryContainer);
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
                    this.allowUserInput = true;
                    boolean var10000 = true;
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0, int var1, int var2, float var3, float var4, EntityLivingBase var5) {
        GlStateManager.enableColorMaterial();
        if (lllIllIIIlIl(39813, 8787)) {
            throw null;
        } else {
            GlStateManager.pushMatrix();
            if (lllIllIIIlIl(39813, 8787)) {
                throw null;
            } else {
                GlStateManager.translate((float) var0, (float) var1, 50.0F);
                if (lllIllIIIlIl(39813, 8787)) {
                    throw null;
                } else {
                    GlStateManager.scale((float) (-var2), (float) var2, (float) var2);
                    if (lllIllIIIlIl(39813, 8787)) {
                        throw null;
                    } else {
                        GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                        if (lllIllIIIlIl(39813, 8787)) {
                            throw null;
                        } else {
                            float var9 = var5.renderYawOffset;
                            float var10 = var5.rotationYaw;
                            float var6 = var5.rotationPitch;
                            float var7 = var5.prevRotationYawHead;
                            float var8 = var5.rotationYawHead;
                            GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
                            if (lllIllIIIlIl(39813, 8787)) {
                                throw null;
                            } else {
                                RenderHelper.enableStandardItemLighting();
                                if (lllIllIIIlIl(39813, 8787)) {
                                    throw null;
                                } else {
                                    GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
                                    if (lllIllIIIlIl(39813, 8787)) {
                                        throw null;
                                    } else {
                                        double var10012 = Math.atan((double) (var4 / 40.0F));
                                        if (lllIllIIIlIl(39813, 8787)) {
                                            throw null;
                                        } else {
                                            GlStateManager.rotate(-((float) var10012) * 20.0F, 1.0F, 0.0F, 0.0F);
                                            if (lllIllIIIlIl(39813, 8787)) {
                                                throw null;
                                            } else {
                                                var10012 = Math.atan((double) (var3 / 40.0F));
                                                if (lllIllIIIlIl(39813, 8787)) {
                                                    throw null;
                                                } else {
                                                    var5.renderYawOffset = (float) var10012 * 20.0F;
                                                    double var10011 = Math.atan((double) (var3 / 40.0F));
                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                        throw null;
                                                    } else {
                                                        var5.rotationYaw = (float) var10011 * 40.0F;
                                                        double var10010 = Math.atan((double) (var4 / 40.0F));
                                                        if (lllIllIIIlIl(39813, 8787)) {
                                                            throw null;
                                                        } else {
                                                            var5.rotationPitch = -((float) var10010) * 20.0F;
                                                            var5.rotationYawHead = var5.rotationYaw;
                                                            var5.prevRotationYawHead = var5.rotationYaw;
                                                            GlStateManager.translate(0.0F, 0.0F, 0.0F);
                                                            if (lllIllIIIlIl(39813, 8787)) {
                                                                throw null;
                                                            } else {
                                                                Minecraft var10005 = Minecraft.getMinecraft();
                                                                if (lllIllIIIlIl(39813, 8787)) {
                                                                    throw null;
                                                                } else {
                                                                    RenderManager var11 = var10005.getRenderManager();
                                                                    var11.setPlayerViewY(180.0F);
                                                                    var11.setRenderShadow(false);
                                                                    var11.renderEntity(var5, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
                                                                    var11.setRenderShadow(true);
                                                                    var5.renderYawOffset = var9;
                                                                    var5.rotationYaw = var10;
                                                                    var5.rotationPitch = var6;
                                                                    var5.prevRotationYawHead = var7;
                                                                    var5.rotationYawHead = var8;
                                                                    GlStateManager.popMatrix();
                                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                                        throw null;
                                                                    } else {
                                                                        RenderHelper.disableStandardItemLighting();
                                                                        if (lllIllIIIlIl(39813, 8787)) {
                                                                            throw null;
                                                                        } else {
                                                                            GlStateManager.disableRescaleNormal();
                                                                            if (lllIllIIIlIl(39813, 8787)) {
                                                                                throw null;
                                                                            } else {
                                                                                GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
                                                                                if (lllIllIIIlIl(39813, 8787)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.disableTexture2D();
                                                                                    if (lllIllIIIlIl(39813, 8787)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
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

    public void initGui() {
        this.buttonList.clear();
        Class127 var10000;
        boolean var2;
        if (lllIllIIIlll(this.mc.playerController.isInCreativeMode())) {
            var10000 = this;
            Minecraft var10001 = this.mc;
            Class10 var10002 = new Class10(this.mc.player);
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }

            var10001.displayGuiScreen(var10002);
            var2 = true;
        } else {
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }

            var10000 = this;
            super.initGui();
            if (lllIllIIIlIl(59278, 8355)) {
                throw null;
            }
        }

        if (lllIllIIIlIl(59278, 8355)) {
            throw null;
        } else {
            if (lllIllIIIllI(this.width, 379)) {
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
                func_194303_a(this.width, this.height, this.mc, this., ((ContainerPlayer) this.inventorySlots).craftMatrix);
                this.guiLeft = this.                                                                                            .
                updateScreenPosition(this., this.width, this.xSize);
                GuiButtonImage var4 = new GuiButtonImage(10, this.guiLeft + 104, this.height / 2 - 22, 20, 18, 178, 0, 19, INVENTORY_BACKGROUND);
                if (lllIllIIIlIl(59278, 8355)) {
                    throw null;
                } else {
                    this. = var4;
                    this.buttonList.add(this.);
                    this.                                                                                                   .
                    (1.0F);
                    boolean var1 = true;
                }
            }
        }
    }

    public void drawScreen(int var1, int var2, float var3) {
        this.drawDefaultBackground();
        boolean var10001;
        if (lllIllIIlIII(this..isVisible())){
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
            this.hasActivePotionEffects = var10001;
            this.                                                                                                   .();
            ScaledResolution var6 = new ScaledResolution(this.mc);
            if (lllIllIIIlIl(67398, 8604)) {
                throw null;
            } else {
                int var4 = var6.getScaledWidth();
                int var5 = var6.getScaledHeight();
                GlStateManager.pushMatrix();
                if (lllIllIIIlIl(67398, 8604)) {
                    throw null;
                } else {
                    GlStateManager.translate((float) (var4 / 2), (float) (var5 / 2), 0.0F);
                    if (lllIllIIIlIl(67398, 8604)) {
                        throw null;
                    } else {
                        GlStateManager.scale(this.. (), this.                                                                                                   .
                        (), 1.0F);
                        if (lllIllIIIlIl(67398, 8604)) {
                            throw null;
                        } else {
                            GlStateManager.translate((float) (-var4 / 2), (float) (-var5 / 2), 0.0F);
                            if (lllIllIIIlIl(67398, 8604)) {
                                throw null;
                            } else {
                                boolean var10000;
                                if (lllIllIIIlll(this..isVisible()) &&lllIllIIIlll(this.)){
                                    this.drawGuiContainerBackgroundLayer(var3, var1, var2);
                                    this.                                                                                            .
                                    render(var1, var2, var3);
                                    var10000 = true;
                                } else{
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    }

                                    this.                                                                                            .
                                    render(var1, var2, var3);
                                    super.drawScreen(var1, var2, var3);
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    }

                                    this.                                                                                            .
                                    renderGhostRecipe(this.guiLeft, this.guiTop, false, var3);
                                }

                                if (lllIllIIIlIl(67398, 8604)) {
                                    throw null;
                                } else {
                                    GlStateManager.popMatrix();
                                    if (lllIllIIIlIl(67398, 8604)) {
                                        throw null;
                                    } else {
                                        this.renderHoveredToolTip(var1, var2);
                                        this.                                                                                            .
                                        renderTooltip(this.guiLeft, this.guiTop, var1, var2);
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

    public void mouseReleased(int var1, int var2, int var3) {
        boolean var10000;
        if (lllIllIIIlll(this.)) {
            this. = false;
            var10000 = true;
        } else if (lllIllIIIlIl(62015, 9285)) {
            throw null;
        } else {
            super.mouseReleased(var1, var2, var3);
            if (lllIllIIIlIl(62015, 9285)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void keyTyped(char var1, int var2) throws IOException {
        if (lllIllIIlIII(this..keyPressed(var1, var2))){
            super.keyTyped(var1, var2);
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

    public void recipesUpdated() {
        this.                                                                                            .
        recipesUpdated();
        boolean var10000 = true;
    }

    public void actionPerformed(GuiButton var1) throws IOException {
        if (lllIllIIlIIl(var1.id, 10)) {
            this.                                                                                            .
            initVisuals(this., ((ContainerPlayer) this.inventorySlots).craftMatrix);
            this.                                                                                            .
            toggleVisibility();
            this.guiLeft = this.                                                                                            .
            updateScreenPosition(this., this.width, this.xSize);
            this.                                                                                           .
            setPosition(this.guiLeft + 104, this.height / 2 - 22);
            this. = true;
        }

        if (lllIllIIIlIl(28674, 966)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        if (lllIllIIIlIl(84550, 5832)) {
            throw null;
        } else {
            this.mc.getTextureManager().bindTexture(INVENTORY_BACKGROUND);
            int var4 = this.guiLeft;
            var2 = this.guiTop;
            this.drawTexturedModalRect(var4, var2, 0, 0, this.xSize, this.ySize);
            (var4 + 51, var2 + 75, 30, (float) (var4 + 51) - this., (float) (var2 + 75 - 50) - this., this.mc.player)
            ;
            if (lllIllIIIlIl(84550, 5832)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    public boolean hasClickedOutside(int var1, int var2, int var3, int var4) {
        byte var10000;
        if (lllIllIIIlIl(var1, var3) && lllIllIIIlIl(var2, var4) && lllIllIIIllI(var1, var3 + this.xSize) && !lllIllIIIlIl(var2, var4 + this.ySize)) {
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
            if (lllIllIIIlll(this..hasClickedOutside(var1, var2, this.guiLeft, this.guiTop, this.xSize, this.ySize)) &&
            lllIllIIIlll(var5)){
                return true;
            } else if (lllIllIIIlIl(39586, 9461)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    public void mouseClicked(int var1, int var2, int var3) throws IOException {
        if (lllIllIIlIII(this..mouseClicked(var1, var2, var3)) &&
        (!lllIllIIIlll(this.) || lllIllIIlIII(this..isVisible()))){
            if (lllIllIIIlIl(80380, 2729)) {
                throw null;
            }

            super.mouseClicked(var1, var2, var3);
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

    public boolean isPointInRegion(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (!lllIllIIIlll(this.) || lllIllIIlIII(this..isVisible())){
            if (lllIllIIIlIl(58057, 9031)) {
                throw null;
            }

            byte var10000 = super.isPointInRegion(var1, var2, var3, var4, var5, var6);
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

    public void onGuiClosed() {
        this.                                                                                            .
        removed();
        this.                                                                                                   .(0.0F);
        super.onGuiClosed();
        if (lllIllIIIlIl(96102, 2457)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void updateScreen() {
        if (lllIllIIIlll(this.mc.playerController.isInCreativeMode())) {
            Minecraft var10000 = this.mc;
            Class10 var10001 = new Class10(this.mc.player);
            if (lllIllIIIlIl(9537, 4336)) {
                throw null;
            }

            var10000.displayGuiScreen(var10001);
        }

        if (lllIllIIIlIl(9537, 4336)) {
            throw null;
        } else {
            this.                                                                                            .
            tick();
            boolean var1 = true;
        }
    }

    public void drawGuiContainerForegroundLayer(int var1, int var2) {
        FontRenderer var10000 = this.fontRenderer;
        String var10001 = Class60. ("ytwn\u007frs\u007f`5rhw}asd<");
        if (lllIllIIIlIl(80796, 6765)) {
            throw null;
        } else {
            var10001 = I18n.format(var10001, new Object[0]);
            if (lllIllIIIlIl(80796, 6765)) {
                throw null;
            } else {
                var10000.drawString(var10001, 97, 8, 4210752);
                boolean var3 = true;
            }
        }
    }

    public void handleMouseClick(Slot var1, int var2, int var3, ClickType var4) {
        super.handleMouseClick(var1, var2, var3, var4);
        if (lllIllIIIlIl(62522, 384)) {
            throw null;
        } else {
            this.                                                                                            .
            slotClicked(var1);
            boolean var10000 = true;
        }
    }
}
