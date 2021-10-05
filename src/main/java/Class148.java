import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Class148 extends FilterOutputStream {
    private final boolean;
    private static int 2675=22740;
    private final char[];
    private static int 27496=-28809;
    private int;
    private final int;
    private int;
    private boolean;
    private static int 6256=21731;
    private static int 89554=-15185;
    private static int 7759=4789;
    private final byte[];
    private static int 84851=-29188;
    private static int 8740=3408;
    private static int 1371=6876;
    private static int 12994=-18538;
    private static int 12992=-23770;
    private int;
    private int;
    private int;
    private static int 8139=13933;
    private static int 28073=-18327;
    private static int 184=6128;
    private static int 79421=-28419;

    static {
        boolean var10000 = true;
    }

    public Class148(OutputStream var1, char[] var2, byte[] var3, int var4, boolean var5) {
        super(var1);
        if (llllIlllIllI(79421, 7759)) {
            throw null;
        } else {
            this. = 0;
            this. = false;
            this. = 0;
            this. = var2;
            this. = var3;
            this. = var4;
            this. = var5;
            boolean var10000 = true;
        }
    }

    private static boolean llllIlllIlIl(int var0, int var1) {
        return var0 == var1;
    }

    private static boolean llllIlllllIl(int var0, int var1) {
        return var0 > var1;
    }

    private static boolean llllIlllIllI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIlllllII(int var0) {
        return var0 >= 0;
    }

    private static boolean llllIllllIll(int var0) {
        return var0 != 0;
    }

    private static boolean llllIlllllll(int var0) {
        return var0 > 0;
    }

    private static boolean llllIllllllI(int var0) {
        return var0 == 0;
    }

    public void close() throws IOException {
        if (llllIllllllI(this.)) {
            Class148 var10000;
            label49:
            {
                this. = true;
                if (llllIlllIlIl(this., 1)) {
                    this. ();
                    if (llllIlllIllI(89554, 6256)) {
                        throw null;
                    }

                    this.out.write(this.[this. >> 2]);
                    this.out.write(this.[this. << 4 & 63]);
                    if (llllIllllIll(this.)) {
                        var10000 = this;
                        this.out.write(61);
                        this.out.write(61);
                        boolean var10001 = true;
                        break label49;
                    }
                } else {
                    if (llllIlllIllI(89554, 6256)) {
                        throw null;
                    }

                    if (llllIlllIlIl(this., 2)) {
                        this. ();
                        if (llllIlllIllI(89554, 6256)) {
                            throw null;
                        }

                        this.out.write(this.[this. >> 2]);
                        this.out.write(this.[this. << 4 & 63 | this. >> 4]);
                        this.out.write(this.[this. << 2 & 63]);
                        if (llllIllllIll(this.)) {
                            this.out.write(61);
                        }
                    }
                }

                if (llllIlllIllI(89554, 6256)) {
                    throw null;
                }

                var10000 = this;
            }

            if (llllIlllIllI(89554, 6256)) {
                throw null;
            }

            var10000. = 0;
            this.out.close();
        }

        if (llllIlllIllI(89554, 6256)) {
            throw null;
        } else {
            boolean var1 = true;
        }
    }

    public void write(byte[] var1, int var2, int var3) throws IOException {
        if (llllIllllIll(this.)) {
            IOException var9 = new IOException;
            String var10002 = Class60. ("Hnj~~w<r`:swxiq?");
            if (llllIlllIllI(12994, 184)) {
                throw null;
            } else {
                var9.<init> (var10002);
                if (llllIlllIllI(12994, 184)) {
                    throw null;
                } else {
                    throw var9;
                }
            }
        } else if (llllIlllIllI(12994, 184)) {
            throw null;
        } else if (llllIlllllII(var2) && llllIlllllII(var3) && !llllIlllllIl(var3, var1.length - var2)) {
            if (llllIlllIllI(12994, 184)) {
                throw null;
            } else {
                boolean var6;
                if (llllIllllllI(var3)) {
                    var6 = true;
                } else if (llllIlllIllI(12994, 184)) {
                    throw null;
                } else {
                    int var7;
                    if (llllIllllIll(this.)) {
                        if (llllIlllIlIl(this., 1)) {
                            byte var10001 = var1[var2];
                            --var3;
                            var7 = var10001 & 255;
                            ++var2;
                            this. = var7;
                            if (llllIllllllI(var3)) {
                                ++this.;
                                var6 = true;
                                return;
                            }
                        }

                        if (llllIlllIllI(12994, 184)) {
                            throw null;
                        }

                        byte var10007 = var1[var2];
                        --var3;
                        int var10 = var10007 & 255;
                        ++var2;
                        this. = var10;
                        this. ();
                        if (llllIlllIllI(12994, 184)) {
                            throw null;
                        }

                        this.out.write(this.[this. >> 2]);
                        this.out.write(this.[this. << 4 & 63 | this. >> 4]);
                        this.out.write(this.[this. << 2 & 63 | this. >> 6]);
                        this.out.write(this.[this. & 63]);
                        this. += 4;
                    }

                    if (llllIlllIllI(12994, 184)) {
                        throw null;
                    } else {
                        int var4 = var3 / 3;
                        int var5 = var4;

                        boolean var8;
                        for (this. = var3 - var4 * 3; !llllIlllIllI(12994, 184); var8 = true) {
                            --var4;
                            if (!llllIlllllll(var5)) {
                                if (llllIlllIllI(12994, 184)) {
                                    throw null;
                                }

                                if (llllIlllIlIl(this., 1)) {
                                    var7 = var1[var2] & 255;
                                    ++var2;
                                    this. = var7;
                                    var6 = true;
                                    return;
                                }

                                if (llllIlllIllI(12994, 184)) {
                                    throw null;
                                }

                                if (llllIlllIlIl(this., 2)) {
                                    int var10003 = var1[var2] & 255;
                                    ++var2;
                                    this. = var10003;
                                    var7 = var1[var2] & 255;
                                    ++var2;
                                    this. = var7;
                                }

                                if (llllIlllIllI(12994, 184)) {
                                    throw null;
                                }

                                var6 = true;
                                return;
                            }

                            int var10004 = var2++;
                            this. ();
                            if (llllIlllIllI(12994, 184)) {
                                throw null;
                            }

                            var10004 = (var1[var10004] & 255) << 16;
                            int var10005 = var1[var2] & 255;
                            ++var2;
                            var10004 |= var10005 << 8;
                            var10005 = var1[var2] & 255;
                            ++var2;
                            var3 = var10004 | var10005;
                            this.out.write(this.[var3 >>> 18 & 63]);
                            this.out.write(this.[var3 >>> 12 & 63]);
                            this.out.write(this.[var3 >>> 6 & 63]);
                            this.out.write(this.[var3 & 63]);
                            this. += 4;
                            var5 = var4;
                        }

                        throw null;
                    }
                }
            }
        } else if (llllIlllIllI(12994, 184)) {
            throw null;
        } else {
            ArrayIndexOutOfBoundsException var10000 = new ArrayIndexOutOfBoundsException();
            if (llllIlllIllI(12994, 184)) {
                throw null;
            } else {
                throw var10000;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() throws IOException {
        if (llllIlllIlIl(this., this.)) {
            this.out.write(this.);
            this. = 0;
        }

        if (llllIlllIllI(27496, 8740)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public void write(int var1) throws IOException {
        byte[] var2 = new byte[]{(byte) (var1 & 255)};
        this.write(var2, 0, 1);
        boolean var10000 = true;
    }
}
