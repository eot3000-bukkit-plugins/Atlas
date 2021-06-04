package cc.funkemunky.api.tinyprotocol.packet.optimized.flying.versions;

import cc.funkemunky.api.tinyprotocol.packet.optimized.flying.OptimizedFlying;
import net.minecraft.server.v1_16_R3.PacketPlayInFlying;

public class v1_16R3 extends OptimizedFlying {

    public v1_16R3(Object packet) {
        super(packet);
    }

    @Override
    public double getX() {
        return getFlying().a(0D);
    }

    @Override
    public double getY() {
        return getFlying().b(0D);
    }

    @Override
    public double getZ() {
        return getFlying().c(0D);
    }

    @Override
    public float getYaw() {
        return getFlying().a(0f);
    }

    @Override
    public float getPitch() {
        return getFlying().b(0f);
    }

    @Override
    public boolean isOnGround() {
        return getFlying().a();
    }

    @Override
    public boolean isPos() {
        return getFlying().a(Double.POSITIVE_INFINITY) == Double.POSITIVE_INFINITY;
    }

    @Override
    public boolean isLook() {
        return getFlying().a(Float.POSITIVE_INFINITY) == Float.POSITIVE_INFINITY;
    }

    private PacketPlayInFlying getFlying() {
        return (PacketPlayInFlying) packet;
    }
}
