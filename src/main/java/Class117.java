import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class117 extends Class171 {
    public Class220;
    private static int 89874=-20370;
    public Class220;
    private static int 6616=6458;
    public Class220;
    public Class220;
    private static int 31429=-19086;
    private static int 6213=3088;
    private static int 41027=-11070;
    public Class220;
    private static int 6683=10726;
    private static int 28450=-8821;
    private static int 7821=10207;
    private static int 91341=-20599;
    private static int 98794=-13307;
    public Class220;
    public Class220;
    private static int 91708=-6136;
    public Class220;
    private static int 1224=19186;
    private static int 677=10831;
    public Class220;
    public Class220;
    public Class220;
    public Class220;
    private static int 8947=14343;
    public Class220;

    static {
        boolean var10000 = true;
    }

    public Class117() {
        String var10015 = Class60. ("Tt9Sp;i\u007f2ip:u/");
        if (llIlIllIlllI(98794, 7821)) {
            throw null;
        } else {
            super(var10015, 102, Class188.);
            if (llIlIllIlllI(98794, 7821)) {
                throw null;
            } else {
                Class220 var20 = new Class220;
                String var10017 = Class60. ("Xhy}ksr<");
                if (llIlIllIlllI(98794, 7821)) {
                    throw null;
                } else {
                    ItemStack var10018 = new ItemStack(Blocks.CRAFTING_TABLE);
                    if (llIlIllIlllI(98794, 7821)) {
                        throw null;
                    } else {
                        var20.<init> (var10017, var10018, this, true);
                        if (llIlIllIlllI(98794, 7821)) {
                            throw null;
                        } else {
                            this. = var20;
                            Class220 var10014 = new Class220;
                            String var10016 = Class60. ("Zhmry~>");
                            if (llIlIllIlllI(98794, 7821)) {
                                throw null;
                            } else {
                                ItemStack var23 = new ItemStack(Blocks.FURNACE);
                                if (llIlIllIlllI(98794, 7821)) {
                                    throw null;
                                } else {
                                    var10014.<init> (var10016, var23, this, false);
                                    if (llIlIllIlllI(98794, 7821)) {
                                        throw null;
                                    } else {
                                        this. = var10014;
                                        Class220 var10013 = new Class220;
                                        var10015 = Class60. ("_uw)");
                                        if (llIlIllIlllI(98794, 7821)) {
                                            throw null;
                                        } else {
                                            ItemStack var22 = new ItemStack(Items.OAK_DOOR);
                                            if (llIlIllIlllI(98794, 7821)) {
                                                throw null;
                                            } else {
                                                var10013.<init> (var10015, var22, this, false);
                                                if (llIlIllIlllI(98794, 7821)) {
                                                    throw null;
                                                } else {
                                                    this. = var10013;
                                                    Class220 var10012 = new Class220;
                                                    String var18 = Class60. ("Ohyk{us)");
                                                    if (llIlIllIlllI(98794, 7821)) {
                                                        throw null;
                                                    } else {
                                                        ItemStack var21 = new ItemStack(Blocks.TRAPDOOR);
                                                        if (llIlIllIlllI(98794, 7821)) {
                                                            throw null;
                                                        } else {
                                                            var10012.<init> (var18, var21, this, false);
                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                throw null;
                                                            } else {
                                                                this. = var10012;
                                                                Class220 var10011 = new Class220;
                                                                String var16 = Class60. ("Uw~prUug>");
                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                    throw null;
                                                                } else {
                                                                    ItemStack var19 = new ItemStack(Blocks.OAK_FENCE_GATE);
                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10011.<init> (var16, var19, this, false);
                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10011;
                                                                            Class220 var10010 = new Class220;
                                                                            String var14 = Class60. ("\\vyl/");
                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                throw null;
                                                                            } else {
                                                                                ItemStack var17 = new ItemStack(Blocks.CHEST);
                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    var10010.<init>
                                                                                    (var14, var17, this, false);
                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        this. = var10010;
                                                                                        Class220 var10009 = new Class220;
                                                                                        String var12 = Class60.
                                                                                        ("_u}\u007flXu\u007fa/");
                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            ItemStack var15 = new ItemStack(Blocks.ENDER_CHEST);
                                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                var10009.<init>
                                                                                                (var12, var15, this, false)
                                                                                                ;
                                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    this. = var10009;
                                                                                                    Class220 var10008 = new Class220;
                                                                                                    String var10 = Class60.
                                                                                                    ("Hs\u007f5");
                                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        ItemStack var13 = new ItemStack(Items.SIGN);
                                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            var10008.<init>
                                                                                                            (var10, var13, this, false)
                                                                                                            ;
                                                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                this. = var10008;
                                                                                                                Class220 var10007 = new Class220;
                                                                                                                String var8 = Class60.
                                                                                                                ("Islvu~oX}#");
                                                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    ItemStack var11 = new ItemStack(Blocks.PURPLE_SHULKER_BOX);
                                                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        var10007.<init>
                                                                                                                        (var8, var11, this, false)
                                                                                                                        ;
                                                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            this. = var10007;
                                                                                                                            Class220 var10006 = new Class220;
                                                                                                                            String var6 = Class60.
                                                                                                                            ("[itulHi{|?");
                                                                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                ItemStack var9 = new ItemStack(Items.ARMOR_STAND);
                                                                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                    throw null;
                                                                                                                                } else {
                                                                                                                                    var10006.<init>
                                                                                                                                    (var6, var9, this, false)
                                                                                                                                    ;
                                                                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                        throw null;
                                                                                                                                    } else {
                                                                                                                                        this. = var10006;
                                                                                                                                        Class220 var10005 = new Class220;
                                                                                                                                        String var4 = Class60.
                                                                                                                                        ("W{ccr|gv)");
                                                                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                            throw null;
                                                                                                                                        } else {
                                                                                                                                            ItemStack var7 = new ItemStack(Blocks.DISPENSER);
                                                                                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                throw null;
                                                                                                                                            } else {
                                                                                                                                                var10005.<init>
                                                                                                                                                (var4, var7, this, false)
                                                                                                                                                ;
                                                                                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                    throw null;
                                                                                                                                                } else {
                                                                                                                                                    this. = var10005;
                                                                                                                                                    Class220 var10004 = new Class220;
                                                                                                                                                    String var2 = Class60.
                                                                                                                                                    ("Xoplhx)");
                                                                                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                        throw null;
                                                                                                                                                    } else {
                                                                                                                                                        ItemStack var5 = new ItemStack(Blocks.DROPPER);
                                                                                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                            throw null;
                                                                                                                                                        } else {
                                                                                                                                                            var10004.<init>
                                                                                                                                                            (var2, var5, this, false)
                                                                                                                                                            ;
                                                                                                                                                            if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                                throw null;
                                                                                                                                                            } else {
                                                                                                                                                                this. = var10004;
                                                                                                                                                                Class220 var10003 = new Class220;
                                                                                                                                                                String var1 = Class60.
                                                                                                                                                                ("Zfu~Q`u~>");
                                                                                                                                                                if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                                    throw null;
                                                                                                                                                                } else {
                                                                                                                                                                    ItemStack var3 = new ItemStack(Items.ITEM_FRAME);
                                                                                                                                                                    if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                                        throw null;
                                                                                                                                                                    } else {
                                                                                                                                                                        var10003.<init>
                                                                                                                                                                        (var1, var3, this, false)
                                                                                                                                                                        ;
                                                                                                                                                                        if (llIlIllIlllI(98794, 7821)) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        } else {
                                                                                                                                                                            this. = var10003;
                                                                                                                                                                            this.
                                                                                                                                                                            ((Class220[]) (new Class220[]{this., this., this., this., this., this., this., this., this., this., this., this., this.}));
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
            }
        }
    }

    private static boolean llIlIlllIllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llIlIlllIlll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIlIllIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIllIllIl(int var0) {
        return var0 != 0;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RightClickBlock var1) {
        var1.setCanceled(this. (this..world.getBlockState(var1.getPos()).getBlock()));
        boolean var10000 = true;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIlIllIllIl(var1 instanceof CPacketPlayerTryUseItemOnBlock)) {
            CPacketPlayerTryUseItemOnBlock var3 = (CPacketPlayerTryUseItemOnBlock) var1;
            if (llIlIllIllIl(this. (this..world.getBlockState(var3.getPos()).getBlock()))){
                return false;
            }
        }

        if (llIlIllIlllI(41027, 8947)) {
            throw null;
        } else {
            CPacketUseEntity var4;
            if (!llIlIllIllIl(var1 instanceof CPacketUseEntity) || !llIlIllIllIl(this.
            ((var4 = (CPacketUseEntity) var1).getEntityFromWorld(this..world))) ||
            llIlIlllIlll(var4.getAction(), Action.INTERACT) && !llIlIlllIllI(var4.getAction(), Action.INTERACT_AT))
            {
                if (llIlIllIlllI(41027, 8947)) {
                    throw null;
                } else {
                    return true;
                }
            } else if (llIlIllIlllI(41027, 8947)) {
                throw null;
            } else {
                if (llIlIlllIlll(this..player.inventory.getCurrentItem().getItem(),Items.AIR))
                {
                    CPacketPlayerTryUseItem var10001 = new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
                    if (llIlIllIlllI(41027, 8947)) {
                        throw null;
                    }

                    this. ((Packet) var10001);
                }

                if (llIlIllIlllI(41027, 8947)) {
                    throw null;
                } else {
                    return false;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Block var1) {
        if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.CRAFTING_TABLE)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.FURNACE)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&
        (!llIlIlllIlll(var1, Blocks.IRON_DOOR) || !llIlIlllIlll(var1, Blocks.ACACIA_DOOR) || !llIlIlllIlll(var1, Blocks.BIRCH_DOOR) || !llIlIlllIlll(var1, Blocks.DARK_OAK_DOOR) || !llIlIlllIlll(var1, Blocks.JUNGLE_DOOR) || !llIlIlllIlll(var1, Blocks.OAK_DOOR) || llIlIlllIllI(var1, Blocks.SPRUCE_DOOR)))
        {
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else {
                return true;
            }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.TRAPDOOR)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (!llIlIllIllIl(this.. ()) ||
        llIlIlllIlll(var1, Blocks.OAK_FENCE_GATE) && llIlIlllIlll(var1, Blocks.ACACIA_FENCE_GATE) && llIlIlllIlll(var1, Blocks.BIRCH_FENCE_GATE) && llIlIlllIlll(var1, Blocks.DARK_OAK_FENCE_GATE) && llIlIlllIlll(var1, Blocks.JUNGLE_FENCE_GATE) && !llIlIlllIllI(var1, Blocks.SPRUCE_FENCE_GATE))
        {
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&
            (!llIlIlllIlll(var1, Blocks.CHEST) || llIlIlllIllI(var1, Blocks.TRAPPED_CHEST))){
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else {
                return true;
            }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.ENDER_CHEST)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (!llIlIllIllIl(this.. ()) ||
            llIlIlllIlll(var1, Blocks.STANDING_SIGN) && !llIlIlllIllI(var1, Blocks.WALL_SIGN)){
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&
            (!llIlIlllIlll(var1, Blocks.BLACK_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.BLUE_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.BROWN_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.CYAN_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.GRAY_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.GREEN_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.LIGHT_BLUE_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.LIME_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.MAGENTA_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.ORANGE_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.PINK_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.PURPLE_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.RED_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.SILVER_SHULKER_BOX) || !llIlIlllIlll(var1, Blocks.WHITE_SHULKER_BOX) || llIlIlllIllI(var1, Blocks.YELLOW_SHULKER_BOX)))
            {
                if (llIlIllIlllI(91341, 6616)) {
                    throw null;
                } else {
                    return true;
                }
            } else if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.DISPENSER)){
                return true;
            } else if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.DROPPER)){
                return true;
            } else if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else {
                return false;
            }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else {
            return true;
        }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else {
            return true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var1) {
        if (llIlIllIllIl(this.. ()) &&llIlIllIllIl(var1 instanceof EntityArmorStand)){
            return true;
        } else if (llIlIllIlllI(28450, 1224)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIllIllIl(var1 instanceof EntityItemFrame)){
            return true;
        } else if (llIlIllIlllI(28450, 1224)) {
            throw null;
        } else {
            return false;
        }
    }
}
