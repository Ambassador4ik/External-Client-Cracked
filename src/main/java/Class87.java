import java.util.ArrayList;

import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.network.play.client.CPacketPlayer.PositionRotation;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Class87 extends Class171 {
    private static int 2483=444;
    private static int 146=3651;
    private static int 6045=2812;
    private static int 90013=-19289;
    private static int 31958=-18080;
    private static int 4047=31307;
    private static int 5548=538;
    private static int 78918=-13047;
    private static int 2775=14191;
    private static int 82=15003;
    private static int 49715=-10792;
    private static int 81846=-25721;
    private static int 998=22969;
    private static int 93885=-30883;
    public EntityOtherPlayerMP;
    private static int 85207=-13385;
    public ArrayList;
    private static int 6983=17687;
    private static int 34954=-16384;
    private static int 94920=-31814;
    private static int 134=30089;
    private static int 55715=-15057;

    static {
        boolean var10000 = true;
    }

    public Class87() {
        String var10001 = Class60. ("^q?uv=0");
        if (lllIllIlIlII(93885, 134)) {
            throw null;
        } else {
            super(var10001, 99, Class188.);
            if (lllIllIlIlII(93885, 134)) {
                throw null;
            } else {
                ArrayList var1 = new ArrayList();
                if (lllIllIlIlII(93885, 134)) {
                    throw null;
                } else {
                    this. = var1;
                    boolean var10000 = true;
                }
            }
        }
    }

    private static boolean lllIllIlIlIl(int var0) {
        return var0 != 0;
    }

    private static boolean lllIllIlIIll(int var0) {
        return var0 == 0;
    }

    private static boolean lllIllIlIllI(Object var0) {
        return var0 != null;
    }

    private static boolean lllIllIlIIlI(Object var0) {
        return var0 == null;
    }

    private static boolean lllIllIlIlII(int var0, int var1) {
        return var0 >= var1;
    }

    public void _____________________________________________________________________________________/* $FF was:                                                                                      */() {
        boolean var10000;
        if (lllIllIlIlIl(this. ())){
            this. (false);
            var10000 = true;
        } else if (lllIllIlIlII(34954, 6045)) {
            throw null;
        } else {
            this. ();
            this.                                                                                         .();
            super. ();
            if (lllIllIlIlII(34954, 6045)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void __________________________________________________________________________________/* $FF was:                                                                                   */() {
        boolean var10000;
        if (lllIllIlIIlI(this.) && !lllIllIlIIll(this..player.isEntityAlive())){
            if (lllIllIlIlII(78918, 998)) {
                throw null;
            } else {
                EntityOtherPlayerMP var2 = new EntityOtherPlayerMP(this..world, this.                                                                                                    .
                player.getGameProfile());
                if (lllIllIlIlII(78918, 998)) {
                    throw null;
                } else {
                    EntityOtherPlayerMP var1 = var2;
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
                    var2.hurtTime = this.                                                                                                    .
                    player.hurtTime;
                    this.                                                                                                    .
                    player.entityCollisionReduction = 1.0F;
                    this. = var1;
                    this.                                                                                                    .
                    world.addEntityToWorld(-2, var1);
                    Class73.                                                                                      .                                                                                                    .
                    (var1.getName());
                    var10000 = true;
                }
            }
        } else if (lllIllIlIlII(78918, 998)) {
            throw null;
        } else {
            var10000 = true;
        }
    }

    public protected private abstract final synchronized native void _Пошел_нахуй/* $FF was: _Пошел нахуй*/();

    private void ____________________________________________________________________________/* $FF was:                                                                             */(Packet var1) {
        this. (var1);
        boolean var10000 = true;
    }

    public boolean ________________________________________________________________________________________________/* $FF was:                                                                                                 */(Object var1, Class170 var2) {
        if (!lllIllIlIllI(this.) || lllIllIlIIll(var1 instanceof CPacketPlayer) && lllIllIlIIll(var1 instanceof Position) && lllIllIlIIll(var1 instanceof Rotation) && lllIllIlIIll(var1 instanceof PositionRotation) && lllIllIlIIll(var1 instanceof CPacketInput) && !lllIllIlIlIl(var1 instanceof CPacketEntityAction)) {
            if (lllIllIlIlII(90013, 82)) {
                throw null;
            } else {
                return true;
            }
        } else if (lllIllIlIlII(90013, 82)) {
            throw null;
        } else {
            this.                                                                                            .
            add((Packet) var1);
            return false;
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */(ClientTickEvent var1) {
        StringBuilder var10002 = new StringBuilder();
        if (lllIllIlIlII(49715, 2775)) {
            throw null;
        } else {
            String var10003 = Class123. (this.. () / 1000L);
            if (lllIllIlIlII(49715, 2775)) {
                throw null;
            } else {
                var10002 = var10002.append(var10003);
                var10003 = Class60. ("6{");
                if (lllIllIlIlII(49715, 2775)) {
                    throw null;
                } else {
                    this. ((String) String.valueOf(var10002.append(var10003).append(this..size())));
                    if (lllIllIlIIll(this..player.isEntityAlive())){
                        this. ();
                    }

                    if (lllIllIlIlII(49715, 2775)) {
                        throw null;
                    } else {
                        boolean var10000 = true;
                    }
                }
            }
        }
    }

    public void ____________________________________________________________________________/* $FF was:                                                                             */() {
        boolean var10000;
        if (lllIllIlIlIl(this. ())){
            var10000 = true;
        } else if (lllIllIlIlII(94920, 2483)) {
            throw null;
        } else {
            this. ();
            this.                                                                                            .
            forEach(this::);
            this.                                                                                            .clear();
            super. ();
            if (lllIllIlIlII(94920, 2483)) {
                throw null;
            } else {
                var10000 = true;
            }
        }
    }

    public void __________________________________________________________________________________________/* $FF was:                                                                                           */() {
        boolean var10000;
        if (lllIllIlIllI(this..world.getEntityByID(-2)) &&!lllIllIlIIlI(this.)){
            if (lllIllIlIlII(31958, 4047)) {
                throw null;
            } else {
                if (lllIllIlIllI(this.)) {
                    Class73.                                                                                      .                                                                                                    .
                    (this..getName());
                }

                if (lllIllIlIlII(31958, 4047)) {
                    throw null;
                } else {
                    this. = null;
                    this.                                                                                                    .
                    player.entityCollisionReduction = 0.0F;
                    this.                                                                                                    .
                    world.removeEntityFromWorld(-2);
                    CPacketEntityAction var10001 = new CPacketEntityAction;
                    EntityPlayerSP var10003 = this.                                                                                                    .
                    player;
                    Action var10004;
                    if (lllIllIlIlIl(this..gameSettings.keyBindSneak.isKeyDown())){
                        var10004 = Action.START_SNEAKING;
                        boolean var10005 = true;
                    } else{
                        if (lllIllIlIlII(31958, 4047)) {
                            throw null;
                        }

                        var10004 = Action.STOP_SNEAKING;
                    }

                    if (lllIllIlIlII(31958, 4047)) {
                        throw null;
                    } else {
                        var10001.<init> (var10003, var10004);
                        if (lllIllIlIlII(31958, 4047)) {
                            throw null;
                        } else {
                            this. (var10001);
                            var10000 = true;
                        }
                    }
                }
            }
        } else if (lllIllIlIlII(31958, 4047)) {
            throw null;
        } else {
            var10000 = true;
        }
    }
}
