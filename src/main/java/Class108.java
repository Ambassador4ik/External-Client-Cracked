import com.mojang.realmsclient.gui.ChatFormatting;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent.Action;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class108 extends Class171 {
    private static int 5124=29352;
    private static int 24590=-4421;
    private static int 63586=-26926;
    private static int 56812=-16149;
    private static int 29923=-12340;
    private static int 41269=-17163;
    private static int 3714=28936;
    private static int 9536=26955;
    private static int 340=26399;
    private Class71;
    private static int 2348=1435;
    private static int 1702=31020;
    private static int 24176=-1291;
    private static int 68812=-15719;
    private List;
    private static int 67017=-32614;
    private static int 7601=23432;
    private static int 9780=7912;

    static {
        boolean var10000 = true;
    }

    public Class108() {
        String var10001 = Class60. ("Zy8xp:iu3nS;\u007f\u007f4x`:m)");
        if (lllIIllIlIIl(67017, 7601)) {
            throw null;
        } else {
            super(var10001, 1337, Class188.);
            if (lllIIllIlIIl(67017, 7601)) {
                throw null;
            } else {
                ArrayList var1 = new ArrayList();
                if (lllIIllIlIIl(67017, 7601)) {
                    throw null;
                } else {
                    this. = var1;
                    boolean var10000 = true;
                }
            }
        }
    }

    public static List ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Class108 var0) {
        return var0.;
    }

    private static boolean lllIIllIllll(Object var0) {
        return var0 != null;
    }

    private static boolean lllIIllIlllI(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIllIlIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlllIIIl(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllIIlllIIII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIllIlIII(Object var0) {
        return var0 == null;
    }

    public ITextComponent ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1) {
        TextComponentString var10000 = new TextComponentString;
        StringBuilder var10002 = new StringBuilder();
        if (lllIIllIlIIl(68812, 9536)) {
            throw null;
        } else {
            var10002 = var10002.insert(0, this. ());
            String var10003 = Class60. ("{");
            if (lllIIllIlIIl(68812, 9536)) {
                throw null;
            } else {
                var10000.<init> (String.valueOf(var10002.append(var10003)));
                if (lllIIllIlIIl(68812, 9536)) {
                    throw null;
                } else {
                    TextComponentString var2 = var10000;
                    var10000 = new TextComponentString(var1);
                    if (lllIIllIlIIl(68812, 9536)) {
                        throw null;
                    } else {
                        TextComponentString var3 = var10000;
                        var10000 = new TextComponentString;
                        String var9 = Class60. ("Gwgcv6dx?utv/");
                        if (lllIIllIlIIl(68812, 9536)) {
                            throw null;
                        } else {
                            var10000.<init> (var9);
                            if (lllIIllIlIIl(68812, 9536)) {
                                throw null;
                            } else {
                                TextComponentString var4 = var10000;
                                Style var7 = var3.getStyle();
                                HoverEvent var10001 = new HoverEvent(Action.SHOW_TEXT, var4);
                                if (lllIIllIlIIl(68812, 9536)) {
                                    throw null;
                                } else {
                                    var7.setHoverEvent(var10001);
                                    Style var8 = var3.getStyle();
                                    ClickEvent var10 = new ClickEvent(net.minecraft.util.text.event.ClickEvent.Action.SUGGEST_COMMAND, var1);
                                    if (lllIIllIlIIl(68812, 9536)) {
                                        throw null;
                                    } else {
                                        var8.setClickEvent(var10);
                                        var2.getSiblings().add(var3);
                                        TextComponentString var11 = new TextComponentString;
                                        StringBuilder var10005 = new StringBuilder();
                                        if (lllIIllIlIIl(68812, 9536)) {
                                            throw null;
                                        } else {
                                            var10005 = var10005.append(ChatFormatting.GOLD);
                                            String var10006 = Class60. (";A9\u0006");
                                            if (lllIIllIlIIl(68812, 9536)) {
                                                throw null;
                                            } else {
                                                var11.<init> (String.valueOf(var10005.append(var10006)));
                                                if (lllIIllIlIIl(68812, 9536)) {
                                                    throw null;
                                                } else {
                                                    TextComponentString var6 = var11;
                                                    var11 = new TextComponentString;
                                                    String var5 = Class60.
                                                    ("Orqh?nycg:gr{v4udn(yj:\u007folhe\u007f'sj;Or];Su[(");
                                                    if (lllIIllIlIIl(68812, 9536)) {
                                                        throw null;
                                                    } else {
                                                        var11.<init> (var5);
                                                        if (lllIIllIlIIl(68812, 9536)) {
                                                            throw null;
                                                        } else {
                                                            var3 = var11;
                                                            Style var12 = var6.getStyle();
                                                            HoverEvent var10004 = new HoverEvent(Action.SHOW_TEXT, var3);
                                                            if (lllIIllIlIIl(68812, 9536)) {
                                                                throw null;
                                                            } else {
                                                                var12.setHoverEvent(var10004);
                                                                var2.getSiblings().add(var6);
                                                                return var2;
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

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        if (lllIIllIlIII(this.)) {
            Class71 var10003 = new Class71(this);
            if (lllIIllIlIIl(29923, 1702)) {
                throw null;
            }

            this. = var10003;
            Class71 var10001 = this.;
            String var10002 = Class60. ("yz3");
            if (lllIIllIlIIl(29923, 1702)) {
                throw null;
            }

            var10001.setName(var10002);
            this.                                                                                            .start();
        }

        if (lllIIllIlIIl(29923, 1702)) {
            throw null;
        } else {
            super. ();
            if (lllIIllIlIIl(29923, 1702)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(EntityJoinWorldEvent var1) {
        if (lllIIllIlllI(this..isAlive())){
            Class71 var10003 = new Class71(this);
            if (lllIIllIlIIl(63586, 5124)) {
                throw null;
            }

            this. = var10003;
            Class71 var10001 = this.;
            String var10002 = Class60. ("yz3");
            if (lllIIllIlIIl(63586, 5124)) {
                throw null;
            }

            var10001.setName(var10002);
            this.                                                                                            .start();
        }

        if (lllIIllIlIIl(63586, 5124)) {
            throw null;
        } else {
            this.                                                                                            .isAlive();
            if (lllIIllIllll(this..player) &&
            lllIIlllIIII(var1.getEntity() instanceof EntityPlayer) && lllIIlllIIIl(var1.getEntity(), this..player) &&
            lllIIllIlllI(this..contains(var1.getEntity().getName())) &&lllIIllIlllI(Class73..                                                                                                    .
            ().contains(var1.getEntity().getName())) &&
            lllIIllIlllI(var1.getEntity().getName().equals(this..player.getName()))){
                String var10000 = var1.getEntity().getName();
                String var3 = Class60. ("}");
                if (lllIIllIlIIl(63586, 5124)) {
                    throw null;
                }

                if (lllIIllIlllI(var10000.contains(var3)) && lllIIllIlIIl(var1.getEntity().getName().length(), 3)) {
                    this.                                                                                            .
                    isAlive();
                    this.                                                                                  .
                    add(var1.getEntity().getName());
                }
            }

            if (lllIIllIlIIl(63586, 5124)) {
                throw null;
            } else {
                boolean var2 = true;
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        String var2;
        if (lllIIlllIIII(this..size())){
            StringBuilder var10001 = new StringBuilder();
            if (lllIIllIlIIl(56812, 9780)) {
                throw null;
            }

            var2 = String.valueOf(var10001.append(this..size()).append(""));
            boolean var10002 = true;
        } else{
            if (lllIIllIlIIl(56812, 9780)) {
                throw null;
            }

            var2 = "";
        }

        if (lllIIllIlIIl(56812, 9780)) {
            throw null;
        } else {
            this. (var2);
            boolean var10000 = true;
        }
    }
}
