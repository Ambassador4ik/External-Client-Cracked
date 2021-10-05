import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class143 extends Class171 {
    private float;
    private static int 46939=-12457;
    private static int 57336=-10713;
    private static int 96671=-11743;
    private static int 6663=3653;
    public Class220;
    private static int 75322=-21142;
    private static int 4768=1957;
    private static int 42876=-18669;
    private static int 9878=23338;
    private static int 946=25844;
    private static int 8363=22040;

    static {
        boolean var10000 = true;
    }

    public Class143() {
        String var10004 = Class60. ("R|d3~S}36");
        if (llIIllIllllI(46939, 9878)) {
            throw null;
        } else {
            super(var10004, 45, Class188.);
            if (llIIllIllllI(46939, 9878)) {
                throw null;
            } else {
                this. = 0.0F;
                Class220 var10001 = new Class220;
                String var10003 = Class60. ("Vu|>");
                if (llIIllIllllI(46939, 9878)) {
                    throw null;
                } else {
                    String[] var10006 = new String[2];
                    String var10009 = Class60. ("I~kl{)");
                    if (llIIllIllllI(46939, 9878)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Ywp\u007fp/");
                        if (llIIllIllllI(46939, 9878)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var10001.<init> (var10003, 135, this, var10006);
                            if (llIIllIllllI(46939, 9878)) {
                                throw null;
                            } else {
                                this. = var10001;
                                this. (new Class220[]{this.});
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIllIlllll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIIllIlllII(int var0) {
        return var0 != 0;
    }

    private static boolean llIIlllIIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIIllIllllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIllIlllIl(Object var0) {
        return var0 == null;
    }

    private static boolean llIIlllIIIII(Object var0, Object var1) {
        return var0 == var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIIllIlllII(var1 instanceof CPacketPlayer) && llIIllIlllIl(Class122.)) {
            this. = (float) ((double) this. + 15.2D);
            String var10000 = this.                                                                                            .
            ();
            String var10001 = Class60. ("I~kl{)");
            if (llIIllIllllI(96671, 6663)) {
                throw null;
            }

            if (llIIllIlllII(var10000.equals(var10001))) {
                Class22. ((CPacketPlayer) var1, this.                                                                                  )
                ;
                if (llIIllIllllI(96671, 6663)) {
                    throw null;
                }
            }

            if (llIIllIllllI(96671, 6663)) {
                throw null;
            }

            this.                                                                                                    .
            field_71439_g.field_70759_as = this.;
            this.                                                                                                    .
            field_71439_g.field_70761_aq = this.;
        }

        if (llIIllIllllI(96671, 6663)) {
            throw null;
        } else {
            CPacketEntityAction var3;
            if (!llIIllIlllII(var1 instanceof CPacketEntityAction) || llIIllIlllll((var3 = (CPacketEntityAction) var1).func_180764_b(), Action.START_SPRINTING) && !llIIlllIIIII(var3.func_180764_b(), Action.STOP_SPRINTING)) {
                if (llIIllIllllI(96671, 6663)) {
                    throw null;
                } else {
                    if (llIIllIlllII(var1 instanceof SPacketPlayerPosLook)) {
                        Class22. ((SPacketPlayerPosLook) var1, this.                                                                                                    .
                        field_71439_g.field_70177_z);
                        if (llIIllIllllI(96671, 6663)) {
                            throw null;
                        }

                        Class22. ((SPacketPlayerPosLook) var1, this.                                                                                                    .
                        field_71439_g.field_70125_A);
                        if (llIIllIllllI(96671, 6663)) {
                            throw null;
                        }
                    }

                    if (llIIllIllllI(96671, 6663)) {
                        throw null;
                    } else {
                        return true;
                    }
                }
            } else if (llIIllIllllI(96671, 6663)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        float var3;
        float var4;
        if (!llIIllIlllII((var3 = this..field_71439_g.field_191988_bg - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1)) ||
        llIIlllIIIIl((var4 = this..field_71439_g.field_70702_br - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))){
            if (llIIllIllllI(42876, 8363)) {
                throw null;
            }

            EntityPlayerSP var10000 = this.                                                                                                    .
            field_71439_g;
            var10000.field_70177_z = (float) ((double) var10000.field_70177_z + 1.0E-4D);
        }

        if (llIIllIllllI(42876, 8363)) {
            throw null;
        } else {
            boolean var2 = true;
        }
    }
}
