import net.minecraft.item.ItemEnderPearl;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.MouseEvent;
import org.lwjgl.input.Mouse;

public class Class211 extends Class171 {
    private static int 55285=-25971;
    private static int 7615=23308;
    private static int 59042=-29238;
    private static int 636=17198;
    private static int 84800=-13963;
    private static int 2457=11168;
    private static int 2977=21848;
    private static int 84230=-5320;

    static {
        boolean var10000 = true;
    }

    public Class211() {
        String var10001 = Class60. ("Vs|\u007f?vyX3vyx7qD~+{z7");
        if (lllIIIlIlIII(84800, 2977)) {
            throw null;
        } else {
            super(var10001, 36, Class188.);
            if (lllIIIlIlIII(84800, 2977)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllIIIlIlIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIIlIlIIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIIIlIlIlI(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIIlIlIll(int var0, int var1) {
        return var0 < var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(MouseEvent var1) {
        boolean var5;
        if (lllIIIlIlIIl(var1.getButton(), 2)) {
            byte var10000 = Mouse.getEventButtonState();
            if (lllIIIlIlIII(59042, 2457)) {
                throw null;
            }

            if (lllIIIlIlIlI(var10000)) {
                int var3;
                int var4 = var3 = 0;

                while (true) {
                    if (lllIIIlIlIII(59042, 2457)) {
                        throw null;
                    }

                    if (!lllIIIlIlIll(var4, 9)) {
                        break;
                    }

                    if (lllIIIlIlIlI(this..player.inventory.getStackInSlot(var3).getItem() instanceof ItemEnderPearl))
                    {
                        int var2 = this.                                                                                                    .
                        player.inventory.currentItem;
                        CPacketHeldItemChange var10003 = new CPacketHeldItemChange(var3);
                        if (lllIIIlIlIII(59042, 2457)) {
                            throw null;
                        }

                        this. (var10003);
                        CPacketPlayerTryUseItem var10002 = new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
                        if (lllIIIlIlIII(59042, 2457)) {
                            throw null;
                        }

                        this. (var10002);
                        CPacketHeldItemChange var6 = new CPacketHeldItemChange(var2);
                        if (lllIIIlIlIII(59042, 2457)) {
                            throw null;
                        }

                        this. (var6);
                        var5 = true;
                        return;
                    }

                    if (lllIIIlIlIII(59042, 2457)) {
                        throw null;
                    }

                    ++var3;
                    var4 = var3;
                    boolean var10001 = true;
                }
            }
        }

        if (lllIIIlIlIII(59042, 2457)) {
            throw null;
        } else {
            var5 = true;
        }
    }
}
