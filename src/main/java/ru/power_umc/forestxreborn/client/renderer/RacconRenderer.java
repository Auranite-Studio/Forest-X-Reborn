
package ru.power_umc.forestxreborn.client.renderer;

import ru.power_umc.forestxreborn.procedures.Baby_ModelProcedure;
import ru.power_umc.forestxreborn.entity.RacconEntity;
import ru.power_umc.forestxreborn.client.model.ModelRacoonModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

public class RacconRenderer extends MobRenderer<RacconEntity, LivingEntityRenderState, ModelRacoonModel> {
	private RacconEntity entity = null;

	public RacconRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRacoonModel(context.bakeLayer(ModelRacoonModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RacconEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("forest:textures/entities/racoon.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) Baby_ModelProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}
}
