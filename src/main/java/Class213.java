import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

public class Class213 extends Class171 {
    private static int 91611=-31231;
    private static int 4585=7229;
    private static int 2286=16184;
    private static int 9070=15120;
    public Class220;
    private static int 1575=31244;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 2217=5542;
    private static int 46417=-16493;
    public Class220;
    private static int 11414=-2469;
    private static int 88489=-22179;
    private static int 20138=-10536;
    public Class220;
    private static int 61721=-29162;
    public Class220;
    public Class220;
    private static int 4895=10236;
    public Class220;
    public Class220;
    private static int 3100=30732;
    public ArrayList;
    private static int 43111=-21576;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class213() {
        String var10015 = Class60. ("Gl<~\"");
        if (llIlIIllIllI(11414, 1575)) {
            throw null;
        } else {
            super(var10015, 20, Class188.);
            if (llIlIIllIllI(11414, 1575)) {
                throw null;
            } else {
                Class220 var17 = new Class220;
                String var10017 = Class60. ("Tt8wf:_z3lu(");
                if (llIlIIllIllI(11414, 1575)) {
                    throw null;
                } else {
                    var17.<init> (var10017, 48, this, true);
                    if (llIlIIllIllI(11414, 1575)) {
                        throw null;
                    } else {
                        this. = var17;
                        Class220 var10014 = new Class220;
                        String var10016 = Class60. ("Hz9ty>");
                        if (llIlIIllIllI(11414, 1575)) {
                            throw null;
                        } else {
                            var10014.<init> (var10016, 49, this, 25.0D, 5.0D, 45.0D, true);
                            if (llIlIIllIllI(11414, 1575)) {
                                throw null;
                            } else {
                                this. = var10014;
                                Class220 var10013 = new Class220;
                                var10015 = Class60. ("H~\u007f:l~n:zOx:{>");
                                if (llIlIIllIllI(11414, 1575)) {
                                    throw null;
                                } else {
                                    var10013.<init> (var10015, 145, this, 0.0D, 0.0D, 5.0D, true);
                                    if (llIlIIllIllI(11414, 1575)) {
                                        throw null;
                                    } else {
                                        this. = var10013;
                                        Class220 var10012 = new Class220;
                                        String var15 = Class60. ("_sy;rur?");
                                        if (llIlIIllIllI(11414, 1575)) {
                                            throw null;
                                        } else {
                                            ItemStack var19 = new ItemStack(Blocks.DIAMOND_ORE);
                                            if (llIlIIllIllI(11414, 1575)) {
                                                throw null;
                                            } else {
                                                var10012.<init> (var15, 50, var19, this, true);
                                                if (llIlIIllIllI(11414, 1575)) {
                                                    throw null;
                                                } else {
                                                    this. = var10012;
                                                    Class220 var10011 = new Class220;
                                                    String var13 = Class60. ("^w};m{p?");
                                                    if (llIlIIllIllI(11414, 1575)) {
                                                        throw null;
                                                    } else {
                                                        ItemStack var18 = new ItemStack(Blocks.EMERALD_ORE);
                                                        if (llIlIIllIllI(11414, 1575)) {
                                                            throw null;
                                                        } else {
                                                            var10011.<init> (var13, 51, var18, this, true);
                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10011;
                                                                Class220 var10010 = new Class220;
                                                                String var11 = Class60. ("Xq<s?");
                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                    throw null;
                                                                } else {
                                                                    ItemStack var16 = new ItemStack(Blocks.GOLD_ORE);
                                                                    if (llIlIIllIllI(11414, 1575)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10010.<init> (var11, 52, var16, this, false);
                                                                        if (llIlIIllIllI(11414, 1575)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10010;
                                                                            Class220 var10009 = new Class220;
                                                                            String var9 = Class60. ("Vl<p5");
                                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                                throw null;
                                                                            } else {
                                                                                ItemStack var14 = new ItemStack(Blocks.IRON_ORE);
                                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var10009.<init>
                                                                                    (var9, 53, var14, this, false);
                                                                                    if (llIlIIllIllI(11414, 1575)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this. = var10009;
                                                                                        Class220 var10008 = new Class220;
                                                                                        String var7 = Class60.
                                                                                        ("Bt3tg1c\u007f8\u007f>");
                                                                                        if (llIlIIllIllI(11414, 1575)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            ItemStack var12 = new ItemStack(Blocks.REDSTONE_ORE);
                                                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10008.<init>
                                                                                                (var7, 227, var12, this, true)
                                                                                                ;
                                                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    this. = var10008;
                                                                                                    Class220 var10007 = new Class220;
                                                                                                    String var5 = Class60.
                                                                                                    ("\\q<~7");
                                                                                                    if (llIlIIllIllI(11414, 1575)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        ItemStack var10 = new ItemStack(Blocks.COAL_ORE);
                                                                                                        if (llIlIIllIllI(11414, 1575)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            var10007.<init>
                                                                                                            (var5, 54, var10, this, false)
                                                                                                            ;
                                                                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                this. = var10007;
                                                                                                                Class220 var10006 = new Class220;
                                                                                                                String var4 = Class60.
                                                                                                                ("Vz9jw(");
                                                                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    ItemStack var8 = new ItemStack(Blocks.LAPIS_ORE);
                                                                                                                    if (llIlIIllIllI(11414, 1575)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        var10006.<init>
                                                                                                                        (var4, 55, var8, this, false)
                                                                                                                        ;
                                                                                                                        if (llIlIIllIllI(11414, 1575)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            this. = var10006;
                                                                                                                            Class220 var10005 = new Class220;
                                                                                                                            String var2 = Class60.
                                                                                                                            ("Mh~<ji!");
                                                                                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                ItemStack var6 = new ItemStack(Blocks.QUARTZ_ORE);
                                                                                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    var10005.<init>
                                                                                                                                    (var2, 142, var6, this, false)
                                                                                                                                    ;
                                                                                                                                    if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        this. = var10005;
                                                                                                                                        Class220 var10004 = new Class220;
                                                                                                                                        String var1 = Class60.
                                                                                                                                        ("\\v8thi<o|:~>");
                                                                                                                                        if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            ItemStack var3 = new ItemStack(Blocks.GLOWSTONE);
                                                                                                                                            if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                var10004.<init>
                                                                                                                                                (var1, var3, this, false)
                                                                                                                                                ;
                                                                                                                                                if (llIlIIllIllI(11414, 1575)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    this. = var10004;
                                                                                                                                                    ArrayList var10003 = new ArrayList();
                                                                                                                                                    if (llIlIIllIllI(11414, 1575)) {
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

    private static boolean llIlIIllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIIllIlIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIllIllI(int var0, int var1) {
        return var0 >= var1;
    }

    public static ArrayList ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var0) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIlIIllIllI(88489, 2217)) {
            throw null;
        } else {
            Minecraft var1 = var10000;
            ArrayList var10 = new ArrayList();
            if (llIlIIllIllI(88489, 2217)) {
                throw null;
            } else {
                ArrayList var2 = var10;
                Class220 var11 = Class75. (48);
                if (llIlIIllIllI(88489, 2217)) {
                    throw null;
                } else {
                    byte var3 = var11. ();
                    int var4;
                    int var12 = var4 = (int) var1.player.posX - var0;

                    label113:
                    while (!llIlIIllIllI(88489, 2217)) {
                        if (!llIlIIlllIlI(var12, (int) var1.player.posX + var0)) {
                            if (llIlIIllIllI(88489, 2217)) {
                                throw null;
                            }

                            return var2;
                        }

                        int var5;
                        boolean var10001;
                        for (var12 = var5 = (int) var1.player.posZ - var0; !llIlIIllIllI(88489, 2217); var10001 = true) {
                            if (!llIlIIlllIlI(var12, (int) var1.player.posZ + var0)) {
                                if (llIlIIllIllI(88489, 2217)) {
                                    throw null;
                                }

                                ++var4;
                                var12 = var4;
                                var10001 = true;
                                continue label113;
                            }

                            int var6 = var1.world.getHeight(var4, var5);
                            int var7;
                            var12 = var7 = 0;

                            while (true) {
                                if (llIlIIllIllI(88489, 2217)) {
                                    throw null;
                                }

                                if (!llIlIIlllIlI(var12, var6) || !llIlIIlllIll(var1.player)) {
                                    break;
                                }

                                boolean var15;
                                if (llIlIIllllII(var1.world)) {
                                    var15 = true;
                                    break;
                                }

                                if (llIlIIllIllI(88489, 2217)) {
                                    throw null;
                                }

                                BlockPos var13 = new BlockPos(var4, var7, var5);
                                if (llIlIIllIllI(88489, 2217)) {
                                    throw null;
                                }

                                BlockPos var8 = var13;
                                IBlockState var9;
                                if (!llIlIIllllIl((var9 = var1.world.getBlockState(var8)).getBlock() instanceof BlockOre) || !llIlIIlllllI(var9.getBlock(), Blocks.REDSTONE_ORE) || !llIlIIlllllI(var9.getBlock(), Blocks.LIT_REDSTONE_ORE) || llIlIIllIlll(var9.getBlock(), Blocks.GLOWSTONE)) {
                                    if (llIlIIllIllI(88489, 2217)) {
                                        throw null;
                                    }

                                    if (llIlIIllIlIl(var3)) {
                                        byte var14 = (var8);
                                        if (llIlIIllIllI(88489, 2217)) {
                                            throw null;
                                        }

                                        if (llIlIIllIlIl(var14)) {
                                            var2.add(var8);
                                            var15 = true;
                                        }
                                    } else {
                                        if (llIlIIllIllI(88489, 2217)) {
                                            throw null;
                                        }

                                        var2.add(var8);
                                    }
                                }

                                if (llIlIIllIllI(88489, 2217)) {
                                    throw null;
                                }

                                ++var7;
                                var12 = var7;
                                var10001 = true;
                            }

                            if (llIlIIllIllI(88489, 2217)) {
                                throw null;
                            }

                            ++var5;
                            var12 = var5;
                        }

                        throw null;
                    }

                    throw null;
                }
            }
        }
    }

    public static boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIlIIllIllI(20138, 4895)) {
            throw null;
        } else {
            Minecraft var1 = var10000;
            Block var2;
            if (llIlIIllllIl((var2 = var10000.world.getBlockState(var0.add(1, 0, 0)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var2 instanceof BlockLiquid)) {
                if (llIlIIllIllI(20138, 4895)) {
                    throw null;
                } else if (llIlIIllllIl((var2 = var1.world.getBlockState(var0.add(-1, 0, 0)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var2 instanceof BlockLiquid)) {
                    if (llIlIIllIllI(20138, 4895)) {
                        throw null;
                    } else if (llIlIIllllIl((var2 = var1.world.getBlockState(var0.add(0, 1, 0)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var2 instanceof BlockLiquid)) {
                        if (llIlIIllIllI(20138, 4895)) {
                            throw null;
                        } else if (llIlIIllllIl((var2 = var1.world.getBlockState(var0.add(0, -1, 0)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var2 instanceof BlockLiquid)) {
                            if (llIlIIllIllI(20138, 4895)) {
                                throw null;
                            } else if (llIlIIllllIl((var2 = var1.world.getBlockState(var0.add(0, 0, 1)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var2 instanceof BlockLiquid)) {
                                if (llIlIIllIllI(20138, 4895)) {
                                    throw null;
                                } else {
                                    Block var3;
                                    if (llIlIIllllIl((var3 = var1.world.getBlockState(var0.add(0, 0, -1)).getBlock()) instanceof BlockAir) && !llIlIIllIlIl(var3 instanceof BlockLiquid)) {
                                        if (llIlIIllIllI(20138, 4895)) {
                                            throw null;
                                        } else {
                                            return false;
                                        }
                                    } else if (llIlIIllIllI(20138, 4895)) {
                                        throw null;
                                    } else {
                                        return true;
                                    }
                                }
                            } else if (llIlIIllIllI(20138, 4895)) {
                                throw null;
                            } else {
                                return true;
                            }
                        } else if (llIlIIllIllI(20138, 4895)) {
                            throw null;
                        } else {
                            return true;
                        }
                    } else if (llIlIIllIllI(20138, 4895)) {
                        throw null;
                    } else {
                        return true;
                    }
                } else if (llIlIIllIllI(20138, 4895)) {
                    throw null;
                } else {
                    return true;
                }
            } else if (llIlIIllIllI(20138, 4895)) {
                throw null;
            } else {
                return true;
            }
        }
    }

    private static boolean llIlIIllllII(Object var0) {
        return var0 == null;
    }

    private static boolean llIlIIllIlll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIIlllllI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIlIIlllIll(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIlllIlI(int var0, int var1) {
        return var0 <= var1;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        boolean var1;
        if (llIlIIllIlIl(this. ())){
            this. (false);
            var1 = true;
        } else if (llIlIIllIllI(46417, 2286)) {
            throw null;
        } else {
            super. ();
            if (llIlIIllIllI(46417, 2286)) {
                throw null;
            } else {
                Thread var10000 = new Thread;
                Class227 var10002 = new Class227(this);
                if (llIlIIllIllI(46417, 2286)) {
                    throw null;
                } else {
                    var10000.<init> (var10002);
                    if (llIlIIllIllI(46417, 2286)) {
                        throw null;
                    } else {
                        var10000.start();
                        var1 = true;
                    }
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderWorldLastEvent var1) {
        boolean var5;
        if (llIlIIllIlIl(this..isEmpty())){
            var5 = true;
        } else if (llIlIIllIllI(43111, 9070)) {
            throw null;
        } else {
            boolean var10001;
            Iterator var4;
            for (Iterator var10000 = var4 = this.                                                                                            .
            iterator();
            !llIlIIllIllI(43111, 9070);
            var10001 = true){
                if (!llIlIIllIlIl(var10000.hasNext())) {
                    if (llIlIIllIllI(43111, 9070)) {
                        throw null;
                    }

                    var5 = true;
                    return;
                }

                BlockPos var2 = (BlockPos) var4.next();
                Block var3 = this.                                                                                                    .
                world.getBlockState(var2).getBlock();
                GlStateManager.pushMatrix();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.disableTexture2D();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.enableBlend();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.disableDepth();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.glLineWidth(2.0F);
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GL11.glEnable(2848);
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GL11.glTranslated((double) var2.getX() - this..getRenderManager().viewerPosX, (double) var2.getY() - this.                                                                                                    .
                getRenderManager().viewerPosY, (double) var2.getZ() - this.                                                                                                    .
                getRenderManager().viewerPosZ);
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                if (llIlIIllIlll(var3, Blocks.DIAMOND_ORE) && llIlIIllIlIl(this.. ())){
                    GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.7F);
                    if (llIlIIllIllI(43111, 9070)) {
                        throw null;
                    }

                    Class181. (Block.FULL_BLOCK_AABB);
                    if (llIlIIllIllI(43111, 9070)) {
                        throw null;
                    }

                    var5 = true;
                } else{
                    if (llIlIIllIllI(43111, 9070)) {
                        throw null;
                    }

                    if (llIlIIllIlll(var3, Blocks.EMERALD_ORE) && llIlIIllIlIl(this.. ())){
                        GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.7F);
                        if (llIlIIllIllI(43111, 9070)) {
                            throw null;
                        }

                        Class181. (Block.FULL_BLOCK_AABB);
                        if (llIlIIllIllI(43111, 9070)) {
                            throw null;
                        }

                        var5 = true;
                    } else{
                        if (llIlIIllIllI(43111, 9070)) {
                            throw null;
                        }

                        if (llIlIIllIlll(var3, Blocks.GOLD_ORE) && llIlIIllIlIl(this.. ())){
                            GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.7F);
                            if (llIlIIllIllI(43111, 9070)) {
                                throw null;
                            }

                            Class181. (Block.FULL_BLOCK_AABB);
                            if (llIlIIllIllI(43111, 9070)) {
                                throw null;
                            }

                            var5 = true;
                        } else{
                            if (llIlIIllIllI(43111, 9070)) {
                                throw null;
                            }

                            if (llIlIIllIlll(var3, Blocks.IRON_ORE) && llIlIIllIlIl(this.. ())){
                                this.                                                                                           .
                                (255, 100, 100, 178.0F);
                                Class181. (Block.FULL_BLOCK_AABB);
                                if (llIlIIllIllI(43111, 9070)) {
                                    throw null;
                                }

                                var5 = true;
                            } else{
                                if (llIlIIllIllI(43111, 9070)) {
                                    throw null;
                                }

                                if (llIlIIllIlll(var3, Blocks.COAL_ORE) && llIlIIllIlIl(this.. ())){
                                    this.                                                                                           .
                                    (50, 50, 50, 178.0F);
                                    Class181. (Block.FULL_BLOCK_AABB);
                                    if (llIlIIllIllI(43111, 9070)) {
                                        throw null;
                                    }

                                    var5 = true;
                                } else{
                                    if (llIlIIllIllI(43111, 9070)) {
                                        throw null;
                                    }

                                    if (llIlIIllIlll(var3, Blocks.LAPIS_ORE) && llIlIIllIlIl(this.. ())){
                                        this.                                                                                           .
                                        (16, 34, 181, 178.0F);
                                        Class181. (Block.FULL_BLOCK_AABB);
                                        if (llIlIIllIllI(43111, 9070)) {
                                            throw null;
                                        }

                                        var5 = true;
                                    } else{
                                        if (llIlIIllIllI(43111, 9070)) {
                                            throw null;
                                        }

                                        if (llIlIIllIlll(var3, Blocks.QUARTZ_ORE) && llIlIIllIlIl(this.. ())){
                                            this.                                                                                           .
                                            (255, 255, 255, 178.0F);
                                            Class181. (Block.FULL_BLOCK_AABB);
                                            if (llIlIIllIllI(43111, 9070)) {
                                                throw null;
                                            }

                                            var5 = true;
                                        } else{
                                            if (llIlIIllIllI(43111, 9070)) {
                                                throw null;
                                            }

                                            if (llIlIIllIlll(var3, Blocks.REDSTONE_ORE) && llIlIIllIlIl(this.. ())){
                                                this.                                                                                           .
                                                (255, 0, 0, 178.0F);
                                                Class181. (Block.FULL_BLOCK_AABB);
                                                if (llIlIIllIllI(43111, 9070)) {
                                                    throw null;
                                                }

                                                var5 = true;
                                            } else{
                                                if (llIlIIllIllI(43111, 9070)) {
                                                    throw null;
                                                }

                                                if (llIlIIllIlll(var3, Blocks.LIT_REDSTONE_ORE) && llIlIIllIlIl(this.. ()))
                                                {
                                                    this.                                                                                           .
                                                    (255, 0, 0, 178.0F);
                                                    Class181. (Block.FULL_BLOCK_AABB);
                                                    if (llIlIIllIllI(43111, 9070)) {
                                                        throw null;
                                                    }

                                                    var5 = true;
                                                } else{
                                                    if (llIlIIllIllI(43111, 9070)) {
                                                        throw null;
                                                    }

                                                    if (llIlIIllIlll(var3, Blocks.GLOWSTONE) && llIlIIllIlIl(this..
                                                    ())){
                                                        this.                                                                                           .
                                                        (255, 255, 0, 178.0F);
                                                        Class181. (Block.FULL_BLOCK_AABB);
                                                        if (llIlIIllIllI(43111, 9070)) {
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
                    }
                }

                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.enableTexture2D();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.disableBlend();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.enableDepth();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GL11.glDisable(2848);
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.popMatrix();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                GlStateManager.resetColor();
                if (llIlIIllIllI(43111, 9070)) {
                    throw null;
                }

                var10000 = var4;
            }

            throw null;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
