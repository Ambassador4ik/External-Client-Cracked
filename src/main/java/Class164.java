import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

public class Class164 extends ChannelDuplexHandler {
    private static int 8079=9499;
    private static int 183=15466;
    private static int 27518=-16548;
    private static int 5125=29912;
    private static int 6799=10539;
    private static int 35058=-2898;
    private static int 48936=-20905;
    private static int 23206=-4283;
    private static int 38985=-6860;
    private static int 9742=10553;
    private Class165;

    static {
        boolean var10000 = true;
    }

    public Class164(Class165 var1) {
        if (lllllllllllI(38985, 9742)) {
            throw null;
        } else {
            this. = var1;

            Minecraft var10000;
            String var10001;
            boolean var4;
            try {
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                var10000 = Minecraft.func_71410_x();
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                ChannelPipeline var5 = var10000.func_147114_u().func_147298_b().channel().pipeline();
                var10001 = Class60. ("jzzq{oBrsuuvs)");
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                String var10002 = Class60. ("Gww|vbXvqrpr)");
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                var5.addBefore(var10001, var10002, this);
            } catch (Exception var2) {
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                var10000 = Minecraft.func_71410_x();
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                EntityPlayerSP var3 = var10000.field_71439_g;
                var10001 = Class60. ("Ytwt{xis}u+:Sigux;ft.zyncxish<");
                if (lllllllllllI(38985, 9742)) {
                    throw null;
                }

                var3.func_71165_d(var10001);
                var4 = true;
                return;
            }

            if (lllllllllllI(38985, 9742)) {
                throw null;
            } else {
                var4 = true;
            }
        }
    }

    private static boolean llllllllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllllllllllI(int var0, int var1) {
        return var0 >= var1;
    }

    public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
        boolean var10000;
        if (llllllllllIl(this.. (var2, Class170.                                                                                  )))
        {
            var10000 = true;
        } else if (lllllllllllI(23206, 5125)) {
            throw null;
        } else {
            super.channelRead(var1, var2);
            if (lllllllllllI(23206, 5125)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
        boolean var10000;
        if (llllllllllIl(this.. (var2, Class170.                                                                                                   )))
        {
            var10000 = true;
        } else if (lllllllllllI(35058, 183)) {
            throw null;
        } else {
            super.write(var1, var2, var3);
            if (lllllllllllI(35058, 183)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }
}
