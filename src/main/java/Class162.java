import java.util.stream.IntStream;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class162 extends Class171 {
    public Class220;
    public String;
    private static int 5428=20356;
    private static int 3219=29250;
    private static int 8018=8891;
    private static int 29404=-1375;
    private static int 4919=845;
    private static int 20574=-32211;
    private static int 17320=-2515;
    public Class220;
    private static int 36445=-476;
    private static int 85558=-13672;
    private static int 4623=19181;
    private static int 25494=-22937;
    private static int 7441=28928;
    public Class220;
    private static int 71958=-7334;
    public Class220;
    private static int 5506=11305;
    private static int 30296=-16852;
    private static int 9819=-25315;
    private static int 3705=31551;
    private static int 9126=20610;
    private static int 29566=-5083;
    private static int 538=16304;

    static {
        boolean var10000 = true;
    }

    public Class162() {
        String var10008 = Class60. ("G|7s~5Vl<es4w|/");
        if (lllIlIlIIIII(85558, 7441)) {
            throw null;
        } else {
            super(var10008, 70, Class188.);
            if (lllIlIlIIIII(85558, 7441)) {
                throw null;
            } else {
                String var10006 = Class60. ("σ");
                if (lllIlIlIIIII(85558, 7441)) {
                    throw null;
                } else {
                    var10006 = Class123. (var10006);
                    if (lllIlIlIIIII(85558, 7441)) {
                        throw null;
                    } else {
                        this. = var10006;
                        Class220 var2 = new Class220;
                        var10008 = Class60. ("J|?pm=>");
                        if (lllIlIlIIIII(85558, 7441)) {
                            throw null;
                        } else {
                            var2.<init> (var10008, 169, this, 370.0D, 0.0D, 1000.0D, 5.0D, true);
                            if (lllIlIlIIIII(85558, 7441)) {
                                throw null;
                            } else {
                                this. = var2;
                                Class220 var10005 = new Class220;
                                String var10007 = Class60. ("Xx?py=\"");
                                if (lllIlIlIIIII(85558, 7441)) {
                                    throw null;
                                } else {
                                    var10005.<init> (var10007, 171, this, 590.0D, 0.0D, 1000.0D, 10.0D, true);
                                    if (lllIlIlIIIII(85558, 7441)) {
                                        throw null;
                                    } else {
                                        this. = var10005;
                                        Class220 var10004 = new Class220;
                                        var10006 = Class60. ("[u9nw;Q{2<");
                                        if (lllIlIlIIIII(85558, 7441)) {
                                            throw null;
                                        } else {
                                            var10004.<init> (var10006, 170, this, true);
                                            if (lllIlIlIIIII(85558, 7441)) {
                                                throw null;
                                            } else {
                                                this. = var10004;
                                                Class220 var10003 = new Class220;
                                                String var1 = Class60. ("Yc8k~:o(");
                                                if (lllIlIlIIIII(85558, 7441)) {
                                                    throw null;
                                                } else {
                                                    var10003.<init> (var1, 217, this, true);
                                                    if (lllIlIlIIIII(85558, 7441)) {
                                                        throw null;
                                                    } else {
                                                        this. = var10003;
                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                        this. ((Class220[]) (new Class220[]{this.}));
                                                        boolean var10000 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIlIIllllI(int var0, int var1) {
        return var0 > var1;
    }

    private static int ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var0) {
        return 1;
    }

    private static boolean lllIlIlIIIII(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllIlIlIIllI(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlIlIlIII(int var0, int var1) {
        return var0 < var1;
    }

    private static boolean lllIlIlIIlll(Object var0) {
        return var0 != null;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(GuiScreenEvent var1) {
        boolean var10000;
        if (lllIlIlIIllI(this. ())){
            var10000 = true;
        } else if (lllIlIlIIIII(29404, 5428)) {
            throw null;
        } else {
            String var10001 = String.valueOf(this. ());
            if (lllIlIlIIIII(29404, 5428)) {
                throw null;
            } else {
                this. (var10001);
                if (lllIlIlIIlll(var1.getGui()) && lllIlIlIIllI(var1.getGui() instanceof GuiEditSign)) {
                    this. ((long) this.. ());
                    this.                                                                                                    .
                    displayGuiScreen((GuiScreen) null);
                }

                if (lllIlIlIIIII(29404, 5428)) {
                    throw null;
                } else {
                    var10000 = true;
                }
            }
        }
    }

    public int _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        return this.                                                                                                    .
        world.loadedTileEntityList.stream().filter(this::).mapToInt(Class162::).sum();
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntitySign var1) {
        if (lllIlIIllllI(var1.signText[0].getFormattedText().length(), 16)) {
            return true;
        } else if (lllIlIlIIIII(20574, 5506)) {
            throw null;
        } else {
            return false;
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        CPacketUpdateSign var3;
        if (lllIlIlIIllI(var1 instanceof CPacketUpdateSign) && lllIlIlIIlll(var3 = (CPacketUpdateSign) var1)) {
            String[] var4 = new String[4];
            int var5;
            int var10000 = var5 = 0;

            while (true) {
                if (lllIlIlIIIII(25494, 3219)) {
                    throw null;
                }

                if (!lllIlIlIlIII(var10000, 4)) {
                    if (lllIlIlIIIII(25494, 3219)) {
                        throw null;
                    }

                    Class22. (var3, var4);
                    if (lllIlIlIIIII(25494, 3219)) {
                        throw null;
                    }
                    break;
                }

                String var6 = "";
                String var7;
                boolean var10001;
                if (lllIlIlIIllI(this.. ())){
                    var7 = Class123. (this.. ());
                    if (lllIlIlIIIII(25494, 3219)) {
                        throw null;
                    }

                    var10001 = true;
                } else{
                    if (lllIlIlIIIII(25494, 3219)) {
                        throw null;
                    }

                    IntStream var8 = IntStream.range(0, this.. ());
                    if (lllIlIlIIIII(25494, 3219)) {
                        throw null;
                    }

                    var7 = String.valueOf((StringBuilder) var8.mapToObj(this::).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append));
                }

                if (lllIlIlIIIII(25494, 3219)) {
                    throw null;
                }

                var6 = var7;
                int var9 = var5;
                String var10002 = var6.toString();
                ++var5;
                var4[var9] = var10002;
                var10000 = var5;
                var10001 = true;
            }
        }

        if (lllIlIlIIIII(25494, 3219)) {
            throw null;
        } else {
            boolean var10 = super. (var1, var2);
            if (lllIlIlIIIII(25494, 3219)) {
                throw null;
            } else {
                return var10;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private String ________________________________________________________________________________________________/* $FF was:                                                                                                 */(int var1) {
        return this.;
    }

    private boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(TileEntity var1) {
        if (lllIlIlIIllI(var1 instanceof TileEntitySign) && lllIlIlIIllI(this. ((TileEntitySign) var1))){
            return true;
        } else if (lllIlIlIIIII(9819, 4919)) {
            throw null;
        } else {
            return false;
        }
    }
}
