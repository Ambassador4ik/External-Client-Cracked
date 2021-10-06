import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Class184 extends Class171 {
    private static int 65166=-13318;
    private static int 9204=28488;
    private static int 91048=-6286;
    public ResourceLocation;
    private static int 88677=-32662;
    private static int 1852=13073;
    private static int 9058=32331;
    private static int 20187=-31724;
    private static int 6409=7123;
    private static int 4495=5330;
    private static int 27773=-27576;
    private static int 14439=-11812;
    private static int 7198=29367;
    public boolean;
    public Thread;
    private static int 79840=-27506;
    private static int 4837=2217;
    public World;
    private static int 61864=-12084;
    public Map;
    private static int 5612=31298;
    public NetworkPlayerInfo;
    public boolean;

    static {
        boolean var10000 = true;
    }

    public Class184() {
        String var10005 = Class60. ("Xo8hk:sv3Y|;x{40");
        if (llIIIllllIlI(27773, 9204)) {
            throw null;
        } else {
            super(var10005, 85, Class188.);
            if (llIIIllllIlI(27773, 9204)) {
                throw null;
            } else {
                ResourceLocation var1 = new ResourceLocation;
                String var10007 = Class60. ("x{h~1jr<");
                if (llIIIllllIlI(27773, 9204)) {
                    throw null;
                } else {
                    var1.<init> (var10007);
                    if (llIIIllllIlI(27773, 9204)) {
                        throw null;
                    } else {
                        this. = var1;
                        this. = true;
                        this. = true;
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llIIlIIIIIlI(Object var0) {
        return var0 == null;
    }

    private static boolean llIIIllllIlI(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llIIlIIIIlll(int var0) {
        return var0 == 0;
    }

    private static boolean llIIIlllllII(Object var0) {
        return var0 != null;
    }

    private static boolean llIIlIIIIllI(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean llIIIlllllll(int var0) {
        return var0 != 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        label92:
        while (!llIIIllllIlI(91048, 5612)) {
            boolean var10001;
            label90:
            for (Class184 var10000 = this; !llIIIllllIlI(91048, 5612); var10001 = true) {
                if (!llIIIlllllll(var10000. ())){
                    if (llIIIllllIlI(91048, 5612)) {
                        throw null;
                    }

                    boolean var4 = true;
                    return;
                }

                for (var10000 = this; !llIIIllllIlI(91048, 5612); var10001 = true) {
                    if (llIIIlllllII(var10000..player) &&llIIIlllllII(this..world) &&
                    !llIIlIIIIIlI(this..player.connection.getPlayerInfo(this..player.getGameProfile().getId())))
                    {
                        if (llIIIllllIlI(91048, 5612)) {
                            throw null;
                        }

                        if (llIIIlllllll(this.)) {
                            this. = this.                                                                                                    .
                            player.connection.getPlayerInfo(this..player.getGameProfile().getId());
                            if (llIIlIIIIIlI(this..getTextureManager().getTexture(this.))){
                                ThreadDownloadImageData var2 = new ThreadDownloadImageData;
                                String var10002 = Class60. ("snlk%53x`)!\"%/:ofmmy!hy4`{p~)jj<");
                                if (llIIIllllIlI(91048, 5612)) {
                                    throw null;
                                }

                                var2.<init> ((File) null, var10002, (ResourceLocation) null, (IImageBuffer) null);
                                if (llIIIllllIlI(91048, 5612)) {
                                    throw null;
                                }

                                ThreadDownloadImageData var1 = var2;
                                this.                                                                                                    .
                                getTextureManager().loadTexture(this., var1);
                            }

                            if (llIIIllllIlI(91048, 5612)) {
                                throw null;
                            }

                            this. = false;
                        }

                        if (llIIIllllIlI(91048, 5612)) {
                            throw null;
                        }

                        if (!llIIlIIIIllI(this., this..world) ||!llIIIlllllII(this..world) ||
                        !llIIIlllllll(this.. (1000)) ||!llIIlIIIIlll(this.)){
                        continue label92;
                    }

                        this. = this.                                                                                                    .
                        world;
                        this. = this.                                                                                                    .
                        player.connection.getPlayerInfo(this..player.getGameProfile().getId());
                        if (!llIIlIIIIlll(this. (Type.CAPE, this., this.                                                                                           )))
                        {
                            continue label92;
                        }

                        Class172 var5 = Class172.;
                        Class103 var3 = this.;
                        var10000 = this;
                        String var10003 = this. ();
                        String var10004 = Class60. ("Nxzd}*\u007fnw*tn\u007f~qy>");
                        if (llIIIllllIlI(91048, 5612)) {
                            throw null;
                        }

                        var3. (var5, var10003, var10004, 1500);
                        continue label90;
                    }

                    if (llIIIllllIlI(91048, 5612)) {
                        throw null;
                    }

                    var10000 = this;
                    this. = null;
                    this.                                                                                         .();
                }

                throw null;
            }

            throw null;
        }

        throw null;
    }

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(PlayerTickEvent var1) {
        if (llIIIlllllll(this.)) {
            Thread var10000 = new Thread(this::);
            if (llIIIllllIlI(20187, 7198)) {
                throw null;
            }

            this. = var10000;
            this.                                                                                         .start();
            this. = false;
        }

        if (llIIIllllIlI(20187, 7198)) {
            throw null;
        } else {
            boolean var2 = true;
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (llIIIllllIlI(88677, 4495)) {
            throw null;
        } else {
            this. = null;
            this. = true;
            boolean var10000 = true;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Type var1, NetworkPlayerInfo var2, ResourceLocation var3) {
        if (llIIlIIIIIlI(var2)) {
            return false;
        } else {
            boolean var8;
            try {
                if (llIIIllllIlI(61864, 4837)) {
                    throw null;
                }

                Field var4 = NetworkPlayerInfo.class.getDeclaredFields()[1];
                boolean var5 = var4.isAccessible();
                var4.setAccessible(true);
                this. = (Map) var4.get(var2);
                ConcurrentHashMap var10000 = new ConcurrentHashMap();
                if (llIIIllllIlI(61864, 4837)) {
                    throw null;
                }

                ConcurrentHashMap var6 = var10000;
                if (llIIIlllllII(this..get(Type.SKIN))){
                    var6.put(Type.SKIN, this..get(Type.SKIN));
                }

                if (llIIIllllIlI(61864, 4837)) {
                    throw null;
                }

                var6.put(var1, var3);
                var4.set(var2, var6);
                var4.setAccessible(var5);
                var8 = true;
            } catch (Exception var7) {
                if (llIIIllllIlI(61864, 4837)) {
                    throw null;
                }

                return false;
            }

            if (llIIIllllIlI(61864, 4837)) {
                throw null;
            } else {
                return var8;
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (llIIIllllIlI(65166, 6409)) {
            throw null;
        } else {
            Class184 var10000;
            if (llIIIlllllII(this.) && llIIIlllllII(this.)) {
                label56:
                {
                    boolean var4;
                    try {
                        if (llIIIllllIlI(65166, 6409)) {
                            throw null;
                        }

                        Field var1 = NetworkPlayerInfo.class.getDeclaredFields()[1];
                        boolean var2 = var1.isAccessible();
                        var1.setAccessible(true);
                        var1.set(this., this.);
                        var1.setAccessible(var2);
                    } catch (Exception var3) {
                        if (llIIIllllIlI(65166, 6409)) {
                            throw null;
                        }

                        var10000 = this;
                        var4 = true;
                        break label56;
                    }

                    if (llIIIllllIlI(65166, 6409)) {
                        throw null;
                    }

                    var10000 = this;
                    var4 = true;
                }
            } else {
                if (llIIIllllIlI(65166, 6409)) {
                    throw null;
                }

                var10000 = this;
                Class103 var10001 = this.;
                Class172 var10002 = Class172.;
                String var10003 = this. ();
                String var10004 = Class60. ("Nxzd}*\u007fnw*tn\u007f~qy>");
                if (llIIIllllIlI(65166, 6409)) {
                    throw null;
                }

                var10001. (var10002, var10003, var10004, 1500);
            }

            if (llIIIllllIlI(65166, 6409)) {
                throw null;
            } else {
                var10000. = true;
                boolean var5 = true;
            }
        }
    }
}
