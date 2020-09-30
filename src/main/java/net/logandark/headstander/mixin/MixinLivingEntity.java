package net.logandark.headstander.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity extends Entity {
	public MixinLivingEntity(EntityType<?> type, World world) {
		super(type, world);
	}

	// isCollidable
	@Override
	public boolean method_30948() {
		return true;
	}

	// collidesWith
	@Override
	public boolean method_30949(Entity entity) {
		return true;
	}

	@Override
	public boolean isPushable() {
		return true;
	}
}
