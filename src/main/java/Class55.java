import java.io.IOException;
import java.io.InputStream;

public class Class55 extends InputStream {
    private boolean;
    private int;
    private static int 50776=-30722;
    private static int 7651=28468;
    private boolean;
    private static int 3344=8779;
    private final boolean;
    private static int 96423=-9506;
    private final InputStream;
    private static int 7287=7062;
    private static int 9270=15645;
    private final int[];
    private static int 76753=-2207;
    private static int 9451=5543;
    private static int 67195=-22791;
    private static int 74164=-16118;
    private byte[];
    private static int 68389=-30887;
    private int;
    private static int 7254=13336;
    private static int 1988=32714;
    private int;
    private static int 40904=-29683;

    static {
        boolean var10000 = true;
    }

    public Class55(InputStream var1, int[] var2, boolean var3) {
        if (lllIIllllIII(40904, 1988)) {
            throw null;
        } else {
            this. = 0;
            this. = 18;
            this. = -8;
            this. = false;
            this. = false;
            this. = new byte[1];
            this. = var1;
            this. = var2;
            this. = var3;
            boolean var10000 = true;
        }
    }

    private static boolean lllIIlllllIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllIIllllllI(int var0) {
        return var0 > 0;
    }

    private static boolean lllIIllllIlI(int var0) {
        return var0 < 0;
    }

