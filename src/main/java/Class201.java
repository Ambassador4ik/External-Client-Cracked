import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBeetroot;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockChorusFlower;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class Class201 extends Class171 {
    private static int 6406=11353;
    private static int 99182=-27399;
    private static int 9576=3570;
    private static int 35147=-2628;
    private static int 13078=-4137;
    private static int 19518=-27258;
    private static int 1219=16500;
    private static int 3495=31245;
    public Class28;
    private static int 73565=-11322;
    private static int 74811=-11945;
    public Class220;
    public Class220;
    private static int 57078=-32552;
    private static int 4870=10246;
    private static int 5253=30587;
    public Class28;
    private static int 54927=-28157;
    private static int 393=23088;
    public Class220;
    private static int 65035=-14234;
    private static int 6639=19463;
    private static int 3931=14560;
    public Class220;
    public Class220;
    public BlockPos;
    private static int 32668=-1438;
    private static int 5476=10935;

    static {
        boolean var10000 = true;
    }

    public Class201() {
        String var10009 = Class60. ("Qd3d{1Qq8c6");
        if (llIIllIIIlII(32668, 6639)) {
            throw null;
        } else {
            super(var10009, 116, Class188.);
            if (llIIllIIIlII(32668, 6639)) {
                throw null;
            } else {
                Class28 var5 = new Class28();
                if (llIIllIIIlII(32668, 6639)) {
                    throw null;
                } else {
                    this. = var5;
                    Class28 var10008 = new Class28();
                    if (llIIllIIIlII(32668, 6639)) {
                        throw null;
                    } else {
                        this. = var10008;
                        Class220 var10007 = new Class220;
                        var10009 = Class60. ("B~3du1cy8~5");
                        if (llIIllIIIlII(32668, 6639)) {
                            throw null;
                        } else {
                            var10007.<init> (var10009, this, true);
                            if (llIIllIIIlII(32668, 6639)) {
                                throw null;
                            } else {
                                this. = var10007;
                                Class220 var10006 = new Class220;
                                String var4 = Class60. ("N|?r\u007f=>");
                                if (llIIllIIIlII(32668, 6639)) {
                                    throw null;
                                } else {
                                    var10006.<init> (var4, this, 4.0D, 1.0D, 6.0D, true);
                                    if (llIIllIIIlII(32668, 6639)) {
                                        throw null;
                                    } else {
                                        this. = var10006;
                                        Class220 var10005 = new Class220;
                                        String var3 = Class60. ("Xi9\u007f\u007f;v^2~}:w\"");
                                        if (llIIllIIIlII(32668, 6639)) {
                                            throw null;
                                        } else {
                                            var10005.<init> (var3, this, 80.0D, 0.0D, 200.0D, true);
                                            if (llIIllIIIlII(32668, 6639)) {
                                                throw null;
                                            } else {
                                                this. = var10005;
                                                Class220 var10004 = new Class220;
                                                String var2 = Class60. ("Jw9{};x^w;}{6\"");
                                                if (llIIllIIIlII(32668, 6639)) {
                                                    throw null;
                                                } else {
                                                    var10004.<init> (var2, this, 80.0D, 0.0D, 200.0D, true);
                                                    if (llIIllIIIlII(32668, 6639)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10004;
                                                        Class220 var10003 = new Class220;
                                                        String var1 = Class60. ("K|?pt=(");
                                                        if (llIIllIIIlII(32668, 6639)) {
                                                            throw null;
                                                        } else {
                                                            var10003.<init> (var1, this, false);
                                                            if (llIIllIIIlII(32668, 6639)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10003;
                                                                this.
                                                                (new Class220[]{this., this., this., this., this.});
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
                }
            }
        }
    }

    private static boolean llIIllIIlIIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llIIllIIIlIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIIllIIIIll(Object var0) {
        return var0 != null;
    }

    private static boolean llIIllIIIlll(int var0) {
        return var0 == 0;
    }

    private static boolean llIIllIIlIII(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIIllIIIllI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIIllIIlIll(int var0, int var1) {
        return var0 != var1;
    }

    private static boolean llIIllIIIIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIIllIIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIllIIlIlI(int var0) {
        return var0 > 0;
    }

    private static boolean llIIllIIllII(int var0, int var1) {
        return var0 == var1;
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        this. = null;
        super. ();
        if (llIIllIIIlII(54927, 6406)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EnumHand var1, BlockPos var2, int var3) {
        if (llIIllIIIIlI(this.. (var3))){
            this. = var2;
            this.                                                                                                    .
            field_71442_b.func_180512_c(var2, EnumFacing.UP);
            this.                                                                                                    .
            field_71439_g.func_184609_a(var1);
            this.                                                                              .();
        }

        if (llIIllIIIlII(19518, 9576)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIIllIIIIlI(this.. ()) &&llIIllIIIIll(this.) && llIIllIIIIlI(var1 instanceof CPacketPlayer)){
            float[] var10001 = Class13. (this.);
            if (llIIllIIIlII(99182, 3931)) {
                throw null;
            }

            float[] var3 = var10001;
            Class22. (var1, var3[0]);
            if (llIIllIIIlII(99182, 3931)) {
                throw null;
            }

            Class22. (var1, var10001[1] - 5.0F);
            if (llIIllIIIlII(99182, 3931)) {
                throw null;
            }

            this.                                                                                                    .
            field_71439_g.field_70759_as = ((CPacketPlayer) var1).func_186999_a(0.0F);
        }

        if (llIIllIIIlII(99182, 3931)) {
            throw null;
        } else {
            boolean var10000 = super. (var1, var2);
            if (llIIllIIIlII(99182, 3931)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    public ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1, Class214 var2) {
        // $FF: Couldn't be decompiled
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        Block var2;
        if (llIIllIIIIlI((var2 = this..field_71441_e.func_180495_p(var1).func_177230_c()) instanceof BlockCrops)){
            BlockCrops var3;
            if (llIIllIIllII((var3 = (BlockCrops) var2).func_176201_c(this..field_71441_e.func_180495_p(var1)),
            var3.func_185526_g())){
                return true;
            }
        } else{
            if (llIIllIIIlII(57078, 3495)) {
                throw null;
            }

            if (llIIllIIIIlI(var2 instanceof BlockNetherWart)) {
                BlockNetherWart var4;
                if (llIIllIIllII((var4 = (BlockNetherWart) var2).func_176201_c(this..field_71441_e.func_180495_p(var1)),
                3)){
                    return true;
                }
            } else {
                if (llIIllIIIlII(57078, 3495)) {
                    throw null;
                }

                if (llIIllIIIIlI(var2 instanceof BlockReed)) {
                    if (llIIllIIIIlI(this..field_71441_e.func_180495_p(var1.func_177977_b()).func_177230_c() instanceof BlockReed))
                    {
                        return true;
                    }
                } else {
                    if (llIIllIIIlII(57078, 3495)) {
                        throw null;
                    }

                    if (llIIllIIIIlI(var2 instanceof BlockCactus)) {
                        if (llIIllIIIIlI(this..field_71441_e.func_180495_p(var1.func_177977_b()).func_177230_c() instanceof BlockCactus))
                        {
                            return true;
                        }
                    } else {
                        if (llIIllIIIlII(57078, 3495)) {
                            throw null;
                        }

                        if (llIIllIIIIlI(var2 instanceof BlockBeetroot)) {
                            BlockBeetroot var5;
                            if (llIIllIIllII((var5 = (BlockBeetroot) var2).func_176201_c(this..field_71441_e.func_180495_p(var1)),
                            var5.func_185526_g())){
                                return true;
                            }
                        } else {
                            if (llIIllIIIlII(57078, 3495)) {
                                throw null;
                            }

                            if (llIIllIIIIlI(var2 instanceof BlockPumpkin)) {
                                return true;
                            }

                            if (llIIllIIIlII(57078, 3495)) {
                                throw null;
                            }

                            if (llIIllIIIIlI(var2 instanceof BlockMelon)) {
                                return true;
                            }

                            if (llIIllIIIlII(57078, 3495)) {
                                throw null;
                            }

                            if (llIIllIIIIlI(var2 instanceof BlockChorusFlower)) {
                                BlockChorusFlower var6;
                                if (llIIllIIllII((var6 = (BlockChorusFlower) var2).func_176201_c(this..field_71441_e.func_180495_p(var1)),
                                5)){
                                    return true;
                                }
                            } else {
                                if (llIIllIIIlII(57078, 3495)) {
                                    throw null;
                                }

                                if (llIIllIIIIlI(var2 instanceof BlockCocoa)) {
                                }
                            }
                        }
                    }
                }
            }
        }

        if (llIIllIIIlII(57078, 3495)) {
            throw null;
        } else {
            return false;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(EnumHand var1, BlockPos var2, int var3) {
        if (llIIllIIIIlI(this.. (var3))){
            this. = var2;
            PlayerControllerMP var10000 = this.                                                                                                    .
            field_71442_b;
            EntityPlayerSP var10001 = this.                                                                                                    .
            field_71439_g;
            WorldClient var10002 = this.                                                                                                    .
            field_71441_e;
            EnumFacing var10004 = EnumFacing.UP;
            Vec3d var10005 = new Vec3d(var2);
            if (llIIllIIIlII(74811, 393)) {
                throw null;
            }

            var10000.func_187099_a(var10001, var10002, var2, var10004, var10005, var1);
            this.                                                                                                    .
            field_71439_g.func_184609_a(var1);
            this.                                                                                                   .();
        }

        if (llIIllIIIlII(74811, 393)) {
            throw null;
        } else {
            boolean var4 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        if (llIIllIIIIlI(this.. ()) &&llIIllIIIIll(this.)){
            EntityPlayerSP var10000 = this.                                                                                                    .
            field_71439_g;
            var10000.field_70177_z = (float) ((double) var10000.field_70177_z + 0.001D);
        }

        if (llIIllIIIlII(35147, 4870)) {
            throw null;
        } else {
            if (llIIllIIIlIl(var1.phase, Phase.END) && llIIllIIIIlI(this.. ()) &&llIIllIIIIlI(this.. (500))){
                this. = null;
                this.                                                                                         .();
            }

            if (llIIllIIIlII(35147, 4870)) {
                throw null;
            } else {
                int var8 = this.                                                                                                  .
                ();
                Item var2 = this.                                                                                                    .
                field_71439_g.field_71071_by.func_70448_g().func_77973_b();
                Item var3 = this.                                                                                                    .
                field_71439_g.func_184592_cb().func_77973_b();
                boolean var15;
                boolean var10001;
                if (llIIllIIIIlI(var2 instanceof ItemHoe)) {
                    ArrayList var4 = this. (var8, Class214.                                                                              )
                    ;
                    int var5;
                    int var14 = var5 = 0;

                    while (true) {
                        if (llIIllIIIlII(35147, 4870)) {
                            throw null;
                        }

                        if (!llIIllIIIllI(var14, var4.size())) {
                            break;
                        }

                        BlockPos var6 = (BlockPos) var4.get(var5);
                        if (llIIllIIIIlI(this..field_71441_e.func_180495_p(var6.func_177984_a()).func_177230_c() instanceof BlockTallGrass))
                        {
                            this. (EnumHand.MAIN_HAND, var6.func_177984_a(), this.                                                                                           .
                            ());
                            var15 = true;
                        } else{
                            if (llIIllIIIlII(35147, 4870)) {
                                throw null;
                            }

                            this. (EnumHand.MAIN_HAND, var6, this.                                                                                            .
                            ());
                        }

                        if (llIIllIIIlII(35147, 4870)) {
                            throw null;
                        }

                        ++var5;
                        var14 = var5;
                        var10001 = true;
                    }
                }

                if (llIIllIIIlII(35147, 4870)) {
                    throw null;
                } else {
                    byte var16;
                    if (llIIllIIIlll(var2 instanceof ItemSeeds) && llIIllIIlIII(var2, Items.field_151174_bG) && !llIIllIIIlIl(var2, Items.field_151172_bF)) {
                        if (llIIllIIIlII(35147, 4870)) {
                            throw null;
                        }

                        var16 = 0;
                    } else {
                        if (llIIllIIIlII(35147, 4870)) {
                            throw null;
                        }

                        var16 = 1;
                        var10001 = true;
                    }

                    if (llIIllIIIlII(35147, 4870)) {
                        throw null;
                    } else {
                        byte var9 = var16;
                        if (llIIllIIIlll(var3 instanceof ItemSeeds) && llIIllIIlIII(var3, Items.field_151174_bG) && !llIIllIIIlIl(var3, Items.field_151172_bF)) {
                            if (llIIllIIIlII(35147, 4870)) {
                                throw null;
                            }

                            var16 = 0;
                        } else {
                            if (llIIllIIIlII(35147, 4870)) {
                                throw null;
                            }

                            var16 = 1;
                            var10001 = true;
                        }

                        if (llIIllIIIlII(35147, 4870)) {
                            throw null;
                        } else {
                            byte var10 = var16;
                            if (llIIllIIIlll(var9) && !llIIllIIIIlI(var10)) {
                                if (llIIllIIIlII(35147, 4870)) {
                                    throw null;
                                }

                                var16 = 0;
                            } else {
                                if (llIIllIIIlII(35147, 4870)) {
                                    throw null;
                                }

                                var16 = 1;
                                var10001 = true;
                            }

                            if (llIIllIIIlII(35147, 4870)) {
                                throw null;
                            } else {
                                byte var12 = var16;
                                BlockPos var7;
                                ArrayList var11;
                                Iterator var13;
                                EnumHand var17;
                                Iterator var18;
                                BlockPos var10002;
                                boolean var10003;
                                if (llIIllIIIIlI(var12) && llIIllIIlIII(var2, Items.field_151075_bm) && llIIllIIlIII(var3, Items.field_151075_bm)) {
                                    var18 = var13 = (var11 = this. (var8, Class214.                                                                                                   )).
                                    iterator();

                                    while (true) {
                                        if (llIIllIIIlII(35147, 4870)) {
                                            throw null;
                                        }

                                        if (!llIIllIIIIlI(var18.hasNext())) {
                                            if (llIIllIIIlII(35147, 4870)) {
                                                throw null;
                                            }

                                            if (llIIllIIlIIl(var11.size(), 1)) {
                                                var15 = true;
                                                return;
                                            }
                                            break;
                                        }

                                        var7 = (BlockPos) var13.next();
                                        if (llIIllIIIIlI(var9)) {
                                            var17 = EnumHand.MAIN_HAND;
                                            var10002 = var7;
                                            var10003 = true;
                                        } else {
                                            if (llIIllIIIlII(35147, 4870)) {
                                                throw null;
                                            }

                                            var17 = EnumHand.OFF_HAND;
                                            var10002 = var7;
                                        }

                                        if (llIIllIIIlII(35147, 4870)) {
                                            throw null;
                                        }

                                        this. (var17, var10002, this.                                                                                            .
                                        ());
                                        var18 = var13;
                                        var10001 = true;
                                    }
                                }

                                if (llIIllIIIlII(35147, 4870)) {
                                    throw null;
                                } else {
                                    if (!llIIllIIlIII(var2, Items.field_151075_bm) || llIIllIIIlIl(var3, Items.field_151075_bm)) {
                                        if (llIIllIIIlII(35147, 4870)) {
                                            throw null;
                                        }

                                        var18 = var13 = (var11 = this. (var8, Class214.                                                                                            )).
                                        iterator();

                                        while (true) {
                                            if (llIIllIIIlII(35147, 4870)) {
                                                throw null;
                                            }

                                            if (!llIIllIIIIlI(var18.hasNext())) {
                                                if (llIIllIIIlII(35147, 4870)) {
                                                    throw null;
                                                }

                                                if (llIIllIIlIIl(var11.size(), 1)) {
                                                    var15 = true;
                                                    return;
                                                }
                                                break;
                                            }

                                            var7 = (BlockPos) var13.next();
                                            if (llIIllIIIlIl(var2, Items.field_151075_bm)) {
                                                var17 = EnumHand.MAIN_HAND;
                                                var10002 = var7;
                                                var10003 = true;
                                            } else {
                                                if (llIIllIIIlII(35147, 4870)) {
                                                    throw null;
                                                }

                                                var17 = EnumHand.OFF_HAND;
                                                var10002 = var7;
                                            }

                                            if (llIIllIIIlII(35147, 4870)) {
                                                throw null;
                                            }

                                            this. (var17, var10002, this.                                                                                            .
                                            ());
                                            var18 = var13;
                                            var10001 = true;
                                        }
                                    }

                                    if (llIIllIIIlII(35147, 4870)) {
                                        throw null;
                                    } else if (llIIllIIIlIl(var2, Items.field_151100_aR)) {
                                        for (var18 = var13 = this. (var8,Class214.                                                                                  ).
                                        iterator();
                                        !llIIllIIIlII(35147, 4870);
                                        var10001 = true){
                                            if (!llIIllIIIIlI(var18.hasNext())) {
                                                if (llIIllIIIlII(35147, 4870)) {
                                                    throw null;
                                                }

                                                var15 = true;
                                                return;
                                            }

                                            var7 = (BlockPos) var13.next();
                                            var18 = var13;
                                            this. (EnumHand.MAIN_HAND, var7, this.                                                                                            .
                                            ());
                                        }

                                        throw null;
                                    } else if (llIIllIIIlII(35147, 4870)) {
                                        throw null;
                                    } else {
                                        for (var18 = var13 = this. (var8,Class214.                                                                                           ).
                                        iterator();
                                        !llIIllIIIlII(35147, 4870);
                                        var10001 = true){
                                            if (!llIIllIIIIlI(var18.hasNext())) {
                                                if (llIIllIIIlII(35147, 4870)) {
                                                    throw null;
                                                }

                                                var15 = true;
                                                return;
                                            }

                                            var7 = (BlockPos) var13.next();
                                            var18 = var13;
                                            this. (EnumHand.MAIN_HAND, var7, this.                                                                                           .
                                            ());
                                        }

                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
