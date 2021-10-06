import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;

public class Class181 {
    private static int 62421=-19716;
    private static int 429=14488;
    private static int 8223=286;
    private static int 7580=841;
    private static int 4495=3954;
    private static int 8839=27608;
    private static int 8168=24565;
    private static int 8333=6089;
    private static int 42457=-6396;
    private static int 99466=-23475;
    private static int 23783=-3603;
    private static int 37853=-8420;
    private static int 23792=-16382;
    private static int 17386=-3395;
    private static int 69724=-2999;
    private static int 90210=-27286;
    private static int 9066=7270;
    private static int 22048=-1966;
    private static int 17877=-15439;
    private static int 85620=-13936;
    private static int 52012=-32406;
    private static int 6407=2472;
    private static int 6221=1943;
    private static int 5727=10198;
    private static int 2649=161;
    private static int 4071=22800;
    private static int 6253=24096;
    private static int 6621=15293;
    private static int 63983=-21037;
    private static int 33356=-24571;

    static {
        boolean var10000 = true;
    }

    public Class181() {
        if (llIllIlIIlIl(52012, 7580)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    private static boolean llIllIlIlIll(int var0) {
        return var0 != 0;
    }

    public static void __________________________________________________________________________________________/* $FF was:                                                                                           */(AxisAlignedBB var0) {
        GL11.glBegin(1);
        if (llIllIlIIlIl(85620, 6221)) {
            throw null;
        } else {
            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
            if (llIllIlIIlIl(85620, 6221)) {
                throw null;
            } else {
                GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                if (llIllIlIIlIl(85620, 6221)) {
                    throw null;
                } else {
                    GL11.glEnd();
                    if (llIllIlIIlIl(85620, 6221)) {
                        throw null;
                    } else {
                        GL11.glBegin(1);
                        if (llIllIlIIlIl(85620, 6221)) {
                            throw null;
                        } else {
                            GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                            if (llIllIlIIlIl(85620, 6221)) {
                                throw null;
                            } else {
                                GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                if (llIllIlIIlIl(85620, 6221)) {
                                    throw null;
                                } else {
                                    GL11.glEnd();
                                    if (llIllIlIIlIl(85620, 6221)) {
                                        throw null;
                                    } else {
                                        GL11.glBegin(1);
                                        if (llIllIlIIlIl(85620, 6221)) {
                                            throw null;
                                        } else {
                                            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
                                            if (llIllIlIIlIl(85620, 6221)) {
                                                throw null;
                                            } else {
                                                GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                                if (llIllIlIIlIl(85620, 6221)) {
                                                    throw null;
                                                } else {
                                                    GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                                                    if (llIllIlIIlIl(85620, 6221)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                                        if (llIllIlIIlIl(85620, 6221)) {
                                                            throw null;
                                                        } else {
                                                            GL11.glEnd();
                                                            if (llIllIlIIlIl(85620, 6221)) {
                                                                throw null;
                                                            } else {
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

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(double var0, double var2, double var4, float var6, int var7, int var8) {
        Sphere var10000 = new Sphere();
        if (llIllIlIIlIl(17386, 429)) {
            throw null;
        } else {
            Sphere var9 = var10000;
            GL11.glPushMatrix();
            if (llIllIlIIlIl(17386, 429)) {
                throw null;
            } else {
                GL11.glBlendFunc(770, 771);
                if (llIllIlIIlIl(17386, 429)) {
                    throw null;
                } else {
                    GL11.glEnable(3042);
                    if (llIllIlIIlIl(17386, 429)) {
                        throw null;
                    } else {
                        GL11.glLineWidth(1.2F);
                        if (llIllIlIIlIl(17386, 429)) {
                            throw null;
                        } else {
                            GL11.glDisable(3553);
                            if (llIllIlIIlIl(17386, 429)) {
                                throw null;
                            } else {
                                GL11.glDisable(2929);
                                if (llIllIlIIlIl(17386, 429)) {
                                    throw null;
                                } else {
                                    GL11.glDepthMask(false);
                                    if (llIllIlIIlIl(17386, 429)) {
                                        throw null;
                                    } else {
                                        var9.setDrawStyle(100013);
                                        GL11.glTranslated(var0, var2, var4);
                                        if (llIllIlIIlIl(17386, 429)) {
                                            throw null;
                                        } else {
                                            var9.draw(var6, var7, var8);
                                            GL11.glLineWidth(2.0F);
                                            if (llIllIlIIlIl(17386, 429)) {
                                                throw null;
                                            } else {
                                                GL11.glEnable(3553);
                                                if (llIllIlIIlIl(17386, 429)) {
                                                    throw null;
                                                } else {
                                                    GL11.glEnable(2929);
                                                    if (llIllIlIIlIl(17386, 429)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glDepthMask(true);
                                                        if (llIllIlIIlIl(17386, 429)) {
                                                            throw null;
                                                        } else {
                                                            GL11.glDisable(3042);
                                                            if (llIllIlIIlIl(17386, 429)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glPopMatrix();
                                                                if (llIllIlIIlIl(17386, 429)) {
                                                                    throw null;
                                                                } else {
                                                                    boolean var10 = true;
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

    private static boolean llIllIlIIlll(Object var0) {
        return var0 == null;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(float var0, int var1, int var2) {
        Sphere var10000 = new Sphere();
        if (llIllIlIIlIl(23792, 8333)) {
            throw null;
        } else {
            Sphere var3 = var10000;
            GL11.glPushMatrix();
            if (llIllIlIIlIl(23792, 8333)) {
                throw null;
            } else {
                GL11.glLineWidth(1.2F);
                if (llIllIlIIlIl(23792, 8333)) {
                    throw null;
                } else {
                    var3.setDrawStyle(100013);
                    var3.draw(var0, var1, var2);
                    GL11.glLineWidth(2.0F);
                    if (llIllIlIIlIl(23792, 8333)) {
                        throw null;
                    } else {
                        GL11.glPopMatrix();
                        if (llIllIlIIlIl(23792, 8333)) {
                            throw null;
                        } else {
                            boolean var4 = true;
                        }
                    }
                }
            }
        }
    }

    public static void ____________________________________________________________________________/* $FF was:                                                                             */(AxisAlignedBB var0) {
        GL11.glBegin(7);
        if (llIllIlIIlIl(17877, 8839)) {
            throw null;
        } else {
            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
            if (llIllIlIIlIl(17877, 8839)) {
                throw null;
            } else {
                GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                if (llIllIlIIlIl(17877, 8839)) {
                    throw null;
                } else {
                    GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                    if (llIllIlIIlIl(17877, 8839)) {
                        throw null;
                    } else {
                        GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                        if (llIllIlIIlIl(17877, 8839)) {
                            throw null;
                        } else {
                            GL11.glEnd();
                            if (llIllIlIIlIl(17877, 8839)) {
                                throw null;
                            } else {
                                boolean var10000 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Color var0, float var1) {
        GL11.glColor4f((float) var0.getRed() / 255.0F, (float) var0.getGreen() / 255.0F, (float) var0.getBlue() / 255.0F, var1);
        if (llIllIlIIlIl(99466, 4495)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(AxisAlignedBB var0, Color var1) {
        GL11.glColor4f((float) var1.getRed(), (float) var1.getGreen(), (float) var1.getBlue(), 0.15F);
        if (llIllIlIIlIl(23783, 5727)) {
            throw null;
        } else {
            (var0);
            if (llIllIlIIlIl(23783, 5727)) {
                throw null;
            } else {
                GL11.glColor4f((float) var1.getRed(), (float) var1.getGreen(), (float) var1.getBlue(), 1.0F);
                if (llIllIlIIlIl(23783, 5727)) {
                    throw null;
                } else {
                    (var0);
                    if (llIllIlIIlIl(23783, 5727)) {
                        throw null;
                    } else {
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(AxisAlignedBB var0) {
        GL11.glBegin(3);
        if (llIllIlIIlIl(33356, 8223)) {
            throw null;
        } else {
            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
            if (llIllIlIIlIl(33356, 8223)) {
                throw null;
            } else {
                GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                if (llIllIlIIlIl(33356, 8223)) {
                    throw null;
                } else {
                    GL11.glVertex3d(var0.maxX, var0.minY, var0.maxZ);
                    if (llIllIlIIlIl(33356, 8223)) {
                        throw null;
                    } else {
                        GL11.glVertex3d(var0.minX, var0.minY, var0.maxZ);
                        if (llIllIlIIlIl(33356, 8223)) {
                            throw null;
                        } else {
                            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
                            if (llIllIlIIlIl(33356, 8223)) {
                                throw null;
                            } else {
                                GL11.glEnd();
                                if (llIllIlIIlIl(33356, 8223)) {
                                    throw null;
                                } else {
                                    GL11.glBegin(3);
                                    if (llIllIlIIlIl(33356, 8223)) {
                                        throw null;
                                    } else {
                                        GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                        if (llIllIlIIlIl(33356, 8223)) {
                                            throw null;
                                        } else {
                                            GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                            if (llIllIlIIlIl(33356, 8223)) {
                                                throw null;
                                            } else {
                                                GL11.glVertex3d(var0.maxX, var0.maxY, var0.maxZ);
                                                if (llIllIlIIlIl(33356, 8223)) {
                                                    throw null;
                                                } else {
                                                    GL11.glVertex3d(var0.minX, var0.maxY, var0.maxZ);
                                                    if (llIllIlIIlIl(33356, 8223)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                                        if (llIllIlIIlIl(33356, 8223)) {
                                                            throw null;
                                                        } else {
                                                            GL11.glEnd();
                                                            if (llIllIlIIlIl(33356, 8223)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glBegin(1);
                                                                if (llIllIlIIlIl(33356, 8223)) {
                                                                    throw null;
                                                                } else {
                                                                    GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
                                                                    if (llIllIlIIlIl(33356, 8223)) {
                                                                        throw null;
                                                                    } else {
                                                                        GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                                                        if (llIllIlIIlIl(33356, 8223)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                                                                            if (llIllIlIIlIl(33356, 8223)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                                                                if (llIllIlIIlIl(33356, 8223)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GL11.glVertex3d(var0.maxX, var0.minY, var0.maxZ);
                                                                                    if (llIllIlIIlIl(33356, 8223)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GL11.glVertex3d(var0.maxX, var0.maxY, var0.maxZ);
                                                                                        if (llIllIlIIlIl(33356, 8223)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GL11.glVertex3d(var0.minX, var0.minY, var0.maxZ);
                                                                                            if (llIllIlIIlIl(33356, 8223)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GL11.glVertex3d(var0.minX, var0.maxY, var0.maxZ);
                                                                                                if (llIllIlIIlIl(33356, 8223)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GL11.glEnd();
                                                                                                    if (llIllIlIIlIl(33356, 8223)) {
                                                                                                        throw null;
                                                                                                    } else {
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
                    }
                }
            }
        }
    }

    private static boolean llIllIlIIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    public static double[] ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0) {
        Minecraft var10000 = Minecraft.getMinecraft();
        if (llIllIlIIlIl(42457, 9066)) {
            throw null;
        } else {
            float var1 = var10000.getRenderPartialTicks();
            var10000 = Minecraft.getMinecraft();
            if (llIllIlIIlIl(42457, 9066)) {
                throw null;
            } else {
                RenderManager var2 = var10000.getRenderManager();
                double var3 = var0.lastTickPosX + (var0.posX - var0.lastTickPosX) * (double) var1 - var2.viewerPosX;
                double var5 = var0.lastTickPosY + (var0.posY - var0.lastTickPosY) * (double) var1 - var2.viewerPosY;
                double var7 = var0.lastTickPosZ + (var0.posZ - var0.lastTickPosZ) * (double) var1 - var2.viewerPosZ;
                return new double[]{var3, var5, var7};
            }
        }
    }

    private static boolean llIllIlIIllI(Object var0) {
        return var0 != null;
    }

    private static boolean llIllIlIlIII(int var0) {
        return var0 >= 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0, Color var1) {
        GL11.glPushMatrix();
        if (llIllIlIIlIl(90210, 4071)) {
            throw null;
        } else {
            GL11.glEnable(3042);
            if (llIllIlIIlIl(90210, 4071)) {
                throw null;
            } else {
                GL11.glBlendFunc(770, 771);
                if (llIllIlIIlIl(90210, 4071)) {
                    throw null;
                } else {
                    GL11.glEnable(2848);
                    if (llIllIlIIlIl(90210, 4071)) {
                        throw null;
                    } else {
                        GL11.glLineWidth(1.0F);
                        if (llIllIlIIlIl(90210, 4071)) {
                            throw null;
                        } else {
                            GL11.glDisable(3553);
                            if (llIllIlIIlIl(90210, 4071)) {
                                throw null;
                            } else {
                                GL11.glEnable(2884);
                                if (llIllIlIIlIl(90210, 4071)) {
                                    throw null;
                                } else {
                                    GL11.glDisable(2929);
                                    if (llIllIlIIlIl(90210, 4071)) {
                                        throw null;
                                    } else {
                                        Minecraft var10000 = Minecraft.getMinecraft();
                                        if (llIllIlIIlIl(90210, 4071)) {
                                            throw null;
                                        } else {
                                            double var2 = var10000.getRenderManager().viewerPosX;
                                            var10000 = Minecraft.getMinecraft();
                                            if (llIllIlIIlIl(90210, 4071)) {
                                                throw null;
                                            } else {
                                                double var4 = var10000.getRenderManager().viewerPosY;
                                                var10000 = Minecraft.getMinecraft();
                                                if (llIllIlIIlIl(90210, 4071)) {
                                                    throw null;
                                                } else {
                                                    double var6 = var10000.getRenderManager().viewerPosZ;
                                                    GL11.glTranslated((double) var0.getX() - var2, (double) var0.getY() - var4, (double) var0.getZ() - var6);
                                                    if (llIllIlIIlIl(90210, 4071)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glColor4f((float) var1.getRed(), (float) var1.getGreen(), (float) var1.getBlue(), 0.3F);
                                                        if (llIllIlIIlIl(90210, 4071)) {
                                                            throw null;
                                                        } else {
                                                            (Block.FULL_BLOCK_AABB);
                                                            if (llIllIlIIlIl(90210, 4071)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glColor4f((float) var1.getRed(), (float) var1.getGreen(), (float) var1.getBlue(), 0.7F);
                                                                if (llIllIlIIlIl(90210, 4071)) {
                                                                    throw null;
                                                                } else {
                                                                    (Block.FULL_BLOCK_AABB);
                                                                    if (llIllIlIIlIl(90210, 4071)) {
                                                                        throw null;
                                                                    } else {
                                                                        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                                                                        if (llIllIlIIlIl(90210, 4071)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glEnable(2929);
                                                                            if (llIllIlIIlIl(90210, 4071)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glEnable(3553);
                                                                                if (llIllIlIIlIl(90210, 4071)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GL11.glDisable(3042);
                                                                                    if (llIllIlIIlIl(90210, 4071)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GL11.glDisable(2848);
                                                                                        if (llIllIlIIlIl(90210, 4071)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GL11.glPopMatrix();
                                                                                            if (llIllIlIIlIl(90210, 4071)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                boolean var8 = true;
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
            }
        }
    }

    public static void _____________________________________________________________________________________/* $FF was:                                                                                      */(AxisAlignedBB var0) {
        GL11.glBegin(7);
        if (llIllIlIIlIl(69724, 6407)) {
            throw null;
        } else {
            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
            if (llIllIlIIlIl(69724, 6407)) {
                throw null;
            } else {
                GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                if (llIllIlIIlIl(69724, 6407)) {
                    throw null;
                } else {
                    GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                    if (llIllIlIIlIl(69724, 6407)) {
                        throw null;
                    } else {
                        GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                        if (llIllIlIIlIl(69724, 6407)) {
                            throw null;
                        } else {
                            GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                            if (llIllIlIIlIl(69724, 6407)) {
                                throw null;
                            } else {
                                GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                if (llIllIlIIlIl(69724, 6407)) {
                                    throw null;
                                } else {
                                    GL11.glVertex3d(var0.maxX, var0.maxY, var0.maxZ);
                                    if (llIllIlIIlIl(69724, 6407)) {
                                        throw null;
                                    } else {
                                        GL11.glVertex3d(var0.maxX, var0.minY, var0.maxZ);
                                        if (llIllIlIIlIl(69724, 6407)) {
                                            throw null;
                                        } else {
                                            GL11.glVertex3d(var0.minX, var0.minY, var0.maxZ);
                                            if (llIllIlIIlIl(69724, 6407)) {
                                                throw null;
                                            } else {
                                                GL11.glVertex3d(var0.maxX, var0.minY, var0.maxZ);
                                                if (llIllIlIIlIl(69724, 6407)) {
                                                    throw null;
                                                } else {
                                                    GL11.glVertex3d(var0.maxX, var0.maxY, var0.maxZ);
                                                    if (llIllIlIIlIl(69724, 6407)) {
                                                        throw null;
                                                    } else {
                                                        GL11.glVertex3d(var0.minX, var0.maxY, var0.maxZ);
                                                        if (llIllIlIIlIl(69724, 6407)) {
                                                            throw null;
                                                        } else {
                                                            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
                                                            if (llIllIlIIlIl(69724, 6407)) {
                                                                throw null;
                                                            } else {
                                                                GL11.glVertex3d(var0.minX, var0.minY, var0.maxZ);
                                                                if (llIllIlIIlIl(69724, 6407)) {
                                                                    throw null;
                                                                } else {
                                                                    GL11.glVertex3d(var0.minX, var0.maxY, var0.maxZ);
                                                                    if (llIllIlIIlIl(69724, 6407)) {
                                                                        throw null;
                                                                    } else {
                                                                        GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                                                        if (llIllIlIIlIl(69724, 6407)) {
                                                                            throw null;
                                                                        } else {
                                                                            GL11.glVertex3d(var0.minX, var0.minY, var0.minZ);
                                                                            if (llIllIlIIlIl(69724, 6407)) {
                                                                                throw null;
                                                                            } else {
                                                                                GL11.glVertex3d(var0.maxX, var0.minY, var0.minZ);
                                                                                if (llIllIlIIlIl(69724, 6407)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    GL11.glVertex3d(var0.maxX, var0.minY, var0.maxZ);
                                                                                    if (llIllIlIIlIl(69724, 6407)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        GL11.glVertex3d(var0.minX, var0.minY, var0.maxZ);
                                                                                        if (llIllIlIIlIl(69724, 6407)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            GL11.glVertex3d(var0.minX, var0.maxY, var0.minZ);
                                                                                            if (llIllIlIIlIl(69724, 6407)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                GL11.glVertex3d(var0.minX, var0.maxY, var0.maxZ);
                                                                                                if (llIllIlIIlIl(69724, 6407)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GL11.glVertex3d(var0.maxX, var0.maxY, var0.maxZ);
                                                                                                    if (llIllIlIIlIl(69724, 6407)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        GL11.glVertex3d(var0.maxX, var0.maxY, var0.minZ);
                                                                                                        if (llIllIlIIlIl(69724, 6407)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GL11.glEnd();
                                                                                                            if (llIllIlIIlIl(69724, 6407)) {
                                                                                                                throw null;
                                                                                                            } else {
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
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean llIllIlIlIlI(int var0) {
        return var0 < 0;
    }

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Entity var0, Color var1, float var2, double var3) {
        GL11.glPushMatrix();
        if (llIllIlIIlIl(37853, 2649)) {
            throw null;
        } else {
            GL11.glDisable(3553);
            if (llIllIlIIlIl(37853, 2649)) {
                throw null;
            } else {
                GL11.glEnable(3042);
                if (llIllIlIIlIl(37853, 2649)) {
                    throw null;
                } else {
                    GL11.glEnable(2848);
                    if (llIllIlIIlIl(37853, 2649)) {
                        throw null;
                    } else {
                        double var10001 = var0.lastTickPosX + (var0.posX - var0.lastTickPosX) * (double) var2;
                        Minecraft var10002 = Minecraft.getMinecraft();
                        if (llIllIlIIlIl(37853, 2649)) {
                            throw null;
                        } else {
                            double var5 = var10001 - var10002.getRenderManager().viewerPosX;
                            var10001 = var0.lastTickPosY + (var0.posY - var0.lastTickPosY) * (double) var2;
                            var10002 = Minecraft.getMinecraft();
                            if (llIllIlIIlIl(37853, 2649)) {
                                throw null;
                            } else {
                                double var7 = var10001 - var10002.getRenderManager().viewerPosY;
                                double var10000 = var0.lastTickPosZ + (var0.posZ - var0.lastTickPosZ) * (double) var2;
                                Minecraft var21 = Minecraft.getMinecraft();
                                if (llIllIlIIlIl(37853, 2649)) {
                                    throw null;
                                } else {
                                    double var9 = var10000 - var21.getRenderManager().viewerPosZ;
                                    GL11.glLineWidth(4.0F);
                                    if (llIllIlIIlIl(37853, 2649)) {
                                        throw null;
                                    } else {
                                        ArrayList var18 = new ArrayList();
                                        if (llIllIlIIlIl(37853, 2649)) {
                                            throw null;
                                        } else {
                                            ArrayList var14 = var18;

                                            float var11;
                                            boolean var23;
                                            for (float var19 = var11 = 0.0F; !llIllIlIIlIl(37853, 2649); var23 = true) {
                                                float var26;
                                                if (!llIllIlIlIlI((var26 = var19 - 6.283184F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1))) {
                                                    if (llIllIlIIlIl(37853, 2649)) {
                                                        throw null;
                                                    }

                                                    GL11.glLineStipple(4, (short) -21846);
                                                    if (llIllIlIIlIl(37853, 2649)) {
                                                        throw null;
                                                    }

                                                    GL11.glBegin(3);
                                                    if (llIllIlIIlIl(37853, 2649)) {
                                                        throw null;
                                                    }

                                                    var11 = 0.003921569F * (float) var1.getRed();
                                                    float var17 = 0.003921569F * (float) var1.getGreen();
                                                    float var13 = 0.003921569F * (float) var1.getBlue();

                                                    Iterator var15;
                                                    for (Iterator var22 = var15 = var14.iterator(); !llIllIlIIlIl(37853, 2649); var23 = true) {
                                                        if (!llIllIlIlIll(var22.hasNext())) {
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glEnd();
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glDisable(2852);
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glDisable(2848);
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glDisable(3042);
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glEnable(3553);
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glLineWidth(1.0F);
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            GL11.glPopMatrix();
                                                            if (llIllIlIIlIl(37853, 2649)) {
                                                                throw null;
                                                            }

                                                            boolean var24 = true;
                                                            return;
                                                        }

                                                        Vec3d var16 = (Vec3d) var15.next();
                                                        GL11.glColor3d((double) var11, (double) var17, (double) var13);
                                                        if (llIllIlIIlIl(37853, 2649)) {
                                                            throw null;
                                                        }

                                                        var22 = var15;
                                                        GL11.glVertex3d(var16.x, var16.y + 0.05000000074505806D, var16.z);
                                                        if (llIllIlIIlIl(37853, 2649)) {
                                                            throw null;
                                                        }
                                                    }

                                                    throw null;
                                                }

                                                Vec3d var20 = new Vec3d;
                                                double var10003 = Math.cos((double) var11);
                                                if (llIllIlIIlIl(37853, 2649)) {
                                                    throw null;
                                                }

                                                double var25 = var3 * var10003 + var5;
                                                double var10005 = Math.sin((double) var11);
                                                if (llIllIlIIlIl(37853, 2649)) {
                                                    throw null;
                                                }

                                                var20.<init> (var25, var7, var3 * var10005 + var9);
                                                if (llIllIlIIlIl(37853, 2649)) {
                                                    throw null;
                                                }

                                                Vec3d var12 = var20;
                                                var14.add(var12);
                                                var11 += 0.23271053F;
                                                var19 = var11;
                                            }

                                            throw null;
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

    public static void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(BlockPos var0, BlockPos var1, Color var2) {
        boolean var10000;
        if (llIllIlIIllI(var0) && !llIllIlIIlll(var1)) {
            if (llIllIlIIlIl(63983, 6253)) {
                throw null;
            } else {
                GlStateManager.pushMatrix();
                if (llIllIlIIlIl(63983, 6253)) {
                    throw null;
                } else {
                    GlStateManager.disableTexture2D();
                    if (llIllIlIIlIl(63983, 6253)) {
                        throw null;
                    } else {
                        GlStateManager.disableDepth();
                        if (llIllIlIIlIl(63983, 6253)) {
                            throw null;
                        } else {
                            GlStateManager.disableCull();
                            if (llIllIlIIlIl(63983, 6253)) {
                                throw null;
                            } else {
                                GlStateManager.enableBlend();
                                if (llIllIlIIlIl(63983, 6253)) {
                                    throw null;
                                } else {
                                    GlStateManager.depthMask(false);
                                    if (llIllIlIIlIl(63983, 6253)) {
                                        throw null;
                                    } else {
                                        GL11.glEnable(2848);
                                        if (llIllIlIIlIl(63983, 6253)) {
                                            throw null;
                                        } else {
                                            Minecraft var11 = Minecraft.getMinecraft();
                                            if (llIllIlIIlIl(63983, 6253)) {
                                                throw null;
                                            } else {
                                                RenderManager var3 = var11.getRenderManager();
                                                GL11.glTranslated((double) var0.getX() - var3.viewerPosX, (double) var0.getY() - var3.viewerPosY, (double) var0.getZ() - var3.viewerPosZ);
                                                if (llIllIlIIlIl(63983, 6253)) {
                                                    throw null;
                                                } else {
                                                    int var10;
                                                    byte var12;
                                                    boolean var10001;
                                                    if (llIllIlIlIII(var10 = var1.getX() - var0.getX())) {
                                                        var12 = 0;
                                                        var10001 = true;
                                                    } else {
                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                            throw null;
                                                        }

                                                        var12 = 1;
                                                    }

                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                        throw null;
                                                    } else {
                                                        byte var4 = var12;
                                                        int var13;
                                                        if (llIllIlIlIII(var10)) {
                                                            var13 = var10 + 1;
                                                            var10001 = true;
                                                        } else {
                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                throw null;
                                                            }

                                                            var13 = var10;
                                                        }

                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                            throw null;
                                                        } else {
                                                            int var5 = var13;
                                                            if (llIllIlIlIII(var10 = var1.getY() - var0.getY())) {
                                                                var12 = 0;
                                                                var10001 = true;
                                                            } else {
                                                                if (llIllIlIIlIl(63983, 6253)) {
                                                                    throw null;
                                                                }

                                                                var12 = 1;
                                                            }

                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                throw null;
                                                            } else {
                                                                byte var6 = var12;
                                                                if (llIllIlIlIII(var10)) {
                                                                    var13 = var10 + 1;
                                                                    var10001 = true;
                                                                } else {
                                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                                        throw null;
                                                                    }

                                                                    var13 = var10;
                                                                }

                                                                if (llIllIlIIlIl(63983, 6253)) {
                                                                    throw null;
                                                                } else {
                                                                    int var7 = var13;
                                                                    if (llIllIlIlIII(var10 = var1.getZ() - var0.getZ())) {
                                                                        var12 = 0;
                                                                        var10001 = true;
                                                                    } else {
                                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                                            throw null;
                                                                        }

                                                                        var12 = 1;
                                                                    }

                                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                                        throw null;
                                                                    } else {
                                                                        byte var9 = var12;
                                                                        if (llIllIlIlIII(var10)) {
                                                                            var13 = var10 + 1;
                                                                            var10001 = true;
                                                                        } else {
                                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                                throw null;
                                                                            }

                                                                            var13 = var10;
                                                                        }

                                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                                            throw null;
                                                                        } else {
                                                                            int var8 = var13;
                                                                            (var2, 0.15F);
                                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                                throw null;
                                                                            } else {
                                                                                AxisAlignedBB var10003 = new AxisAlignedBB((double) var4, (double) var6, (double) var9, (double) var5, (double) var7, (double) var8);
                                                                                if (llIllIlIIlIl(63983, 6253)) {
                                                                                    throw null;
                                                                                } else {
                                                                                    (var10003);
                                                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                                                        throw null;
                                                                                    } else {
                                                                                        (var2, 1.0F);
                                                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                                                            throw null;
                                                                                        } else {
                                                                                            AxisAlignedBB var14 = new AxisAlignedBB((double) var4, (double) var6, (double) var9, (double) var5, (double) var7, (double) var8);
                                                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                                                throw null;
                                                                                            } else {
                                                                                                (var14);
                                                                                                if (llIllIlIIlIl(63983, 6253)) {
                                                                                                    throw null;
                                                                                                } else {
                                                                                                    GlStateManager.enableCull();
                                                                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                                                                        throw null;
                                                                                                    } else {
                                                                                                        GlStateManager.disableBlend();
                                                                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                                                                            throw null;
                                                                                                        } else {
                                                                                                            GlStateManager.depthMask(true);
                                                                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                                                                throw null;
                                                                                                            } else {
                                                                                                                GL11.glDisable(2848);
                                                                                                                if (llIllIlIIlIl(63983, 6253)) {
                                                                                                                    throw null;
                                                                                                                } else {
                                                                                                                    GlStateManager.enableTexture2D();
                                                                                                                    if (llIllIlIIlIl(63983, 6253)) {
                                                                                                                        throw null;
                                                                                                                    } else {
                                                                                                                        GlStateManager.enableDepth();
                                                                                                                        if (llIllIlIIlIl(63983, 6253)) {
                                                                                                                            throw null;
                                                                                                                        } else {
                                                                                                                            GlStateManager.popMatrix();
                                                                                                                            if (llIllIlIIlIl(63983, 6253)) {
                                                                                                                                throw null;
                                                                                                                            } else {
                                                                                                                                GlStateManager.resetColor();
                                                                                                                                if (llIllIlIIlIl(63983, 6253)) {
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
        } else if (llIllIlIIlIl(63983, 6253)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();
}
