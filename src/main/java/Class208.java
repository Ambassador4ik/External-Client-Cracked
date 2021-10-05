import net.minecraft.item.ItemAir;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class208 extends Class171 {
    public CPacketClickWindow;
    private static int 40278=-19837;
    private static int 91107=-10322;
    private static int 39166=-11984;
    private static int 854=32116;
    private static int 1245=9314;
    private static int 27389=-17786;
    private static int 9511=21493;
    private static int 16267=-16134;
    private static int 648=17023;
    private static int 54415=-29279;
    public Class220;
    public World;
    private static int 8004=24050;
    private static int 4369=10061;

    static {
        boolean var10000 = true;
    }

    public Class208() {
        String var10004 = Class60. ("Qd3d{[7\u007fq15");
        if (llIllIIllIII(16267, 9511)) {
            throw null;
        } else {
            super(var10004, 73, Class188.);
            if (llIllIIllIII(16267, 9511)) {
                throw null;
            } else {
                Class220 var10003 = new Class220;
                String var10005 = Class60. ("^~9v\u007f\"");
                if (llIllIIllIII(16267, 9511)) {
                    throw null;
                } else {
                    var10003.<init> (var10005, 176, this, 10.0D, 0.0D, 100.0D, true);
                    if (llIllIIllIII(16267, 9511)) {
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

    private static boolean llIllIlIIIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIllIIllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllIIlllII(int var0) {
        return var0 != 0;
    }

    private static boolean llIllIIlllIl(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIllIIllllI(int var0) {
        return var0 == 0;
    }

    private static boolean llIllIIlllll(Object var0) {
        return var0 == null;
    }

    private static boolean llIllIIllIll(Object var0, Object var1) {
        return var0 == var1;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        this. = null;
        boolean var10000 = true;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (llIllIlIIIII(this.) && llIllIIlllII(this.. (10))){
            this.                                                                                         .();
            this.                                                                                                    .
            field_71439_g.field_71174_a.func_147297_a(this.);
        }

        if (llIllIIllIII(39166, 1245)) {
            throw null;
        } else {
            if (llIllIlIIIII(this.) && llIllIIlllIl(this..field_71441_e,this.                                                                                                   ))
            {
                this. (false);
            }

            if (llIllIIllIII(39166, 1245)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIllIIllIll(var2, Class170.) && llIllIIlllII(var1 instanceof CPacketClickWindow) && llIllIIlllIl(var1, this.) && llIllIIllllI(((CPacketClickWindow) var1).func_149546_g().func_77973_b() instanceof ItemAir)) {
            this. = (CPacketClickWindow) var1;
            if (llIllIIlllll(this.)) {
                this. = this.                                                                                                    .
                field_71441_e;
            }
        }

        if (llIllIIllIII(91107, 8004)) {
            throw null;
        } else {
            boolean var10000 = super. (var1, var2);
            if (llIllIIllIII(91107, 8004)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }
}
