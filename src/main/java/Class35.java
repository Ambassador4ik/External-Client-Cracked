import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockObsidian;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class35 extends Class171 {
    private static int 70419=-24453;
    private static int 5455=10428;
    private static int 97183=-9944;
    private static int 71247=-5432;
    private static int 56469=-21108;
    public Entity;
    public Class220;
    public int;
    public Class220;
    private static int 1426=21522;
    public List;
    private static int 13925=-3820;
    private static int 61684=-27743;
    private static int 63047=-4991;
    private static int 74731=-4595;
    private static int 48148=-23860;
    private static int 7495=17770;
    public Class220;
    private static int 5400=13281;
    private static int 4266=16107;
    private static int 3444=11070;
    private static int 4518=20263;
    private static int 3031=1923;
    private static int 3182=19479;
    public Class28;
    private static int 5803=20412;
    private static int 55742=-21120;
    private static int 55954=-29016;
    public boolean;
    private static int 1256=2149;
    private static int 38636=-16237;
    private static int 8497=24549;

    static {
        boolean var10000 = true;
    }

    public Class35() {
        String var10010 = Class60. ("Wg7mc5gu<y^4mg:");
        if (llIllllIIlII(63047, 7495)) {
            throw null;
        } else {
            super(var10010, 41, Class188.);
            if (llIllllIIlII(63047, 7495)) {
                throw null;
            } else {
                Class28 var10009 = new Class28();
                if (llIllllIIlII(63047, 7495)) {
                    throw null;
                } else {
                    this. = var10009;
                    this. = true;
                    ArrayList var10006 = new ArrayList();
                    if (llIllllIIlII(63047, 7495)) {
                        throw null;
                    } else {
                        this. = var10006;
                        Class220 var10005 = new Class220;
                        String var10007 = Class60. ("Tx3c`1v~8r>");
                        if (llIllllIIlII(63047, 7495)) {
                            throw null;
                        } else {
                            var10005.<init> (var10007, 110, this, 4.0D, 3.0D, 5.0D, false);
                            if (llIllllIIlII(63047, 7495)) {
                                throw null;
                            } else {
                                this. = var10005;
                                Class220 var10004 = new Class220;
                                String var2 = Class60. ("[{p~\"");
                                if (llIllllIIlII(63047, 7495)) {
                                    throw null;
                                } else {
                                    var10004.<init> (var2, 111, this, 120.0D, 0.0D, 1000.0D, 5.0D, true);
                                    if (llIllllIIlII(63047, 7495)) {
                                        throw null;
                                    } else {
                                        this. = var10004;
                                        Class220 var10003 = new Class220;
                                        String var1 = Class60. ("Ys|yu\u0002");
                                        if (llIllllIIlII(63047, 7495)) {
                                            throw null;
                                        } else {
                                            var10003.<init> (var1, 121, this, true);
                                            if (llIllllIIlII(63047, 7495)) {
                                                throw null;
                                            } else {
                                                this. = var10003;
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

    private static boolean llIllllIllIl(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIllllIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlllllIlll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIllllIllll(int var0) {
        return var0 != 0;
    }

    private static boolean llIlllllIIlI(int var0) {
        return var0 == 0;
    }

    private static boolean llIlllllIIll(int var0) {
        return var0 >= 0;
    }

    private static boolean llIlllllIIIl(int var0) {
        return var0 < 0;
    }

    private static boolean llIlllllIllI(int var0) {
        return var0 <= 0;
    }

    private static boolean llIlllllIIII(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIllllllIII(int var0) {
        return var0 > 0;
    }

    private static boolean llIllllIlllI(Object var0) {
        return var0 != null;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public int __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        int var1;
        boolean var10001;
        for (int var10000 = var1 = 36; !llIllllIIlII(70419, 5455); var10001 = true) {
            if (!llIllllIllIl(var10000, 45)) {
                if (llIllllIIlII(70419, 5455)) {
                    throw null;
                }

                return this.                                                                                                    .
                field_71439_g.field_71071_by.field_70461_c;
            }

            ItemStack var2;
            if (llIllllIlllI(var2 = this..field_71439_g.field_71069_bz.func_75139_a(var1).func_75211_c()) &&
            llIllllIllll(var2.func_77973_b() instanceof ItemEndCrystal)){
                return var1 - 36;
            }

            if (llIllllIIlII(70419, 5455)) {
                throw null;
            }

            ++var1;
            var10000 = var1;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        boolean var10000;
        int var2;
        if (llIllllllIII(var2 = this. ()) &&!llIllllIllll(this..field_71439_g.func_184812_l_())){
            if (llIllllIIlII(71247, 3182)) {
                throw null;
            } else {
                ScaledResolution var6 = var1.getResolution();
                int var5 = var6.func_78326_a() / 2 - 90 - 18;
                int var3 = var6.func_78328_b() - 18 - 21;
                ItemStack var7 = new ItemStack(Items.field_185158_cP);
                if (llIllllIIlII(71247, 3182)) {
                    throw null;
                } else {
                    ItemStack var4 = var7;
                    var4.func_190920_e(var2);
                    this.                                                                                           .
                    (var4, var5, var3, -100.0F);
                    var10000 = true;
                }
            }
        } else if (llIllllIIlII(71247, 3182)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        boolean var10000 = super. (var1, var2);
        if (llIllllIIlII(55742, 5400)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        ArrayList var10000 = new ArrayList();
        if (llIllllIIlII(13925, 3444)) {
            throw null;
        } else {
            ArrayList var1 = var10000;
            int var2;
            int var3 = var2 = this.                                                                                                  .
            ();

            boolean var10001;
            label78:
            for (int var8 = var3; !llIllllIIlII(13925, 3444); var10001 = true) {
                if (!llIllllIIlII(var8, -var2)) {
                    if (llIllllIIlII(13925, 3444)) {
                        throw null;
                    }

                    return var1;
                }

                int var4;
                var8 = var4 = var2;

                label75:
                while (!llIllllIIlII(13925, 3444)) {
                    if (!llIllllIIlII(var8, -var2)) {
                        if (llIllllIIlII(13925, 3444)) {
                            throw null;
                        }

                        --var3;
                        var8 = var3;
                        continue label78;
                    }

                    int var5;
                    for (var8 = var5 = var2; !llIllllIIlII(13925, 3444); var10001 = true) {
                        if (!llIllllIIlII(var8, -var2)) {
                            if (llIllllIIlII(13925, 3444)) {
                                throw null;
                            }

                            --var4;
                            var8 = var4;
                            var10001 = true;
                            continue label75;
                        }

                        BlockPos var9 = new BlockPos(this..field_71439_g.field_70165_t + (double) var3, this.                                                                                                    .
                        field_71439_g.field_70163_u + (double) var4, this.                                                                                                    .
                        field_71439_g.field_70161_v + (double) var5);
                        if (llIllllIIlII(13925, 3444)) {
                            throw null;
                        }

                        BlockPos var6 = var9;
                        Block var7;
                        if (!llIlllllIIlI((var7 = this..field_71441_e.func_180495_p(var6).func_177230_c()) instanceof BlockObsidian) ||
                        llIlllllIIII(var7, Blocks.field_150357_h)){
                            if (llIllllIIlII(13925, 3444)) {
                                throw null;
                            }

                            if (llIllllIllll(this..field_71441_e.func_180495_p(var6.func_177984_a()).func_177230_c() instanceof BlockAir))
                            {
                                var1.add(var6);
                            }
                        }

                        if (llIllllIIlII(13925, 3444)) {
                            throw null;
                        }

                        --var5;
                        var8 = var5;
                    }

                    throw null;
                }

                throw null;
            }

            throw null;
        }
    }

    public List ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        ArrayList var10000 = new ArrayList();
        if (llIllllIIlII(56469, 3031)) {
            throw null;
        } else {
            ArrayList var2 = var10000;
            Iterator var3 = this.                                                                                                    .
            field_71441_e.field_73010_i.iterator();

            while (!llIllllIIlII(56469, 3031)) {
                if (!llIllllIllll(var3.hasNext())) {
                    if (llIllllIIlII(56469, 3031)) {
                        throw null;
                    }

                    return var2;
                }

                EntityPlayer var4;
                double var6;
                double var7;
                long var8;
                if (llIllllIlllI(var4 = (EntityPlayer) var3.next()) && llIllllIllll(var4.func_70089_S()) && llIlllllIlll(var4, this..field_71439_g) &&
                llIlllllIIIl((var6 = var1.func_185332_f((int) var4.field_70165_t, (int) var4.field_70163_u, (int) var4.field_70161_v) - 3.1D) == 0.0D ? 0 : (var6 < 0.0D ? -1 : 1)) && llIlllllIIll((var7 = var4.field_70163_u - 0.9D - (double) var1.func_177956_o()) == 0.0D ? 0 : (var7 < 0.0D ? -1 : 1)) && llIllllIllll((var8 = var4.func_180425_c().func_177977_b().func_177986_g() - var1.func_177986_g()) == 0L ? 0 : (var8 < 0L ? -1 : 1)) && llIlllllIIlI(Class73..                                                                                                    .
                (var4.func_70005_c_()))){
                    var2.add(var4);
                    boolean var5 = true;
                }
            }

            throw null;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        Iterator var3 = this.                                                                                                    .
        field_71441_e.field_72996_f.iterator();

        while (!llIllllIIlII(61684, 4518)) {
            boolean var10000;
            if (!llIllllIllll(var3.hasNext())) {
                if (llIllllIIlII(61684, 4518)) {
                    throw null;
                }

                if (llIlllllIIlI(this..isEmpty())){
                    var3 = this.                                                                                           .
                    iterator();

                    while (true) {
                        if (llIllllIIlII(61684, 4518)) {
                            throw null;
                        }

                        if (!llIllllIllll(var3.hasNext())) {
                            break;
                        }

                        BlockPos var4;
                        double var5;
                        if (llIllllIlllI(var4 = (BlockPos) var3.next()) && llIlllllIIll((var5 = (double) var4.func_177956_o() - this..field_71439_g.field_70163_u) == 0.0D ? 0 : (var5 < 0.0D ? -1 : 1)) &&
                        llIlllllIIll(this. ()) &&llIlllllIIlI(this. (var4).isEmpty())){
                            Class181. (var4, Color.GREEN);
                            if (llIllllIIlII(61684, 4518)) {
                                throw null;
                            }

                            var10000 = true;
                            return;
                        }
                    }
                }

                if (llIllllIIlII(61684, 4518)) {
                    throw null;
                }

                var10000 = true;
                return;
            }

            Entity var2;
            double var6;
            if (llIllllIllll((var2 = (Entity) var3.next()) instanceof EntityEnderCrystal) && llIlllllIIIl((var6 = (double) this..field_71439_g.func_70032_d(var2) - this..
            ()) ==0.0D ? 0 : (var6 < 0.0D ? -1 : 1)) &&llIlllllIIlI(this. ((EntityEnderCrystal) var2).isEmpty())){
                Class181. (var2.func_180425_c(), Color.RED);
                if (llIllllIIlII(61684, 4518)) {
                    throw null;
                }

                var10000 = true;
            }
        }

        throw null;
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        int var1 = 0;

        boolean var10001;
        int var2;
        for (int var10000 = var2 = 0; !llIllllIIlII(55954, 1426); var10001 = true) {
            if (!llIllllIllIl(var10000, this..field_71439_g.field_71071_by.func_70302_i_())){
                if (llIllllIIlII(55954, 1426)) {
                    throw null;
                }

                return var1;
            }

            ItemStack var3;
            if (llIlllllIIII((var3 = this..field_71439_g.field_71071_by.func_70301_a(var2)).func_77973_b(),
            Items.field_185158_cP)){
                var1 += var3.func_190916_E();
            }

            if (llIllllIIlII(55954, 1426)) {
                throw null;
            }

            ++var2;
            var10000 = var2;
        }

        throw null;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        boolean var10000;
        if (llIlllllIIlI(this. ()) &&!llIllllIllll(this..field_71439_g.func_70026_G())){
            if (llIllllIIlII(74731, 5803)) {
                throw null;
            } else {
                EntityPlayerSP var10006 = this.                                                                                                    .
                field_71439_g;
                var10006.field_70177_z += 0.001F;
                this. = this. ();
                List var10003 = this.;
                Class185 var10004 = new Class185(this);
                if (llIllllIIlII(74731, 5803)) {
                    throw null;
                } else {
                    Collections.sort(var10003, var10004);
                    if (llIllllIIlII(74731, 5803)) {
                        throw null;
                    } else {
                        this. = this.                                                                                                    .
                        field_71439_g.field_71071_by.field_70461_c;
                        Iterator var4;
                        if (llIlllllIIlI(this..isEmpty())){
                            var4 = this.                                                                                           .
                            iterator();

                            while (true) {
                                if (llIllllIIlII(74731, 5803)) {
                                    throw null;
                                }

                                if (!llIllllIllll(var4.hasNext())) {
                                    break;
                                }

                                BlockPos var2;
                                double var12;
                                if (llIllllIlllI(var2 = (BlockPos) var4.next()) && llIlllllIIll((var12 = (double) var2.func_177956_o() - this..field_71439_g.field_70163_u) == 0.0D ? 0 : (var12 < 0.0D ? -1 : 1)) &&
                                llIlllllIIlI(this. (var2).isEmpty()) &&llIllllIllll(this.. (this.. () + 10L))){
                                    this.                                                                                                    .
                                    field_71439_g.field_71071_by.field_70461_c = this. ();
                                    if (llIlllllIIII(this..field_71439_g.field_71071_by.func_70448_g().func_77973_b(),
                                    Items.field_185158_cP)){
                                        PlayerControllerMP var6 = this.                                                                                                    .
                                        field_71442_b;
                                        EntityPlayerSP var10001 = this.                                                                                                    .
                                        field_71439_g;
                                        WorldClient var10002 = this.                                                                                                    .
                                        field_71441_e;
                                        EnumFacing var11 = this.                                                                                                    .
                                        field_71439_g.func_174811_aO();
                                        Vec3d var10005 = new Vec3d(var2);
                                        if (llIllllIIlII(74731, 5803)) {
                                            throw null;
                                        }

                                        var6.func_187099_a(var10001, var10002, var2, var11, var10005, EnumHand.MAIN_HAND);
                                        this.                                                                                                    .
                                        field_71439_g.field_71071_by.field_70461_c = this.;
                                        this.                                                                                         .
                                        ();
                                        this.                                                                                     .
                                        ();
                                        var10000 = true;
                                    }
                                }
                            }
                        }

                        if (llIllllIIlII(74731, 5803)) {
                            throw null;
                        } else {
                            var4 = this.                                                                                                    .
                            field_71441_e.field_72996_f.iterator();

                            label88:
                            while (!llIllllIIlII(74731, 5803)) {
                                boolean var8;
                                for (Iterator var7 = var4; !llIllllIIlII(74731, 5803); var8 = true) {
                                    if (!llIllllIllll(var7.hasNext())) {
                                        if (llIllllIIlII(74731, 5803)) {
                                            throw null;
                                        }

                                        var10000 = true;
                                        return;
                                    }

                                    Entity var5;
                                    if (!llIllllIllll((var5 = (Entity) var4.next()) instanceof EntityEnderCrystal)) {
                                        continue label88;
                                    }

                                    EntityEnderCrystal var3 = (EntityEnderCrystal) var5;
                                    double var13;
                                    if (!llIlllllIllI((var13 = (double) this..field_71439_g.func_70032_d(var3) - this..
                                    ()) ==0.0D ? 0 : (var13 < 0.0D ? -1 : 1))){
                                        continue label88;
                                    }

                                    if (!llIlllllIllI(this. (var3).size())){
                                        if (llIllllIIlII(74731, 5803)) {
                                            throw null;
                                        }

                                        double var14;
                                        if (llIlllllIIll((var14 = var3.field_70163_u - 0.9D - this..field_71439_g.field_70163_u) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1)) &&
                                        llIllllIllll(this.. (this.. ()))){
                                            this. = var5;
                                            this.                                                                                                    .
                                            field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                                            NetHandlerPlayClient var9 = this.                                                                                                    .
                                            field_71439_g.field_71174_a;
                                            CPacketUseEntity var10 = new CPacketUseEntity(var5);
                                            if (llIllllIIlII(74731, 5803)) {
                                                throw null;
                                            }

                                            var9.func_147297_a(var10);
                                            this.                                                                                                    .
                                            field_71439_g.func_184821_cY();
                                            this.                                                                                     .
                                            ();
                                            var10000 = true;
                                        }
                                        continue label88;
                                    }

                                    var7 = var4;
                                }

                                throw null;
                            }

                            throw null;
                        }
                    }
                }
            }
        } else if (llIllllIIlII(74731, 5803)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public List ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityEnderCrystal var1) {
        ArrayList var10000 = new ArrayList();
        if (llIllllIIlII(48148, 4266)) {
            throw null;
        } else {
            ArrayList var2 = var10000;
            Iterator var3 = this.                                                                                                    .
            field_71441_e.field_73010_i.iterator();

            while (!llIllllIIlII(48148, 4266)) {
                if (!llIllllIllll(var3.hasNext())) {
                    if (llIllllIIlII(48148, 4266)) {
                        throw null;
                    }

                    return var2;
                }

                EntityPlayer var4;
                double var6;
                double var7;
                if (llIllllIlllI(var4 = (EntityPlayer) var3.next()) && llIllllIllll(var4.func_70089_S()) && llIlllllIlll(var4, this..field_71439_g) &&
                llIlllllIIll((var6 = var4.field_70163_u - var1.field_70163_u) == 0.0D ? 0 : (var6 < 0.0D ? -1 : 1)) && llIlllllIllI((var7 = (double) var1.func_70032_d(var4) - this..
                ()) ==0.0D ? 0 : (var7 < 0.0D ? -1 : 1)) &&llIlllllIIlI(Class73..                                                                                                    .
                (var4.func_70005_c_()))){
                    var2.add(var4);
                    boolean var5 = true;
                }
            }

            throw null;
        }
    }
}
