import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.ProtocolVersion;
import org.apache.http.params.HttpParams;

public interface Class52 {
    private int 47155=-22400;
    private int 9768=10776;
    private int 520=24595;
    private int 9571=23505;
    private int 8731=-1322;
    private int 4611=13176;
    private int 88083=-4816;
    private int 38031=-10644;
    private int 91806=-4285;
    private int 31955=-8997;
    private int 2350=2480;
    private int 6922=22652;
    private int 6389=10035;
    boolean   ​  ;
    private int 97611=-3956;
    private int 79890=-9450;
    private int 21809=-3676;
    private int 33468=-22373;
    private int 8028=2619;
    private int 671=28687;
    private int 3361=18579;
    private int 9072=23469;
    private int 8517=22159;
    private int 39269=-7934;
    private int 73181=-9116;
    private int 79876=-29932;
    private int 41708=-31237;
    private int 4198=5226;
    private int 50261=-4142;
    private int 9530=-18447;
    private int 42948=-8887;
    private int 5869=11846;
    private int 39479=-23220;
    private int 23614=-28476;
    private int 3368=3619;
    private int 1117=5914;
    private int 5155=14074;
    private int 7252=3166;
    private int 523=11516;

    static {
        boolean var10000 = true;
    }

    void removeHeaders(String var1);

    protected private final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    void removeHeader(Header var1);

    void setHeaders(Header[] var1);

    Header getLastHeader(String var1);

    boolean containsHeader(String var1);

    void setHeader(String var1, String var2);

    Header getFirstHeader(String var1);

    HeaderIterator headerIterator(String var1);

    HeaderIterator headerIterator();

    void addHeader(Header var1);

    Header[] getHeaders(String var1);

    Header[] getAllHeaders();

    void addHeader(String var1, String var2);

    /**
     * @deprecated
     */
    @Deprecated
    HttpParams getParams();

    /**
     * @deprecated
     */
    @Deprecated
    void setParams(HttpParams var1);

    void setHeader(Header var1);

    ProtocolVersion getProtocolVersion();
}
