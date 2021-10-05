import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class Class114 implements ICommand {
    private static int 48896=-9359;
    public Minecraft;
    private static int 85261=-10608;
    private static int 32017=-11385;
    private static int 99910=-9819;
    private static int 41970=-15537;
    private static int 1291=17431;
    private static int 9241=28742;
    private static int 5329=8289;
    private static int 2703=14657;
    private static int 99279=-2918;
    private static int 7398=24657;
    private static int 6475=16650;
    private static int 4002=20077;
    private static int 56687=-21627;
    private static int 8952=29275;
    private static int 83279=-21440;
    private static int 2730=11356;
    private static int 33330=-16613;
    private static int 98559=-21135;
    private static int 4676=11334;
    private static int 8622=2473;
    private static int 91445=-16691;
    private static int 1812=18995;
    private static int 66127=-2853;

    static {
        boolean var10000 = true;
    }

    public Class114() {
        if (lllllIIIIlII(91445, 8952)) {
            throw null;
        } else {
            Minecraft var10001 = Minecraft.func_71410_x();
            if (lllllIIIIlII(91445, 8952)) {
                throw null;
            } else {
                this. = var10001;
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllllIIIIlIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllllIIIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIIIIIll(int var0) {
        return var0 != 0;
    }

    public String func_71518_a(ICommandSender var1) {
        return "";
    }

    public List func_184883_a(MinecraftServer var1, ICommandSender var2, String[] var3, BlockPos var4) {
        return null;
    }

    public int compareTo(ICommand var1) {
        return 0;
    }

    public boolean func_82358_a(String[] var1, int var2) {
        return false;
    }

    public List func_71514_a() {
        String[] var10000 = new String[1];
        String var10003 = Class60. ("93");
        if (lllllIIIIlII(56687, 9241)) {
            throw null;
        } else {
            var10000[0] = var10003;
            ArrayList var1 = Lists.newArrayList(var10000);
            if (lllllIIIIlII(56687, 9241)) {
                throw null;
            } else {
                return var1;
            }
        }
    }

    public boolean func_184882_a(MinecraftServer var1, ICommandSender var2) {
        return true;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public String func_71517_b() {
        return "";
    }

    public void func_184881_a(MinecraftServer var1, ICommandSender var2, String[] var3) throws CommandException {
        boolean var10000;
        if (lllllIIIIIll(Class73.)) {
            NetHandlerPlayClient var8 = this.                                                                                  .
            func_147114_u();
            CPacketChatMessage var10001 = new CPacketChatMessage;
            StringBuilder var10003 = new StringBuilder();
            if (lllllIIIIlII(32017, 6475)) {
                throw null;
            } else {
                String var10005 = Class60. (";q{");
                if (lllllIIIIlII(32017, 6475)) {
                    throw null;
                } else {
                    var10003 = var10003.insert(0, var10005);
                    String var10004 = Class60. ("{");
                    if (lllllIIIIlII(32017, 6475)) {
                        throw null;
                    } else {
                        var10004 = String.join(var10004, var3);
                        if (lllllIIIIlII(32017, 6475)) {
                            throw null;
                        } else {
                            var10001.<init> (String.valueOf(var10003.append(var10004)));
                            if (lllllIIIIlII(32017, 6475)) {
                                throw null;
                            } else {
                                var8.func_147297_a(var10001);
                                var10000 = true;
                            }
                        }
                    }
                }
            }
        } else if (lllllIIIIlII(32017, 6475)) {
            throw null;
        } else {
            if (lllllIIIIlIl(var3.length, 1)) {
                label74:
                {
                    try {
                        if (lllllIIIIlII(32017, 6475)) {
                            throw null;
                        }

                        double var6 = Double.parseDouble(var3[0]);
                        if (lllllIIIIlII(32017, 6475)) {
                            throw null;
                        }

                        double[] var7 = Class13. (var6, 1.0F);
                        if (lllllIIIIlII(32017, 6475)) {
                            throw null;
                        }

                        double[] var5 = var7;
                        this.                                                                                  .
                        field_71439_g.func_70107_b(this..field_71439_g.field_70165_t + var5[0], this.                                                                                  .
                        field_71439_g.field_70163_u, this.                                                                                  .
                        field_71439_g.field_70161_v + var5[1]);
                    } catch (Exception var4) {
                        if (lllllIIIIlII(32017, 6475)) {
                            throw null;
                        }
                        break label74;
                    }

                    if (lllllIIIIlII(32017, 6475)) {
                        throw null;
                    }

                    var10000 = true;
                    return;
                }
            }

            if (lllllIIIIlII(32017, 6475)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public int compareTo(Object var1) {
        return this.compareTo((ICommand) var1);
    }
}
