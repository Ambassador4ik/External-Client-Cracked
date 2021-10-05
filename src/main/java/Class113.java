import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class Class113 implements ICommand {
    private static int 7911=26464;
    private static int 54705=-5692;
    private static int 4465=2393;
    private static int 57372=-14039;
    private static int 8630=15898;
    private static int 4672=2314;
    private static int 82821=-7904;
    private static int 7882=13206;
    private static int 66503=-7616;
    private static int 1743=28220;
    private static int 88678=-24001;
    private static int 4796=6415;
    private static int 89092=-3218;
    private static int 94268=-12612;
    private static int 68270=-6365;
    private static int 36054=-22647;
    private static int 51171=-27566;
    private static int 21757=-10842;
    public Minecraft;
    private static int 4832=5248;
    private static int 1945=30756;
    private static int 3802=22346;
    private static int 82591=-10248;
    private static int 6668=25671;
    private static int 1427=4971;

    static {
        boolean var10000 = true;
    }

    public Class113() {
        if (lllIlIlIIIIl(54705, 3802)) {
            throw null;
        } else {
            Minecraft var10001 = Minecraft.func_71410_x();
            if (lllIlIlIIIIl(54705, 3802)) {
                throw null;
            } else {
                this. = var10001;
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllIlIlIIIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIlIIlIl(int var0) {
        return var0 < 0;
    }

    private static boolean lllIlIlIIlII(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean lllIlIlIIIll(int var0) {
        return var0 == 0;
    }

    private static boolean lllIlIlIIIlI(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIlIIlllll(int var0) {
        return var0 != 0;
    }

    public List func_184883_a(MinecraftServer var1, ICommandSender var2, String[] var3, BlockPos var4) {
        return null;
    }

    public int compareTo(ICommand var1) {
        return 0;
    }

    public void func_184881_a(MinecraftServer var1, ICommandSender var2, String[] var3) throws CommandException {
        String var10004;
        boolean var24;
        if (lllIlIIlllll(Class73.)) {
            NetHandlerPlayClient var25 = this.                                                                                  .
            func_147114_u();
            CPacketChatMessage var23 = new CPacketChatMessage;
            StringBuilder var21 = new StringBuilder();
            if (lllIlIlIIIIl(94268, 4465)) {
                throw null;
            } else {
                String var10005 = Class60. ("8|p{");
                if (lllIlIlIIIIl(94268, 4465)) {
                    throw null;
                } else {
                    var21 = var21.insert(0, var10005);
                    var10004 = Class60. ("{");
                    if (lllIlIlIIIIl(94268, 4465)) {
                        throw null;
                    } else {
                        var10004 = String.join(var10004, var3);
                        if (lllIlIlIIIIl(94268, 4465)) {
                            throw null;
                        } else {
                            var23.<init> (String.valueOf(var21.append(var10004)));
                            if (lllIlIlIIIIl(94268, 4465)) {
                                throw null;
                            } else {
                                var25.func_147297_a(var23);
                                var24 = true;
                            }
                        }
                    }
                }
            }
        } else if (lllIlIlIIIIl(94268, 4465)) {
            throw null;
        } else if (lllIlIlIIIlI(var3.length, 2)) {
            var24 = true;
        } else if (lllIlIlIIIIl(94268, 4465)) {
            throw null;
        } else {
            String[] var5 = new String[var3.length - 1];

            int var8;
            boolean var16;
            for (int var10000 = var8 = 1; !lllIlIlIIIIl(94268, 4465); var16 = true) {
                if (!lllIlIlIIIlI(var10000, var3.length)) {
                    if (lllIlIlIIIIl(94268, 4465)) {
                        throw null;
                    }

                    String var15 = Class60. ("{");
                    if (lllIlIlIIIIl(94268, 4465)) {
                        throw null;
                    }

                    var15 = String.join(var15, var5);
                    if (lllIlIlIIIIl(94268, 4465)) {
                        throw null;
                    }

                    String var10;
                    byte var17;
                    label220:
                    {
                        byte var11;
                        var10 = var15;
                        String var6 = var3[0];
                        var11 = -1;
                        String var18;
                        label200:
                        switch (var6.hashCode()) {
                            case -934610812:
                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                while (!lllIlIlIIIIl(94268, 4465)) {
                                    if (lllIlIlIIIll(0)) {
                                        var18 = Class60. ("h~tuh>");
                                        if (lllIlIlIIIIl(94268, 4465)) {
                                            throw null;
                                        }

                                        if (lllIlIIlllll(var6.equals(var18))) {
                                            var11 = 1;
                                        }
                                        break label200;
                                    }

                                    if (lllIlIlIIIIl(94268, 4465)) {
                                        throw null;
                                    }

                                    var16 = true;
                                }

                                throw null;
                            case 96417:
                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                var18 = Class60. ("y}?");
                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                if (lllIlIIlllll(var6.equals(var18))) {
                                    byte var12;
                                    var17 = var12 = 0;
                                    var16 = true;
                                    break label220;
                                }
                        }

                        if (lllIlIlIIIIl(94268, 4465)) {
                            throw null;
                        }

                        var17 = var11;
                    }

                    if (lllIlIlIIIIl(94268, 4465)) {
                        throw null;
                    }

                    switch (var17) {
                        case 0:
                            if (lllIlIlIIIIl(94268, 4465)) {
                                throw null;
                            }

                            while (!lllIlIlIIIIl(94268, 4465)) {
                                if (lllIlIlIIIll(0)) {
                                    int var9 = -2;

                                    int var13;
                                    for (var10000 = var13 = 0; !lllIlIlIIIIl(94268, 4465); var16 = true) {
                                        if (!lllIlIlIIIlI(var10000, this..field_71441_e.field_73010_i.size())){
                                            if (lllIlIlIIIIl(94268, 4465)) {
                                                throw null;
                                            }

                                            EntityOtherPlayerMP var22 = new EntityOtherPlayerMP;
                                            WorldClient var19 = this.                                                                                  .
                                            field_71441_e;
                                            GameProfile var20 = new GameProfile(this..field_71439_g.func_110124_au(), var10)
                                            ;
                                            if (lllIlIlIIIIl(94268, 4465)) {
                                                throw null;
                                            }

                                            var22.<init> (var19, var20);
                                            if (lllIlIlIIIIl(94268, 4465)) {
                                                throw null;
                                            }

                                            EntityOtherPlayerMP var14 = var22;
                                            var14.func_70107_b(this..field_71439_g.field_70165_t, this.                                                                                  .
                                            field_71439_g.field_70163_u, this.                                                                                  .
                                            field_71439_g.field_70161_v);
                                            var14.func_70606_j(this..field_71439_g.func_110143_aJ());
                                            var14.field_70177_z = this.                                                                                  .
                                            field_71439_g.field_70177_z;
                                            var14.field_70125_A = this.                                                                                  .
                                            field_71439_g.field_70125_A;
                                            var14.field_70759_as = this.                                                                                  .
                                            field_71439_g.field_70759_as;
                                            var22.func_70095_a(this..field_71439_g.func_70093_af());
                                            var22.field_71071_by.func_70455_b(this..field_71439_g.field_71071_by);
                                            this.                                                                                  .
                                            field_71441_e.func_73027_a(var9, var14);
                                            var24 = true;
                                            return;
                                        }

                                        if (lllIlIlIIlII(((Entity) this..field_71441_e.field_73010_i.get(var13)).func_145782_y(),
                                        var9)){
                                            --var9;
                                        }

                                        if (lllIlIlIIIIl(94268, 4465)) {
                                            throw null;
                                        }

                                        ++var13;
                                        var10000 = var13;
                                    }

                                    throw null;
                                }

                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                var16 = true;
                            }

                            throw null;
                        case 1:
                            if (lllIlIlIIIIl(94268, 4465)) {
                                throw null;
                            }

                            int var4;
                            var10000 = var4 = 0;

                            while (true) {
                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                if (!lllIlIlIIIlI(var10000, this..field_71441_e.field_73010_i.size())){
                                    break;
                                }

                                Entity var7;
                                if (lllIlIIlllll((var7 = (Entity) this..field_71441_e.field_73010_i.get(var4)).func_70005_c_().equals(var10)) &&
                                lllIlIlIIlIl(var7.func_145782_y())){
                                    this.                                                                                  .
                                    field_71441_e.func_72900_e(var7);
                                }

                                if (lllIlIlIIIIl(94268, 4465)) {
                                    throw null;
                                }

                                ++var4;
                                var10000 = var4;
                                var16 = true;
                            }
                        default:
                            if (lllIlIlIIIIl(94268, 4465)) {
                                throw null;
                            }

                            var24 = true;
                            return;
                    }
                }

                int var10001 = var8 - 1;
                String var10002 = var3[var8];
                String var10003 = Class60. ("}");
                if (lllIlIlIIIIl(94268, 4465)) {
                    throw null;
                }

                var10004 = Class60. ("ü");
                if (lllIlIlIIIIl(94268, 4465)) {
                    throw null;
                }

                var10002 = var10002.replace(var10003, var10004);
                ++var8;
                var5[var10001] = var10002;
                var10000 = var8;
            }

            throw null;
        }
    }

    public String func_71517_b() {
        return "";
    }

    public String func_71518_a(ICommandSender var1) {
        return "";
    }

    public boolean func_184882_a(MinecraftServer var1, ICommandSender var2) {
        return true;
    }

    public int compareTo(Object var1) {
        return this.compareTo((ICommand) var1);
    }

    public boolean func_82358_a(String[] var1, int var2) {
        return false;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public List func_71514_a() {
        String[] var10000 = new String[1];
        String var10003 = Class60. (";\u007f3");
        if (lllIlIlIIIIl(36054, 4672)) {
            throw null;
        } else {
            var10000[0] = var10003;
            ArrayList var1 = Lists.newArrayList(var10000);
            if (lllIlIlIIIIl(36054, 4672)) {
                throw null;
            } else {
                return var1;
            }
        }
    }
}
