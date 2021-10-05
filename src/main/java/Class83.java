import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;

@NotThreadSafe
public class Class83 extends StringEntity {
    private static int 8080=13982;
    private static int 2584=14814;
    private static int 1981=8653;
    private static int 62350=-29174;
    private static int 3981=16083;
    private static int 339=5569;
    private static int 73243=-14895;
    private static int 56939=-9226;
    private static int 66432=-11949;
    private static int 21064=-29396;
    private static int 82690=-6174;
    private static int 1013=3334;

    static {
        boolean var10000 = true;
    }

    public Class83(Iterable var1) {
        this((Iterable) var1, (Charset) null);
        if (lllIlIIIIIIl(21064, 8080)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public Class83(List var1) throws UnsupportedEncodingException {
        this((Iterable) var1, (Charset) ((Charset) null));
        if (lllIlIIIIIIl(73243, 2584)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public Class83(List var1, String var2) throws UnsupportedEncodingException {
        String var10002;
        if (lllIlIIIIIlI(var2)) {
            var10002 = var2;
            boolean var10003 = true;
        } else {
            if (lllIlIIIIIIl(66432, 1981)) {
                throw null;
            }

            var10002 = HTTP.DEF_CONTENT_CHARSET.name();
        }

        if (lllIlIIIIIIl(66432, 1981)) {
            throw null;
        } else {
            String var10001 = URLEncodedUtils.format(var1, var10002);
            if (lllIlIIIIIIl(66432, 1981)) {
                throw null;
            } else {
                var10002 = Class60. ("ZJHWVY]OZU^\u0014O\u0017CL\\\u0017NT]W\u0001NQVEUDU@^?");
                if (lllIlIIIIIIl(66432, 1981)) {
                    throw null;
                } else {
                    ContentType var3 = ContentType.create(var10002, var2);
                    if (lllIlIIIIIIl(66432, 1981)) {
                        throw null;
                    } else {
                        super(var10001, var3);
                        if (lllIlIIIIIIl(66432, 1981)) {
                            throw null;
                        } else {
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    public Class83(Iterable var1, Charset var2) {
        Charset var10002;
        if (lllIlIIIIIlI(var2)) {
            var10002 = var2;
            boolean var10003 = true;
        } else {
            if (lllIlIIIIIIl(56939, 3981)) {
                throw null;
            }

            var10002 = HTTP.DEF_CONTENT_CHARSET;
        }

        if (lllIlIIIIIIl(56939, 3981)) {
            throw null;
        } else {
            String var10001 = URLEncodedUtils.format(var1, var10002);
            if (lllIlIIIIIIl(56939, 3981)) {
                throw null;
            } else {
                String var3 = Class60. ("ZJHWVY]OZU^\u0014O\u0017CL\\\u0017NT]W\u0001NQVEUDU@^?");
                if (lllIlIIIIIIl(56939, 3981)) {
                    throw null;
                } else {
                    ContentType var4 = ContentType.create(var3, var2);
                    if (lllIlIIIIIIl(56939, 3981)) {
                        throw null;
                    } else {
                        super(var10001, var4);
                        if (lllIlIIIIIIl(56939, 3981)) {
                            throw null;
                        } else {
                            boolean var10000 = true;
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIlIIIIIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIIIIIlI(Object var0) {
        return var0 != null;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
