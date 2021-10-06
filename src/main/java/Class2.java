import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.network.play.client.CPacketPlayer.PositionRotation;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class2 extends Class171 {
    private float;
    private static int 17118=-8251;
    private static int 5692=2572;
    public Class220;
    public EntityOtherPlayerMP;
    private static int 14102=-18296;
    private static int 46995=-8360;
    private static int 5124=16502;
    private float;
    private static int 368=23842;
    private static int 3675=10012;
    private static int 315=10152;
    private static int 6632=29468;
    private static int 8023=-774;
    private static int 53325=-13994;
    private static int 5490=28066;
    private static int 28873=-3981;
    private static int 25539=-3238;

    static {
        boolean var10000 = true;
    }

    public Class2() {
        String var10005 = Class60. ("]h};zy}6");
        if (llllIlIIIlIl(17118, 5124)) {
            throw null;
        } else {
            super(var10005, 28, Class188.);
            if (llllIlIIIlIl(17118, 5124)) {
                throw null;
            } else {
                Class220 var1 = new Class220;
                String var10007 = Class60. ("Ik9\u007f{?");
                if (llllIlIIIlIl(17118, 5124)) {
                    throw null;
                } else {
                    var1.<init> (var10007, 134, this, 1.0D, 0.5D, 2.0D, false);
                    if (llllIlIIIlIl(17118, 5124)) {
                        throw null;
                    } else {
                        this. = var1;
                        this. (24);
                        this. (new Class220[]{this.});
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    private static boolean llllIlIIIlIl(int var0, int var1) {
        return var0 >= var1;
    }

    private static boolean llllIlIIllIl(int var0) {
        return var0 == 0;
    }

    private static boolean llllIlIIlllI(Object var0) {
        return var0 != null;
    }

    private static boolean llllIlIIlIll(Object var0, Object var1) {
        return var0 == var1;
    }

    private static boolean llllIlIIIllI(int var0) {
        return var0 != 0;
    }

    @SubscribeEvent
    public void ________________________________________________________________________________________________/* $FF was:                                                                                                 */(LivingUpdateEvent var1) {
        boolean var2;
        if (llllIlIIIllI(this. ())){
            var2 = true;
        } else if (llllIlIIIlIl(46995, 368)) {
            throw null;
        } else {
            this.                                                                                                    .
            player.noClip = true;
            this.                                                                                                    .
            player.onGround = false;
            this.                                                                                                    .
            player.capabilities.setFlySpeed((float) (0.07D * this.. ()));
            this.                                                                                                    .
            player.capabilities.isFlying = true;
            if (llllIlIIIllI(this.. (1000))){
                CPacketPlayer var10000 = new CPacketPlayer;
                boolean var10003;
                if (llllIlIIlllI(this.)) {
                    var10003 = this.                                                                                            .
                    onGround;
                    boolean var10004 = true;
                } else {
                    if (llllIlIIIlIl(46995, 368)) {
                        throw null;
                    }

                    var10003 = true;
                }

                if (llllIlIIIlIl(46995, 368)) {
                    throw null;
                }

                var10000.<init> (var10003);
                if (llllIlIIIlIl(46995, 368)) {
                    throw null;
                }

                this. (var10000);
                this.                                                                                         .();
            }

            if (llllIlIIIlIl(46995, 368)) {
                throw null;
            } else {
                var2 = true;
            }
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        super. ();
        if (llllIlIIIlIl(28873, 5490)) {
            throw null;
        } else {
            boolean var10000;
            if (llllIlIIIllI(this. ())){
                this. (false);
                var10000 = true;
            } else if (llllIlIIIlIl(28873, 5490)) {
                throw null;
            } else {
                this. = this.                                                                                                    .
                player.capabilities.getFlySpeed();
                EntityOtherPlayerMP var10004 = new EntityOtherPlayerMP(this..world, this.                                                                                                    .
                player.getGameProfile());
                if (llllIlIIIlIl(28873, 5490)) {
                    throw null;
                } else {
                    EntityOtherPlayerMP var1 = var10004;
                    var1.setPosition(this..player.posX, this.                                                                                                    .
                    player.posY, this.                                                                                                    .
                    player.posZ);
                    var1.setHealth(this..player.getHealth());
                    var1.rotationYaw = this.                                                                                                    .
                    player.rotationYaw;
                    var1.rotationPitch = this.                                                                                                    .
                    player.rotationPitch;
                    var1.rotationYawHead = this.                                                                                                    .
                    player.rotationYawHead;
                    var1.setSneaking(this..player.isSneaking());
                    var1.inventory.copyInventory(this..player.inventory);
                    this.                                                                                                    .
                    world.addEntityToWorld(-1, var1);
                    this. = var1;
                    this. = this.                                                                                                    .
                    gameSettings.gammaSetting;
                    this.                                                                                                    .
                    gameSettings.gammaSetting = 100.0F;
                    var10000 = true;
                }
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        super. ();
        if (llllIlIIIlIl(53325, 5692)) {
            throw null;
        } else {
            boolean var10000;
            if (llllIlIIIllI(this. ())){
                var10000 = true;
            } else if (llllIlIIIlIl(53325, 5692)) {
                throw null;
            } else {
                this.                                                                                                    .
                player.motionX = 0.0D;
                this.                                                                                                    .
                player.motionZ = 0.0D;
                this.                                                                                                    .
                player.capabilities.setFlySpeed(this.);
                this.                                                                                                    .
                player.noClip = false;
                this.                                                                                                    .
                player.capabilities.isFlying = false;
                this.                                                                                                    .
                player.setPosition(this..posX, this.                                                                                            .
                posY, this.                                                                                            .
                posZ);
                this.                                                                                                    .
                player.rotationPitch = this.                                                                                            .
                rotationPitch;
                this.                                                                                                    .
                player.rotationYaw = this.                                                                                            .
                rotationYaw;
                this.                                                                                                    .
                player.rotationYawHead = this.                                                                                            .
                rotationYawHead;
                this.                                                                                                    .
                world.removeEntityFromWorld(-1);
                this.                                                                                                    .
                renderGlobal.loadRenderers();
                this.                                                                                                    .
                gameSettings.gammaSetting = this.;
                CPacketEntityAction var10001 = new CPacketEntityAction;
                EntityPlayerSP var10003 = this.                                                                                                    .
                player;
                Action var10004;
                if (llllIlIIIllI(this..gameSettings.keyBindSneak.isKeyDown())){
                    var10004 = Action.START_SNEAKING;
                    boolean var10005 = true;
                } else{
                    if (llllIlIIIlIl(53325, 5692)) {
                        throw null;
                    }

                    var10004 = Action.STOP_SNEAKING;
                }

                if (llllIlIIIlIl(53325, 5692)) {
                    throw null;
                } else {
                    var10001.<init> (var10003, var10004);
                    if (llllIlIIIlIl(53325, 5692)) {
                        throw null;
                    } else {
                        this. (var10001);
                        var10000 = true;
                    }
                }
            }
        }
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (!llllIlIIlIll(var2, Class170.) || llllIlIIllIl(var1 instanceof CPacketPlayer) && llllIlIIllIl(var1 instanceof Position) && llllIlIIllIl(var1 instanceof Rotation) && llllIlIIllIl(var1 instanceof PositionRotation) && llllIlIIllIl(var1 instanceof CPacketInput) && !llllIlIIIllI(var1 instanceof CPacketEntityAction)) {
            if (llllIlIIIlIl(8023, 315)) {
                throw null;
            } else {
                return true;
            }
        } else if (llllIlIIIlIl(8023, 315)) {
            throw null;
        } else {
            double var3;
            if (llllIlIIIllI(var1 instanceof CPacketPlayer) && llllIlIIllIl((var3 = ((CPacketPlayer) var1).getX(-1.0D) - -1.0D) == 0.0D ? 0 : (var3 < 0.0D ? -1 : 1))) {
                return true;
            } else if (llllIlIIIlIl(8023, 315)) {
                throw null;
            } else {
                return false;
            }
        }
    }
}
