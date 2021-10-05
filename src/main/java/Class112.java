import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.utils.CloneUtils;

@NotThreadSafe
public abstract class Class112 extends Class115 implements HttpEntityEnclosingRequest {
    private static int 67425=-1941;
    private static int 76921=-24630;
    private static int 83295=-28066;
    private static int 5849=21087;
    private static int 70785=-18671;
    private HttpEntity;
    private static int 82764=-21738;
    private static int 8158=26223;
    private static int 2357=30077;
    private static int 27535=-24725;
    private static int 1130=14862;
    private static int 90707=-29711;
    private static int 1224=4668;
    private static int 9162=24432;
    private static int 2130=4063;

    static {
        boolean var10000 = true;
    }

    public Class112() {
        if (llIlIIIIlllI(82764, 2357)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIlIIIlIIlI(int var0) {
        return var0 != 0;
    }

    private static boolean llIlIIIlIIII(Object var0) {
        return var0 != null;
    }

    private static boolean llIlIIIIlllI(int var0, int var1) {
        return var0 >= var1;
    }

    public HttpEntity getEntity() {
        return this.;
    }

    public void setEntity(HttpEntity var1) {
        this. = var1;
        boolean var10000 = true;
    }

    public boolean expectContinue() {
        String var10001 = Class60. ("_ci\u007f}/");
        if (llIlIIIIlllI(67425, 2130)) {
            throw null;
        } else {
            Header var1;
            if (llIlIIIlIIII(var1 = this.getFirstHeader(var10001))) {
                String var10000 = Class60. ("**(6|urozte>");
                if (llIlIIIIlllI(67425, 2130)) {
                    throw null;
                }

                if (llIlIIIlIIlI(var10000.equalsIgnoreCase(var1.getValue()))) {
                    return true;
                }
            }

            if (llIlIIIIlllI(67425, 2130)) {
                throw null;
            } else {
                return false;
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Object var10000 = super.clone();
        if (llIlIIIIlllI(90707, 1130)) {
            throw null;
        } else {
            Class112 var1 = (Class112) var10000;
            if (llIlIIIlIIII(this.)) {
                Object var10001 = CloneUtils.cloneObject(this.);
                if (llIlIIIIlllI(90707, 1130)) {
                    throw null;
                }

                var1. = (HttpEntity) var10001;
            }

            if (llIlIIIIlllI(90707, 1130)) {
                throw null;
            } else {
                return var1;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
