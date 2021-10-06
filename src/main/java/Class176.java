import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class176 extends Class171 {
    private static int 4142=2342;
    private static int 7061=6206;
    private static int 258=7495;
    public Class220;
    private static int 2002=16438;
    private static int 44795=-32739;
    private static int 72007=-7753;
    private static int 25083=-17842;
    private static int 82604=-26344;
    private static int 25991=-26747;
    private static int 6591=17990;
    private static int 21028=-27309;
    private static int 6732=10702;
    private static int 7608=30294;
    public Class220;
    public Class220;
    private static int 42126=-29600;
    private float;
    private static int 8862=20848;
    private static int 82403=-10296;

    static {
        boolean var10000 = true;
    }

    public Class176() {
        String var10001 = Class60. ("^v8bk:nz3X\u007f;xi4/");
        if (lllllllIIlll(82604, 6732)) {
            throw null;
        } else {
            super(var10001, 87, Class188.);
            if (lllllllIIlll(82604, 6732)) {
                throw null;
            } else {
                Class220 var2 = new Class220;
                String var10003 = Class60. ("Rq<{>");
                if (lllllllIIlll(82604, 6732)) {
                    throw null;
                } else {
                    String[] var10006 = new String[3];
                    String var10009 = Class60. ("Ioxnw8");
                    if (lllllllIIlll(82604, 6732)) {
                        throw null;
                    } else {
                        var10006[0] = var10009;
                        var10009 = Class60. ("Wuw0");
                        if (lllllllIIlll(82604, 6732)) {
                            throw null;
                        } else {
                            var10006[1] = var10009;
                            var10009 = Class60. ("J|qutq:");
                            if (lllllllIIlll(82604, 6732)) {
                                throw null;
                            } else {
                                var10006[2] = var10009;
                                var2.<init> (var10003, 197, this, var10006);
                                if (lllllllIIlll(82604, 6732)) {
                                    throw null;
                                } else {
                                    this. = var2;
                                    Class220 var10004 = new Class220;
                                    String var1 = Class60. ("Vc4c|6Cc?wn7/");
                                    if (lllllllIIlll(82604, 6732)) {
                                        throw null;
                                    } else {
                                        var10004.<init> (var1, 213, this, true);
                                        if (lllllllIIlll(82604, 6732)) {
                                            throw null;
                                        } else {
                                            this. = var10004;
                                            Class220 var3 = new Class220;
                                            String var10005 = Class60. ("Om?y}=?");
                                            if (lllllllIIlll(82604, 6732)) {
                                                throw null;
                                            } else {
                                                var3.<init> (var10005, 198, this, 30.0D, 20.0D, 100.0D, true);
                                                if (lllllllIIlll(82604, 6732)) {
                                                    throw null;
                                                } else {
                                                    this. = var3;
                                                    this. (new Class220[]{this.});
                                                    this. (new Class220[]{this.});
                                                    this. (new Class220[]{this.});
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

    private static boolean lllllllIIlll(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean lllllllIlIlI(Object var0) {
        return var0 == null;
    }

    private static boolean lllllllIllIl(int var0) {
        return var0 == 0;
    }

    private static boolean lllllllIlllI(int var0) {
        return var0 < 0;
    }

    private static boolean lllllllIllII(int var0) {
        return var0 != 0;
    }

    private static boolean lllllllIlIll(Object var0, Object var1) {
        return var0 != var1;
    }

    private static boolean lllllllIlIII(Object var0) {
        return var0 != null;
    }

    private static boolean lllllllIllll(int var0) {
        return var0 > 0;
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (lllllllIIlll(72007, 258)) {
            throw null;
        } else {
            if (lllllllIlIII(this..player)){
                this.                                                                                                    .
                player.capabilities.isFlying = false;
                this.                                                                                                    .
                player.capabilities.setFlySpeed(this.);
            }

            if (lllllllIIlll(72007, 258)) {
                throw null;
            } else {
                boolean var10000 = true;
            }
        }
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(LivingUpdateEvent var1) {
        boolean var5;
        if (lllllllIlIlI(this..player)){
            var5 = true;
        } else if (lllllllIIlll(42126, 8862)) {
            throw null;
        } else {
            this. (this.. ());
            if (lllllllIlIll(this..player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem(),
            Items.ELYTRA)){
                var5 = true;
            } else if (lllllllIIlll(42126, 8862)) {
                throw null;
            } else {
                double var12;
                if (lllllllIllII(this.. ()) &&lllllllIllII(this..gameSettings.keyBindJump.isKeyDown()) &&
                lllllllIllIl(this..player.isElytraFlying()) &&
                lllllllIlllI((var12 = this..player.motionY - 0.0D) == 0.0D ? 0 : (var12 < 0.0D ? -1 : 1)) &&
                lllllllIllII(this.. (250))){
                    NetHandlerPlayClient var10001 = this.                                                                                                    .
                    getConnection();
                    CPacketEntityAction var10002 = new CPacketEntityAction(this..player, Action.START_FALL_FLYING)
                    ;
                    if (lllllllIIlll(42126, 8862)) {
                        throw null;
                    }

                    var10001.sendPacket(var10002);
                    this.                                                                                         .();
                }

                if (lllllllIIlll(42126, 8862)) {
                    throw null;
                } else {
                    label162:
                    {
                        String var6;
                        String var10000;
                        if (lllllllIllII(this..player.isElytraFlying())){
                        var10000 = this.                                                                                                   .
                        ();
                        var6 = Class60. ("Ioxnw8");
                        if (lllllllIIlll(42126, 8862)) {
                            throw null;
                        }

                        if (lllllllIllII(var10000.equals(var6))) {
                            this.                                                                                                    .
                            player.motionY = 0.0D;
                            byte var7 = Class133. (34);
                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            if (!lllllllIllII(var7) || lllllllIlIlI(Class122.)) {
                                if (lllllllIIlll(42126, 8862)) {
                                    throw null;
                                }

                                this.                                                                                                    .
                                player.motionX = 0.0D;
                                this.                                                                                                    .
                                player.motionZ = 0.0D;
                            }

                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            if (lllllllIllII(this..player.movementInput.jump)){
                                this.                                                                                                    .
                                player.motionY = this.                                                                              .
                                () / 50.0D;
                            }

                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            if (lllllllIllII(this..player.movementInput.sneak)){
                                this.                                                                                                    .
                                player.motionY = -this.                                                                              .
                                () / 50.0D;
                            }

                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            float var13;
                            float var14;
                            if (!lllllllIllIl((var13 = this..player.moveForward - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1)) ||
                            lllllllIllII((var14 = this..player.moveStrafing - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1)))
                            {
                                if (lllllllIIlll(42126, 8862)) {
                                    throw null;
                                } else {
                                    double var4 = this. ();
                                    EntityPlayerSP var9 = this.                                                                                                    .
                                    player;
                                    double var10 = Math.sin(var4);
                                    if (lllllllIIlll(42126, 8862)) {
                                        throw null;
                                    } else {
                                        var9.motionX = -var10 * this.                                                                              .
                                        () * 0.05000000074505806D;
                                        EntityPlayerSP var8 = this.                                                                                                    .
                                        player;
                                        double var11 = Math.cos(var4);
                                        if (lllllllIIlll(42126, 8862)) {
                                            throw null;
                                        } else {
                                            var8.motionZ = var11 * this.                                                                              .
                                            () * 0.05000000074505806D;
                                            var5 = true;
                                            return;
                                        }
                                    }
                                }
                            }
                            break label162;
                        }
                    }

                        if (lllllllIIlll(42126, 8862)) {
                            throw null;
                        }

                        if (lllllllIllII(this..player.isElytraFlying())){
                        var10000 = this.                                                                                                   .
                        ();
                        var6 = Class60. ("Wuw0");
                        if (lllllllIIlll(42126, 8862)) {
                            throw null;
                        }

                        if (lllllllIllII(var10000.equals(var6))) {
                            if (lllllllIlIII(this..player) &&
                            lllllllIllII(this..gameSettings.keyBindJump.isKeyDown())){
                                Vec3d var2 = this.                                                                                                    .
                                player.getLookVec();
                                EntityPlayerSP var10006 = this.                                                                                                    .
                                player;
                                var10006.motionX += var2.x * 0.1D + (var2.x * 1.0D - this..player.motionX) *
                                0.8D;
                                EntityPlayerSP var10005 = this.                                                                                                    .
                                player;
                                var10005.motionY += var2.y * 0.1D + (var2.y * 1.0D - this..player.motionY) *
                                0.8D;
                                EntityPlayerSP var10004 = this.                                                                                                    .
                                player;
                                var10004.motionZ += var2.z * 0.1D + (var2.z * 1.0D - this..player.motionZ) *
                                0.8D;
                                this.                                                                                                    .
                                player.setPosition(this..player.posX, this.                                                                                                    .
                                player.posY, this.                                                                                                    .
                                player.posZ);
                                this.                                                                                                    .
                                player.motionX = this.                                                                                                    .
                                player.motionX;
                                this.                                                                                                    .
                                player.motionY = this.                                                                                                    .
                                player.motionY;
                                this.                                                                                                    .
                                player.motionZ = this.                                                                                                    .
                                player.motionZ;
                                var5 = true;
                                return;
                            }
                            break label162;
                        }
                    }

                        if (lllllllIIlll(42126, 8862)) {
                            throw null;
                        }

                        var10000 = this.                                                                                                   .
                        ();
                        var6 = Class60. ("J|qutq:");
                        if (lllllllIIlll(42126, 8862)) {
                            throw null;
                        }

                        if (lllllllIllII(var10000.equals(var6))) {
                            if (lllllllIllII(this..gameSettings.keyBindJump.isKeyDown())){
                                this.                                                                                                    .
                                player.motionY = 0.019999999552965164D;
                            }

                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            if (lllllllIllII(this..gameSettings.keyBindSneak.isKeyDown())){
                                this.                                                                                                    .
                                player.motionY = -0.20000000298023224D;
                            }

                            if (lllllllIIlll(42126, 8862)) {
                                throw null;
                            }

                            this.                                                                                                    .
                            player.capabilities.isFlying = true;
                            this.                                                                                                    .
                            player.capabilities.setFlySpeed((float) this.. () * 0.002F);
                        }
                    }

                    if (lllllllIIlll(42126, 8862)) {
                        throw null;
                    } else {
                        var5 = true;
                    }
                }
            }
        }
    }

    public Float ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        double var10000 = Math.sqrt(this..player.motionX * this.                                                                                                    .
        player.motionX + this.                                                                                                    .
        player.motionZ * this.                                                                                                    .
        player.motionZ);
        if (lllllllIIlll(25083, 6591)) {
            throw null;
        } else {
            Float var1 = (float) var10000;
            if (lllllllIIlll(25083, 6591)) {
                throw null;
            } else {
                return var1;
            }
        }
    }

    public double ________________________________________________________________________________________________/* $FF was:                                                                                                 */() {
        float var1 = this.                                                                                                    .
        player.rotationYaw;
        float var2 = 1.0F;
        float var4;
        if (lllllllIlllI((var4 = this..player.moveForward - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1))){
            var1 += 180.0F;
        }

        if (lllllllIIlll(44795, 2002)) {
            throw null;
        } else {
            Class176 var10000;
            float var5;
            if (lllllllIlllI((var5 = this..player.moveForward - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1))){
                var2 = -0.5F;
                var10000 = this;
                boolean var10001 = true;
            } else{
                if (lllllllIIlll(44795, 2002)) {
                    throw null;
                }

                float var6;
                if (lllllllIllll((var6 = this..player.moveForward - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1)))
                {
                    var2 = 0.5F;
                }

                if (lllllllIIlll(44795, 2002)) {
                    throw null;
                }

                var10000 = this;
            }

            if (lllllllIIlll(44795, 2002)) {
                throw null;
            } else {
                float var7;
                if (lllllllIllll((var7 = var10000..player.moveStrafing - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1)))
                {
                    var1 -= 90.0F * var2;
                }

                if (lllllllIIlll(44795, 2002)) {
                    throw null;
                } else {
                    float var8;
                    if (lllllllIlllI((var8 = this..player.moveStrafing - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1)))
                    {
                        var1 += 90.0F * var2;
                    }

                    if (lllllllIIlll(44795, 2002)) {
                        throw null;
                    } else {
                        double var3 = Math.toRadians((double) var1);
                        if (lllllllIIlll(44795, 2002)) {
                            throw null;
                        } else {
                            return var3;
                        }
                    }
                }
            }
        }
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        this. = this.                                                                                                    .
        player.capabilities.getFlySpeed();
        super. ();
        if (lllllllIIlll(25991, 4142)) {
            throw null;
        } else {
            boolean var10000 = true;
        }
    }
}
