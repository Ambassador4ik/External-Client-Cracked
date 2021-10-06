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
                        long var10030 = Minecraft.getSystemTime();
                        if (llIIlIIlIIll(46408, 20)) {
                            throw null;
                        } else {
                            this. = var10030;
                            this. = new float[1024];
                            this. = new float[1024];
                            FloatBuffer var10024 = GLAllocation.createDirectFloatBuffer(16);
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
                                this. = var1.getItemRenderer();
                                MapItemRenderer var10010 = new MapItemRenderer(var1.getTextureManager());
                                if (llIIlIIlIIll(46408, 20)) {
                                    throw null;
                                } else {
                                    this. = var10010;
                                    DynamicTexture var10009 = new DynamicTexture(16, 16);
                                    if (llIIlIIlIIll(46408, 20)) {
                                        throw null;
                                    } else {
                                        this. = var10009;
                                        TextureManager var10007 = var1.getTextureManager();
                                        String var10008 = Class60. ("ws\u007fskW}+");
                                        if (llIIlIIlIIll(46408, 20)) {
                                            throw null;
                                        } else {
                                            this. = var10007.getDynamicTextureLocation(var10008, this.);
                                            this. = this.                                                                                                                              .
                                            getTextureData();
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
                                                        entityRenderer.getClass();
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
                                                        float var8 = MathHelper.sqrt(var3 * var3 + var4 * var4);
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
        GlStateManager.pushMatrix();
        if (llIIlIIlIIll(91941, 4714)) {
            throw null;
        } else {
            GlStateManager.translate(var2, var3, var4);
            if (llIIlIIlIIll(91941, 4714)) {
                throw null;
            } else {
                GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(91941, 4714)) {
                    throw null;
                } else {
                    GlStateManager.rotate(-var6, 0.0F, 1.0F, 0.0F);
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
                            GlStateManager.rotate((float) var10000 * var7, 1.0F, 0.0F, 0.0F);
                            if (llIIlIIlIIll(91941, 4714)) {
                                throw null;
                            } else {
                                GlStateManager.scale(-0.025F, -0.025F, 0.025F);
                                if (llIIlIIlIIll(91941, 4714)) {
                                    throw null;
                                } else {
                                    GlStateManager.disableLighting();
                                    if (llIIlIIlIIll(91941, 4714)) {
                                        throw null;
                                    } else {
                                        GlStateManager.depthMask(false);
                                        if (llIIlIIlIIll(91941, 4714)) {
                                            throw null;
                                        } else {
                                            if (llIIlIIlIlII(var9)) {
                                                GlStateManager.disableDepth();
                                                if (llIIlIIlIIll(91941, 4714)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(91941, 4714)) {
                                                throw null;
                                            } else {
                                                GlStateManager.enableBlend();
                                                if (llIIlIIlIIll(91941, 4714)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                        throw null;
                                                    } else {
                                                        int var10 = var0.getStringWidth(var1) / 2;
                                                        GlStateManager.disableTexture2D();
                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                            throw null;
                                                        } else {
                                                            Tessellator var12 = Tessellator.getInstance();
                                                            if (llIIlIIlIIll(91941, 4714)) {
                                                                throw null;
                                                            } else {
                                                                BufferBuilder var11 = var12.getBuffer();
                                                                var11.begin(7, DefaultVertexFormats.POSITION_COLOR);
                                                                var11.pos((double) (-var10 - 1), (double) (-1 + var5), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                                                                var11.pos((double) (-var10 - 1), (double) (8 + var5), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                                                                var11.pos((double) (var10 + 1), (double) (8 + var5), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                                                                var11.pos((double) (var10 + 1), (double) (-1 + var5), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                                                                var12.draw();
                                                                GlStateManager.enableTexture2D();
                                                                if (llIIlIIlIIll(91941, 4714)) {
                                                                    throw null;
                                                                } else {
                                                                    if (llIIlIIlIlII(var9)) {
                                                                        var0.drawString(var1, -var0.getStringWidth(var1) / 2, var5, 553648127);
                                                                        GlStateManager.enableDepth();
                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                            throw null;
                                                                        }
                                                                    }

                                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                                        throw null;
                                                                    } else {
                                                                        GlStateManager.depthMask(true);
                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                            throw null;
                                                                        } else {
                                                                            int var10002 = -var0.getStringWidth(var1) / 2;
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
                                                                                var0.drawString(var1, var10002, var5, var10004);
                                                                                GlStateManager.enableLighting();
                                                                                if (llIIlIIlIIll(91941, 4714)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GlStateManager.disableBlend();
                                                                                    if (llIIlIIlIIll(91941, 4714)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                                                                        if (llIIlIIlIIll(91941, 4714)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GlStateManager.popMatrix();
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
        getRenderViewEntity();
        this.setupFogColor(false);
        GlStateManager.glNormal3f(0.0F, -1.0F, 0.0F);
        if (llIIlIIlIIll(75491, 5815)) {
            throw null;
        } else {
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            if (llIIlIIlIIll(75491, 5815)) {
                throw null;
            } else {
                IBlockState var10001 = ActiveRenderInfo.getBlockStateAtEntityViewpoint(this..world, var3, var2);
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
                            GlStateManager.setFogDensity(var5);
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            }

                            var7 = true;
                        } else {
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            }

                            ContextCapabilities var9;
                            if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).isPotionActive(MobEffects.BLINDNESS))) {
                                var5 = 5.0F;
                                int var6;
                                if (llIIlIIlIllI(var6 = ((EntityLivingBase) var3).getActivePotionEffect(MobEffects.BLINDNESS).getDuration(), 20)) {
                                    var5 = 5.0F + (this. - 5.0F) * (1.0F - (float) var6 / 20.0F);
                                }

                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                GlStateManager.setFog(FogMode.LINEAR);
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                }

                                if (llIIlIIlIlIl(var1, -1)) {
                                    GlStateManager.setFogStart(0.0F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.setFogEnd(var5 * 0.8F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    var7 = true;
                                } else {
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.setFogStart(var5 * 0.25F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.setFogEnd(var5);
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
                                    GlStateManager.glFogi(34138, 34139);
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
                                    GlStateManager.setFog(FogMode.EXP);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    GlStateManager.setFogDensity(0.1F);
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    var7 = true;
                                } else {
                                    if (llIIlIIlIIll(75491, 5815)) {
                                        throw null;
                                    }

                                    if (llIIlIlIIIIl(var4.getMaterial(), Material.WATER)) {
                                        GlStateManager.setFog(FogMode.EXP);
                                        if (llIIlIIlIIll(75491, 5815)) {
                                            throw null;
                                        }

                                        if (llIIlIIlIIlI(var3 instanceof EntityLivingBase)) {
                                            if (llIIlIIlIIlI(((EntityLivingBase) var3).isPotionActive(MobEffects.WATER_BREATHING))) {
                                                GlStateManager.setFogDensity(0.01F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            } else {
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                int var8 = EnchantmentHelper.getRespirationModifier((EntityLivingBase) var3);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogDensity(0.1F - (float) var8 * 0.03F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            }
                                        } else {
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            GlStateManager.setFogDensity(0.1F);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var7 = true;
                                        }
                                    } else {
                                        if (llIIlIIlIIll(75491, 5815)) {
                                            throw null;
                                        }

                                        if (llIIlIlIIIIl(var4.getMaterial(), Material.LAVA)) {
                                            GlStateManager.setFog(FogMode.EXP);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            GlStateManager.setFogDensity(2.0F);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var7 = true;
                                        } else {
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            var5 = this.;
                                            GlStateManager.setFog(FogMode.LINEAR);
                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            if (llIIlIIlIlIl(var1, -1)) {
                                                GlStateManager.setFogStart(0.0F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogEnd(var5);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var7 = true;
                                            } else {
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogStart(var5 * 0.75F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogEnd(var5);
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
                                                GlStateManager.glFogi(34138, 34139);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }
                                            }

                                            if (llIIlIIlIIll(75491, 5815)) {
                                                throw null;
                                            }

                                            if (!llIIlIIlIlII(this..world.provider.doesXZShowFog((int) var3.posX, (int) var3.posZ)) ||
                                            llIIlIIlIIlI(this..ingameGUI.getBossOverlay().shouldCreateFog())){
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogStart(var5 * 0.05F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                var10000 = Math.min(var5, 192.0F);
                                                if (llIIlIIlIIll(75491, 5815)) {
                                                    throw null;
                                                }

                                                GlStateManager.setFogEnd(var10000 * 0.5F);
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
                            GlStateManager.enableColorMaterial();
                            if (llIIlIIlIIll(75491, 5815)) {
                                throw null;
                            } else {
                                GlStateManager.enableFog();
                                if (llIIlIIlIIll(75491, 5815)) {
                                    throw null;
                                } else {
                                    GlStateManager.colorMaterial(1028, 4608);
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
        if (llIIlIIlIIlI(this..getRenderViewEntity() instanceof AbstractClientPlayer)){
            var1 = ((AbstractClientPlayer) this..getRenderViewEntity()).getFovModifier();
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
            getRenderViewEntity();
            var3 = var10000.getEyeHeight();
            var4 = var10000.prevPosX + (var2.posX - var2.prevPosX) * (double) var1;
            var6 = var2.prevPosY + (var2.posY - var2.prevPosY) * (double) var1 + (double) var3;
            var8 = var10000.prevPosZ + (var2.posZ - var2.prevPosZ) * (double) var1;
            boolean var10001;
            if (llIIlIIlIIlI(var10000 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var2).isPlayerSleeping())) {
                var3 = (float) ((double) var3 + 1.0D);
                GlStateManager.translate(0.0F, 0.3F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                if (llIIlIIlIlII(this..gameSettings.debugCamEnable)){
                    BlockPos var43 = new BlockPos(var2);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    BlockPos var27 = var43;
                    var42 = this;
                    IBlockState var29 = this.                                                                                   .
                    world.getBlockState(var27);
                    ForgeHooksClient.orientBedCamera(this..world, var27, var29, var2);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.rotate(var2.prevRotationYaw + (var2.rotationYaw - var2.prevRotationYaw) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.rotate(var2.prevRotationPitch + (var2.rotationPitch - var2.prevRotationPitch) * var1, -1.0F, 0.0F, 0.0F);
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

                if (llIIlIIllIlI(this..gameSettings.thirdPersonView)){
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
                    if (llIIlIIlIIlI(this..gameSettings.debugCamEnable)){
                        GlStateManager.translate(0.0F, 0.0F, (float) (-var11));
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var38 = true;
                    } else{
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        float var13 = var2.rotationYaw;
                        float var14 = var2.rotationPitch;
                        if (llIIlIIlIlIl(this..gameSettings.thirdPersonView,2)){
                            var14 += 180.0F;
                        }

                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = MathHelper.sin(var13 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var36 = -var36;
                        float var37 = MathHelper.cos(var14 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        double var15 = (double) (var36 * var37) * var11;
                        var36 = MathHelper.cos(var13 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var37 = MathHelper.cos(var14 * 0.017453292F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        double var17 = (double) (var36 * var37) * var11;
                        var36 = MathHelper.sin(var14 * 0.017453292F);
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
                                world;
                                Vec3d var39 = new Vec3d(var4 + (double) var22, var6 + (double) var23, var8 + (double) var24);
                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                Vec3d var10002 = new Vec3d(var4 - var15 + (double) var22 + (double) var24, var6 - var19 + (double) var23, var8 - var17 + (double) var24);
                                if (llIIlIIlIIll(84597, 5111)) {
                                    throw null;
                                }

                                RayTraceResult var45;
                                if (llIIlIIlllIl(var45 = var40.rayTraceBlocks(var39, var10002))) {
                                    Vec3d var41 = var45.hitVec;
                                    var39 = new Vec3d(var4, var6, var8);
                                    if (llIIlIIlIIll(84597, 5111)) {
                                        throw null;
                                    }

                                    double var25;
                                    double var48;
                                    if (llIIlIlIIIII((var48 = (var25 = var41.distanceTo(var39)) - var11) == 0.0D ? 0 : (var48 < 0.0D ? -1 : 1))) {
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

                        if (llIIlIIlIlIl(this..gameSettings.thirdPersonView,2)){
                            GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
                            if (llIIlIIlIIll(84597, 5111)) {
                                throw null;
                            }
                        }

                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.rotate(var2.rotationPitch - var14, 1.0F, 0.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.rotate(var2.rotationYaw - var13, 0.0F, 1.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.translate(0.0F, 0.0F, (float) (-var11));
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.rotate(var13 - var2.rotationYaw, 0.0F, 1.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        GlStateManager.rotate(var14 - var2.rotationPitch, 1.0F, 0.0F, 0.0F);
                        if (llIIlIIlIIll(84597, 5111)) {
                            throw null;
                        }

                        var38 = true;
                    }
                } else{
                    if (llIIlIIlIIll(84597, 5111)) {
                        throw null;
                    }

                    GlStateManager.translate(0.0F, 0.0F, 0.05F);
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
            if (llIIlIIlIlII(var42..gameSettings.debugCamEnable)){
                float var28 = var2.prevRotationYaw + (var2.rotationYaw - var2.prevRotationYaw) * var1 + 180.0F;
                float var30 = var2.prevRotationPitch + (var2.rotationPitch - var2.prevRotationPitch) * var1;
                float var12 = 0.0F;
                if (llIIlIIlIIlI(var2 instanceof EntityAnimal)) {
                    EntityAnimal var31;
                    EntityAnimal var44 = var31 = (EntityAnimal) var2;
                    var28 = var44.prevRotationYawHead + (var44.rotationYawHead - var31.prevRotationYawHead) * var1 + 180.0F;
                }

                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                IBlockState var46 = ActiveRenderInfo.getBlockStateAtEntityViewpoint(this..world, var2, var1);
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
                GlStateManager.rotate(var33.getRoll(), 0.0F, 0.0F, 1.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                GlStateManager.rotate(var33.getPitch(), 1.0F, 0.0F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }

                GlStateManager.rotate(var33.getYaw(), 0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(84597, 5111)) {
                throw null;
            } else {
                GlStateManager.translate(0.0F, -var3, 0.0F);
                if (llIIlIIlIIll(84597, 5111)) {
                    throw null;
                } else {
                    var4 = var2.prevPosX + (var2.posX - var2.prevPosX) * (double) var1;
                    var6 = var2.prevPosY + (var2.posY - var2.prevPosY) * (double) var1 + (double) var3;
                    var8 = var2.prevPosZ + (var2.posZ - var2.prevPosZ) * (double) var1;
                    this. = this.                                                                                   .
                    renderGlobal.hasCloudFog(var4, var6, var8, var1);
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
            GlStateManager.enableAlpha();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.pushMatrix();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.pushAttrib();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.enableDepth();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.disableCull();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.color(1.0F, 1.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            RenderHelper.enableStandardItemLighting();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            float var10001 = (float) (var1 / 2);
            float var10003 = MathHelper.sin(var4 * 2.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10003 = MathHelper.abs(var10003);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10001 += var5 * var10003;
            float var10002 = (float) (var2 / 2);
            float var10004 = MathHelper.sin(var4 * 2.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10004 = MathHelper.abs(var10004);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.translate(var10001, var10002 + var6 * var10004, -50.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10003 = MathHelper.sin(var4);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.scale(var1, -(var1 = 50.0F + 175.0F * var10003), var1);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.sin(var4);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.abs(var10002);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.rotate(900.0F * var10002, 0.0F, 1.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.cos(var3 * 8.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.rotate(6.0F * var10002, 1.0F, 0.0F, 0.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            var10002 = MathHelper.cos(var3 * 8.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.rotate(6.0F * var10002, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            this.                                                                                   .
            getRenderItem().renderItem(this., TransformType.FIXED);
            GlStateManager.popAttrib();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.popMatrix();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            RenderHelper.disableStandardItemLighting();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.enableCull();
            if (llIIlIIlIIll(40748, 5199)) {
                throw null;
            }

            GlStateManager.disableDepth();
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

    public void onResourceManagerReload(IResourceManager var1) {
        if (llIIlIIlllIl(this.)) {
            this.                                                                                                                                     .
            deleteShaderGroup();
        }

        if (llIIlIIlIIll(21176, 442)) {
            throw null;
        } else {
            this. = null;
            boolean var10000;
            if (llIIlIIlIlIl(this., )) {
                this.loadEntityShader(this..getRenderViewEntity());
                var10000 = true;
            } else if (llIIlIIlIIll(21176, 442)) {
                throw null;
            } else {
                this.loadShader([this.]);
                var10000 = true;
            }
        }
    }

    public ShaderGroup getShaderGroup() {
        return this.;
    }

    public void renderWorld(float var1, long var2) {
        this. (var1);
        if (llIIlIIlIIll(48309, 6827)) {
            throw null;
        } else {
            if (llIIlIIlllII(this..getRenderViewEntity())){
                this.                                                                                   .
                setRenderViewEntity(this..player);
            }

            if (llIIlIIlIIll(48309, 6827)) {
                throw null;
            } else {
                this.getMouseOver(var1);
                GlStateManager.enableDepth();
                if (llIIlIIlIIll(48309, 6827)) {
                    throw null;
                } else {
                    GlStateManager.enableAlpha();
                    if (llIIlIIlIIll(48309, 6827)) {
                        throw null;
                    } else {
                        GlStateManager.alphaFunc(516, 0.5F);
                        if (llIIlIIlIIll(48309, 6827)) {
                            throw null;
                        } else {
                            Profiler var10001 = this.                                                                                   .
                            profiler;
                            String var10002 = Class60. ("y~wn{)");
                            if (llIIlIIlIIll(48309, 6827)) {
                                throw null;
                            } else {
                                var10001.startSection(var10002);
                                Class25 var10000;
                                if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
                                                                                                              =0;
                                    GlStateManager.colorMask(false, true, true, false);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    var10000 = this;
                                    this. (0, var1, var2);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                                                                                              =1;
                                    GlStateManager.colorMask(true, false, false, false);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    this. (1, var1, var2);
                                    if (llIIlIIlIIll(48309, 6827)) {
                                        throw null;
                                    }

                                    GlStateManager.colorMask(true, true, true, false);
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
                                    profiler.endSection();
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
        renderGlobal;
        ParticleManager var6 = this.                                                                                   .
        effectRenderer;
        byte var10005 = this. ();
        if (llIIlIIlIIll(23361, 6878)) {
            throw null;
        } else {
            byte var7 = var10005;
            GlStateManager.enableCull();
            if (llIIlIIlIIll(23361, 6878)) {
                throw null;
            } else {
                Profiler var10004 = this.                                                                                   .
                profiler;
                String var32 = Class60. ("|ry~)");
                if (llIIlIIlIIll(23361, 6878)) {
                    throw null;
                } else {
                    var10004.endStartSection(var32);
                    GlStateManager.viewport(0, 0, this..displayWidth, this.                                                                                   .
                    displayHeight);
                    if (llIIlIIlIIll(23361, 6878)) {
                        throw null;
                    } else {
                        this. (var2);
                        if (llIIlIIlIIll(23361, 6878)) {
                            throw null;
                        } else {
                            GlStateManager.clear(16640);
                            if (llIIlIIlIIll(23361, 6878)) {
                                throw null;
                            } else {
                                Profiler var10002 = this.                                                                                   .
                                profiler;
                                String var10003 = Class60. ("yzt\u007fl:");
                                if (llIIlIIlIIll(23361, 6878)) {
                                    throw null;
                                } else {
                                    var10002.endStartSection(var10003);
                                    this.setupCameraTransform(var2, var1);
                                    Entity var10000 = this.                                                                                   .
                                    getRenderViewEntity();
                                    boolean var10001;
                                    boolean var22;
                                    if (llIIlIIlIlIl(this..gameSettings.thirdPersonView,2)){
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
                                            profiler;
                                            String var21 = Class60. ("zojolh6");
                                            if (llIIlIIlIIll(23361, 6878)) {
                                                throw null;
                                            } else {
                                                var17.endStartSection(var21);
                                                ClippingHelperImpl.getInstance();
                                                if (llIIlIIlIIll(23361, 6878)) {
                                                    throw null;
                                                } else {
                                                    Profiler var27 = this.                                                                                   .
                                                    profiler;
                                                    String var29 = Class60. ("\u007fhspqs<");
                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                        throw null;
                                                    } else {
                                                        var27.endStartSection(var29);
                                                        Frustum var28 = new Frustum();
                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                            throw null;
                                                        } else {
                                                            Frustum var8 = var28;
                                                            Entity var9 = this.                                                                                   .
                                                            getRenderViewEntity();
                                                            double var10 = var9.lastTickPosX + (var9.posX - var9.lastTickPosX) * (double) var2;
                                                            double var12 = var9.lastTickPosY + (var9.posY - var9.lastTickPosY) * (double) var2;
                                                            double var14 = var9.lastTickPosZ + (var9.posZ - var9.lastTickPosZ) * (double) var2;
                                                            var8.setPosition(var10, var12, var14);
                                                            if (llIIlIIlIIll(this..gameSettings.renderDistanceChunks,4)){
                                                                this. (-1, var2);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Profiler var10007 = this.                                                                                   .
                                                                profiler;
                                                                String var10008 = Class60. ("kr\"");
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                var10007.endStartSection(var10008);
                                                                GlStateManager.matrixMode(5889);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.loadIdentity();
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                float var33 = this. (var2, true);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Project.gluPerspective(var33, (float) this..displayWidth / (float) this.                                                                                   .
                                                                displayHeight, 0.05F, this. * 2.0F);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.matrixMode(5888);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                var5.renderSky(var2, var1);
                                                                GlStateManager.matrixMode(5889);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.loadIdentity();
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                float var23 = this. (var2, true);
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                Project.gluPerspective(var23, (float) this..displayWidth / (float) this.                                                                                   .
                                                                displayHeight, 0.05F, this. * MathHelper.SQRT_2)
                                                                ;
                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                    throw null;
                                                                }

                                                                GlStateManager.matrixMode(5888);
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
                                                                    GlStateManager.shadeModel(7425);
                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                        throw null;
                                                                    } else {
                                                                        double var37;
                                                                        if (llIIlIlIIIII((var37 = var9.posY + (double) var9.getEyeHeight() - 128.0D) == 0.0D ? 0 : (var37 < 0.0D ? -1 : 1))) {
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
                                                                            profiler;
                                                                            var32 = Class60.
                                                                            ("ji|j\u007fixnwic{\u007f5");
                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10004.endStartSection(var32);
                                                                                this. (0, var2);
                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this.                                                                                   .
                                                                                    getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                                                                                    RenderHelper.disableStandardItemLighting();
                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var17 = this.                                                                                   .
                                                                                        profiler;
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
                                                                                                var17.endStartSection(var21);
                                                                                                var24 = (double) var2;
                                                                                                var10006 = this.++;
                                                                                                if (llIIlIIlIlII(this..player.isSpectator()))
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
                                                                                                var5.setupTerrain(var9, var24, var8, var10006, var35);
                                                                                                Profiler var25;
                                                                                                String var26;
                                                                                                if (!llIIlIIlIIlI(var1) || llIIlIIlIlIl(var1, 2)) {
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var25 = this.                                                                                   .
                                                                                                    profiler;
                                                                                                    var26 = Class60.
                                                                                                    ("nj|zk\u007f\u007fsft{(");
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    var25.endStartSection(var26);
                                                                                                    this.                                                                                   .
                                                                                                    renderGlobal.updateChunks(var3);
                                                                                                }

                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var27 = this.                                                                                   .
                                                                                                    profiler;
                                                                                                    var29 = Class60.
                                                                                                    ("hxmnyt5");
                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var27.endStartSection(var29);
                                                                                                        GlStateManager.matrixMode(5888);
                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GlStateManager.pushMatrix();
                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                GlStateManager.disableAlpha();
                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    var5.renderBlockLayer(BlockRenderLayer.SOLID, (double) var2, var1, var9);
                                                                                                                    GlStateManager.enableAlpha();
                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        ITextureObject var18 = this.                                                                                   .
                                                                                                                        getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                                                                                                                        if (llIIlIIllIlI(this..gameSettings.mipmapLevels))
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
                                                                                                                            var18.setBlurMipmap(false, var22);
                                                                                                                            var5.renderBlockLayer(BlockRenderLayer.CUTOUT_MIPPED, (double) var2, var1, var9);
                                                                                                                            this.                                                                                   .
                                                                                                                            getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
                                                                                                                            this.                                                                                   .
                                                                                                                            getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
                                                                                                                            var5.renderBlockLayer(BlockRenderLayer.CUTOUT, (double) var2, var1, var9);
                                                                                                                            this.                                                                                   .
                                                                                                                            getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
                                                                                                                            GlStateManager.shadeModel(7424);
                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                GlStateManager.alphaFunc(516, 0.1F);
                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    if (llIIlIIlIlII(this.)) {
                                                                                                                                        GlStateManager.matrixMode(5888);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        GlStateManager.popMatrix();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        GlStateManager.pushMatrix();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        RenderHelper.enableStandardItemLighting();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var10004 = this.                                                                                   .
                                                                                                                                        profiler;
                                                                                                                                        var32 = Class60.
                                                                                                                                        ("~tlrksy(");
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var10004.endStartSection(var32);
                                                                                                                                        ForgeHooksClient.setRenderPass(0);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        var5.renderEntities(var9, var8, var2);
                                                                                                                                        ForgeHooksClient.setRenderPass(0);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        RenderHelper.disableStandardItemLighting();
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        }

                                                                                                                                        this.disableLightmap();
                                                                                                                                    }

                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        GlStateManager.matrixMode(5888);
                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            GlStateManager.popMatrix();
                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                if (llIIlIIlIIlI(var7) && llIIlIIlllIl(this..objectMouseOver) &&
                                                                                                                                                llIIlIIlIlII(var9.isInsideOfMaterial(Material.WATER)))
                                                                                                                                                {
                                                                                                                                                    EntityPlayer var16 = (EntityPlayer) var9;
                                                                                                                                                    GlStateManager.disableAlpha();
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10002 = this.                                                                                   .
                                                                                                                                                    profiler;
                                                                                                                                                    var10003 = Class60.
                                                                                                                                                    ("shkpqs>");
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    var10002.endStartSection(var10003);
                                                                                                                                                    byte var19 = ForgeHooksClient.onDrawBlockHighlight(var5, var16, this..objectMouseOver,
                                                                                                                                                    0, var2)
                                                                                                                                                    ;
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIlII(var19)) {
                                                                                                                                                        var5.drawSelectionBox(var16, this..objectMouseOver, 0, var2)
                                                                                                                                                        ;
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }

                                                                                                                                                    GlStateManager.enableAlpha();
                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }

                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    if (llIIlIIlIIlI(this..debugRenderer.shouldRender()))
                                                                                                                                                    {
                                                                                                                                                        this.                                                                                   .
                                                                                                                                                        debugRenderer.renderDebug(var2, var3);
                                                                                                                                                    }

                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var10004 = this.                                                                                   .
                                                                                                                                                        profiler;
                                                                                                                                                        var32 = Class60.
                                                                                                                                                        ("ppd`bzjDnzxf}f(");
                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            var10004.endStartSection(var32);
                                                                                                                                                            GlStateManager.enableBlend();
                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    this.                                                                                   .
                                                                                                                                                                    getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
                                                                                                                                                                    Tessellator var31 = Tessellator.getInstance();
                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        Tessellator var34 = Tessellator.getInstance();
                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            var5.drawBlockDamageTexture(var31, var34.getBuffer(), var9, var2);
                                                                                                                                                                            this.                                                                                   .
                                                                                                                                                                            getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
                                                                                                                                                                            GlStateManager.disableBlend();
                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                throw null;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (llIIlIIlIlII(this.)) {
                                                                                                                                                                                    this.enableLightmap();
                                                                                                                                                                                    Profiler var36 = this.                                                                                   .
                                                                                                                                                                                    profiler;
                                                                                                                                                                                    String var10009 = Class60.
                                                                                                                                                                                    ("wslK~hhrpvu(");
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    var36.endStartSection(var10009);
                                                                                                                                                                                    var6.renderLitParticles(var9, var2);
                                                                                                                                                                                    RenderHelper.disableStandardItemLighting();
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
                                                                                                                                                                                    profiler;
                                                                                                                                                                                    var29 = Class60.
                                                                                                                                                                                    ("csbg~qxv(");
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }

                                                                                                                                                                                    var27.endStartSection(var29);
                                                                                                                                                                                    var6.renderParticles(var9, var2);
                                                                                                                                                                                    this.disableLightmap();
                                                                                                                                                                                }

                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                    throw null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    GlStateManager.depthMask(false);
                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        GlStateManager.enableCull();
                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            Profiler var10012 = this.                                                                                   .
                                                                                                                                                                                            profiler;
                                                                                                                                                                                            String var10013 = Class60.
                                                                                                                                                                                            ("kx~hpx)");
                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                var10012.endStartSection(var10013);
                                                                                                                                                                                                this.renderRainSnow(var2);
                                                                                                                                                                                                GlStateManager.depthMask(true);
                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    var5.renderWorldBorder(var9, var2);
                                                                                                                                                                                                    GlStateManager.disableBlend();
                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        GlStateManager.enableCull();
                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                GlStateManager.alphaFunc(516, 0.1F);
                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    this.
                                                                                                                                                                                                                    (0, var2)
                                                                                                                                                                                                                    ;
                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        GlStateManager.enableBlend();
                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            GlStateManager.depthMask(false);
                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                this.                                                                                   .
                                                                                                                                                                                                                                getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                                                                                                                                                                                                                                GlStateManager.shadeModel(7425);
                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    var10002 = this.                                                                                   .
                                                                                                                                                                                                                                    profiler;
                                                                                                                                                                                                                                    var10003 = Class60.
                                                                                                                                                                                                                                    ("dcr~g}bs}\u007f/");
                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        var10002.endStartSection(var10003);
                                                                                                                                                                                                                                        var5.renderBlockLayer(BlockRenderLayer.TRANSLUCENT, (double) var2, var1, var9);
                                                                                                                                                                                                                                        if (llIIlIIlIlII(this.)) {
                                                                                                                                                                                                                                            RenderHelper.enableStandardItemLighting();
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var27 = this.                                                                                   .
                                                                                                                                                                                                                                            profiler;
                                                                                                                                                                                                                                            var29 = Class60.
                                                                                                                                                                                                                                            ("~tlrksy(");
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var27.endStartSection(var29);
                                                                                                                                                                                                                                            ForgeHooksClient.setRenderPass(1);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            var5.renderEntities(var9, var8, var2);
                                                                                                                                                                                                                                            GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            ForgeHooksClient.setRenderPass(-1);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                            RenderHelper.disableStandardItemLighting();
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            GlStateManager.shadeModel(7424);
                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                GlStateManager.depthMask(true);
                                                                                                                                                                                                                                                if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    GlStateManager.enableCull();
                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        GlStateManager.disableBlend();
                                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            GlStateManager.disableFog();
                                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                double var38;
                                                                                                                                                                                                                                                                if (llIIlIIllIII((var38 = var9.posY + (double) var9.getEyeHeight() - 128.0D) == 0.0D ? 0 : (var38 < 0.0D ? -1 : 1))) {
                                                                                                                                                                                                                                                                    var27 = this.                                                                                   .
                                                                                                                                                                                                                                                                    profiler;
                                                                                                                                                                                                                                                                    var29 = Class60.
                                                                                                                                                                                                                                                                    ("qs|fqR{\u007fmu(");
                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                    var27.endStartSection(var29);
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
                                                                                                                                                                                                                                                                    profiler;
                                                                                                                                                                                                                                                                    var32 = Class60.
                                                                                                                                                                                                                                                                    ("mezljU~nmneyXfex/");
                                                                                                                                                                                                                                                                    if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        var10004.endStartSection(var32);
                                                                                                                                                                                                                                                                        ForgeHooksClient.dispatchRenderLast(var5, var2);
                                                                                                                                                                                                                                                                        if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            var25 = this.                                                                                   .
                                                                                                                                                                                                                                                                            profiler;
                                                                                                                                                                                                                                                                            var26 = Class60.
                                                                                                                                                                                                                                                                            ("s{v?");
                                                                                                                                                                                                                                                                            if (llIIlIIlIIll(23361, 6878)) {
                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                var25.endStartSection(var26);
                                                                                                                                                                                                                                                                                if (llIIlIIlIIlI(this.)) {
                                                                                                                                                                                                                                                                                    GlStateManager.clear(256);
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

    public void renderRainSnow(float var1) {
        IRenderHandler var2;
        boolean var40;
        if (llIIlIIlllIl(var2 = this..world.provider.getWeatherRenderer())){
            var2.render(var1, this..world, this.                                                                                   )
            ;
            var40 = true;
        } else if (llIIlIIlIIll(50829, 5417)) {
            throw null;
        } else {
            float var36;
            float var46;
            if (llIIlIIllIlI((var46 = (var36 = this..world.getRainStrength(var1)) - 0.0F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1)))
            {
                this.enableLightmap();
                Entity var3 = this.                                                                                   .
                getRenderViewEntity();
                WorldClient var4 = this.                                                                                   .
                world;
                int var10006 = MathHelper.floor(var3.posX);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var5 = var10006;
                int var10005 = MathHelper.floor(var3.posY);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var6 = var10005;
                int var10004 = MathHelper.floor(var3.posZ);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var7 = var10004;
                Tessellator var41 = Tessellator.getInstance();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                Tessellator var8 = var41;
                BufferBuilder var9 = var41.getBuffer();
                GlStateManager.disableCull();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                GlStateManager.alphaFunc(516, 0.1F);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                double var10 = var3.lastTickPosX + (var3.posX - var3.lastTickPosX) * (double) var1;
                double var12 = var3.lastTickPosY + (var3.posY - var3.lastTickPosY) * (double) var1;
                double var14 = var3.lastTickPosZ + (var3.posZ - var3.lastTickPosZ) * (double) var1;
                int var10001 = MathHelper.floor(var12);
                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                int var16 = var10001;
                byte var17 = 5;
                if (llIIlIIlIIlI(this..gameSettings.fancyGraphics)){
                var17 = 10;
            }

                if (llIIlIIlIIll(50829, 5417)) {
                    throw null;
                }

                byte var18 = -1;
                float var19 = (float) this. + var1;
                var9.setTranslation(-var10, -var12, -var14);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
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
                            var8.draw();
                        }

                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        var9.setTranslation(0.0D, 0.0D, 0.0D);
                        GlStateManager.enableCull();
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        GlStateManager.disableBlend();
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        GlStateManager.alphaFunc(516, 0.1F);
                        if (llIIlIIlIIll(50829, 5417)) {
                            throw null;
                        }

                        this.disableLightmap();
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
                        var20.setPos(var22, 0, var21);
                        Biome var42 = var4.getBiome(var20);
                        if (!llIIlIIlIlII(var42.canRain()) || llIIlIIlIIlI(var42.getEnableSnow())) {
                            if (llIIlIIlIIll(50829, 5417)) {
                                throw null;
                            }

                            int var24 = var4.getPrecipitationHeight(var20).getY();
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
                                var20.setPos(var22, var25, var21);
                                float var43 = var42.getTemperature(var20);
                                double var28;
                                double var30;
                                float var38;
                                float var47;
                                if (llIIlIIllIII((var47 = var4.getBiomeProvider().getTemperatureAtHeight(var43, var24) - 0.15F) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1))) {
                                    if (llIIlIIlIIlI(var18)) {
                                        if (llIIlIIllIII(var18)) {
                                            var8.draw();
                                        }

                                        if (llIIlIIlIIll(50829, 5417)) {
                                            throw null;
                                        }

                                        var18 = 0;
                                        this.                                                                                   .
                                        getTextureManager().bindTexture();
                                        var9.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                    }

                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var14 = -((double) (this. + var22 * var22 * 3121 + var22 * 45238971 + var21 * var21 * 418711 + var21 * 13761 & 31) + (double) var1) / 32.0D * (3.0D + this..nextDouble())
                                    ;
                                    var28 = (double) ((float) var22 + 0.5F) - var3.posX;
                                    var30 = (double) ((float) var21 + 0.5F) - var3.posZ;
                                    var38 = MathHelper.sqrt(var28 * var28 + var30 * var30);
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    float var32 = var38 / (float) var17;
                                    float var33 = ((1.0F - var32 * var32) * 0.5F + 0.5F) * var36;
                                    var20.setPos(var22, var27, var21);
                                    int var34;
                                    int var35 = (var34 = var4.getCombinedLight(var20, 0)) >> 16 & '\uffff';
                                    var23 = var34 & '\uffff';
                                    var9.pos((double) var22 - var10 + 0.5D, (double) var26, (double) var21 - var12 + 0.5D).tex(0.0D, (double) var25 * 0.25D + var14).color(1.0F, 1.0F, 1.0F, var33).lightmap(var35, var23).endVertex();
                                    var9.pos((double) var22 + var10 + 0.5D, (double) var26, (double) var21 + var12 + 0.5D).tex(1.0D, (double) var25 * 0.25D + var14).color(1.0F, 1.0F, 1.0F, var33).lightmap(var35, var23).endVertex();
                                    var9.pos((double) var22 + var10 + 0.5D, (double) var25, (double) var21 + var12 + 0.5D).tex(1.0D, (double) var26 * 0.25D + var14).color(1.0F, 1.0F, 1.0F, var33).lightmap(var35, var23).endVertex();
                                    var9.pos((double) var22 - var10 + 0.5D, (double) var25, (double) var21 - var12 + 0.5D).tex(0.0D, (double) var26 * 0.25D + var14).color(1.0F, 1.0F, 1.0F, var33).lightmap(var35, var23).endVertex();
                                    var40 = true;
                                } else {
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    if (llIIlIIlllll(var18, 1)) {
                                        if (llIIlIIllIII(var18)) {
                                            var8.draw();
                                        }

                                        if (llIIlIIlIIll(50829, 5417)) {
                                            throw null;
                                        }

                                        var18 = 1;
                                        this.                                                                                   .
                                        getTextureManager().bindTexture();
                                        var9.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                    }

                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var14 = (double) (-((float) (this. & 511) + var1) / 512.0F);
                                    var28 = this.                                                                                              .
                                    nextDouble() + (double) var19 * 0.01D * (double) ((float) this..nextGaussian());
                                    var30 = this.                                                                                              .
                                    nextDouble() + (double) (var19 * (float) this..nextGaussian()) *0.001D;
                                    double var44 = (double) ((float) var22 + 0.5F) - var3.posX;
                                    double var45 = (double) ((float) var21 + 0.5F) - var3.posZ;
                                    var38 = MathHelper.sqrt(var44 * var44 + var45 * var45);
                                    if (llIIlIIlIIll(50829, 5417)) {
                                        throw null;
                                    }

                                    var43 = var38 / (float) var17;
                                    var43 = ((1.0F - var43 * var43) * 0.3F + 0.5F) * var36;
                                    var20.setPos(var22, var27, var21);
                                    var27 = (var24 = (var4.getCombinedLight(var20, 0) * 3 + 15728880) / 4) >> 16 & '\uffff';
                                    var24 &= 65535;
                                    var9.pos((double) var22 - var10 + 0.5D, (double) var26, (double) var21 - var12 + 0.5D).tex(0.0D + var28, (double) var25 * 0.25D + var14 + var30).color(1.0F, 1.0F, 1.0F, var43).lightmap(var27, var24).endVertex();
                                    var9.pos((double) var22 + var10 + 0.5D, (double) var26, (double) var21 + var12 + 0.5D).tex(1.0D + var28, (double) var25 * 0.25D + var14 + var30).color(1.0F, 1.0F, 1.0F, var43).lightmap(var27, var24).endVertex();
                                    var9.pos((double) var22 + var10 + 0.5D, (double) var25, (double) var21 + var12 + 0.5D).tex(1.0D + var28, (double) var26 * 0.25D + var14 + var30).color(1.0F, 1.0F, 1.0F, var43).lightmap(var27, var24).endVertex();
                                    var9.pos((double) var22 - var10 + 0.5D, (double) var25, (double) var21 - var12 + 0.5D).tex(0.0D + var28, (double) var26 * 0.25D + var14 + var30).color(1.0F, 1.0F, 1.0F, var43).lightmap(var27, var24).endVertex();
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

    public void stopUseShader() {
        if (llIIlIIlllIl(this.)) {
            this.                                                                                                                                     .
            deleteShaderGroup();
        }

        if (llIIlIIlIIll(54799, 4280)) {
            throw null;
        } else {
            this. = null;
            this. =;
            boolean var10000 = true;
        }
    }

    public void loadShader(ResourceLocation var1) {
        Logger var10000;
        String var10001;
        boolean var5;
        try {
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            ShaderGroup var10002 = new ShaderGroup(this..getTextureManager(), this., this.                                                                                   .
            getFramebuffer(), var1);
            if (llIIlIIlIIll(20379, 6631)) {
                throw null;
            }

            this. = var10002;
            this.                                                                                                                                     .
            createBindFramebuffers(this..displayWidth, this.                                                                                   .
            displayHeight);
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
            if (llIIlIIlIIlI((var1 = this..getRenderViewEntity()) instanceof EntityPlayer) &&
            llIIlIIlIlII(this..gameSettings.hideGUI)){
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
                if (llIIlIIlIIlI(var2) && llIIlIIlIlII(((EntityPlayer) var1).capabilities.allowEdit)) {
                    ItemStack var5 = ((EntityPlayer) var1).getHeldItemMainhand();
                    if (llIIlIIlllIl(this..objectMouseOver) &&llIIlIlIIIIl(this..objectMouseOver.typeOfHit, Type.BLOCK))
                    {
                        BlockPos var3 = this.                                                                                   .
                        objectMouseOver.getBlockPos();
                        Block var4 = this.                                                                                   .
                        world.getBlockState(var3).getBlock();
                        if (llIIlIlIIIIl(this..playerController.getCurrentGameType(),GameType.SPECTATOR)){
                        boolean var7;
                        if (llIIlIIlIIlI(var4.hasTileEntity(this..world.getBlockState(var3))) &&
                        llIIlIIlIIlI(this..world.getTileEntity(var3) instanceof IInventory)){
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

                        if (llIIlIIlIlII(var5.isEmpty()) && (!llIIlIIlIlII(var5.canDestroy(var4)) || llIIlIIlIIlI(var5.canPlaceOn(var4)))) {
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

    public void disableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        if (llIIlIIlIIll(49475, 6540)) {
            throw null;
        } else {
            GlStateManager.disableTexture2D();
            if (llIIlIIlIIll(49475, 6540)) {
                throw null;
            } else {
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
                if (llIIlIIlIIll(49475, 6540)) {
                    throw null;
                } else {
                    boolean var10000 = true;
                }
            }
        }
    }

    public void renderStreamIndicator(float var1) {
        this.setupOverlayRendering();
        boolean var10000 = true;
    }

    private float ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityLivingBase var1, float var2) {
        int var3;
        if (llIIlIIllIll(var3 = var1.getActivePotionEffect(MobEffects.NIGHT_VISION).getDuration(), 200)) {
            return 1.0F;
        } else if (llIIlIIlIIll(19728, 532)) {
            throw null;
        } else {
            float var10001 = MathHelper.sin(((float) var3 - var2) * 3.1415927F * 0.2F);
            if (llIIlIIlIIll(19728, 532)) {
                throw null;
            } else {
                return 0.7F + var10001 * 0.3F;
            }
        }
    }

    public void switchUseShader() {
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

    public MapItemRenderer getMapItemRenderer() {
        return this.;
    }

    public void updateRenderer() {
        if (llIIlIIlIIlI(OpenGlHelper.shadersSupported)) {
            ShaderLinkHelper var10000 = ShaderLinkHelper.getStaticShaderLinkHelper();
            if (llIIlIIlIIll(89737, 5668)) {
                throw null;
            }

            if (llIIlIIlllII(var10000)) {
                ShaderLinkHelper.setNewStaticShaderLinkHelper();
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
                    if (llIIlIIlIIlI(this..gameSettings.smoothCamera)){
                        var3 = this;
                        float var10007 = var1 = this.                                                                                   .
                        gameSettings.mouseSensitivity * 0.6F + 0.2F;
                        var2 = var10007 * var10007 * var1 * 8.0F;
                        this. = this.                                                                                .
                        smooth(this., 0.05F * var2);
                        this. = this.                                                                                                       .
                        smooth(this., 0.05F * var2);
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
                        reset();
                        this.                                                                                                       .
                        reset();
                    }

                    if (llIIlIIlIIll(89737, 5668)) {
                        throw null;
                    } else {
                        if (llIIlIIlllII(var3..getRenderViewEntity())){
                            this.                                                                                   .
                            setRenderViewEntity(this..player);
                        }

                        if (llIIlIIlIIll(89737, 5668)) {
                            throw null;
                        } else {
                            WorldClient var10008 = this.                                                                                   .
                            world;
                            BlockPos var10009 = new BlockPos(this..getRenderViewEntity().getPositionEyes(1.0F));
                            if (llIIlIIlIIll(89737, 5668)) {
                                throw null;
                            } else {
                                var1 = var10008.getLightBrightness(var10009);
                                var2 = (float) this.                                                                                   .
                                gameSettings.renderDistanceChunks / 32.0F;
                                var1 = var1 * (1.0F - var2) + var2;
                                this. += (var1 - this.) * 0.1F;
                                ++this.;
                                this.                                                                                                     .
                                updateEquippedItem();
                                this. ();
                                if (llIIlIIlIIll(89737, 5668)) {
                                    throw null;
                                } else {
                                    label93:
                                    {
                                        this. = this.;
                                        if (llIIlIIlIIlI(this..ingameGUI.getBossOverlay().shouldDarkenSky())){
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
        if (llIIlIIlIIlI(this..gameSettings.shouldRenderClouds())){
            Profiler var10008 = this.                                                                                   .
            profiler;
            String var10009 = Class60. ("ywvoz(");
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            var10008.endStartSection(var10009);
            GlStateManager.matrixMode(5889);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.loadIdentity();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            float var10006 = this. (var2, true);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            Project.gluPerspective(var10006, (float) this..displayWidth / (float) this.                                                                                   .
            displayHeight, 0.05F, this. * 4.0F);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.matrixMode(5888);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.pushMatrix();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            this. (0, var2);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            var1.renderClouds(var2, var3, var4, var6, var8);
            GlStateManager.disableFog();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.popMatrix();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.matrixMode(5889);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.loadIdentity();
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            float var10001 = this. (var2, true);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            Project.gluPerspective(var10001, (float) this..displayWidth / (float) this.                                                                                   .
            displayHeight, 0.05F, this. * MathHelper.SQRT_2);
            if (llIIlIIlIIll(78312, 2593)) {
                throw null;
            }

            GlStateManager.matrixMode(5888);
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

    public void updateCameraAndRender(float var1, long var2) {
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
                        if (llIIlIIlIlII(var10000) && llIIlIIlIIlI(this..gameSettings.pauseOnLostFocus)){
                        if (!llIIlIIlIIlI(this..gameSettings.touchscreen)){
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

                        var10001 = Minecraft.getSystemTime();
                        if (llIIlIIlIIll(65756, 1744)) {
                            throw null;
                        }

                        this. = var10001;
                        break label381;
                    }

                    if (llIIlIIlIIll(65756, 1744)) {
                        throw null;
                    }

                    var22 = Minecraft.getSystemTime();
                    if (llIIlIIlIIll(65756, 1744)) {
                        throw null;
                    }

                    long var40;
                    if (llIIlIIllIlI((var40 = var22 - this. - 500L) == 0L ? 0 : (var40 < 0L ? -1 : 1))) {
                        var23 = this;
                        this.                                                                                   .
                        displayInGameMenu();
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
                profiler;
                String var25 = Class60. ("rqil>");
                if (llIIlIIlIIll(65756, 1744)) {
                    throw null;
                } else {
                    var26.startSection(var25);
                    int var27;
                    if (llIIlIIlIIlI(var4) && llIIlIIlIIlI(Minecraft.IS_RUNNING_ON_MAC) && llIIlIIlIIlI(this..inGameHasFocus))
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
                            if (llIIlIIlIIlI(this..inGameHasFocus) &&llIIlIIlIIlI(var4)){
                            this.                                                                                   .
                            mouseHelper.mouseXYChange();
                            this.                                                                                   .
                            getTutorial().handleMouse(this..mouseHelper);
                            float var5;
                            float var10003 = var5 = this.                                                                                   .
                            gameSettings.mouseSensitivity * 0.6F + 0.2F;
                            float var6 = var10003 * var10003 * var5 * 8.0F;
                            float var7 = (float) this.                                                                                   .
                            mouseHelper.deltaX * var6;
                            float var8 = (float) this.                                                                                   .
                            mouseHelper.deltaY * var6;
                            byte var9 = 1;
                            if (llIIlIIlIIlI(this..gameSettings.invertMouse)){
                                var9 = -1;
                            }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            if (llIIlIIlIIlI(this..gameSettings.smoothCamera)){
                                var23 = this;
                                this. += var7;
                                this. += var8;
                                float var10 = var1 - this.;
                                this. = var1;
                                var7 = this. * var10;
                                var8 = this. * var10;
                                this.                                                                                   .
                                player.turn(var7, var8 * (float) var9);
                                var24 = true;
                                break label385;
                            }

                            if (llIIlIIlIIll(65756, 1744)) {
                                throw null;
                            }

                            this. = 0.0F;
                            this. = 0.0F;
                            this.                                                                                   .
                            player.turn(var7, var8 * (float) var9);
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
                            profiler.endSection();
                            boolean var37;
                            if (llIIlIIlIlII(this..skipRenderWorld)){
                                                                                                                        =
                                this.                                                                                   .
                                gameSettings.anaglyph;
                                ScaledResolution var30 = new ScaledResolution(this.);
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                ScaledResolution var15 = var30;
                                int var16 = var30.getScaledWidth();
                                int var17 = var30.getScaledHeight();
                                var27 = Mouse.getX();
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                int var18 = var27 * var16 / this.                                                                                   .
                                displayWidth;
                                int var10002 = Mouse.getY();
                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                int var19 = var17 - var10002 * var17 / this.                                                                                   .
                                displayHeight - 1;
                                int var20 = this.                                                                                   .
                                gameSettings.limitFramerate;
                                String var31;
                                if (llIIlIIlllIl(this..world)){
                                    Profiler var28 = this.                                                                                   .
                                    profiler;
                                    var31 = Class60. ("s{jz7");
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var28.startSection(var31);
                                    var10002 = Minecraft.getDebugFPS();
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

                                    this.renderWorld(var1, var33 + var2);
                                    if (llIIlIIlIIlI(this..isSingleplayer())){
                                        var22 = this.;
                                        var10001 = Minecraft.getSystemTime();
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        long var41;
                                        if (llIIlIlIIIII((var41 = var22 - (var10001 - 1000L)) == 0L ? 0 : (var41 < 0L ? -1 : 1))) {
                                            var32 = Minecraft.getSystemTime();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            this. = var32;
                                            if (llIIlIIlIlII(this..getIntegratedServer().isWorldIconSet())){
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

                                    if (llIIlIIlIIlI(OpenGlHelper.shadersSupported)) {
                                        this.                                                                                   .
                                        renderGlobal.renderEntityOutlineFramebuffer();
                                        if (llIIlIIlllIl(this.) && llIIlIIlIIlI(this.)) {
                                            GlStateManager.matrixMode(5890);
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            GlStateManager.pushMatrix();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            GlStateManager.loadIdentity();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }

                                            this.                                                                                                                                     .
                                            render(var1);
                                            GlStateManager.popMatrix();
                                            if (llIIlIIlIIll(65756, 1744)) {
                                                throw null;
                                            }
                                        }

                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.                                                                                   .
                                        getFramebuffer().bindFramebuffer(true);
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    Profiler var34 = this.                                                                                   .
                                    profiler;
                                    String var35 = Class60. ("\u007fl2");
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var34.endStartSection(var35);
                                    if (!llIIlIIlIIlI(this..gameSettings.hideGUI) ||
                                    llIIlIIlllIl(this..currentScreen)){
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        GlStateManager.alphaFunc(516, 0.1F);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.setupOverlayRendering();
                                        this. (var16, var17, var1);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        this.                                                                                   .
                                        ingameGUI.renderGameOverlay(var1);
                                    }

                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var23 = this;
                                    this.                                                                                   .
                                    profiler.endSection();
                                    var24 = true;
                                } else{
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.viewport(0, 0, this..displayWidth, this.                                                                                   .
                                    displayHeight);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.matrixMode(5889);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.loadIdentity();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.matrixMode(5888);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    GlStateManager.loadIdentity();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    var23 = this;
                                    this.setupOverlayRendering();
                                    System.nanoTime();
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    TileEntityRendererDispatcher.instance.renderEngine = this.                                                                                   .
                                    getTextureManager();
                                    TileEntityRendererDispatcher.instance.fontRenderer = this.                                                                                   .
                                    fontRenderer;
                                }

                                if (llIIlIIlIIll(65756, 1744)) {
                                    throw null;
                                }

                                if (llIIlIIlllIl(var23..currentScreen)){
                                    GlStateManager.clear(256);
                                    if (llIIlIIlIIll(65756, 1744)) {
                                        throw null;
                                    }

                                    try {
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        ForgeHooksClient.drawScreen(this..currentScreen, var18, var19, this.                                                                                   .
                                        getTickLength());
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

                                        CrashReport var38 = CrashReport.makeCrashReport(var13, var25);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        CrashReport var21 = var38;
                                        var25 = Class60. ("\\m~jn`(}b``jq.djkouc(");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        CrashReportCategory var12 = var38.makeCategory(var25);
                                        String var10005 = Class60. ("Crauq\u007f7~y|>");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class68 var10006 = new Class68(this);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.addDetail(var10005, var10006);
                                        var31 = Class60. ("Wtli{;quqzesy5");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class174 var10004 = new Class174(this, var18, var19);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.addDetail(var31, var10004);
                                        var25 = Class60. ("Crauq\u007f7cqk>");
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        Class183 var36 = new Class183(this, var15);
                                        if (llIIlIIlIIll(65756, 1744)) {
                                            throw null;
                                        }

                                        var12.addDetail(var25, var36);
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
            profiler;
            String var10002 = Class60. ("ws\u007fskNy#");
            if (llIIlIIlIIll(44752, 5413)) {
                throw null;
            }

            var10001.startSection(var10002);
            WorldClient var2;
            if (llIIlIIlllIl(var2 = this..world)){
                float var3;
                float var4 = (var3 = var2.getSunBrightness(1.0F)) * 0.95F + 0.05F;
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
                        updateDynamicTexture();
                        this. = false;
                        this.                                                                                   .
                        profiler.endSection();
                        break;
                    }

                    float var6 = var2.provider.getLightBrightnessTable()[var5 / 16] * var4;
                    float var7 = var2.provider.getLightBrightnessTable()[var5 % 16] * (this. * 0.1F + 1.5F);
                    if (llIIlIIllIlI(var2.getLastLightningBolt())) {
                        var6 = var2.provider.getLightBrightnessTable()[var5 / 16];
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

                    if (llIIlIIlIlIl(var2.provider.getDimensionType().getId(), 1)) {
                        var8 = 0.22F + var7 * 0.75F;
                        var9 = 0.28F + var10 * 0.75F;
                        var12 = 0.25F + var11 * 0.75F;
                    }

                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    float[] var16 = new float[]{var8, var9, var12};
                    var2.provider.getLightmapColors(var1, var3, var6, var7, var16);
                    var8 = var16[0];
                    var9 = var16[1];
                    var12 = var16[2];
                    float var20 = MathHelper.clamp(var8, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var8 = var20;
                    var20 = MathHelper.clamp(var9, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var9 = var20;
                    var20 = MathHelper.clamp(var12, 0.0F, 1.0F);
                    if (llIIlIIlIIll(44752, 5413)) {
                        throw null;
                    }

                    var12 = var20;
                    if (llIIlIIlIIlI(this..player.isPotionActive(MobEffects.NIGHT_VISION))){
                        float var18 = this. (this..player, var1);
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
                    gameSettings.gammaSetting;
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

    public void setupCameraTransform(float var1, int var2) {
        this. = (float) (this..gameSettings.renderDistanceChunks * 16);
        GlStateManager.matrixMode(5889);
        if (llIIlIIlIIll(92404, 1079)) {
            throw null;
        } else {
            GlStateManager.loadIdentity();
            if (llIIlIIlIIll(92404, 1079)) {
                throw null;
            } else {
                if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
                    GlStateManager.translate((float) (-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
                    if (llIIlIIlIIll(92404, 1079)) {
                        throw null;
                    }
                }

                if (llIIlIIlIIll(92404, 1079)) {
                    throw null;
                } else {
                    double var5;
                    if (llIIlIIlIIlI((var5 = this. - 1.0D) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1))) {
                        GlStateManager.translate((float) this., (float) (-this.), 0.0F);
                        if (llIIlIIlIIll(92404, 1079)) {
                            throw null;
                        }

                        GlStateManager.scale(this., this., 1.0D);
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
                            Project.gluPerspective(var10002, (float) this..displayWidth / (float) this.                                                                                   .
                            displayHeight, 0.05F, this. * MathHelper.SQRT_2);
                            if (llIIlIIlIIll(92404, 1079)) {
                                throw null;
                            } else {
                                GlStateManager.matrixMode(5888);
                                if (llIIlIIlIIll(92404, 1079)) {
                                    throw null;
                                } else {
                                    GlStateManager.loadIdentity();
                                    if (llIIlIIlIIll(92404, 1079)) {
                                        throw null;
                                    } else {
                                        if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
                                            GlStateManager.translate((float) (var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
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
                                                if (llIIlIIlIIlI(this..gameSettings.viewBobbing)){
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
                                                    if (llIIlIIllIlI((var6 = (var4 = this..player.prevTimeInPortal + (this..player.timeInPortal - this..player.prevTimeInPortal) * var1)
                                                        -0.0F) ==0.0F ? 0 : (var6 < 0.0F ? -1 : 1))){
                                                        byte var3 = 20;
                                                        if (llIIlIIlIIlI(this..player.isPotionActive(MobEffects.NAUSEA)))
                                                        {
                                                            var3 = 7;
                                                        }

                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        var4 = (5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F) * (5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F);
                                                        GlStateManager.rotate(((float) this. + var1) * (float) var3, 0.0F, 1.0F, 1.0F);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        GlStateManager.scale(1.0F / var4, 1.0F, 1.0F);
                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                            throw null;
                                                        }

                                                        GlStateManager.rotate(-((float) this. + var1) * (float) var3, 0.0F, 1.0F, 1.0F);
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
                                                                                GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
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

                                                                        GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 2:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.rotate(-90.0F, 0.0F, 1.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 3:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        var10000 = true;
                                                                        return;
                                                                    case 4:
                                                                        if (llIIlIIlIIll(92404, 1079)) {
                                                                            throw null;
                                                                        }

                                                                        GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
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

    public void loadEntityShader(@Nullable Entity var1) {
        boolean var10000;
        if (llIIlIIlIIlI(OpenGlHelper.shadersSupported)) {
            if (llIIlIIlllIl(this.)) {
                this.                                                                                                                                     .
                deleteShaderGroup();
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

                this.loadShader(var10001);
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

                this.loadShader(var10001);
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

                this.loadShader(var10001);
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

    public void setupOverlayRendering() {
        ScaledResolution var10000 = new ScaledResolution(this.);
        if (llIIlIIlIIll(77035, 1855)) {
            throw null;
        } else {
            ScaledResolution var1 = var10000;
            GlStateManager.clear(256);
            if (llIIlIIlIIll(77035, 1855)) {
                throw null;
            } else {
                GlStateManager.matrixMode(5889);
                if (llIIlIIlIIll(77035, 1855)) {
                    throw null;
                } else {
                    GlStateManager.loadIdentity();
                    if (llIIlIIlIIll(77035, 1855)) {
                        throw null;
                    } else {
                        GlStateManager.ortho(0.0D, var1.getScaledWidth_double(), var1.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
                        if (llIIlIIlIIll(77035, 1855)) {
                            throw null;
                        } else {
                            GlStateManager.matrixMode(5888);
                            if (llIIlIIlIIll(77035, 1855)) {
                                throw null;
                            } else {
                                GlStateManager.loadIdentity();
                                if (llIIlIIlIIll(77035, 1855)) {
                                    throw null;
                                } else {
                                    GlStateManager.translate(0.0F, 0.0F, -2000.0F);
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
        world.getRainStrength(1.0F);
        if (llIIlIIlIlII(this..gameSettings.fancyGraphics)){
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
                getRenderViewEntity();
                WorldClient var3 = this.                                                                                   .
                world;
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
                if (llIIlIIlIlIl(this..gameSettings.particleSetting,1)){
                    var20 >>= 1;
                    var10000 = true;
                } else{
                    if (llIIlIIlIIll(81732, 7316)) {
                        throw null;
                    }

                    if (llIIlIIlIlIl(this..gameSettings.particleSetting,2)){
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
                            if (llIIlIIllIlI((var27 = var6 - (double) (var21.getY() + 1)) == 0.0D ? 0 : (var27 < 0.0D ? -1 : 1))) {
                                var23 = var3.getPrecipitationHeight(var21).getY();
                                int var25 = MathHelper.floor((float) var21.getY());
                                if (llIIlIIlIIll(81732, 7316)) {
                                    throw null;
                                }

                                if (llIIlIIllIll(var23, var25)) {
                                    this.                                                                                   .
                                    world.playSound(var4, var6, var8, SoundEvents.WEATHER_RAIN_ABOVE, SoundCategory.WEATHER, 0.1F, 0.5F, false);
                                    var10000 = true;
                                    return;
                                }
                            }

                            if (llIIlIIlIIll(81732, 7316)) {
                                throw null;
                            }

                            this.                                                                                   .
                            world.playSound(var4, var6, var8, SoundEvents.WEATHER_RAIN, SoundCategory.WEATHER, 0.2F, 1.0F, false);
                        }
                        break;
                    }

                    BlockPos var12;
                    Biome var13 = var3.getBiome(var12 = var3.getPrecipitationHeight(var21.add(this..nextInt(10) - this..nextInt(10), 0, this..nextInt(10) - this.                                                                                              .
                    nextInt(10))));
                    BlockPos var14;
                    IBlockState var15 = var3.getBlockState(var14 = var12.down());
                    float var28;
                    if (llIIlIIlIlll(var12.getY(), var21.getY() + 10) && llIIlIIlIIll(var12.getY(), var21.getY() - 10) && llIIlIIlIIlI(var13.canRain()) && llIIlIIllIII((var28 = var13.getTemperature(var12) - 0.15F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1))) {
                        double var16 = this.                                                                                              .
                        nextDouble();
                        double var18 = this.                                                                                              .
                        nextDouble();
                        AxisAlignedBB var22 = var15.getBoundingBox(var3, var14);
                        if (llIIlIIllIIl(var15.getMaterial(), Material.LAVA) && llIIlIIllIIl(var15.getBlock(), Blocks.MAGMA)) {
                            if (llIIlIIllIIl(var15.getMaterial(), Material.AIR)) {
                                ++var10;
                                if (llIIlIIlIlII(this..nextInt(var10))){
                                    var4 = (double) var14.getX() + var16;
                                    var6 = (double) ((float) var14.getY() + 0.1F) + var22.maxY - 1.0D;
                                    var8 = (double) var14.getZ() + var18;
                                }

                                if (llIIlIIlIIll(81732, 7316)) {
                                    throw null;
                                }

                                this.                                                                                   .
                                world.spawnParticle(EnumParticleTypes.WATER_DROP, (double) var14.getX() + var16, (double) ((float) var14.getY() + 0.1F) + var22.maxY, (double) var14.getZ() + var18, 0.0D, 0.0D, 0.0D, new int[0]);
                                var10000 = true;
                            }
                        } else {
                            if (llIIlIIlIIll(81732, 7316)) {
                                throw null;
                            }

                            this.                                                                                   .
                            world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) var12.getX() + var16, (double) ((float) var12.getY() + 0.1F) - var22.minY, (double) var12.getZ() + var18, 0.0D, 0.0D, 0.0D, new int[0]);
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

    public void setupFogColor(boolean var1) {
        boolean var10000;
        FloatBuffer var10001;
        if (llIIlIIlIIlI(var1)) {
            var10001 = this. (0.0F, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(23939, 7480)) {
                throw null;
            } else {
                GlStateManager.glFog(2918, var10001);
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
                GlStateManager.glFog(2918, var10001);
                if (llIIlIIlIIll(23939, 7480)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public boolean isShaderActive() {
        if (llIIlIIlIIlI(OpenGlHelper.shadersSupported) && llIIlIIlllIl(this.)) {
            return true;
        } else if (llIIlIIlIIll(54318, 52)) {
            throw null;
        } else {
            return false;
        }
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var1, int var2) {
        if (llIIlIIlIlII(this.)) {
            GlStateManager.matrixMode(5889);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.loadIdentity();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
                GlStateManager.translate((float) (-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
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

            Project.gluPerspective(var10002, (float) this..displayWidth / (float) this.                                                                                   .
            displayHeight, 0.05F, this. * 2.0F);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.matrixMode(5888);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.loadIdentity();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
                GlStateManager.translate((float) (var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.pushMatrix();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            this. (var1);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..gameSettings.viewBobbing)){
                this. (var1);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            byte var10000;
            if (llIIlIIlIIlI(this..getRenderViewEntity() instanceof EntityLivingBase) &&
            llIIlIIlIIlI(((EntityLivingBase) this..getRenderViewEntity()).isPlayerSleeping())){
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
            var10000 = ForgeHooksClient.renderFirstPersonHand(this..renderGlobal, var1, var2);
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIlII(var10000) && llIIlIIlIlII(this..gameSettings.thirdPersonView) &&
            llIIlIIlIlII(var3) && llIIlIIlIlII(this..gameSettings.hideGUI) &&
            llIIlIIlIlII(this..playerController.isSpectator())){
                this.enableLightmap();
                this.                                                                                                     .
                renderItemInFirstPerson(var1);
                this.disableLightmap();
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            GlStateManager.popMatrix();
            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIlII(this..gameSettings.thirdPersonView) &&llIIlIIlIlII(var3)){
                this.                                                                                                     .
                renderOverlays(var1);
                this. (var1);
                if (llIIlIIlIIll(72322, 790)) {
                    throw null;
                }
            }

            if (llIIlIIlIIll(72322, 790)) {
                throw null;
            }

            if (llIIlIIlIIlI(this..gameSettings.viewBobbing)){
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

    public void displayItemActivation(ItemStack var1) {
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

    public void updateShaderGroupSize(int var1, int var2) {
        if (llIIlIIlIIlI(OpenGlHelper.shadersSupported)) {
            if (llIIlIIlllIl(this.)) {
                this.                                                                                                                                     .
                createBindFramebuffers(var1, var2);
            }

            if (llIIlIIlIIll(20295, 6743)) {
                throw null;
            }

            this.                                                                                   .
            renderGlobal.createBindEntityOutlineFbs(var1, var2);
        }

        if (llIIlIIlIIll(20295, 6743)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private void _____________________________________________________________________________________/* $FF was:                                                                                      */(float var1) {
        if (llIIlIIlIIlI(this..getRenderViewEntity() instanceof EntityPlayer)){
            EntityPlayer var2;
            EntityPlayer var10000 = var2 = (EntityPlayer) this.                                                                                   .
            getRenderViewEntity();
            float var3 = var10000.distanceWalkedModified - var2.prevDistanceWalkedModified;
            var3 = -(var10000.distanceWalkedModified + var3 * var1);
            float var4 = var2.prevCameraYaw + (var2.cameraYaw - var2.prevCameraYaw) * var1;
            var1 = var10000.prevCameraPitch + (var2.cameraPitch - var2.prevCameraPitch) * var1;
            float var5 = MathHelper.sin(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = var5 * var4 * 0.5F;
            float var10001 = MathHelper.cos(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var10001 = Math.abs(var10001 * var4);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.translate(var5, -var10001, 0.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = MathHelper.sin(var3 * 3.1415927F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.rotate(var5 * var4 * 3.0F, 0.0F, 0.0F, 1.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = MathHelper.cos(var3 * 3.1415927F - 0.2F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            var5 = Math.abs(var5 * var4);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.rotate(var5 * 5.0F, 1.0F, 0.0F, 0.0F);
            if (llIIlIIlIIll(26403, 8134)) {
                throw null;
            }

            GlStateManager.rotate(var1, 1.0F, 0.0F, 0.0F);
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

    public void resetData() {
        this. = null;
        this.                                                                                                                                                        .
        clearLoadedMaps();
        boolean var10000 = true;
    }

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */(float var1) {
        WorldClient var2 = this.                                                                                   .
        world;
        Entity var3 = this.                                                                                   .
        getRenderViewEntity();
        float var4 = 0.25F + 0.75F * (float) this.                                                                                   .
        gameSettings.renderDistanceChunks / 32.0F;
        double var10005 = Math.pow((double) var4, 0.25D);
        if (llIIlIIlIIll(50634, 975)) {
            throw null;
        } else {
            var4 = 1.0F - (float) var10005;
            Vec3d var31 = var2.getSkyColor(this..getRenderViewEntity(), var1);
            float var5 = (float) var31.x;
            float var6 = (float) var31.y;
            float var7 = (float) var31.z;
            Vec3d var8;
            this. = (float) (var8 = var2.getFogColor(var1)).x;
            this. = (float) var8.y;
            this. = (float) var8.z;
            float var11;
            float var10000;
            boolean var10001;
            double var24;
            Vec3d var25;
            if (llIIlIIlIIll(this..gameSettings.renderDistanceChunks,4)){
                var10000 = MathHelper.sin(var2.getCelestialAngleRadians(var1));
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
                if (llIIlIlIIIII((var36 = (var11 = (float) var3.getLook(var1).dotProduct(var8)) - 0.0F) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1))) {
                    var11 = 0.0F;
                }

                if (llIIlIIlIIll(50634, 975)) {
                    throw null;
                }

                float[] var12;
                float var37;
                if (llIIlIIllIlI((var37 = var11 - 0.0F) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1)) && llIIlIIlllIl(var12 = var2.provider.calcSunriseSunsetColors(var2.getCelestialAngle(var1), var1))) {
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
                if (llIIlIIllIlI((var38 = (var19 = var2.getRainStrength(var1)) - 0.0F) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1))) {
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
                    if (llIIlIIllIlI((var39 = (var10 = var2.getThunderStrength(var1)) - 0.0F) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1))) {
                        var18 = 1.0F - var10 * 0.5F;
                        this. *= var18;
                        this. *= var18;
                        this. *= var18;
                    }

                    if (llIIlIIlIIll(50634, 975)) {
                        throw null;
                    } else {
                        IBlockState var26 = ActiveRenderInfo.getBlockStateAtEntityViewpoint(this..world, var3, var1);
                        if (llIIlIIlIIll(50634, 975)) {
                            throw null;
                        } else {
                            IBlockState var20 = var26;
                            Vec3d var21;
                            Class25 var28;
                            if (llIIlIIlIIlI(this.)) {
                                Vec3d var27 = var21 = var2.getCloudColour(var1);
                                var28 = this;
                                this. = (float) var21.x;
                                this. = (float) var21.y;
                                this. = (float) var27.z;
                                var10001 = true;
                            } else {
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                var25 = ActiveRenderInfo.projectViewFromEntity(var3, (double) var1);
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
                                Block var10003 = (var13 = this..world.getBlockState(var22)).getBlock();
                                WorldClient var33 = this.                                                                                   .
                                world;
                                Vec3d var10009 = new Vec3d((double) this., (double) this., (double) this.);
                                if (llIIlIIlIIll(50634, 975)) {
                                    throw null;
                                }

                                Vec3d var15;
                                this. = (float) (var15 = var10003.getFogColor(var33, var22, var13, var3, var10009, var1)).x;
                                this. = (float) var15.y;
                                this. = (float) var15.z;
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
                                    var23 = (var3.lastTickPosY + (var3.posY - var3.lastTickPosY) * (double) var1) * var2.provider.getVoidFogYFactor();
                                    if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).isPotionActive(MobEffects.BLINDNESS))) {
                                        int var16;
                                        if (llIIlIIlIllI(var16 = ((EntityLivingBase) var3).getActivePotionEffect(MobEffects.BLINDNESS).getDuration(), 20)) {
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
                                            if (llIIlIIlIIlI(var3 instanceof EntityLivingBase) && llIIlIIlIIlI(((EntityLivingBase) var3).isPotionActive(MobEffects.NIGHT_VISION))) {
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
                                                if (llIIlIIlIIlI(this..gameSettings.anaglyph)){
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
                                                        GlStateManager.clearColor(this., this., this., 0.0F);
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
                if (llIIlIIlIIlI(this..getRenderViewEntity() instanceof EntityLivingBase)){
                    EntityLivingBase var2;
                    EntityLivingBase var5 = var2 = (EntityLivingBase) this.                                                                                   .
                    getRenderViewEntity();
                    float var3 = (float) var5.hurtTime - var1;
                    float var4;
                    float var8;
                    if (llIIlIlIIIlI((var8 = var5.getHealth() - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1))) {
                        var4 = (float) var2.deathTime + var1;
                        GlStateManager.rotate(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
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

                    float var6 = var3 /= (float) var2.maxHurtTime;
                    var6 = MathHelper.sin(var6 * var6 * var3 * var3 * 3.1415927F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    var3 = var6;
                    GlStateManager.rotate(-(var4 = var2.attackedAtYaw), 0.0F, 1.0F, 0.0F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    GlStateManager.rotate(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
                    if (llIIlIIlIIll(82680, 8654)) {
                        throw null;
                    }

                    GlStateManager.rotate(var4, 0.0F, 1.0F, 0.0F);
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
        if (llIIlIIlIIlI(this..renderGlobal.hasNoChunkUpdates()) &&llIIlIIlIlII(this..getIntegratedServer().isWorldIconSet())){
            label68:
            {
                BufferedImage var10000 = ScreenShotHelper.createScreenshot(this..displayWidth, this.                                                                                   .
                displayHeight, this.                                                                                   .
                getFramebuffer());
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

                    ImageIO.write(var8, var10001, this..getIntegratedServer().getWorldIconFile());
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

    public void enableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        if (llIIlIIlIIll(95199, 5550)) {
            throw null;
        } else {
            GlStateManager.matrixMode(5890);
            if (llIIlIIlIIll(95199, 5550)) {
                throw null;
            } else {
                GlStateManager.loadIdentity();
                if (llIIlIIlIIll(95199, 5550)) {
                    throw null;
                } else {
                    GlStateManager.scale(0.00390625F, 0.00390625F, 0.00390625F);
                    if (llIIlIIlIIll(95199, 5550)) {
                        throw null;
                    } else {
                        GlStateManager.translate(8.0F, 8.0F, 8.0F);
                        if (llIIlIIlIIll(95199, 5550)) {
                            throw null;
                        } else {
                            GlStateManager.matrixMode(5888);
                            if (llIIlIIlIIll(95199, 5550)) {
                                throw null;
                            } else {
                                this.                                                                                   .
                                getTextureManager().bindTexture(this.);
                                GlStateManager.glTexParameteri(3553, 10241, 9729);
                                if (llIIlIIlIIll(95199, 5550)) {
                                    throw null;
                                } else {
                                    GlStateManager.glTexParameteri(3553, 10240, 9729);
                                    if (llIIlIIlIIll(95199, 5550)) {
                                        throw null;
                                    } else {
                                        GlStateManager.glTexParameteri(3553, 10242, 10496);
                                        if (llIIlIIlIIll(95199, 5550)) {
                                            throw null;
                                        } else {
                                            GlStateManager.glTexParameteri(3553, 10243, 10496);
                                            if (llIIlIIlIIll(95199, 5550)) {
                                                throw null;
                                            } else {
                                                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                                                if (llIIlIIlIIll(95199, 5550)) {
                                                    throw null;
                                                } else {
                                                    GlStateManager.enableTexture2D();
                                                    if (llIIlIIlIIll(95199, 5550)) {
                                                        throw null;
                                                    } else {
                                                        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
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
