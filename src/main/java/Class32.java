import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class32 extends Class171 {
    private static int 4602=27276;
    private static int 30543=-16864;
    private static int 6201=22753;
    private static int 5847=11706;
    private static int 9642=5683;
    private static int 8548=22434;
    public boolean;
    public ArrayList;
    private static int 11942=-5725;
    private static int 2679=3194;
    public Class220;
    private static int 49823=-1097;
    private static int 71471=-16555;
    private static int 63479=-980;
    private static int 6218=16151;
    private static int 33861=-11868;
    private static int 18790=-15019;

    static {
        boolean var10000 = true;
    }

    public Class32() {
        String var10006 = Class60. ("\\z9q{;Q{2<");
        if (lllIlllIllII(18790, 6201)) {
            throw null;
        } else {
            super(var10006, 107, Class188.);
            if (lllIlllIllII(18790, 6201)) {
                throw null;
            } else {
                ArrayList var1 = new ArrayList();
                if (lllIlllIllII(18790, 6201)) {
                    throw null;
                } else {
                    this. = var1;
                    this. = true;
                    Class220 var10003 = new Class220;
                    String var10005 = Class60. ("\\p3wPt7|y1\"");
                    if (lllIlllIllII(18790, 6201)) {
                        throw null;
                    } else {
                        var10003.<init> (var10005, 240, this, 420.0D, 100.0D, 1500.0D, 10.0D, true);
                        if (lllIlllIllII(18790, 6201)) {
                            throw null;
                        } else {
                            this. = var10003;
                            this. (new Class220[]{this.});
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIlllIllII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlllIllIl(int var0) {
        return var0 > 0;
    }

    private static boolean lllIlllIlIll(int var0) {
        return var0 != 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (lllIlllIlIll(this.) && lllIlllIlIll(var1 instanceof CPacketPlayer)) {
            this.                                                                                  .add((Packet) var1);
            return false;
        } else if (lllIlllIllII(49823, 2679)) {
            throw null;
        } else {
            return true;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        StringBuilder var10002 = new StringBuilder();
        if (lllIlllIllII(33861, 4602)) {
            throw null;
        } else {
            var10002 = var10002.append(this.. ());
            String var10003 = Class60. ("6{");
            if (lllIlllIllII(33861, 4602)) {
                throw null;
            } else {
                this. (String.valueOf(var10002.append(var10003).append(this..size())));
                if (lllIlllIlIll(this.. (this.. ())) &&lllIlllIllIl(this..size())){
                    this.                                                                                         .();
                    this. = false;
                    Iterator var3;
                    Iterator var10000 = var3 = this.                                                                                  .
                    iterator();

                    while (true) {
                        if (lllIlllIllII(33861, 4602)) {
                            throw null;
                        }

                        if (!lllIlllIlIll(var10000.hasNext())) {
                            if (lllIlllIllII(33861, 4602)) {
                                throw null;
                            }

                            this. = true;
                            this.                                                                                  .
                            clear();
                            break;
                        }

                        Packet var2 = (Packet) var3.next();
                        var10000 = var3;
                        this. (var2);
                        this. (1L);
                        boolean var10001 = true;
                    }
                }

                if (lllIlllIllII(33861, 4602)) {
                    throw null;
                } else {
                    boolean var4 = true;
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (lllIlllIllII(11942, 8548)) {
            throw null;
        } else {
            this. = false;

            Iterator var1;
            boolean var10001;
            for (Iterator var10000 = var1 = this.                                                                                  .
            iterator();
            !lllIlllIllII(11942, 8548);
            var10001 = true){
                if (!lllIlllIlIll(var10000.hasNext())) {
                    if (lllIlllIllII(11942, 8548)) {
                        throw null;
                    }

                    this. = true;
                    this.                                                                                  .clear();
                    boolean var3 = true;
                    return;
                }

                Packet var2 = (Packet) var1.next();
                var10000 = var1;
                this. (var2);
                this. (1L);
            }

            throw null;
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (lllIlllIllII(71471, 9642)) {
            throw null;
        } else {
            this.                                                                                         .();
            this.                                                                                  .clear();
            boolean var10000 = true;
        }
    }
}
