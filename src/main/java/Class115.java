import java.net.URI;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

@NotThreadSafe
public abstract class Class115 extends Class173 implements Configurable, HttpUriRequest {
    private static int 14755=-17519;
    private static int 89144=-20954;
    private static int 28575=-30504;
    private static int 7169=17884;
    private static int 98308=-12681;
    private static int 5907=13144;
    private static int 6832=31096;
    private static int 19205=-18540;
    private static int 306=28755;
    private static int 86267=-17039;
    private static int 9145=9369;
    private static int 71350=-20953;
    private ProtocolVersion;
    private RequestConfig;
    private static int 17368=-28003;
    private static int 145=16440;
    private static int 27953=-23640;
    private static int 3787=2984;
    private static int 66346=-26393;
    private static int 8784=19324;
    private static int 2007=20192;
    private static int 3711=20365;
    private static int 63083=-32013;
    private static int 5720=25905;
    private URI;
    private static int 7557=8571;
    private static int 69599=-507;
    private static int 7556=13221;
    private static int 3265=5465;
    private static int 20617=-28031;
    private static int 60760=-26479;

    static {
        boolean var10000 = true;
    }

    public Class115() {
        if (llIlIlllIIII(86267, 145)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIlIlllIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIlIlllIIIl(int var0) {
        return var0 == 0;
    }

    private static boolean llIlIllIllll(Object var0) {
        return var0 != null;
    }

    public RequestConfig getConfig() {
        return this.;
    }

    public void setConfig(RequestConfig var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public void releaseConnection() {
        this.reset();
        boolean var10000 = true;
    }

    public ProtocolVersion getProtocolVersion() {
        if (llIlIllIllll(this.)) {
            return this.;
        } else if (llIlIlllIIII(60760, 2007)) {
            throw null;
        } else {
            ProtocolVersion var10000 = HttpProtocolParams.getVersion(this.getParams());
            if (llIlIlllIIII(60760, 2007)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }

    public void setProtocolVersion(ProtocolVersion var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public URI getURI() {
        return this.;
    }

    public void setURI(URI var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public String toString() {
        StringBuilder var10000 = new StringBuilder();
        if (llIlIlllIIII(69599, 3787)) {
            throw null;
        } else {
            var10000 = var10000.insert(0, this.getMethod());
            String var10001 = Class60. ("{");
            if (llIlIlllIIII(69599, 3787)) {
                throw null;
            } else {
                var10000 = var10000.append(var10001).append(this.getURI());
                var10001 = Class60. ("{");
                if (llIlIlllIIII(69599, 3787)) {
                    throw null;
                } else {
                    return String.valueOf(var10000.append(var10001).append(this.getProtocolVersion()));
                }
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public RequestLine getRequestLine() {
        String var1 = this.getMethod();
        ProtocolVersion var2 = this.getProtocolVersion();
        URI var3 = this.getURI();
        String var4 = null;
        if (llIlIllIllll(var3)) {
            var4 = var3.toASCIIString();
        }

        if (llIlIlllIIII(14755, 306)) {
            throw null;
        } else {
            if (!llIlIllIllll(var4) || llIlIlllIIIl(var4.length())) {
                if (llIlIlllIIII(14755, 306)) {
                    throw null;
                }

                String var10000 = Class60. ("t");
                if (llIlIlllIIII(14755, 306)) {
                    throw null;
                }

                var4 = var10000;
            }

            if (llIlIlllIIII(14755, 306)) {
                throw null;
            } else {
                BasicRequestLine var5 = new BasicRequestLine(var1, var4, var2);
                if (llIlIlllIIII(14755, 306)) {
                    throw null;
                } else {
                    return var5;
                }
            }
        }
    }

    public void started() {
        boolean var10000 = true;
    }

    public abstract String getMethod();
}
