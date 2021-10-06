import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Class3 extends Container {
    private static int 31249=-3685;
    private static int 4055=7705;
    private static int 63717=-30431;
    private static int 21794=-30511;
    private static int 5377=11302;
    private static int 7423=13631;
    private static int 39397=-28888;
    private static int 4300=32398;
    private static int 41139=-23719;
    private static int 24842=-19984;
    private static int 70849=-13174;
    private static int 2797=16108;
    private static int 80012=-5827;
    private static int 7355=12570;
    private static int 1798=24993;
    private static int 1498=15842;
    public NonNullList;
    private static int 62558=-27292;
    private static int 5266=24109;

    static {
        boolean var10000 = true;
    }

    public Class3(EntityPlayer var1) {
        if (llIlllIIlIll(31249, 5266)) {
            throw null;
        } else {
            NonNullList var10002 = NonNullList.create();
            if (llIlllIIlIll(31249, 5266)) {
                throw null;
            } else {
                this. = var10002;
                InventoryPlayer var2 = var1.inventory;

                int var3;
                boolean var5;
                label72:
                for (int var10000 = var3 = 0; !llIlllIIlIll(31249, 5266); var5 = true) {
                    int var10004;
                    int var10005;
                    if (!llIlllIIllll(var10000, 5)) {
                        if (llIlllIIlIll(31249, 5266)) {
                            throw null;
                        }

                        for (var10000 = var3 = 0; !llIlllIIlIll(31249, 5266); var5 = true) {
                            if (!llIlllIIllll(var10000, 9)) {
                                if (llIlllIIlIll(31249, 5266)) {
                                    throw null;
                                }

                                this.scrollTo(0.0F);
                                boolean var7 = true;
                                return;
                            }

                            var10004 = var3;
                            var10005 = 9 + var3 * 18;
                            ++var3;
                            Slot var6 = new Slot(var2, var10004, var10005, 112);
                            if (llIlllIIlIll(31249, 5266)) {
                                throw null;
                            }

                            this.addSlotToContainer(var6);
                            var10000 = var3;
                        }

                        throw null;
                    }

                    int var4;
                    for (var10000 = var4 = 0; !llIlllIIlIll(31249, 5266); var5 = true) {
                        if (!llIlllIIllll(var10000, 9)) {
                            if (llIlllIIlIll(31249, 5266)) {
                                throw null;
                            }

                            ++var3;
                            var10000 = var3;
                            continue label72;
                        }

                        Class159 var10001 = new Class159;
                        InventoryBasic var10003 = Class10. ();
                        if (llIlllIIlIll(31249, 5266)) {
                            throw null;
                        }

                        var10004 = var3 * 9 + var4;
                        var10005 = 9 + var4 * 18;
                        int var10007 = var3 * 18;
                        ++var4;
                        var10001.<init> (var10003, var10004, var10005, 18 + var10007);
                        if (llIlllIIlIll(31249, 5266)) {
                            throw null;
                        }

                        this.addSlotToContainer(var10001);
                        var10000 = var4;
                    }

                    throw null;
                }

                throw null;
            }
        }
    }

    private static boolean llIlllIllIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIlllIlIIlI(int var0) {
        return var0 < 0;
    }

    private static boolean llIlllIIlIll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlllIIllll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlllIlIllI(int var0) {
        return var0 == 0;
    }

    private static boolean llIlllIlIlll(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llIlllIIlIIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIlllIllIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIlllIlIlII(int var0) {
        return var0 >= 0;
    }

    public ItemStack transferStackInSlot(EntityPlayer var1, int var2) {
        Slot var3;
        if (llIlllIIlIll(var2, this.inventorySlots.size() - 9) && llIlllIIllll(var2, this.inventorySlots.size()) && llIlllIllIII(var3 = (Slot) this.inventorySlots.get(var2)) && llIlllIllIlI(var3.getHasStack())) {
            var3.putStack(ItemStack.EMPTY);
        }

        if (llIlllIIlIll(41139, 4300)) {
            throw null;
        } else {
            return ItemStack.EMPTY;
        }
    }

    public boolean canScroll() {
        if (llIlllIIlIIl(this..size(),45)){
            return true;
        } else if (llIlllIIlIll(70849, 4055)) {
            throw null;
        } else {
            return false;
        }
    }

    public boolean canInteractWith(EntityPlayer var1) {
        return true;
    }

    public void scrollTo(float var1) {
        int var2 = (this..size() + 9 - 1) /9 - 5;
        if (llIlllIlIIlI(var2 = (int) ((double) (var1 * (float) var2) + 0.5D))) {
            var2 = 0;
        }

        if (llIlllIIlIll(24842, 1798)) {
            throw null;
        } else {
            boolean var10001;
            int var3;
            label68:
            for (int var10000 = var3 = 0; !llIlllIIlIll(24842, 1798); var10001 = true) {
                boolean var7;
                if (!llIlllIIllll(var10000, 5)) {
                    if (llIlllIIlIll(24842, 1798)) {
                        throw null;
                    }

                    var7 = true;
                    return;
                }

                int var4;
                for (var10000 = var4 = 0; !llIlllIIlIll(24842, 1798); var10001 = true) {
                    if (!llIlllIIllll(var10000, 9)) {
                        if (llIlllIIlIll(24842, 1798)) {
                            throw null;
                        }

                        ++var3;
                        var10000 = var3;
                        continue label68;
                    }

                    int var5;
                    InventoryBasic var6;
                    if (llIlllIlIlII(var5 = var4 + (var3 + var2) * 9) && llIlllIIllll(var5, this..size())){
                        var6 = Class10. ();
                        if (llIlllIIlIll(24842, 1798)) {
                            throw null;
                        }

                        var6.setInventorySlotContents(var4 + var3 * 9, (ItemStack) this..get(var5));
                        var7 = true;
                    } else{
                        if (llIlllIIlIll(24842, 1798)) {
                            throw null;
                        }

                        var6 = Class10. ();
                        if (llIlllIIlIll(24842, 1798)) {
                            throw null;
                        }

                        var6.setInventorySlotContents(var4 + var3 * 9, ItemStack.EMPTY);
                    }

                    if (llIlllIIlIll(24842, 1798)) {
                        throw null;
                    }

                    ++var4;
                    var10000 = var4;
                }

                throw null;
            }

            throw null;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean canMergeSlot(ItemStack var1, Slot var2) {
        if (llIlllIIlIIl(var2.yPos, 90)) {
            return true;
        } else if (llIlllIIlIll(63717, 7423)) {
            throw null;
        } else {
            return false;
        }
    }

    public boolean canDragIntoSlot(Slot var1) {
        if (llIlllIlIllI(var1.inventory instanceof InventoryPlayer) && (!llIlllIIlIIl(var1.yPos, 90) || !llIlllIlIlll(var1.xPos, 162))) {
            if (llIlllIIlIll(39397, 5377)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIlllIIlIll(39397, 5377)) {
            throw null;
        } else {
            return true;
        }
    }
}
