
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.slot.entity.RidikEntity;
import net.mcreator.slot.entity.ChundraEntity;
import net.mcreator.slot.entity.AntiscarbowEntity;
import net.mcreator.slot.entity.ABottlewithascarEntity;
import net.mcreator.slot.SlotMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlotModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlotMod.MODID);
	public static final RegistryObject<EntityType<RidikEntity>> RIDIK = register("ridik",
			EntityType.Builder.<RidikEntity>of(RidikEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RidikEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChundraEntity>> CHUNDRA = register("chundra",
			EntityType.Builder.<ChundraEntity>of(ChundraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChundraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AntiscarbowEntity>> ANTISCARBOW = register("projectile_antiscarbow",
			EntityType.Builder.<AntiscarbowEntity>of(AntiscarbowEntity::new, MobCategory.MISC).setCustomClientFactory(AntiscarbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ABottlewithascarEntity>> A_BOTTLEWITHASCAR = register("projectile_a_bottlewithascar", EntityType.Builder.<ABottlewithascarEntity>of(ABottlewithascarEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ABottlewithascarEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RidikEntity.init();
			ChundraEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RIDIK.get(), RidikEntity.createAttributes().build());
		event.put(CHUNDRA.get(), ChundraEntity.createAttributes().build());
	}
}
