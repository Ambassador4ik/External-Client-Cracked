import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class219 extends Class171 {
    public Class220;
    private static int 79969=-3964;
    private static int 7184=13547;
    private static int 352=3943;
    private static int 5080=20395;
    private static int 3197=27862;
    public Class220;
    private static int 78309=-22455;
    public ArrayList;
    private static int 30427=-31859;
    private static int 64954=-3987;
    public ArrayList;
    public Class220;
    private static int 27020=-28912;
    private static int 53674=-4427;
    private static int 6073=16083;
    public int;
    public ArrayList;
    public long;
    private static int 7828=30251;
    private static int 52503=-25022;
    private static int 91387=-11068;
    private static int 99183=-15317;
    private static int 90531=-18107;
    private static int 6701=31303;
    public Class220;
    public BlockPos;
    private static int 9153=6896;
    private static int 55702=-14050;
    public ArrayList;
    public ArrayList;
    public Class220;
    public Runnable;
    private static int 84758=-21623;
    public Class220;
    private static int 719=8465;
    private static int 16611=-23762;
    public int;
    public ArrayList;
    public Map;
    public Class220;
    private static int 2200=110;
    public Class28;
    private static int 5824=9582;
    private static int 6366=32205;
    public Class220;
    public int;
    private static int 85979=-19317;
    private static int 77797=-21516;
    public Class220;
    public Class220;
    private static int 7266=7913;
    private static int 9288=6771;
    private static int 76991=-32394;
    private static int 5398=29647;
    public Class220;
    private static int 9615=13036;

    static {
        boolean var10000 = true;
    }

    public Class219() {
        String var10031 = Class60. ("Bi9{g;_c2kp:e(");
        if (llIlIIlIIlII(53674, 2200)) {
            throw null;
        } else {
            super(var10031, 42, Class188.);
            if (llIlIIlIIlII(53674, 2200)) {
                throw null;
            } else {
                ArrayList var16 = new ArrayList();
                if (llIlIIlIIlII(53674, 2200)) {
                    throw null;
                } else {
                    this. = var16;
                    ArrayList var10030 = new ArrayList();
                    if (llIlIIlIIlII(53674, 2200)) {
                        throw null;
                    } else {
                        this. = var10030;
                        ArrayList var10029 = new ArrayList();
                        if (llIlIIlIIlII(53674, 2200)) {
                            throw null;
                        } else {
                            this. = var10029;
                            ArrayList var10028 = new ArrayList();
                            if (llIlIIlIIlII(53674, 2200)) {
                                throw null;
                            } else {
                                this. = var10028;
                                ArrayList var10027 = new ArrayList();
                                if (llIlIIlIIlII(53674, 2200)) {
                                    throw null;
                                } else {
                                    this. = var10027;
                                    ArrayList var10026 = new ArrayList();
                                    if (llIlIIlIIlII(53674, 2200)) {
                                        throw null;
                                    } else {
                                        this. = var10026;
                                        this. = 0;
                                        this. = 0;
                                        this. = 0;
                                        this. = 0L;
                                        Class28 var10017 = new Class28();
                                        if (llIlIIlIIlII(53674, 2200)) {
                                            throw null;
                                        } else {
                                            this. = var10017;
                                            BlockPos var10016 = new BlockPos(0, 0, 0);
                                            if (llIlIIlIIlII(53674, 2200)) {
                                                throw null;
                                            } else {
                                                this. = var10016;
                                                HashMap var10015 = new HashMap();
                                                if (llIlIIlIIlII(53674, 2200)) {
                                                    throw null;
                                                } else {
                                                    this. = var10015;
                                                    Class220 var10014 = new Class220;
                                                    String var15 = Class60. ("N|?r\u007f=>");
                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                        throw null;
                                                    } else {
                                                        var10014.<init> (var15, 113, this, 25.0D, 5.0D, 40.0D, true);
                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                            throw null;
                                                        } else {
                                                            this. = var10014;
                                                            Class220 var10013 = new Class220;
                                                            String var14 = Class60. ("Ui3`u1yt8D\u000b");
                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                throw null;
                                                            } else {
                                                                var10013.<init>
                                                                (var14, 114, this, 5.0D, 5.0D, 40.0D, true);
                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                    throw null;
                                                                } else {
                                                                    this. = var10013;
                                                                    Class220 var10012 = new Class220;
                                                                    String var13 = Class60. ("_c9j\u007f;s~2_~:a5");
                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10012.<init>
                                                                        (var13, 115, this, 10.0D, 5.0D, 40.0D, true);
                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10012;
                                                                            Class220 var10011 = new Class220;
                                                                            String var12 = Class60. ("Xx?py=\"");
                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10011.<init>
                                                                                (var12, 116, this, 10.0D, 3.0D, 40.0D, true)
                                                                                ;
                                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this. = var10011;
                                                                                    Class220 var10010 = new Class220;
                                                                                    String var11 = Class60.
                                                                                    ("Hw8zm:hHp:q5");
                                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        var10010.<init>
                                                                                        (var11, 205, this, true);
                                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            this. = var10010;
                                                                                            Class220 var10009 = new Class220;
                                                                                            String var9 = Class60.
                                                                                            ("Du4v}6Tr?z}7\"");
                                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10009.<init>
                                                                                                (var9, 230, this, 600.0D, 100.0D, 1000.0D, 10.0D, true)
                                                                                                ;
                                                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    this. = var10009;
                                                                                                    Class220 var10008 = new Class220;
                                                                                                    String var7 = Class60.
                                                                                                    ("Zv8w]v<tp:{(");
                                                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        var10008.<init>
                                                                                                        (var7, 129, this, false)
                                                                                                        ;
                                                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            this. = var10008;
                                                                                                            Class220 var10007 = new Class220;
                                                                                                            String var5 = Class60.
                                                                                                            ("^r9{s;rt2?");
                                                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                ItemStack var10 = new ItemStack(Blocks.field_150482_ag);
                                                                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    var10007.<init>
                                                                                                                    (var5, 117, var10, this, true)
                                                                                                                    ;
                                                                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        this. = var10007;
                                                                                                                        Class220 var10006 = new Class220;
                                                                                                                        String var3 = Class60.
                                                                                                                        ("_v9\u007fl;|v2?");
                                                                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            ItemStack var8 = new ItemStack(Blocks.field_150412_bA);
                                                                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                var10006.<init>
                                                                                                                                (var3, 118, var8, this, false)
                                                                                                                                ;
                                                                                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    this. = var10006;
                                                                                                                                    Class220 var10005 = new Class220;
                                                                                                                                    String var2 = Class60.
                                                                                                                                    ("Xq<s?");
                                                                                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        ItemStack var6 = new ItemStack(Blocks.field_150352_o);
                                                                                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            var10005.<init>
                                                                                                                                            (var2, 119, var6, this, true)
                                                                                                                                            ;
                                                                                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                this. = var10005;
                                                                                                                                                Class220 var10004 = new Class220;
                                                                                                                                                String var1 = Class60.
                                                                                                                                                ("Vl<p5");
                                                                                                                                                if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    ItemStack var4 = new ItemStack(Blocks.field_150366_p);
                                                                                                                                                    if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        var10004.<init>
                                                                                                                                                        (var1, 120, var4, this, true)
                                                                                                                                                        ;
                                                                                                                                                        if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            this. = var10004;
                                                                                                                                                            Class217 var10003 = new Class217(this);
                                                                                                                                                            if (llIlIIlIIlII(53674, 2200)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                this. = var10003;
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
                                                                                                                                                                this.
                                                                                                                                                                ((Class220[]) (new Class220[]{this.}));
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIlIIlIlIll(int var0) {
        return var0 <= 0;
    }

    private static boolean llIlIIlIIIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class80 var0) {
        return 1;
    }

    private static boolean llIlIIlIIlIl(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIIllIIll(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIlIIIlI(int var0) {
        return var0 != 0;
    }

    private static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0, Class80 var1) {
        return var1. (var0);
    }

    private static boolean llIlIIlIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIIlIlIII(int var0) {
        return var0 > 0;
    }

    private static boolean llIlIIlIIlll(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean llIlIIlIIllI(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIIlIlIIl(Object var0) {
        return var0 == null;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(ArrayList var1, BlockPos var2) {
        if (llIlIIlIlIII(var1.stream().filter(Class219::).mapToInt(Class219::).sum())) {
            return true;
        } else if (llIlIIlIIlII(77797, 719)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        ArrayList var10000 = new ArrayList();
        if (llIlIIlIIlII(76991, 9288)) {
            throw null;
        } else {
            ArrayList var1 = var10000;
            BlockPos var2 = this.                                                                                                    .
            field_71439_g.func_180425_c();
            int var3 = this.                                                                                                  .
            ();
            int var4 = this.                                                                                           .
            ();
            int var5 = this.                                                                                                .
            ();

            int var6;
            boolean var10001;
            label73:
            for (int var10 = var6 = var3; !llIlIIlIIlII(76991, 9288); var10001 = true) {
                if (!llIlIIlIIlII(var10, -var3)) {
                    if (llIlIIlIIlII(76991, 9288)) {
                        throw null;
                    }

                    return var1;
                }

                int var7;
                var10 = var7 = var4;

                label70:
                while (!llIlIIlIIlII(76991, 9288)) {
                    if (!llIlIIlIIlII(var10, -var5)) {
                        if (llIlIIlIIlII(76991, 9288)) {
                            throw null;
                        }

                        --var6;
                        var10 = var6;
                        continue label73;
                    }

                    int var8;
                    for (var10 = var8 = var3; !llIlIIlIIlII(76991, 9288); var10001 = true) {
                        if (!llIlIIlIIlII(var10, -var3)) {
                            if (llIlIIlIIlII(76991, 9288)) {
                                throw null;
                            }

                            --var7;
                            var10 = var7;
                            var10001 = true;
                            continue label70;
                        }

                        BlockPos var9;
                        if (llIlIIlIlIII((var9 = var2.func_177982_a(var6, var7, var8)).func_177956_o())) {
                            if (llIlIIlIIIlI(this.. ())){
                                var1.add(var9);
                                boolean var11 = true;
                            } else{
                                if (llIlIIlIIlII(76991, 9288)) {
                                    throw null;
                                }

                                if (llIlIIlIIIlI(this. (var9))){
                                    var1.add(var9);
                                }
                            }
                        }

                        if (llIlIIlIIlII(76991, 9288)) {
                            throw null;
                        }

                        --var8;
                        var10 = var8;
                    }

                    throw null;
                }

                throw null;
            }

            throw null;
        }
    }

    public void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        boolean var5;
        try {
            if (llIlIIlIIlII(27020, 6073)) {
                throw null;
            }

            int var1 = 0;

            while (true) {
                if (llIlIIlIIlII(27020, 6073)) {
                    throw null;
                }

                if (!llIlIIlIIlll(var1, this..size())){
                    break;
                }

                Class80 var2 = (Class80) this.                                                                                                     .
                get(var1);
                long var10000 = System.currentTimeMillis();
                if (llIlIIlIIlII(27020, 6073)) {
                    throw null;
                }

                double var6;
                if (llIlIIlIlIII((var6 = (double) (var10000 - var2. ())-this.                                                                                        .
                ()) ==0.0D ? 0 : (var6 < 0.0D ? -1 : 1)) &&llIlIIlIIIlI(this. (var2. ())) &&llIlIIlIIllI(this.
                (this., var2. ()))){
                    var2. = this. (var2. ());
                    this.                                                                              .add(var2);
                    if (llIlIIlIIllI(this..contains(var2. ()))){
                        this.                                                                                              .
                        add(var2. ());
                        Block var10001;
                        Integer var10002;
                        Map var4;
                        if (llIlIIlIlIIl(this..get(var2.))){
                            var4 = this.;
                            var10001 = var2.;
                            var10002 = 0;
                            if (llIlIIlIIlII(27020, 6073)) {
                                throw null;
                            }

                            var4.put(var10001, var10002);
                        }

                        if (llIlIIlIIlII(27020, 6073)) {
                            throw null;
                        }

                        var4 = this.;
                        var10001 = var2.;
                        var10002 = (Integer) this.                                                                            .
                        get(var2.) + 1;
                        if (llIlIIlIIlII(27020, 6073)) {
                            throw null;
                        }

                        var4.replace(var10001, var10002);
                    }

                    if (llIlIIlIIlII(27020, 6073)) {
                        throw null;
                    }

                    this.                                                                                                     .
                    remove(var1);
                    var5 = true;
                } else{
                    if (llIlIIlIIlII(27020, 6073)) {
                        throw null;
                    }

                    if (!llIlIIlIIIlI(this. (var2. ())) ||llIlIIlIIIlI(this. (this., var2. ()))){
                        if (llIlIIlIIlII(27020, 6073)) {
                            throw null;
                        }

                        this.                                                                                                     .
                        remove(var1);
                    }
                }

                if (llIlIIlIIlII(27020, 6073)) {
                    throw null;
                }

                ++var1;
                var5 = true;
            }
        } catch (Exception var3) {
            if (llIlIIlIIlII(27020, 6073)) {
                throw null;
            }
        }

        if (llIlIIlIIlII(27020, 6073)) {
            throw null;
        } else {
            var5 = true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (llIlIIlIIlII(64954, 7184)) {
            throw null;
        } else {
            this. = 0;
            this. = 0;
            if (llIlIIlIIllI(this..isEmpty())){
                this.                                                                                .clear();
            }

            if (llIlIIlIIlII(64954, 7184)) {
                throw null;
            } else {
                if (llIlIIlIIllI(this..isEmpty())){
                    this.                                                                              .clear();
                }

                if (llIlIIlIIlII(64954, 7184)) {
                    throw null;
                } else {
                    if (llIlIIlIIllI(this..isEmpty())){
                        this.                                                                                                     .
                        clear();
                    }

                    if (llIlIIlIIlII(64954, 7184)) {
                        throw null;
                    } else {
                        if (llIlIIlIIllI(this..isEmpty())){
                            this.                                                                                     .
                            clear();
                        }

                        if (llIlIIlIIlII(64954, 7184)) {
                            throw null;
                        } else {
                            if (llIlIIlIIllI(this..isEmpty())){
                                this.                                                                                              .
                                clear();
                            }

                            if (llIlIIlIIlII(64954, 7184)) {
                                throw null;
                            } else {
                                this.                                                                            .
                                clear();
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        int var10000;
        boolean var10001;
        int var5;
        if (llIlIIlIIllI(this..isEmpty())){
            var10000 = var5 = 0;

            while (true) {
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                if (!llIlIIlIIlll(var10000, this..size())){
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    if (llIlIIlIIIlI(this.. (1500))){
                        this.                                                                                .clear();
                        this.                                                                                         .
                        ();
                    }
                    break;
                }

                BlockPos var2 = (BlockPos) this.                                                                                .
                get(var5);
                GlStateManager.func_179094_E();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179090_x();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179129_p();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179147_l();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179097_i();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179132_a(false);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_187441_d(2.0F);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GL11.glEnable(2848);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GL11.glTranslated((double) var2.func_177958_n() - this..func_175598_ae().field_78730_l, (double) var2.func_177956_o() - this.                                                                                                    .
                func_175598_ae().field_78731_m, (double) var2.func_177952_p() - this.                                                                                                    .
                func_175598_ae().field_78728_n);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.7F);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                Class181. (Block.field_185505_j);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179098_w();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179089_o();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179084_k();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179126_j();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179132_a(true);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                ++var5;
                GL11.glDisable(2848);
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179121_F();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                GlStateManager.func_179117_G();
                if (llIlIIlIIlII(30427, 5398)) {
                    throw null;
                }

                var10000 = var5;
                var10001 = true;
            }
        }

        if (llIlIIlIIlII(30427, 5398)) {
            throw null;
        } else {
            boolean var7;
            if (llIlIIlIIllI(this..isEmpty())){
                var10000 = var5 = 0;

                while (true) {
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    if (!llIlIIlIIlll(var10000, this..size())){
                        break;
                    }

                    Class80 var6;
                    BlockPos var3 = (var6 = (Class80) this..get(var5)).();
                    Block var4 = this. (var6. ());
                    GlStateManager.func_179094_E();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179090_x();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179147_l();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179097_i();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_187441_d(2.0F);
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GL11.glEnable(2848);
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GL11.glTranslated((double) var3.func_177958_n() - this..func_175598_ae().field_78730_l, (double) var3.func_177956_o() - this.                                                                                                    .
                    func_175598_ae().field_78731_m, (double) var3.func_177952_p() - this.                                                                                                    .
                    func_175598_ae().field_78728_n);
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    if (llIlIIlIIlIl(var4, Blocks.field_150482_ag) && llIlIIlIIIlI(this.. ())){
                        GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.7F);
                        if (llIlIIlIIlII(30427, 5398)) {
                            throw null;
                        }

                        Class181. (Block.field_185505_j);
                        if (llIlIIlIIlII(30427, 5398)) {
                            throw null;
                        }

                        var7 = true;
                    } else{
                        if (llIlIIlIIlII(30427, 5398)) {
                            throw null;
                        }

                        if (llIlIIlIIlIl(var4, Blocks.field_150412_bA) && llIlIIlIIIlI(this.. ())){
                            GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.7F);
                            if (llIlIIlIIlII(30427, 5398)) {
                                throw null;
                            }

                            Class181. (Block.field_185505_j);
                            if (llIlIIlIIlII(30427, 5398)) {
                                throw null;
                            }

                            var7 = true;
                        } else{
                            if (llIlIIlIIlII(30427, 5398)) {
                                throw null;
                            }

                            if (llIlIIlIIlIl(var4, Blocks.field_150352_o) && llIlIIlIIIlI(this.. ())){
                                GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.7F);
                                if (llIlIIlIIlII(30427, 5398)) {
                                    throw null;
                                }

                                Class181. (Block.field_185505_j);
                                if (llIlIIlIIlII(30427, 5398)) {
                                    throw null;
                                }

                                var7 = true;
                            } else{
                                if (llIlIIlIIlII(30427, 5398)) {
                                    throw null;
                                }

                                if (llIlIIlIIlIl(var4, Blocks.field_150366_p) && llIlIIlIIIlI(this.. ())){
                                    this.                                                                                           .
                                    (255, 100, 100, 178.0F);
                                    Class181. (Block.field_185505_j);
                                    if (llIlIIlIIlII(30427, 5398)) {
                                        throw null;
                                    }

                                    var7 = true;
                                } else{
                                    if (llIlIIlIIlII(30427, 5398)) {
                                        throw null;
                                    }

                                    if (llIlIIlIIlIl(var4, Blocks.field_150353_l)) {
                                        this.                                                                                           .
                                        (255, 0, 0, 178.0F);
                                        Class181. (Block.field_185505_j);
                                        if (llIlIIlIIlII(30427, 5398)) {
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179098_w();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179084_k();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179126_j();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    ++var5;
                    GL11.glDisable(2848);
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179121_F();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    GlStateManager.func_179117_G();
                    if (llIlIIlIIlII(30427, 5398)) {
                        throw null;
                    }

                    var10000 = var5;
                    var10001 = true;
                }
            }

            if (llIlIIlIIlII(30427, 5398)) {
                throw null;
            } else {
                var7 = true;
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        Block[] var4;
        int var2 = (var4 = new Block[]{this..field_71441_e.func_180495_p(var1.func_177982_a(1, 0, 0)).func_177230_c(),
        this.                                                                                                    .
        field_71441_e.func_180495_p(var1.func_177982_a(-1, 0, 0)).func_177230_c(), this.                                                                                                    .
        field_71441_e.func_180495_p(var1.func_177982_a(0, 1, 0)).func_177230_c(), this.                                                                                                    .
        field_71441_e.func_180495_p(var1.func_177982_a(0, -1, 0)).func_177230_c(), this.                                                                                                    .
        field_71441_e.func_180495_p(var1.func_177982_a(0, 0, 1)).func_177230_c(), this.                                                                                                    .
        field_71441_e.func_180495_p(var1.func_177982_a(0, 0, -1)).func_177230_c()}).length;

        boolean var10001;
        int var3;
        for (int var10000 = var3 = 0; !llIlIIlIIlII(16611, 3197); var10001 = true) {
            if (!llIlIIlIIlll(var10000, var2)) {
                if (llIlIIlIIlII(16611, 3197)) {
                    throw null;
                }

                return false;
            }

            if (llIlIIlIIIll(var4[var3], Blocks.field_150357_h)) {
                return true;
            }

            if (llIlIIlIIlII(16611, 3197)) {
                throw null;
            }

            ++var3;
            var10000 = var3;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        ScaledResolution var5 = var1.getResolution();
        int var2;
        boolean var8;
        String var9;
        if (llIlIIlIlIll(var2 = this..size())){
            var9 = Class60. ("Uuv>");
            if (llIlIIlIIlII(85979, 352)) {
                throw null;
            } else {
                this. (var9);
                var8 = true;
            }
        } else if (llIlIIlIIlII(85979, 352)) {
            throw null;
        } else {
            StringBuilder var10001 = new StringBuilder();
            if (llIlIIlIIlII(85979, 352)) {
                throw null;
            } else {
                StringBuilder var10002 = var10001.append(this. * 100 / var2);
                String var10003 = Class60. ("~");
                if (llIlIIlIIlII(85979, 352)) {
                    throw null;
                } else {
                    this. (String.valueOf(var10002.append(var10003)));
                    var10001 = new StringBuilder();
                    if (llIlIIlIIlII(85979, 352)) {
                        throw null;
                    } else {
                        var10001 = var10001.append(this.);
                        String var10 = Class60. ("86{");
                        if (llIlIIlIIlII(85979, 352)) {
                            throw null;
                        } else {
                            var9 = String.valueOf(String.valueOf(var10001.append(var10).append(var2)));
                            if (llIlIIlIIlII(85979, 352)) {
                                throw null;
                            } else {
                                String var6 = var9;
                                Class4 var10000 = this.;
                                float var12 = (float) (var5.func_78326_a() / 2 - this.. (var6) / 2);
                                float var15;
                                if (llIlIIlIlIII(this..entrySet().size())){
                                    var15 = 20.0F;
                                    boolean var10004 = true;
                                } else{
                                    if (llIlIIlIIlII(85979, 352)) {
                                        throw null;
                                    }

                                    var15 = 2.0F;
                                }

                                if (llIlIIlIIlII(85979, 352)) {
                                    throw null;
                                } else {
                                    var10000. (var6, var12, var15, 2, Class73., Class73.                                                                                                  )
                                    ;
                                    if (llIlIIlIIllI(this..isEmpty())){
                                        var2 = 0;
                                        Iterator var3;
                                        Iterator var7 = var3 = this.                                                                            .
                                        entrySet().iterator();

                                        while (true) {
                                            if (llIlIIlIIlII(85979, 352)) {
                                                throw null;
                                            }

                                            if (!llIlIIlIIIlI(var7.hasNext())) {
                                                break;
                                            }

                                            Entry var4 = (Entry) var3.next();
                                            var10000 = this.;
                                            ItemStack var11 = new ItemStack((Block) var4.getKey(), (Integer) var4.getValue());
                                            if (llIlIIlIIlII(85979, 352)) {
                                                throw null;
                                            }

                                            int var14 = var5.func_78326_a() / 2 - this.                                                                            .
                                            entrySet().size() * 8 + var2;
                                            var2 += 16;
                                            var10000. (var11, var14, 1, -100.0F);
                                            var7 = var3;
                                            boolean var13 = true;
                                        }
                                    }

                                    if (llIlIIlIIlII(85979, 352)) {
                                        throw null;
                                    } else {
                                        var8 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (llIlIIlIIlII(78309, 9153)) {
            throw null;
        } else {
            Thread var10000 = new Thread;
            Runnable var10002 = this.;
            String var10003 = Class60. ("#");
            if (llIlIIlIIlII(78309, 9153)) {
                throw null;
            } else {
                var10000.<init> (var10002, var10003);
                if (llIlIIlIIlII(78309, 9153)) {
                    throw null;
                } else {
                    var10000.start();
                    boolean var1 = true;
                }
            }
        }
    }

    public Block ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var1) {
        return this.                                                                                                    .
        field_71441_e.func_180495_p(var1).func_177230_c();
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIlIIlIIIlI(var1 instanceof SPacketBlockChange)) {
            SPacketBlockChange var5 = (SPacketBlockChange) var1;
            if (llIlIIlIIIlI(this. (var5.func_179827_b()))){
                ArrayList var10000 = this.;
                Class80 var10001 = new Class80;
                Block var10004 = var5.func_180728_a().func_177230_c();
                BlockPos var10005 = var5.func_179827_b();
                long var10006 = System.currentTimeMillis();
                if (llIlIIlIIlII(52503, 7266)) {
                    throw null;
                }

                Long var3 = var10006;
                if (llIlIIlIIlII(52503, 7266)) {
                    throw null;
                }

                var10001.<init> (this, var10004, var10005, var3);
                if (llIlIIlIIlII(52503, 7266)) {
                    throw null;
                }

                var10000.add(var10001);
            }
        }

        if (llIlIIlIIlII(52503, 7266)) {
            throw null;
        } else {
            CPacketPlayerDigging var6;
            if (llIlIIlIIIlI(var1 instanceof CPacketPlayerDigging) && llIlIIlIIlIl((var6 = (CPacketPlayerDigging) var1).func_180762_c(), Action.STOP_DESTROY_BLOCK)) {
                Block var4 = this. (var6.func_179715_a());
                if (llIlIIllIIll(this..get(var4)) &&llIlIIlIIIlI(this. (this., var6.func_179715_a())) &&
                llIlIIlIIllI(this..contains(var6.func_179715_a()))){
                    this.                                                                                     .
                    add(var6.func_179715_a());
                    Map var7 = this.;
                    Integer var10002 = (Integer) this.                                                                            .
                    get(var4) - 1;
                    if (llIlIIlIIlII(52503, 7266)) {
                        throw null;
                    }

                    var7.replace(var4, var10002);
                    if (llIlIIlIIllI((Integer) this..get(var4))){
                        this.                                                                            .remove(var4);
                    }
                }
            }

            if (llIlIIlIIlII(52503, 7266)) {
                throw null;
            } else {
                return true;
            }
        }
    }

    public boolean ____________________________________________________________________________/* $FF was:                                                                             */(BlockPos var1) {
        Block var2;
        if (llIlIIlIIIlI((var2 = this..field_71441_e.func_180495_p(var1).func_177230_c()) instanceof BlockOre)){
            label62:
            {
                if (!llIlIIlIIIlI(this.. ()) ||llIlIIlIIIll(var2, Blocks.field_150482_ag)){
                if (llIlIIlIIlII(99183, 5824)) {
                    throw null;
                }

                if (!llIlIIlIIIlI(this.. ()) ||llIlIIlIIIll(var2, Blocks.field_150412_bA)){
                    if (llIlIIlIIlII(99183, 5824)) {
                        throw null;
                    }

                    if (!llIlIIlIIIlI(this.. ()) ||llIlIIlIIIll(var2, Blocks.field_150352_o)){
                        if (llIlIIlIIlII(99183, 5824)) {
                            throw null;
                        }

                        if (!llIlIIlIIIlI(this.. ()) ||!llIlIIlIIlIl(var2, Blocks.field_150366_p)){
                            break label62;
                        }
                    }
                }
            }

                if (llIlIIlIIlII(99183, 5824)) {
                    throw null;
                }

                if (llIlIIlIIIlI(this. (var1))){
                return true;
            }
            }
        }

        if (llIlIIlIIlII(99183, 5824)) {
            throw null;
        } else {
            return false;
        }
    }
}
