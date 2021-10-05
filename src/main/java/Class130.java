import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@NotThreadSafe
public abstract class Class130 implements Class52 {
    private static int 12480=-24614;
    private static int 24621=-3054;
    private static int 5665=8628;
    private static int 18396=-11356;
    private static int 2968=5156;
    private static int 57420=-27547;
    private static int 86935;
    private static int 72270=-31116;
    private static int 7687=14079;
    private static int 67438=-5289;
    /** @deprecated */
    @Deprecated
    public HttpParams;
    private static int 4858=110;
    private static int 6914=31551;
    private static int 22817=-22843;
    private static int 42125=-19386;
    private static int 4265=4373;
    private static int 45843=-9523;
    private static int 6918=26285;
    public HeaderGroup;
    private static int 37157=-30084;
    private static int 69253=-20202;
    private static int 4597=20658;
    private static int 8786=23794;
    private static int 6315=26777;
    private static int 1442=27360;
    private static int 37212=-23955;
    private static int 40746=-15176;
    private static int 2260=14765;
    private static int 64535=-4295;
    private static int 6013=30628;
    private static int 1299=17380;
    private static int 2219;
    private static int 8786=23794;
    private static int 59201=-14191;
    private static int 7314=32311;
    private static int 9898=-31555;
    private static int 4159=10479;
    private static int 56502=-32242;
    private static int 11569=-27891;
    private static int 19254=-10492;
    private static int 4821=18505;
    private static int 38499=-29722;
    private static int 127=3836;
    private static int 4651=19468;
    private static int 94033=-26051;
    private static int 765=12509;

    static {
        8786 = 26987;
        86935 = -12548;
        2219 = 10844;
        boolean var10000 = true;
    }