    private static boolean lllIIlllllII(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean lllIIllllIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIIlllIlll(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean lllIIllllIll(int var0) {
        return var0 >= 0;
    }

    private static boolean lllIIllllIIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllIIlllllll(int var0, int var1) {
        return var0 != var1;
    }

    public int read() throws IOException {
        if (lllIIlllIlll(this.read(this., 0, 1), -1)) {
            return -1;
        } else if (lllIIllllIII(67195, 9451)) {
            throw null;
        } else {
            return this.                                                                              [0] &255;
        }
    }

    public void close() throws IOException {
        if (lllIIlllllIl(this.)) {
            this. = true;
            this.                                                                                            .close();
        }

        if (lllIIllllIII(74164, 3344)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public int read(byte[] var1, int var2, int var3) throws IOException {
        IOException var8;
        String var14;
        if (lllIIllllIIl(this.)) {
            var8 = new IOException;
            var14 = Class60. ("Hnj~~w<r`:swxiq?");
            if (lllIIllllIII(68389, 7287)) {
                throw null;
            } else {
                var8.<init> (var14);
                if (lllIIllllIII(68389, 7287)) {
                    throw null;
                } else {
                    throw var8;
                }
            }
        } else if (lllIIllllIII(68389, 7287)) {
            throw null;
        } else if (lllIIllllIIl(this.) && lllIIllllIlI(this.)) {
            return -1;
        } else if (lllIIllllIII(68389, 7287)) {
            throw null;
        } else if (lllIIllllIll(var2) && lllIIllllIll(var3) && !lllIIlllllII(var3, var1.length - var2)) {
            if (lllIIllllIII(68389, 7287)) {
                throw null;
            } else {
                int var4 = var2;
                int var10001;
                byte var10002;
                if (lllIIllllIll(this.)) {
                    while (true) {
                        if (lllIIllllIII(68389, 7287)) {
                            throw null;
                        }

                        if (lllIIlllllIl(var3)) {
                            return var2 - var4;
                        }

                        if (lllIIllllIII(68389, 7287)) {
                            throw null;
                        }

                        var10001 = var2++;
                        var10002 = (byte) (this. >> this.);
                        --var3;
                        var1[var10001] = var10002;
                        this. -= 8;
                        if (lllIIllllIlI(this.)) {
                            this. = 0;
                            break;
                        }
                    }
                }

                label260:
                while (!lllIIllllIII(68389, 7287)) {
                    int var6 = var3;

                    while (!lllIIllllIII(68389, 7287)) {
                        if (lllIIllllllI(var6)) {
                            int var5;
                            boolean var9;
                            if (lllIIlllIlll(var5 = this..read(),-1)){
                                label292:
                                {
                                    this. = true;
                                    if (lllIIlllllll(this., 18)) {
                                        if (lllIIlllIlll(this., 12)) {
                                            var8 = new IOException;
                                            var14 = Class60.
                                            ("vTDQ\u0006\u0001\u0013GHGZUU\u0015SUW\u0015HZE\u0015VZ\u0001QJWGQNP4QvZwYzZ{\u0015}MlPu");
                                            if (lllIIllllIII(68389, 7287)) {
                                                throw null;
                                            }

                                            var8.<init> (var14);
                                            if (lllIIllllIII(68389, 7287)) {
                                                throw null;
                                            }

                                            throw var8;
                                        }

                                        if (lllIIllllIII(68389, 7287)) {
                                            throw null;
                                        }

                                        var10001 = var2++;
                                        var10002 = (byte) (this. >> 16);
                                        --var3;
                                        var1[var10001] = var10002;
                                        if (lllIIlllllIl(this.)) {
                                            if (lllIIlllllIl(var3)) {
                                                var6 = var2;
                                                this. >>= 8;
                                                this. = 0;
                                                var9 = true;
                                                break label292;
                                            }

                                            if (lllIIllllIII(68389, 7287)) {
                                                throw null;
                                            }

                                            var1[var2++] = (byte) (this. >> 8);
                                        }
                                    }

                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var6 = var2;
                                }

                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                if (lllIIlllIlll(var6, var4)) {
                                    return -1;
                                }

                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                return var2 - var4;
                            }

                            if (lllIIllllIII(68389, 7287)) {
                                throw null;
                            }

                            StringBuilder var10;
                            String var10004;
                            if (!lllIIlllIlll(var5, 61)) {
                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                if (!lllIIlllIlll(var5 = this.[var5],-1)){
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    this. |= var5 << this.;
                                    boolean var11;
                                    if (lllIIlllllIl(this.)) {
                                        this. = 18;
                                        this. = 16;

                                        do {
                                            if (lllIIllllIII(68389, 7287)) {
                                                throw null;
                                            }

                                            if (!lllIIllllIll(this.)) {
                                                if (lllIIllllIII(68389, 7287)) {
                                                    throw null;
                                                }

                                                this. = 0;
                                                var11 = true;
                                                continue label260;
                                            }

                                            int var13 = var2++;
                                            byte var12 = (byte) (this. >> this.);
                                            --var3;
                                            var1[var13] = var12;
                                            this. -= 8;
                                        } while (!lllIIlllllIl(var3) || !lllIIllllIll(this.));

                                        return var2 - var4;
                                    }

                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    this. -= 6;
                                    var11 = true;
                                    continue label260;
                                }

                                if (!lllIIllllIIl(this.)) {
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var8 = new IOException;
                                    var10 = new StringBuilder();
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var10004 = Class60. ("Jnlf`ch#ic{f96,`{cbbtvqq{");
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var10 = var10.insert(0, var10004);
                                    String var10003 = Integer.toString(var5, 16);
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var8.<init> (String.valueOf(var10.append(var10003)));
                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    throw var8;
                                }

                                var6 = var3;
                                var9 = true;
                                continue;
                            }

                            if (!lllIIlllllll(this., 18) || !lllIIlllllll(this., 12) || lllIIlllIlll(this., 6) && lllIIlllllll(this..read(),
                            61)){
                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                var8 = new IOException;
                                var10 = new StringBuilder();
                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                var10004 = Class60. ("Mikagdo$nd|a>1+aza~jw%`ampzj{`a");
                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                var8.<init> (String.valueOf(var10.insert(0, var10004).append(this.)));
                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                throw var8;
                            }

                            if (lllIIllllIII(68389, 7287)) {
                                throw null;
                            }

                            Class55 var7;
                            label300:
                            {
                                var10001 = var2++;
                                var10002 = (byte) (this. >> 16);
                                --var3;
                                var1[var10001] = var10002;
                                if (lllIIlllllIl(this.)) {
                                    if (lllIIlllllIl(var3)) {
                                        var7 = this;
                                        this. >>= 8;
                                        this. = 0;
                                        var9 = true;
                                        break label300;
                                    }

                                    if (lllIIllllIII(68389, 7287)) {
                                        throw null;
                                    }

                                    var1[var2++] = (byte) (this. >> 8);
                                }

                                if (lllIIllllIII(68389, 7287)) {
                                    throw null;
                                }

                                var7 = this;
                            }

                            if (lllIIllllIII(68389, 7287)) {
                                throw null;
                            }

                            var7. = true;
                            var6 = var2;
                            var9 = true;
                        } else {
                            if (lllIIllllIII(68389, 7287)) {
                                throw null;
                            }

                            var6 = var2;
                        }

                        if (lllIIllllIII(68389, 7287)) {
                            throw null;
                        }

                        return var6 - var4;
                    }

                    throw null;
                }

                throw null;
            }
        } else if (lllIIllllIII(68389, 7287)) {
            throw null;
        } else {
            IndexOutOfBoundsException var10000 = new IndexOutOfBoundsException();
            if (lllIIllllIII(68389, 7287)) {
                throw null;
            } else {
                throw var10000;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public int available() throws IOException {
        if (lllIIllllIIl(this.)) {
            IOException var10000 = new IOException;
            String var10002 = Class60. ("Hnj~~w<r`:swxiq?");
            if (lllIIllllIII(50776, 9270)) {
                throw null;
            } else {
                var10000.<init> (var10002);
                if (lllIIllllIII(50776, 9270)) {
                    throw null;
                } else {
                    throw var10000;
                }
            }
        } else if (lllIIllllIII(50776, 9270)) {
            throw null;
        } else {
            return this.                                                                                            .
            available();
        }
    }
}
