import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class Class62 implements ICommand {
    private static int 77710=-679;
    private static int 8314=19285;
    private static int 817=2614;
    private static int 22309=-4883;
    private static int 732=17705;
    private static int 37064=-23407;
    private static int 43996=-6579;
    public Minecraft;
    private static int 9735=30276;
    private static int 8240=-11775;
    private static int 59072=-32342;
    private static int 8871=17103;
    private static int 43907=-4062;
    private static int 20170=-15693;
    private static int 2951=1515;
    private static int 1879=29156;
    private static int 12633=-15366;
    private static int 2765=5487;
    private static int 9432=15146;
    private static int 22602=-15527;
    private static int 9518=3541;
    private static int 1166=18763;
    private static int 30430=-20917;
    private static int 12941=-24827;
    private static int 4601=28224;

    static {
        boolean var10000 = true;
    }

    public Class62() {
        if (llIIIlIIIlII(43996, 2765)) {
            throw null;
        } else {
            Minecraft var10001 = Minecraft.func_71410_x();
            if (llIIIlIIIlII(43996, 2765)) {
                throw null;
            } else {
                this. = var10001;
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIIlIIIlII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIIlIlIIII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIIlIlIlII(int var0, int var1) {
        return var0 == var1;
    }

    public boolean func_82358_a(String[] var1, int var2) {
        return false;
    }

    public String func_71518_a(ICommandSender var1) {
        return "";
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public int compareTo(Object var1) {
        return this.compareTo((ICommand) var1);
    }

    public void func_184881_a(MinecraftServer var1, ICommandSender var2, String[] var3) throws CommandException {
        boolean var10000;
        if (llIIIlIlIIII(Class73.)) {
            NetHandlerPlayClient var6 = this.                                                                                  .
            func_147114_u();
            CPacketChatMessage var7 = new CPacketChatMessage;
            StringBuilder var8 = new StringBuilder();
            if (llIIIlIIIlII(22602, 2951)) {
                throw null;
            } else {
                String var10005 = Class60. (";o{");
                if (llIIIlIIIlII(22602, 2951)) {
                    throw null;
                } else {
                    var8 = var8.insert(0, var10005);
                    String var10004 = Class60. ("{");
                    if (llIIIlIIIlII(22602, 2951)) {
                        throw null;
                    } else {
                        var10004 = String.join(var10004, var3);
                        if (llIIIlIIIlII(22602, 2951)) {
                            throw null;
                        } else {
                            var7.<init> (String.valueOf(var8.append(var10004)));
                            if (llIIIlIIIlII(22602, 2951)) {
                                throw null;
                            } else {
                                var6.func_147297_a(var7);
                                var10000 = true;
                            }
                        }
                    }
                }
            }
        } else if (llIIIlIIIlII(22602, 2951)) {
            throw null;
        } else {
            if (llIIIlIlIlII(var3.length, 1)) {
                label69:
                {
                    try {
                        if (llIIIlIIIlII(22602, 2951)) {
                            throw null;
                        }

                        EntityPlayerSP var5 = this.                                                                                  .
                        field_71439_g;
                        double var10001 = this.                                                                                  .
                        field_71439_g.field_70165_t;
                        double var10002 = this.                                                                                  .
                        field_71439_g.field_70163_u;
                        double var10003 = Double.parseDouble(var3[0]);
                        if (llIIIlIIIlII(22602, 2951)) {
                            throw null;
                        }

                        var5.func_70107_b(var10001, var10002 + var10003, this..field_71439_g.field_70161_v);
                    } catch (Exception var4) {
                        if (llIIIlIIIlII(22602, 2951)) {
                            throw null;
                        }
                        break label69;
                    }

                    if (llIIIlIIIlII(22602, 2951)) {
                        throw null;
                    }

                    var10000 = true;
                    return;
                }
            }

            if (llIIIlIIIlII(22602, 2951)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public String func_71517_b() {
        return "";
    }

    public List func_71514_a() {
        String[] var10000 = new String[1];
        String var10003 = Class60. ("9-");
        if (llIIIlIIIlII(8240, 8871)) {
            throw null;
        } else {
            var10000[0] = var10003;
            ArrayList var1 = Lists.newArrayList(var10000);
            if (llIIIlIIIlII(8240, 8871)) {
                throw null;
            } else {
                return var1;
            }
        }
    }

    public int compareTo(ICommand var1) {
        return 0;
    }

    public List func_184883_a(MinecraftServer var1, ICommandSender var2, String[] var3, BlockPos var4) {
        return null;
    }

    public boolean func_184882_a(MinecraftServer var1, ICommandSender var2) {
        return true;
    }
}
