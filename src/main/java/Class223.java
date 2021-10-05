import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class223 extends Class171 {
    private static int 26324=-11201;
    private static int 90380=-26013;
    private static int 9750=30098;
    private static int 96534=-7022;
    private static int 84079=-31354;
    private static int 8649=588;
    private static int 3423=6824;
    private static int 1960=21440;
    private static int 27329=-26998;
    public Class220;
    private static int 1993=6390;
    private static int 7710=1203;
    private static int 6562=14179;
    private static int 75248=-11806;
    private static int 95571=-28970;

    static {
        boolean var10000 = true;
    }

    public Class223() {
        String var10004 = Class60. ("Df4vdxu7mSO7\u000b");
        if (lllIlllIIllI(27329, 1993)) {
            throw null;
        } else {
            super(var10004, 47, Class188.);
            if (lllIlllIIllI(27329, 1993)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("[xm:wmxHs\u007f1sc(");
                if (lllIlllIIllI(27329, 1993)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 127, this, false);
                    if (lllIlllIIllI(27329, 1993)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. ((Class220[]) (new Class220[]{this.}));
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var0) {
        return var0 instanceof TileEntityMobSpawner;
    }

    private static boolean lllIlllIIllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlllIlIII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIlllIlIIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlllIlIlI(int var0, int var1) {
        return var0 == var1;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var0) {
        return 1;
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        return this.                                                                                                    .
        field_71441_e.field_147482_g.stream().filter(Class223::).mapToInt(Class223::).sum();
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        int var10000 = 0;
        String var10002 = String.valueOf(this. ());
        if (lllIlllIIllI(75248, 6562)) {
            throw null;
        } else {
            this. (var10002);

            boolean var18;
            for (int var11 = 0; !lllIlllIIllI(75248, 6562); var18 = true) {
                if (!lllIlllIlIII(var10000, this..field_71441_e.field_147482_g.size())){
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    boolean var19 = true;
                    return;
                }

                TileEntity var2;
                if (lllIlllIlIIl((var2 = (TileEntity) this..field_71441_e.field_147482_g.get(var11)) instanceof TileEntityMobSpawner))
                {
                    TileEntityMobSpawner var12;
                    TileEntityMobSpawner var16 = var12 = (TileEntityMobSpawner) var2;
                    BlockPos var10001 = var16.func_174877_v();
                    double var4 = (double) var10001.func_177958_n() - this.                                                                                                    .
                    func_175598_ae().field_78730_l;
                    double var6 = (double) var10001.func_177956_o() - this.                                                                                                    .
                    func_175598_ae().field_78731_m;
                    double var8 = (double) var10001.func_177952_p() - this.                                                                                                    .
                    func_175598_ae().field_78728_n;
                    BlockPos var3 = var16.func_145881_a().func_177221_b();
                    float var14 = ((float) this..field_71439_g.func_70011_f((double) var3.func_177958_n(), (double) var3.func_177956_o(), (double) var3.func_177952_p()) + 3.0F) *
                    0.5F;
                    GlStateManager.func_179094_E();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179090_x();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179097_i();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179129_p();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179147_l();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179132_a(false);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glEnable(2848);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glTranslated(var4, var6, var8);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_187441_d(2.0F);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.2F);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    Class181. (Block.field_185505_j);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glColor4f(1.0F, 0.0F, 0.0F, 1.0F);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    Class181. (Block.field_185505_j);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    if (lllIlllIlIIl(this.. ())){
                    Class181. (16.0F, 10, 10);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }
                }

                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    Vec3d var10 = Block.field_185505_j.func_189972_c();
                    GlStateManager.func_179137_b(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    float var17;
                    if (lllIlllIlIlI(this..field_71474_y.field_74320_O,2)){
                    var17 = -1.0F;
                    var18 = true;
                } else{
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    var17 = 1.0F;
                }

                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    float var15 = var17;
                    GL11.glRotatef(-this..func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glRotatef(this..func_175598_ae().field_78732_j, var15, 0.0F, 0.0F);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glScalef(-0.01F * var14, -0.01F * var14, -0.01F * var14);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    StringBuilder var10004 = new StringBuilder();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    var10004 = var10004.insert(0, var12.func_145881_a().func_184994_d().func_70005_c_());
                    String var10005 = Class60. ("8¾m");
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    var10004 = var10004.append(var10005);
                    int var20 = Class22. (var12);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    String var13 = String.valueOf(var10004.append(var20 / 20));
                    var14 = (float) this.                                                                                           .
                    (var13);
                    var15 = (float) (this..field_71466_p.field_78288_b + 1);
                    this.                                                                                           .
                    (-var14 / 2.0F - 1.0F, -var15 / 2.0F - 1.0F, var14 / 2.0F + 1.0F, var15 / 2.0F - 2.0F, Class73.                                                                                                  )
                    ;
                    this.                                                                                           .
                    (var13, -var14 / 2.0F, -var15 / 2.0F, Class73.                                                                                          )
                    ;
                    GlStateManager.func_179098_w();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179126_j();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179089_o();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179084_k();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179132_a(true);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GL11.glDisable(2848);
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179121_F();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }

                    GlStateManager.func_179117_G();
                    if (lllIlllIIllI(75248, 6562)) {
                        throw null;
                    }
                }

                if (lllIlllIIllI(75248, 6562)) {
                    throw null;
                }

                ++var11;
                var10000 = var11;
            }

            throw null;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
