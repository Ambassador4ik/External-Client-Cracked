import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.PrintStream;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.network.play.server.SPacketResourcePackSend;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;

public class Class101 extends Class171 {
    private static int 820=27650;
    private static int 6916=8121;
    private static int 73294=-17100;
    private static int 58255=-14705;
    private static int 5841=1276;
    private static int 80301=-9762;
    private static int 2389=13987;
    private static int 64869=-13489;

    static {
        boolean var10000 = true;
    }

    public Class101() {
        String var10001 = Class60. ("]u8ix:yY3c`;vi4(");
        if (llIllllIIIlI(80301, 2389)) {
            throw null;
        } else {
            super(var10001, 32, Class188.);
            if (llIllllIIIlI(80301, 2389)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIllllIIlIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIllllIIIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIllllIIIll(int var0) {
        return var0 != 0;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (llIllllIIIll(var1 instanceof CPacketCustomPayload)) {
            PrintStream var10000 = System.out;
            String var10001 = Class60. ("48:9.5RGXTLPYF\u001f");
            if (llIllllIIIlI(58255, 5841)) {
                throw null;
            }

            var10000.println(var10001);
            CPacketCustomPayload var3;
            String var4 = (var3 = (CPacketCustomPayload) var1).getChannelName();
            var10001 = Class60. ("VYdYm{r?");
            if (llIllllIIIlI(58255, 5841)) {
                throw null;
            }

            if (llIllllIIIll(var4.equals(var10001))) {
                PacketBuffer var5 = new PacketBuffer;
                ByteBuf var10003 = Unpooled.buffer();
                if (llIllllIIIlI(58255, 5841)) {
                    throw null;
                }

                var5.<init> (var10003);
                if (llIllllIIIlI(58255, 5841)) {
                    throw null;
                }

                String var10002 = Class60. ("j|qutq:");
                if (llIllllIIIlI(58255, 5841)) {
                    throw null;
                }

                Class22. (var3, var5.writeString(var10002));
                if (llIllllIIIlI(58255, 5841)) {
                    throw null;
                }
            }
        }

        if (llIllllIIIlI(58255, 5841)) {
            throw null;
        } else if (llIllllIIlIl(var1 instanceof SPacketResourcePackSend) && llIllllIIlIl(var1 instanceof FMLProxyPacket) && llIllllIIlIl(var1 instanceof NetHandlerPlayClient)) {
            return true;
        } else if (llIllllIIIlI(58255, 5841)) {
            throw null;
        } else {
            return false;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
