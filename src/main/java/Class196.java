import javax.annotation.Nullable;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class196 extends Slot {
    private static int 93217=-4621;
    private static int 62035=-19918;
    private final Slot;
    private static int 95153=-1412;
    private static int 40771=-11207;
    private static int 4480=29267;
    private static int 57209=-7112;
    private static int 3272=5151;
    private static int 1028=13577;
    private static int 5680=17821;
    private static int 810=20436;
    private static int 20493=-4480;
    private static int 4712=29766;
    private static int 215=503;
    private static int 12859=-17788;
    private static int 8=26208;
    private static int 1752=4576;
    private static int 6624=11520;
    private static int 9376=25079;
    private static int 23339=-29359;
    public final Class10;
    private static int 74837=-20407;
    private static int 3569=8878;
    private static int 43368=-27474;
    private static int 76817=-22487;
    private static int 36284=-7475;
    private static int 1663=948;
    private static int 2553=30776;
    private static int 7181=18709;
    private static int 5828=22858;
    private static int 8784=23086;
    private static int 7537=7444;
    private static int 68294=-29717;
    private static int 61827=-6096;
    private static int 78621=-3218;
    private static int 1540=6848;
    private static int 191=27172;
    private static int 74116=-10821;
    private static int 9536=-11362;
    private static int 4406=29998;
    private static int 82565=-1693;
    private static int 86435=-17998;
    private static int 5166=20207;
    private static int 75576=-649;
    private static int 95961=-2994;
    private static int 93719=-9115;
    private static int 5129=4452;
    private static int 76508=-3318;

    static {
        boolean var10000 = true;
    }

    public Class196(Class10 var1, Slot var2, int var3) {
        super(var2.inventory, var3, 0, 0);
        this. = var1;
        if (llIlllIIIllI(86435, 6624)) {
            throw null;
        } else {
            this. = var2;
            boolean var10000 = true;
        }
    }

    private static boolean llIlllIIIllI(int var0, int var1) {
        return var0 >= var1;
    }

    public static Slot ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class196 var0) {
        return var0.;
    }

    public boolean canTakeStack(EntityPlayer var1) {
        return this.                                                                                  .
        canTakeStack(var1);
    }

    public boolean isHere(IInventory var1, int var2) {
        return this.                                                                                  .
        isHere(var1, var2);
    }

    public ResourceLocation getBackgroundLocation() {
        return this.                                                                                  .
        getBackgroundLocation();
    }

    public void setBackgroundLocation(ResourceLocation var1) {
        this.                                                                                  .
        setBackgroundLocation(var1);
        boolean var10000 = true;
    }

    public boolean isEnabled() {
        return this.                                                                                  .isEnabled();
    }

    public ItemStack decrStackSize(int var1) {
        return this.                                                                                  .
        decrStackSize(var1);
    }

    public void putStack(ItemStack var1) {
        this.                                                                                  .putStack(var1);
        boolean var10000 = true;
    }

    public ItemStack onTake(EntityPlayer var1, ItemStack var2) {
        this.                                                                                  .
        onTake(var1, var2);
        return var2;
    }

    public int getSlotStackLimit() {
        return this.                                                                                  .getSlotStackLimit();
    }

    @Nullable
    public TextureAtlasSprite getBackgroundSprite() {
        return this.                                                                                  .
        getBackgroundSprite();
    }

    public void onSlotChanged() {
        this.                                                                                  .onSlotChanged();
        boolean var10000 = true;
    }

    @Nullable
    public String getSlotTexture() {
        return this.                                                                                  .getSlotTexture();
    }

    public boolean isItemValid(ItemStack var1) {
        return this.                                                                                  .
        isItemValid(var1);
    }

    public boolean isSameInventory(Slot var1) {
        return this.                                                                                  .
        isSameInventory(var1);
    }

    public int getItemStackLimit(ItemStack var1) {
        return this.                                                                                  .
        getItemStackLimit(var1);
    }

    public protected private abstract final synchronized native void _??????????_??????????/* $FF was: _?????????? ??????????*/();

    public ItemStack getStack() {
        return this.                                                                                  .getStack();
    }

    public boolean getHasStack() {
        return this.                                                                                  .getHasStack();
    }

    public void setBackgroundName(@Nullable String var1) {
        this.                                                                                  .setBackgroundName(var1);
        boolean var10000 = true;
    }

    public int getSlotIndex() {
        return this.                                                                                  .getSlotIndex();
    }
}
