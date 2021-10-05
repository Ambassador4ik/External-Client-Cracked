import java.io.Serializable;

import org.apache.http.NameValuePair;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Immutable
public class Class17 implements Cloneable, NameValuePair, Serializable {
    private static int 1800=15370;
    private static int 70601=-23343;
    private static int 42351=-22513;
    private static final long                                                                                                     =-6437800749411518984L;
    private static int 15908=-10233;
    private static int 5450=6985;
    private static int 66726=-776;
    private static int 2290=20876;
    private static int 6425=29474;
    private static int 463=27677;
    private static int 65260=-545;
    private final String;
    private static int 5651=29004;
    private final String;
    private static int 69567=-22711;
    private static int 46994=-28126;
    private static int 30242=-14653;
    private static int 30025=-27626;
    private static int 2536=6369;
    private static int 9908=30306;
    private static int 7783=15590;

    static {
        boolean var10000 = true;
    }

    public Class17(String var1, String var2) {
        if (lllIlIlIllll(15908, 2536)) {
            throw null;
        } else {
            String var10002 = Class60. ("U{u>");
            if (lllIlIlIllll(15908, 2536)) {
                throw null;
            } else {
                Object var10001 = Args.notNull(var1, var10002);
                if (lllIlIlIllll(15908, 2536)) {
                    throw null;
                } else {
                    this. = (String) var10001;
                    this. = var2;
                    boolean var10000 = true;
                }
            }
        }
    }

    private static boolean lllIlIllIIIl(Object var0) {
        return var0 == null;
    }

    private static boolean lllIlIllIIII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlIlIlllI(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean lllIlIlIllll(int var0, int var1) {
        return var0 >= var1;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public boolean equals(Object var1) {
        if (lllIlIlIlllI(this, var1)) {
            return true;
        } else if (lllIlIlIllll(46994, 5450)) {
            throw null;
        } else if (lllIlIllIIII(var1 instanceof NameValuePair)) {
            Class17 var2 = (Class17) var1;
            if (lllIlIllIIII(this..equals(var2.))){
                byte var10000 = LangUtils.equals(this., var2.);
                if (lllIlIlIllll(46994, 5450)) {
                    throw null;
                }

                if (lllIlIllIIII(var10000)) {
                    return true;
                }
            }

            if (lllIlIlIllll(46994, 5450)) {
                throw null;
            } else {
                return false;
            }
        } else if (lllIlIlIllll(46994, 5450)) {
            throw null;
        } else {
            return false;
        }
    }

    public String toString() {
        if (lllIlIllIIIl(this.)) {
            return this.;
        } else if (lllIlIlIllll(30025, 7783)) {
            throw null;
        } else {
            int var1 = this.                                                                                  .
            length() + 1 + this.                                                                                            .
            length();
            StringBuilder var10000 = new StringBuilder(var1);
            if (lllIlIlIllll(30025, 7783)) {
                throw null;
            } else {
                StringBuilder var2 = var10000;
                var10000.append(this.);
                String var10002 = Class60. ("f");
                if (lllIlIlIllll(30025, 7783)) {
                    throw null;
                } else {
                    var2.append(var10002);
                    var2.append(this.);
                    return String.valueOf(var2);
                }
            }
        }
    }

    public String getValue() {
        return this.;
    }

    public Object clone() throws CloneNotSupportedException {
        Object var10000 = super.clone();
        if (lllIlIlIllll(66726, 1800)) {
            throw null;
        } else {
            return var10000;
        }
    }

    public String getName() {
        return this.;
    }

    public int hashCode() {
        boolean var1 = true;
        int var10000 = LangUtils.hashCode(17, this.);
        if (lllIlIlIllll(69567, 6425)) {
            throw null;
        } else {
            var10000 = LangUtils.hashCode(var10000, this.);
            if (lllIlIlIllll(69567, 6425)) {
                throw null;
            } else {
                return var10000;
            }
        }
    }
}
