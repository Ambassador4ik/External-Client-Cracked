import java.util.stream.IntStream;

import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class105 extends Class171 {
    private static int 1102=5750;
    private static int 71172=-17447;
    public Class220;
    private static int 4534=24962;
    private static int 1274=17479;
    private static int 54498=-23015;
    private static int 6069=2514;
    private static int 3015=4828;
    private static int 25835=-15168;
    private static int 6626=20175;
    public Class220;
    private static int 6986=23066;
    private static int 80343=-6851;
    private static int 55016=-25474;
    private static int 1758=19377;
    private static int 3511=22747;
    private static int 27409=-6768;
    private static int 66975=-2386;
    public Class220;
    private static int 8509=-9744;
    private static int 3691=25176;
    public Class220;
    private static int 4344=14858;
    private static int 8059=-12433;
    private static int 50924=-10620;
    private static int 2036=2673;
    private static int 30122=-4807;
    private static int 95219=-4770;

    static {
        boolean var10000 = true;
    }

    public Class105() {
        String var10006 = Class60. ("Vc4c|6Dx?by76");
        if (lllllIllIIlI(71172, 4344)) {
            throw null;
        } else {
            super(var10006, 3, Class188.);
            if (lllllIllIIlI(71172, 4344)) {
                throw null;
            } else {
                Class220 var2 = new Class220;
                String var10008 = Class60. ("Xx?py=\"");
                if (lllllIllIIlI(71172, 4344)) {
                    throw null;
                } else {
                    var2.<init> (var10008, 12, this, 0.0D, 0.0D, 1000.0D, 10.0D, true);
                    if (lllllIllIIlI(71172, 4344)) {
                        throw null;
                    } else {
                        this. = var2;
                        Class220 var10005 = new Class220;
                        String var10007 = Class60. ("P}e3yf4v)");
                        if (lllllIllIIlI(71172, 4344)) {
                            throw null;
                        } else {
                            var10005.<init> (var10007, 13, this, true);
                            if (lllllIllIIlI(71172, 4344)) {
                                throw null;
                            } else {
                                this. = var10005;
                                Class220 var10004 = new Class220;
                                var10006 = Class60. ("\\p7u|a3|L5su8f>");
                                if (lllllIllIIlI(71172, 4344)) {
                                    throw null;
                                } else {
                                    var10004.<init> (var10006, 14, this, 20.0D, 1.0D, 20.0D, true);
                                    if (lllllIllIIlI(71172, 4344)) {
                                        throw null;
                                    } else {
                                        this. = var10004;
                                        Class220 var10003 = new Class220;
                                        String var1 = Class60. ("Xha;ln}7");
                                        if (lllllIllIIlI(71172, 4344)) {
                                            throw null;
                                        } else {
                                            var10003.<init> (var1, 175, this, true);
                                            if (lllllIllIIlI(71172, 4344)) {
                                                throw null;
                                            } else {
                                                this. = var10003;
                                                this. ((Class220[]) (new Class220[]{this.}));
                                                this. ((Class220[]) (new Class220[]{this.}));
                                                this. ((Class220[]) (new Class220[]{this.}));
                                                this. ((Class220[]) (new Class220[]{this.}));
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

    private static boolean lllllIllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllllIllIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIlllIlI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllllIllIIIl(int var0) {
        return var0 > 0;
    }

    private static boolean lllllIllIlll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllllIllIlIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static double ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0) {
        return 1.0D;
    }

    private static boolean lllllIlllIIl(int var0) {
        return var0 < 0;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        return 1;
    }

    private static boolean lllllIllIlII(int var0) {
        return var0 != 0;
    }

    private static boolean lllllIlllIII(int var0, int var1) {
        return var0 != var1;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        double var4;
        if (lllllIllIIIl(this. ()) &&(!lllllIllIIIl((var4 = (double) this..player.getHealth() - this.. ()) ==
        0.0D ? 0 : (var4 < 0.0D ? -1 : 1)) ||lllllIllIlII(this. ()))){
            if (lllllIllIIlI(8059, 2036)) {
                throw null;
            }

            Item var3 = this.                                                                                                    .
            player.getHeldItemOffhand().getItem();
            int var2 = this. ();
            if (lllllIllIlIl(var3, Items.TOTEM_OF_UNDYING)) {
                this.                                                                                         .();
            }

            if (lllllIllIIlI(8059, 2036)) {
                throw null;
            }

            if (lllllIllIlll(var3, Items.TOTEM_OF_UNDYING) && lllllIlllIII(var2, -1) && lllllIllIlII(this.. (this.. ())))
            {
                this.                                                                                                    .
                playerController.windowClick(0, var2, 1, ClickType.PICKUP, this..player);
                this.                                                                                                    .
                playerController.windowClick(0, 45, 1, ClickType.PICKUP, this..player);
                this.                                                                                                    .
                playerController.windowClick(0, var2, 0, ClickType.PICKUP, this..player);
            }
        }

        if (lllllIllIIlI(8059, 2036)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public int __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        int var1;
        boolean var10001;
        for (int var10000 = var1 = 36; !lllllIllIIlI(55016, 6986); var10001 = true) {
            if (!lllllIlllIlI(var10000, 44)) {
                if (lllllIllIIlI(55016, 6986)) {
                    throw null;
                }

                for (var10000 = var1 = 0; !lllllIllIIlI(55016, 6986); var10001 = true) {
                    if (!lllllIlllIlI(var10000, 35)) {
                        if (lllllIllIIlI(55016, 6986)) {
                            throw null;
                        }

                        return -1;
                    }

                    if (lllllIllIlIl(this..player.inventoryContainer.getSlot(var1).getStack().getItem(),
                    Items.TOTEM_OF_UNDYING)){
                        return var1;
                    }

                    if (lllllIllIIlI(55016, 6986)) {
                        throw null;
                    }

                    ++var1;
                    var10000 = var1;
                }

                throw null;
            }

            if (lllllIllIlIl(this..player.inventoryContainer.getSlot(var1).getStack().getItem(),
            Items.TOTEM_OF_UNDYING)){
                return var1;
            }

            if (lllllIllIIlI(55016, 6986)) {
                throw null;
            }

            ++var1;
            var10000 = var1;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        boolean var10000;
        if (lllllIllIlII(this.. ()) &&!lllllIllIlII(this..player.isCreative())){
            if (lllllIllIIlI(50924, 6069)) {
                throw null;
            } else {
                int var2;
                if (lllllIllllIl(var2 = this. ())){
                    var10000 = true;
                } else if (lllllIllIIlI(50924, 6069)) {
                    throw null;
                } else {
                    ScaledResolution var6 = var1.getResolution();
                    int var5 = var6.getScaledWidth() / 2 + 90;
                    int var3 = var6.getScaledHeight() - 18 - 21;
                    ItemStack var7 = new ItemStack(Items.TOTEM_OF_UNDYING);
                    if (lllllIllIIlI(50924, 6069)) {
                        throw null;
                    } else {
                        ItemStack var4 = var7;
                        var4.setCount(var2);
                        this.                                                                                           .
                        (var4, var5, var3, -100.0F);
                        var10000 = true;
                    }
                }
            }
        } else if (lllllIllIIlI(50924, 6069)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public boolean __________________________________________________________________________________/* $FF was:                                                                                   */() {
        if (lllllIllIIIl(this..world.getLoadedEntityList().stream().filter(this::).mapToInt(Class105::).sum())){
            return true;
        } else if (lllllIllIIlI(54498, 1758)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        if (lllllIllIlIl(this..player.inventory.getStackInSlot(var1).getItem(),Items.TOTEM_OF_UNDYING)){
            return true;
        } else if (lllllIllIIlI(27409, 3015)) {
            throw null;
        } else {
            return false;
        }
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        float var2;
        if (lllllIllIlII(var1 instanceof EntityEnderCrystal) && lllllIlllIIl((var2 = this..player.getDistance(var1) - 5.0F) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1)))
        {
            return true;
        } else if (lllllIllIIlI(8509, 6626)) {
            throw null;
        } else {
            return false;
        }
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        IntStream var10000 = IntStream.range(0, this..player.inventory.getSizeInventory());
        if (lllllIllIIlI(95219, 3691)) {
            throw null;
        } else {
            return (int) var10000.filter(this::).mapToDouble(Class105::).sum();
        }
    }
}
