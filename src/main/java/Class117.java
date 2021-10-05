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
                    ItemStack var10018 = new ItemStack(Blocks.field_150462_ai);
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
                                ItemStack var23 = new ItemStack(Blocks.field_150460_al);
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
                                            ItemStack var22 = new ItemStack(Items.field_179570_aq);
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
                                                        ItemStack var21 = new ItemStack(Blocks.field_150415_aT);
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
                                                                    ItemStack var19 = new ItemStack(Blocks.field_180390_bo);
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
                                                                                ItemStack var17 = new ItemStack(Blocks.field_150486_ae);
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
                                                                                            ItemStack var15 = new ItemStack(Blocks.field_150477_bB);
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
                                                                                                        ItemStack var13 = new ItemStack(Items.field_151155_ap);
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
                                                                                                                    ItemStack var11 = new ItemStack(Blocks.field_190987_dv);
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
                                                                                                                                ItemStack var9 = new ItemStack(Items.field_179565_cj);
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
                                                                                                                                            ItemStack var7 = new ItemStack(Blocks.field_150367_z);
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
                                                                                                                                                        ItemStack var5 = new ItemStack(Blocks.field_150409_cd);
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
                                                                                                                                                                    ItemStack var3 = new ItemStack(Items.field_151160_bD);
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
        var1.setCanceled(this. (this..field_71441_e.func_180495_p(var1.getPos()).func_177230_c()));
        boolean var10000 = true;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIlIllIllIl(var1 instanceof CPacketPlayerTryUseItemOnBlock)) {
            CPacketPlayerTryUseItemOnBlock var3 = (CPacketPlayerTryUseItemOnBlock) var1;
            if (llIlIllIllIl(this. (this..field_71441_e.func_180495_p(var3.func_187023_a()).func_177230_c()))){
                return false;
            }
        }

        if (llIlIllIlllI(41027, 8947)) {
            throw null;
        } else {
            CPacketUseEntity var4;
            if (!llIlIllIllIl(var1 instanceof CPacketUseEntity) || !llIlIllIllIl(this.
            ((var4 = (CPacketUseEntity) var1).func_149564_a(this..field_71441_e))) ||
            llIlIlllIlll(var4.func_149565_c(), Action.INTERACT) && !llIlIlllIllI(var4.func_149565_c(), Action.INTERACT_AT))
            {
                if (llIlIllIlllI(41027, 8947)) {
                    throw null;
                } else {
                    return true;
                }
            } else if (llIlIllIlllI(41027, 8947)) {
                throw null;
            } else {
                if (llIlIlllIlll(this..field_71439_g.field_71071_by.func_70448_g().func_77973_b(),Items.field_190931_a))
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
        if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150462_ai)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150460_al)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&
        (!llIlIlllIlll(var1, Blocks.field_150454_av) || !llIlIlllIlll(var1, Blocks.field_180410_as) || !llIlIlllIlll(var1, Blocks.field_180412_aq) || !llIlIlllIlll(var1, Blocks.field_180409_at) || !llIlIlllIlll(var1, Blocks.field_180411_ar) || !llIlIlllIlll(var1, Blocks.field_180413_ao) || llIlIlllIllI(var1, Blocks.field_180414_ap)))
        {
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else {
                return true;
            }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150415_aT)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (!llIlIllIllIl(this.. ()) ||
        llIlIlllIlll(var1, Blocks.field_180390_bo) && llIlIlllIlll(var1, Blocks.field_180387_bt) && llIlIlllIlll(var1, Blocks.field_180392_bq) && llIlIlllIlll(var1, Blocks.field_180385_bs) && llIlIlllIlll(var1, Blocks.field_180386_br) && !llIlIlllIllI(var1, Blocks.field_180391_bp))
        {
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&
            (!llIlIlllIlll(var1, Blocks.field_150486_ae) || llIlIlllIllI(var1, Blocks.field_150447_bR))){
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else {
                return true;
            }
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150477_bB)){
            return true;
        } else if (llIlIllIlllI(91341, 6616)) {
            throw null;
        } else if (!llIlIllIllIl(this.. ()) ||
            llIlIlllIlll(var1, Blocks.field_150472_an) && !llIlIlllIllI(var1, Blocks.field_150444_as)){
            if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&
            (!llIlIlllIlll(var1, Blocks.field_190975_dA) || !llIlIlllIlll(var1, Blocks.field_190988_dw) || !llIlIlllIlll(var1, Blocks.field_190989_dx) || !llIlIlllIlll(var1, Blocks.field_190986_du) || !llIlIlllIlll(var1, Blocks.field_190984_ds) || !llIlIlllIlll(var1, Blocks.field_190990_dy) || !llIlIlllIlll(var1, Blocks.field_190980_do) || !llIlIlllIlll(var1, Blocks.field_190982_dq) || !llIlIlllIlll(var1, Blocks.field_190979_dn) || !llIlIlllIlll(var1, Blocks.field_190978_dm) || !llIlIlllIlll(var1, Blocks.field_190983_dr) || !llIlIlllIlll(var1, Blocks.field_190987_dv) || !llIlIlllIlll(var1, Blocks.field_190991_dz) || !llIlIlllIlll(var1, Blocks.field_190985_dt) || !llIlIlllIlll(var1, Blocks.field_190977_dl) || llIlIlllIllI(var1, Blocks.field_190981_dp)))
            {
                if (llIlIllIlllI(91341, 6616)) {
                    throw null;
                } else {
                    return true;
                }
            } else if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150367_z)){
                return true;
            } else if (llIlIllIlllI(91341, 6616)) {
                throw null;
            } else if (llIlIllIllIl(this.. ()) &&llIlIlllIllI(var1, Blocks.field_150409_cd)){
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
