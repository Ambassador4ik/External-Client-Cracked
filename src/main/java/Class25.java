import com.google.gson.JsonSyntaxException;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.Random;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.MapItemRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.FogMode;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MouseFilter;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.GameType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

@SideOnly(Side.CLIENT)
public class Class25 extends EntityRenderer implements IResourceManagerReloadListener {
    private static int 21176=-24495;
    private static int 5816=12957;
    private static int 6631=16478;
    private static int 78312=-25847;
    private static int 39851=-11045;
    private static int 90165=-16397;
    private float;
    private static int 26403=-30991;
    private final float[];
    private static int 82680=-10734;
    private static int 2746=23566;
    private static int 66048=-27729;
    private static int 5218=7988;
    private static int 49475=-24684;
    private static int 84597=-8965;
    private long;
    private double;
    private static int 6827=8896;
    private static int 20295=-23020;
    private final int[];
    private final MouseFilter;
    private static int 5815=50;
    private boolean;
    private float;
    private float;
    private static int 77895=-274;
    private static int 6743=28936;
    private float;
    private static final ResourceLocation;
    private static int 5550=4065;
    private float;
    private float;
    private static int 23939=-5284;
    private int;
    public float;
    private static int 41504=-14725;
    private static int 70574=-8388;
    private final MouseFilter;
    private final IResourceManager;
    private static final ResourceLocation;
    private static int 18683=-17957;
    private long;
    private static int 8134=25915;
    private static int 8654=290;
    public Class11;
    private static int 2593=3410;
    public static final int;
    private static int 4714=5353;
    private double;
    private float;
    private static int 3105=15407;
    public final ItemRenderer;
    private boolean;
    private static int 50634=-3342;
    private static int 442=21871;
    private static int 1079=29049;
    private static int 87321=-27244;
    private static int 95199=-6636;
    private static int 81732=-28581;
    private float;
    private static int 44752=-30557;
    private final MapItemRenderer;
    private static int 745=30332;
    private static int 50829=-7493;
    private static int 65756=-19678;
    private static int 5114=9632;
    private int;
    private static int 5668=7060;
    private float;
    private static int 532=26953;
    private static int 89610=-9041;
    private static int 5413=4417;
    private static int 2526=28105;
    private static int 5417=2141;
    private static int 48309=-16999;
    private boolean;
    private static int 6540=12289;
    private static int 1855=10418;
    private static int 2148=16117;
    private static int 4446=26993;
    private final DynamicTexture;
    private final float[];
    private static int 75491=-15872;
    public float;
    private final Random;
    private int;
    private ItemStack;
    private static int 81989=-12459;
    private static int 9537=9659;
    public static int;
    private static int 91941=-19598;
    private static int 54318=-32028;
    private float;
    private static int 19728=-3165;
    private static final Logger;
    private final FloatBuffer;
    private static int 790=13731;
    private static int 8254=31239;
    private float;
    private static int 2131=30302;
    private static int 1744=29781;
    private static int 7316=12849;
    private int;
    private static int 89737=-25504;
    private double;
    private static int 54799=-30988;
    private boolean;
    private static int 94849=-15069;
    private static int 46408=-18090;
    private float;
    private final ResourceLocation;
    private static int 23091=-14600;
    private static int 7480=16035;
    private int;
    private static int 72322=-26552;
    private static int 8862=27953;
    private static int 5199=390;
    private static int 20=6531;
    private float;
    private static int 8473=-15968;
    private float;
    private float;
    private static int 77035=-25061;
    private boolean;
    private static int 40748=-7548;
    private static int 20379=-23816;
    private static int 23361=-31248;
    public static boolean;
    private static int 6691=30125;
    public ShaderGroup;
    private static int 80879=-31329;
    private static final ResourceLocation[];
    private static int 8135=27211;
    private static int 9120=29744;
    private static int 55615=-15310;
    private float;
    private int;
    private boolean;
    private static int 5111=26449;
    private final Minecraft;
    private static int 92404=-5014;
    private static int 975=21721;
    private float;
    private static int 4280=32553;
    private float;
    private float;
    private static int 83029=-32652;
    private static int 52=2721;
    private static int 6878=23196;

