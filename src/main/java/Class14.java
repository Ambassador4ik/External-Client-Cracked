import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class14 extends BlockModelRenderer {
    private static int 80859=-13753;
    private static int 14122=-19122;
    private static int 44=17418;
    private static int 53878=-2672;
    private static int 1931=19567;
    private static int 3679=13754;
    private static int 4045=7882;
    private static int 80076=-2259;

    static {
        boolean var10000 = true;
    }

    public Class14(BlockColors var1) {
        super(var1);
        if (llllllllllll(80859, 44)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llllllllllll(int var0, int var1) {
        return var0 >= var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean renderModel(IBlockAccess var1, IBakedModel var2, IBlockState var3, BlockPos var4, BufferBuilder var5, boolean var6) {
        long var10007 = MathHelper.getPositionRandom(var4);
        if (llllllllllll(14122, 1931)) {
            throw null;
        } else {
            return this.renderModel(var1, var2, var3, var4, var5, var6, var10007);
        }
    }
}