    public Class130() {
        this((HttpParams) null);
        if (llIIlIlllIll(40746, 8786)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Class130(HttpParams var1) {
        if (llIIlIlllIll(37157, 4651)) {
            throw null;
        } else {
            HeaderGroup var10003 = new HeaderGroup();
            if (llIIlIlllIll(37157, 4651)) {
                throw null;
            } else {
                this. = var10003;
                this. = var1;
                boolean var10000 = true;
            }
        }
    }

    private static boolean llIIlIllllIl(int var0) {
        return var0 != 0;
    }

    private static boolean llIIlIllllII(Object var0) {
        return var0 == null;
    }

    private static boolean llIIlIlllIll(int var0, int var1) {
        return var0 >= var1;
    }

    public HeaderIterator headerIterator() {
        return this.                                                                                  .iterator();
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(String var1, String var2) {
        String var10000 = Class77. (var1);
        if (llIIlIlllIll(86935, 2219)) {
            throw null;
        } else {
            var1 = var10000;
            String var10001 = Class60. ("Xtrtqc7~y|>");
            if (llIIlIlllIll(86935, 2219)) {
                throw null;
            } else {
                Args.notNull(var10000, var10001);
                if (llIIlIlllIll(86935, 2219)) {
                    throw null;
                } else {
                    HeaderGroup var4 = this.;
                    BasicHeader var10002 = new BasicHeader(var1, var2);
                    if (llIIlIlllIll(86935, 2219)) {
                        throw null;
                    } else {
                        var4.updateHeader(var10002);
                        boolean var3 = true;
                    }
                }
            }
        }
    }

    public void removeHeaders(String var1) {
        boolean var10000;
        if (llIIlIllllII(var1)) {
            var10000 = true;
        } else if (llIIlIlllIll(37212, 2260)) {
            throw null;
        } else {
            HeaderIterator var2 = this.                                                                                  .
            iterator();

            while (!llIIlIlllIll(37212, 2260)) {
                if (!llIIlIllllIl(var2.hasNext())) {
                    if (llIIlIlllIll(37212, 2260)) {
                        throw null;
                    }

                    var10000 = true;
                    return;
                }

                Header var3 = var2.nextHeader();
                if (llIIlIllllIl(var1.equalsIgnoreCase(var3.getName()))) {
                    var2.remove();
                    var10000 = true;
                }
            }

            throw null;
        }
    }

    public void setHeader(String var1, String var2) {
        String var10001 = Class60. ("Xtrtqc7~y|>");
        if (llIIlIlllIll(64535, 6914)) {
            throw null;
        } else {
            Args.notNull(var1, var10001);
            if (llIIlIlllIll(64535, 6914)) {
                throw null;
            } else {
                HeaderGroup var3 = this.;
                BasicHeader var10002 = new BasicHeader(var1, var2);
                if (llIIlIlllIll(64535, 6914)) {
                    throw null;
                } else {
                    var3.updateHeader(var10002);
                    boolean var10000 = true;
                }
            }
        }
    }

    public void addHeader(String var1, String var2) {
        String var10001 = Class60. ("Xtrtqc7~y|>");
        if (llIIlIlllIll(24621, 6013)) {
            throw null;
        } else {
            Args.notNull(var1, var10001);
            if (llIIlIlllIll(24621, 6013)) {
                throw null;
            } else {
                HeaderGroup var3 = this.;
                BasicHeader var10002 = new BasicHeader(var1, var2);
                if (llIIlIlllIll(24621, 6013)) {
                    throw null;
                } else {
                    var3.addHeader(var10002);
                    boolean var10000 = true;
                }
            }
        }
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1, String var2) {
        String var10000 = Class77. (var1);
        if (llIIlIlllIll(9898, 2968)) {
            throw null;
        } else {
            var1 = var10000;
            var10000 = Class77. (var2);
            if (llIIlIlllIll(9898, 2968)) {
                throw null;
            } else {
                var2 = var10000;
                String var10001 = Class60. ("Xtrtqc7~y|>");
                if (llIIlIlllIll(9898, 2968)) {
                    throw null;
                } else {
                    Args.notNull(var1, var10001);
                    if (llIIlIlllIll(9898, 2968)) {
                        throw null;
                    } else {
                        HeaderGroup var4 = this.;
                        BasicHeader var10002 = new BasicHeader(var1, var2);
                        if (llIIlIlllIll(9898, 2968)) {
                            throw null;
                        } else {
                            var4.updateHeader(var10002);
                            boolean var3 = true;
                        }
                    }
                }
            }
        }
    }

    public Header getLastHeader(String var1) {
        return this.                                                                                  .
        getLastHeader(var1);
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void addHeader(Header var1) {
        this.                                                                                  .addHeader(var1);
        boolean var10000 = true;
    }

    public HeaderIterator headerIterator(String var1) {
        return this.                                                                                  .iterator(var1);
    }

    public Header[] getAllHeaders() {
        return this.                                                                                  .getAllHeaders();
    }

    public boolean containsHeader(String var1) {
        return this.                                                                                  .
        containsHeader(var1);
    }

    public Header[] getHeaders(String var1) {
        return this.                                                                                  .getHeaders(var1);
    }

    public void removeHeader(Header var1) {
        this.                                                                                  .removeHeader(var1);
        boolean var10000 = true;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public HttpParams getParams() {
        if (llIIlIllllII(this.)) {
            BasicHttpParams var10001 = new BasicHttpParams();
            if (llIIlIlllIll(67438, 7687)) {
                throw null;
            }

            this. = var10001;
        }

        if (llIIlIlllIll(67438, 7687)) {
            throw null;
        } else {
            return this.;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setParams(HttpParams var1) {
        String var10002 = Class60. ("\\ACD0erf}xz`}g(");
        if (llIIlIlllIll(72270, 6315)) {
            throw null;
        } else {
            Object var10001 = Args.notNull(var1, var10002);
            if (llIIlIlllIll(72270, 6315)) {
                throw null;
            } else {
                this. = (HttpParams) var10001;
                boolean var10000 = true;
            }
        }
    }

    public Header getFirstHeader(String var1) {
        return this.                                                                                  .
        getFirstHeader(var1);
    }

    public void setHeader(Header var1) {
        this.                                                                                  .updateHeader(var1);
        boolean var10000 = true;
    }

    public void setHeaders(Header[] var1) {
        this.                                                                                  .setHeaders(var1);
        boolean var10000 = true;
    }
}