    static {
        Logger var10000 = LogManager.getLogger();
        if (llIIlIIlIIll(87321, 2526)) {
            throw null;
        } else {
                                                                                                                   =
            var10000;
            ResourceLocation var0 = new ResourceLocation;
            String var10002 = Class60. ("sc|svtet cbqbtgizczs<tqnq(li<");
            if (llIIlIIlIIll(87321, 2526)) {
                throw null;
            } else {
                var0.<init> (var10002);
                if (llIIlIIlIIll(87321, 2526)) {
                    throw null;
                } else {
                                                                                                                                   =
                    var0;
                    var0 = new ResourceLocation;
                    var10002 = Class60. ("sc|svtet cbqbtgizczs<u~hh(li<");
                    if (llIIlIIlIIll(87321, 2526)) {
                        throw null;
                    } else {
                        var0.<init> (var10002);
                        if (llIIlIIlIIll(87321, 2526)) {
                            throw null;
                        } else {
                                                                                                                                                                               =
                            var0;
                            ResourceLocation[] var1 = new ResourceLocation[24];
                            ResourceLocation var10003 = new ResourceLocation;
                            boolean var10005 = false;
                            String var3 = Class60. ("\u007fenhm\u007fx#tbtx/clx\u007fe1fkb5");
                            if (llIIlIIlIIll(87321, 2526)) {
                                throw null;
                            } else {
                                var10003.<init> (var3);
                                if (llIIlIIlIIll(87321, 2526)) {
                                    throw null;
                                } else {
                                    var1[0] = var10003;
                                    var10003 = new ResourceLocation;
                                    var3 = Class60. ("isx~{in5btbn9}m{k5cia5");
                                    if (llIIlIIlIIll(87321, 2526)) {
                                        throw null;
                                    } else {
                                        var10003.<init> (var3);
                                        if (llIIlIIlIIll(87321, 2526)) {
                                            throw null;
                                        } else {
                                            var1[1] = var10003;
                                            var10003 = new ResourceLocation;
                                            var3 = Class60. ("|fmkn|{ waw{,or{1do`5");
                                            if (llIIlIIlIIll(87321, 2526)) {
                                                throw null;
                                            } else {
                                                var10003.<init> (var3);
                                                if (llIIlIIlIIll(87321, 2526)) {
                                                    throw null;
                                                } else {
                                                    var1[2] = var10003;
                                                    var10003 = new ResourceLocation;
                                                    var3 = Class60. ("\u007fenhm\u007fx#tbtx/ovalt1fkb5");
                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                        throw null;
                                                    } else {
                                                        var10003.<init> (var3);
                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                            throw null;
                                                        } else {
                                                            var1[3] = var10003;
                                                            var10003 = new ResourceLocation;
                                                            var3 = Class60. ("hry\u007fzho4cuco8xxtii:5eic5");
                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                throw null;
                                                            } else {
                                                                var10003.<init> (var3);
                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                    throw null;
                                                                } else {
                                                                    var1[4] = var10003;
                                                                    var10003 = new ResourceLocation;
                                                                    var3 = Class60. ("hry\u007fzho4cuco8jquhsd5eic5");
                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10003.<init> (var3);
                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                            throw null;
                                                                        } else {
                                                                            var1[5] = var10003;
                                                                            var10003 = new ResourceLocation;
                                                                            var3 = Class60.
                                                                            ("hry\u007fzho4cuco8y{wdhWx`tztole5mik5");
                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10003.<init> (var3);
                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var1[6] = var10003;
                                                                                    var10003 = new ResourceLocation;
                                                                                    var3 = Class60.
                                                                                    ("hry\u007fzho4cuco8~qxdt~~}}i5iio5");
                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var10003.<init> (var3);
                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            var1[7] = var10003;
                                                                                            var10003 = new ResourceLocation;
                                                                                            var3 = Class60.
                                                                                            ("isx~{in5btbn9}ysz5cia5");
                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10003.<init> (var3);
                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var1[8] = var10003;
                                                                                                    var10003 = new ResourceLocation;
                                                                                                    var3 = Class60.
                                                                                                    ("hry\u007fzho4cuco8szmnh|5eic5");
                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var10003.<init>
                                                                                                        (var3);
                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            var1[9] = var10003;
                                                                                                            var10003 = new ResourceLocation;
                                                                                                            var3 = Class60.
                                                                                                            ("isx~{in5btbn9uaii5cia5");
                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                var10003.<init>
                                                                                                                (var3);
                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    var1[10] = var10003;
                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                    var3 = Class60.
                                                                                                                    ("pjagbpw,{m{w myw\u007fk~f9hgl5");
                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        var10003.<init>
                                                                                                                        (var3);
                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            var1[11] = var10003;
                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                            var3 = Class60.
                                                                                                                            ("isx~{in5btbn9k}uykau|5gim5");
                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                var10003.<init>
                                                                                                                                (var3);
                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    var1[12] = var10003;
                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                    var3 = Class60.
                                                                                                                                    ("HRY_ZHO\u0014CUCO\u0018IWZEeXRAYYHKSOU\tPWT5");
                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        var10003.<init>
                                                                                                                                        (var3);
                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            var1[13] = var10003;
                                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                                            var3 = Class60.
                                                                                                                                            ("\u007fenhm\u007fx#tbtx/~lnya1fkb5");
                                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                var10003.<init>
                                                                                                                                                (var3);
                                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    var1[14] = var10003;
                                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                                    var3 = Class60.
                                                                                                                                                    ("isx~{in5btbn9y|ny5cia5");
                                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var10003.<init>
                                                                                                                                                        (var3);
                                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            var1[15] = var10003;
                                                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                                                            var3 = Class60.
                                                                                                                                                            ("hry\u007fzho4cuco8~qhjn}inni5iio5");
                                                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                var10003.<init>
                                                                                                                                                                (var3);
                                                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    var1[16] = var10003;
                                                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                                                    var3 = Class60.
                                                                                                                                                                    ("\u007fenhm\u007fx#tbtx/jqiyc1fkb5");
                                                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        var10003.<init>
                                                                                                                                                                        (var3);
                                                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            var1[17] = var10003;
                                                                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                                                                            var3 = Class60.
                                                                                                                                                                            ("isx~{in5btbn9yyox5cia5");
                                                                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                var10003.<init>
                                                                                                                                                                                (var3);
                                                                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var1[18] = var10003;
                                                                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                                                                    var3 = Class60.
                                                                                                                                                                                    ("hry\u007fzho4cuco8m{yivm5eic5");
                                                                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        var10003.<init>
                                                                                                                                                                                        (var3);
                                                                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            var1[19] = var10003;
                                                                                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                                                                                            var3 = Class60.
                                                                                                                                                                                            ("\u007fenhm\u007fx#tbtx/ooc~~1fkb5");
                                                                                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                var10003.<init>
                                                                                                                                                                                                (var3);
                                                                                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    var1[20] = var10003;
                                                                                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                                                                                    var3 = Class60.
                                                                                                                                                                                                    ("sibdast/xnxt#`aty`\u007fiur9jkn5");
                                                                                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        var10003.<init>
                                                                                                                                                                                                        (var3);
                                                                                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            var1[21] = var10003;
                                                                                                                                                                                                            var10003 = new ResourceLocation;
                                                                                                                                                                                                            var3 = Class60.
                                                                                                                                                                                                            ("pjagbpw,{m{w a~fvruq9hgl5");
                                                                                                                                                                                                            if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                var10003.<init>
                                                                                                                                                                                                                (var3);
                                                                                                                                                                                                                if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    var1[22] = var10003;
                                                                                                                                                                                                                    var10003 = new ResourceLocation;
                                                                                                                                                                                                                    var3 = Class60.
                                                                                                                                                                                                                    ("hry\u007fzho4cuco8idro\u007fz5eic5");
                                                                                                                                                                                                                    if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        var10003.<init>
                                                                                                                                                                                                                        (var3);
                                                                                                                                                                                                                        if (llIIlIIlIIll(87321, 2526)) {
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            var1[23] = var10003;
                                                                                                                                                                                                                                                                                  =
                                                                                                                                                                                                                            var1;
                                                                                                                                                                                                                                                                       =                                                                                                             .
                                                                                                                                                                                                                            length;
                                                                                                                                                                                                                            boolean var2 = true;
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
        }
    }

    public Class25(Minecraft var1, IResourceManager var2) {
        super(var1, var2);
        if (llIIlIIlIIll(46408, 20)) {
            throw null;
        } else {
            Random var10037 = new Random();
            if (llIIlIIlIIll(46408, 20)) {
                throw null;
            } else {
                this. = var10037;
                MouseFilter var10036 = new MouseFilter();
                if (llIIlIIlIIll(46408, 20)) {
                    throw null;
                } else {
                    this. = var10036;
                    MouseFilter var10035 = new MouseFilter();
                    if (llIIlIIlIIll(46408, 20)) {
                        throw null;
                    } else {
                        this. = var10035;
                        this. = true;
                        this. = true;
                        long var10030 = Minecraft.func_71386_F();
                        if (llIIlIIlIIll(46408, 20)) {
                            throw null;
                        } else {
                            this. = var10030;
                            this. = new float[1024];
                            this. = new float[1024];
                            FloatBuffer var10024 = GLAllocation.func_74529_h(16);
                            if (llIIlIIlIIll(46408, 20)) {
                                throw null;
                            } else {
                                this. = var10024;
                                this. = 1.0D;
                                this. = -1.0F;
                                this. = -1.0F;
                                this. =;
                                this. = var1;
                                this. = var2;
                                this. = var1.func_175597_ag();
                                MapItemRenderer var10010 = new MapItemRenderer(var1.func_110434_K());
                                if (llIIlIIlIIll(46408, 20)) {
                                    throw null;
                                } else {
                                    this. = var10010;
                                    DynamicTexture var10009 = new DynamicTexture(16, 16);
                                    if (llIIlIIlIIll(46408, 20)) {
                                        throw null;
                                    } else {
                                        this. = var10009;
                                        TextureManager var10007 = var1.func_110434_K();
                                        String var10008 = Class60. ("ws\u007fskW}+");
                                        if (llIIlIIlIIll(46408, 20)) {
                                            throw null;
                                        } else {
                                            this. = var10007.func_110578_a(var10008, this.);
                                            this. = this.                                                                                                                              .
                                            func_110565_c();
                                            this. = null;
                                            Class171 var10001 = Class133. (96);
                                            if (llIIlIIlIIll(46408, 20)) {
                                                throw null;
                                            } else {
                                                this. = (Class11) var10001;

                                                int var6;
                                                boolean var11;
                                                label87:
                                                for (int var10000 = var6 = 0; !llIIlIIlIIll(46408, 20); var11 = true) {
                                                    if (!llIIlIIlIllI(var10000, 32)) {
                                                        if (llIIlIIlIIll(46408, 20)) {
                                                            throw null;
                                                        }

                                                        Class var10 = this.                                                                                   .
                                                        field_71460_t.getClass();
                                                        String var13 = Class60. ("}ovx@-$/$#O:");
                                                        if (llIIlIIlIIll(46408, 20)) {
                                                            throw null;
                                                        }

                                                        Method var12 = Class22. (var10, var13, Float.TYPE, Integer.TYPE)
                                                        ;
                                                        if (llIIlIIlIIll(46408, 20)) {
                                                            throw null;
                                                        }

                                                        Class22. = var12;
                                                        boolean var14 = true;
                                                        return;
                                                    }

                                                    int var7;
                                                    for (var10000 = var7 = 0; !llIIlIIlIIll(46408, 20); var11 = true) {
                                                        if (!llIIlIIlIllI(var10000, 32)) {
                                                            if (llIIlIIlIIll(46408, 20)) {
                                                                throw null;
                                                            }

                                                            ++var6;
                                                            var10000 = var6;
                                                            continue label87;
                                                        }

                                                        float var3 = (float) (var7 - 16);
                                                        float var4 = (float) (var6 - 16);
                                                        float var8 = MathHelper.func_76129_c(var3 * var3 + var4 * var4);
                                                        if (llIIlIIlIIll(46408, 20)) {
                                                            throw null;
                                                        }

                                                        float var5 = var8;
                                                        this.                                                                            [
                                                        var6 << 5 | var7] =-var4 / var5;
                                                        int var9 = var6 << 5 | var7;
                                                        float var10002 = var3 / var5;
                                                        ++var7;
                                                        this.                                                                                                      [
                                                        var9] =var10002;
                                                        var10000 = var7;
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
        }
    }

    private static boolean llIIlIIlllll(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIIlIIlllII(Object var0) {
        return var0 == null;
    }

    public static Minecraft ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class25 var0) {
        return var0.;
    }

    private static boolean llIIlIIllIIl(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIIlIlIIIlI(int var0) {
        return var0 <= 0;
    }

    private static boolean llIIlIIllIlI(int var0) {
        return var0 > 0;
    }

    private static boolean llIIlIIllIll(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIIlIlIIIII(int var0) {
        return var0 < 0;
    }

    private static boolean llIIlIIlIlll(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llIIlIIllIII(int var0) {
        return var0 >= 0;
    }

    private static boolean llIIlIIlIlII(int var0) {
        return var0 == 0;
    }

    private static boolean llIIlIlIIIIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIlIIlllIl(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlIIlIIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlIIlIllI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIlIIlIlIl(int var0, int var1) {
        return var0 == var1;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(FontRenderer var0, String var1, float var2, float var3, float var4, int var5, float var6, float var7, boolean var8, boolean var9) {
        GlStateManager.func_179094_E();
        if (llIIlIIlIIll(91941, 4714)) {
            throw null;
        } else {
            GlStateManager.func_179109_b(var2, var3, var4);
            if (llIIlIIlIIll(91941, 4714)) {
                throw null;
            } else {
                GlStateManager.func_187432_a(0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(91941, 4714)) {
                    throw null;
                } else {
                    GlStateManager.func_179114_b(-var6, 0.0F, 1.0F, 0.0F);
                    if (llIIlIIlIIll(91941, 4714)) {
                        throw null;
                    } else {
                        byte var10000;
                        if (llIIlIIlIIlI(var8)) {
                            var10000 = -1;
                            boolean var10001 = true;
                        } else {
                            if (llIIlIIlIIll(91941, 4714)) {
                                throw null;
                            }

                            var10000 = 1;
                        }

                        if (llIIlIIlIIll(91941, 4714)) {
                            throw null;
                        } else {
                            GlStateManager.func_179114_b((float) var10000 * var7, 1.0F, 0.0F, 0.0F);
                            if (llIIlIIlIIll(91941, 4714)) {
                                throw null;
                            } else {
                                GlStateManager.func_179152_a(-0.025F, -0.025F, 0.025F);
                                if (llIIlIIlIIll(91941, 4714)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179140_f();
                                    if (llIIlIIlIIll(91941, 4714)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_179132_a(false);
                                        if (llIIlIIlIIll(91941, 4714)) {
                                            throw null;
                                        } else {
                                            if (llIIlIIlIlII(var9)) {
                                                GlStateManager.func_179097_i();
                                                if (llIIlIIlIIll(91941, 4714)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(91941, 4714)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_179147_l();
                                                if (llIIlIIlIIll(91941, 4714)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                        throw null;
                                                    } else {
                                                        int var10 = var0.func_78256_a(var1) / 2;
                                                        GlStateManager.func_179090_x();
                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                            throw null;
                                                        } else {
                                                            Tessellator var12 = Tessellator.func_178181_a();
                                                            if (llIIlIIlIIll(91941, 4714)) {
                                                                throw null;
                                                            } else {
                                                                BufferBuilder var11 = var12.func_178180_c();
                                                                var11.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                                                                var11.func_181662_b((double) (-var10 - 1), (double) (-1 + var5), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                                                                var11.func_181662_b((double) (-var10 - 1), (double) (8 + var5), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                                                                var11.func_181662_b((double) (var10 + 1), (double) (8 + var5), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                                                                var11.func_181662_b((double) (var10 + 1), (double) (-1 + var5), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                                                                var12.func_78381_a();
                                                                GlStateManager.func_179098_w();
                                                                if (llIIlIIlIIll(91941, 4714)) {
                                                                    throw null;
                                                                } else {
                                                                    if (llIIlIIlIlII(var9)) {
                                                                        var0.func_78276_b(var1, -var0.func_78256_a(var1) / 2, var5, 553648127);
                                                                        GlStateManager.func_179126_j();
                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                            throw null;
                                                                        }
                                                                    }

                                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                                        throw null;
                                                                    } else {
                                                                        GlStateManager.func_179132_a(true);
                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                            throw null;
                                                                        } else {
                                                                            int var10002 = -var0.func_78256_a(var1) / 2;
                                                                            int var10004;
                                                                            if (llIIlIIlIIlI(var9)) {
                                                                                var10004 = 553648127;
                                                                                boolean var10005 = true;
                                                                            } else {
                                                                                if (llIIlIIlIIll(91941, 4714)) {
                                                                                    throw null;
                                                                                }

                                                                                var10004 = -1;
                                                                            }

                                                                            if (llIIlIIlIIll(91941, 4714)) {
                                                                                throw null;
                                                                            } else {
                                                                                var0.func_78276_b(var1, var10002, var5, var10004);
                                                                                GlStateManager.func_179145_e();
                                                                                if (llIIlIIlIIll(91941, 4714)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.func_179084_k();
                                                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
                                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GlStateManager.func_179121_F();
                                                                                            if (llIIlIIlIIll(91941, 4714)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                boolean var13 = true;
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

    private static boolean llIIlIIlIIlI(int var0) {
        return var0 != 0;
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, float var2) {
        Entity var3 = this.                                                                                   .
        func_175606_aa();
        this.func_191514_d(false);
        GlStateManager.func_187432_a(0.0F, -1.0F, 0.0F);
        if (llIIlIIlIIll(75491, 5815)) {
            throw null;
        } else {
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
            if (llIIlIIlIIll(75491, 5815)) {
                throw null;
            } else {
                IBlockState var10001 = ActiveRenderInfo.func_186703_a(this..field_71441_e, var3, var2);
                if (llIIlIIlIIll(75491, 5815)) {
                    throw null;
                } else {
                    IBlockState var4 = var10001;
                    float var10000 = ForgeHooksClient.getFogDensity(this, var3, var4, var2, 0.1F);
                    if (llIIlIIlIIll(75491, 5815)) {
                        throw null;
                    } else {
                        float var5 = var10000;
                        boolean var7;
                        float var10;
                        if (llIIlIIllIII((var10 = var10000 - 0.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1))) {
                            GlStateManager.func_179095_a(var5);
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            }

                            var7 = true;
                        } else {
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            }

                            ContextCapabilities var9;
                            if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).func_70644_a(MobEffects.field_76440_q))) {
                                var5 = 5.0F;
                                int var6;
                                if (llIIlIIlIllI(var6 = ((EntityLivingBase) var3).func_70660_b(MobEffects.field_76440_q).func_76459_b(), 20)) {
                                    var5 = 5.0F + (this. - 5.0F) * (1.0F - (float) var6 / 20.0F);
                                }

                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                GlStateManager.func_187430_a(FogMode.LINEAR);
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                if (llIIlIIlIlIl(var1, -1)) {
                                    GlStateManager.func_179102_b(0.0F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179153_c(var5 * 0.8F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    var7 = true;
                                } else {
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179102_b(var5 * 0.25F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179153_c(var5);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }
                                }

                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                var9 = GLContext.getCapabilities();
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                if (llIIlIIlIIlI(var9.GL_NV_fog_distance)) {
                                    GlStateManager.func_187412_c(34138, 34139);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    var7 = true;
                                }
                            } else {
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                if (llIIlIIlIIlI(this.)) {
                                    GlStateManager.func_187430_a(FogMode.EXP);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179095_a(0.1F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    var7 = true;
                                } else {
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    if (llIIlIlIIIIl(var4.func_185904_a(), Material.field_151586_h)) {
                                        GlStateManager.func_187430_a(FogMode.EXP);
                                        if (llIIlIIlIIll(75491, 5815)) {
                                            throw null;
                                        }

                                        if (llIIlIIlIIlI(var3 instanceof EntityLivingBase)) {
                                            if (llIIlIIlIIlI(((EntityLivingBase) var3).func_70644_a(MobEffects.field_76427_o))) {
                                                GlStateManager.func_179095_a(0.01F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            } else {
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                int var8 = EnchantmentHelper.func_185292_c((EntityLivingBase) var3);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179095_a(0.1F - (float) var8 * 0.03F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            }
                                        } else {
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            GlStateManager.func_179095_a(0.1F);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var7 = true;
                                        }
                                    } else {
                                        if (llIIlIIlIIll(75491, 5815)) {
                                            throw null;
                                        }

                                        if (llIIlIlIIIIl(var4.func_185904_a(), Material.field_151587_i)) {
                                            GlStateManager.func_187430_a(FogMode.EXP);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            GlStateManager.func_179095_a(2.0F);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var7 = true;
                                        } else {
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var5 = this.;
                                            GlStateManager.func_187430_a(FogMode.LINEAR);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            if (llIIlIIlIlIl(var1, -1)) {
                                                GlStateManager.func_179102_b(0.0F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179153_c(var5);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            } else {
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179102_b(var5 * 0.75F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179153_c(var5);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var9 = GLContext.getCapabilities();
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            if (llIIlIIlIIlI(var9.GL_NV_fog_distance)) {
                                                GlStateManager.func_187412_c(34138, 34139);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            if (!llIIlIIlIlII(this..field_71441_e.field_73011_w.func_76568_b((int) var3.field_70165_t, (int) var3.field_70161_v)) ||
                                            llIIlIIlIIlI(this..field_71456_v.func_184046_j().func_184056_f())){
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179102_b(var5 * 0.05F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var10000 = Math.min(var5, 192.0F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.func_179153_c(var10000 * 0.5F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            ForgeHooksClient.onFogRender(this, var3, var4, var2, var1, var5);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        if (llIIlIIlIIll(75491, 5815)) {
                            throw null;
                        } else {
                            GlStateManager.func_179142_g();
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            } else {
                                GlStateManager.func_179127_m();
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179104_a(1028, 4608);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    } else {
                                        var7 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void ____________________________________________________________________________/* $FF was:                                                                             */() {
        float var1 = 1.0F;
        if (llIIlIIlIIlI(this..func_175606_aa() instanceof AbstractClientPlayer)){
            var1 = ((AbstractClientPlayer) this..func_175606_aa()).func_175156_o();
        }

        if (llIIlIIlIIll(55615, 5114)) {
            throw null;
        } else {
            this. = this.;
            this. += (var1 - this.) * 0.5F;
            float var2;
            if (llIIlIIllIlI((var2 = this. - 1.5F) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1))) {
                this. = 1.5F;
            }

            if (llIIlIIlIIll(55615, 5114)) {
                throw null;
            } else {
                float var3;
                if (llIIlIlIIIII((var3 = this. - 0.1F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1))) {
                    this. = 0.1F;
                }

                if (llIIlIIlIIll(55615, 5114)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    private void __________________________________________________________________________________/* $FF was:                                                                                   */(float var1) {
        Entity var2;
        float var3;
        double var4;
        double var6;
        double var8;
        boolean var38;
        Class25 var42;
        label259:
        {
            Entity var10000 = var2 = this.                                                                                   .
            func_175606_aa();
            var3 = var10000.func_70047_e();
            var4 = var10000.field_70169_q + (var2.field_70165_t - var2.field_70169_q) * (double) var1;
            var6 = var2.field_70167_r + (var2.field_70163_u - var2.field_70167_r) * (double) var1 + (double) var3;
            var8 = var10000.field_70166_s + (var2.field_70161_v - var2.field_70166_s) * (double) var1;
            boolean var10001;
            if (llIIlIIlIIlI(var10000 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var2).func_70608_bn())) {
                var3 = (float) ((double) var3 + 1.0D);
                GlStateManager.func_179109_b(0.0F, 0.3F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                if (llIIlIIlIlII(this..field_71474_y.field_74325_U)){
                    BlockPos var43 = new BlockPos(var2);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    BlockPos var27 = var43;
                    var42 = this;
                    IBlockState var29 = this.                                                                                   .
                    field_71441_e.func_180495_p(var27);
                    ForgeHooksClient.orientBedCamera(this..field_71441_e, var27, var29, var2);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.func_179114_b(var2.field_70126_B + (var2.field_70177_z - var2.field_70126_B) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.func_179114_b(var2.field_70127_C + (var2.field_70125_A - var2.field_70127_C) * var1, -1.0F, 0.0F, 0.0F);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    var10001 = true;
                    break label259;
                }
            } else {
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                if (llIIlIIllIlI(this..field_71474_y.field_74320_O)){
                    Class171 var34 = Class133. (62);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    Class78 var10;
                    int var35;
                    float var36;
                    if (llIIlIIlIIlI((var10 = (Class78) var34). ())){
                        var35 = Math.round((float) var10.. ());
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = (float) var35;
                        var10001 = true;
                    } else{
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = 4.0F;
                    }

                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    double var11 = (double) var36;
                    if (llIIlIIlIIlI(this..field_71474_y.field_74325_U)){
                        GlStateManager.func_179109_b(0.0F, 0.0F, (float) (-var11));
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var38 = true;
                    } else{
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        float var13 = var2.field_70177_z;
                        float var14 = var2.field_70125_A;
                        if (llIIlIIlIlIl(this..field_71474_y.field_74320_O,2)){
                            var14 += 180.0F;
                        }

                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = MathHelper.func_76126_a(var13 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = -var36;
                        float var37 = MathHelper.func_76134_b(var14 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        double var15 = (double) (var36 * var37) * var11;
                        var36 = MathHelper.func_76134_b(var13 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var37 = MathHelper.func_76134_b(var14 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        double var17 = (double) (var36 * var37) * var11;
                        var36 = MathHelper.func_76126_a(var14 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        double var19 = (double) (-var36) * var11;
                        if (!llIIlIIlIIlI(var10. ()) ||llIIlIIlIlII(var10.. ())){
                            if (llIIlIIlIIll(84597, 5111)) {
                                throw null;
                            }

                            int var21;
                            var35 = var21 = 0;

                            while (true) {
                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                if (!llIIlIIlIllI(var35, 8)) {
                                    break;
                                }

                                float var22 = (float) ((var21 & 1) * 2 - 1);
                                float var23 = (float) ((var21 >> 1 & 1) * 2 - 1);
                                float var24 = (float) ((var21 >> 2 & 1) * 2 - 1);
                                var22 *= 0.1F;
                                var23 *= 0.1F;
                                var24 *= 0.1F;
                                WorldClient var40 = this.                                                                                   .
                                field_71441_e;
                                Vec3d var39 = new Vec3d(var4 + (double) var22, var6 + (double) var23, var8 + (double) var24);
                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                Vec3d var10002 = new Vec3d(var4 - var15 + (double) var22 + (double) var24, var6 - var19 + (double) var23, var8 - var17 + (double) var24);
                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                RayTraceResult var45;
                                if (llIIlIIlllIl(var45 = var40.func_72933_a(var39, var10002))) {
                                    Vec3d var41 = var45.field_72307_f;
                                    var39 = new Vec3d(var4, var6, var8);
                                    if (llIIlIIlIIll(84597, 5111)) {
                                        throw null;
                                    }

                                    double var25;
                                    double var48;
                                    if (llIIlIlIIIII((var48 = (var25 = var41.func_72438_d(var39)) - var11) == 0.0D ? 0 : (var48 < 0.0D ? -1 : 1))) {
                                        var11 = var25;
                                    }
                                }

                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                ++var21;
                                var35 = var21;
                                var10001 = true;
                            }
                        }

                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        if (llIIlIIlIlIl(this..field_71474_y.field_74320_O,2)){
                            GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
                            if (llIIlIIlIIll(84597, 5111)) {
                                throw null;
                            }
                        }

                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(var2.field_70125_A - var14, 1.0F, 0.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(var2.field_70177_z - var13, 0.0F, 1.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.func_179109_b(0.0F, 0.0F, (float) (-var11));
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(var13 - var2.field_70177_z, 0.0F, 1.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.func_179114_b(var14 - var2.field_70125_A, 1.0F, 0.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var38 = true;
                    }
                } else{
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.func_179109_b(0.0F, 0.0F, 0.05F);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }
                }
            }

            if (llIIlIIlIIll(84597, 5111)) {
                throw null;
            }

            var42 = this;
        }

        if (llIIlIIlIIll(84597, 5111)) {
            throw null;
        } else {
            if (llIIlIIlIlII(var42..field_71474_y.field_74325_U)){
                float var28 = var2.field_70126_B + (var2.field_70177_z - var2.field_70126_B) * var1 + 180.0F;
                float var30 = var2.field_70127_C + (var2.field_70125_A - var2.field_70127_C) * var1;
                float var12 = 0.0F;
                if (llIIlIIlIIlI(var2 instanceof EntityAnimal)) {
                    EntityAnimal var31;
                    EntityAnimal var44 = var31 = (EntityAnimal) var2;
                    var28 = var44.field_70758_at + (var44.field_70759_as - var31.field_70758_at) * var1 + 180.0F;
                }

                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                IBlockState var46 = ActiveRenderInfo.func_186703_a(this..field_71441_e, var2, var1);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                IBlockState var32 = var46;
                CameraSetup var47 = new CameraSetup(this, var2, var32, (double) var1, var28, var30, var12);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                CameraSetup var33 = var47;
                MinecraftForge.EVENT_BUS.post(var33);
                GlStateManager.func_179114_b(var33.getRoll(), 0.0F, 0.0F, 1.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                GlStateManager.func_179114_b(var33.getPitch(), 1.0F, 0.0F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                GlStateManager.func_179114_b(var33.getYaw(), 0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(84597, 5111)) {
                throw null;
            } else {
                GlStateManager.func_179109_b(0.0F, -var3, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                } else {
                    var4 = var2.field_70169_q + (var2.field_70165_t - var2.field_70169_q) * (double) var1;
                    var6 = var2.field_70167_r + (var2.field_70163_u - var2.field_70167_r) * (double) var1 + (double) var3;
                    var8 = var2.field_70166_s + (var2.field_70161_v - var2.field_70166_s) * (double) var1;
                    this. = this.                                                                                   .
                    field_71438_f.func_72721_a(var4, var6, var8, var1);
                    var38 = true;
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, int var2, float var3) {
        if (llIIlIIlllIl(this.) && llIIlIIllIlI(this.)) {
            float var10000 = var3 = ((float) (40 - this.) + var3) / 40.0F;
            float var4 = var10000 * var10000;
            float var5 = var3 * var4;
            var4 = (10.25F * var5 * var4 + -24.95F * var4 * var4 + 25.5F * var5 + -13.8F * var4 + 4.0F * var3) * 3.1415927F;
            var5 = this. * (float) (var1 / 4);
            float var6 = this. * (float) (var2 / 4);
            GlStateManager.func_179141_d();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179094_E();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179123_a();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179126_j();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179129_p();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179124_c(1.0F, 1.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            RenderHelper.func_74519_b();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            float var10001 = (float) (var1 / 2);
            float var10003 = MathHelper.func_76126_a(var4 * 2.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10003 = MathHelper.func_76135_e(var10003);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10001 += var5 * var10003;
            float var10002 = (float) (var2 / 2);
            float var10004 = MathHelper.func_76126_a(var4 * 2.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10004 = MathHelper.func_76135_e(var10004);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179109_b(var10001, var10002 + var6 * var10004, -50.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10003 = MathHelper.func_76126_a(var4);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179152_a(var1, -(var1 = 50.0F + 175.0F * var10003), var1);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.func_76126_a(var4);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.func_76135_e(var10002);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179114_b(900.0F * var10002, 0.0F, 1.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.func_76134_b(var3 * 8.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179114_b(6.0F * var10002, 1.0F, 0.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.func_76134_b(var3 * 8.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179114_b(6.0F * var10002, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            this.                                                                                   .
            func_175599_af().func_181564_a(this., TransformType.FIXED);
            GlStateManager.func_179099_b();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179121_F();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            RenderHelper.func_74518_a();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179089_o();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.func_179097_i();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }
        }

        if (llIIlIIlIIll(40748, 5199)) {
            throw null;
        } else {
            boolean var7 = true;
        }
    }

    private float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, boolean var2) {
        float var3;
        if (llIIlIIlIIlI((var3 = this. - this.) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1))) {
            Class22. (this.);
            if (llIIlIIlIIll(94849, 9537)) {
                throw null;
            }

            this. = this.;
        }

        if (llIIlIIlIIll(94849, 9537)) {
            throw null;
        } else {
            float var4;
            if (llIIlIIlIIlI((var4 = this. - this.) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))) {
                Class22. (this.);
                if (llIIlIIlIIll(94849, 9537)) {
                    throw null;
                }

                this. = this.;
            }

            if (llIIlIIlIIll(94849, 9537)) {
                throw null;
            } else {
                float var10000 = Class22. (var1, var2);
                if (llIIlIIlIIll(94849, 9537)) {
                    throw null;
                } else {
                    return var10000;
                }
            }
        }
    }

    public void func_110549_a(IResourceManager var1) {
        if (llIIlIIlllIl(this.)) {
            this.                                                                                                                                     .
            func_148021_a();
        }

        if (llIIlIIlIIll(21176, 442)) {
            throw null;
        } else {
            this. = null;
            boolean var10000;
            if (llIIlIIlIlIl(this., )) {
                this.func_175066_a(this..func_175606_aa());
                var10000 = true;
            } else if (llIIlIIlIIll(21176, 442)) {
                throw null;
            } else {
                this.func_175069_a([this.]);
                var10000 = true;
            }
        }
    }

    public ShaderGroup func_147706_e() {
        return this.;
    }

    public void func_78471_a(float var1, long var2) {
        this. (var1);
        if (llIIlIIlIIll(48309, 6827)) {
            throw null;
        } else {
            if (llIIlIIlllII(this..func_175606_aa())){
                this.                                                                                   .
                func_175607_a(this..field_71439_g);
            }

            if (llIIlIIlIIll(48309, 6827)) {
                throw null;
            } else {
                this.func_78473_a(var1);
                GlStateManager.func_179126_j();
                if (llIIlIIlIIll(48309, 6827)) {
                    throw null;
                } else {
                    GlStateManager.func_179141_d();
                    if (llIIlIIlIIll(48309, 6827)) {
                        throw null;
                    } else {
                        GlStateManager.func_179092_a(516, 0.5F);
                        if (llIIlIIlIIll(48309, 6827)) {
                            throw null;
                        } else {
                            Profiler var10001 = this.                                                                                   .
                            field_71424_I;
                            String var10002 = Class60. ("y~wn{)");
                            if (llIIlIIlIIll(48309, 6827)) {
                                throw null;
                            } else {
                                var10001.func_76320_a(var10002);
                                Class25 var10000;
                                if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                                                                                                              =0;
                                    GlStateManager.func_179135_a(false, true, true, false);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    var10000 = this;
                                    this. (0, var1, var2);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                                                                                              =1;
                                    GlStateManager.func_179135_a(true, false, false, false);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    this. (1, var1, var2);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179135_a(true, true, true, false);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    boolean var5 = true;
                                } else{
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    var10000 = this;
                                    this. (2, var1, var2);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }
                                }

                                if (llIIlIIlIIll(48309, 6827)) {
                                    throw null;
                                } else {
                                    var10000.                                                                                   .
                                    field_71424_I.func_76319_b();
                                    boolean var4 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, float var2, long var3) {
        RenderGlobal var5 = this.                                                                                   .
        field_71438_f;
        ParticleManager var6 = this.                                                                                   .
        field_71452_i;
        byte var10005 = this. ();
        if (llIIlIIlIIll(23361, 6878)) {
            throw null;
        } else {
            byte var7 = var10005;
            GlStateManager.func_179089_o();
            if (llIIlIIlIIll(23361, 6878)) {
                throw null;
            } else {
                Profiler var10004 = this.                                                                                   .
                field_71424_I;
                String var32 = Class60. ("|ry~)");
                if (llIIlIIlIIll(23361, 6878)) {
                    throw null;
                } else {
                    var10004.func_76318_c(var32);
                    GlStateManager.func_179083_b(0, 0, this..field_71443_c, this.                                                                                   .
                    field_71440_d);
                    if (llIIlIIlIIll(23361, 6878)) {
                        throw null;
                    } else {
                        this. (var2);
                        if (llIIlIIlIIll(23361, 6878)) {
                            throw null;
                        } else {
                            GlStateManager.func_179086_m(16640);
                            if (llIIlIIlIIll(23361, 6878)) {
                                throw null;
                            } else {
                                Profiler var10002 = this.                                                                                   .
                                field_71424_I;
                                String var10003 = Class60. ("yzt\u007fl:");
                                if (llIIlIIlIIll(23361, 6878)) {
                                    throw null;
                                } else {
                                    var10002.func_76318_c(var10003);
                                    this.func_78479_a(var2, var1);
                                    Entity var10000 = this.                                                                                   .
                                    func_175606_aa();
                                    boolean var10001;
                                    boolean var22;
                                    if (llIIlIIlIlIl(this..field_71474_y.field_74320_O,2)){
                                        var10001 = true;
                                        var22 = true;
                                    } else{
                                        if (llIIlIIlIIll(23361, 6878)) {
                                            throw null;
                                        }

                                        var10001 = false;
                                    }

                                    if (llIIlIIlIIll(23361, 6878)) {
                                        throw null;
                                    } else {
                                        ActiveRenderInfo.updateRenderInfo(var10000, var10001);
                                        if (llIIlIIlIIll(23361, 6878)) {
                                            throw null;
                                        } else {
                                            Profiler var17 = this.                                                                                   .
                                            field_71424_I;
                                            String var21 = Class60. ("zojolh6");
                                            if (llIIlIIlIIll(23361, 6878)) {
                                                throw null;
                                            } else {
                                                var17.func_76318_c(var21);
                                                ClippingHelperImpl.func_78558_a();
                                                if (llIIlIIlIIll(23361, 6878)) {
                                                    throw null;
                                                } else {
                                                    Profiler var27 = this.                                                                                   .
                                                    field_71424_I;
                                                    String var29 = Class60. ("\u007fhspqs<");
                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                        throw null;
                                                    } else {
                                                        var27.func_76318_c(var29);
                                                        Frustum var28 = new Frustum();
                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                            throw null;
                                                        } else {
                                                            Frustum var8 = var28;
                                                            Entity var9 = this.                                                                                   .
                                                            func_175606_aa();
                                                            double var10 = var9.field_70142_S + (var9.field_70165_t - var9.field_70142_S) * (double) var2;
                                                            double var12 = var9.field_70137_T + (var9.field_70163_u - var9.field_70137_T) * (double) var2;
                                                            double var14 = var9.field_70136_U + (var9.field_70161_v - var9.field_70136_U) * (double) var2;
                                                            var8.func_78547_a(var10, var12, var14);
                                                            if (llIIlIIlIIll(this..field_71474_y.field_151451_c,4)){
                                                                this. (-1, var2);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Profiler var10007 = this.                                                                                   .
                                                                field_71424_I;
                                                                String var10008 = Class60. ("kr\"");
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                var10007.func_76318_c(var10008);
                                                                GlStateManager.func_179128_n(5889);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.func_179096_D();
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                float var33 = this. (var2, true);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Project.gluPerspective(var33, (float) this..field_71443_c / (float) this.                                                                                   .
                                                                field_71440_d, 0.05F, this. * 2.0F);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.func_179128_n(5888);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                var5.func_174976_a(var2, var1);
                                                                GlStateManager.func_179128_n(5889);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.func_179096_D();
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                float var23 = this. (var2, true);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Project.gluPerspective(var23, (float) this..field_71443_c / (float) this.                                                                                   .
                                                                field_71440_d, 0.05F, this. * MathHelper.field_180189_a)
                                                                ;
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.func_179128_n(5888);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }
                                                            }

                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                throw null;
                                                            } else {
                                                                this. (0, var2);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                } else {
                                                                    GlStateManager.func_179103_j(7425);
                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                        throw null;
                                                                    } else {
                                                                        double var37;
                                                                        if (llIIlIlIIIII((var37 = var9.field_70163_u + (double) var9.func_70047_e() - 128.0D) == 0.0D ? 0 : (var37 < 0.0D ? -1 : 1))) {
                                                                            this. (var5, var2, var1, var10, var12, var14)
                                                                            ;
                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                throw null;
                                                                            }
                                                                        }

                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                            throw null;
                                                                        } else {
                                                                            var10004 = this.                                                                                   .
                                                                            field_71424_I;
                                                                            var32 = Class60.
                                                                            ("ji|j\u007fixnwic{\u007f5");
                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10004.func_76318_c(var32);
                                                                                this. (0, var2);
                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this.                                                                                   .
                                                                                    func_110434_K().func_110577_a(TextureMap.field_110575_b);
                                                                                    RenderHelper.func_74518_a();
                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var17 = this.                                                                                   .
                                                                                        field_71424_I;
                                                                                        var21 = Class60.
                                                                                        ("csfer\u007f~Hlshb+");
                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            int var10006;
                                                                                            double var24;
                                                                                            boolean var35;
                                                                                            label528:
                                                                                            {
                                                                                                var17.func_76318_c(var21);
                                                                                                var24 = (double) var2;
                                                                                                var10006 = this.++;
                                                                                                if (llIIlIIlIlII(this..field_71439_g.func_175149_v()))
                                                                                                {
                                                                                                    var10005 = Class133.
                                                                                                    (28);
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    if (llIIlIIlIlII(var10005)) {
                                                                                                        var10005 = Class133.
                                                                                                        (51);
                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                            throw null;
                                                                                                        }

                                                                                                        if (!llIIlIIlIIlI(var10005)) {
                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            var35 = false;
                                                                                                            break label528;
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                var35 = true;
                                                                                                var10006 = 20;
                                                                                            }

                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var5.func_174970_a(var9, var24, var8, var10006, var35);
                                                                                                Profiler var25;
                                                                                                String var26;
                                                                                                if (!llIIlIIlIIlI(var1) || llIIlIIlIlIl(var1, 2)) {
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var25 = this.                                                                                   .
                                                                                                    field_71424_I;
                                                                                                    var26 = Class60.
                                                                                                    ("nj|zk\u007f\u007fsft{(");
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var25.func_76318_c(var26);
                                                                                                    this.                                                                                   .
                                                                                                    field_71438_f.func_174967_a(var3);
                                                                                                }

                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var27 = this.                                                                                   .
                                                                                                    field_71424_I;
                                                                                                    var29 = Class60.
                                                                                                    ("hxmnyt5");
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var27.func_76318_c(var29);
                                                                                                        GlStateManager.func_179128_n(5888);
                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GlStateManager.func_179094_E();
                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                GlStateManager.func_179118_c();
                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    var5.func_174977_a(BlockRenderLayer.SOLID, (double) var2, var1, var9);
                                                                                                                    GlStateManager.func_179141_d();
                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        ITextureObject var18 = this.                                                                                   .
                                                                                                                        func_110434_K().func_110581_b(TextureMap.field_110575_b);
                                                                                                                        if (llIIlIIllIlI(this..field_71474_y.field_151442_I))
                                                                                                                        {
                                                                                                                            var22 = true;
                                                                                                                            boolean var30 = true;
                                                                                                                        } else
                                                                                                                        {
                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                throw null;
                                                                                                                            }

                                                                                                                            var22 = false;
                                                                                                                        }

                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            var18.func_174936_b(false, var22);
                                                                                                                            var5.func_174977_a(BlockRenderLayer.CUTOUT_MIPPED, (double) var2, var1, var9);
                                                                                                                            this.                                                                                   .
                                                                                                                            func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
                                                                                                                            this.                                                                                   .
                                                                                                                            func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174936_b(false, false);
                                                                                                                            var5.func_174977_a(BlockRenderLayer.CUTOUT, (double) var2, var1, var9);
                                                                                                                            this.                                                                                   .
                                                                                                                            func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
                                                                                                                            GlStateManager.func_179103_j(7424);
                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                GlStateManager.func_179092_a(516, 0.1F);
                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    if (llIIlIIlIlII(this.)) {
                                                                                                                                        GlStateManager.func_179128_n(5888);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        GlStateManager.func_179121_F();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        GlStateManager.func_179094_E();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        RenderHelper.func_74519_b();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var10004 = this.                                                                                   .
                                                                                                                                        field_71424_I;
                                                                                                                                        var32 = Class60.
                                                                                                                                        ("~tlrksy(");
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var10004.func_76318_c(var32);
                                                                                                                                        ForgeHooksClient.setRenderPass(0);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var5.func_180446_a(var9, var8, var2);
                                                                                                                                        ForgeHooksClient.setRenderPass(0);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        RenderHelper.func_74518_a();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        this.func_175072_h();
                                                                                                                                    }

                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        GlStateManager.func_179128_n(5888);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            GlStateManager.func_179121_F();
                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                if (llIIlIIlIIlI(var7) && llIIlIIlllIl(this..field_71476_x) &&
                                                                                                                                                llIIlIIlIlII(var9.func_70055_a(Material.field_151586_h)))
                                                                                                                                                {
                                                                                                                                                    EntityPlayer var16 = (EntityPlayer) var9;
                                                                                                                                                    GlStateManager.func_179118_c();
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10002 = this.                                                                                   .
                                                                                                                                                    field_71424_I;
                                                                                                                                                    var10003 = Class60.
                                                                                                                                                    ("shkpqs>");
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10002.func_76318_c(var10003);
                                                                                                                                                    byte var19 = ForgeHooksClient.onDrawBlockHighlight(var5, var16, this..field_71476_x,
                                                                                                                                                    0, var2)
                                                                                                                                                    ;
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIlII(var19)) {
                                                                                                                                                        var5.func_72731_b(var16, this..field_71476_x, 0, var2)
                                                                                                                                                        ;
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    GlStateManager.func_179141_d();
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }

                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    if (llIIlIIlIIlI(this..field_184132_p.func_190074_a()))
                                                                                                                                                    {
                                                                                                                                                        this.                                                                                   .
                                                                                                                                                        field_184132_p.func_190073_a(var2, var3);
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var10004 = this.                                                                                   .
                                                                                                                                                        field_71424_I;
                                                                                                                                                        var32 = Class60.
                                                                                                                                                        ("ppd`bzjDnzxf}f(");
                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            var10004.func_76318_c(var32);
                                                                                                                                                            GlStateManager.func_179147_l();
                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    this.                                                                                   .
                                                                                                                                                                    func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174936_b(false, false);
                                                                                                                                                                    Tessellator var31 = Tessellator.func_178181_a();
                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        Tessellator var34 = Tessellator.func_178181_a();
                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            var5.func_174981_a(var31, var34.func_178180_c(), var9, var2);
                                                                                                                                                                            this.                                                                                   .
                                                                                                                                                                            func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
                                                                                                                                                                            GlStateManager.func_179084_k();
                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (llIIlIIlIlII(this.)) {
                                                                                                                                                                                    this.func_180436_i();
                                                                                                                                                                                    Profiler var36 = this.                                                                                   .
                                                                                                                                                                                    field_71424_I;
                                                                                                                                                                                    String var10009 = Class60.
                                                                                                                                                                                    ("wslK~hhrpvu(");
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    var36.func_76318_c(var10009);
                                                                                                                                                                                    var6.func_78872_b(var9, var2);
                                                                                                                                                                                    RenderHelper.func_74518_a();
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    this.
                                                                                                                                                                                    (0, var2)
                                                                                                                                                                                    ;
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    var27 = this.                                                                                   .
                                                                                                                                                                                    field_71424_I;
                                                                                                                                                                                    var29 = Class60.
                                                                                                                                                                                    ("csbg~qxv(");
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    var27.func_76318_c(var29);
                                                                                                                                                                                    var6.func_78874_a(var9, var2);
                                                                                                                                                                                    this.func_175072_h();
                                                                                                                                                                                }

                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    GlStateManager.func_179132_a(false);
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        GlStateManager.func_179089_o();
                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            Profiler var10012 = this.                                                                                   .
                                                                                                                                                                                            field_71424_I;
                                                                                                                                                                                            String var10013 = Class60.
                                                                                                                                                                                            ("kx~hpx)");
                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                var10012.func_76318_c(var10013);
                                                                                                                                                                                                this.func_78474_d(var2);
                                                                                                                                                                                                GlStateManager.func_179132_a(true);
                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    var5.func_180449_a(var9, var2);
                                                                                                                                                                                                    GlStateManager.func_179084_k();
                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        GlStateManager.func_179089_o();
                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                GlStateManager.func_179092_a(516, 0.1F);
                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    this.
                                                                                                                                                                                                                    (0, var2)
                                                                                                                                                                                                                    ;
                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        GlStateManager.func_179147_l();
                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            GlStateManager.func_179132_a(false);
                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                this.                                                                                   .
                                                                                                                                                                                                                                func_110434_K().func_110577_a(TextureMap.field_110575_b);
                                                                                                                                                                                                                                GlStateManager.func_179103_j(7425);
                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    var10002 = this.                                                                                   .
                                                                                                                                                                                                                                    field_71424_I;
                                                                                                                                                                                                                                    var10003 = Class60.
                                                                                                                                                                                                                                    ("dcr~g}bs}\u007f/");
                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        var10002.func_76318_c(var10003);
                                                                                                                                                                                                                                        var5.func_174977_a(BlockRenderLayer.TRANSLUCENT, (double) var2, var1, var9);
                                                                                                                                                                                                                                        if (llIIlIIlIlII(this.)) {
                                                                                                                                                                                                                                            RenderHelper.func_74519_b();
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var27 = this.                                                                                   .
                                                                                                                                                                                                                                            field_71424_I;
                                                                                                                                                                                                                                            var29 = Class60.
                                                                                                                                                                                                                                            ("~tlrksy(");
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var27.func_76318_c(var29);
                                                                                                                                                                                                                                            ForgeHooksClient.setRenderPass(1);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var5.func_180446_a(var9, var8, var2);
                                                                                                                                                                                                                                            GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            ForgeHooksClient.setRenderPass(-1);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            RenderHelper.func_74518_a();
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            GlStateManager.func_179103_j(7424);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                GlStateManager.func_179132_a(true);
                                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    GlStateManager.func_179089_o();
                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        GlStateManager.func_179084_k();
                                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            GlStateManager.func_179106_n();
                                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                double var38;
                                                                                                                                                                                                                                                                if (llIIlIIllIII((var38 = var9.field_70163_u + (double) var9.func_70047_e() - 128.0D) == 0.0D ? 0 : (var38 < 0.0D ? -1 : 1))) {
                                                                                                                                                                                                                                                                    var27 = this.                                                                                   .
                                                                                                                                                                                                                                                                    field_71424_I;
                                                                                                                                                                                                                                                                    var29 = Class60.
                                                                                                                                                                                                                                                                    ("qs|fqR{\u007fmu(");
                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                    var27.func_76318_c(var29);
                                                                                                                                                                                                                                                                    this.
                                                                                                                                                                                                                                                                    (var5, var2, var1, var10, var12, var14)
                                                                                                                                                                                                                                                                    ;
                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    var10004 = this.                                                                                   .
                                                                                                                                                                                                                                                                    field_71424_I;
                                                                                                                                                                                                                                                                    var32 = Class60.
                                                                                                                                                                                                                                                                    ("mezljU~nmneyXfex/");
                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        var10004.func_76318_c(var32);
                                                                                                                                                                                                                                                                        ForgeHooksClient.dispatchRenderLast(var5, var2);
                                                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            var25 = this.                                                                                   .
                                                                                                                                                                                                                                                                            field_71424_I;
                                                                                                                                                                                                                                                                            var26 = Class60.
                                                                                                                                                                                                                                                                            ("s{v?");
                                                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                var25.func_76318_c(var26);
                                                                                                                                                                                                                                                                                if (llIIlIIlIIlI(this.)) {
                                                                                                                                                                                                                                                                                    GlStateManager.func_179086_m(256);
                                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                    this.
                                                                                                                                                                                                                                                                                    (var2, var1)
                                                                                                                                                                                                                                                                                    ;
                                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
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
                        }
                    }
                }
            }
        }
    }

    public void func_78474_d(float var1) {
        IRenderHandler var2;
        boolean var40;
        if (llIIlIIlllIl(var2 = this..field_71441_e.field_73011_w.getWeatherRenderer())){
            var2.render(var1, this..field_71441_e, this.                                                                                   )
            ;
            var40 = true;
        } else if (llIIlIIlIIll(50829, 5417)) {
            throw null;
        } else {
            float var36;
            float var46;
            if (llIIlIIllIlI((var46 = (var36 = this..field_71441_e.func_72867_j(var1)) - 0.0F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1)))
            {
                this.func_180436_i();
                Entity var3 = this.                                                                                   .
                func_175606_aa();
                WorldClient var4 = this.                                                                                   .
                field_71441_e;
                int var10006 = MathHelper.func_76128_c(var3.field_70165_t);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var5 = var10006;
                int var10005 = MathHelper.func_76128_c(var3.field_70163_u);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var6 = var10005;
                int var10004 = MathHelper.func_76128_c(var3.field_70161_v);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var7 = var10004;
                Tessellator var41 = Tessellator.func_178181_a();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                Tessellator var8 = var41;
                BufferBuilder var9 = var41.func_178180_c();
                GlStateManager.func_179129_p();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.func_187432_a(0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.func_179147_l();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.func_179092_a(516, 0.1F);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                double var10 = var3.field_70142_S + (var3.field_70165_t - var3.field_70142_S) * (double) var1;
                double var12 = var3.field_70137_T + (var3.field_70163_u - var3.field_70137_T) * (double) var1;
                double var14 = var3.field_70136_U + (var3.field_70161_v - var3.field_70136_U) * (double) var1;
                int var10001 = MathHelper.func_76128_c(var12);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var16 = var10001;
                byte var17 = 5;
                if (llIIlIIlIIlI(this..field_71474_y.field_74347_j)){
                var17 = 10;
            }

                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                byte var18 = -1;
                float var19 = (float) this. + var1;
                var9.func_178969_c(-var10, -var12, -var14);
                GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                MutableBlockPos var10000 = new MutableBlockPos();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                MutableBlockPos var20 = var10000;
                int var21;
                int var37 = var21 = var7 - var17;

                label212:
                while (true) {
                    if (llIIlIIlIIll(50829, 5417)) {
                        throw null;
                    }

                    if (!llIIlIIlIlll(var37, var7 + var17)) {
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        if (llIIlIIllIII(var18)) {
                            var8.func_78381_a();
                        }

                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        var9.func_178969_c(0.0D, 0.0D, 0.0D);
                        GlStateManager.func_179089_o();
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        GlStateManager.func_179084_k();
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        GlStateManager.func_179092_a(516, 0.1F);
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        this.func_175072_h();
                        break;
                    }

                    int var22;
                    boolean var39;
                    for (var37 = var22 = var5 - var17; !llIIlIIlIIll(50829, 5417); var39 = true) {
                        if (!llIIlIIlIlll(var37, var5 + var17)) {
                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            ++var21;
                            var37 = var21;
                            var39 = true;
                            continue label212;
                        }

                        int var23 = (var21 - var7 + 16) * 32 + var22 - var5 + 16;
                        var10 = (double) this.                                                                            [
                        var23] *0.5D;
                        var12 = (double) this.                                                                                                      [
                        var23] *0.5D;
                        var20.func_181079_c(var22, 0, var21);
                        Biome var42 = var4.func_180494_b(var20);
                        if (!llIIlIIlIlII(var42.func_76738_d()) || llIIlIIlIIlI(var42.func_76746_c())) {
                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            int var24 = var4.func_175725_q(var20).func_177956_o();
                            int var25 = var6 - var17;
                            int var26 = var6 + var17;
                            if (llIIlIIlIllI(var25, var24)) {
                                var25 = var24;
                            }

                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            if (llIIlIIlIllI(var26, var24)) {
                                var26 = var24;
                            }

                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            int var27 = var24;
                            if (llIIlIIlIllI(var24, var16)) {
                                var27 = var16;
                            }

                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            if (llIIlIIlllll(var25, var26)) {
                                this.                                                                                              .
                                setSeed((long) (var22 * var22 * 3121 + var22 * 45238971 ^ var21 * var21 * 418711 + var21 * 13761));
                                var20.func_181079_c(var22, var25, var21);
                                float var43 = var42.func_180626_a(var20);
                                double var28;
                                double var30;
                                float var38;
                                float var47;
                                if (llIIlIIllIII((var47 = var4.func_72959_q().func_76939_a(var43, var24) - 0.15F) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1))) {
                                    if (llIIlIIlIIlI(var18)) {
                                        if (llIIlIIllIII(var18)) {
                                            var8.func_78381_a();
                                        }

                                        if (llIIlIIlIIll(50829, 5417)) {
                                            throw null;
                                        }

                                        var18 = 0;
                                        this.                                                                                   .
                                        func_110434_K().func_110577_a();
                                        var9.func_181668_a(7, DefaultVertexFormats.field_181704_d);
                                    }

                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var14 = -((double) (this. + var22 * var22 * 3121 + var22 * 45238971 + var21 * var21 * 418711 + var21 * 13761 & 31) + (double) var1) / 32.0D * (3.0D + this..nextDouble())
                                    ;
                                    var28 = (double) ((float) var22 + 0.5F) - var3.field_70165_t;
                                    var30 = (double) ((float) var21 + 0.5F) - var3.field_70161_v;
                                    var38 = MathHelper.func_76133_a(var28 * var28 + var30 * var30);
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    float var32 = var38 / (float) var17;
                                    float var33 = ((1.0F - var32 * var32) * 0.5F + 0.5F) * var36;
                                    var20.func_181079_c(var22, var27, var21);
                                    int var34;
                                    int var35 = (var34 = var4.func_175626_b(var20, 0)) >> 16 & '\uffff';
                                    var23 = var34 & '\uffff';
                                    var9.func_181662_b((double) var22 - var10 + 0.5D, (double) var26, (double) var21 - var12 + 0.5D).func_187315_a(0.0D, (double) var25 * 0.25D + var14).func_181666_a(1.0F, 1.0F, 1.0F, var33).func_187314_a(var35, var23).func_181675_d();
                                    var9.func_181662_b((double) var22 + var10 + 0.5D, (double) var26, (double) var21 + var12 + 0.5D).func_187315_a(1.0D, (double) var25 * 0.25D + var14).func_181666_a(1.0F, 1.0F, 1.0F, var33).func_187314_a(var35, var23).func_181675_d();
                                    var9.func_181662_b((double) var22 + var10 + 0.5D, (double) var25, (double) var21 + var12 + 0.5D).func_187315_a(1.0D, (double) var26 * 0.25D + var14).func_181666_a(1.0F, 1.0F, 1.0F, var33).func_187314_a(var35, var23).func_181675_d();
                                    var9.func_181662_b((double) var22 - var10 + 0.5D, (double) var25, (double) var21 - var12 + 0.5D).func_187315_a(0.0D, (double) var26 * 0.25D + var14).func_181666_a(1.0F, 1.0F, 1.0F, var33).func_187314_a(var35, var23).func_181675_d();
                                    var40 = true;
                                } else {
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    if (llIIlIIlllll(var18, 1)) {
                                        if (llIIlIIllIII(var18)) {
                                            var8.func_78381_a();
                                        }

                                        if (llIIlIIlIIll(50829, 5417)) {
                                            throw null;
                                        }

                                        var18 = 1;
                                        this.                                                                                   .
                                        func_110434_K().func_110577_a();
                                        var9.func_181668_a(7, DefaultVertexFormats.field_181704_d);
                                    }

                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var14 = (double) (-((float) (this. & 511) + var1) / 512.0F);
                                    var28 = this.                                                                                              .
                                    nextDouble() + (double) var19 * 0.01D * (double) ((float) this..nextGaussian());
                                    var30 = this.                                                                                              .
                                    nextDouble() + (double) (var19 * (float) this..nextGaussian()) *0.001D;
                                    double var44 = (double) ((float) var22 + 0.5F) - var3.field_70165_t;
                                    double var45 = (double) ((float) var21 + 0.5F) - var3.field_70161_v;
                                    var38 = MathHelper.func_76133_a(var44 * var44 + var45 * var45);
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var43 = var38 / (float) var17;
                                    var43 = ((1.0F - var43 * var43) * 0.3F + 0.5F) * var36;
                                    var20.func_181079_c(var22, var27, var21);
                                    var27 = (var24 = (var4.func_175626_b(var20, 0) * 3 + 15728880) / 4) >> 16 & '\uffff';
                                    var24 &= 65535;
                                    var9.func_181662_b((double) var22 - var10 + 0.5D, (double) var26, (double) var21 - var12 + 0.5D).func_187315_a(0.0D + var28, (double) var25 * 0.25D + var14 + var30).func_181666_a(1.0F, 1.0F, 1.0F, var43).func_187314_a(var27, var24).func_181675_d();
                                    var9.func_181662_b((double) var22 + var10 + 0.5D, (double) var26, (double) var21 + var12 + 0.5D).func_187315_a(1.0D + var28, (double) var25 * 0.25D + var14 + var30).func_181666_a(1.0F, 1.0F, 1.0F, var43).func_187314_a(var27, var24).func_181675_d();
                                    var9.func_181662_b((double) var22 + var10 + 0.5D, (double) var25, (double) var21 + var12 + 0.5D).func_187315_a(1.0D + var28, (double) var26 * 0.25D + var14 + var30).func_181666_a(1.0F, 1.0F, 1.0F, var43).func_187314_a(var27, var24).func_181675_d();
                                    var9.func_181662_b((double) var22 - var10 + 0.5D, (double) var25, (double) var21 - var12 + 0.5D).func_187315_a(0.0D + var28, (double) var26 * 0.25D + var14 + var30).func_181666_a(1.0F, 1.0F, 1.0F, var43).func_187314_a(var27, var24).func_181675_d();
                                }
                            }
                        }

                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        ++var22;
                        var37 = var22;
                    }

                    throw null;
                }
            }

            if (llIIlIIlIIll(50829, 5417)) {
                throw null;
            } else {
                var40 = true;
            }
        }
    }

    public void func_181022_b() {
        if (llIIlIIlllIl(this.)) {
            this.                                                                                                                                     .
            func_148021_a();
        }

        if (llIIlIIlIIll(54799, 4280)) {
            throw null;
        } else {
            this. = null;
            this. =;
            boolean var10000 = true;
        }
    }

    public void func_175069_a(ResourceLocation var1) {
        Logger var10000;
        String var10001;
        boolean var5;
        try {
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            ShaderGroup var10002 = new ShaderGroup(this..func_110434_K(), this., this.                                                                                   .
            func_147110_a(), var1);
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            this. = var10002;
            this.                                                                                                                                     .
            func_148026_a(this..field_71443_c, this.                                                                                   .
            field_71440_d);
            this. = true;
        } catch (IOException var3) {
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            var10000 =;
            var10001 = Class60. ("Eciobf$wd\"dlnf,p{ctfe84x&");
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            var10000.warn(var10001, var1, var3);
            this. =;
            this. = false;
            var5 = true;
            return;
        } catch (JsonSyntaxException var4) {
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            var10000 =;
            var10001 = Class60. ("Eciobf$wd\"dlnf,p{ctfe84x&");
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            var10000.warn(var10001, var1, var4);
            this. =;
            this. = false;
            var5 = true;
            return;
        }

        if (llIIlIIlIIll(20379, 6631)) {
            throw null;
        } else {
            var5 = true;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (llIIlIIlIlII(this.)) {
            return false;
        } else if (llIIlIIlIIll(89610, 5218)) {
            throw null;
        } else {
            byte var10000;
            boolean var10001;
            Entity var1;
            if (llIIlIIlIIlI((var1 = this..func_175606_aa()) instanceof EntityPlayer) &&
            llIIlIIlIlII(this..field_71474_y.field_74319_N)){
                var10000 = 1;
                var10001 = true;
            } else{
                if (llIIlIIlIIll(89610, 5218)) {
                    throw null;
                }

                var10000 = 0;
            }

            if (llIIlIIlIIll(89610, 5218)) {
                throw null;
            } else {
                byte var2 = var10000;
                if (llIIlIIlIIlI(var2) && llIIlIIlIlII(((EntityPlayer) var1).field_71075_bZ.field_75099_e)) {
                    ItemStack var5 = ((EntityPlayer) var1).func_184614_ca();
                    if (llIIlIIlllIl(this..field_71476_x) &&llIIlIlIIIIl(this..field_71476_x.field_72313_a, Type.BLOCK))
                    {
                        BlockPos var3 = this.                                                                                   .
                        field_71476_x.func_178782_a();
                        Block var4 = this.                                                                                   .
                        field_71441_e.func_180495_p(var3).func_177230_c();
                        if (llIIlIlIIIIl(this..field_71442_b.func_178889_l(),GameType.SPECTATOR)){
                        boolean var7;
                        if (llIIlIIlIIlI(var4.hasTileEntity(this..field_71441_e.func_180495_p(var3))) &&
                        llIIlIIlIIlI(this..field_71441_e.func_175625_s(var3) instanceof IInventory)){
                            var7 = true;
                            var10001 = true;
                        } else{
                            if (llIIlIIlIIll(89610, 5218)) {
                                throw null;
                            }

                            var7 = false;
                        }

                        if (llIIlIIlIIll(89610, 5218)) {
                            throw null;
                        }

                        boolean var6 = var7;
                        return var6;
                    }

                        if (llIIlIIlIIll(89610, 5218)) {
                            throw null;
                        }

                        if (llIIlIIlIlII(var5.func_190926_b()) && (!llIIlIIlIlII(var5.func_179544_c(var4)) || llIIlIIlIIlI(var5.func_179547_d(var4)))) {
                            if (llIIlIIlIIll(89610, 5218)) {
                                throw null;
                            }

                            var10000 = 1;
                            var10001 = true;
                        } else {
                            if (llIIlIIlIIll(89610, 5218)) {
                                throw null;
                            }

                            var10000 = 0;
                        }

                        if (llIIlIIlIIll(89610, 5218)) {
                            throw null;
                        }

                        var2 = var10000;
                    }
                }

                if (llIIlIIlIIll(89610, 5218)) {
                    throw null;
                } else {
                    return (boolean) var2;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void func_175072_h() {
        GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
        if (llIIlIIlIIll(49475, 6540)) {
            throw null;
        } else {
            GlStateManager.func_179090_x();
            if (llIIlIIlIIll(49475, 6540)) {
                throw null;
            } else {
                GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
                if (llIIlIIlIIll(49475, 6540)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    public void func_152430_c(float var1) {
        this.func_78478_c();
        boolean var10000 = true;
    }

    private float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityLivingBase var1, float var2) {
        int var3;
        if (llIIlIIllIll(var3 = var1.func_70660_b(MobEffects.field_76439_r).func_76459_b(), 200)) {
            return 1.0F;
        } else if (llIIlIIlIIll(19728, 532)) {
            throw null;
        } else {
            float var10001 = MathHelper.func_76126_a(((float) var3 - var2) * 3.1415927F * 0.2F);
            if (llIIlIIlIIll(19728, 532)) {
                throw null;
            } else {
                return 0.7F + var10001 * 0.3F;
            }
        }
    }

    public void func_175071_c() {
        boolean var10001;
        if (llIIlIIlIlII(this.)) {
            var10001 = true;
            boolean var10002 = true;
        } else {
            if (llIIlIIlIIll(83029, 9120)) {
                throw null;
            }

            var10001 = false;
        }

        if (llIIlIIlIIll(83029, 9120)) {
            throw null;
        } else {
            this. = var10001;
            boolean var10000 = true;
        }
    }

    public MapItemRenderer func_147701_i() {
        return this.;
    }

    public void func_78464_a() {
        if (llIIlIIlIIlI(OpenGlHelper.field_148824_g)) {
            ShaderLinkHelper var10000 = ShaderLinkHelper.func_148074_b();
            if (llIIlIIlIIll(89737, 5668)) {
                throw null;
            }

            if (llIIlIIlllII(var10000)) {
                ShaderLinkHelper.func_148076_a();
                if (llIIlIIlIIll(89737, 5668)) {
                    throw null;
                }
            }
        }

        if (llIIlIIlIIll(89737, 5668)) {
            throw null;
        } else {
            this. ();
            if (llIIlIIlIIll(89737, 5668)) {
                throw null;
            } else {
                this. ();
                if (llIIlIIlIIll(89737, 5668)) {
                    throw null;
                } else {
                    this. = this.;
                    float var1;
                    boolean var10001;
                    float var2;
                    Class25 var3;
                    if (llIIlIIlIIlI(this..field_71474_y.field_74326_T)){
                        var3 = this;
                        float var10007 = var1 = this.                                                                                   .
                        field_71474_y.field_74341_c * 0.6F + 0.2F;
                        var2 = var10007 * var10007 * var1 * 8.0F;
                        this. = this.                                                                                .
                        func_76333_a(this., 0.05F * var2);
                        this. = this.                                                                                                       .
                        func_76333_a(this., 0.05F * var2);
                        this. = 0.0F;
                        this. = 0.0F;
                        this. = 0.0F;
                        var10001 = true;
                    } else{
                        if (llIIlIIlIIll(89737, 5668)) {
                            throw null;
                        }

                        var3 = this;
                        this. = 0.0F;
                        this. = 0.0F;
                        this.                                                                                .
                        func_180179_a();
                        this.                                                                                                       .
                        func_180179_a();
                    }

                    if (llIIlIIlIIll(89737, 5668)) {
                        throw null;
                    } else {
                        if (llIIlIIlllII(var3..func_175606_aa())){
                            this.                                                                                   .
                            func_175607_a(this..field_71439_g);
                        }

                        if (llIIlIIlIIll(89737, 5668)) {
                            throw null;
                        } else {
                            WorldClient var10008 = this.                                                                                   .
                            field_71441_e;
                            BlockPos var10009 = new BlockPos(this..func_175606_aa().func_174824_e(1.0F));
                            if (llIIlIIlIIll(89737, 5668)) {
                                throw null;
                            } else {
                                var1 = var10008.func_175724_o(var10009);
                                var2 = (float) this.                                                                                   .
                                field_71474_y.field_151451_c / 32.0F;
                                var1 = var1 * (1.0F - var2) + var2;
                                this. += (var1 - this.) * 0.1F;
                                ++this.;
                                this.                                                                                                     .
                                func_78441_a();
                                this. ();
                                if (llIIlIIlIIll(89737, 5668)) {
                                    throw null;
                                } else {
                                    label93:
                                    {
                                        this. = this.;
                                        if (llIIlIIlIIlI(this..field_71456_v.func_184046_j().func_184053_e())){
                                        this. += 0.05F;
                                        float var5;
                                        if (llIIlIIllIlI((var5 = this. - 1.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1))) {
                                            var3 = this;
                                            this. = 1.0F;
                                            var10001 = true;
                                            break label93;
                                        }
                                    } else{
                                        if (llIIlIIlIIll(89737, 5668)) {
                                            throw null;
                                        }

                                        float var6;
                                        if (llIIlIIllIlI((var6 = this. - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1))) {
                                            this. -= 0.0125F;
                                        }
                                    }

                                        if (llIIlIIlIIll(89737, 5668)) {
                                            throw null;
                                        }

                                        var3 = this;
                                    }

                                    if (llIIlIIlIIll(89737, 5668)) {
                                        throw null;
                                    } else {
                                        if (llIIlIIllIlI(var3.)) {
                                            --this.;
                                            if (llIIlIIlIlII(this.)) {
                                                this. = null;
                                            }
                                        }

                                        if (llIIlIIlIIll(89737, 5668)) {
                                            throw null;
                                        } else {
                                            boolean var4 = true;
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

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGlobal var1, float var2, int var3, double var4, double var6, double var8) {
        if (llIIlIIlIIlI(this..field_71474_y.func_181147_e())){
            Profiler var10008 = this.                                                                                   .
            field_71424_I;
            String var10009 = Class60. ("ywvoz(");
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            var10008.func_76318_c(var10009);
            GlStateManager.func_179128_n(5889);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179096_D();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            float var10006 = this. (var2, true);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            Project.gluPerspective(var10006, (float) this..field_71443_c / (float) this.                                                                                   .
            field_71440_d, 0.05F, this. * 4.0F);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179128_n(5888);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179094_E();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            this. (0, var2);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            var1.func_180447_b(var2, var3, var4, var6, var8);
            GlStateManager.func_179106_n();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179121_F();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179128_n(5889);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179096_D();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            float var10001 = this. (var2, true);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            Project.gluPerspective(var10001, (float) this..field_71443_c / (float) this.                                                                                   .
            field_71440_d, 0.05F, this. * MathHelper.field_180189_a);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.func_179128_n(5888);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }
        }

        if (llIIlIIlIIll(78312, 2593)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private FloatBuffer ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, float var2, float var3, float var4) {
        this.                                                                                                                                                    .
        clear();
        this.                                                                                                                                                    .
        put(var1).put(var2).put(var3).put(var4);
        this.                                                                                                                                                    .
        flip();
        return this.;
    }

    public void func_181560_a(float var1, long var2) {
        byte var10000 = Display.isActive();
        if (llIIlIIlIIll(65756, 1744)) {
            throw null;
        } else {
            byte var4;
            long var10001;
            long var22;
            Class25 var23;
            boolean var24;
            label380:
            {
                label381:
                {
                    label382:
                    {
                        var4 = var10000;
                        if (llIIlIIlIlII(var10000) && llIIlIIlIIlI(this..field_71474_y.field_82881_y)){
                        if (!llIIlIIlIIlI(this..field_71474_y.field_85185_A)){
                            break label382;
                        }

                        var10000 = Mouse.isButtonDown(1);
                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        }

                        if (llIIlIIlIlII(var10000)) {
                            break label382;
                        }
                    }

                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        }

                        var10001 = Minecraft.func_71386_F();
                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        }

                        this. = var10001;
                        break label381;
                    }

                    if (llIIlIIlIIll(65756, 1744)) {
                        throw null;
                    }

                    var22 = Minecraft.func_71386_F();
                    if (llIIlIIlIIll(65756, 1744)) {
                        throw null;
                    }

                    long var40;
                    if (llIIlIIllIlI((var40 = var22 - this. - 500L) == 0L ? 0 : (var40 < 0L ? -1 : 1))) {
                        var23 = this;
                        this.                                                                                   .
                        func_71385_j();
                        var24 = true;
                        break label380;
                    }
                }

                if (llIIlIIlIIll(65756, 1744)) {
                    throw null;
                }

                var23 = this;
            }

            if (llIIlIIlIIll(65756, 1744)) {
                throw null;
            } else {
                Profiler var26 = var23.                                                                                   .
                field_71424_I;
                String var25 = Class60. ("rqil>");
                if (llIIlIIlIIll(65756, 1744)) {
                    throw null;
                } else {
                    var26.func_76320_a(var25);
                    int var27;
                    if (llIIlIIlIIlI(var4) && llIIlIIlIIlI(Minecraft.field_142025_a) && llIIlIIlIIlI(this..field_71415_G))
                    {
                        var10000 = Mouse.isInsideWindow();
                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        }

                        if (llIIlIIlIlII(var10000)) {
                            Mouse.setGrabbed(false);
                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            int var29 = Display.getWidth();
                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            var29 /= 2;
                            var27 = Display.getHeight();
                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            Mouse.setCursorPosition(var29, var27 / 2 - 20);
                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            Mouse.setGrabbed(true);
                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }
                        }
                    }

                    if (llIIlIIlIIll(65756, 1744)) {
                        throw null;
                    } else {
                        label385:
                        {
                            if (llIIlIIlIIlI(this..field_71415_G) &&llIIlIIlIIlI(var4)){
                            this.                                                                                   .
                            field_71417_B.func_74374_c();
                            this.                                                                                   .
                            func_193032_ao().func_193299_a(this..field_71417_B);
                            float var5;
                            float var10003 = var5 = this.                                                                                   .
                            field_71474_y.field_74341_c * 0.6F + 0.2F;
                            float var6 = var10003 * var10003 * var5 * 8.0F;
                            float var7 = (float) this.                                                                                   .
                            field_71417_B.field_74377_a * var6;
                            float var8 = (float) this.                                                                                   .
                            field_71417_B.field_74375_b * var6;
                            byte var9 = 1;
                            if (llIIlIIlIIlI(this..field_71474_y.field_74338_d)){
                                var9 = -1;
                            }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            if (llIIlIIlIIlI(this..field_71474_y.field_74326_T)){
                                var23 = this;
                                this. += var7;
                                this. += var8;
                                float var10 = var1 - this.;
                                this. = var1;
                                var7 = this. * var10;
                                var8 = this. * var10;
                                this.                                                                                   .
                                field_71439_g.func_70082_c(var7, var8 * (float) var9);
                                var24 = true;
                                break label385;
                            }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            this. = 0.0F;
                            this. = 0.0F;
                            this.                                                                                   .
                            field_71439_g.func_70082_c(var7, var8 * (float) var9);
                        }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            var23 = this;
                        }

                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        } else {
                            var23.                                                                                   .
                            field_71424_I.func_76319_b();
                            boolean var37;
                            if (llIIlIIlIlII(this..field_71454_w)){
                                                                                                                        =
                                this.                                                                                   .
                                field_71474_y.field_74337_g;
                                ScaledResolution var30 = new ScaledResolution(this.);
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                ScaledResolution var15 = var30;
                                int var16 = var30.func_78326_a();
                                int var17 = var30.func_78328_b();
                                var27 = Mouse.getX();
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                int var18 = var27 * var16 / this.                                                                                   .
                                field_71443_c;
                                int var10002 = Mouse.getY();
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                int var19 = var17 - var10002 * var17 / this.                                                                                   .
                                field_71440_d - 1;
                                int var20 = this.                                                                                   .
                                field_71474_y.field_74350_i;
                                String var31;
                                if (llIIlIIlllIl(this..field_71441_e)){
                                    Profiler var28 = this.                                                                                   .
                                    field_71424_I;
                                    var31 = Class60. ("s{jz7");
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var28.func_76320_a(var31);
                                    var10002 = Minecraft.func_175610_ah();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var10002 = Math.min(var10002, var20);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var10002 = Math.max(var10002, 60);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    int var14 = var10002;
                                    long var32 = System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    long var11 = var32 - var2;
                                    var32 = Math.max((long) (1000000000 / var14 / 4) - var11, 0L);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var2 = var32;
                                    long var33 = System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    this.func_78471_a(var1, var33 + var2);
                                    if (llIIlIIlIIlI(this..func_71356_B())){
                                        var22 = this.;
                                        var10001 = Minecraft.func_71386_F();
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        long var41;
                                        if (llIIlIlIIIII((var41 = var22 - (var10001 - 1000L)) == 0L ? 0 : (var41 < 0L ? -1 : 1))) {
                                            var32 = Minecraft.func_71386_F();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            this. = var32;
                                            if (llIIlIIlIlII(this..func_71401_C().func_184106_y())){
                                                this. ();
                                                if (llIIlIIlIIll(65756, 1744)) {
                                                    throw null;
                                                }
                                            }
                                        }
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    if (llIIlIIlIIlI(OpenGlHelper.field_148824_g)) {
                                        this.                                                                                   .
                                        field_71438_f.func_174975_c();
                                        if (llIIlIIlllIl(this.) && llIIlIIlIIlI(this.)) {
                                            GlStateManager.func_179128_n(5890);
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            GlStateManager.func_179094_E();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            GlStateManager.func_179096_D();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            this.                                                                                                                                     .
                                            func_148018_a(var1);
                                            GlStateManager.func_179121_F();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }
                                        }

                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.                                                                                   .
                                        func_147110_a().func_147610_a(true);
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    Profiler var34 = this.                                                                                   .
                                    field_71424_I;
                                    String var35 = Class60. ("\u007fl2");
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var34.func_76318_c(var35);
                                    if (!llIIlIIlIIlI(this..field_71474_y.field_74319_N) ||
                                    llIIlIIlllIl(this..field_71462_r)){
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        GlStateManager.func_179092_a(516, 0.1F);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.func_78478_c();
                                        this. (var16, var17, var1);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.                                                                                   .
                                        field_71456_v.func_175180_a(var1);
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var23 = this;
                                    this.                                                                                   .
                                    field_71424_I.func_76319_b();
                                    var24 = true;
                                } else{
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179083_b(0, 0, this..field_71443_c, this.                                                                                   .
                                    field_71440_d);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179128_n(5889);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179096_D();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179128_n(5888);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.func_179096_D();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var23 = this;
                                    this.func_78478_c();
                                    System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    TileEntityRendererDispatcher.field_147556_a.field_147553_e = this.                                                                                   .
                                    func_110434_K();
                                    TileEntityRendererDispatcher.field_147556_a.field_147557_n = this.                                                                                   .
                                    field_71466_p;
                                }

                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                if (llIIlIIlllIl(var23..field_71462_r)){
                                    GlStateManager.func_179086_m(256);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    try {
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        ForgeHooksClient.drawScreen(this..field_71462_r, var18, var19, this.                                                                                   .
                                        func_193989_ak());
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }
                                    } catch (Throwable var13) {
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var25 = Class60. ("I\u007fv\u007fzhuut:cxe\u007fq5");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        CrashReport var38 = CrashReport.func_85055_a(var13, var25);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        CrashReport var21 = var38;
                                        var25 = Class60. ("\\m~jn`(}b``jq.djkouc(");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        CrashReportCategory var12 = var38.func_85058_a(var25);
                                        String var10005 = Class60. ("Crauq\u007f7~y|>");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class68 var10006 = new Class68(this);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.func_189529_a(var10005, var10006);
                                        var31 = Class60. ("Wtli{;quqzesy5");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class174 var10004 = new Class174(this, var18, var19);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.func_189529_a(var31, var10004);
                                        var25 = Class60. ("Crauq\u007f7cqk>");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class183 var36 = new Class183(this, var15);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.func_189529_a(var25, var36);
                                        ReportedException var39 = new ReportedException(var21);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        throw var39;
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var37 = true;
                                    return;
                                }
                            }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            } else {
                                var37 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        double var10006 = (double) this.;
        double var10007 = Math.random();
        if (llIIlIIlIIll(18683, 8254)) {
            throw null;
        } else {
            double var10008 = Math.random();
            if (llIIlIIlIIll(18683, 8254)) {
                throw null;
            } else {
                var10007 -= var10008;
                var10008 = Math.random();
                if (llIIlIIlIIll(18683, 8254)) {
                    throw null;
                } else {
                    var10007 *= var10008;
                    var10008 = Math.random();
                    if (llIIlIIlIIll(18683, 8254)) {
                        throw null;
                    } else {
                        this. = (float) (var10006 + var10007 * var10008);
                        this. = (float) ((double) this. * 0.9D);
                        this. += this. - this.;
                        this. = true;
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1) {
        if (llIIlIIlIIlI(this.)) {
            Profiler var10001 = this.                                                                                   .
            field_71424_I;
            String var10002 = Class60. ("ws\u007fskNy#");
            if (llIIlIIlIIll(44752, 5413)) {
                throw null;
            }

            var10001.func_76320_a(var10002);
            WorldClient var2;
            if (llIIlIIlllIl(var2 = this..field_71441_e)){
                float var3;
                float var4 = (var3 = var2.func_72971_b(1.0F)) * 0.95F + 0.05F;
                int var5;
                int var10000 = var5 = 0;

                while (true) {
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    if (!llIIlIIlIllI(var10000, 256)) {
                        if (llIIlIIlIIll(44752, 5413)) {
                            throw null;
                        }

                        this.                                                                                                                              .
                        func_110564_a();
                        this. = false;
                        this.                                                                                   .
                        field_71424_I.func_76319_b();
                        break;
                    }

                    float var6 = var2.field_73011_w.func_177497_p()[var5 / 16] * var4;
                    float var7 = var2.field_73011_w.func_177497_p()[var5 % 16] * (this. * 0.1F + 1.5F);
                    if (llIIlIIllIlI(var2.func_175658_ac())) {
                        var6 = var2.field_73011_w.func_177497_p()[var5 / 16];
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var8 = var6 * (var3 * 0.65F + 0.35F);
                    float var9 = var6 * (var3 * 0.65F + 0.35F);
                    float var10 = var7 * ((var7 * 0.6F + 0.4F) * 0.6F + 0.4F);
                    float var11 = var7 * (var7 * var7 * 0.6F + 0.4F);
                    var8 += var7;
                    var9 += var10;
                    float var12 = var6 + var11;
                    var8 = var8 * 0.96F + 0.03F;
                    var9 = var9 * 0.96F + 0.03F;
                    var12 = var12 * 0.96F + 0.03F;
                    float var24;
                    if (llIIlIIllIlI((var24 = this. - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1))) {
                        float var13 = this. + (this. - this.) * var1;
                        var8 = var8 * (1.0F - var13) + var8 * 0.7F * var13;
                        var9 = var9 * (1.0F - var13) + var9 * 0.6F * var13;
                        var12 = var12 * (1.0F - var13) + var12 * 0.6F * var13;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    if (llIIlIIlIlIl(var2.field_73011_w.func_186058_p().func_186068_a(), 1)) {
                        var8 = 0.22F + var7 * 0.75F;
                        var9 = 0.28F + var10 * 0.75F;
                        var12 = 0.25F + var11 * 0.75F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float[] var16 = new float[]{var8, var9, var12};
                    var2.field_73011_w.getLightmapColors(var1, var3, var6, var7, var16);
                    var8 = var16[0];
                    var9 = var16[1];
                    var12 = var16[2];
                    float var20 = MathHelper.func_76131_a(var8, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var8 = var20;
                    var20 = MathHelper.func_76131_a(var9, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var9 = var20;
                    var20 = MathHelper.func_76131_a(var12, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var12 = var20;
                    if (llIIlIIlIIlI(this..field_71439_g.func_70644_a(MobEffects.field_76439_r))){
                        float var18 = this. (this..field_71439_g, var1);
                        if (llIIlIIlIIll(44752, 5413)) {
                            throw null;
                        }

                        var6 = var18;
                        float var25;
                        if (llIIlIIllIlI((var25 = (var7 = 1.0F / var8) - 1.0F / var9) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1))) {
                            var7 = 1.0F / var9;
                        }

                        if (llIIlIIlIIll(44752, 5413)) {
                            throw null;
                        }

                        float var26;
                        if (llIIlIIllIlI((var26 = var7 - 1.0F / var12) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1))) {
                            var7 = 1.0F / var12;
                        }

                        if (llIIlIIlIIll(44752, 5413)) {
                            throw null;
                        }

                        var8 = var8 * (1.0F - var6) + var8 * var7 * var6;
                        var9 = var9 * (1.0F - var6) + var9 * var7 * var6;
                        var12 = var12 * (1.0F - var6) + var12 * var7 * var6;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var27;
                    if (llIIlIIllIlI((var27 = var8 - 1.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1))) {
                        var8 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var28;
                    if (llIIlIIllIlI((var28 = var9 - 1.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1))) {
                        var9 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var29;
                    if (llIIlIIllIlI((var29 = var12 - 1.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1))) {
                        var12 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var6 = this.                                                                                   .
                    field_71474_y.field_74333_Y;
                    var7 = 1.0F - var8;
                    var10 = 1.0F - var9;
                    var11 = 1.0F - var12;
                    var7 = 1.0F - var7 * var7 * var7 * var7;
                    var10 = 1.0F - var10 * var10 * var10 * var10;
                    var11 = 1.0F - var11 * var11 * var11 * var11;
                    var8 = var8 * (1.0F - var6) + var7 * var6;
                    var9 = var9 * (1.0F - var6) + var10 * var6;
                    var12 = var12 * (1.0F - var6) + var11 * var6;
                    var8 = var8 * 0.96F + 0.03F;
                    var9 = var9 * 0.96F + 0.03F;
                    var12 = var12 * 0.96F + 0.03F;
                    float var30;
                    if (llIIlIIllIlI((var30 = var8 - 1.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1))) {
                        var8 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var31;
                    if (llIIlIIllIlI((var31 = var9 - 1.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1))) {
                        var9 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var32;
                    if (llIIlIIllIlI((var32 = var12 - 1.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1))) {
                        var12 = 1.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var33;
                    if (llIIlIlIIIII((var33 = var8 - 0.0F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1))) {
                        var8 = 0.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var34;
                    if (llIIlIlIIIII((var34 = var9 - 0.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1))) {
                        var9 = 0.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float var35;
                    if (llIIlIlIIIII((var35 = var12 - 0.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1))) {
                        var12 = 0.0F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    int var14 = (int) (var8 * 255.0F);
                    int var15 = (int) (var9 * 255.0F);
                    int var17 = (int) (var12 * 255.0F);
                    int var21 = var5;
                    int var22 = -16777216 | var14 << 16 | var15 << 8 | var17;
                    ++var5;
                    this.                                                                                                                       [
                    var21] =var22;
                    var10000 = var5;
                    boolean var23 = true;
                }
            }
        }

        if (llIIlIIlIIll(44752, 5413)) {
            throw null;
        } else {
            boolean var19 = true;
        }
    }

    public void func_78479_a(float var1, int var2) {
        this. = (float) (this..field_71474_y.field_151451_c * 16);
        GlStateManager.func_179128_n(5889);
        if (llIIlIIlIIll(92404, 1079)) {
            throw null;
        } else {
            GlStateManager.func_179096_D();
            if (llIIlIIlIIll(92404, 1079)) {
                throw null;
            } else {
                if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                    GlStateManager.func_179109_b((float) (-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
                    if (llIIlIIlIIll(92404, 1079)) {
                        throw null;
                    }
                }

                if (llIIlIIlIIll(92404, 1079)) {
                    throw null;
                } else {
                    double var5;
                    if (llIIlIIlIIlI((var5 = this. - 1.0D) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1))) {
                        GlStateManager.func_179109_b((float) this., (float) (-this.), 0.0F);
                        if (llIIlIIlIIll(92404, 1079)) {
                            throw null;
                        }

                        GlStateManager.func_179139_a(this., this., 1.0D);
                        if (llIIlIIlIIll(92404, 1079)) {
                            throw null;
                        }
                    }

                    if (llIIlIIlIIll(92404, 1079)) {
                        throw null;
                    } else {
                        float var10002 = this. (var1, true);
                        if (llIIlIIlIIll(92404, 1079)) {
                            throw null;
                        } else {
                            Project.gluPerspective(var10002, (float) this..field_71443_c / (float) this.                                                                                   .
                            field_71440_d, 0.05F, this. * MathHelper.field_180189_a);
                            if (llIIlIIlIIll(92404, 1079)) {
                                throw null;
                            } else {
                                GlStateManager.func_179128_n(5888);
                                if (llIIlIIlIIll(92404, 1079)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179096_D();
                                    if (llIIlIIlIIll(92404, 1079)) {
                                        throw null;
                                    } else {
                                        if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                                            GlStateManager.func_179109_b((float) (var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
                                            if (llIIlIIlIIll(92404, 1079)) {
                                                throw null;
                                            }
                                        }

                                        if (llIIlIIlIIll(92404, 1079)) {
                                            throw null;
                                        } else {
                                            this. (var1);
                                            if (llIIlIIlIIll(92404, 1079)) {
                                                throw null;
                                            } else {
                                                if (llIIlIIlIIlI(this..field_71474_y.field_74336_f)){
                                                    this. (var1);
                                                    if (llIIlIIlIIll(92404, 1079)) {
                                                        throw null;
                                                    }
                                                }

                                                if (llIIlIIlIIll(92404, 1079)) {
                                                    throw null;
                                                } else {
                                                    float var4;
                                                    float var6;
                                                    if (llIIlIIllIlI((var6 = (var4 = this..field_71439_g.field_71080_cy + (this..field_71439_g.field_71086_bY - this..field_71439_g.field_71080_cy) * var1)
                                                        -0.0F) ==0.0F ? 0 : (var6 < 0.0F ? -1 : 1))){
                                                        byte var3 = 20;
                                                        if (llIIlIIlIIlI(this..field_71439_g.func_70644_a(MobEffects.field_76431_k)))
                                                        {
                                                            var3 = 7;
                                                        }

                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        var4 = (5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F) * (5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F);
                                                        GlStateManager.func_179114_b(((float) this. + var1) * (float) var3, 0.0F, 1.0F, 1.0F);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        GlStateManager.func_179152_a(1.0F / var4, 1.0F, 1.0F);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        GlStateManager.func_179114_b(-((float) this. + var1) * (float) var3, 0.0F, 1.0F, 1.0F);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }
                                                    }

                                                    if (llIIlIIlIIll(92404, 1079)) {
                                                        throw null;
                                                    } else {
                                                        this. (var1);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        } else {
                                                            boolean var10000;
                                                            if (llIIlIIlIIlI(this.)) {
                                                                switch (this.) {
                                                                    case 0:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        while (!llIIlIIlIIll(92404, 1079)) {
                                                                            if (llIIlIIlIlII(0)) {
                                                                                GlStateManager.func_179114_b(90.0F, 0.0F, 1.0F, 0.0F);
                                                                                if (llIIlIIlIIll(92404, 1079)) {
                                                                                    throw null;
                                                                                }

                                                                                var10000 = true;
                                                                                return;
                                                                            }

                                                                            if (llIIlIIlIIll(92404, 1079)) {
                                                                                throw null;
                                                                            }

                                                                            boolean var10001 = true;
                                                                        }

                                                                        throw null;
                                                                    case 1:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 2:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.func_179114_b(-90.0F, 0.0F, 1.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 3:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 4:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.func_179114_b(-90.0F, 1.0F, 0.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }
                                                                }
                                                            }

                                                            if (llIIlIIlIIll(92404, 1079)) {
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

    public void func_175066_a(@Nullable Entity var1) {
        boolean var10000;
        if (llIIlIIlIIlI(OpenGlHelper.field_148824_g)) {
            if (llIIlIIlllIl(this.)) {
                this.                                                                                                                                     .
                func_148021_a();
            }

            if (llIIlIIlIIll(70574, 745)) {
                throw null;
            }

            this. = null;
            ResourceLocation var10001;
            String var10003;
            if (llIIlIIlIIlI(var1 instanceof EntityCreeper)) {
                var10001 = new ResourceLocation;
                var10003 = Class60. ("pjagbpw,{m{w a~fvruq9hgl5");
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                var10001.<init> (var10003);
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                this.func_175069_a(var10001);
                var10000 = true;
                return;
            }

            if (llIIlIIlIIll(70574, 745)) {
                throw null;
            }

            if (llIIlIIlIIlI(var1 instanceof EntitySpider)) {
                var10001 = new ResourceLocation;
                var10003 = Class60. ("hry\u007fzho4cuco8idro\u007fz5eic5");
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                var10001.<init> (var10003);
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                this.func_175069_a(var10001);
                var10000 = true;
                return;
            }

            if (llIIlIIlIIll(70574, 745)) {
                throw null;
            }

            if (llIIlIIlIIlI(var1 instanceof EntityEnderman)) {
                var10001 = new ResourceLocation;
                var10003 = Class60. ("hry\u007fzho4cuco8szmnh|5eic5");
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                var10001.<init> (var10003);
                if (llIIlIIlIIll(70574, 745)) {
                    throw null;
                }

                this.func_175069_a(var10001);
                var10000 = true;
                return;
            }

            if (llIIlIIlIIll(70574, 745)) {
                throw null;
            }

            ForgeHooksClient.loadEntityShader(var1, this);
            if (llIIlIIlIIll(70574, 745)) {
                throw null;
            }
        }

        if (llIIlIIlIIll(70574, 745)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public void func_78478_c() {
        ScaledResolution var10000 = new ScaledResolution(this.);
        if (llIIlIIlIIll(77035, 1855)) {
            throw null;
        } else {
            ScaledResolution var1 = var10000;
            GlStateManager.func_179086_m(256);
            if (llIIlIIlIIll(77035, 1855)) {
                throw null;
            } else {
                GlStateManager.func_179128_n(5889);
                if (llIIlIIlIIll(77035, 1855)) {
                    throw null;
                } else {
                    GlStateManager.func_179096_D();
                    if (llIIlIIlIIll(77035, 1855)) {
                        throw null;
                    } else {
                        GlStateManager.func_179130_a(0.0D, var1.func_78327_c(), var1.func_78324_d(), 0.0D, 1000.0D, 3000.0D);
                        if (llIIlIIlIIll(77035, 1855)) {
                            throw null;
                        } else {
                            GlStateManager.func_179128_n(5888);
                            if (llIIlIIlIIll(77035, 1855)) {
                                throw null;
                            } else {
                                GlStateManager.func_179096_D();
                                if (llIIlIIlIIll(77035, 1855)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_179109_b(0.0F, 0.0F, -2000.0F);
                                    if (llIIlIIlIIll(77035, 1855)) {
                                        throw null;
                                    } else {
                                        boolean var2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        float var1 = this.                                                                                   .
        field_71441_e.func_72867_j(1.0F);
        if (llIIlIIlIlII(this..field_71474_y.field_74347_j)){
            var1 /= 2.0F;
        }

        if (llIIlIIlIIll(81732, 7316)) {
            throw null;
        } else {
            boolean var10000;
            float var26;
            if (llIIlIIlIIlI((var26 = var1 - 0.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1))) {
                this.                                                                                              .
                setSeed((long) this. * 312987231L);
                Entity var2 = this.                                                                                   .
                func_175606_aa();
                WorldClient var3 = this.                                                                                   .
                field_71441_e;
                BlockPos var10001 = new BlockPos(var2);
                if (llIIlIIlIIll(81732, 7316)) {
                    throw null;
                }

                BlockPos var21 = var10001;
                double var4 = 0.0D;
                double var6 = 0.0D;
                double var8 = 0.0D;
                int var10 = 0;
                int var20 = (int) (100.0F * var1 * var1);
                if (llIIlIIlIlIl(this..field_71474_y.field_74362_aa,1)){
                    var20 >>= 1;
                    var10000 = true;
                } else{
                    if (llIIlIIlIIll(81732, 7316)) {
                        throw null;
                    }

                    if (llIIlIIlIlIl(this..field_71474_y.field_74362_aa,2)){
                        var20 = 0;
                    }
                }

                if (llIIlIIlIIll(81732, 7316)) {
                    throw null;
                }

                int var11;
                int var23 = var11 = 0;

                while (true) {
                    if (llIIlIIlIIll(81732, 7316)) {
                        throw null;
                    }

                    if (!llIIlIIlIllI(var23, var20)) {
                        if (llIIlIIlIIll(81732, 7316)) {
                            throw null;
                        }

                        if (llIIlIIllIlI(var10) && llIIlIIlIllI(this..nextInt(3),this.++)){
                            this. = 0;
                            double var27;
                            if (llIIlIIllIlI((var27 = var6 - (double) (var21.func_177956_o() + 1)) == 0.0D ? 0 : (var27 < 0.0D ? -1 : 1))) {
                                var23 = var3.func_175725_q(var21).func_177956_o();
                                int var25 = MathHelper.func_76141_d((float) var21.func_177956_o());
                                if (llIIlIIlIIll(81732, 7316)) {
                                    throw null;
                                }

                                if (llIIlIIllIll(var23, var25)) {
                                    this.                                                                                   .
                                    field_71441_e.func_184134_a(var4, var6, var8, SoundEvents.field_187919_gs, SoundCategory.WEATHER, 0.1F, 0.5F, false);
                                    var10000 = true;
                                    return;
                                }
                            }

                            if (llIIlIIlIIll(81732, 7316)) {
                                throw null;
                            }

                            this.                                                                                   .
                            field_71441_e.func_184134_a(var4, var6, var8, SoundEvents.field_187918_gr, SoundCategory.WEATHER, 0.2F, 1.0F, false);
                        }
                        break;
                    }

                    BlockPos var12;
                    Biome var13 = var3.func_180494_b(var12 = var3.func_175725_q(var21.func_177982_a(this..nextInt(10) - this..nextInt(10), 0, this..nextInt(10) - this.                                                                                              .
                    nextInt(10))));
                    BlockPos var14;
                    IBlockState var15 = var3.func_180495_p(var14 = var12.func_177977_b());
                    float var28;
                    if (llIIlIIlIlll(var12.func_177956_o(), var21.func_177956_o() + 10) && llIIlIIlIIll(var12.func_177956_o(), var21.func_177956_o() - 10) && llIIlIIlIIlI(var13.func_76738_d()) && llIIlIIllIII((var28 = var13.func_180626_a(var12) - 0.15F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1))) {
                        double var16 = this.                                                                                              .
                        nextDouble();
                        double var18 = this.                                                                                              .
                        nextDouble();
                        AxisAlignedBB var22 = var15.func_185900_c(var3, var14);
                        if (llIIlIIllIIl(var15.func_185904_a(), Material.field_151587_i) && llIIlIIllIIl(var15.func_177230_c(), Blocks.field_189877_df)) {
                            if (llIIlIIllIIl(var15.func_185904_a(), Material.field_151579_a)) {
                                ++var10;
                                if (llIIlIIlIlII(this..nextInt(var10))){
                                    var4 = (double) var14.func_177958_n() + var16;
                                    var6 = (double) ((float) var14.func_177956_o() + 0.1F) + var22.field_72337_e - 1.0D;
                                    var8 = (double) var14.func_177952_p() + var18;
                                }

                                if (llIIlIIlIIll(81732, 7316)) {
                                    throw null;
                                }

                                this.                                                                                   .
                                field_71441_e.func_175688_a(EnumParticleTypes.WATER_DROP, (double) var14.func_177958_n() + var16, (double) ((float) var14.func_177956_o() + 0.1F) + var22.field_72337_e, (double) var14.func_177952_p() + var18, 0.0D, 0.0D, 0.0D, new int[0]);
                                var10000 = true;
                            }
                        } else {
                            if (llIIlIIlIIll(81732, 7316)) {
                                throw null;
                            }

                            this.                                                                                   .
                            field_71441_e.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, (double) var12.func_177958_n() + var16, (double) ((float) var12.func_177956_o() + 0.1F) - var22.field_72338_b, (double) var12.func_177952_p() + var18, 0.0D, 0.0D, 0.0D, new int[0]);
                        }
                    }

                    if (llIIlIIlIIll(81732, 7316)) {
                        throw null;
                    }

                    ++var11;
                    var23 = var11;
                    boolean var24 = true;
                }
            }

            if (llIIlIIlIIll(81732, 7316)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void func_191514_d(boolean var1) {
        boolean var10000;
        FloatBuffer var10001;
        if (llIIlIIlIIlI(var1)) {
            var10001 = this. (0.0F, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(23939, 7480)) {
                throw null;
            } else {
                GlStateManager.func_187402_b(2918, var10001);
                if (llIIlIIlIIll(23939, 7480)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        } else if (llIIlIIlIIll(23939, 7480)) {
            throw null;
        } else {
            var10001 = this. (this., this., this., 1.0F);
            if (llIIlIIlIIll(23939, 7480)) {
                throw null;
            } else {
                GlStateManager.func_187402_b(2918, var10001);
                if (llIIlIIlIIll(23939, 7480)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public boolean func_147702_a() {
        if (llIIlIIlIIlI(OpenGlHelper.field_148824_g) && llIIlIIlllIl(this.)) {
            return true;
        } else if (llIIlIIlIIll(54318, 52)) {
            throw null;
        } else {
            return false;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, int var2) {
        if (llIIlIIlIlII(this.)) {
            GlStateManager.func_179128_n(5889);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.func_179096_D();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                GlStateManager.func_179109_b((float) (-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            float var10002 = this. (var1, false);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            Project.gluPerspective(var10002, (float) this..field_71443_c / (float) this.                                                                                   .
            field_71440_d, 0.05F, this. * 2.0F);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.func_179128_n(5888);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.func_179096_D();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                GlStateManager.func_179109_b((float) (var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.func_179094_E();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            this. (var1);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..field_71474_y.field_74336_f)){
                this. (var1);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            byte var10000;
            if (llIIlIIlIIlI(this..func_175606_aa() instanceof EntityLivingBase) &&
            llIIlIIlIIlI(((EntityLivingBase) this..func_175606_aa()).func_70608_bn())){
                var10000 = 1;
                boolean var10001 = true;
            } else{
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }

                var10000 = 0;
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            byte var3 = var10000;
            var10000 = ForgeHooksClient.renderFirstPersonHand(this..field_71438_f, var1, var2);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIlII(var10000) && llIIlIIlIlII(this..field_71474_y.field_74320_O) &&
            llIIlIIlIlII(var3) && llIIlIIlIlII(this..field_71474_y.field_74319_N) &&
            llIIlIIlIlII(this..field_71442_b.func_78747_a())){
                this.func_180436_i();
                this.                                                                                                     .
                func_78440_a(var1);
                this.func_175072_h();
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.func_179121_F();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIlII(this..field_71474_y.field_74320_O) &&llIIlIIlIlII(var3)){
                this.                                                                                                     .
                func_78447_b(var1);
                this. (var1);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..field_71474_y.field_74336_f)){
                this. (var1);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }
        }

        if (llIIlIIlIIll(72322, 790)) {
            throw null;
        } else {
            boolean var4 = true;
        }
    }

    public void func_190565_a(ItemStack var1) {
        boolean var10000;
        if (llIIlIIlIIlI(this.. ()) &&llIIlIIlIIlI(this..                                                                                            .
        ())){
            var10000 = true;
        } else if (llIIlIIlIIll(81989, 5816)) {
            throw null;
        } else {
            this. = var1;
            this. = 40;
            this. = this.                                                                                              .
            nextFloat() * 2.0F - 1.0F;
            this. = this.                                                                                              .
            nextFloat() * 2.0F - 1.0F;
            var10000 = true;
        }
    }

    public void func_147704_a(int var1, int var2) {
        if (llIIlIIlIIlI(OpenGlHelper.field_148824_g)) {
            if (llIIlIIlllIl(this.)) {
                this.                                                                                                                                     .
                func_148026_a(var1, var2);
            }

            if (llIIlIIlIIll(20295, 6743)) {
                throw null;
            }

            this.                                                                                   .
            field_71438_f.func_72720_a(var1, var2);
        }

        if (llIIlIIlIIll(20295, 6743)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private void _____________________________________________________________________________________/* $FF was:                                                                                      */(float var1) {
        if (llIIlIIlIIlI(this..func_175606_aa() instanceof EntityPlayer)){
            EntityPlayer var2;
            EntityPlayer var10000 = var2 = (EntityPlayer) this.                                                                                   .
            func_175606_aa();
            float var3 = var10000.field_70140_Q - var2.field_70141_P;
            var3 = -(var10000.field_70140_Q + var3 * var1);
            float var4 = var2.field_71107_bF + (var2.field_71109_bG - var2.field_71107_bF) * var1;
            var1 = var10000.field_70727_aS + (var2.field_70726_aT - var2.field_70727_aS) * var1;
            float var5 = MathHelper.func_76126_a(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = var5 * var4 * 0.5F;
            float var10001 = MathHelper.func_76134_b(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var10001 = Math.abs(var10001 * var4);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.func_179109_b(var5, -var10001, 0.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = MathHelper.func_76126_a(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.func_179114_b(var5 * var4 * 3.0F, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = MathHelper.func_76134_b(var3 * 3.1415927F - 0.2F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = Math.abs(var5 * var4);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.func_179114_b(var5 * 5.0F, 1.0F, 0.0F, 0.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.func_179114_b(var1, 1.0F, 0.0F, 0.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }
        }

        if (llIIlIIlIIll(26403, 8134)) {
            throw null;
        } else {
            boolean var6 = true;
        }
    }

    public void func_190564_k() {
        this. = null;
        this.                                                                                                                                                        .
        func_148249_a();
        boolean var10000 = true;
    }

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */(float var1) {
        WorldClient var2 = this.                                                                                   .
        field_71441_e;
        Entity var3 = this.                                                                                   .
        func_175606_aa();
        float var4 = 0.25F + 0.75F * (float) this.                                                                                   .
        field_71474_y.field_151451_c / 32.0F;
        double var10005 = Math.pow((double) var4, 0.25D);
        if (llIIlIIlIIll(50634, 975)) {
            throw null;
        } else {
            var4 = 1.0F - (float) var10005;
            Vec3d var31 = var2.func_72833_a(this..func_175606_aa(), var1);
            float var5 = (float) var31.field_72450_a;
            float var6 = (float) var31.field_72448_b;
            float var7 = (float) var31.field_72449_c;
            Vec3d var8;
            this. = (float) (var8 = var2.func_72948_g(var1)).field_72450_a;
            this. = (float) var8.field_72448_b;
            this. = (float) var8.field_72449_c;
            float var11;
            float var10000;
            boolean var10001;
            double var24;
            Vec3d var25;
            if (llIIlIIlIIll(this..field_71474_y.field_151451_c,4)){
                var10000 = MathHelper.func_76126_a(var2.func_72929_e(var1));
                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                }

                float var35;
                if (llIIlIIllIlI((var35 = var10000 - 0.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1))) {
                    var24 = -1.0D;
                    var10001 = true;
                } else {
                    if (llIIlIIlIIll(50634, 975)) {
                        throw null;
                    }

                    var24 = 1.0D;
                }

                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                }

                double var9 = var24;
                var25 = new Vec3d(var9, 0.0D, 0.0D);
                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                }

                var8 = var25;
                float var36;
                if (llIIlIlIIIII((var36 = (var11 = (float) var3.func_70676_i(var1).func_72430_b(var8)) - 0.0F) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1))) {
                    var11 = 0.0F;
                }

                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                }

                float[] var12;
                float var37;
                if (llIIlIIllIlI((var37 = var11 - 0.0F) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1)) && llIIlIIlllIl(var12 = var2.field_73011_w.func_76560_a(var2.func_72826_c(var1), var1))) {
                    var11 *= var12[3];
                    this. = this. * (1.0F - var11) + var12[0] * var11;
                    this. = this. * (1.0F - var11) + var12[1] * var11;
                    this. = this. * (1.0F - var11) + var12[2] * var11;
                }
            }

            if (llIIlIIlIIll(50634, 975)) {
                throw null;
            } else {
                this. += (var5 - this.) * var4;
                this. += (var6 - this.) * var4;
                this. += (var7 - this.) * var4;
                float var10;
                float var18;
                float var19;
                float var38;
                if (llIIlIIllIlI((var38 = (var19 = var2.func_72867_j(var1)) - 0.0F) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1))) {
                    var10 = 1.0F - var19 * 0.5F;
                    var18 = 1.0F - var19 * 0.4F;
                    this. *= var10;
                    this. *= var10;
                    this. *= var18;
                }

                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                } else {
                    float var39;
                    if (llIIlIIllIlI((var39 = (var10 = var2.func_72819_i(var1)) - 0.0F) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1))) {
                        var18 = 1.0F - var10 * 0.5F;
                        this. *= var18;
                        this. *= var18;
                        this. *= var18;
                    }

                    if (llIIlIIlIIll(50634, 975)) {
                        throw null;
                    } else {
                        IBlockState var26 = ActiveRenderInfo.func_186703_a(this..field_71441_e, var3, var1);
                        if (llIIlIIlIIll(50634, 975)) {
                            throw null;
                        } else {
                            IBlockState var20 = var26;
                            Vec3d var21;
                            Class25 var28;
                            if (llIIlIIlIIlI(this.)) {
                                Vec3d var27 = var21 = var2.func_72824_f(var1);
                                var28 = this;
                                this. = (float) var21.field_72450_a;
                                this. = (float) var21.field_72448_b;
                                this. = (float) var27.field_72449_c;
                                var10001 = true;
                            } else {
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                var25 = ActiveRenderInfo.func_178806_a(var3, (double) var1);
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                var21 = var25;
                                BlockPos var29 = new BlockPos(var21);
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                BlockPos var22 = var29;
                                var28 = this;
                                IBlockState var13;
                                Block var10003 = (var13 = this..field_71441_e.func_180495_p(var22)).func_177230_c();
                                WorldClient var33 = this.                                                                                   .
                                field_71441_e;
                                Vec3d var10009 = new Vec3d((double) this., (double) this., (double) this.);
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                Vec3d var15;
                                this. = (float) (var15 = var10003.getFogColor(var33, var22, var13, var3, var10009, var1)).field_72450_a;
                                this. = (float) var15.field_72448_b;
                                this. = (float) var15.field_72449_c;
                            }

                            if (llIIlIIlIIll(50634, 975)) {
                                throw null;
                            } else {
                                double var23;
                                label209:
                                {
                                    var11 = var28. + (this. - this.) * var1;
                                    this. *= var11;
                                    this. *= var11;
                                    this. *= var11;
                                    var23 = (var3.field_70137_T + (var3.field_70163_u - var3.field_70137_T) * (double) var1) * var2.field_73011_w.func_76565_k();
                                    if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).func_70644_a(MobEffects.field_76440_q))) {
                                        int var16;
                                        if (llIIlIIlIllI(var16 = ((EntityLivingBase) var3).func_70660_b(MobEffects.field_76440_q).func_76459_b(), 20)) {
                                            var24 = var23 *= (double) (1.0F - (float) var16 / 20.0F);
                                            var10001 = true;
                                            break label209;
                                        }

                                        if (llIIlIIlIIll(50634, 975)) {
                                            throw null;
                                        }

                                        var23 = 0.0D;
                                    }

                                    if (llIIlIIlIIll(50634, 975)) {
                                        throw null;
                                    }

                                    var24 = var23;
                                }

                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                } else {
                                    double var40;
                                    if (llIIlIlIIIII((var40 = var24 - 1.0D) == 0.0D ? 0 : (var40 < 0.0D ? -1 : 1))) {
                                        double var41;
                                        if (llIIlIlIIIII((var41 = var23 - 0.0D) == 0.0D ? 0 : (var41 < 0.0D ? -1 : 1))) {
                                            var23 = 0.0D;
                                        }

                                        if (llIIlIIlIIll(50634, 975)) {
                                            throw null;
                                        }

                                        var23 *= var23;
                                        this. = (float) ((double) this. * var23);
                                        this. = (float) ((double) this. * var23);
                                        this. = (float) ((double) this. * var23);
                                    }

                                    if (llIIlIIlIIll(50634, 975)) {
                                        throw null;
                                    } else {
                                        float var42;
                                        if (llIIlIIllIlI((var42 = this. - 0.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1))) {
                                            var4 = this. + (this. - this.) * var1;
                                            this. = this. * (1.0F - var4) + this. * 0.7F * var4;
                                            this. = this. * (1.0F - var4) + this. * 0.6F * var4;
                                            this. = this. * (1.0F - var4) + this. * 0.6F * var4;
                                        }

                                        if (llIIlIIlIIll(50634, 975)) {
                                            throw null;
                                        } else {
                                            float var14;
                                            if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).func_70644_a(MobEffects.field_76439_r))) {
                                                var10000 = this. ((EntityLivingBase) var3, var1);
                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                }

                                                var4 = var10000;
                                                float var43;
                                                if (llIIlIIllIlI((var43 = (var14 = 1.0F / this.) - 1.0F / this.) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1))) {
                                                    var14 = 1.0F / this.;
                                                }

                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                }

                                                float var44;
                                                if (llIIlIIllIlI((var44 = var14 - 1.0F / this.) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1))) {
                                                    var14 = 1.0F / this.;
                                                }

                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                }

                                                byte var30 = Float.isInfinite(var14);
                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                }

                                                if (llIIlIIlIIlI(var30)) {
                                                    var10000 = Math.nextAfter(var14, 0.0D);
                                                    if (llIIlIIlIIll(50634, 975)) {
                                                        throw null;
                                                    }

                                                    var14 = var10000;
                                                }

                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                }

                                                this. = this. * (1.0F - var4) + this. * var14 * var4;
                                                this. = this. * (1.0F - var4) + this. * var14 * var4;
                                                this. = this. * (1.0F - var4) + this. * var14 * var4;
                                            }

                                            if (llIIlIIlIIll(50634, 975)) {
                                                throw null;
                                            } else {
                                                if (llIIlIIlIIlI(this..field_71474_y.field_74337_g)){
                                                    var4 = (this. * 30.0F + this. * 59.0F + this. * 11.0F) / 100.0F;
                                                    var14 = (this. * 30.0F + this. * 70.0F) / 100.0F;
                                                    var5 = (this. * 30.0F + this. * 70.0F) / 100.0F;
                                                    this. = var4;
                                                    this. = var14;
                                                    this. = var5;
                                                }

                                                if (llIIlIIlIIll(50634, 975)) {
                                                    throw null;
                                                } else {
                                                    FogColors var32 = new FogColors(this, var3, var20, (double) var1, this., this., this.);
                                                    if (llIIlIIlIIll(50634, 975)) {
                                                        throw null;
                                                    } else {
                                                        FogColors var17 = var32;
                                                        MinecraftForge.EVENT_BUS.post(var17);
                                                        this. = var17.getRed();
                                                        this. = var17.getGreen();
                                                        this. = var17.getBlue();
                                                        GlStateManager.func_179082_a(this., this., this., 0.0F);
                                                        if (llIIlIIlIIll(50634, 975)) {
                                                            throw null;
                                                        } else {
                                                            boolean var34 = true;
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

    private void ____________________________________________________________________________/* $FF was:                                                                             */(float var1) {
        byte var10000 = Class133. (61);
        if (llIIlIIlIIll(82680, 8654)) {
            throw null;
        } else {
            boolean var7;
            if (llIIlIIlIIlI(var10000)) {
                var7 = true;
            } else if (llIIlIIlIIll(82680, 8654)) {
                throw null;
            } else {
                if (llIIlIIlIIlI(this..func_175606_aa() instanceof EntityLivingBase)){
                    EntityLivingBase var2;
                    EntityLivingBase var5 = var2 = (EntityLivingBase) this.                                                                                   .
                    func_175606_aa();
                    float var3 = (float) var5.field_70737_aN - var1;
                    float var4;
                    float var8;
                    if (llIIlIlIIIlI((var8 = var5.func_110143_aJ() - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1))) {
                        var4 = (float) var2.field_70725_aQ + var1;
                        GlStateManager.func_179114_b(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
                        if (llIIlIIlIIll(82680, 8654)) {
                            throw null;
                        }
                    }

                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    float var9;
                    if (llIIlIlIIIII((var9 = var3 - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1))) {
                        var7 = true;
                        return;
                    }

                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    float var6 = var3 /= (float) var2.field_70738_aO;
                    var6 = MathHelper.func_76126_a(var6 * var6 * var3 * var3 * 3.1415927F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    var3 = var6;
                    GlStateManager.func_179114_b(-(var4 = var2.field_70739_aP), 0.0F, 1.0F, 0.0F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    GlStateManager.func_179114_b(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    GlStateManager.func_179114_b(var4, 0.0F, 1.0F, 0.0F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }
                }

                if (llIIlIIlIIll(82680, 8654)) {
                    throw null;
                } else {
                    var7 = true;
                }
            }
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        boolean var9;
        if (llIIlIIlIIlI(this..field_71438_f.func_184384_n()) &&llIIlIIlIlII(this..func_71401_C().func_184106_y())){
            label68:
            {
                BufferedImage var10000 = ScreenShotHelper.func_186719_a(this..field_71443_c, this.                                                                                   .
                field_71440_d, this.                                                                                   .
                func_147110_a());
                if (llIIlIIlIIll(77895, 3105)) {
                    throw null;
                }

                BufferedImage var1 = var10000;
                int var2 = var10000.getWidth();
                int var3 = var10000.getHeight();
                int var4 = 0;
                int var5 = 0;
                if (llIIlIIllIll(var2, var3)) {
                    var4 = (var2 - var3) / 2;
                    var2 = var3;
                    var9 = true;
                } else {
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    var5 = (var3 - var2) / 2;
                }

                String var10001;
                try {
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    var10000 = new BufferedImage(64, 64, 1);
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    BufferedImage var8 = var10000;
                    Graphics2D var6;
                    (var6 = var10000.createGraphics()).drawImage(var1, 0, 0, 64, 64, var4, var5, var4 + var2, var5 + var2, (ImageObserver) null);
                    var6.dispose();
                    var10001 = Class60. ("hw<");
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    ImageIO.write(var8, var10001, this..func_71401_C().func_184109_z());
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }
                } catch (IOException var7) {
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    Logger var10 = ;
                    var10001 = Class60. ("Diqkgh's/umqn&irci4tptubquth/");
                    if (llIIlIIlIIll(77895, 3105)) {
                        throw null;
                    }

                    var10.warn(var10001, var7);
                    break label68;
                }

                if (llIIlIIlIIll(77895, 3105)) {
                    throw null;
                }

                var9 = true;
                return;
            }
        }

        if (llIIlIIlIIll(77895, 3105)) {
            throw null;
        } else {
            var9 = true;
        }
    }

    public void func_180436_i() {
        GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
        if (llIIlIIlIIll(95199, 5550)) {
            throw null;
        } else {
            GlStateManager.func_179128_n(5890);
            if (llIIlIIlIIll(95199, 5550)) {
                throw null;
            } else {
                GlStateManager.func_179096_D();
                if (llIIlIIlIIll(95199, 5550)) {
                    throw null;
                } else {
                    GlStateManager.func_179152_a(0.00390625F, 0.00390625F, 0.00390625F);
                    if (llIIlIIlIIll(95199, 5550)) {
                        throw null;
                    } else {
                        GlStateManager.func_179109_b(8.0F, 8.0F, 8.0F);
                        if (llIIlIIlIIll(95199, 5550)) {
                            throw null;
                        } else {
                            GlStateManager.func_179128_n(5888);
                            if (llIIlIIlIIll(95199, 5550)) {
                                throw null;
                            } else {
                                this.                                                                                   .
                                func_110434_K().func_110577_a(this.);
                                GlStateManager.func_187421_b(3553, 10241, 9729);
                                if (llIIlIIlIIll(95199, 5550)) {
                                    throw null;
                                } else {
                                    GlStateManager.func_187421_b(3553, 10240, 9729);
                                    if (llIIlIIlIIll(95199, 5550)) {
                                        throw null;
                                    } else {
                                        GlStateManager.func_187421_b(3553, 10242, 10496);
                                        if (llIIlIIlIIll(95199, 5550)) {
                                            throw null;
                                        } else {
                                            GlStateManager.func_187421_b(3553, 10243, 10496);
                                            if (llIIlIIlIIll(95199, 5550)) {
                                                throw null;
                                            } else {
                                                GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
                                                if (llIIlIIlIIll(95199, 5550)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.func_179098_w();
                                                    if (llIIlIIlIIll(95199, 5550)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
                                                        if (llIIlIIlIIll(95199, 5550)) {
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
