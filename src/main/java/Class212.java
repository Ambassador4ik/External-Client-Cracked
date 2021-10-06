import com.google.common.collect.Lists;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class Class212 extends Class171 {
    public Class220;
    public EntityLivingBase;
    public Class220;
    public Class220;
    private static int 531=19916;
    private static int 998=14659;
    public Class89;
    private static int 7854=28123;
    public Class220;
    public Class220;
    public Class220;
    private static int 33410=-30387;
    private static int 86758=-25290;
    private static int 94617=-29708;
    private static int 7551=13107;
    private static int 54=2461;
    public ResourceLocation;
    public Class220;
    private static int 76693=-29096;
    private static int 54562=-4191;

    static {
        boolean var10000 = true;
    }

    public Class212() {
        String var10011 = Class60. ("Cw4et6uc?^i7?");
        if (llllIIIIIIIl(76693, 54)) {
            throw null;
        } else {
            super(var10011, 78, Class188.);
            if (llllIIIIIIIl(76693, 54)) {
                throw null;
            } else {
                ResourceLocation var7 = new ResourceLocation;
                String var10013 = Class60. ("UPU]_K^^D\u0003G]LMBJMJ\u0004]BMFLY\u0016PLAOB\u0016hW<");
                if (llllIIIIIIIl(76693, 54)) {
                    throw null;
                } else {
                    var7.<init> (var10013);
                    if (llllIIIIIIIl(76693, 54)) {
                        throw null;
                    } else {
                        this. = var7;
                        Class89 var10010 = new Class89(1.0F);
                        if (llllIIIIIIIl(76693, 54)) {
                            throw null;
                        } else {
                            this. = var10010;
                            Class220 var10009 = new Class220;
                            var10011 = Class60. ("\u0003");
                            if (llllIIIIIIIl(76693, 54)) {
                                throw null;
                            } else {
                                var10009.<init> (var10011, 181, this, 10.0D, -100.0D, 100.0D, true);
                                if (llllIIIIIIIl(76693, 54)) {
                                    throw null;
                                } else {
                                    this. = var10009;
                                    Class220 var10008 = new Class220;
                                    String var6 = Class60. ("\u0002");
                                    if (llllIIIIIIIl(76693, 54)) {
                                        throw null;
                                    } else {
                                        var10008.<init> (var6, 182, this, 10.0D, -100.0D, 100.0D, true);
                                        if (llllIIIIIIIl(76693, 54)) {
                                            throw null;
                                        } else {
                                            this. = var10008;
                                            Class220 var10007 = new Class220;
                                            String var5 = Class60. ("]o?qw=)");
                                            if (llllIIIIIIIl(76693, 54)) {
                                                throw null;
                                            } else {
                                                var10007.<init> (var5, 183, this, true);
                                                if (llllIIIIIIIl(76693, 54)) {
                                                    throw null;
                                                } else {
                                                    this. = var10007;
                                                    Class220 var10006 = new Class220;
                                                    String var4 = Class60. ("_}9|{;~:f(");
                                                    if (llllIIIIIIIl(76693, 54)) {
                                                        throw null;
                                                    } else {
                                                        var10006.<init> (var4, 184, this, false);
                                                        if (llllIIIIIIIl(76693, 54)) {
                                                            throw null;
                                                        } else {
                                                            this. = var10006;
                                                            Class220 var10005 = new Class220;
                                                            String var3 = Class60. ("Dw4cfd0vk\u007f<x5");
                                                            if (llllIIIIIIIl(76693, 54)) {
                                                                throw null;
                                                            } else {
                                                                var10005.<init> (var3, 185, this, false);
                                                                if (llllIIIIIIIl(76693, 54)) {
                                                                    throw null;
                                                                } else {
                                                                    this. = var10005;
                                                                    Class220 var10004 = new Class220;
                                                                    String var2 = Class60. ("Yq<p?");
                                                                    if (llllIIIIIIIl(76693, 54)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10004.<init> (var2, 186, this, false);
                                                                        if (llllIIIIIIIl(76693, 54)) {
                                                                            throw null;
                                                                        } else {
                                                                            this. = var10004;
                                                                            Class220 var10003 = new Class220;
                                                                            String var1 = Class60. ("Tx3c`1v~8b>");
                                                                            if (llllIIIIIIIl(76693, 54)) {
                                                                                throw null;
                                                                            } else {
                                                                                var10003.<init> (var1, 187, this, false)
                                                                                ;
                                                                                if (llllIIIIIIIl(76693, 54)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    this. = var10003;
                                                                                    this.
                                                                                    ((Class220[]) (new Class220[]{this.}));
                                                                                    this.
                                                                                    ((Class220[]) (new Class220[]{this.}));
                                                                                    this.
                                                                                    ((Class220[]) (new Class220[]{this.}));
                                                                                    this.
                                                                                    ((Class220[]) (new Class220[]{this.}));
                                                                                    this.                                                                                     .
                                                                                    (true);
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
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llllIIIIIIlI(int var0, int var1) {
        return var0 <= var1;
    }

    private static boolean llllIIIIIIIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIIIIIIII(int var0) {
        return var0 != 0;
    }

    private static boolean lllIlllllllI(Object var0) {
        return var0 != null;
    }

    private static boolean lllIllllllll(int var0) {
        return var0 == 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(RenderGameOverlayEvent var1) {
        this. = this.                                                                                                    .
        player.getLastAttackedEntity();
        if (lllIlllllllI(Class122.) && (!lllIllllllll(Class122. instanceof EntityPlayer) || llllIIIIIIII(Class122. instanceof EntityArmorStand))) {
            if (llllIIIIIIIl(33410, 7551)) {
                throw null;
            }

            this. = Class122.;
        }

        if (llllIIIIIIIl(33410, 7551)) {
            throw null;
        } else {
            EntityPlayer var10001 = Class13. ((Entity) this.);
            if (llllIIIIIIIl(33410, 7551)) {
                throw null;
            } else {
                EntityPlayer var2 = var10001;
                if (llllIIIIIIII(this. instanceof EntityArmorStand) && lllIlllllllI(var2)) {
                    this. = var2;
                }

                if (llllIIIIIIIl(33410, 7551)) {
                    throw null;
                } else {
                    boolean var10000;
                    if (lllIlllllllI(this.) && !lllIllllllll(this. instanceof EntityPlayer)) {
                        if (llllIIIIIIIl(33410, 7551)) {
                            throw null;
                        } else {
                            ScaledResolution var25 = var1.getResolution();
                            int var10 = var25.getScaledWidth() / 2 + this.                                                                                            .
                            ();
                            int var11 = var25.getScaledHeight() / 2 + this.                                                                                  .
                            ();
                            byte var3 = 20;
                            int var4;
                            int var26;
                            boolean var27;
                            if (llllIIIIIIlI(var4 = 20 + this.. (this..getName())+2, 90)){
                                var26 = 90;
                                var27 = true;
                            } else{
                                if (llllIIIIIIIl(33410, 7551)) {
                                    throw null;
                                }

                                var26 = var4;
                            }

                            if (llllIIIIIIIl(33410, 7551)) {
                                throw null;
                            } else {
                                int var5 = var26;
                                byte var15 = 28;
                                this.                                                                                           .
                                ((double) (var10 - 1), (double) (var11 - 1), (double) (var5 + 2), (double) var15, 2.0D, Class73.                                                                                                  )
                                ;
                                ResourceLocation var28 = this.;
                                ResourceLocation var29 = AbstractClientPlayer.getLocationSkin(this..getName());
                                if (llllIIIIIIIl(33410, 7551)) {
                                    throw null;
                                } else {
                                    if (lllIllllllll(var28.equals(var29))) {
                                        Class212 var30;
                                        label305:
                                        {
                                            try {
                                                if (llllIIIIIIIl(33410, 7551)) {
                                                    throw null;
                                                }

                                                var28 = AbstractClientPlayer.getLocationSkin(this..getName());
                                                if (llllIIIIIIIl(33410, 7551)) {
                                                    throw null;
                                                }

                                                ThreadDownloadImageData var31 = AbstractClientPlayer.getDownloadImageSkin(var28, this..getName())
                                                ;
                                                if (llllIIIIIIIl(33410, 7551)) {
                                                    throw null;
                                                }

                                                var31.loadTexture(this..getResourceManager());
                                            } catch (Exception var9) {
                                                if (llllIIIIIIIl(33410, 7551)) {
                                                    throw null;
                                                }

                                                var30 = this;
                                                break label305;
                                            }

                                            if (llllIIIIIIIl(33410, 7551)) {
                                                throw null;
                                            }

                                            var30 = this;
                                            var27 = true;
                                        }

                                        if (llllIIIIIIIl(33410, 7551)) {
                                            throw null;
                                        }

                                        var29 = AbstractClientPlayer.getLocationSkin(this..getName());
                                        if (llllIIIIIIIl(33410, 7551)) {
                                            throw null;
                                        }

                                        var30. = var29;
                                    }

                                    if (llllIIIIIIIl(33410, 7551)) {
                                        throw null;
                                    } else {
                                        GlStateManager.resetColor();
                                        if (llllIIIIIIIl(33410, 7551)) {
                                            throw null;
                                        } else {
                                            TextureManager var10008 = this.                                                                                                    .
                                            getTextureManager();
                                            ResourceLocation var10009 = AbstractClientPlayer.getLocationSkin(this..getName())
                                            ;
                                            if (llllIIIIIIIl(33410, 7551)) {
                                                throw null;
                                            } else {
                                                var10008.bindTexture(var10009);
                                                Gui.drawScaledCustomSizeModalRect(var10, var11, 8.0F, 8.0F, 8, 8, var3 - 1, var3 - 1, 64.0F, 64.0F);
                                                if (llllIIIIIIIl(33410, 7551)) {
                                                    throw null;
                                                } else {
                                                    Class4 var10006 = this.;
                                                    double var10007 = (double) var10;
                                                    double var50 = (double) (var11 + var3);
                                                    double var51 = (double) var5;
                                                    Color var10012 = new Color(0, 0, 0, 100);
                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                        throw null;
                                                    } else {
                                                        var10006. (var10007, var50, var51, 6.0D, 2.0D, var10012.getRGB())
                                                        ;
                                                        float var16 = this.                                                                                         .
                                                        getHealth() / this.                                                                                         .
                                                        getMaxHealth();
                                                        float var6 = 100.0F * var16 / 50.0F;
                                                        var16 = (float) var5 * var16;
                                                        this.                                                                                     .
                                                        (var16);
                                                        this.                                                                                     .
                                                        ();
                                                        GlStateManager.color(2.0F - var6, var6, 0.0F, 1.0F);
                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                            throw null;
                                                        } else {
                                                            Class4 var10003 = this.;
                                                            double var10004 = (double) var10;
                                                            double var10005 = (double) (var11 + var3);
                                                            double var49 = Math.ceil((double) this.. ());
                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                throw null;
                                                            } else {
                                                                var10003. (var10004, var10005, var49, 6.0D, 2.0D);
                                                                this.                                                                                           .
                                                                (this..getName(), (float) (var10 + var3 + 1), (float) var11, Class73.                                                                                          )
                                                                ;
                                                                Class4 var32 = this.;
                                                                StringBuilder var10002 = new StringBuilder();
                                                                if (llllIIIIIIIl(33410, 7551)) {
                                                                    throw null;
                                                                } else {
                                                                    String var43 = Class60. ("RK#:¹m");
                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                        throw null;
                                                                    } else {
                                                                        var10002 = var10002.insert(0, var43);
                                                                        double var36 = Math.ceil((double) this..getHealth())
                                                                        ;
                                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                                            throw null;
                                                                        } else {
                                                                            var32.
                                                                            (String.valueOf(var10002.append(var36)), (float) (var10 + var3 + 1), (float) (var11 + this..
                                                                            () + 1),Class73.                                                                                          )
                                                                            ;
                                                                            ArrayList var34 = new ArrayList();
                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                throw null;
                                                                            } else {
                                                                                ArrayList var13 = var34;
                                                                                StringBuilder var37;
                                                                                if (llllIIIIIIII(this.. ())){
                                                                                    var37 = new StringBuilder();
                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                        throw null;
                                                                                    }

                                                                                    String var33 = Class60.
                                                                                    ("Izmolzis}u+:±m");
                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var37 = var37.append(var33);
                                                                                    double var35 = Math.ceil((double) ((EntityPlayer) this.).getFoodStats().getSaturationLevel());
                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                        throw null;
                                                                                    }

                                                                                    var13.add(String.valueOf(var37.append((int) var35)));
                                                                                }

                                                                                if (llllIIIIIIIl(33410, 7551)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    if (llllIIIIIIII(this.. ())){
                                                                                        var37 = new StringBuilder();
                                                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                                                            throw null;
                                                                                        }

                                                                                        String var39 = Class60.
                                                                                        ("]uw\u007f%:»m");
                                                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                                                            throw null;
                                                                                        }

                                                                                        var13.add(String.valueOf(var37.insert(0, var39).append(((EntityPlayer) this.).getFoodStats().getFoodLevel())));
                                                                                    }

                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        if (llllIIIIIIII(this.. ())){
                                                                                            String var44 = Class60.
                                                                                            ("Tx`*4¶!56 =");
                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                throw null;
                                                                                            }

                                                                                            Object[] var38 = new Object[1];
                                                                                            Float var48 = this.                                                                                                    .
                                                                                            player.getDistance(this.);
                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var38[0] = var48;
                                                                                            var44 = String.format(var44, var38);
                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                throw null;
                                                                                            }

                                                                                            var13.add(var44);
                                                                                        }

                                                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            Iterator var41;
                                                                                            if (lllIllllllll(var13.isEmpty())) {
                                                                                                Stream var40 = var13.stream();
                                                                                                Comparator var46 = Comparator.comparing(this::);
                                                                                                if (llllIIIIIIIl(33410, 7551)) {
                                                                                                    throw null;
                                                                                                }

                                                                                                String var17 = (String) var40.sorted(var46).findFirst().get();
                                                                                                this.                                                                                           .
                                                                                                ((double) (var10 + var5 + 2), (double) (var11 - 1), (double) (this..
                                                                                                (var17) + 1),
                                                                                                (double) ((this.. () + 1) *
                                                                                                var13.size() - 1),
                                                                                                2.0D, Class73.                                                                                                  )
                                                                                                ;
                                                                                                int var19 = 0;
                                                                                                Iterator var7;
                                                                                                var41 = var7 = var13.iterator();

                                                                                                while (true) {
                                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    if (!llllIIIIIIII(var41.hasNext())) {
                                                                                                        break;
                                                                                                    }

                                                                                                    String var8 = (String) var7.next();
                                                                                                    var41 = var7;
                                                                                                    this.                                                                                           .
                                                                                                    (var8, (float) (var10 + var5 + 3), (float) (var11 + var19), Class73.                                                                                          )
                                                                                                    ;
                                                                                                    var19 += this.                                                                                           .
                                                                                                    () + 1;
                                                                                                    var27 = true;
                                                                                                }
                                                                                            }

                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                if (llllIIIIIIII(this..
                                                                                                ())){
                                                                                                    ArrayList var45 = new ArrayList();
                                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    ArrayList var18 = var45;
                                                                                                    List var47 = Lists.reverse(((EntityPlayer) this.).inventory.armorInventory);
                                                                                                    if (llllIIIIIIIl(33410, 7551)) {
                                                                                                        throw null;
                                                                                                    }

                                                                                                    Iterator var20 = var47.iterator();

                                                                                                    label221:
                                                                                                    while (true) {
                                                                                                        if (llllIIIIIIIl(33410, 7551)) {
                                                                                                            throw null;
                                                                                                        }

                                                                                                        if (!llllIIIIIIII(var20.hasNext())) {
                                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            ItemStack var22;
                                                                                                            if (lllIllllllll((var22 = ((EntityPlayer) this.).inventory.getCurrentItem()).getItem() instanceof ItemAir)) {
                                                                                                                var18.add(var22);
                                                                                                            }

                                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            if (lllIllllllll((var22 = (ItemStack) ((EntityPlayer) this.).inventory.offHandInventory.get(0)).getItem() instanceof ItemAir)) {
                                                                                                                var18.add(var22);
                                                                                                            }

                                                                                                            if (llllIIIIIIIl(33410, 7551)) {
                                                                                                                throw null;
                                                                                                            }

                                                                                                            float var23 = (float) var10;
                                                                                                            int var24 = var11 - 18;
                                                                                                            var10 = 0;

                                                                                                            Iterator var12;
                                                                                                            for (var41 = var12 = var18.iterator(); !llllIIIIIIIl(33410, 7551); var27 = true) {
                                                                                                                if (!llllIIIIIIII(var41.hasNext())) {
                                                                                                                    break label221;
                                                                                                                }

                                                                                                                ItemStack var14 = (ItemStack) var12.next();
                                                                                                                var41 = var12;
                                                                                                                int var42 = (int) var23 + var10;
                                                                                                                var10 += 17;
                                                                                                                this.                                                                                           .
                                                                                                                (var14, var42, var24, -100.0F)
                                                                                                                ;
                                                                                                            }

                                                                                                            throw null;
                                                                                                        }

                                                                                                        ItemStack var21;
                                                                                                        if (lllIllllllll((var21 = (ItemStack) var20.next()).getItem() instanceof ItemAir)) {
                                                                                                            var18.add(var21);
                                                                                                            var10000 = true;
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                                if (llllIIIIIIIl(33410, 7551)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    var10000 = true;
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (llllIIIIIIIl(33410, 7551)) {
                        throw null;
                    } else {
                        var10000 = true;
                    }
                }
            }
        }
    }

    private Integer ________________________________________________________________________________________________/* $FF was:                                                                                                 */(String var1) {
        Integer var10000 = -this.                                                                                           .
        (var1);
        if (llllIIIIIIIl(94617, 998)) {
            throw null;
        } else {
            return var10000;
        }
    }
}
