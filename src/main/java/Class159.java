import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class159 extends Slot {
    private static int 1907=3105;
    private static int 28954=-31985;
    private static int 20914=-9755;
    private static int 51835=-1149;
    private static int 5533=25578;
    private static int 23550=-3657;
    private static int 219=21851;
    private static int 6752=28359;

    static {
        boolean var10000 = true;
    }

    public Class159(IInventory var1, int var2, int var3, int var4) {
        super(var1, var2, var3, var4);
        if (lllllIlIlIlI(51835, 6752)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean lllllIlIllII(Object var0) {
        return var0 == null;
    }

    private static boolean lllllIlIlIll(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIlIlIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIlIllIl(int var0) {
        return var0 == 0;
    }

    public boolean func_82869_a(EntityPlayer var1) {
        byte var10000 = super.func_82869_a(var1);
        if (lllllIlIlIlI(23550, 1907)) {
            throw null;
        } else if (lllllIlIlIll(var10000) && lllllIlIlIll(this.func_75216_d())) {
            ItemStack var2 = this.func_75211_c();
            String var10001 = Class60. ("Ynjnqv^hwzes`~Yui0");
            if (lllllIlIlIlI(23550, 1907)) {
                throw null;
            } else if (lllllIlIllII(var2.func_179543_a(var10001))) {
                return true;
            } else if (lllllIlIlIlI(23550, 1907)) {
                throw null;
            } else {
                return false;
            }
        } else if (lllllIlIlIlI(23550, 1907)) {
            throw null;
        } else if (lllllIlIllIl(this.func_75216_d())) {
            return true;
        } else if (lllllIlIlIlI(23550, 1907)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
