import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemAppleGold;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class40 extends Class171 {
    private static int 6997=6683;
    private static int 69885=-24910;
    private static int 30101=-30763;
    private static int 27423=-14122;
    private static int 2354=26761;
    private static int 22472=-24757;
    private static int 8161=30048;
    private static int 847=859;
    public boolean;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class40() {
        String var10006 = Class60. ("Vc4c|6Wvo6l{>");
        if (lllIIIlllllI(27423, 2354)) {
            throw null;
        } else {
            super(var10006, 119, Class188.);
            if (lllIIIlllllI(27423, 2354)) {
                throw null;
            } else {
                this. = false;
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("S\u007f8zs:h3");
                if (lllIIIlllllI(27423, 2354)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, this, 16.0D, 1.0D, 20.0D, true);
                    if (lllIIIlllllI(27423, 2354)) {
                        throw null;
                    } else {
                        this. = var10003;
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean lllIIlIIIlIl(int var0) {
        return var0 <= 0;
    }

    private static boolean lllIIlIIlIIl(Object var0) {
        return var0 == null;
    }

    private static boolean lllIIlIIIIIl(int var0) {
        return var0 > 0;
    }

    private static boolean lllIIlIIIIll(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIIlllllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlIIIlll(Object var0) {
        return var0 != null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        StringBuilder var10002 = new StringBuilder();
        if (lllIIIlllllI(30101, 6997)) {
            throw null;
        } else {
            this. (String.valueOf(var10002.append(this.. ()).append("")));
            boolean var10000;
            double var2;
            if (lllIIlIIIIIl((var2 = (double) (this..field_71439_g.func_110143_aJ() + this..field_71439_g.func_110139_bj()) - this.                                                                                            .
            ()) ==0.0D ? 0 : (var2 < 0.0D ? -1 : 1)) &&lllIIlIIIIll(this.)){
                this. = false;
                KeyBinding.func_74510_a(this..field_71474_y.field_74313_G.func_151463_i(), false);
                if (lllIIIlllllI(30101, 6997)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            } else if (lllIIIlllllI(30101, 6997)) {
                throw null;
            } else {
                double var3;
                if (lllIIlIIIIll(this..field_71439_g.func_184592_cb().func_77973_b() instanceof ItemAppleGold) &&
                lllIIlIIIlIl((var3 = (double) this..field_71439_g.func_110143_aJ() - this.. ()) ==
                0.0D ? 0 : (var3 < 0.0D ? -1 : 1)) &&
                (!lllIIlIIIlll(this..field_71476_x) || lllIIlIIlIIl(this..field_71476_x.field_72308_g))){
                    if (lllIIIlllllI(30101, 6997)) {
                        throw null;
                    }

                    KeyBinding.func_74510_a(this..field_71474_y.field_74313_G.func_151463_i(), true);
                    if (lllIIIlllllI(30101, 6997)) {
                        throw null;
                    }

                    this. = true;
                }

                if (lllIIIlllllI(30101, 6997)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
