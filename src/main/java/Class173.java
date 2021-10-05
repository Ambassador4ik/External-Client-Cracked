import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.http.HttpRequest;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

public abstract class Class173 extends Class130 implements HttpRequest, Cloneable, HttpExecutionAware, AbortableHttpRequest {
    private static int 39350=-29808;
    private static int 8814=29465;
    private static int 9757=-10748;
    private static int 7012=14697;
    private static int 1167=11531;
    private static int 6861=8559;
    private static int 60741=-17307;
    private static int 192=18305;
    private static int 61403=-20379;
    private static int 8746=6158;
    private static int 92024=-9205;
    private Cancellable;
    private static int 9315=5326;
    private static int 82198=-6839;
    private static int 37617=-25023;
    private static int 8901=2018;
    private static int 17883=-27235;
    private Lock;
    private static int 17990=-3153;
    private static int 88062=-4800;
    private static int 8287=881;
    private static int 43153=-12104;
    private boolean;
    private static int 71261=-5576;
    private static int 318=10693;
    private static int 6245=5158;
    private static int 599=29063;

    static {
        boolean var10000 = true;
    }

    public Class173() {
        if (lllllIlIlIII(60741, 8746)) {
            throw null;
        } else {
            ReentrantLock var10001 = new ReentrantLock();
            if (lllllIlIlIII(60741, 8746)) {
                throw null;
            } else {
                this. = var10001;
                boolean var10000 = true;
            }
        }
    }

    private static boolean lllllIlIlIIl(Object var0) {
        return var0 != null;
    }

    private static boolean lllllIlIlIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllIlIIlll(int var0) {
        return var0 != 0;
    }

    private void ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        if (lllllIlIlIIl(this.)) {
            this.                                                                                            .cancel();
            this. = null;
        }

        if (lllllIlIlIII(17990, 8287)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setReleaseTrigger(ConnectionReleaseTrigger var1) {
        boolean var10000;
        if (lllllIlIIlll(this.)) {
            var10000 = true;
        } else if (lllllIlIlIII(43153, 318)) {
            throw null;
        } else {
            this.                                                                                  .lock();

            try {
                if (lllllIlIlIII(43153, 318)) {
                    throw null;
                }

                Class18 var10001 = new Class18(this, var1);
                if (lllllIlIlIII(43153, 318)) {
                    throw null;
                }

                this. = var10001;
            } catch (Throwable var3) {
                if (lllllIlIlIII(43153, 318)) {
                    throw null;
                }

                this.                                                                                  .unlock();
                throw var3;
            }

            if (lllllIlIlIII(43153, 318)) {
                throw null;
            } else {
                this.                                                                                  .unlock();
                var10000 = true;
            }
        }
    }

    public void reset() {
        this.                                                                                  .lock();

        try {
            if (lllllIlIlIII(71261, 7012)) {
                throw null;
            }

            this. ();
            if (lllllIlIlIII(71261, 7012)) {
                throw null;
            }

            this. = false;
        } catch (Throwable var3) {
            if (lllllIlIlIII(71261, 7012)) {
                throw null;
            }

            this.                                                                                  .unlock();
            throw var3;
        }

        if (lllllIlIlIII(71261, 7012)) {
            throw null;
        } else {
            this.                                                                                  .unlock();
            boolean var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean isAborted() {
        return this.;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setConnectionRequest(ClientConnectionRequest var1) {
        boolean var10000;
        if (lllllIlIIlll(this.)) {
            var10000 = true;
        } else if (lllllIlIlIII(61403, 9315)) {
            throw null;
        } else {
            this.                                                                                  .lock();

            try {
                if (lllllIlIlIII(61403, 9315)) {
                    throw null;
                }

                Class142 var10001 = new Class142(this, var1);
                if (lllllIlIlIII(61403, 9315)) {
                    throw null;
                }

                this. = var10001;
            } catch (Throwable var3) {
                if (lllllIlIlIII(61403, 9315)) {
                    throw null;
                }

                this.                                                                                  .unlock();
                throw var3;
            }

            if (lllllIlIlIII(61403, 9315)) {
                throw null;
            } else {
                this.                                                                                  .unlock();
                var10000 = true;
            }
        }
    }

    public void setCancellable(Cancellable var1) {
        boolean var10000;
        if (lllllIlIIlll(this.)) {
            var10000 = true;
        } else if (lllllIlIlIII(92024, 1167)) {
            throw null;
        } else {
            this.                                                                                  .lock();

            try {
                if (lllllIlIlIII(92024, 1167)) {
                    throw null;
                }

                this. = var1;
            } catch (Throwable var3) {
                if (lllllIlIlIII(92024, 1167)) {
                    throw null;
                }

                this.                                                                                  .unlock();
                throw var3;
            }

            if (lllllIlIlIII(92024, 1167)) {
                throw null;
            } else {
                this.                                                                                  .unlock();
                var10000 = true;
            }
        }
    }

    public void completed() {
        this.                                                                                  .lock();

        try {
            if (lllllIlIlIII(39350, 6245)) {
                throw null;
            }

            this. = null;
        } catch (Throwable var3) {
            if (lllllIlIlIII(39350, 6245)) {
                throw null;
            }

            this.                                                                                  .unlock();
            throw var3;
        }

        if (lllllIlIlIII(39350, 6245)) {
            throw null;
        } else {
            this.                                                                                  .unlock();
            boolean var10000 = true;
        }
    }

    public void abort() {
        boolean var10000;
        if (lllllIlIIlll(this.)) {
            var10000 = true;
        } else if (lllllIlIlIII(88062, 8814)) {
            throw null;
        } else {
            this.                                                                                  .lock();

            try {
                if (lllllIlIlIII(88062, 8814)) {
                    throw null;
                }

                this. = true;
                this. ();
                if (lllllIlIlIII(88062, 8814)) {
                    throw null;
                }
            } catch (Throwable var3) {
                if (lllllIlIlIII(88062, 8814)) {
                    throw null;
                }

                this.                                                                                  .unlock();
                throw var3;
            }

            if (lllllIlIlIII(88062, 8814)) {
                throw null;
            } else {
                this.                                                                                  .unlock();
                var10000 = true;
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Object var10000 = super.clone();
        if (lllllIlIlIII(37617, 599)) {
            throw null;
        } else {
            Class173 var1;
            Class173 var2 = var1 = (Class173) var10000;
            Object var10001 = CloneUtils.cloneObject(this.);
            if (lllllIlIlIII(37617, 599)) {
                throw null;
            } else {
                var2. = (HeaderGroup) var10001;
                var10001 = CloneUtils.cloneObject(this.);
                if (lllllIlIlIII(37617, 599)) {
                    throw null;
                } else {
                    var1. = (HttpParams) var10001;
                    ReentrantLock var10006 = new ReentrantLock();
                    if (lllllIlIlIII(37617, 599)) {
                        throw null;
                    } else {
                        var1. = var10006;
                        var1. = null;
                        var1. = false;
                        return var1;
                    }
                }
            }
        }
    }
}
